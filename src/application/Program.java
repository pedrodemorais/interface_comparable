package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {

		String caminho = "C:\\Temp\\pedro.csv";
		List<Funcionarios> listaNomes = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

			String linha = br.readLine();

			while (linha != null) {
				String[] campos = linha.split(",");
				listaNomes.add(new Funcionarios(campos[0], Double.parseDouble(campos[1])));
				linha = br.readLine();

			}

			Collections.sort(listaNomes);// ordenando a lista
			for (Funcionarios func : listaNomes) {
				System.out.println(func.getNome() + "," + func.getSalary());

			}

		} catch (IOException e) {
			System.out.println("Erro:" + e.getMessage());

		}

	}

}
