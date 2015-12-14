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

public class ShakingFrame extends JFrame {
    public void shake() {
        setLocationRelativeTo(null);
        setVisible(true);
        Point point = getLocationOnScreen();

        int j = 0;
        boolean bound = true;
        for (int i = 0; i < 1000; i++) {
            if (j == 10) {
                bound = false;
            } else if (j == -10) {
                bound = true;
            }

            setLocation(point.x + j, point.y);

            if (bound) {
                j++;
            } else {
                j--;
            }

            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
