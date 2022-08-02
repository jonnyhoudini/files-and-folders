package com.example.foldersAndFiles.demo.repositories;

import com.example.foldersAndFiles.demo.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
