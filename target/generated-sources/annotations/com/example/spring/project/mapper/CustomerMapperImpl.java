package com.example.spring.project.mapper;

import com.example.spring.project.dao.entity.CustomerEntity;
import com.example.spring.project.model.CustomerDto;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-16T20:09:54+0400",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 15.0.1 (Oracle Corporation)"
)
public class CustomerMapperImpl extends CustomerMapper {

    @Override
    public CustomerDto entityToDto(CustomerEntity customerEntity) {
        if ( customerEntity == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setName( customerEntity.getFirstName() );
        customerDto.setSurname( customerEntity.getLastName() );

        return customerDto;
    }

    @Override
    public CustomerEntity dtoToEntity(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setFirstName( customerDto.getName() );
        customerEntity.setLastName( customerDto.getSurname() );

        return customerEntity;
    }
}
