package test;

// 정수 배열 array와 2차원 정수 배열 queries이 주어진다. queries의 원소는 각각 하나의 query를 나타내며, [s, e] 형태다.
//각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 array[index]에 1을 더한다.
//위 규칙에 따라 queries를 처리한 이후의 array를 return 한다.
//메서드의 반환 타입은 정수의 배열이고 메서드명은 solution, 
//매개변수의 타입은 1차원 정수 배열 타입 array, 2차원 정수 배열 타입 queries 로 받으면서 
//접근 제어는 모든 패키지에서 사용할 수 있도록 하며 오버라이딩이 가능하고 구현부가 존재하는 인스턴스 메서드로 작성하시오.
//입출력 예
//array: [0, 1, 2, 3, 4]
//queries: [[0, 1],[1, 2],[2, 3]]
//result: [1, 3, 4, 4, 4]

import java.util.Arrays;

class Test2{
	
	public int[] solution(int[] array, int[][] queries) {
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            for (int index = start; index <= end; index++) {
                array[index] += 1;
            }
        }

        return array;
    }
	
	public static void main(String[] args) {
		Test2 solution = new Test2();
		
		int[] array = {0, 1, 2, 3, 4};
		int[][] queries = {{0,1}, {1,2}, {2,3}};
		
		int[] result = solution.solution(array, queries);
		System.out.println("result: " + Arrays.toString(result));
	}

}


	

