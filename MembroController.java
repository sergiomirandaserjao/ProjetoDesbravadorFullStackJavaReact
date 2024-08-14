@RestController
@RequestMapping("/api/membros")
public class MembroController {
    
    @PostMapping
    public ResponseEntity<String> adicionarMembro(@RequestBody MembroDTO membroDTO) {
        // Lógica para adicionar membro
        return ResponseEntity.ok("Membro adicionado com sucesso!");
    }
}
