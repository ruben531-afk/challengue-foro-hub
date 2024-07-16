package foroAlura.api.domain.topico;

import foroAlura.api.domain.curso.Curso;
import foroAlura.api.domain.status.StatusTopico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, LocalDateTime fechaCreacion,
                                   StatusTopico statusTopico, String usuarioNombre, Curso curso) {

    public DatosRespuestaTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getStatus(),
                //topico.getUsuario(),
                topico.getUsuario().getNombre(),
                topico.getCurso()
                );
    }
}
