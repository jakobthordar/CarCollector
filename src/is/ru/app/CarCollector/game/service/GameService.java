package is.ru.app.CarCollector.game.service;

import is.ru.app.CarCollector.cars.models.Car;
import is.ru.app.CarCollector.game.models.CarSubType;
import is.ru.app.CarCollector.game.models.Player;
import is.ru.app.CarCollector.game.models.Statistics;

import java.util.List;

/**
 * <h1>GameService</h1>
 * <h2>is.ru.app.CarCollector.game.service</h2>
 * <p></p>
 * Created on 1.11.2014.
 *
 * @author jakob
 * @version 1.1
 */
public interface GameService {

    /**
     * This function updates the statistics of the player.
     * It calculates it based on type and subtype.
     * @param car The car which was added toward the stats.
     */
    public void updateStats(Car car, Player player) throws GameServiceException;

    /**
     */
    public Statistics getStats() throws GameServiceException;

    public Statistics getLevelXpScreenData();

    public Player addPlayer(Player player) throws GameServiceException;


}
