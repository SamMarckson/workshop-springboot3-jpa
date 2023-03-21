package com.educandoweb.course.repository;

import com.educandoweb.course.entity.OrderItem;
import com.educandoweb.course.entity.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
