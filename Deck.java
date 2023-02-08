import greenfoot.*;
import java.util.ArrayList;

/**
 * This class declares, instantiates, and initializes a new deck.  Students 
 * should then implement the sort method at the botton of this class to see 
 * if they understanding basic ArrayList sort algorithms.
 * 
 * @author Bruce Gustin
 * @version Feb 8, 2023
 */

public class Deck extends Actor
{
    private Card[] initialCards;
    private Card[] shuffledCards;
    private Card[] selectionSort;
    private Card[] insertionSort;
    private Card[] mergeSort;
    
    // Instantiates a new deck
    public Deck()
    {
        initializeCards();
        shuffleCards();
        initializeSortArrays();
    }
    
    // Adds cards to board after Deck is initialized
    public void addedToWorld(World world)
    {
        showCards(world, shuffledCards, 80);
        showCards(world, selectionSort(selectionSort, initialCards.length), 220);
        showCards(world, insertionSort(insertionSort, initialCards.length), 360);
        showCards(world, mergeSort(mergeSort, initialCards.length), 500);
    }
    
    // Initializes all Hearts Ace through King
    private void initializeCards()
    {
        initialCards = new Card[]
        {
            new Card("ace_of_hearts.GIF", 1),
            new Card("two_of_hearts.GIF", 2),
            new Card("three_of_hearts.GIF", 3),
            new Card("four_of_hearts.GIF", 4),
            new Card("five_of_hearts.GIF", 5),
            new Card("six_of_hearts.GIF", 6),
            new Card("seven_of_hearts.GIF", 7),
            new Card("eight_of_hearts.GIF", 8),
            new Card("nine_of_hearts.GIF", 9),
            new Card("ten_of_hearts.GIF", 10),
            new Card("jack_of_hearts.GIF", 11),
            new Card("queen_of_hearts.GIF", 12),
            new Card("king_of_hearts.GIF", 13),
        };
    }
    
    // Shuffles the unshuffled deck
    private void shuffleCards()
    {
        shuffledCards = new Card[initialCards.length];
        Card[] tempCards = new Card[initialCards.length];
        shuffledCards = initialCards;
        tempCards = initialCards;
        
        // Makes sure that shuffledCards has no null elements
        for(int i = 0; i < initialCards.length; i++)
        {
            shuffledCards[i] = initialCards[i];
        }
        
        // This algorithm will swap the cards 300 times
        for(int i = 0; i < 300; i++)
        {
            int shuffledIndex = (int)(Math.random() * initialCards.length);
            int tempIndex = (int)(Math.random() * initialCards.length);
            Card shuffled = shuffledCards[shuffledIndex];
            shuffledCards[shuffledIndex] = tempCards[tempIndex];
            tempCards[tempIndex] = shuffled;
        }
    }
    
    // Sets all the sorted arrays equal to the shuffledCard array
    private void initializeSortArrays()
    {
        selectionSort = new Card[initialCards.length];
        insertionSort = new Card[initialCards.length];
        mergeSort = new Card[initialCards.length];
        
        for(int i = 0; i < initialCards.length; i++)
        { 
            Card card1 = new Card(shuffledCards[i].getImageFile(),shuffledCards[i].getValue());
            Card card2 = new Card(shuffledCards[i].getImageFile(),shuffledCards[i].getValue());
            Card card3 = new Card(shuffledCards[i].getImageFile(),shuffledCards[i].getValue());
            selectionSort[i] = card1;
            insertionSort[i] = card2;
            mergeSort[i] = card3;
        }
    }
    
    // Places card on board at y
    private void showCards(World world, Card[] cards, int y)
    {
        
       for(int i = 0; i < cards.length; i++)
       {
           world.addObject(cards[i],58 + 30 * i, y);
       } 
    }
    
    /* This is where the students attempt their sort algorithm by taking the
    *  cards from the shuffled list and adding them to the sorted list.     
    **/
    private Card[] selectionSort(Card[] arr, int n)
    {
        //put sort algorithm here
        
        return selectionSort;
    }
    
    private Card[] insertionSort(Card[] arr, int n)
     {
        
        //put sort algorithm here
        
        return insertionSort;
    }
    
    private Card[] mergeSort(Card[] arr, int n)
     {
        
        //put sort algorithm here
        
        return mergeSort;
    }
}

