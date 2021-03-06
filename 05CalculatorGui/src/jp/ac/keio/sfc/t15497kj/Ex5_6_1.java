/*
 * Copyright 2015 Kazunori Jo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.ac.keio.sfc.t15497kj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex5_6_1 {
    public static void main(String argv[]) {
        JFrame window = new JFrame("Calculator");

        JTextField text = new JTextField();
        text.setText("0");
        window.add(text, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] labels = {
                "1", "2", "3", "+",
                "4", "5", "6", "-",
                "7", "8", "9", "*",
                "0", ".", "=", "/"
        };

        for (String label : labels) {
            JButton button = new JButton(label);
            if (label.matches("[0-9]")) {
                button.addActionListener(new NumberButtonActionListener(text, Integer.parseInt(label)));
            }
            panel.add(button, BorderLayout.CENTER);
        }

        window.add(panel, BorderLayout.SOUTH);
        window.pack();
        window.setVisible(true);
    }

    private static class NumberButtonActionListener implements ActionListener {

        private final JTextField textField;
        private final int number;

        public NumberButtonActionListener(JTextField textField, int number) {
            this.textField = textField;
            this.number = number;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String text = textField.getText();
            String setTextString;
            if (text.equals("0")) {
                setTextString = String.valueOf(number);
            } else {
                setTextString = text + number;
            }
            textField.setText(setTextString);
        }
    }
}