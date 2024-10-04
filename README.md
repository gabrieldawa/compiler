# compiler
made up assembly clone compiler

# commands
 <table>
  <tr>
    <th>Codigo</th>
    <td>100</td>
    <td>101</td>
    <td>102</td>
    <td>103</td>
    <td>104</td>
    <td>105</td>
    <td>106</td>
    <td>107</td>
    <td>108</td>
  </tr>
  <tr>
    <th>Instrução</th>
    <td>LOAD</td>
    <td>PRINT</td>
    <td>HALT</td>
    <td>DEC</td>
    <td>INC</td>
    <td>ADD</td>
    <td>JNZ</td>
    <td>JZ</td>
    <td>SET</td>
  </tr>
  <tr>
    <th>Values</th>
    <td>R, END</td>
    <td>R</td>
    <td>-</td>
    <td>R</td>
    <td>R</td>
    <td>Ra, Rb</td>
    <td>Ra, END</td>
    <td>Ra, END</td>
    <td>R, VAL</td>
  </tr>
   <tr>
    <th>Descrição</th>
    <td>Carrega no registrador R o valor armazenado no endereço de memória END</td>
    <td>Imprime na tela o conteúdo do registrador R</td>
    <td>halts</td>
    <td>Decrementa o valor do registrador R</td>
    <td>Incrementa o valor do registrador R</td>
    <td>Soma os valores de RA e RB e armazena o resultado em RA</td>
    <td>Desvia a execução para o endereço END se o registrador R for diferente de 0</td>
    <td>Desvia a execução para END se o registrador R for igual a 0</td>
    <td>Atribui o valor VAL diretamente ao registrador R</td>
  </tr>
   <tr>
    <th>Java Equivalent</th>
    <td>int R = END;</td>
    <td>System.out.print(R);</td>
    <td> - </td>
    <td>R--;</td>
    <td>R++;</td>
    <td>Ra += Rb;</td>
    <td>if (R != 0) goto END</td>
    <td>if (R == 0) goto END</td>
    <td>R = VAL;</td>
  </tr>
</table> 

faz o L
