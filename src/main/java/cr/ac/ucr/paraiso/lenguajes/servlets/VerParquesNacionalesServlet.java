package cr.ac.ucr.paraiso.lenguajes.servlets;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import cr.ac.ucr.paraiso.lenguajes.domain.ParqueNacional;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "VerParquesNacionalesServlet", urlPatterns = {"/verParquesNacionales"})
public class VerParquesNacionalesServlet extends HttpServlet {

    private Set<ParqueNacional> parquesNacionales;

    @Override
    public void init() throws ServletException {
        super.init();
        parquesNacionales = new HashSet<>();
        ParqueNacional parque1 = new ParqueNacional();
        parque1.setIdParqueNacional(1);
        parque1.setNombre("Parque Nacional Volcán Poás");
        parquesNacionales.add(parque1);
        ParqueNacional parque2 = new ParqueNacional();
        parque2.setIdParqueNacional(2);
        parque2.setNombre("Parque Nacional Manuel Antonio");
        parquesNacionales.add(parque2);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        req.setAttribute("parquesNacionales", parquesNacionales);
        req.getRequestDispatcher("/WEB-INF/ver_parques_nacionales.jsp").forward(req, resp);
    }
}