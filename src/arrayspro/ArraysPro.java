/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayspro;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Angelina
 */
public class ArraysPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums; //так же как и int nums[];
        nums = new int[5]; //ссылка
        //ERROR nums = {1,2,3,4};
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;
        System.out.println("nums = "+Arrays.toString(nums));
        
        int nums2[];
        nums2 = nums; //nums и nums2 ссылаются на один и тот же объект, лишнее
        nums2 = new int[7]; //будет создан новый объект, прошлый link удалён, лишнее
        nums2 = Arrays.copyOf(nums, 7); //создает новый массив, 7 ячеек, но в первые 5 скопирует из nums, 2 останутся пустые
        System.out.println("nums2 ="+Arrays.toString(nums2));
        System.out.print("nums2 = [");
        for(int i=0;i<nums2.length;i++) {
            System.out.printf("%d", nums2[i]);
            if(i < nums2.length-1) {
            System.out.print(", ");
            }
        }
        System.out.println("]");
        
        System.out.println();
        
        System.out.println("Двухмерный массив");
        Random random = new Random();
        int[][] nums3;
        nums3 = new int[5][5];
        for (int i=0; i < nums3.length; i++) {
            for (int j=0; j < nums3[i].length; j++){
                nums3[i][j] = random.nextInt(10);
            }
        }
        
        System.out.println("nums3 = ");
        //System.out.println(Arrays.toString(nums3)); адреса ячеек
        for(int i=0; i < nums3.length; i++) {
            for(int j = 0; j < nums3[i].length; j++) {
                System.out.printf("%5d", nums3[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("nums3 = ");
        for(int i=0; i < nums3.length; i++) {
            System.out.println(Arrays.toString(nums3[i]));
            for(int j = 0; j < nums3[i].length; j++) {
            }
        }
        
        System.out.println();
        
        System.out.println("Зубчатый массив");
        double[][] zubArray = new double[5][];
        zubArray[0] = new double[2];
        zubArray[1] = new double[3];
        zubArray[2] = new double[4];
        zubArray[3] = new double[5];
        zubArray[4] = new double[6];
        
        //Заполнение массива
        for(int i=0; i < zubArray.length; i++) {
            for(int j = 0; j < zubArray[i].length; j++) {
                zubArray[i][j] = random.nextDouble()*10;
            }
        }
        
        //Вывод массива на консоль
        System.out.println("zubArray = ");
        for(int i=0; i < zubArray.length; i++) {
            for(int j = 0; j < zubArray[i].length; j++) {
                System.out.printf("%-7.2f",zubArray[i][j]);
            }
            System.out.println();
        }
        
    }
}
