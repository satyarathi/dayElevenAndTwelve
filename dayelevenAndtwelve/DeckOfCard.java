package com.dayelevenAndtwelve;
import java.util.Random;

public class DeckOfCard {

	int [][] cards = new int [4][13];
	
	void cardAllot(int player) {
		for (int i = 0; i < 9; i++) {
			allotOneCard(player);
		}
	}

	void allotOneCard(int player) {
		Random random = new Random();

		int suit = random.nextInt(4);
		int rank = random.nextInt(13);

		if (cards[suit][rank] != 0) {
			allotOneCard(player);
		} else {
			cards[suit][rank] = player;
		}
	}
	void print(int player) {
		for(int suit = 0; suit < 4; suit++) {
			for(int rank = 0; rank < 13; rank++) {
				if(cards[suit][rank] == player) {
					System.out.print(getSuit(suit) + " " + getRank(rank) + "\t");
				}
			}
		}
		System.out.println("\n");
	}
	String getRank(int rankNumber) {
		switch(rankNumber) {
		case 0:
			return "2";
		case 1:
			return "3";
		case 2:
			return "4";
		case 3:
			return "5";
		case 4:
			return "6";
		case 5:
			return "7";
		case 6:
			return "8";
		case 7:
			return "9";
		case 8:
			return "10";
		case 9:
			return "Jack";
		case 10:
			return "Queen";
		case 11:
			return "King";
		case 12:
			return "Ace";
		default:
			return "";
		}
	}
	String getSuit(int suitNumber) {
		switch(suitNumber) {
		case 0:
			return "Clubs";
		case 1:
			return "Diamonds";
		case 2:
			return "Hearts";
		case 3:
			return "Spades";
		default:
			return "";
		}
	}
	
	public static void main(String[] args) {
		DeckOfCard deckofcard = new DeckOfCard();
		
		for(int player = 1; player <= 4;player++) {
			deckofcard.cardAllot(player);
			System.out.println("Player" +player+ " cards :");
			
			deckofcard.print(player);
		}
	}
}
