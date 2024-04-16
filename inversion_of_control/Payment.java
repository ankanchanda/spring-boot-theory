package Development.spring_projects.theory.inversion_of_control;

public class Payment {
    User sender = new User();

    // tight coupling
    void getSenderDetails(String userID){
        sender.getUserDetails(userID);
    }
}
