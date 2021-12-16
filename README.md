# FollowUpResearch
 A research about a poker game "Follow Up"

"Follow Up" is a simple card game with highly uncertain result. The purpose of this project is to simulate certain number of runs of the game and see the result. This research is out of the author's personal curiosity.

The rule of this game is like this:  
1.Shuffle a deck, give 2 players each half of the deck;  
2.Starting from one player, each player alternatively display one card from the top of their deck, and put them in a sequence on the table;  
3.If a player displays a card that has same number with one card on the table, they gain all the cards in between and including these 2 cards. Example: if the sequence on the table contains 5,8,A,6,1,K,2 and a player displays an A for their turn, they get all the cards from and include A: A,6,1,K,2. They also get back their newly displayed A.  
4.The game ends when a player have no card. They other player who claims almost all the deck wins.

This game is highly automated and actually no strategy is involved. The author used to play this game when he was a little boy, and sometimes even played with left and right hands if got bored. Now this game can give the author more fun in another sense: How long, that is, how many turns will this game last for? What is the average length of this game? Is this game fair (well it seems)?

Run class GameStart to see the result.
