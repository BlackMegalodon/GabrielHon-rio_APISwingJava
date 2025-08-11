import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.*;
import java.awt.event.*;

public class CadastroUsuario {
    public static void main(String[] args) {
        // Cria a janela principal
        JFrame janela = new JFrame("Cadastro de Usuário");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // termina a execução ao fechar a janela
        janela.setLocationRelativeTo(null); // centraliza a janela
        janela.setLayout(new FlowLayout()); // Seta um Layout para a Janela
        // Cria o rotulo e caixa de texto para o nome
        JLabel nomeLabel = new JLabel("Nome");
        JTextField nomeTextField = new JTextField("Digite seu Nome");
        // Cria o rotulo e caixa de texto para o E-mail
        JLabel emailLabel = new JLabel("E-mail");
        JTextField emailTextField = new JTextField("Digite seu E-mail");
        // Cria o rotulo e caixa de texto para a idade
        JLabel idadeLabel = new JLabel("Idade");
        JTextField idadeTextField = new JTextField("Digite sua Idade");
        // Cria um Botão para cadastro
        JButton cadastroButton = new JButton("Cadastro");
        // Adiciona uma função ao botão
        cadastroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Pega os dados digitados
                String nome = nomeTextField.getText();
                String email = emailTextField.getText();
                String idade = idadeTextField.getText();
                // Sistam IF para verificar se algum campo está vazio
                if (nome.isEmpty()) {
                    JOptionPane.showMessageDialog(janela, "O Campo Nome está vazio, tente novamente.", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                } else if (email.isEmpty()) {
                    JOptionPane.showMessageDialog(janela, "O Campo E-mail está vazio, tente novamente.", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                } else if (idade.isEmpty()) {
                    JOptionPane.showMessageDialog(janela, "O Campo Idade está vazio, tente novamente.", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                } else
                //mostra a mensagem final caso tudo estiver de acordo
                    JOptionPane.showMessageDialog(janela, "Usuário Cadastrado:\n" + "Nome: " + nome + "\n" + "E-mail: "
                            + email + "\n" + "Idade:" + idade);
            }
        });
        JRadioButton mascJRadioButton = new JRadioButton("Masculino");
        JRadioButton femJRadioButton = new JRadioButton("Feminino");

        janela.add(nomeLabel);
        janela.add(nomeTextField);
        janela.add(emailLabel);
        janela.add(emailTextField);
        janela.add(idadeLabel);
        janela.add(idadeTextField);
        janela.add(mascJRadioButton);
        janela.add(femJRadioButton);
        janela.add(cadastroButton);

        janela.setVisible(true);

    }
}
