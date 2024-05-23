package com.example.test.Service;

import com.example.test.entity.Status;

import java.util.List;

public interface StatusService {

    List<Status> getALl();

    Status add(Status s);

    Status update(Long id, Status s);
}
