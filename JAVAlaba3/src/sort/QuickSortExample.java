package sort;

import java.util.Arrays;

public class QuickSortExample {

    // ����� ������� ����������
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // ������� ������ �������� ��������
            int pivotIndex = partition(arr, low, high);

            // ���������� ��������� ����� � ������ ����� �������
            quickSort(arr, low, pivotIndex - 1);  // ����� ���������
            quickSort(arr, pivotIndex + 1, high); // ������ ���������
        }
    }

    // ����� ��� ��������� ������� �� ��� �����
    private static int partition(int[] arr, int low, int high) {
        // �������� ��������� ������� � �������� �������� (pivot)
        int pivot = arr[high];
        int i = low - 1; // ������ ������� ���������

        for (int j = low; j < high; j++) {
            // ���� ������� ������� ������ ��� ����� ��������
            if (arr[j] <= pivot) {
                i++;
                // ������ ������� arr[i] � arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.println("�������� ������11: " + Arrays.toString(arr));
        }

        // ������ ������� ������� �� ���������� �������
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // ���������� ������ �������� ��������
    }
}
