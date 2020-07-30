import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution_2383 {
	static class Man{
		int x;
		int y;
		int distance;
		Man(int x, int y){
			this.x = x;
			this.y = y;
		}
		
	}
	
	static PriorityQueue<Man> queue = null;	
	static int[][] map;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t, N, M;
		int T;											//total test case
		int tempStatus;									//check there is a person on the map
		int stair_A_I, stair_A_J; 
		int stair_B_I, stair_B_J;

		T = Integer.parseInt(br.readLine());		
		for (t = 1; t <= T; t++) {
			
			//initiation
			stair_A_I=-1;
			stair_A_J=-1;
			stair_B_I=-1;
			stair_B_J=-1;
			
			N = Integer.parseInt(br.readLine());		//size of the map
			
			//filling up the maps from the input
			for(int i=0; i<N;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<N;j++) {
					tempStatus = Integer.parseInt(st.nextToken());		//scanner to check it is person or stair
					if(tempStatus ==1) {
						map[i][j] = tempStatus;
					}
					else if(tempStatus<=10) {
						if(stair_A_I == -1 && stair_A_J==-1) {
							stair_A_I = i;								//first stair I location
							stair_A_J = j;								//first stair J location
						}
						else {
							stair_B_I = i;								//second stair I location
							stair_B_J = j;								//second stair J location
						}
					}
				}
			}
			
			
			
		}
	}
			
			


}
