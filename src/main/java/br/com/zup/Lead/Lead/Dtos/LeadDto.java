package br.com.zup.Lead.Lead.Dtos;

import java.util.List;

public class LeadDto {
    private String email;
    private String nome;
    private String telefone;
    List<ProductDto> productDto;


    public LeadDto() {
    }

    public LeadDto(String email, String nome, String telefone, List<ProductDto> productDto) {
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

    public List<ProductDto> getProductDto() {
        return productDto;
    }

    public void setProductDto(List<ProductDto> productDto) {
        this.productDto = productDto;
    }
}
