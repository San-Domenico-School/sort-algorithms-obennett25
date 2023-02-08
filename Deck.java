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
    private ArrayList<Card> shuffledCards;
    private ArrayList<Card> sortedCards;
    
    // Instantiates a new deck
    public Deck()
    {
        initializeCards();
        shuffleCards();
    }
    
    // Adds cards to board after Deck is initialized
    public void addedToWorld(World world)
    {
        showCards(world, shuffledCards, 80);
        sort();
        showCards(world, sortedCards, 220);
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
    public void shuffleCards()
    {
        shuffledCards = new ArrayList<Card>();
        for(int i = 0; i < initialCards.length; i++)
        {
            int index = (int)(Math.random() * (shuffledCards.size() + 1));
            shuffledCards.add(index, initialCards[i]); 
        }
    }
    
    // Places card on board at y
    private void showCards(World world, ArrayList<Card> cards, int y)
    {
        
       for(int i = 0; i < cards.size(); i++)
       {
           world.addObject(cards.get(i),58 + 30 * i, y);
       } 
    }
    
    /* This is where the students attempt their sort algorithm by taking the
     * cards from the shuffled list and adding them to the sorted list.     
    **/
    private void sort()
    {
        sortedCards = new ArrayList<Card>();
        
        //put sort algorithm here
    }
}

