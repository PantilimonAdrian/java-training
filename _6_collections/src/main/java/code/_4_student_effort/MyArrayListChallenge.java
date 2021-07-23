package code._4_student_effort;

public class MyArrayListChallenge {
    public static void main(String[] args) {
        MyArrayList<Integer> testList = new MyArrayListImplementation<>();

        for(int i = 0 ; i <= 16;i++){
            testList.add(i);
        }
        displayArrayList(testList);
        System.out.println(testList.size());
        testList.remove(9);
        displayArrayList(testList);
        System.out.println(testList.size());
        testList.set(3,9);
        displayArrayList(testList);
        System.out.println(testList.size());
    }

    public static void displayArrayList(MyArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size();i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }
}
