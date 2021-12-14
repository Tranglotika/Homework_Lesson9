import java.util.ArrayList;

public interface IService {
    public ArrayList<Movie> getData();
    public void printList(ArrayList<Movie> list);
    public void sortByTitle (ArrayList<Movie> list);
    public void sortByDuration (ArrayList<Movie> list);
    public void sortByView (ArrayList<Movie> list);
}

