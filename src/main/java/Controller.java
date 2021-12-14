import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    Service service;
    ArrayList<Movie> listMovie;
    Scanner sc;

    public Controller() {
        service = new Service();
        listMovie = service.getData();
        sc = new Scanner(System.in);
    }

    public void mainMenu() {
        boolean isCheck = false;
        while (!isCheck) {
            System.out.println("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách: ");
                    service.printList(listMovie);
                    break;
                case 2:
                    service.sortByTitle(listMovie);
                    break;
                case 3:
                    service.sortByDuration(listMovie);
                    break;
                case 4:
                    service.sortByView(listMovie);
                    break;
                default:
                    System.out.println("Không có lựa chọn này.");

            }
        }
    }
}
