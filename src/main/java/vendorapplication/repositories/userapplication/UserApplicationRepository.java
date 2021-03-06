package vendorapplication.repositories.userapplication;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vendorapplication.entities.UserApplicationEntity;
import java.util.List;

@Repository
public interface UserApplicationRepository extends CrudRepository<UserApplicationEntity,Integer>, UserApplicationRepositoryCustom {

    @Query(value = "SELECT app_id, users.firstname, users.lastname, users.mobile_number, mst_category.category_name, subcategory_name ,user_application.user_id,applicationstatus FROM user_application INNER JOIN mst_category ON user_application.category_id = mst_category.category_id INNER JOIN mst_subcategory ON user_application.subcategory_id = mst_subcategory.subcategory_id INNER JOIN users ON user_application.user_id = users.user_id WHERE user_application.state_id = :state AND user_application.district_id = :district  AND user_application.active = true  order by user_application.createddate desc", nativeQuery = true)
    List<Object[]> getApplicationsLocationWise(@Param("state")Integer state, @Param("district") Integer district);

    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE user_application  set applicationstatus =:action   where app_id =:app_id", nativeQuery = true )
    int updateApplicationByDc(Integer app_id, String action);

    @Query(value = "SELECT app_id, users.firstname, users.lastname, users.mobile_number, mst_category.category_name, subcategory_name ,user_application.user_id,applicationstatus FROM user_application INNER JOIN mst_category ON user_application.category_id = mst_category.category_id INNER JOIN mst_subcategory ON user_application.subcategory_id = mst_subcategory.subcategory_id INNER JOIN users ON user_application.user_id = users.user_id WHERE user_application.state_id = :stateId AND user_application.district_id =:districtId  AND user_application.active = true AND user_application.applicationstatus =:status  order by user_application.createddate  desc", nativeQuery = true)
    List<Object[]> getApplicationsLocationWiseStatus(@Param("stateId") Integer stateId, @Param("districtId") Integer districtId, @Param("status") String status);

    @Query(value = "SELECT app_id, users.firstname, users.lastname, users.mobile_number, mst_category.category_name, subcategory_name ,user_application.user_id,applicationstatus FROM user_application INNER JOIN mst_category ON user_application.category_id = mst_category.category_id INNER JOIN mst_subcategory ON user_application.subcategory_id = mst_subcategory.subcategory_id INNER JOIN users ON user_application.user_id = users.user_id WHERE user_application.state_id = :stateId AND user_application.district_id =:districtId  AND user_application.active = true AND user_application.applicationstatus =:status  AND user_application.subcategory_id =:appId order by user_application.createddate  desc", nativeQuery = true)
    List<Object[]> getApplicationsLocationWiseStatusPcb(@Param("stateId") Integer stateId, @Param("districtId") Integer districtId, @Param("status") String status , @Param("appId") Integer appID);

    @Query(value = "SELECT app_id, users.firstname, users.lastname, users.mobile_number, mst_category.category_name, subcategory_name ,user_application.user_id,applicationstatus FROM user_application INNER JOIN mst_category ON user_application.category_id = mst_category.category_id INNER JOIN mst_subcategory ON user_application.subcategory_id = mst_subcategory.subcategory_id INNER JOIN users ON user_application.user_id = users.user_id WHERE user_application.state_id = :state AND user_application.district_id = :district  AND user_application.active = true AND user_application.subcategory_id =:appID order by user_application.createddate desc", nativeQuery = true)
    List<Object[]> getApplicationsLocationWisePcb(@Param("state")Integer state, @Param("district") Integer district,@Param("appID") Integer appId);

    //PCB Only In Case of Tent
    @Query(value = "SELECT count(*) FROM user_application INNER JOIN users ON users.user_id = user_application.user_id WHERE users.mobile_number =:mobile AND user_application.active = true  AND user_application.app_id =:appId", nativeQuery = true)
    Integer countApplicationsViaAppIs(@Param("mobile") Long mobile, @Param("appId")  Integer appId);



}
