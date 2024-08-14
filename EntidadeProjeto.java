@Entity
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private LocalDate dataInicio;
    private String gerenteResponsavel;
    private LocalDate previsaoTermino;
    private LocalDate dataTerminoReal;
    private BigDecimal orcamentoTotal;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusProjeto status;
    
    // Getters e Setters
}
