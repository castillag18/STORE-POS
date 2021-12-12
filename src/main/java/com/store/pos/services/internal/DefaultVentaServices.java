package com.store.pos.services.internal;

import com.store.pos.infrastructure.ArticuloRepository;
import com.store.pos.model.Articulo;
import com.store.pos.model.Movimiento;
import com.store.pos.model.Venta;
import com.store.pos.model.dto.VentaDTO;
import com.store.pos.services.VentaServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DefaultVentaServices implements VentaServices {

    @Autowired
    private ArticuloRepository articuloRepository;

    @Override
    public void venta(Long idCliente, List<VentaDTO> ventaDTO) {
        List <Venta> venta = new ArrayList<>();
        ventaDTO.forEach(ventaDTO1 -> {
            Venta venta1 = new Venta();
            venta1 = Venta.builder()
                    .idArticulo(ventaDTO1.getIdArticulo())
                    .cantidades(ventaDTO1.getCantidades())
                    .valorUnitario(ventaDTO1.getValorUnitario())
                    .build();

            Articulo articulo = articuloRepository.getById(venta1.getIdArticulo());
            articulo.setCantidadArticulo(articulo.getCantidadArticulo() - venta1.getCantidades());
            articuloRepository.save(articulo);
            venta.add(venta1);
        });
        Long resultado = 0l;
        Movimiento movimiento = new Movimiento();

        for (int i = 0; i < venta.size(); i++) {
            resultado += venta.get(i).getValorUnitario() * venta.get(i).getCantidades();
            movimiento.setValorTotal(resultado);

        }
        movimiento.setIdCliente(idCliente);
        movimiento.setFechaRegristro(LocalDateTime.now().toString());
    }
}
