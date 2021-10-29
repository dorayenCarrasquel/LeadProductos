package br.com.zup.Lead.Lead;

import br.com.zup.Lead.Lead.Dtos.LeadDto;
import br.com.zup.Lead.Lead.Dtos.ProductDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {
   private List<LeadDto> leadDtoList = new ArrayList<>();


    public void salvarLead(LeadDto leadDto){
        leadDtoList.add(leadDto);

    }

    public List<LeadDto> exibirDados() {
        return leadDtoList;
    }


    public LeadDto buscarEmail(String email, LeadDto leadDto){
        for (LeadDto leadReferencia: leadDtoList) {
            if (leadDto.getEmail().equalsIgnoreCase(email)){
               return leadDto;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public LeadDto buscarProducto(LeadDto leadDto){
        for (LeadDto leadReferencia: leadDtoList) {
            if (leadDto.getProdutos().equals(leadDto.getProdutos())) {
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY);
            }
            //metodo atualizar produtos
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }


    public LeadDto verificarEmail(@PathVariable String email, @RequestBody LeadDto leadDto){
        return

    }

}
