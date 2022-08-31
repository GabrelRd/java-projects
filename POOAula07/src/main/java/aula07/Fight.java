
package aula07;
import java.util.Random;

public class Fight {
    Fighter challenger;
    Fighter challenged;
    int rounds;
    boolean approved;

    private Fighter getChallenger() {
        return challenger;
    }

    private void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    private Fighter getChallenged() {
        return challenged;
    }

    private void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    private int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    private boolean getApproved() {
        return approved;
    }

    private void isApproved(boolean approved) {
        this.approved = approved;
    }
    public void scheduleFight(Fighter challenger, Fighter challenged){
        if(!challenger.getName().equals(challenged.getName())&&challenger.getCategory().equals(challenged.getCategory())){
            System.out.println("Fight scheduled");
            this.isApproved(true);
            this.setChallenger(challenger);
            this.setChallenged(challenged);
        } else {
            System.out.println("The fight cannot be scheduled");
            this.isApproved(false);
        }
    }
    public void toFight(){
        if(this.getApproved()){
            this.getChallenger().introduce();
            System.out.println("--------------------------");
            this.getChallenged().introduce();
            Random rand = new Random();
            int winner = rand.nextInt(3);
            switch(winner){
                case 0 -> {
                    System.out.println("The fight result was a draw");
                    this.getChallenger().drawFight();
                    this.getChallenged().drawFight();
                }
                case 1 -> {
                    System.out.println(this.getChallenger().getName()+" is the winner!!");
                    this.getChallenger().winFight();
                    this.getChallenged().loseFight();
                }
                case 2 -> {
                    System.out.println(this.getChallenged().getName()+" is the winner!!");
                    this.getChallenger().loseFight();
                    this.getChallenged().winFight();
                }
        }
        } else {
            System.out.println("The Fight cannot be iniciated");
        }
    }
}
