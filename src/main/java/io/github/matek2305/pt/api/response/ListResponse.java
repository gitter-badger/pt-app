package io.github.matek2305.pt.api.response;

import lombok.Data;

import java.util.List;

/**
 * @author Mateusz Urbański <matek2305@gmail.com>
 */
@Data
public class ListResponse<T> {

    private final List<T> content;
    private final long totalElements;
}
