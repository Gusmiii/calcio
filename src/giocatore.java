public class giocatore {
    private boolean capitano;
    private int goal;
    private String nome;
    public giocatore(boolean capitano,int goal, String nome){
        this.capitano=capitano;
        this.goal=goal;
        this.nome=nome;
    }
    public giocatore(boolean capitano){
        this.capitano=capitano;
    }
    public giocatore(int goal){
        this.goal=goal;
    }
    public giocatore(String nome){
        this.nome=nome;
    }
    public giocatore(boolean capitano,int goal){
        this.capitano=capitano;
        this.goal=goal;
    }
    public giocatore(boolean capitano,String nome){
        this.capitano=capitano;
        this.nome=nome;
    }
    public giocatore(int goal,String nome){
        this.goal=goal;
        this.nome=nome;
    }
    public giocatore(){
        this.capitano = false;
        this.goal = 0;
        this.nome = "";
    }

    public boolean getCapitano() {
        return capitano;
    }

    public int getGoal() {
        return goal;
    }

    public String getNome() {
        return nome;
    }

    public void setCapitano(boolean capitano) {
        this.capitano = capitano;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
