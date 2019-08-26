package com.rado;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.rado.contracts.Article;
import com.rado.core.ArticleImpl;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] articleData = scanner.nextLine().split(" ");
		
		Article article = new ArticleImpl(articleData[0], articleData[1], articleData[2]);
		
		int commandsCount = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < commandsCount; i++) {
			List<String> commandData = Stream.of(scanner.nextLine().split(" "))
					.collect(Collectors.toList());
			
			switch (commandData.get(0)) {
			case "Edit:":
				commandData.remove(0);
				article.edit(String.join(" ", commandData));
				break;
			case "ChangeAuthor:":
				commandData.remove(0);
				article.changeAuthor(String.join(" ", commandData));
				break;
			case "Rename:":
				commandData.remove(0);
				article.rename(String.join(" ", commandData));
				break;

			default:
				break;
			}
		}
		
		scanner.close();
		
		System.out.println(article.toString());
	}

}
