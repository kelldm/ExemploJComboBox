package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel =new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("Selecione um mês: ");
        panel.add(label);

        String [] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho","Agosto", "Setembro", "Outubro", "Novembro", "Devembro"
        };
        JComboBox<String> comboBox = new JComboBox<>(meses);
        panel.add(comboBox);

        JButton button = new JButton("Exibir Mês Selecionado");
        panel.add(button);

        JTextField textField = new JTextField(15);
        panel.add(textField);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Obtém o mes selecionado
                String mesSelecionado = (String) comboBox.getSelectedItem();

                //Exibe o mes na caixa
                textField.setText("Mês selecionado: "+ mesSelecionado);
            }
        });
        frame.setVisible(true);
    }


}