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
        var existing = map.get(element);
        if (existing == null) {
            map.put(element, element);
            list.add(element);
        } else {
            list.add(existing);
        }
    }

    public boolean contains(Object element){
        Objects.requireNonNull(element);
        return map.containsKey(element);
    }

    public void addAll(DedupVec<E> dedupVec){
        Objects.requireNonNull(dedupVec);
        for(var element : dedupVec.list){
            add(element);
        }
    }
}
