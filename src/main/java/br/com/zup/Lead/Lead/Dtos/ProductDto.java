package br.com.zup.Lead.Lead.Dtos;

public class ProductDto {
    private String nome;
    private double valor;

    public ProductDto() {
    }

    public ProductDto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static class LeadDto {
        private String email;
        private String nome;
        private String telefone;
        ProductDto productDto;


        public LeadDto() {
        }

        public LeadDto(String email, String nome, String telefone, ProductDto productDto) {
            this.email = email;
            this.nome = nome;
            this.telefone = telefone;
            this.productDto = productDto;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public ProductDto getProductDto() {
            return productDto;
        }

        public void setProductDto(ProductDto productDto) {
            this.productDto = productDto;
        }
    }
}
