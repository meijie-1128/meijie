package com.meijie.progress.designpattern.create.factorymodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameFactory {

    @Autowired
    private FitnessGameServiceImpl fitnessGameServiceImpl;

    @Autowired
    private QuizGameServiceImpl quizGameServiceImpl;

    public GameService getGameService(String gameType) {

        GameTypeEnum type = GameTypeEnum.valueOf(gameType);
        switch (type) {
            case FITNESS_GAME:
                return fitnessGameServiceImpl;
            case QUIZ_GAME:
                return quizGameServiceImpl;
        }
        return null;
    }
}
