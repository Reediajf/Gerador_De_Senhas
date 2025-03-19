package com.geradordesenhas.demo.Controller;

import com.geradordesenhas.demo.Services.GeradorDeSenhaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/senha")
public class GeradorDeSenhaController {
    private GeradorDeSenhaService geradorDeSenhaService;

    public GeradorDeSenhaController(GeradorDeSenhaService geradorDeSenhaService) {
        this.geradorDeSenhaService = geradorDeSenhaService;
    }

    @GetMapping("/gerar")
    public String gerarSenha(@RequestParam(defaultValue = "12") int tamanho,
                             @RequestParam(defaultValue = "true") boolean usarMaiuscula,
                             @RequestParam(defaultValue = "true") boolean usarMinuscula,
                             @RequestParam(defaultValue = "true") boolean usarNumero,
                             @RequestParam(defaultValue = "true") boolean usarEspeciais  ) {

        return geradorDeSenhaService.gerarSenha (tamanho, usarMaiuscula, usarMinuscula, usarNumero, usarEspeciais);

    }
}
