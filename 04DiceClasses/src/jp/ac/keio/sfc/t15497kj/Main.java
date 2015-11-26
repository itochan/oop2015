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

public class Main {

    public static void main(String[] args) {
        Fortune f = new Fortune("jin", 1975, 5, 21);

        System.out.println("名前: " + f.getName());
        System.out.println("生年月日: " + f.getYear() + "年" + f.getMonth() + "月" + f.getDate() + "日");
        System.out.println("誕生日占い: " + f.getBirthdayUranai());
    }
}
