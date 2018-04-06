package com.bitcamp.web.common;

import java.util.Map;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component @Lazy	//component는 getter setter는 필요없지만 lazy 로딩은 필요하다
public interface CRUDService {
	@FunctionalInterface public static interface Post{
		public void execute(Map<?,?> paramMap);
	};
	@FunctionalInterface public static interface Get{
		public Object execute(Map<?,?> paramMap);
	};
	@FunctionalInterface public static interface Count{
		public int execute(Map<?,?> paramMap);
	}
	@FunctionalInterface public static interface List{
		public List execute(Map<?,?> paramMap);
	}
	@FunctionalInterface public static interface Update{
		public void execute(Map<?,?> paramMap);
	};
	@FunctionalInterface public static interface Delete{
		public void execute(Map<?,?> paramMap);
	};
	
}
