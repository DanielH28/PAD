import javax.swing.JOptionPane;
public class Horario{

  public static void main(String[] args) {
    //int[][]  inlgles = new int[3][2];
    int inglesI = 111;
    int algebraL = 112;
    int Taller = 113;
    int estadistica = 114;
    int fundamentos = 115;
    int dibujo= 116;
    int quimica = 117;

    int inglesII = 118;
    int fisica = 119;
    int PCC = 120;
    int calculo = 121;
    int Pavanzada = 122;
    int Resistencia= 123;
    int biologia = 124;

    int inglesIII = 125;
    int electricidad = 126;
    int ecuaciones = 127;
    int Pmetodos =128;
    int mecanica = 129;
    int termodinamica =130;
    int Tselectos = 131;

    int inglesIV= 132;
    int instalaciones=133;
    int analisis = 134;
    int investigacion = 135;
    int metrologia = 136;
    int eolica = 137;
    int bioenergia = 138;

    int inglesV = 139;
    int Ebasica = 140;
    int formulacionB= 141;
    int domotica= 142;
    int ecologiaU=143;
    int transferencia = 144;
    int responsabilidad = 145;


    String semestres =
                  "\n\n Semestres \n" +
                  "CODIGO / SEMESTRE \n\n" +
                  "1 SEMESTRE 1 \n" +
                  "2 SEMESTRE 2 \n" +
                  "3 SEMESTRE 3 \n" +
                  "4 SEMESTRE 4 \n" +
                  "5 SEMESTRE 5 \n" +
                  "6 SEMESTRE 6 \n" +
                  "7 SEMESTRE 7 \n" +
                  "8 SEMESTRE 8 \n" +
                  "9 SEMESTRE 9 \n\n\n" ;

    String semestre1 =
                  "\n\n 1er Semestre \n" +
                  "CODIGO / MATERIA \n\n" +
                  "111 INGLES I \n" +
                  "112 ALGEBRA LINEAL \n" +
                  "113 TALLER DE EXPRESION \n" +
                  "114 PROBABILIDAD Y ESTADISTICA \n" +
                  "115 FUNDAMENTOS DE LA PROGRAMACION\n" +
                  "116 DIBUJO Y DISENO POR COMPUTADORA \n" +
                  "117 QUIMICA \n\n\n" ;
    String semestre2 =
                  "\n\n 2do Semestre \n" +
                  "CODIGO / MATERIA \n\n" +
                  "118 INGLES II \n" +
                  "119 FISICA \n" +
                  "120 PENSAMIENTO CRITICO Y CREATIVO \n" +
                  "121 CALCULO \n" +
                  "122 PROGRAMACION AVANZADA\n" +
                  "123 RESISTENCIA DE MATERIALES \n" +
                  "124 BIOLOGIA \n\n\n" ;
    String semestre3 =
                  "\n\n 3er Semestre \n" +
                  "CODIGO / MATERIA \n\n" +
                  "125 INGLES III \n" +
                  "126 ELECTRICIDAD Y MAGNETISMO \n" +
                  "127 ECUACIONES DIFERENCIALES \n" +
                  "128 PROGRAMACION DE METODOS NUMERICOS \n" +
                  "129 MECANICA DE FLUIDOS\n" +
                  "130 FUNDAMENTOS DE TERMODINAMICA \n" +
                  "131 TOPICOS SELECTOS DE QUIMICA \n\n\n" ;

    String semestre4 =
                  "\n\n 4to Semestre \n" +
                  "CODIGO / MATERIA \n\n" +
                  "132 INGLES IV \n" +
                  "133 INSTALACIONES ELECTRICAS \n" +
                  "134 ANALISIS Y DISEÑOS DE CIRCUITOS ELECTRICOS \n" +
                  "135 INVESTIGACION DE OPERACIONES \n" +
                  "136 METROLOGIA MECANICA Y ELECTRICA\n" +
                  "137 ENERGIA EOLICA \n" +
                  "138 BIOENERGIA \n\n\n" ;
    String semestre5 =
                  "\n\n 5to Semestre \n" +
                  "CODIGO / MATERIA \n\n" +
                  "139 INGLES V \n" +
                  "140 ELECTRONICA BASICA \n" +
                  "141 FORMULACION Y EVALUACION DE PROYECTOS \n" +
                  "142 DOMOTICA \n" +
                  "143 ECOLOGIA URBANA\n" +
                  "144 TRANSFERENCIA DE CALOR \n" +
                  "145 RESPONSABILIDAD SOCIAL Y DESARROLLO SOSTENTABLE \n\n\n" ;




    int day =0;
    int materia= JOptionPane.showConfirmDialog(null,"Aprobaste todas tus materias? \n");
//int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
    if (materia ==JOptionPane.YES_OPTION){
      materia= JOptionPane.showConfirmDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre1);
      //dat=day +1 //acumulador
    //day +=1;//acumulador resumido
  } else if (materia ==JOptionPane.NO_OPTION ){
    //boolean comprobar = true;

    //int sum = 0;
    //while (comprobar == true){
      //sum ++;
      int sem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu semestre actual "+semestres));
      if (sem ==1 ){


      int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu materia repobada por codigo "+semestre1));
      if(value == 111 && 111 == inglesI){
        JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre2+ inglesI+ " INGLES I" );

      }if(value == 112 && 112 == algebraL){
        JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre2+ algebraL+ " ALGEBRA LINEAL" );

      }if(value == 113 && 113 == Taller){
        JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre2+ Taller+ " TALLER DE EXPRESION" );

      }if(value == 114 && 114 == estadistica){
        JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre2+ estadistica+ " PROBABILIDAD Y ESTADISTICA" );

      }if(value == 115 && 115 == fundamentos){
        JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre2+ fundamentos+ " FUNDAMENTOS DE LA PROGRAMACION" );

      }if(value == 116 && 116 == dibujo){
        JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre2+ dibujo+ " DIBUJO Y DISENO POR COMPUTADORA" );

      }if(value == 117 && 117 == quimica){
        JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre2+ quimica+ " QUIMICA" );

      }
    } else if (sem ==2 ){


    int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu materia repobada por codigo "+semestre2));
    if(value == 118 && 118 == inglesII){
      JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre3+ inglesII+ " INGLES II" );

    }if(value == 119 && 119 == fisica){
      JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre3+ fisica+ " FISICA" );

    }if(value == 120 && 120 == PCC){
      JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre3+ PCC+ " PENSAMIENTO CRITICO Y CREATIVO" );

    }if(value == 121 && 121 == calculo){
      JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre3+ calculo+ " CALCULO" );

    }if(value == 122 && 122 == Pavanzada){
      JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre3+ Pavanzada+ " PROGRAMACION AVANZADA" );

    }if(value == 123 && 123 == Resistencia){
      JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre3+ Resistencia+ " RESISTENCIA DE MATERIALES" );

    }if(value == 124 && 124 == biologia){
      JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre3+ biologia+ " BIOLOGIA" );

    }
  }else if (sem ==3 ){


  int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu materia repobada por codigo "+semestre3));
  if(value == 125 && 125 == inglesIII){
    JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre4+ inglesIII+ " INGLES III" );

  }if(value == 126 && 126 == electricidad){
    JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre4+ electricidad+ " ELECTRICIDAD Y MAGNETISMO" );

  }if(value == 127 && 127 == ecuaciones){
    JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre4+ ecuaciones+ " ECUACIONES DIFERENCIALES" );

  }if(value == 128 && 128 == Pmetodos){
    JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre4+ Pmetodos+ " PROGRAMACION DE METODOS NUMERICOS" );

  }if(value == 129 && 129 == mecanica){
    JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre4+ mecanica+ " MECANICA DE FLUIDOS" );

  }if(value == 130 && 130 == termodinamica){
    JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre4+ termodinamica+ " FUNDAMENTOS DE TERMODINAMICA" );

  }if(value == 131 && 131 == Tselectos){
    JOptionPane.showMessageDialog(null,"Tu horario para tu nuevo semestre es \n"+semestre4+ Tselectos+ " TOPICOS SELECTOS" );

  } //comprobar = false;
    //value = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu materia repobada por codigo "+semestre1));
  }
  }
}
}
