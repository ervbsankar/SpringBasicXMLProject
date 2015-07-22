import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by A513915 on 7/21/2015.
 */
public class Display {

    private String name;
    private Integer Id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Sankar " + getName() + " " + Id);
    }

  }
