package io.github.matek2305.pt.domain.repository;

import io.github.matek2305.pt.domain.entity.MatchPrediction;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mateusz Urbański <matek2305@gmail.com>
 */
@Repository
public interface MatchPredictionRepository extends BaseRepository<MatchPrediction> {

    List<MatchPrediction> findByMatchId(int matchId);
}
