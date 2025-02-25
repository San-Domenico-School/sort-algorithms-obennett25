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

public class Dealer extends Actor
{
    private Deck deck;
    private Card[] shuffledDeck;
    private Card[] selectionSort;
    private Card[] insertionSort;
    private Card[] mergeSort;
    
    // Instantiates a new deck
    public Dealer()
    {
        deck = new Deck();
        shuffledDeck = deck.getShuffledDeck();
        initializeSortArrays();
    }
    
    // Adds cards to board after Deck is initialized
    public void addedToWorld(World world)
    {
        showCards(world, shuffledDeck, 80);
        showCards(world, selectionSort(selectionSort, shuffledDeck.length), 220);
        showCards(world, insertionSort(insertionSort, shuffledDeck.length), 360);
        showCards(world, mergeSort(mergeSort, shuffledDeck.length), 500);
    }    
    // Shuffles the unshuffled deck
    
    
    // Sets all the sorted arrays equal to the shuffledCard array
    private void initializeSortArrays()
    {
        selectionSort = new Card[shuffledDeck.length];
        insertionSort = new Card[shuffledDeck.length];
        mergeSort = new Card[shuffledDeck.length];
        
        for(int i = 0; i < shuffledDeck.length; i++)
        { 
            Card card1 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            Card card2 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            Card card3 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
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
     * cards from the shuffled list and adding them to the sorted list.     
    **/
    
    /* In this space write the pseudocode for your selection sort
     * 
     * The code starts at the first element in the array (i = 0). It then assumes that the current index i is the index of the smallest element
     * (minIndex = i) The inner for loop goes through all of the remaining elements. During this loop, it compares each card value with the 
     * current minimun value. If a new minimum value is found, minIndex is updated to j. After finding the minimum value it is put in the 
     * position i which is the correct sorted position. The algorthm then moves to the next position (i++) and repeats until the entire arr
     * is sorted.
     * 
     * 
     */
    private Card[] selectionSort(Card[] arr, int n)
    {
        //put sort algorithm here
        
        for (int i = 0; i < n - 1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j].getValue() < arr[minIndex].getValue())
                {
                    minIndex = j;
                }
            }
            Card card1 = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = card1;
        }
        
        return arr;
    }
    
    /* In this space write the pseudocode for your insertion sort
     * 
     * The algorithm starts at the seconds element of the array. It takes that and stores in a  temporary value. It then compares this card
     * with the element of the sortedf part of the array (to the left of i). It uses a while loop and as long as the sorted cards are
     * greater than the currentCard they are shifted on position to the right. This continues as j is decremented as it continues checking 
     * to the left. Once it finds the rgiht spot, it places the currentCard in that position. It is repeated for each element in the array.
     * 
     */
    private Card[] insertionSort(Card[] arr, int n)
    {
        for (int i = 1; i < n; i ++)
        {
            Card currentCard = arr[i];
            int j = i - 1;
            
            while ( j >= 0 && arr[j].getValue() > currentCard.getValue())
            {   
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = currentCard;
            
        }
        return arr;
    }
    
    /* In this space write the pseudocode for your merge sort
     * 
     * 
     * 
     */
    private Card[] mergeSort(Card[] arr, int n)
     {
        
        //put sort algorithm here
        
        return mergeSort;
    }
}

