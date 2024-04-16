public class Dispatcher {
    public static void main(String[] args) {
      ControllerAndView cav = new ControllerAndView();
      ShapesModel s = new ShapesModel(4, 2);
      cav.printLeftParallelogram(s);
    }
  }

  