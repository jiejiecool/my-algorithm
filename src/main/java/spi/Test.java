package spi;

import java.util.ServiceLoader;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: create in 2021/2/22 14:46
 */
public class Test {
    public static void main(String[] args) {
        ServiceLoader<Animal> load = ServiceLoader.load(Animal.class);
        for (Animal animal : load) {
            animal.say();
        }
    }
}
