package fr.uge.dedup;

import java.util.*;

public final class DedupVec<E> {
    private final ArrayList list;
    private final HashMap map;

    public DedupVec(){
        this.list = new ArrayList<E>();
        this.map = new HashMap<>();
    }

    public int size(){
        return list.size();
    }

    public Object get(int index){
        return list.get(index);
    }

    public void add(E element){
        Objects.requireNonNull(element);
        list.add(element);
    }
}
