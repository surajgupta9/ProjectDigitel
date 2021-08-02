package in.digitel.capp.rm;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import in.digitel.capp.domain.Contact;

/**
 *
 * @author Vikram
 */
public class ContactRowMapper implements RowMapper<Contact>{
    @Override
    public Contact mapRow(ResultSet rs, int i) throws SQLException {
        Contact c=new Contact();
        c.setContactId(rs.getInt("contactId"));
        c.setUserId(rs.getInt("userId"));
        c.setName(rs.getString("name"));
        c.setEmail(rs.getString("email"));
        c.setAddress(rs.getString("address"));       
        c.setPhone(rs.getString("phone"));       
        c.setRemark(rs.getString("remark"));               
        return c;
    }
    
}
