public class dog {
    String name;
    String breed;
    int weight;

    String getName(){
        return name;
    }

    String getBreed(){
        return breed;
    }

    int getWeight(){
        return weight;
    }

    String getInfo(){
        return "Name: " + name + " breed: " + breed + " weight: " + weight;
    }
}
