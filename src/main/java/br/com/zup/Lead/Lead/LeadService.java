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


    public LeadDto buscarEmail(LeadDto leadDto){
        for (LeadDto leadReferencia: leadDtoList) {
            if (leadReferencia.getEmail().equalsIgnoreCase(leadDto.getEmail())){
               buscarProducto(leadDto);
            }
        }
        salvarLead(leadDto);
        throw new ResponseStatusException(HttpStatus.CREATED);
    }

    public LeadDto buscarProducto(LeadDto leadDto){
        for (LeadDto leadReferencia: leadDtoList) {
            if (leadReferencia.getProdutos().equals(leadDto.getProdutos())) {
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY);
            }
            //metodo atualizar produtos
            leadReferencia.setProdutos(leadDto.getProdutos());
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }



    /*public LeadDto verificarEmail(@PathVariable String email, @RequestBody LeadDto leadDto){
        return

    }*/

}
