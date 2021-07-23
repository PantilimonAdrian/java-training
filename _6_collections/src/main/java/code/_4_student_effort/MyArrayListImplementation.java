package code._4_student_effort;

import java.util.Arrays;

public class MyArrayListImplementation<T> implements MyArrayList<T> {

    private Object[] arrayList = new Object[0];

    @Override
    public void add(T e) {
        this.arrayList = Arrays.copyOf(arrayList, arrayList.length + 1);
        this.arrayList[this.arrayList.length - 1] = e;
    }

    @Override
    public void remove(T e) {
        Object[] newArray = new Object[0];
        for (Object element : this.arrayList) {
            if (!element.equals(e)) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                newArray[newArray.length - 1] = element;
            }
        }
        this.arrayList = newArray;
    }

    @Override
    public T get(int index) {
        if (index >= this.arrayList.length || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + "is not a part of the array of size " + this.arrayList.length);
        }
        return (T) this.arrayList[index];
    }

    @Override
    public void set(int index, T e) {
        this.arrayList[index] = e;
    }

    @Override
    public int size() {
        return this.arrayList.length;
    }
}
