package cr.ac.ucr.paraiso.lenguajes.servlets;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

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
}