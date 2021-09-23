package co.edu.unicauca.commandrestaurant.access.adapter;

import co.edu.unicauca.commandrestaurant.domain.Food;
import java.util.List;

/**
 * Interface Utilizada como api con la interfaz del Usuario
 * @author Eliana Andrea Camayo
 * @author Carlos Enrique Hoyos
 * @author Edwin Adrada Ruiz
 */

public interface IFoodJsonRepository {
    
    public Food getById(int id);
    public List<String> foods();
    public boolean add(Food food);
    public void remove(int id);
    public boolean modify(Food food);
    
}
