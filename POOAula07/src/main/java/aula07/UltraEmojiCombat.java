
package aula07;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Fighter fighters[] = new Fighter[6];
        fighters[0] = new Fighter("Pretty Boy","França",31,1.75f,68.9f,11,2,1);
        fighters[1] = new Fighter("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
        fighters[2] = new Fighter("Snapshadow","EUA",35,1.65f,80.9f,13,0,2);
        fighters[3] = new Fighter("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
        fighters[4] = new Fighter("UfoCobol","Canadá",30,1.71f,119.3f,5,4,3);
        fighters[5] = new Fighter("Nerdaart","México",30,1.81f,105.7f,12,2,3);
        Fight uec = new Fight();
        uec.scheduleFight(fighters[2], fighters[2]);
        uec.toFight();
    }
}
