public class giocatore {
    private boolean capitano;
    private int goal;
    private String nome;
    public giocatore(boolean capitano,int goal, String nome){
        setCapitano(capitano);
        setGoal(goal);
        setNome(nome);
    }
    public giocatore(boolean capitano){
        setCapitano(capitano);
    }
    public giocatore(int goal){
        setGoal(goal);
    }
    public giocatore(String nome){
        setNome(nome);
    }
    public giocatore(boolean capitano,int goal){
        setCapitano(capitano);
        setGoal(goal);
    }
    public giocatore(boolean capitano,String nome){
        setCapitano(capitano);
        setNome(nome);
    }
    public giocatore(int goal,String nome){
        setGoal(goal);
        setNome(nome);
    }
    public giocatore(){
        setCapitano(capitano);
        setGoal(goal);
        setNome(nome);
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
        if (goal<0){
            System.out.println();
        }
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

}
