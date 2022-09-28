public class Sort {
    Sort() {

    }

    int[] sort(int arr[]) {
        // arr의 각 요소가 다른 요소보다 작은지 arr의 요소를 순회하며  검사
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                // 만약 현재 요소가 비교 요소보다 작다면 현재 인뎃스에 해당 요소 값을 할당
                if(arr[i] < arr[j]) {
                    // 바로 값을 할당하면 비교할 값이 없어짐으로 tmp를 선언하여 값의 위치를 바꿈
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
     }

}
