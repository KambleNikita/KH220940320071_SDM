/*Question : Create a git repository version control system with minimum 3 branches in VS Code 
and push the code in github. .[5 marks]
commit 1 : Create java file with linear search code and call commit.
commit 2 : Update java file with binary search code with switch case and call commit.[3marks]
commit 3 : write a menu driven java program and call commit. [2marks]
Run the git command to update status after each commit.*/ 

import java.util.Scanner;
public class LinearSearch{

    public void linearSearch(int array[],int search){
        for(int i=0;i<n;i++)
        {
        if(array[i]==search){
            System.out.println(search + "is present and the position is " + i);
        }
        else{
            System.out.println(search + "is not present ");
        }
        
    }

    
    public void binarySearch(int array[],int first, int last,int search){

        int mid = (first+last)/2;
        while(first<=last){

            if (arr[mid]<search){
                first = mid +1
            } else if (arr[mid]==key){
               System.out.println("Element is found at index "+mid);
               break;

            }
            else{
               last =  mid -1 ;

            }

            mid=(first+last)/2;
        }
        if(first>last){
            System.out.println("Element not found");
        }
    }

    public static void main(){
      int n, search;
      Scanner sc = new Scanner(system.in);
      System.out.println("Enter number of elements:");
      n = sc.nextInt();
      int array[] = new int[n];

      System.out.println("Enter those elements:");
      for(int i=0;i<n;i++){
       array[i] = sc.nextInt();
      }
     
      System.out.println("Enter the value to search:");
      search = sc.nextInt();

      System.out.println("Enter the choice 1 or 2 : ")
      int ch = sc.nextInt();

      switch(ch){
      case 1 : LinearSearch ls = new LinearSearch();
             ls.linearSearch(array,search); 
               break;
      case 2 : LinearSearch bs = new LinearSearch();
               bs.binarySearch(array,0,(array.length-1),search);
               break;

      }    
          
      }

    }


}