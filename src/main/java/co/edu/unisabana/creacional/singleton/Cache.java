package co.edu.unisabana.creacional.singleton;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    private static Cache instance;

    private Map<String, Object> cache;

    private Cache() {
        cache = new HashMap<>();
    }

    public static Cache getInstance() {
        if (instance == null) {
            instance = new Cache();
            //bla bla bla toda la conexion a la base de datos.
        }
        return instance;
    }

    public void put(String key, Object value) {
        cache.put(key, value);
    }

    public Object get(String key) {
        return cache.get(key);
    }
}
