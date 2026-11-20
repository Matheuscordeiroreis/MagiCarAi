package Project.MagiCarAi.dto;

import Project.MagiCarAi.enums.Categoria;
import Project.MagiCarAi.enums.Marcas;
import Project.MagiCarAi.enums.Tipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Year;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {
    private Marcas marcas;
    private Categoria categoria;
    private Tipo tipo;
    private float preco_mim;
    private float preco_max;
    private Year ano_mim;
    private Year ano_max;
}
