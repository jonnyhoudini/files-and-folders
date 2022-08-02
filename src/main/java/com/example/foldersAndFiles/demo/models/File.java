package com.example.foldersAndFiles.demo.models;

import javax.persistence.*;

@Entity
@Table(name="files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="extension")
    private String extension;

    @ManyToOne
    @JoinColumn(name="folder_id", nullable = true)
    private Folder folder;

    public File(String name, String extension, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.folder = folder;
    }

    public File(){

    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
