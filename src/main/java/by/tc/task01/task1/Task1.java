package by.tc.task01.task1;
public class Task1 {
    public static int getLastNumOfSquare(int num){
        switch(Math.abs(num%10)){
            case 0: case 1: case 5: case 6:
                return num%10;
            case 2: case 8:
                return 4;
            case 3: case 7:
                return 9;
            case 4:
                return 6;
            case 9:
                return 1;
        }
        return 0xFFFFFFFF;
    }
}
