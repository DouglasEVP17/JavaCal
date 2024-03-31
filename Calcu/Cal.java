classe  pública Calculadora {
    public  static  int  soma ( int  num1 , int  num2 ) {
        retornar  num1 + num2 ;
    }

    public  static  int  subtração ( int  num1 , int  num2 ) {
        retornar  num1 - num2 ;
    }

    public  static  int  multiplicação ( int  num1 , int  num2 ) {
        retornar  num1 * num2 ;
    }

    public  static  int  divisão ( int  num1 , int  num2 ) {
        se ( num2 == 0 ) {
            throw  new  IllegalArgumentException ( "Erro: Divisão por zero!" );
        }
        retornar  num1 / num2 ;
    }
}