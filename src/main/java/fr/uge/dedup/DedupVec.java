package fr.uge.dedup;

import java.util.*;

public final class DedupVec<E> {
    private final ArrayList<E> list;
    private final HashMap<E, E> map;

    public DedupVec(){
        this.list = new ArrayList<>();
        this.map = new HashMap<>();
    }

    public int size(){
        return list.size();
    }

    public E get(int index){
        return list.get(index);
    }

    public void add(E element){
        Objects.requireNonNull(element);
        list.add(element);
        map.put(element, element);
    }
}
