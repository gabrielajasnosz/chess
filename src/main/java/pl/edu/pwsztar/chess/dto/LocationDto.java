package pl.edu.pwsztar.chess.dto;


import lombok.*;


@AllArgsConstructor
@Getter
@ToString
@Builder(toBuilder = true)

public class LocationDto {

    private int x;
    private int y;

}
