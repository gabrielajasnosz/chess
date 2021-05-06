package pl.edu.pwsztar.chess.domain;


import org.springframework.transaction.annotation.Transactional;
import pl.edu.pwsztar.chess.dto.FigureMoveDto;

import static java.util.Objects.requireNonNull;

@Transactional
public class ChessFacade {


    private final LocationConverter locationConverter;

    public ChessFacade(LocationConverter locationConverter) {
        this.locationConverter = locationConverter;
    }



    public boolean isMoveCorrect(FigureMoveDto figureMoveDto){

        System.out.println(locationConverter.convert(figureMoveDto.getStart()).getX());
        System.out.println(locationConverter.convert(figureMoveDto.getStart()).getY());

        System.out.println(locationConverter.convert(figureMoveDto.getDestination()).getX());
        System.out.println(locationConverter.convert(figureMoveDto.getDestination()).getY());

        if(locationConverter.convert(figureMoveDto.getStart()).getX()==locationConverter.convert(figureMoveDto.getStart()).getY()){
            if(locationConverter.convert(figureMoveDto.getDestination()).getX()==locationConverter.convert(figureMoveDto.getDestination()).getY()){
                return true;
            }
        }
        return false;

    }


}
