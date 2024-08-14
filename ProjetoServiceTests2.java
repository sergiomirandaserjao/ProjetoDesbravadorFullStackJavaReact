@SpringBootTest
public class ProjetoServiceTests2 {

    @Autowired
    private ProjetoService projetoService;

    @Test
    public void naoDevePermitirExcluirProjetoComStatusIniciado() {
        Projeto projeto = new Projeto();
        projeto.setStatus(StatusProjeto.INICIADO);
        projetoService.salvarProjeto(projeto);

        assertThrows(RuntimeException.class, () -> projetoService.excluirProjeto(projeto.getId()));
    }
}
