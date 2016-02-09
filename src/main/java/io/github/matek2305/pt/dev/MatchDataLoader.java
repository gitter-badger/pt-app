package io.github.matek2305.pt.dev;

import com.github.matek2305.dataloader.DataLoader;
import io.github.matek2305.pt.domain.entity.Match;
import io.github.matek2305.pt.domain.repository.MatchRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

/**
 * @author Mateusz Urbański <matek2305@gmail.com>
 */
@Slf4j
@DevComponent
public class MatchDataLoader implements DataLoader {

    Match polandVsGermany;
    Match chelseaVsManUtd;

    @Autowired
    private MatchRepository matchRepository;

    private int count = 0;

    @Override
    public void load() {
        log.info("Loading match data ...");
        polandVsGermany = createAndSavePredictionAvailable("Poland", "Germany", now().plusDays(2).withHour(20).withMinute(45));
        chelseaVsManUtd = createAndSavePredictionAvailable("Chelsea FC", "Manchester United FC", now().plusDays(1).withHour(17).withMinute(0));
        log.info("Match data ({}) loaded successfully", count);
    }

    private Match createAndSavePredictionAvailable(String homeTeamName, String awayTeamName, LocalDateTime startDate) {
        count++;
        Match match = new Match();
        match.setHomeTeamName(homeTeamName);
        match.setAwayTeamName(awayTeamName);
        match.setStartDate(startDate);
        match.setStatus(Match.Status.PREDICTION_AVAILABLE);
        return matchRepository.save(match);
    }
}
