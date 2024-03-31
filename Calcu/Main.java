importar  java . útil . Scanner ;

 classe  pública Principal {
    public  static  void  main ( String [] args ) {
        Scanner  leitor = novo  Scanner ( System . in );

        Sistema . fora . print ( "Insira o primeiro número: " );
        int  num1 = leitor . próximoInt ();

        Sistema . fora . print ( "Insira o segundo número: " );
        int  num2 = leitor . próximoInt ();

        Sistema . fora . println ( "Escolha a operação:" );
        Sistema . fora . println ( "DIGITO 1 PARA SOMA" );
        Sistema . fora . println ( "DIGITE 2 PARA SUBTRAÇÃO" );
        Sistema . fora . println ( "DIGITO 3 PARA MULTIPLICAÇÃO" );
        Sistema . fora . println ( "DIGITE 4 PARA DIVISÃO" );
        int  oper = leitor . próximoInt ();

        int  resolução = 0 ;
        switch ( operação ) {
            caso  1 :
                resolucao = Calculadora . soma ( num1 , num2 );
                quebrar ;
            caso  2 :
                resolucao = Calculadora . subtração ( num1 , num2 );
                quebrar ;
            caso  3 :
                resolucao = Calculadora . multiplicação ( num1 , num2 );
                quebrar ;
            caso  4 :
                tentar {
                    resolucao = Calculadora . divisão ( num1 , num2 );
                } catch ( IllegalArgumentException  e ) {
                    Sistema . fora . println ( e.getMessage ( )) ;
                    retornar ;
                }
                quebrar ;
            padrão :
                Sistema . fora . println ( "Erro!" );
                retornar ;
        }

        Sistema . fora . printf ( "Resultado: %d" , resolução );


    }
}