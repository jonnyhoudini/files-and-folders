package com.example.foldersAndFiles.demo;

import com.example.foldersAndFiles.demo.models.File;
import com.example.foldersAndFiles.demo.models.Folder;
import com.example.foldersAndFiles.demo.models.Person;
import com.example.foldersAndFiles.demo.repositories.FileRepository;
import com.example.foldersAndFiles.demo.repositories.FolderRepository;
import com.example.foldersAndFiles.demo.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FoldersAndFilesApplicationTests {

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	PersonRepository personRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateFolderandPersonAndFile(){
		Person person = new Person("Jonny");
		personRepository.save(person);

		Folder folder = new Folder("Work", person);
		folderRepository.save(folder);

		File file = new File("Letter", ".pdf", folder);
		fileRepository.save(file);
	}

}
