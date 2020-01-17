package dev.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlatDaoJdbc implements IPlatDao {

	// outil JdbcTemplate fourni par Spring JDBC
	private JdbcTemplate jdbcTemplate;

@Autowired	// injection de la source de données
	public PlatDaoJdbc(DataSource datasource) {
	this.jdbcTemplate = new JdbcTemplate(datasource);
	}
@Override
	public List<Plat> listePlats() {
		String sql = "SELECT * FROM PLAT";
		// exécution de la requête et récupération du résultat
		List<Plat> plats = jdbcTemplate.query(sql, new PlatMapper());
		return plats;

}
