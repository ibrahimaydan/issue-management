package com.temelt.issuemanagement.service;

import com.temelt.issuemanagement.entity.Issue;
import com.temelt.issuemanagement.entity.Project;
import com.temelt.issuemanagement.entity.User;
import org.hibernate.query.criteria.internal.predicate.BooleanExpressionPredicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProjectService {

    Project save(Project project);
    Project getById(Long id);
    Page<Project> getAllPageable(Pageable pageable);
    Boolean delete(Project project);

}
