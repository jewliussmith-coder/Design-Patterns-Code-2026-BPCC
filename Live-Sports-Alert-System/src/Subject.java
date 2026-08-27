public interface Subject {
    void register(Observer o); //add an observer
    void remove(Observer o); //remove an observer
    void notifyObservers(); // tell observers something updated
}
