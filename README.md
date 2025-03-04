# Diamond Star Pattern in Java

## Description
This Java program generates a **diamond-shaped star pattern** based on user input. It utilizes nested loops to print spaces and stars, forming the upper and lower halves of the diamond. The user provides the size (`n`), which determines the number of rows in the pattern.

## Code Explanation

### 1. **Importing Scanner for User Input**
```java
import java.util.Scanner;
```
- We import `Scanner` to take user input for the size of the diamond.

### 2. **Declaring the Class and Main Method**
```java
public class Diamond
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = s.nextInt();
```
- `Scanner s = new Scanner(System.in);` → Creates a `Scanner` object for user input.
- `int n = s.nextInt();` → Reads an integer `n` from the user to determine the diamond size.

### 3. **Generating the Upper Half of the Diamond**
```java
for(int i = 0; i <= n; i++)
{
    for(int j = i; j <= n; j++)
    {
        System.out.print(" ");
    }
    for(int j = 1; j < i; j++)
    {
        System.out.print("*");
    }
    for(int j = 1; j <= i; j++)
    {
        System.out.print("*");
    }
    System.out.println();
}
```
#### Working of Loops:
- **Outer loop (`for(int i=0; i<=n; i++)`)**
  - Runs from `0` to `n` → Controls the number of rows in the upper half.
- **First inner loop (`for(int j=i; j<=n; j++)`)**
  - Prints spaces (`" "`) to align stars properly.
- **Second inner loop (`for(int j=1; j<i; j++)`)**
  - Prints `*` from the second column onwards to create the left half of the diamond.
- **Third inner loop (`for(int j=1; j<=i; j++)`)**
  - Prints `*` to complete the right half.

### 4. **Generating the Lower Half of the Diamond**
```java
for(int i = 0; i <= n; i++)
{
    for(int j = 1; j <= i; j++)
    {
        System.out.print(" ");
    }
    for(int j = i; j < n; j++)
    {
        System.out.print("*");
    }
    for(int j = i; j <= n; j++)
    {
        System.out.print("*");
    }
    System.out.println();
}
```
#### Working of Loops:
- **Outer loop (`for(int i=0; i<=n; i++)`)**
  - Controls the number of rows in the lower half.
- **First inner loop (`for(int j=1; j<=i; j++)`)**
  - Prints leading spaces to align the stars.
- **Second inner loop (`for(int j=i; j<n; j++)`)**
  - Prints the first part of stars.
- **Third inner loop (`for(int j=i; j<=n; j++)`)**
  - Prints the second part of stars.

## Example Output
```
Enter the size: 5
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
```

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Diamond_Pattern.git
```
