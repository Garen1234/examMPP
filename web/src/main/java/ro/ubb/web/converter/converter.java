package ro.ubb.web.converter;

import ro.ubb.core.model.Owner;
import ro.ubb.web.dto.OwnerDTO;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class converter {

    public static OwnerDTO convertModelToDto(Owner owner)
    {
        OwnerDTO cvt = new OwnerDTO();

        cvt.setEmail(owner.getEmail());
        cvt.setName(owner.getName());
        cvt.setId(owner.getId());

        return cvt;

    }

    public static Set<OwnerDTO> convertModelsToDtos(Collection<Owner> models) {
        return models.stream()
                .map(model -> convertModelToDto(model))
                .collect(Collectors.toSet());
    }
}

