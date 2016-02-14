package io.github.matek2305.pt.api;

import info.solidsoft.mockito.java8.api.WithMockito;
import io.github.matek2305.pt.service.MatchPredictionService;
import io.github.matek2305.pt.service.MatchService;
import io.github.matek2305.pt.service.TournamentService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mateusz Urbański <matek2305@gmail.com>
 */
@Configuration
@EnableAutoConfiguration
public class ServiceMockConfiguration implements WithMockito {

    @Bean
    public TournamentService tournamentService() {
        return mock(TournamentService.class);
    }

    @Bean
    public MatchService matchService() {
        return mock(MatchService.class);
    }

    @Bean
    public MatchPredictionService matchPredictionService() {
        return mock(MatchPredictionService.class);
    }
}
