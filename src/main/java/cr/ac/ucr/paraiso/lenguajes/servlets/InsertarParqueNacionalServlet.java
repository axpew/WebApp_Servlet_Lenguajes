package cr.ac.ucr.paraiso.lenguajes.servlets;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import cr.ac.ucr.paraiso.lenguajes.domain.ParqueNacional;
import cr.ac.ucr.paraiso.lenguajes.domain.Provincia;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "InsertarParqueNacionalServlet", urlPatterns = {"/insertarParque"})
public class InsertarParqueNacionalServlet extends HttpServlet {
    
    private Set<Provincia> provincias;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
    throws ServletException, IOException {
        provincias = new HashSet<>();
        provincias.add(new Provincia(1, "San José"));
        provincias.add(new Provincia(2, "Alajuela"));
        provincias.add(new Provincia(3, "Cartago"));
        provincias.add(new Provincia(4, "Heredia"));

        req.setAttribute("provincias", provincias);
        req.getRequestDispatcher("/WEB-INF/insertar_parque.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        ParqueNacional parqueNacional = new ParqueNacional();
        parqueNacional.setIdParqueNacional(Integer.parseInt(req.getParameter("idParque")));
        parqueNacional.setNombre(req.getParameter("nombre"));
        int idProvincia = Integer.parseInt(req.getParameter("idProvincia"));
        Provincia provincia = new Provincia();
        provincia.setId(idProvincia);
        parqueNacional.setProvincia(provincia); 
        // TODO: Aquí se podría guardar el parque nacional en una base de datos o en memoria  
        
        req.setAttribute("id", parqueNacional.getIdParqueNacional());
        req.setAttribute("nombre", parqueNacional.getNombre());
        req.getRequestDispatcher("/ver_parque.jsp").forward(req, resp);
    }