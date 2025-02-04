import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0; 
    for (int i = 0; i < arr.length; i++)
    {
      if(arr[i].length() == targetLength)
      {
        count++;
      }
    }
    return count;
  }

  public static int indexOf(double[] arr, double target)
  {
    for(int i = 0; i < arr.length; i++)
    {
      double elem = arr[i];
      if(elem == target)
      {
        return i;
      }
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    for(int i = 0; i < arr.lenth; i++)
    {
      int target = arr[i];
      for(int j = i+1; j < arr.length; j++)
      {
        if(arr[j] == (target))
        {
          return true;
        }
      }
    }
    return false;
  }

  public static String findMode(int[] arr)
  {
    int count = 0;
    int max_count = 0;
    int mode = arr[0];
    for (int i = 0; i < arr.length; i++)
    {
      int potential_mode = arr[i];
      count = 0; 
      for(int j = i+1; j < arr.length; j++)
      {
        if(arr[j] == arr[i])
        {
          count++;
        }
      }
    }
    if(count > max_count)
    {
      count = max_count;
      mode = potential_mode
    }
  }
    return mode;
  }
}
