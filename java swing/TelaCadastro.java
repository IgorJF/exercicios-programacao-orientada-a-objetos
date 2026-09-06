import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;

public class TelaCadastro {
    private JFrame frame;
    private JLabel lblCopa;
    private JLabel lblNome;
    private JLabel lblTitulos;
    private JLabel lblTecnico;
    private JTextField txtNome;
    private JTextField txtTitulos;
    private JTextField txtTecnico;
    private JButton btnCadastrar;
    private JButton btnPesquisar;
    private JButton btnListar;
    private JButton btnLimpar;
    private JButton btnSair;
    private JTextArea areaSelecoes;
    private JScrollPane scrollPane;
    private Copa2026 copa;

    public TelaCadastro() {
        copa = new Copa2026();

        frame = new JFrame("Copa 2026");
        frame.setSize(950, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        lblCopa = new JLabel("COPA 2026");
		lblCopa.setBounds(425, 10, 100, 25);
		frame.add(lblCopa);

		lblNome = new JLabel("Nome:");
		lblNome.setBounds(20, 40, 120, 25);
		frame.add(lblNome);

		txtNome = new JTextField(20);
		txtNome.setBounds(20, 70, 250, 25);
		frame.add(txtNome);

		lblTitulos = new JLabel("Número de Títulos:");
		lblTitulos.setBounds(300, 40, 150, 25);
		frame.add(lblTitulos);

		txtTitulos = new JTextField(5);
		txtTitulos.setBounds(300, 70, 250, 25);
		frame.add(txtTitulos);

		lblTecnico = new JLabel("Técnico:");
		lblTecnico.setBounds(580, 40, 120, 25);
		frame.add(lblTecnico);

		txtTecnico = new JTextField(20);
		txtTecnico.setBounds(580, 70, 250, 25);
		frame.add(txtTecnico);

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(20, 110, 120, 30);
		btnCadastrar.addActionListener(e -> cadastrar());
		frame.add(btnCadastrar);

		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(150, 110, 120, 30);
		btnPesquisar.addActionListener(e -> pesquisar());
		frame.add(btnPesquisar);

		btnListar = new JButton("Listar Seleções");
		btnListar.setBounds(300, 110, 180, 30);
		btnListar.addActionListener(e -> listar());
		frame.add(btnListar);

		btnLimpar = new JButton("Limpar Campos");
		btnLimpar.setBounds(500, 110, 150, 30);
		btnLimpar.addActionListener(e -> limparCampos());
		frame.add(btnLimpar);

		btnSair = new JButton("Sair");
		btnSair.setBounds(670, 110, 120, 30);
		btnSair.addActionListener(e -> System.exit(0));
		frame.add(btnSair);

		areaSelecoes = new JTextArea(15, 70);
		areaSelecoes.setEditable(false);

		scrollPane = new JScrollPane(areaSelecoes);
		scrollPane.setBounds(20, 170, 810, 300);
		frame.add(scrollPane);

        frame.setVisible(true);
    }
	
	private void cadastrar() {
		try{
			String nome = txtNome.getText();
			int titulos = Integer.parseInt(txtTitulos.getText());
			String tecnico = txtTecnico.getText();
			Selecao selecao = new Selecao(nome, titulos, tecnico);
			copa.adicionarSelecao(selecao);
			listar();
		} 
		catch(NumeroDeTitulosInvalidoException e){
			JOptionPane.showMessageDialog(frame, "O numero de titulos esta menor que zero", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void pesquisar(){
		String nome = txtNome.getText();
		Selecao selecao = copa.pesquisarSelecao(nome);

		if (selecao == null){
			JOptionPane.showMessageDialog(frame, "Selecao nao encontrada.");
		} 
		else {
			areaSelecoes.setText("Seleção: " + selecao.getNome() + " | Títulos: "+ selecao.getTitulos() + " | "+ "Tecnico: " + selecao.getTecnico() + "\n");
		}
	}

	private void listar(){
		areaSelecoes.setText("");
		for (Selecao s : copa.listarSelecoes()){
			areaSelecoes.append("Seleção: " + s.getNome() + " | Títulos: " + s.getTitulos() + " | "+ "Tecnico: " + s.getTecnico() + "\n");
		}
	}

	private void limparCampos(){
		txtNome.setText("");
		txtTitulos.setText("");
		txtTecnico.setText("");
	}
}