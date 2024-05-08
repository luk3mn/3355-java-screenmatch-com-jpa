package br.com.alura.screenmatch.repository;

import br.com.alura.screenmatch.model.Categoria;
import br.com.alura.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie, Long> {
    // ...Titulo... corresponde ao mesmo nome do atributo da classe desejada
    Optional<Serie> findByTituloContainingIgnoreCase(String nomeSerie); // busca pelo titulo que contem a string nomeSerie pessada por parâmetro e ignora maiúsculos e minúsculos

    // Busca "ator" com "avaliação" maior ou igual a "?"
    List<Serie> findByAtoresContainingIgnoreCaseAndAvaliacaoGreaterThanEqual(String nomeAtor, double avaliacao);

    List<Serie> findTop5ByOrderByAvaliacaoDesc();

    // recebe a categoria (enum) por parâmetro e busca por categoria
    List<Serie> findByGenero(Categoria categoria);

    List<Serie> findByTotalTemporadasAndAvaliacaoGreaterThanEqual(Integer totalTemporadas, double avaliacao);
}
