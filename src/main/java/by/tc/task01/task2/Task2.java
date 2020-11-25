package by.tc.task01.task2;
public class Task2 {
    public static int getNumOfDaysOfMonth(int numOfMonth,int year){
        if(numOfMonth<=0||numOfMonth>12||year<0)
            return 0xFFFFFFFF;
        if(year%4!=0){
            if(numOfMonth==2) {
                return 28;
            }
        }
        else{
            if(numOfMonth==2) {
                return 29;
            }
        }
        if(numOfMonth==8)
            return 31;
        if(numOfMonth<=7) {
            if (numOfMonth % 2 == 1) {
                return 31;
            } else return 30;
        }else {
            if (numOfMonth % 2 == 0) {
                return 31;
            } else return 30;
        }
        }
    }
