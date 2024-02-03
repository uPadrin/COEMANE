package com.mewtow.cardProcessor;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CardProcessorApplication {

	public static void main(String[] args)  {
		SpringApplication.run(CardProcessorApplication.class, args);
	}
		/* String fileName = "input-data.csv";
		CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
		try(CSVReader reader = new CSVReaderBuilder(
				new FileReader(fileName))
				.withCSVParser(csvParser)
				.build()){
			List<String[]> r = reader.readAll();
			r.forEach(x -> System.out.println(Arrays.toString(x)));

			}
		}*/
	}

