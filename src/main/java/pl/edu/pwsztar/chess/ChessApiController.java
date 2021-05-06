package pl.edu.pwsztar.chess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.pwsztar.chess.domain.ChessFacade;
import pl.edu.pwsztar.chess.dto.FigureMoveDto;


@RestController
@RequestMapping(value="/api")
class ChessApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChessApiController.class);



    private final ChessFacade chessFacade;

    public ChessApiController(ChessFacade chessFacade) {
        this.chessFacade = chessFacade;
    }



    @CrossOrigin
    @PostMapping(value = "/chess/is-correct-move")
    public ResponseEntity<Boolean> isCorrectMove(@RequestBody FigureMoveDto figureMoveDto) {
        LOGGER.info("*** move details : {}", figureMoveDto);

        System.out.println(chessFacade.isMoveCorrect(figureMoveDto));

        return ResponseEntity.ok(chessFacade.isMoveCorrect(figureMoveDto));
    }
}
