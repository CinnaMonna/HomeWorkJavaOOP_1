package notebook.model.repository;

import notebook.model.User;

import java.util.List;
import java.util.Optional;

/**
 * Репозиторий, для выполнения CreateReadUpdateDelete (CRUD) операций
 * @param <E> тип модели данных
 * @param <I> тип ID модели данных E
 */
public interface GBRepository {
    List<User> findAll();
    User create(User user);
    Optional<User> update(Long userId, User update);
    boolean delete(Long id);
}
