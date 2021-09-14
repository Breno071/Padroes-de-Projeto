package dto;

import buider.Pessoa;
import factory.Moeda;
import factory.MoedaFactory;
import factory.Paises;

public class DtoTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = Pessoa.PessoaBuilder.aPessoa()
                .nome("Breno")
                .sobremone("Narde")
                .email("breno@gmail.com")
                .build();
        Moeda moeda = MoedaFactory.novaMoeda(Paises.BRAZIL);
        Paises paises = Paises.BRAZIL;

        ReportDto build = ReportDto.ReportDtoBuilder.aReportDto()
                .nome(pessoa.getNome())
                .pessoa(pessoa)
                .moeda(moeda)
                .paises(paises)
                .build();

        System.out.println(build);

    }
}
