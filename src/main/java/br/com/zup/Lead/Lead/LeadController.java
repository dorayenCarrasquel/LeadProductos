package br.com.zup.Lead.Lead;

import br.com.zup.Lead.Lead.Dtos.LeadDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leads")
public class LeadController {

    @Autowired
    private LeadService leadService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvarLead(@RequestBody LeadDto leadDto) {
        leadService.salvarLead(leadDto);
    }

    @GetMapping
    public List<LeadDto> exibirLead(){
        return leadService.exibirDados();
    }




}
