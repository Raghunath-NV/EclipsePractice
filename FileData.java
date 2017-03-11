import java.io.*;

class FileData {
	
	public static void main(String a[]) throws IOException {

		String str = "All the best!";

		String data = "Play the puzzle on any device. Your progress is automatically synced, so you never miss a clue. Enjoy 20 years of NYTimes crosswords archives, including more than 1,000 Monday puzzles. Solve in minutes with our bite-size Mini and Midi puzzles. Subscribers have access to the entire Mini archive.";

		FileWriter fileWriter = new FileWriter("temp.txt");
		fileWriter.write(data);

		fileWriter.close();


	}


}