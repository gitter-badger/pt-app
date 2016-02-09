package io.github.matek2305.pt.dev;

import io.github.matek2305.pt.domain.entity.BaseEntity;
import io.github.matek2305.pt.domain.repository.BaseRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Mateusz Urbański <matek2305@gmail.com>
 */
@RequiredArgsConstructor
class SaveAndCountRepository<T extends BaseEntity>{

    private final BaseRepository<T> repository;

    @Getter
    private int count = 0;

    T save(T entity) {
        count++;
        return repository.save(entity);
    }
}
