package cr.ac.ucr.paraiso.lenguajes.servlets;

import jakarta.servlet.http.HttpServlet;

public class InsertarParqueNacionalServlet extends HttpServlet {
    
    private Set<Provincia> provincias;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        provincias = new HashSet<>();
        provincias.add(new Provincia(1, "San José"));
        provincias.add(new Provincia(2, "Alajuela"));
        provincias.add(new Provincia(3, "Cartago"));
        provincias.add(new Provincia(4, "Heredia"));

        req.setAttribute("provincias", provincias);
        req.getRequestDispatcher("/WEB-INF/insertar_parque.jsp").forward(req, resp);
    }
}
