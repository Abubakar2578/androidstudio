import java.util.*;

public class Merg
{
    public static void main(String[] args)
    {
        int[] arrL ={2 , 4 , 7 , 10 , 11 };
        int[] arrR = {1 , 5 , 9 , 20 };

        System.out.print("Array 1: ");
        for(int i = 0 ; i < arrL.length ;i++)
        {
            System.out.print(arrL[i] +" ");
        }
        System.out.println(" ");

        System.out.print("Array 1: ");
        for(int i = 0 ; i < arrR.length ;i++)
        {
            System.out.print(arrR[i] +" ");
        }
        System.out.println(" ");

        int[] A = {};
        int a = 0;
        for(int i = 0 ; i <arrL.length ; i++)
        {
            A[i] = arrL[i];
            a  = i;
        }

        for(int j = 0 ; j <arrR.length ; j++)
        {
            A[5 +j] = arrR[j];
            
        }

        System.out.print("Arrays After Concatination: ");
        for(int  i = 0 ; i < A.length ; i++)
        {
            System.out.print(A[i] +" ");

        }
        System.out.println(" ");



    }

    static void merge(int[] L , int[] R)
    {
        int m = L.length;
        int l = R.length;
        int n =  m +l;

        int A[n] = {};
        int i = 0 , j = 0 , k =0;

        while(i <= m && j <= l)
        {
            if(L[i] <= R[i])
            {
                A[k] = L[i];
                i++;
                k++;
            }
            else
            {
                A[k] = R[j];
                j++;
                k++;
            }
        } 

        while(i <= m)
        {
            A[k] = L[i];
            i++;
            k++;
        }

        while(j <= n)
        {
            A[k] =  R[j];
            j++;
            k++;
        }

        
    }



    // static void merge(int[] A , int p , int q , int r)
    // {
    //     int li = q-p+1;
    //     int ri = r-q;

    //     int[] L;
    //     int[] R;

    //     for(int i = 0 ; i <  li ; i++)
    //     {
    //         L[i] = A[p+i-1];
    //     }

    //     for(int i = 0 ; i < ri ; i++ )
    //     {
    //         R[i] = A[q+i];
    //     }

    //     int i= 0,j = 0, k = 0;

    //     while(i <= li && j <= ri)
    //     {
    //         if(L[i] <= R[i])
    //         {
    //             A[k] = L[i];
    //             i++;
    //             k++;
    //         }
    //         else
    //         {
    //             A[k] = R[j];
    //             j++;
    //             k++;
    //         }
    //     } 

    //     while(i <= li)
    //     {
    //         A[k] = L[i];
    //         i++;
    //         k++;
    //     }

    //     while(j <= ri)
    //     {
    //         A[k] =  R[j];
    //         j++;
    //         k++;
    //
    //      }
   // }


//    public static void mergeSort(int[] A , int p , int r)
//    {
//         if(p < r)
//         {
//             int q = (p+q)/2;


//             mergeSort(A , p , q);
//             mergeSort(A ,q+1 , r);

//             merge(A , p , q ,r);

//         }
//    }

}