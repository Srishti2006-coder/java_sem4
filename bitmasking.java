
// q.> 1. And Operator (&)

/*
 * class Main {
 * public static void main(String args[]) {
 * int a = 5;
 * int b = 8;
 * 
 * int result = a & b;
 * System.out.println("And of a & b : " + result);
 * }
 * }
 */

// q.) 2. OR Operator (|)

/*
 * class Main {
 * public static void main(String args[]) {
 * int a = 5;
 * int b = 8;
 * 
 * int result = a | b;
 * System.out.println("And of a & b : " + result);
 * }
 * }
 */

// q.) 3. XOR Operator (^)

/*
 * class Main {
 * public static void main(String[] args) {
 * 
 * int a = 5;
 * int b = 3;
 * 
 * int result = a ^ b;
 * 
 * System.out.println("XOR = " + result);
 * 
 * }
 * }
 */

// q.) 4. NOT Operator (~)

/*
 * class Main {
 * public static void main(String[] args) {
 * 
 * int a = 5;
 * 
 * int result = ~a;
 * 
 * System.out.println("NOT = " + result);
 * 
 * }
 * }
 */

/*
 * class Main {
 * public static void main(String[] args){
 * 
 * int a = 5;
 * int b = 3;
 * 
 * System.out.println(a & b);
 * System.out.println(a | b);
 * System.out.println(a ^ b);
 * System.out.println(~a);
 * 
 * }
 * }
 */

// q.) 5. Application - Check ith bit

/*
 * class Main {
 * public static void main(String args[]) {
 * int n = 5; // 0101
 * int i = 2; // 3 idx
 * if ((n & (1 << i)) != 0) {
 * System.out.println("Bit is On : 1");
 * } else {
 * System.out.println("Bit is off : 0");
 * }
 * }
 * }
 */

// q.) 6. Set ith Bit

/*
 * class Main {
 * public static void main(String args[]) {
 * int n = 5; // 0101
 * int i = 1; // 1 idx bit agar 0 hai to set it to 1
 * n = n | (1 << i); // 0111
 * System.out.println(n);
 * }
 * }
 */

// q.) 7. Clear ith Bit

/*
 * class Main {
 * public static void main(String args[]) {
 * int n = 5; // 0101
 * int i = 2;
 * n = n & ~(1 << i); // 0001
 * System.out.println(n);
 * 
 * }
 * }
 */

// q.) 8. toggle ith bit

/*
 * class Main {
 * public static void main(String[] args) {
 * int n = 5; // 0101
 * int i = 3; // 1 -> 0 and 0 -> 1
 * n = n ^ (1 << i);// 1101
 * System.out.println(n);
 * }
 * }
 */

// q.) 9. find unique element

/*
 * class Main {
 * public static void main(String[] args) {
 * int[] arr = { 1, 2, 3, 4, 3, 5, 2, 5, 1 };
 * int ans = 0;
 * for (int num : arr) {
 * ans ^= num;
 * }
 * System.out.println(ans);
 * }
 * }
 */

// q.) 10. //ques - find missing number in array

/*
 * class Main {
 * public static void main(String[] args) {
 * int n = 5;// length of array
 * int[] arr = { 0, 1, 3, 4, 5 };// start from 0 to n but 2 is missing
 * int ans = 0;
 * for (int i = 0; i <= n; i++) {
 * ans ^= i;
 * }
 * for (int num : arr) {
 * ans ^= num;
 * }
 * System.out.print(ans);
 * }
 * }
 */

// ques 11. - power set

/*
 * class Main {
 * public static void main(String[] args) {
 * int[] arr = { 1, 2, 3 };
 * int n = arr.length;
 * 
 * for (int i = 0; i < (1 << n); i++) {
 * for (int j = 0; j < n; j++) {
 * if ((i & (1 << j)) != 0) {
 * System.out.print(arr[j] + " ");
 * }
 * }
 * System.out.println();
 * }
 * }
 * }
 */

// ques 12. Complement of a number

/*
 * class Main {
 * public static void main(String[] args) {
 * 
 * int n = 5;
 * 
 * int bits = Integer.toBinaryString(n).length();
 * 
 * int mask = (1 << bits) - 1;
 * 
 * int result = mask ^ n;
 * 
 * System.out.println(result);
 * 
 * }
 * }
 */

// Ques 13.) Case 1: Every number appears twice except one

/*
 * class Main {
 * 
 * static int uniqueNumber(int arr[]) {
 * int ans = 0;
 * 
 * for (int i = 0; i < arr.length; i++) {
 * ans = ans ^ arr[i];
 * }
 * 
 * return ans;
 * }
 * 
 * public static void main(String args[]) {
 * int arr[] = { 2, 3, 2, 4, 3 };
 * 
 * System.out.println(uniqueNumber(arr));
 * }
 * }
 */

// Ques 14.) Case 2: Every number appears thrice except one

/*
 * class Main {
 * 
 * static int uniqueNumber(int arr[]) {
 * int result = 0;
 * for (int i = 0; i < 32; i++) {
 * int sum = 0;
 * for (int j = 0; j < arr.length; j++) {
 * if ((arr[j] & (1 << i)) != 0) {
 * sum++;
 * }
 * }
 * if (sum % 3 != 0) {
 * result |= (1 << i);
 * }
 * }
 * return result;
 * }
 * 
 * public static void main(String args[]) {
 * int arr[] = { 2, 2, 3, 2 };
 * System.out.println(uniqueNumber(arr));
 * }
 * }
 */

// Ques 15.) Case 3: Every number appears k times except one

/* // class Main {

//     static int uniqueNumber(int arr[], int k)
//     {
//         int ans = 0;

//         for(int bit=0; bit<32; bit++)
//         {
//             int count=0;

//             for(int i=0;i<arr.length;i++)
//             {
//                 if((arr[i] & (1<<bit))!=0)
//                 count++;
//             }

//             if(count%k!=0)
//             ans = ans | (1<<bit);
//         }

//         return ans;
//     }

//     public static void main(String args[])
//     {
//         int arr[] = {6,6,6,9};

//         System.out.println(uniqueNumber(arr,3));
//     }
// }  */

// ques 16.) Missing number in array

class Main {
    static int missingNum(int arr[]) {
        int xor1 = 0;
        int xor2 = 0;

        // XOR 1 to arr.length + 1
        for (int i = 1; i <= arr.length + 1; i++) {
            xor1 = xor1 ^ i;
        }

        // XOR all elements in the array
        for (int i = 0; i < arr.length; i++) {
            xor2 = xor2 ^ arr[i];
        }

        // The missing number is the XOR of both values
        return xor1 ^ xor2;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 2, 4, 5 };
        System.out.println(missingNum(arr));
    }
}