package dto;

import buider.Pessoa;
import factory.Moeda;
import factory.Paises;

public class ReportDto {
    private String nome;
    private Moeda moeda;
    private Paises paises;
    private Pessoa pessoa;

    public static final class ReportDtoBuilder {
        private String nome;
        private Moeda moeda;
        private Paises paises;
        private Pessoa pessoa;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder aReportDto() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public ReportDtoBuilder moeda(Moeda moeda) {
            this.moeda = moeda;
            return this;
        }

        public ReportDtoBuilder paises(Paises paises) {
            this.paises = paises;
            return this;
        }

        public ReportDtoBuilder pessoa(Pessoa pessoa) {
            this.pessoa = pessoa;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.pessoa = this.pessoa;
            reportDto.paises = this.paises;
            reportDto.nome = this.nome;
            reportDto.moeda = this.moeda;
            return reportDto;
        }
    }

    @Override
    public String toString() {
        return "ReportDto{" +
                "nome='" + nome + '\'' +
                ", moeda=" + moeda +
                ", paises=" + paises +
                ", pessoa=" + pessoa +
                '}';
    }
}
