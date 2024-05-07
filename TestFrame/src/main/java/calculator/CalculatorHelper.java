package calculator;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

public class CalculatorHelper {
   private List<IntExpresion> expresionList ;
   //要生成的算式数量
   private int CalculatorSum;
   //生成算式的运算数范围
   private int MaxNum;
    /**
     * 代表支持几种运算
     * Add----加法
     * AddSub----加减法
     * AddSubMul----加减乘法
     * All----加减乘除法
     */
    public enum Model{Add,AddSub,AddSubMul,All};
   private final Model model;
    public CalculatorHelper(int calculatorSum, int maxNum,Model m) {
        expresionList = new ArrayList<>();
        CalculatorSum = calculatorSum;
        MaxNum = maxNum;
        this.model = m;
    }
//生成随机表达式
    public void generateExpression(){
       while (this.RemoveSame()){
           if (this.model == Model.Add) {
               generateAddExpression();
           } else if (this.model == Model.AddSub) {
              generateSpecial(new Random().nextInt(2));
           } else if (this.model == Model.AddSubMul) {
               generateSpecial(new Random().nextInt(3));
           }else{
               generateSpecial(new Random().nextInt(4));
           }
       }
   }

    /**
     * 生成随机算式
     * @param ope 随机算式种子
     */
   public void generateSpecial(int ope){
       while (this.RemoveSame()){
           generateNumber(ope);
       }
   }
    public void generateNumber(int ope) {
       switch (ope){
           case 0:
               generateAddExpression();
               break;
           case 1:
               generateSubtraction();
               break;
           case 2:
               generateMulty();
               break;
           case 3:
               generateDivision();
               break;
           default:
               break;
       }
    }





    public void generateSubtraction() {
        int left = new Random().nextInt(this.MaxNum);
        int right = new Random().nextInt(left+1);
        IntExpresion exp2 = new IntExpresion(left,right,'-');
        this.expresionList.add(exp2);
    }

    public void generateAddExpression() {
        int left = new Random().nextInt(this.MaxNum);
        int right = this.MaxNum - left;
        IntExpresion exp1 = new IntExpresion(left,right,'+');
        this.expresionList.add(exp1);
    }

    public void generateMulty() {
        int left = new Random().nextInt(1,this.MaxNum);
        int right = this.MaxNum/left;
        IntExpresion exp3 = new IntExpresion(left,right,'*');
        this.expresionList.add(exp3);
    }

    public void generateDivision() {
        int left = new Random().nextInt(this.MaxNum);
        int right = this.MaxNum - left;
        IntExpresion exp4 = new IntExpresion(left,right, '/');
        this.expresionList.add(exp4);
    }

    public void DispExp(){
        for (int i = 0; i < this.expresionList.size(); i++) {
            this.expresionList.get(i).printExpresion(i+1);
            if((i+1)%10==0){
                System.out.println();
            }
        }
    }
    /**
     * 给表达式去重
     *
     * @return 时候生成足够表达式
     */
    public boolean RemoveSame(){
        LinkedHashSet<IntExpresion> expresionLinkedHashSet = new LinkedHashSet<>(expresionList);
        expresionList = new ArrayList<>(expresionLinkedHashSet);
        return expresionLinkedHashSet.size()<this.CalculatorSum;
    }

}
