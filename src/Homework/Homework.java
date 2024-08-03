package Homework;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Homework {
	/* В методе main реализуется простейщий интерфейс для запуска учебных заданий
	 	по их номеру, возможность многократного запуска любой задачи без перезапуска программы 
	 	и выход из программы. Обработка неверных значений не предусмотрена ни в одном из методов.
	 */
	public static void main(String arg[]) {
		try {
		Scanner scanner = new Scanner(System.in);
		while (true) {
		System.out.println("Введите номер задания или 0 для завершения: ");
		int inp = scanner.nextInt();
		switch (inp) {
			case (0):
				System.exit(0);
			case (1):
				printThreeWords();
				break;
			case (2):
				checkSumSign();
				break;
			case (3):
				printColor();
				break;
			case (4):
				compareNumbers();
				break;
			case (5):
				System.out.println(sum1020());
				break;
			case (6):
				signtest();
				break;
			case (7):
				System.out.println(signtest2());
				break;
			case (8):
				stringpop();
				break;
			case (9):
				System.out.println(leapYear());
				break;
			case (10):
				System.out.println(Arrays.toString(binReplace()));
				break;
			case (11):
				System.out.println(Arrays.toString(arr100()));
				break;
			case (12):
				System.out.println(Arrays.toString(arrayPop6()));
				break;
			case (13): 
				Arrays.stream(squareMatrix()).map(Arrays::toString).forEach(System.out::println);
				break;
			case (14):
				System.out.println("Введите длину массива:");
				int len = scanner.nextInt();
				System.out.println("Введите значение:");
				int initialValue = scanner.nextInt();
				System.out.println(Arrays.toString(massiv(len, initialValue)));
		}
		}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	// Метод выводит три слова в столбик
	private static void printThreeWords() {
		System.out.println("Orange\nBanana\nApple");
	}
	// Метод проверяет знак суммы двух чисел и выводит сообщение с результатом
	private static void checkSumSign() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите первое число:");
		int a = scan.nextInt();
		System.out.println("Введите второе число:");
		int b =scan.nextInt();
		if (a + b >= 0) {
			System.out.println("Сумма положительная");
		} else System.out.println("Сумма отрицательная");
	}
	//Метод выводит цвет в зависимости от диапазона в который попадает введенное число
	private static void printColor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите значение");
		int value = scan.nextInt();
		if (value <= 0) {
			System.out.println("Красный");
		}
		if (0 < value && value <= 100) {
			System.out.println("Желтый");
		}
		if (value > 100) {
			System.out.println("Зеленый");
		}
	}
	// Сравнивает два числа и выводит результат
	private static void compareNumbers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите значения a и b через пробел:");
		String abstr = scan.nextLine();
		int[] arr = Arrays.stream(abstr.split(" ")).mapToInt(Integer::parseInt).toArray();
		if (arr[0] >= arr[1]) {
			System.out.println("a>=b");
		}
		else System.out.println("a<b");
	}
	/*Метод суммирует два введенных числа и проверяет попадает ли сумма в диапазон 10-20 включительно 
	 	возвращает true при попадании в противном случае false*/
	private static boolean sum1020() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите два значения через пробел:");
		String abstr = scan.nextLine();
		int[] arr = Arrays.stream(abstr.split(" ")).mapToInt(Integer::parseInt).toArray();
		if (arr[0] + arr[1] >= 10 && arr[0] + arr[1] <= 20) {
			return true;
		} else return false;
	}
	// Метод проверяет знак числа и выводит сообщение о результатах проверки
	private static void signtest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите значение:");
		int value = scan.nextInt();
		if (value >= 0) {
			System.out.println("Введенное число положительное");
		} else System.out.println("Введенное число отрицательное");
	}
	// Метод проверяет знак введенного числа и возвращает true если оно отрицательное, false - положительное
	private static boolean signtest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите значение:");
		int value = scan.nextInt();
		if (value >= 0) {
			return false;
		} else return true;
	}
	// Метод получает на вход строку и выводит ее заданное число раз
	private static void stringpop() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите строку:");
		String str = scan.nextLine();
		System.out.println("Введите число повторений строки:");
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println(str);
		}
	}
	// Метод осуществляющий проверку високосности года
	private static boolean leapYear() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите год:");
		int value = scan.nextInt();
		if (value % 100 == 0 && value % 400 == 0 || value % 4 == 0 && value % 100 != 0) {
			return true;
		}
		return false;
	}
	/* Метод принимает от пользователя массив нулей и единиц после чего осуществляет замену 0 на 1 и 1 на 0
		возвращая полученный массив
	 */
	private static int[] binReplace() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите массив из 0 и 1 через пробел:");
		String arrstr = scan.nextLine();
		int[] arr = Arrays.stream(arrstr.split(" ")).mapToInt(Integer::parseInt).toArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				arr[i] = 0;
			}
			else if (arr[i] == 0) {
				arr[i] = 1;
			}
		}
		return arr;
	}
	// Метод генерирует массив со значениями от 1 до 100
	private static int[] arr100() {
		int[] arr;
		arr = new int [100];
		for (int i = 0; i < 100; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}
	// Использует массив данный в задании ищет все значения меньше 6 умножает их на 2 и возврашает массив.
	private static int[] arrayPop6() {
		int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 6) {
				arr[i] = arr[i] * 2;
			}
		}
		return arr;
	}
	/* Метод осуществляет генерацию случайной квадратной матрицы по введенному порядку после чего
	 	заменяет все значения диагоналей на единицы.
	 */
	private static int[][] squareMatrix() {
		int[][] arr;
		System.out.println("Введите порядок матрицы:");
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		arr = new int[L][L];
		Random random = new Random();
		for (int i =0; i < L; i++) {
			for (int j = 0; j < L; j++) {
				arr[i][j] = random.nextInt(50);
			}
		}
		for (int i = 0; i < L; i++) {
			for (int j = 0; j < L; j++) {
				if (i==j) {
					arr[i][j] = 1;
					arr[i][L-(1 + j)] = 1;
				}
			}
		}
		return arr;
	}
	// Метод строит одномерный массив по введенной длинне и значению которое будет выведено в массив
	private static int[] massiv(int len, int initialValue) {
		int[] arr;
		arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = initialValue;
		}
		return arr;
	}
}
