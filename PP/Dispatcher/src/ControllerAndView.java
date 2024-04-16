import java.util.Scanner;

public class ControllerAndView {
  void printPoint() {
    System.out.print("*");
  }

  void printSpace() {
    System.out.println();
  }

  void printFirstTriangle(ShapesModel s) {
    for (int row = 0; row < s.line; row++) {
      for (int col = 0; col < 1 + row; col++) {
        printPoint();
      }
      printSpace();
    }
  }

  void printSecondTriangle(ShapesModel s) {
    for (int row = 0; row < s.line; row++) {
      for (int col = 0; col < s.line - row; col++) {
        printPoint();
      }
      printSpace();
    }
  }

  void printThirdTriangle(ShapesModel s) {
    for (int row = 0; row < s.line; row++) {
      for (int col = 0; col < s.line; col++) {
        if (col < row) {
          System.out.print(" ");
        } else {
          printPoint();
        }
      }
      printSpace();
    }
  }

  void printFourthTriangle(ShapesModel s) {
    for (int row = 0; row < s.line; row++) {
      for (int col = 0; col < s.line - row - 1; col++) {
        System.out.print(" ");
      }
      for (int col = 0; col < row + 1; col++) {
        printPoint();
      }
      printSpace();
    }
  }

  void printFifthTriangle(ShapesModel s) {
    for (int row = 0; row < s.line; row++) {
      for (int col = 0; col < s.line; col++) {
        printPoint();
      }
      printSpace();
    }
  }

  void printHorizontalTriangle(ShapesModel s) {
    s.shift = s.line * 2;
    for (int row = 0; row < s.line; row++) {
      for (int col = 0; col < s.line - row; col++) {
        System.out.print(" ");
      }
      for (int col = 0; col < row * 2 + 1; col++) {
        printPoint();
      }
      printSpace();
    }
    printSpace();
  }

  void printTrapezoidHorizontal(ShapesModel s) {
    s.shift = s.line * 2;
    for (int row = 5; row < s.shift; row++) {
      for (int col = 0; col < s.shift - row; col++) {
        System.out.print(" ");
      }
      for (int col = 0; col < 2 * row; col++) {
        printPoint();
      }
      printSpace();
    }
    printSpace();
  }

  void printLeftTriangle(ShapesModel s) {
    printFirstTriangle(s);
    printSecondTriangle(s);
  }

  void printLeftParallelogram(ShapesModel s) {
    printFirstTriangle(s);
    printThirdTriangle(s);
  }

  void printRightTriangle(ShapesModel s) {
    for (int row = 0; row < s.line - 1; row++) {
      for (int col = 0; col < s.line - row - 1; col++) {
        System.out.print(" ");
      }
      for (int col = 0; col <row + 1; col++) {
        printPoint();
      }
      printSpace();
    }
    printThirdTriangle(s);
  }

  void printRightParallelogram(ShapesModel s) {
    for (int row = 0; row < s.line - 1; row++) {
      for (int col = 0; col < s.line - row - 1; col++) {
        System.out.print(" ");
      }
      for (int col = 0; col < row + 1; col++) {
        printPoint();
      }
      printSpace();
    }
    printSecondTriangle(s);
  }

  void printLeftTrapezoid(ShapesModel s) {
    printFirstTriangle(s);
    printFifthTriangle(s);
    printSecondTriangle(s);
  }

  void printLeftParallelogramWithRectangle(ShapesModel s) {
    printFirstTriangle(s);
    printFifthTriangle(s);
    printThirdTriangle(s);
  }

  void printRightTrapezoid(ShapesModel s) {
    printFourthTriangle(s);
    printFifthTriangle(s);
    printThirdTriangle(s);
  }

  void printRightParallelogramWithRectangle(ShapesModel s) {
    printFourthTriangle(s);
    printFifthTriangle(s);
    printSecondTriangle(s);
  }

  void printWood(ShapesModel s) {
    int count = 2;
    for(int i = 0; i < count; i ++) {
      printPoint();
    }
  }

  void printTree(ShapesModel s) {
    int count = 3;
    for(int a = 0; a < count; a++) {
      for(int i = 0; i < s.line + a; i++) {
        for(int k = 0; k < s.shift + s.line - i - 1; k++) {
          System.out.print(" ");
        }
        for(int j = 0; j < i * 2 + 1; j++) {
          printPoint();
        }

        printSpace();
      }
    }
    for(int d = 0;d < s.line;d++) {
      System.out.print(" ");
    }
    printWood(s);
    printSpace();
  }
}