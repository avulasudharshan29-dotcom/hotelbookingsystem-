import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class HotelManager {
    private List<Room> rooms = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public HotelManager() {
        rooms.add(new Room(101, "Single", 50.0));
        rooms.add(new Room(102, "Double", 80.0));
    }

    public void showMainScreen(Stage stage) {
        VBox root = new VBox();
        Button addRoomBtn = new Button("Add Room");
        Button addCustomerBtn = new Button("Add Customer");
        Button bookRoomBtn = new Button("Book Room");
        root.getChildren().addAll(addRoomBtn, addCustomerBtn, bookRoomBtn);

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Hotel Booking System");
        stage.setScene(scene);
        stage.show();
    }
}
