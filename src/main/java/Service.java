import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Service implements IService {
    public ArrayList<Movie> getData() {
        ArrayList<Movie> list = new ArrayList<>();

        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("Homework_Lesson9.json");

            Type objectType = new TypeToken<ArrayList<Movie>>() {
            }.getType();

            list = gson.fromJson(reader, objectType);

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return list;

    }
    public void printList(ArrayList<Movie> list){
        for (Movie movie: list){
            System.out.println(movie);
        }
    }

    @Override
    public void sortByTitle(ArrayList<Movie> list) {
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        System.out.println("Danh sách sắp xếp theo tên");
        printList(list);
    }

    @Override
    public void sortByDuration(ArrayList<Movie> list) {
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getDuration() - o2.getDuration();
            }
        });

        System.out.println("Danh sách sắp xếp theo thời lượng: ");
        printList(list);
    }
    @Override
    public void sortByView(ArrayList<Movie> list) {
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getView() - o2.getView();
            }
        });

        System.out.println("Danh sách sắp xếp theo lượt xem: ");
        printList(list);
    }
    @Override
    public void insertPerson(ArrayList<Movie> list) {

    }


}
