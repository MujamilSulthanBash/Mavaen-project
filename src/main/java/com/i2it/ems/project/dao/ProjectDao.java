package com.i2it.ems.project.dao;

import java.util.List;

import com.i2it.ems.exception.DataBaseException;
import com.i2it.ems.model.Project;

/**
 * <p>
 * Manages department records: add, retrieve, update, and delete.
 * </p>
 */
public interface ProjectDao {

    /**
     * <p>
     * Add project if the project is not present, otherwise update's the project.
     * </p>
     *
     * @param project
     *     - Project Details
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public void saveOrUpdateProject(Project project) throws DataBaseException;

    /**
     * <p>
     * Retrieves all Projects.
     * </p>
     *
     * @return List<Project>
     *     - List of Projects 
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public List<Project> retrieveProjects() throws DataBaseException;

}
