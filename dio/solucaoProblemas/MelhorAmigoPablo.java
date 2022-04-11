package dio.solucaoProblemas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MelhorAmigoPablo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linha = br.readLine();
		List<Participante> participantes = new ArrayList<>();

		while (!linha.equals("FIM")) {
			var participante = new Participante();
			var entrada = linha.split(" ");
			participante.setNome(entrada[0]);
			participante.setAmigo(entrada[1].equals("SIM"));
			participante.setOrdemInscricao(participantes.size());
			var participanteExistente = participantes.stream()
					.filter(p -> p.getNome().equals(participante.getNome()))
					.findFirst()
					.orElse(null);

			if (participanteExistente == null) {
				participantes.add(participante);
			}
			linha = br.readLine();
		}

		var participantesOrdenados = participantes.stream().sorted(Comparator
				.comparing(Participante::isAmigo).reversed()
				.thenComparing(Participante::getNome)).collect(Collectors.toList());

		participantesOrdenados.forEach(p -> {
			if (!p.getNome().equals("Abhay")) {
				System.out.println(p.getNome());
			}
		});

		List<Participante> amigos = participantesOrdenados.stream().filter(Participante::isAmigo)
				.collect(Collectors.toList());
		Participante escolhido = null;

		for (Participante p : amigos) {
			if (escolhido == null) {
				escolhido = p;
			} else if (escolhido.getNome().length() < p.getNome().length()) {
				escolhido = p;
			} else if (escolhido.getNome().length() == p.getNome().length()
					&& escolhido.getOrdemInscricao() > p.getOrdemInscricao()) {
				escolhido = p;
			}
		}

		System.out.println("");
		System.out.println("Amigo do Pablo:");
		System.out.println(escolhido.getNome());
	}

	public static class Participante {
		private String nome;
		private boolean amigo;
		private int ordemInscricao;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public boolean isAmigo() {
			return amigo;
		}

		public void setAmigo(boolean amigo) {
			this.amigo = amigo;
		}

		public int getOrdemInscricao() {
			return ordemInscricao;
		}

		public void setOrdemInscricao(int ordemInscricao) {
			this.ordemInscricao = ordemInscricao;
		}

		@Override
		public String toString() {
			return nome;
		}
	}

	// "_______________________________________________________________"
	// String[] p = { "Joao NAO", "Carlos SIM", "Abner NAO", "Samuel SIM", "Ricardo
	// NAO", "Abhay SIM", "Samuel SIM",
	// "Andres SIM", "Roberto NAO", "Carlos SIM", "Samuel SIM", "Samuel SIM", "Abhay
	// SIM", "Aline SIM",
	// "Andres SIM", "FIM" };
	//
	// // Scanner scr = new Scanner(System.in);
	// String word;
	// String name = "";
	// String pass = "";
	// String vencedor = "";
	// int qtd = 1;
	//
	// TreeMap<String, Integer> friends = new TreeMap<>();
	// TreeMap<String, Integer> friendsNot = new TreeMap<>();
	//
	// for (int i = 0; i < p.length; i++) {
	// word = p[i];
	// // }
	//
	// // while (!(word = scr.nextLine()).equalsIgnoreCase("fim")) {
	//
	// for (int k = 0; k < word.length(); k++) {
	// String letra = String.valueOf(word.charAt(k));
	//
	// if (letra.equals(" ") || k == word.length() - 1) {
	// name = word.substring(0, k);
	// pass = word.substring(k + 1, word.length());
	// if (!name.equalsIgnoreCase("pablo") && pass.equalsIgnoreCase("sim") &&
	// !friends.containsKey(name)) {
	// if (vencedor.isEmpty()) {
	// vencedor = name;
	// }
	// name = name.trim().replaceAll(" +", "");
	// friends.put(name, qtd);
	// }
	// if (!name.equalsIgnoreCase("pablo") && pass.equalsIgnoreCase("nao") &&
	// !friends.containsKey(name)) {
	// friendsNot.put(name, qtd);
	// }
	// break;
	// }
	//
	// }
	//
	// }
	//
	// for (Entry<String, Integer> key : friends.entrySet()) {
	// System.out.println(key.getKey());
	// }
	// for (Entry<String, Integer> key : friendsNot.entrySet()) {
	// System.out.println(key.getKey());
	// }
	// System.out.println("");
	// System.out.println("Amigo do Pablo:");
	// System.out.println(vencedor);

	// }

	// "_______________________________________________________________"

	// String[] p = { "Joao NAO", "Carlos SIM", "Abner NAO", "Samuel SIM", "Ricardo
	// NAO", "Abhay SIM", "Samuel SIM",
	// "Andres SIM", "Roberto NAO", "Carlos SIM", "Samuel SIM", "Samuel SIM", "Abhay
	// SIM", "Aline SIM",
	// "Andres SIM", "FIM" };

	// Scanner scr = new Scanner(System.in);
	// String word;
	// String name = "";
	// String pass = "";
	// String vencedor = "";
	// int qtd = 1;

	// TreeMap<String, Integer> friends = new TreeMap<>();
	// TreeMap<String, Integer> friendsNot = new TreeMap<>();

	// while(!(word=scr.nextLine()).equalsIgnoreCase("fim"))
	// {

	// for (int k = 0; k < word.length(); k++) {
	// String letra = String.valueOf(word.charAt(k));

	// if (letra.equals(" ") || k == word.length() - 1) {
	// name = word.substring(0, k);
	// pass = word.substring(k + 1, word.length());
	// if (!name.equalsIgnoreCase("pablo") && pass.equalsIgnoreCase("sim") &&
	// !friends.containsKey(name)) {
	// if (vencedor.isEmpty()) {
	// vencedor = name;
	// }
	// friends.put(name, qtd);
	// }
	// if (!name.equalsIgnoreCase("pablo") && pass.equalsIgnoreCase("nao") &&
	// !friends.containsKey(name)) {
	// friendsNot.put(name, qtd);
	// }
	// break;
	// }

	// }

	// }

	// for(
	// Entry<String, Integer> key:friends.entrySet())
	// {
	// System.out.println(key.getKey());
	// }for(
	// Entry<String, Integer> key:friendsNot.entrySet())
	// {
	// System.out.println(key.getKey());
	// }System.out.println();System.out.println("Amigo do
	// Pablo:");System.out.println(vencedor);

}
