package myspring.user.dao.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;

import myspring.user.vo.MemberVO;
import myspring.user.vo.UserVO;

//@MyMapper
@Mapper
public interface MemberMapper {
	//@Select("select * from users where userid=#{id}")
	//UserVO selectUserById(@Param("id") String id);
//	MemberVO selectUserById(String id);
//	List<MemberVO> selectUserList();
	void insertUser(MemberVO memberVO);
//	void updateUser(MemberVO memberVO);
//	void deleteUser(String id);
}