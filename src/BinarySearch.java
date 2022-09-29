public class BinarySearch {
    BinarySearch() {

    }

    int searchIndex(int[] arr, int value) {
        return recursionSearch(arr, value, 0, arr.length-1);
    }

    int recursionSearch(int[] arr, int value, int startIndex, int endIndex) {
        // 현재 인덱스는 값을 찾으려는 범위의 중앙으로 설정
        int currentIndex = (startIndex + endIndex) / 2;

        // 현재 값이 찾으려는 값과 일치하면 해당 값의 인덱스를 반환
        if(arr[currentIndex] == value) return currentIndex;

        if(arr[currentIndex] > value) {
            // 만약 찾으려는 값이 현재 값보다 작다면 처음부터 현재 값을 제외한 이전 값까지로 범위 설정하여 재탐색
            return recursionSearch(arr,  value,  0, currentIndex-1);
        } else {
            // 만약 찾으려는 값이 현재 값보다 크다면 현재 값을 제외한 이후 끝까지로 범위 설정하여 재탐색
            return recursionSearch(arr,  value,  currentIndex+1, endIndex);
        }
    }




}
