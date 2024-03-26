package com.msoft.noteappapi.Repository;
import com.msoft.noteappapi.Model.Notebook;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotebookRepositroy extends CrudRepository<Notebook, Long> {
    @Query("SELECT nb, u FROM Notebook nb JOIN nb.user u WHERE nb.user.id=?1")
    List<Notebook> getAllNotebookByUserkId(long id);
}
