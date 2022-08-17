package Island;

import Entities.Animals.Herbivores.Herbivore;
import Entities.Animals.Predators.Predator;
import Entities.Plants.Plant;

import java.util.ArrayList;
import java.util.List;

public class Location {

    // У локации есть координаты
    public int x;
    public int y;


    // Локация содержит списки растений, травоядных и хищников
    List<Herbivore> herbivores = new ArrayList<>();
    List<Predator> predators = new ArrayList<>();
    List<Plant> plants = new ArrayList<>();

    public Location() {

    }
}


