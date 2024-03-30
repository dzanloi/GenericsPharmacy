package Map;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class MyMap<Key, Val> {
    ArrayList<Key> ALkey;
    ArrayList<Val> ALvalue;

    public MyMap() {
        this.ALkey = new ArrayList<>();
        this.ALvalue = new ArrayList<>();
    }

    public void put(Key key, Val val) { //done as of thursday
        int index = ALvalue.indexOf(key);

        for(Key k : ALkey) {
            if(k.equals(key)) {
                ALvalue.set(index, val); //ilis
            }
        }

        ALvalue.add(val);
        ALkey.add(key);
    }

    public Val get(Key key) { //thur night
        int index = ALkey.indexOf(key);

        for(Key k : ALkey) {
            if(k.equals(key)) {
                return ALvalue.get(index);
            }
        }
        return null;
    }

    public Val remove(Key key) { //yes
        int index = ALkey.indexOf(key);

        for(Key k : ALkey) {
            if(k.equals(key)) {
                ALkey.remove(k);
                ALvalue.remove(ALvalue.get(index));
                return ALvalue.get(index);
            }
        }
        return null;

    }


}
