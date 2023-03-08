package com.twcch.test.operandandoperator;

import java.util.Scanner;

public class ExpressionAndOperandAndOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        /*
         * 陳述: int b = a + 2;
         * 表達式(expression): a + 2;
         * 運算元(operand): b, a, 2
         * 運算子(operator): =, +
         *
         * 表達式結合順序:
         * 1. 括號: ()
         * 2. 一元運算子: !, ++, --
         * 3. 乘除: *, /, %
         * 4. 加減: +, -
         * 5. 比大小: >, <, >=, <=
         * 6. 相等性: ==, !=
         * 7. 邏輯AND: &&
         * 8. 邏輯OR: ||
         * 9. 條件運算子: :?
         * 10. 賦值運算子: +=, -=, *=, /=, %=
         * 相同順序的邏輯:
         * 一元、三元: 右到左結合 e.g. boolean b = !!true; > boolean b = (!(!true)); > b = true
         * 二元賦值運算子: 右到左結合 e.g. int a = 3; int b = 4; int c = a += b += 5; > int c = (a += (b += 5)); > c = 12
         * 其他: 左到右結合 e.g. int a = 3; int b = 4; int c = a + b + 5; > int c = (a + b) + 5; > c = 12
         */
        int b = a + 2;

        System.out.println("b: " + b);

    }

}
