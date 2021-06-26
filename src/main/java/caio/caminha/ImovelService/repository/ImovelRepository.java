package caio.caminha.ImovelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import caio.caminha.ImovelService.models.Imovel;

public interface ImovelRepository extends JpaRepository<Imovel, Long>{
	
}
