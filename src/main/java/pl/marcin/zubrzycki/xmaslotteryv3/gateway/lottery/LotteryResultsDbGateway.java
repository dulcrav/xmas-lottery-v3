package pl.marcin.zubrzycki.xmaslotteryv3.gateway.lottery;

import org.springframework.stereotype.Service;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.lottery.LotteryResults;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.lottery.LotteryResultsGateway;
import pl.marcin.zubrzycki.xmaslotteryv3.domain.user.User;

import java.util.Collection;
import java.util.List;

@Service
public class LotteryResultsDbGateway implements LotteryResultsGateway {
    private final LotteryResultsRepository repository;

    public LotteryResultsDbGateway(LotteryResultsRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<LotteryResults> findAll() {
        return repository.findAll();
    }

    @Override
    public List<LotteryResults> saveAll(List<LotteryResults> results) {
        return repository.saveAll(results);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public LotteryResults findByUserPlayer(User user) {
        return repository.findByUserPlayer(user);
    }
}
