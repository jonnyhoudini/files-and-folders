package com.example.foldersAndFiles.demo.components;

import com.example.foldersAndFiles.demo.models.File;
import com.example.foldersAndFiles.demo.models.Folder;
import com.example.foldersAndFiles.demo.models.Person;
import com.example.foldersAndFiles.demo.repositories.FileRepository;
import com.example.foldersAndFiles.demo.repositories.FolderRepository;
import com.example.foldersAndFiles.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Person person = new Person("Jonny");
        personRepository.save(person);

        Folder folder1 = new Folder("Work", person);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Personal", person);
        folderRepository.save(folder2);

        File file1 = new File("Letter", ".pdf", folder1);
        fileRepository.save(file1);

        File file2 = new File("Speech", ".doc", folder1);
        fileRepository.save(file2);

        File file3 = new File("Budget", ".csv", folder1);
        fileRepository.save(file3);

        File file4 = new File("CV", ".pdf", folder2);
        fileRepository.save(file4);

        File file5 = new File("Goals", ".doc", folder2);
        fileRepository.save(file5);
    }
}
