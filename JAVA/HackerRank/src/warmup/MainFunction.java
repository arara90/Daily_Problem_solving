package warmup;

//https://kys9261.github.io/2019/03/21/algorithm/codingTest/hackerrank-codingtest-input/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MainFunction {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
    	return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
        // 결과값 출력을 위한 BufferedWriter를 생성해서 사용한다
        // OUTPUT_PATH에 결과값이 파일로 저장되고 그 파일로 정답 체크를 하는거 같음
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        /**
        * 입력값 샘플은 아래와 같다
        *
        * 7
        * 0 0 1 0 0 1 0
        */

        // 첫번재 값을 읽어들인다
        int n = scanner.nextInt();

        /** 
        * scanner.skip은 매개변수 값으로 패턴을 받는데 해당 패턴과 일치하는 값을 읽어들이면 해당 값은 Skip한다.
        * https://www.tutorialspoint.com/java/util/scanner_skip_pattern.htm
        * 줄바꿈이나 기타 불필요한 문자가 들어오면 skip 처리 하게끔 하려는 의도 같다.
        * (다음줄 받을때 scanner.nextLine() 대신 사용하는듯)
        * 상세한 설명은 https://stackoverflow.com/a/52111364
        */
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // n크기의 int 배열을 만든다
        int[] c = new int[n];

        // 다음줄을 받아와 공백으로 잘라 배열에 넣는다.
        String[] cItems = scanner.nextLine().split(" ");

        //위의 skip함수와 동일
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // cItem은 String 배열이므로 다시 int형 배열로 변환(?) 한다.
        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        // 구현할 함수의 매개변수로 배열을 넘겨주고 return 받은 값을 저장한다.
        int result = jumpingOnClouds(c);

        // result값을 String으로 변환후 bufferedWriter 쓰고
        bufferedWriter.write(String.valueOf(result));
        // 줄바꿈 처리하고 --> int값 1개만 버퍼에 넣는다면 줄바꿈 처리를 안해도 되지 않을까? (제거하고 실행했을때도 결과 차이는 없음)
        bufferedWriter.newLine();
        // 버퍼를 닫는다
        bufferedWriter.close();

        scanner.close();
    }
}