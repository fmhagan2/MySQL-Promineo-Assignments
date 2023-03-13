package projects.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();

	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
	}

	public Project fetchProjectByID(Integer projectID) {
		return projectDao.fetchProjectByID(projectID).orElseThrow(() -> new NoSuchElementException("There is no project assigned to Project ID " + projectID));
		
	}

}
