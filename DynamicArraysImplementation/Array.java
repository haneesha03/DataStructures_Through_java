class DynamicArray<T>{
    private T[] array;
    private int size;
    private int capacity;
    private static final int DEFAULT_CAPACITY=10;
    public DynamicArray(){
        this(DEFAULT_CAPACITY);
    }
    public DynamicArray(int capacity){
        this.capacity=capacity;
        this.array=(T[])new Object[capacity];
        this.size=0;
    }
    public int size(){
        return size;
    }
    public int capacity(){
        return capacity;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void add(T element){
        if(size==capacity){
            resize();
        }
        array[size++]=element;
    }
    private void resize(){
        int newcapacity=capacity*2;
        T[] newArray=(T[])new Object[newcapacity];
        for(int i=0;i<size;i++){
            newArray[i]=array[i];
        }
        array=newArray;
        capacity=newcapacity;
    }
    public T get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index "+index+"size"+size);
        }
        return array[index];
    }
    public T remove(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index "+index+"size"+size);
        }
        T removedElement=array[index];
        for(int i=index;i<size-1;i++){
            array[i]=array[i+1];
        }
        array[--size]=null;
        return removedElement;
    }
    public void insert(T element,int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index "+index+"size"+size);
        }
        if(size==capacity){
            resize();
        }
        for(int i=size;i>index;i++){
            array[i]=array[i-1];
        }
        array[index]=element;
        size++;
    }
    public void set(int index,T element){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index"+index+"size"+size);
        }
        array[index]=element;
    }
    public boolean contains(T element){
        for(int i=0;i<size;i++){
            if(array[i]!=null && array[i].equals(element)){
                return true;
            }
        }
        return false;
    }
    public int indexOf(T element){
        for(int i=0;i<size;i++){
            if(array[i]!=null && array[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
    public void trimToSize(){
        if(size<capacity){
            capacity=size;
            T[] newArray=(T[])new Object[capacity];
            for(int i=0;i<size;i++){
                newArray[i]=array[i];
            }
            array=newArray;
        }
    }
    public String toString(){
        StringBuffer sb=new StringBuffer("[");
        for(int i=0;i<size-1;i++){
            sb.append(array[i]);
            sb.append(",");
        }
        sb.append(array[size-1]);
        sb.append("]");
        return sb.toString();
    }
}
class Array{
    public static void main(String args[]){
        DynamicArray<String> words=new DynamicArray<>();
        words.add("haneesha");
        words.add("surya");
        words.add("Prameela");
        words.add("devendra");
        System.out.println(words.size());
        System.out.println(words.isEmpty());
        System.out.println(words.toString());
        words.remove(0);
        System.out.println(words.toString());
        words.insert("Haneesha",2);
        words.insert("barghav",3);
        System.out.println(words.size());
        
    }
}