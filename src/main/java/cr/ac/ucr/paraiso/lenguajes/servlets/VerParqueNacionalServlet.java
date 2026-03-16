package cr.ac.ucr.paraiso.lenguajes.servlets;

import java.io.IOException;

import cr.ac.ucr.paraiso.lenguajes.domain.ParqueNacional;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "VerParqueNacionalServlet", urlPatterns = {"/verParque"})
public class VerParqueNacionalServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        String idParam = req.getParameter("id");
        int id = Integer.parseInt(idParam);
        
        // Simular búsqueda del parque
        ParqueNacional parque = new ParqueNacional();
        parque.setIdParqueNacional(id);
        
        if (id == 1) {
            parque.setNombre("Parque Nacional Volcán Poás");
        } else if (id == 2) {
            parque.setNombre("Parque Nacional Manuel Antonio");
        }
        
        req.setAttribute("parque", parque);
        req.getRequestDispatcher("/WEB-INF/ver_parque_nacional.jsp").forward(req, resp);
    }
}