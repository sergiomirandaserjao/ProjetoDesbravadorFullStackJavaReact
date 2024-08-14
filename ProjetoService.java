@Service
public class ProjetoService {
    
    @Autowired
    private ProjetoRepository projetoRepository;
    
    public Projeto salvarProjeto(Projeto projeto) {
        return projetoRepository.save(projeto);
    }
    
    public void excluirProjeto(Long id) {
        Projeto projeto = projetoRepository.findById(id).orElseThrow(() -> new RuntimeException("Projeto não encontrado"));
        if(projeto.getStatus() == StatusProjeto.INICIADO || 
           projeto.getStatus() == StatusProjeto.EM_ANDAMENTO || 
           projeto.getStatus() == StatusProjeto.ENCERRADO) {
            throw new RuntimeException("Não é possível excluir projetos com status iniciado, em andamento ou encerrado.");
        }
        projetoRepository.delete(projeto);
    }
    
    // Outros métodos de serviço...
}
