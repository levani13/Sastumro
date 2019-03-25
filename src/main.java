import model.Hotel;

import java.io.IOException;
import java.util.List;

public class main {
        public static void main(String[] args) throws IOException {
            List<Hotel> hotels=DataLoader.loadrelist();
            Hotel hotel=hotels.get(1);
            System.out.println(hotel.getName());
        }
    }
