package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Cliente;

public interface IclienteService {
	public List<Cliente>listar();
	public Optional<Cliente>listarId(int id);
	public int save(Cliente c);
	public void delete(int id);
}
