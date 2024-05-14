function Formulario({botao, eventoTeclado, cadastrar, obj, cancelar, remover, alterar}){
    return(
        <form>
            <input type="text"  value={obj.name} onChange={eventoTeclado} name="name" placeholder="Nome" className="form-control"/>
            <input type="text" value={obj.brand} onChange={eventoTeclado} name="brand" placeholder="Marca"className="form-control"/>

            {
                botao
                ?
                <input type = 'button'class="btn btn-success" onClick={cadastrar} value='Cadastrar' />
                :
                    <div>
                <input type = 'button'class="btn btn-primary" onClick={alterar} value='Alterar' />
                <input type = 'button'class="btn btn-danger" onClick={remover} value='Remover' />
                <input type = 'button'class="btn btn-secondary" onClick={cancelar} value='Cancelar' />
                    </div>
            }
            
        </form>
    )
}

export default Formulario;