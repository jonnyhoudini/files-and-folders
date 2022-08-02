package com.example.foldersAndFiles.demo.repositories;

import com.example.foldersAndFiles.demo.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
