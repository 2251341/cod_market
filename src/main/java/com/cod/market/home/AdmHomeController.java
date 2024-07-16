package com.cod.market.home;

import com.cod.market.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adm")
@RequiredArgsConstructor
public class AdmHomeController {
    private final ProductService productService;

    @GetMapping("")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String index(Model model) {
        return "redirect:/adm/home/main";
    }

    @GetMapping("/home/main")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String showMain() {
        return "adm/home/main";
    }
}
