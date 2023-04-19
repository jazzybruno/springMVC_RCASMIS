/**
 * 
 */
package rw.ac.rca.webapp.dao;

import java.util.List;

import rw.ac.rca.webapp.orm.Address;

/**
 * @author Aphrodice Rwagaju
 *
 */
public interface AddressDAO {
	public Address saveAddress(Address address);
	public Address updateAddress(Address address);
	public Address saveOrUpdateAddress(Address address);
	public boolean deleteAddress(Address address);
	public Address getAddressById(int addressId);
	public List<Address> getAllAddresses();
}
