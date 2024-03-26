package com.msoft.noteappapi;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class NoteAppApiApplicationTests {
//
//    @Test
//    public void contextLoads() {
//    }
//
//}


//import com.msoft.noteappapi.Model.Notebook;
//import com.msoft.noteappapi.Repository.NotebookRepositroy;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import com.msoft.noteappapi.Service.ServiceImpl.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//class NotebookServiceImplTest {
//
//    @Mock
//    private NotebookRepositroy notebookRepository;
//
//    @InjectMocks
//    private NotebookServiceImpl notebookService;
//
//    @Test
//    void testGetAllNotebook() {
//        // Mock data
//        List<Notebook> notebooks = new ArrayList<>();
//        notebooks.add(new Notebook());
//        notebooks.add(new Notebook());
//
//        // Mock repository method
//        when(notebookRepository.findAll()).thenReturn(notebooks);
//
//        // Call service method
//        List<Notebook> result = notebookService.getAllNotebook();
//
//        // Assert
//        assertEquals(2, result.size());
//    }
//
//    // Add more test cases for other service methods as needed
//}
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.msoft.noteappapi.Model.Notebook;
import com.msoft.noteappapi.Repository.NotebookRepositroy;
import com.msoft.noteappapi.Service.ServiceImpl.NotebookServiceImpl;

@ExtendWith(MockitoExtension.class)
class NotebookServiceImplTest {

    @Mock
    private NotebookRepositroy notebookRepository;

    @InjectMocks
    private NotebookServiceImpl notebookService;

    @Test
    void testGetNotebookById() {
        // Mock data
        long notebookId = 1L;
        Notebook notebook = new Notebook(); // Create a mock notebook
        notebook.setId(notebookId);

        // Mock repository behavior
        when(notebookRepository.findById(anyLong())).thenReturn(Optional.of(notebook));

        // Call the service method
        Notebook result = notebookService.getNotebookById(notebookId);

        // Verify the result
        assertEquals(notebookId, result.getId());
        // Add more assertions as needed
    }
}



