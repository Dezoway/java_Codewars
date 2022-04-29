import javax.lang.model.type.NullType;
import java.sql.Array;
import java.util.*;

class Stack{
    private int last_Index = -1;
    private char[] symbols;

    Stack(int size){
        this.symbols = new char[size];
    }

    public void showSize(){
        System.out.println("Размер пространства стека: "+symbols.length);
        int counter = 0;
        for(int x = 0; x != symbols.length;x++){
            if(Character.isLetter(symbols[x])){
                counter++;
            }
        }
        System.out.println("Размер занятого пространства: "+counter);
        pressButton();
    }
    int sizeOf(){
        return symbols.length;
    }

    public void push(char i ){
        if(last_Index != symbols.length-1){
            symbols[last_Index+1] = i;
            last_Index++;
            System.out.println("Элемент успешно добавлен.");
            pressButton();
        }
        else{
            System.out.println("Стек заполнен.");
            pressButton();

        }
    }

    public void put(){
        if(last_Index != -1){
            char k = symbols[last_Index];
            char[] symbols2 = new char[symbols.length-2];
            for(int x = 0; x != symbols.length-2;x++){
                symbols2[x] = symbols[x];
            }
            symbols = symbols2.clone();
            symbols2 = null;
            System.out.println("Символ "+k+" успешно удалён из стэка");
            pressButton();
        }else{
            System.out.println("Стэк пуст.");
            pressButton();
        }

    }

    protected void pressButton(){
        System.out.print("Нажмите любую клавишу для продолжения...");
        try{
            System.in.read();
        }
        catch (Exception e) {};
    }



}
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack stack = null;
        int choice;
        while(1 != 0){
            System.out.flush();
            System.out.println("1. Создать стэк");
            System.out.println("2. Добавить элемент в стэк");
            System.out.println("3. Просмотр размера стэка");
            System.out.println("4. Удалить элемент из стека");
            System.out.println("5. Выход из программы");
            System.out.println("Введите команду:");
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.flush();
                    if (stack == null) {
                        System.out.print("Введите размер стека: ");
                        stack = new Stack(scanner.nextInt());
                        System.out.println("Стэк создан.");
                        stack.pressButton();
                    } else {
                        System.out.println("Стэк уже создан");
                        stack.pressButton();
                    }
                    break;
                case 2:
                    System.out.flush();
                    if (stack != null){
                        System.out.print("Введите символ:");
                        stack.push(scanner.next().charAt(0));
                    }else{
                        System.out.println("Стэк не создан.");
                    }break;
                case 3:
                    System.out.flush();
                    if (stack != null){
                        stack.showSize();
                    }else{
                        System.out.println("Стэк не создан");
                    }break;
                case 4:
                    System.out.flush();
                    stack.put();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.flush();
                    System.out.println("Неверная команда.");
            }

        }

    }
}