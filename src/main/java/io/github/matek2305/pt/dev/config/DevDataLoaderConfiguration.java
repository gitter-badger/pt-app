package io.github.matek2305.pt.dev.config;

import com.github.matek2305.dataloader.annotations.EnableDataLoader;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Mateusz Urbański <matek2305@gmail.com>
 */
@Profile("dev")
@Configuration
@EnableDataLoader
public class DevDataLoaderConfiguration {
}
