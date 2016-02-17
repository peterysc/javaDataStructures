package datastructure;

public class towerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		char start = 'A';
		char mid = 'B';
		char end = 'C';
		
		towerOfHanoiSolver(n, start, end, mid);

	}
	
	static void towerOfHanoiSolver(int n, char mainTower, char destTower, char midTower){
		
		// base case
		if(n==1){
			System.out.println("Moved disk 1 from tower " + mainTower + " to tower " + destTower);
			return;
		}
		
		else{
			// move n-1 disks from tower A to tower B
			towerOfHanoiSolver(n-1, mainTower, midTower, destTower);
			// move n disk from tower A to tower C
			System.out.println("Moved disk from tower " + mainTower + " to tower " + destTower);
			// move n-1 disks from tower B to tower C
			towerOfHanoiSolver(n-1, midTower, destTower, mainTower);
		}
	}

}
