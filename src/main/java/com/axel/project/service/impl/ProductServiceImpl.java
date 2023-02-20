package com.axel.project.service.impl;

import com.axel.project.entity.Producto;
import com.axel.project.repository.ProductoRepository;
import com.axel.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    public ProductoRepository productoRepository;

    @Override
    public void persistProduct(List<Object> listaUnProducto) {

        Producto producto = new Producto();
        for (int j=0; j < listaUnProducto.size(); j++) {
            switch (j) {
                case 0:
                    producto.setCodigo(listaUnProducto.get(j).toString());
                    break;
                case 1:
                    producto.setDescripcion(listaUnProducto.get(j).toString());
                    break;
                case 2:
                    producto.setCantidad((Double) listaUnProducto.get(j));
                    break;
                case 3:
                    producto.setPrecioUnitario((Double)listaUnProducto.get(j));
                    break;
                case 4:
                    producto.setTotal((Double) listaUnProducto.get(j));
                    break;
            }
        }
        productoRepository.save(producto);

    }
}
