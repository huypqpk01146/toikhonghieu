package com.qlns.qlnsitsol.repository;

import com.qlns.qlnsitsol.entity.KhenThuongKl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositoryKhenThuong extends JpaRepository<KhenThuongKl,Long> {

}
