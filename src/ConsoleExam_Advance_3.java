import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class ConsoleExam_Advance_3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
        System.out.println("1. Nhập tên khách hàng chờ mua vé xem phim");
        System.out.println("2. Khách tiếp theo");
        System.out.println("3. Thoát");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Mời bạn chọn: ");
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Mời bạn nhập tên khách hàng: ");
                    String name = scanner.next();
                    queue.add(name);
                    break;
                case 2:
                    if(!queue.isEmpty()) {
                        System.out.println("Khách hàng tiếp theo là: " + queue.peek());
                        queue.remove();
                    } else {
                        System.out.println("Không còn khách hàng nào trong danh sách!");
                    }
                    break;
                case 3:
                    System.out.println("Đã thoát!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        } while(choice != 3);
    }
    }





