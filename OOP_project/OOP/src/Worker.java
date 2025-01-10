public class Worker {
    String name;
    String poste;
    double salaire;

    Worker(String name, String poste, double salaire){
        this.name = name;
        this.poste = poste;
        this.salaire = salaire; 
    }

    
    void showInfo(){
        System.out.println(this.name +" "+ this.poste +" "+ this.salaire); 
    }
}
