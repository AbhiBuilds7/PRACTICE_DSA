public class LinearSearch {

    public static int linearSearch(int numbers[], int key){

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 4, 10, 14, 16, 97, 86, 90};
        int key = 10;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Key is at index : " + index);
        }
        
    }
    
}
