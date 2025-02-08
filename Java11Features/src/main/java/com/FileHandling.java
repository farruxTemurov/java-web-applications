package com;

import java.nio.file.*;

public class FileHandling {
	public static void main(String[] args) {
		try {
			// Step 1: Read the original file content
			Path inputPath = Path.of("sample.txt");
			String content = Files.readString(inputPath);

			// Print the original file content
			System.out.println("📂 Original File Content (sample.txt):\n" + content);

			// Step 2: Convert content to uppercase
			String modifiedContent = content.toUpperCase();

			// Step 3: Write the modified content to a new file
			Path outputPath = Path.of("output.txt");
			Files.writeString(outputPath, modifiedContent);

			// Step 4: Read and print the modified file content
			String outputContent = Files.readString(outputPath);
			System.out.println("\n📂 Processed File Content (output.txt):\n" + outputContent);

			// Step 5: Print completion message
			System.out.println("\n✅ File processing complete!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
