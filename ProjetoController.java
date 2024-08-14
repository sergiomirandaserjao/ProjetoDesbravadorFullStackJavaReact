@Controller
@RequestMapping("/projetos")
public class ProjetoController {
    
    @Autowired
    private ProjetoService projetoService;
    
    @GetMapping
    public String listarProjetos(Model model) {
        model.addAttribute("projetos", projetoService.listarTodos());
        return "projetos/lista";
    }
    
    @PostMapping("/salvar")
    public String salvarProjeto(@ModelAttribute Projeto projeto) {
        projetoService.salvarProjeto(projeto);
        return "redirect:/projetos";
    }
    
    // Métodos para editar, excluir...
}


Ou 



@Controller
@RequestMapping("/projetos")
public class ProjetoController {
    
    @Autowired
    private ProjetoService projetoService;
    
    @GetMapping
    public String listarProjetos(Model model) {
        model.addAttribute("projetos", projetoService.listarTodos());
        return "projetos/lista";
    }
    
    @PostMapping("/salvar")
    public String salvarProjeto(@ModelAttribute Projeto projeto) {
        projetoService.salvarProjeto(projeto);
        return "redirect:/projetos";
    }
    
    @GetMapping("/excluir/{id}")
    public String excluirProjeto(@PathVariable Long id) {
        projetoService.excluirProjeto(id);
        return "redirect:/projetos";
    }
    
    // Outros métodos para editar, visualizar...
}
