package cursojava.executaveis;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class TerceiroProgramaJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno");
		String idade = JOptionPane.showInputDialog("Qual a idade");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimeto");
		String rg = JOptionPane.showInputDialog("Registro Geral");
		String cpf = JOptionPane.showInputDialog("Qual o CPF");
		String mae = JOptionPane.showInputDialog("Nome da mãe");
		String pai = JOptionPane.showInputDialog("Nome do Pai");
		String dataMatricula = JOptionPane.showInputDialog("Data da Matricula");
		String serie = JOptionPane.showInputDialog("Qual a serie");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da Escola");
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(nomeEscola);
		
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota1(Double.parseDouble(nota2));
		aluno1.setNota1(Double.parseDouble(nota3));
		aluno1.setNota1(Double.parseDouble(nota4));
		
		aluno1.setDisciplina1(disciplina1);
		aluno1.setDisciplina2(disciplina2);
		aluno1.setDisciplina3(disciplina3);
		aluno1.setDisciplina4(disciplina4);
		
		
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Data de Nascimento  é = " + aluno1.getDataNascimento());
		System.out.println("RG é = " + aluno1.getRegistroGeral());
		System.out.println("CPF é = " + aluno1.getNumeroCpf());
		System.out.println("Mãe é = " + aluno1.getNomeMae());
		System.out.println("Pai é = " + aluno1.getNomePai());
		System.out.println("Matricula é = " + aluno1.getDataMatricula());
		System.out.println("Serie é = " + aluno1.getSerieMatriculado());
		System.out.println("Escola é = " + aluno1.getNomeEscola());

		System.out.println("******************************************");
		
		System.out.println(aluno1.toString());

		System.out.println("******************************************");

		
		System.out.println("Minha média é = " + aluno1.getMediaNOta());
		System.out.println("Aluno esta  = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Aluno esta  = " + aluno1.getAlunoAprovado2());
		
		System.out.println("******************************************");

		aluno2.setNome("Leandro Marques aluno2");
		aluno2.setIdade(41);
		aluno2.setDataNascimento("18/07/1982");
		aluno2.setRegistroGeral("7 748.849-9");
		aluno2.setNumeroCpf("039.791.379-61");
		aluno2.setNomeMae("Marlene Marques aluno2");
		aluno2.setNomePai("Antonio Marques aluno2");
		aluno2.setDataMatricula("10/10/20221");
		aluno2.setSerieMatriculado("5 Seria aluno2");
		aluno2.setNomeEscola("Escola Joao XXIII aluno2");
		
		System.out.println("Nome é = " + aluno2.getNome());
		System.out.println("Idade é = " + aluno2.getIdade());
		System.out.println("Data de Nascimento  é = " + aluno2.getDataNascimento());
		System.out.println("RG é = " + aluno2.getRegistroGeral());
		System.out.println("CPF é = " + aluno2.getNumeroCpf());
		System.out.println("Mãe é = " + aluno2.getNomeMae());
		System.out.println("Pai é = " + aluno2.getNomePai());
		System.out.println("Matricula é = " + aluno2.getDataMatricula());
		System.out.println("Serie é = " + aluno2.getSerieMatriculado());
		System.out.println("Escola é = " + aluno2.getNomeEscola());
		
		aluno1.setNome("Leandro");
		aluno2.setNome("Leandros");
		
		if (aluno1.equals(aluno2)) {
			
			System.out.println("Alunos são iguais");
		} else {
			System.out.println("Alunos não são iguais");
		}

	}

}
