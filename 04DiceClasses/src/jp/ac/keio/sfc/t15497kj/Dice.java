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

import java.util.Random;

public class Dice {
    private Random random;
    private int value;

    public Dice() {
        random = new Random();
    }

    public Dice(int value) {
        this();
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        value = Integer.remainderUnsigned(random.nextInt(), 6) + 1;
    }
}
