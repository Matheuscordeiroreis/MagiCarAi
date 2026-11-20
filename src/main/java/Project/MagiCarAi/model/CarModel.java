package Project.MagiCarAi.model;

import Project.MagiCarAi.enums.Categoria;
import Project.MagiCarAi.enums.Marcas;
import Project.MagiCarAi.enums.Tipo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.Year;

@NoArgsConstructor
@AllArgsConstructor
public class CarModel {
    private Marcas marcas;
    private Categoria categoria;
    private Tipo tipo;
    private float preco_mim;
    private float preco_max;
    private Year ano_mim;
    private Year ano_max;

    public Marcas getMarcas() {
        return marcas;
    }

    public void setMarcas(Marcas marcas) {
        this.marcas = marcas;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public float getPreco_mim() {
        return preco_mim;
    }

    public void setPreco_mim(float preco_mim) {
        this.preco_mim = preco_mim;
    }

    public float getPreco_max() {
        return preco_max;
    }

    public void setPreco_max(float preco_max) {
        this.preco_max = preco_max;
    }

    public Year getAno_mim() {
        return ano_mim;
    }

    public void setAno_mim(Year ano_mim) {
        this.ano_mim = ano_mim;
    }

    public Year getAno_max() {
        return ano_max;
    }

    public void setAno_max(Year ano_max) {
        this.ano_max = ano_max;
    }
}
