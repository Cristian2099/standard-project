package com.cristiandev.standard_project.service;

import com.cristiandev.standard_project.dto.ClientDTO;
import com.cristiandev.standard_project.exception.StandardProjectException;

public interface ClientService {

    ClientDTO save(ClientDTO cliente) throws StandardProjectException;
}
