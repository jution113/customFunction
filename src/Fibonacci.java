public class Fibonacci {
    Fibonacci() {

    }
    int getFibonacciValue(int index) {
        // fibonacci 값의 계산은 2번째부터 가능하기에 0, 1번째 값은 정해둔다.
        if(index == 0) return 0;
        if(index == 1) return 1;

        // 피보나치의 n번째 값은 n-1 + n-2이다.
        return getFibonacciValue(index - 1) + getFibonacciValue(index - 2);
    }

}
