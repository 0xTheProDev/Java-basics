class MyThreadA extends Thread {
  int A[];
  MyThreadA(int[] a) {
    A = a.clone();
  }
  public void run() {
    for (int i = 0; i < A.length; i++)
      for (int j = 0; j < i; j++)
        if (A[j] > A[i]) {
          A[j] ^= A[i];
          A[i] ^= A[j];
          A[j] ^= A[i];
        }
    for (int i = 0; i < A.length; i++)
      System.out.print(A[i] + " ");
    System.out.println();
  }
}

class MyThreadB extends Thread {
  int A[];
  MyThreadB(int[] a) {
    A = a.clone();
  }
  public void run() {
    for (int i = 0; i < A.length; i++)
      for (int j = 0; j < i; j++)
        if (A[j] < A[i]) {
          A[j] ^= A[i];
          A[i] ^= A[j];
          A[j] ^= A[i];
        }
    for (int i = 0; i < A.length; i++)
      System.out.print(A[i] + " ");
    System.out.println();
  }
}

class MyThreadC extends Thread {
  int A[];
  MyThreadC(int[] a) {
    A = a.clone();
  }
  public void run() {
    int max = A[0];
    for (int i = 1; i < A.length; i++)
      if (A[i] > max)
        max = A[i];
    System.out.println("MAX: " + max);
  }
}

class MyThreadD extends Thread {
  int A[];
  MyThreadD(int[] a) {
    A = a.clone();
  }
  public void run() {
    int min = A[0];
    for (int i = 1; i < A.length; i++)
      if (A[i] < min)
        min = A[i];
    System.out.println("MIN: " + min);
  }
}

class Test {
  public static void main(String args[]) {
    int A[] = new int[args.length];
    for (int i = 0; i < args.length; i++)
      A[i] = Integer.parseInt(args[i]);
    
    Thread T1 = new MyThreadA(A);
    Thread T2 = new MyThreadB(A);
    Thread T3 = new MyThreadC(A);
    Thread T4 = new MyThreadD(A);
    
    T1.start();
    T2.start();
    T3.start();
    T4.start();
  }
}