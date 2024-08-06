package com.i2it.ems.project.service;

import java.util.List;

import com.i2it.ems.exception.DataBaseException;
import com.i2it.ems.model.Project;

/**
 * <p>
 * Managing department records, add, retrieve, retrieve by id,update and delete.
 * </p>
 */
public interface ProjectService {

    /**
     * <p>
     * Creates a new Project record.
     * </p>
     *
     * @param Project 
     *     - Project details
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public void createProject(Project project) throws DataBaseException; 

    /**
     * <p>
     * Retrieves projects.
     * </p>
     *
     * @return List<project> 
     *     - List of project details
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public List<Project> retrieveProjects() throws DataBaseException;

    /**
     * <p>
     * Retrieves an project by their ID.
     * </p>
     *
     * @param id 
     *     - Project ID
     * @return Project 
     *     - project details
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public Project retrieveProjectById(int id) throws DataBaseException;

    /**
     * <p>
     * Updates an project based on their ID.
     * </p>
     *
     * @param id       
     *     - project ID
     * @param project 
     *     - Updated project details
     * @throws DataBaseException
     *     - Exception occurs throws SQLException
     */
    public void updateProject(Project Project) throws DataBaseException;

    /**
     * <p>
     * Deletes an Project based on their ID.
     * </p>
     *
     * @param id 
     *     - project ID
     * @throws DataBaseException 
     *     - When Exception occurs
     */
    public void deleteProject(Project Project) throws DataBaseException;
}