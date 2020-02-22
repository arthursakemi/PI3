/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.testemaven;

import br.com.caelum.stella.tinytype.CPF;

/**
 *
 * @author arthur.msakemi
 */
public class Main {

    public static void main(String[] args) {
        CPF cpf = new CPF("36856036809");

        System.out.println(cpf.isValido());
    }

}
