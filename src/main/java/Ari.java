public class Ari {
    Animals animals;

    public Ari(Cat cat, Animals animals) {
        this.animals = animals;
    }

    public void add(String data) {
        animals.voice(data);
    }

}
