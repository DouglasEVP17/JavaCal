classe  pública principal {
    public  static  void  main ( String [] args ) {
        livro  livro1 = novo  livro ( "Java: Do básico ao avançado" , "João" , 2020 );
        livro  livro2 = novo  livro ( "Python para iniciantes" , "Pedro" , 2018 );
        livro  livro3 = novo  livro ( "Lógica" , "Maria" , 2022 );
        livro  livro4 = novo  livro ( "Matrizes e Vetores" , "Ana" , 2024 );

        Sistema . fora . println ( "Informações do Livro 1:" );
        livro1 . exibir informações ();

        Sistema . fora . println ( "Informações do Livro 2:" );
        livro2 . exibir informações ();

        Sistema . fora . println ( "Informações do Livro 3:" );
        livro3 . exibir informações ();

        Sistema . fora . println ( "Informações do Livro 4:" );
        livro4 . exibir informações ();
    }
}