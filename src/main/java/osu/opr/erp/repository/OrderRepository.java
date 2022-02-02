package osu.opr.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import osu.opr.erp.entity.Article;
import osu.opr.erp.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    public Order findOrderById(Long id);

}
