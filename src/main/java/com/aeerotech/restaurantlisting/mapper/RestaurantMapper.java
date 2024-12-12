package com.aeerotech.restaurantlisting.mapper;


import com.aeerotech.restaurantlisting.dto.RestaurantDTO;
import com.aeerotech.restaurantlisting.entity.Restaurant;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);

    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);

}
