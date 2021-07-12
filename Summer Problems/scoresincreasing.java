public class scoresincreasing {
    public static void main(String[] args){
        Integer[] array = {1,3,2};
        boolean answer = scoresIncreasing(array);
        System.out.println(answer);
    }

    public static boolean scoresIncreasing(Integer[] arr) {
        Integer count = 0;
        for(Integer i = 0; i < arr.length - 1; i++){
            if (arr[i + 1] >= arr[i]){
                count += 1;
            } else {
                continue;
            }
        }

        if (count == arr.length - 1){ // arr.length - 1 because you won't check [i+1] of last element, detracting one count value from the count variable.
        return true;
        } else {
            return false;
        }
    }
}

