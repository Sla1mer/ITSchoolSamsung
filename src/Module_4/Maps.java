package Module_4;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(3, "France");
        states.put(4, "Russia");

        System.out.println(states.get(2));
        Set<Integer> keys = states.keySet();
        System.out.println(keys);
        Collection<String> values = states.values();
        System.out.println(values);

        for (Map.Entry<Integer, String> item: states.entrySet()) {
            System.out.println(item.getKey() + ":" + item.getValue() + ":" +item.hashCode());
        }

        System.out.println(states.containsKey(1));
        System.out.println(states.containsValue("Russia"));
        states.remove(4);
        for (Map.Entry<Integer, String> item: states.entrySet()) {
            System.out.println(item.getKey() + ":" + item.getValue());
        }
        System.out.println(states.size());
        states.clear();
        SortedMap<Integer, String> sortedMap = new SortedMap<Integer, String>() {
            @Override
            public Comparator<? super Integer> comparator() {
                return null;
            }

            @Override
            public SortedMap<Integer, String> subMap(Integer fromKey, Integer toKey) {
                return null;
            }

            @Override
            public SortedMap<Integer, String> headMap(Integer toKey) {
                return null;
            }

            @Override
            public SortedMap<Integer, String> tailMap(Integer fromKey) {
                return null;
            }

            @Override
            public Integer firstKey() {
                return null;
            }

            @Override
            public Integer lastKey() {
                return null;
            }

            @Override
            public Set<Integer> keySet() {
                return null;
            }

            @Override
            public Collection<String> values() {
                return null;
            }

            @Override
            public Set<Entry<Integer, String>> entrySet() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public String get(Object key) {
                return null;
            }

            @Override
            public String put(Integer key, String value) {
                return null;
            }

            @Override
            public String remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends Integer, ? extends String> m) {

            }

            @Override
            public void clear() {

            }
        };

        NavigableMap<Integer, String> stringNavigableMap = new NavigableMap<Integer, String>() {
            @Override
            public Entry<Integer, String> lowerEntry(Integer key) {
                return null;
            }

            @Override
            public Integer lowerKey(Integer key) {
                return null;
            }

            @Override
            public Entry<Integer, String> floorEntry(Integer key) {
                return null;
            }

            @Override
            public Integer floorKey(Integer key) {
                return null;
            }

            @Override
            public Entry<Integer, String> ceilingEntry(Integer key) {
                return null;
            }

            @Override
            public Integer ceilingKey(Integer key) {
                return null;
            }

            @Override
            public Entry<Integer, String> higherEntry(Integer key) {
                return null;
            }

            @Override
            public Integer higherKey(Integer key) {
                return null;
            }

            @Override
            public Entry<Integer, String> firstEntry() {
                return null;
            }

            @Override
            public Entry<Integer, String> lastEntry() {
                return null;
            }

            @Override
            public Entry<Integer, String> pollFirstEntry() {
                return null;
            }

            @Override
            public Entry<Integer, String> pollLastEntry() {
                return null;
            }

            @Override
            public NavigableMap<Integer, String> descendingMap() {
                return null;
            }

            @Override
            public NavigableSet<Integer> navigableKeySet() {
                return null;
            }

            @Override
            public NavigableSet<Integer> descendingKeySet() {
                return null;
            }

            @Override
            public NavigableMap<Integer, String> subMap(Integer fromKey, boolean fromInclusive, Integer toKey, boolean toInclusive) {
                return null;
            }

            @Override
            public NavigableMap<Integer, String> headMap(Integer toKey, boolean inclusive) {
                return null;
            }

            @Override
            public NavigableMap<Integer, String> tailMap(Integer fromKey, boolean inclusive) {
                return null;
            }

            @Override
            public SortedMap<Integer, String> subMap(Integer fromKey, Integer toKey) {
                return null;
            }

            @Override
            public SortedMap<Integer, String> headMap(Integer toKey) {
                return null;
            }

            @Override
            public SortedMap<Integer, String> tailMap(Integer fromKey) {
                return null;
            }

            @Override
            public Comparator<? super Integer> comparator() {
                return null;
            }

            @Override
            public Integer firstKey() {
                return null;
            }

            @Override
            public Integer lastKey() {
                return null;
            }

            @Override
            public Set<Integer> keySet() {
                return null;
            }

            @Override
            public Collection<String> values() {
                return null;
            }

            @Override
            public Set<Entry<Integer, String>> entrySet() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public String get(Object key) {
                return null;
            }

            @Override
            public String put(Integer key, String value) {
                return null;
            }

            @Override
            public String remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends Integer, ? extends String> m) {

            }

            @Override
            public void clear() {

            }
        };
        TreeMap<Integer, String> st = new TreeMap<>();
        st.put(10, "Russia");
        st.put(3, "Fr");
        st.put(7, "Gr");

        for (Map.Entry<Integer, String> item : st.entrySet()){
            System.out.println(item.getKey() + ":" + item.getValue() + ":" + item.hashCode());
        }

    }
}
