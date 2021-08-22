package com.example.spring.project.mapper;

import com.example.spring.project.dao.entity.ContactEntity;
import com.example.spring.project.dao.entity.CustomerEntity;
import com.example.spring.project.model.ContactDto;
import com.example.spring.project.model.CustomerDto;
import com.example.spring.project.model.NewDto;
import jdk.jfr.Name;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public abstract class CustomerMapper {
    public static final CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mappings({
            @Mapping(target = "name", source = "firstName"),
            @Mapping(target = "surname", source = "lastName"),
            @Mapping(target = "age", ignore = true)
//            @Mapping(target = "customerDetail", source = "customerDetail.detail"),
//            @Mapping(target = "contacts", source = "contacts", qualifiedByName = "contactEntityListToDtoList")
    })
    public abstract CustomerDto entityToDto(CustomerEntity customerEntity);

    @Mappings({
            @Mapping(target = "firstName", source = "name"),
            @Mapping(target = "lastName", source = "surname"),
//            @Mapping(target = "customerDetail.detail", source = "customerDetail"),
//            @Mapping(target = "contacts", source = "contacts", qualifiedByName = "contactEntityListToDtoList")
    })
    public abstract CustomerEntity dtoToEntity(CustomerDto customerDto);

//    @Named("contactEntityListToDtoList")
//    List<ContactDto> userListToUserDtoList(List<ContactEntity> contacts) {
//        List<ContactDto> contactDtos = new ArrayList<>();
//        for (ContactEntity contact : contacts) {
//            ContactDto contactDto = mapContactEntityToDto(contact);
//            contactDtos.add(contactDto);
//        }
//        return contactDtos;
//
//        {
//            ContactEntity("mail", "asdasda")
//            ContactEntity("telephon", "asdasda")
//        }
//
//        return contacts.stream()
//                .map(contactEntity -> contactEntityToDto(contactEntity))
//                .collect(Collectors.toList());
//    }

//    @Mappings({
//            @Mapping(target = "type", source = "type"),
//            @Mapping(target = "value", source = "value")
//    })
//    public abstract ContactDto contactEntityToDto(ContactEntity contactEntity);
//
//    public ContactDto mapContactEntityToDto(ContactEntity contactEntity) {
//        return new ContactDto(contactEntity.getType(), contactEntity.getValue());
//    }
//
//    public NewDto mapCustomerAndContactDtoToNewDto(CustomerDto customerDto, ContactDto contactDto) {
//        NewDto newDto = new NewDto();
//        newDto.setLastName(customerDto.getSurname());
//        newDto.setValue(contactDto.getValue());
//
//        return newDto;
//    }
}
