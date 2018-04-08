package piworks;

public class MaxSum {

	private PrimeNumber p = new PrimeNumber();

	public int maxSum(int arr[][]) {
		for (int i = arr.length - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (i == arr.length - 2) {
					if ((!p.primeNumber(arr[i + 1][j])) && (arr[i + 1][j] > arr[i + 1][j + 1]))
						arr[i][j] += arr[i + 1][j];
					else if (!p.primeNumber(arr[i + 1][j + 1]))
						arr[i][j] += arr[i + 1][j + 1];

				} else {
					if (!p.primeNumber(arr[i][j])) {// Üst eleman asal mı değil mi
						if (arr[i + 1][j] > arr[i + 1][j + 1])
							arr[i][j] += arr[i + 1][j];
						else
							arr[i][j] += arr[i + 1][j + 1];
					}

				}
				//System.out.println(arr[i][j]);
			}

		}
		return arr[0][0];
	}

}
