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
    	
        // ����� ����� ���� BufferedWriter�� �����ؼ� ����Ѵ�
        // OUTPUT_PATH�� ������� ���Ϸ� ����ǰ� �� ���Ϸ� ���� üũ�� �ϴ°� ����
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        /**
        * �Է°� ������ �Ʒ��� ����
        *
        * 7
        * 0 0 1 0 0 1 0
        */

        // ù���� ���� �о���δ�
        int n = scanner.nextInt();

        /** 
        * scanner.skip�� �Ű����� ������ ������ �޴µ� �ش� ���ϰ� ��ġ�ϴ� ���� �о���̸� �ش� ���� Skip�Ѵ�.
        * https://www.tutorialspoint.com/java/util/scanner_skip_pattern.htm
        * �ٹٲ��̳� ��Ÿ ���ʿ��� ���ڰ� ������ skip ó�� �ϰԲ� �Ϸ��� �ǵ� ����.
        * (������ ������ scanner.nextLine() ��� ����ϴµ�)
        * ���� ������ https://stackoverflow.com/a/52111364
        */
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // nũ���� int �迭�� �����
        int[] c = new int[n];

        // �������� �޾ƿ� �������� �߶� �迭�� �ִ´�.
        String[] cItems = scanner.nextLine().split(" ");

        //���� skip�Լ��� ����
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // cItem�� String �迭�̹Ƿ� �ٽ� int�� �迭�� ��ȯ(?) �Ѵ�.
        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        // ������ �Լ��� �Ű������� �迭�� �Ѱ��ְ� return ���� ���� �����Ѵ�.
        int result = jumpingOnClouds(c);

        // result���� String���� ��ȯ�� bufferedWriter ����
        bufferedWriter.write(String.valueOf(result));
        // �ٹٲ� ó���ϰ� --> int�� 1���� ���ۿ� �ִ´ٸ� �ٹٲ� ó���� ���ص� ���� ������? (�����ϰ� ������������ ��� ���̴� ����)
        bufferedWriter.newLine();
        // ���۸� �ݴ´�
        bufferedWriter.close();

        scanner.close();
    }
}