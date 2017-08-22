import service.CustomerService;

/**
 * Created by koss on 22-Aug-17.
 */
public class Application {

    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        System.out.println(service.findAll().get(0).getFirstname());
    }
}
