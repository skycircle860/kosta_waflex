package kr.or.kosta.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.dto.SearchVO;

@Repository
public class MovieDao {
	@Autowired
	private SqlSessionTemplate ss;

	//������ �Ǳǰ���
	public int getMoviePurchaseCount_pastMonth() {
		return ss.selectOne("movie.moviepurchase_pastmonth");
	}

	public int getMoviePurchaseCount_thisMonth() {
		return ss.selectOne("movie.moviepurchase_thismonth");
		
	}
	//�ǱǱ��ž�
	public int getMovieCopyRightCost_pastMonth() {
		return ss.selectOne("movie.moviecopyrightcost_pastmonth");
	}
	public int getMovieCopyRightCost_thisMonth() {
		return ss.selectOne("movie.moviecopyrightcost_thismonth");
	}
	//�Ǹŷ�
	public int getMovieInvestment_pastMonth() {
		return ss.selectOne("movie.movieinvestment_pastmonth");
	}
	public int getMovieInvestment_thisMonth() {
		return ss.selectOne("movie.movieinvestment_thismonth");
	}
	
	public List<MovieVO> moviesearch(SearchVO sevo) {
		return ss.selectList("movie.search",sevo);
	}

}
