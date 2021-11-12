import java.util.*;

public class RideRepository {
    public static Hashtable<String, Ride[]> customers(){
        Hashtable<String, Ride[]> hashtable = new Hashtable<>();
        Ride[] ridesOfC1 = { new Ride(1, 5),
                new Ride(0.1, 1),
                new Ride(2.5, 10)
        };
        hashtable.put("user1", ridesOfC1);
        Ride[] ridesOfC2 = { new Ride(0.5, 5),
                new Ride(0.1, 1),
                new Ride(2.5, 10)
        };
        hashtable.put("user2", ridesOfC2);
        return hashtable;
    }

    public static Ride[] getcustomer(String userId){
        Hashtable<String, Ride[]> hashtable = customers();
            return hashtable.get(userId);
    }
}

