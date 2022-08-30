package online.marcoszinga.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import online.marcoszinga.portfolio.exceptions.UserNotFoundException;
import online.marcoszinga.portfolio.model.UsuarioModel;
import online.marcoszinga.portfolio.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }



    public UsuarioModel agregarUsuario(UsuarioModel usuarioModel){
        return usuarioRepository.save(usuarioModel);
    }

    public List<UsuarioModel> buscarUsuario(){
        return usuarioRepository.findAll();
    }

    public UsuarioModel buscarUsuarioPorId(Long id){
        return usuarioRepository.findById(id).orElseThrow(() ->new UserNotFoundException("Usuario no encontrado"));
    }
    
    public UsuarioModel editarUsuario(UsuarioModel usuarioModel){
        return usuarioRepository.save(usuarioModel);
    }

    public void borrarUsuario(Long id){
        usuarioRepository.deleteById(id);
    }
}
