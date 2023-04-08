public class BmiService {

    public int myIndex(int weight, double height) {
        int myIndex; //создаю целый тип переменной myIndex чтобы потом дробный тип превратить в целый
        double index; //создаю дробный тип переменной индекс
        index = weight / (height * height); //формула для рассчета Индекса Массы Тела(дробный тип)
        myIndex = (int) index; //получаю целый ИМТ
        return myIndex;
    }

}
