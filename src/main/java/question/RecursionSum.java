package question;

import common.ArrayGenerator;

/**
 * 递归求和
 * @author Oliver
 */
public class RecursionSum {
    public static void main(String[] args) {
        Integer[] arr = ArrayGenerator.generateUnorderedArray(10, 100);
        
        System.out.println("递归："+sum(arr,0));
        
        int result=0;
        for (Integer integer : arr) {
            result +=integer;
        }
        System.out.println("循环："+result);
    }
    
    public static int sum(Integer[] arr,int index){
        if(arr.length == index){
            return 0;
        }
        
        return arr[index] + sum(arr,index+1);
    }
    
}
