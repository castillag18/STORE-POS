package com.store.pos.services;


import com.store.pos.model.dto.VentaDTO;

import java.util.List;

public interface VentaServices {
    void venta(Long idCliente, List<VentaDTO> ventaDTO);
}
