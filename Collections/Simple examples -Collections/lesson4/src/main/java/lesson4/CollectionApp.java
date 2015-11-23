package lesson4;

import java.util.ArrayList;

public class CollectionApp {
 
    public static void main(String[] args) {
         
        ArrayList<String> states = new ArrayList<String>();
        // ������� � ������ ��� ���������
        states.add("��������");
        states.add("�������");
        states.add("��������������");
        states.add("�������");
        states.add(1, "������"); // ��������� ������� �� ������� 1
         
        System.out.println(states.get(1));// �������� 2-� ������
        states.set(1, "�����"); // ��������� ������ �������� ��� 2-�� �������
         
        System.out.printf("� ������ %d ��������� \n", states.size());
        for(String state : states){
         
            System.out.println(state);
        }
         
        if(states.contains("��������")){
         
            System.out.println("������ �������� ����������� ��������");
        }
         
        // ������ ��������� ��������
        states.remove("��������");
        states.remove(0);
         
        Object[] countries = states.toArray();
        for(Object country : countries){
         
            System.out.println(country);
        }
    } 
}
