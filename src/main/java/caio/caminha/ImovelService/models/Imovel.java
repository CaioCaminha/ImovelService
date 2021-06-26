package caio.caminha.ImovelService.models;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "imovel")
@Data
public class Imovel {
	private Long id;
	private String endereco;
	private String tipo;
	private String bairro;
	private String regional;
	private String valor;
	private Long tamanho;
}
