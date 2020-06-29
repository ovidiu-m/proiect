package ro.fasttrack.proiectIMC.IMC.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.fasttrack.proiectIMC.IMC.service.IMCService;

@Controller
public class ImcUiController {
    private final IMCService imcService;

    public ImcUiController(final IMCService imcService) {
        this.imcService = imcService;
    }

    @GetMapping("statistica")
    public String statisticaPage(Model pageModel) {
      pageModel.addAttribute("statistica", imcService.getAll());
        return "statistica";
    }
}