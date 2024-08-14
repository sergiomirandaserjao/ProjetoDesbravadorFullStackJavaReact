class ProjetoForm extends React.Component {
    render() {
        return (
            <form action="/projetos/salvar" method="post">
                <!-- Campos do projeto -->
                <select name="status" className="form-control">
                    <option value="EM_ANALISE">Em Análise</option>
                    <option value="ANALISE_REALIZADA">Análise Realizada</option>
                    <option value="ANALISE_APROVADA">Análise Aprovada</option>
                    <!-- Outros status... -->
                </select>
                <!-- Botão de submit -->
                <button type="submit" className="btn btn-primary">Salvar</button>
            </form>
        );
    }
}

ReactDOM.render(<ProjetoForm />, document.getElementById('projetoForm'));
