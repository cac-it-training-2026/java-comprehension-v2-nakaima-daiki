package q02_advanced.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	public String inputString() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String inputString = reader.readLine();

		return inputString;
	}

	public int inputNum() throws IOException, NumberFormatException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String numString = reader.readLine();
		int inputNum = Integer.parseInt(numString);

		return inputNum;

	}

}
