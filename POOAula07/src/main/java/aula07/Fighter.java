
package aula07;

public class Fighter {
    private String name;
    private String nacionality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int wins;
    private int losses;
    private int draws;

    public Fighter(String name, String nacionality, int age, float height,
                    float weight, int wins, int losses, int draws) {
        this.name = name;
        this.nacionality = nacionality;
        this.age = age;
        this.height = height;
        this.setWeight(weight);
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if(this.getWeight()<52.2){
            this.category = "Inválido";
        } else if(this.getWeight()<=70.3){
            this.category = "Leve";
        } else if(this.getWeight()<=83.3){
            this.category = "Médio";
        } else if(this.getWeight()<=120){
            this.category = "Pesado";
        } else {
            this.category = "Inválido";
        }
    }

    public int getWins() {
        return wins;
    }

    private void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    private void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    private void setDraws(int draws) {
        this.draws = draws;
    }
    public void introduce(){
        System.out.println("Lutador: "+getName());
        System.out.println("Nacionalidade: "+getNacionality());
        System.out.println(getAge()+" Anos");
        System.out.println("Categoria: "+getCategory());
        System.out.println(getWeight()+" Kg");
        System.out.println(getHeight()+" m");
        System.out.println(getWins()+" Vitórias");
        System.out.println(getLosses()+" Derrotas");
        System.out.println(getDraws()+" Empates"); 
    }
    public void winFight(){
        this.setWins((this.getWins()+1));
    }
    public void loseFight(){
        this.setLosses((this.getLosses()+1));
    }
    public void drawFight(){
        this.setDraws((this.getDraws()+1));
    }
}
