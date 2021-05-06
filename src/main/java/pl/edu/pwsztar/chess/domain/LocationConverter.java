package pl.edu.pwsztar.chess.domain;

import org.springframework.context.annotation.Bean;
import pl.edu.pwsztar.chess.dto.FigureMoveDto;
import pl.edu.pwsztar.chess.dto.LocationDto;


class LocationConverter {

    private final char[] letterArray = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};


    LocationDto convert(String location) {

        char s = location.substring(0, 1).charAt(0);
        int y = Integer.parseInt(location.substring(2));
        int x = 0;

        for (int i = 0; i < letterArray.length; i++) {
            if (s == letterArray[i]) {
                x = i + 1;
            }
        }

        return LocationDto.builder()
                .x(x)
                .y(y)
                .build();
    }


}
