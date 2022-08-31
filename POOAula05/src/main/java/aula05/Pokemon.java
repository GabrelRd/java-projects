
package aula05;

public final class Pokemon {
    private String nome;
    private int vida;
    private int forca;
    private int defesa;
    
    public Pokemon(){
        this.setVida(120);
        this.setDefesa(15);
        this.setForca(25);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
     
    public void atacar(Pokemon oponente){
        oponente.setVida(oponente.getVida()-(this.getForca()-oponente.getDefesa()));
    }
    public void curar(int cura){
        this.setVida(getVida()+cura);
        
    }
    public static void main(String args[]){
        int numRand = (int) ((Math.random() * 20) - 1);
        Pokemon poke1 = new Pokemon();
        Pokemon poke2 = new Pokemon();
        poke1.setNome("Bulbassaur");
        poke2.setNome("Charmander");
        System.out.println("Vai Começar a batalha! "+poke1.getNome()+" VS "+poke2.getNome());
        while (poke2.getVida()>0){
            poke1.atacar(poke2);
            System.out.println(poke2.getNome()+" foi atacado!"+"sua vida é:"+poke2.getVida());
            if((poke2.getVida()&7)==0){
                poke2.curar(numRand);
                System.out.println(poke2.getNome()+" foi curado!"+"sua vida é:"+poke2.getVida());
            }
        }
}
}
