package SpringBootMybatis.hellodb.util;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

public class ReqRespUtil {
	private static String runMode="debug";

	public static final String KEY_DATA = "data";
	public static final String KEY_TIMESTAMP = "timestamp";
	public static final String KEY_STATUS = "status";
	public static final String KEY_ERROR = "error";
	public static final String KEY_EXCEPTION = "exception";
	public static final String KEY_MESSAGE = "message";

	public static final int DEFAULT_STATUS_CODE = 200; 
	public static final String DEFAULT_MESSAGE = "OK";
	public static final String MODE_DEBUG = "debug";

	public static Object makeOKResp(HttpServletRequest request, Object data) {
		if(runMode.equals(MODE)) {
		ErrorAttributes rawAttrs = new DefaultErrorAttribute();
		RequestAttributes requestAttributes = new ServletAttributes(request);
		Map<String, Object> respAttrs = rawAttrs.getErrorAttributes(requestAttributes, false);
		respAttrs.put(KEY_DATA, data);
		respAttrs.put(KEY_STATUS, DEFAULT_STATUS_CODE);
		respAttrs.put(KEY_MESSAGE, DEFAULT_MESSAGE);
		return respAttrs;
		}
		return data;
	}
