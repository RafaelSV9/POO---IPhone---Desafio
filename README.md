# POO---IPhone---Desafio
POO - Desafio - Iphone - DIO

Vamos começar pela modelagem UML. Para isso, podemos utilizar ferramentas como Lucidchart, StarUML, ou até mesmo diagramas desenhados à mão. Vou descrever como você pode proceder com a criação dos diagramas UML e depois criar as classes e interfaces em Java.

Passos para a Modelagem UML
Identificação das Classes e Interfaces:

ReprodutorMusical (Music Player)
AparelhoTelefonico (Phone)
NavegadorNaInternet (Internet Browser)
iPhone (que implementará as funcionalidades dos três acima)
Diagrama de Classes:

Classes: ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet, iPhone
Interfaces: ReprodutorMusicalInterface, AparelhoTelefonicoInterface, NavegadorNaInternetInterface
Estrutura do Diagrama de Classes
ReprodutorMusical implementa ReprodutorMusicalInterface
AparelhoTelefonico implementa AparelhoTelefonicoInterface
NavegadorNaInternet implementa NavegadorNaInternetInterface
iPhone implementa ReprodutorMusicalInterface, AparelhoTelefonicoInterface, NavegadorNaInternetInterface
Exemplo de Diagrama de Classes UML
plaintext
Copiar código
+---------------------+
| ReprodutorMusical   |
+---------------------+
| + playMusic()       |
| + pauseMusic()      |
| + stopMusic()       |
+---------------------+
        ^
        |
        |
+---------------------------+
| ReprodutorMusicalInterface|
+---------------------------+
| + playMusic()             |
| + pauseMusic()            |
| + stopMusic()             |
+---------------------------+

+---------------------+
| AparelhoTelefonico  |
+---------------------+
| + makeCall()        |
| + endCall()         |
+---------------------+
        ^
        |
        |
+---------------------------+
| AparelhoTelefonicoInterface|
+---------------------------+
| + makeCall()              |
| + endCall()               |
+---------------------------+

+---------------------+
| NavegadorNaInternet |
+---------------------+
| + browse()          |
| + bookmarkPage()    |
+---------------------+
        ^
        |
        |
+---------------------------+
| NavegadorNaInternetInterface|
+---------------------------+
| + browse()                |
| + bookmarkPage()          |
+---------------------------+

+---------------------+
| iPhone              |
+---------------------+
| + playMusic()       |
| + pauseMusic()      |
| + stopMusic()       |
| + makeCall()        |
| + endCall()         |
| + browse()          |
| + bookmarkPage()    |
+---------------------+
Código Java
Agora, vamos criar as classes e interfaces no formato de arquivos .java.

ReprodutorMusicalInterface.java
java
Copiar código
public interface ReprodutorMusicalInterface {
    void playMusic();
    void pauseMusic();
    void stopMusic();
}
