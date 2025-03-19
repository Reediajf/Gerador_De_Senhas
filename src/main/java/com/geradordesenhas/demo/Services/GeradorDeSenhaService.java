package com.geradordesenhas.demo.Services;

import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Random;

@Service
public class GeradorDeSenhaService {
    private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String LETRAS_MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String CARACTERES_ESPECIAIS = "!@#$%^&*()-_=+<>?";

    private static final Random RANDOM = new SecureRandom ();

    public String gerarSenha ( int tamanho, boolean usarMaiusculas, boolean usarMinusculas, boolean usarNumeros, boolean UsarEspeciais ) {
        String caracteres = LETRAS_MAIUSCULAS;
        if (usarMaiusculas) caracteres += LETRAS_MAIUSCULAS;
        if (usarMinusculas) caracteres += LETRAS_MINUSCULAS;
        if (usarNumeros) caracteres += NUMEROS;
        if (UsarEspeciais) caracteres += CARACTERES_ESPECIAIS;

        StringBuilder senha = new StringBuilder ();
        for (int i = 0; i < tamanho; i++) {
            senha.append ( caracteres.charAt ( RANDOM.nextInt ( caracteres.length () ) ) );

        }
        return senha.toString ();
    }
}
