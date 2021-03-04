public class Ari {
    Animals animals;

    public Ari(Animals animals) {
        this.animals = animals;
    }

    public void add(String data) {
        animals.voice(data);
    }

}
