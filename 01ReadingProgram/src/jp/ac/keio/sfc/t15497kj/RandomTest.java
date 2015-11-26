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

import java.util.Date;
import java.util.Random;

public class RandomTest {
    public static void main(String argv[]) {
        Date now = new Date(); // Date クラスのインスタンスを生成
        long seed = now.getTime(); // 現在時刻のエポックタイムからランダムのシードを得る
        Random random = new Random(seed); // Random クラスのインスタンスを生成
        double[] randoms = new double[10]; // 要素数10の配列を宣言

        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = random.nextDouble();
        }

        double sum = 0.0; // 次で回すforループの中で得た乱数を格納しておく変数を宣言
        // 配列の長さは 配列変数名.length でとれる
        for (int i = 0; i < randoms.length; i++) {
            /* 配列の0番目の要素から9番目の要素まで合計する */
            sum += randoms[i]; // sum = sum + randoms[i]; と同じ
        }

        double average = sum / 10; // 乱数の平均値を得る
        if (average >= 0.5) { // 乱数の平均値が0.5以上なら絶好調を出力
            System.out.println("絶好調!");
        } else { // 0.5より小さいときは絶不調を出力
            System.out.println("絶不調orz");
        }
    }
}
