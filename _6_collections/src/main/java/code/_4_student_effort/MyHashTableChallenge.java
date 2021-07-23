package code._4_student_effort;

public class MyHashTableChallenge {
    public static void main(String[] args) {
        MyHashTable<String,String> testHashTable = new MyHashTableImpl<>();
        testHashTable.put("key1","value1");
        testHashTable.put("key2","value2");
        testHashTable.put("key3","value3");
        System.out.println(testHashTable.size());
        testHashTable.remove("key2");
        System.out.println(testHashTable.size());
        System.out.println(testHashTable.containsKey("key2"));

        MyHashTable<Integer,String> testHashStage2 = new MyHashTableImpl<>();
        testHashStage2.put(1,"value1");
        testHashStage2.put(2,"value2");
        testHashStage2.put(3,"value3");
        for (int i = 1; i <= testHashStage2.size();i++){
            System.out.println(testHashStage2.get(i));
        }
        System.out.println(testHashStage2.size());
        testHashStage2.remove(2);
        System.out.println(testHashStage2.get(1));
        System.out.println(testHashStage2.get(3));
    }
}
