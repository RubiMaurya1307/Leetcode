class NumberContainers {
    Map<Integer, Integer> indexs;
    Map<Integer, TreeSet<Integer> > sets;
    public NumberContainers() {
        indexs = new HashMap<>();
        sets = new HashMap<>();
    }
    
    public void change(int index, int number) {
        var val = indexs.getOrDefault(index, -1);
        indexs.put(index, number);
        if (val!=-1) {
            var pt = sets.getOrDefault(val, new TreeSet<Integer>());
            pt.remove(index);
            sets.put(val, pt);
        }
        var st = sets.getOrDefault(number, new TreeSet<Integer>());
        st.add(index);
        sets.put(number, st);
    }
    
    public int find(int number) {
        var st = sets.getOrDefault(number, new TreeSet<Integer>());
        if (st.size()==0)return -1;
        return st.first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */