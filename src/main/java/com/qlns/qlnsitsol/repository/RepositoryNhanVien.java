package com.qlns.qlnsitsol.repository;

import com.qlns.qlnsitsol.entity.NhanVien;
import com.qlns.qlnsitsol.entity.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RepositoryNhanVien extends JpaRepository<NhanVien,Long> {
   Optional<NhanVien> findByTenNhanVien (String s);
    List<NhanVien> getAllByChuVuLikeAndActionAndPhongBan_Action (String s, boolean bl, boolean ba);
   Boolean existsByTenNhanVien(String s);
}
