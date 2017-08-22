package utils;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;

public class LogUtils {

	/**
	 * 代替Logger.debug方法
	 * 
	 * @param logger
	 * @param msg
	 */
	public static void debug(Logger logger, String msg) {
		if (logger.isDebugEnabled()) {
			logger.debug(msg);
		}
	}

	/**
	 * 代替Logger.debug方法
	 * 
	 * @param logger
	 * @param msg
	 * @param obj
	 */
	public static void debug(Logger logger, String msg, Object obj) {
		if (logger.isDebugEnabled()) {
			logger.debug(msg + " | " + JSON.toJSONString(obj));
		}
	}

	/**
	 * 代替Logger.debug方法
	 * 
	 * @param logger
	 * @param msg
	 * @param t
	 */
	public static void debug(Logger logger, String msg, Throwable t) {
		if (logger.isDebugEnabled()) {
			logger.debug(msg, t);
		}
	}

	/**
	 * 代替Logger.info方法
	 * 
	 * @param logger
	 * @param msg
	 */
	public static void info(Logger logger, String msg) {
		if (logger.isInfoEnabled()) {
			logger.info(msg);
		}
	}

	/**
	 * 代替Logger.info方法
	 * 
	 * @param logger
	 * @param msg
	 * @param obj
	 */
	public static void info(Logger logger, String msg, Object obj) {
		if (logger.isInfoEnabled()) {
			logger.info(msg + " | " + JSON.toJSONString(obj));
		}
	}

	/**
	 * 代替Logger.info方法
	 * 
	 * @param logger
	 * @param msg
	 * @param t
	 */
	public static void info(Logger logger, String msg, Throwable t) {
		if (logger.isInfoEnabled()) {
			logger.info(msg, t);
		}
	}

	/**
	 * 代替Logger.warn方法
	 * 
	 * @param logger
	 * @param msg
	 */
	public static void warn(Logger logger, String msg) {
		if (logger.isWarnEnabled()) {
			logger.warn(msg);
		}
	}

	/**
	 * 代替Logger.warn方法
	 * 
	 * @param logger
	 * @param msg
	 * @param obj
	 */
	public static void warn(Logger logger, String msg, Object obj) {
		if (logger.isWarnEnabled()) {
			logger.warn(msg + " | " + JSON.toJSONString(obj));
		}
	}

	/**
	 * 代替Logger.warn方法
	 * 
	 * @param logger
	 * @param msg
	 * @param t
	 */
	public static void warn(Logger logger, String msg, Throwable t) {
		if (logger.isWarnEnabled()) {
			logger.warn(msg, t);
		}
	}

	/**
	 * 代替Logger.error方法
	 * 
	 * @param logger
	 * @param msg
	 */
	public static void error(Logger logger, String msg) {
		if (logger.isErrorEnabled()) {
			logger.error(msg);
		}
	}

	/**
	 * 代替Logger.error方法
	 * 
	 * @param logger
	 * @param msg
	 * @param obj
	 */
	public static void error(Logger logger, String msg, Object obj) {
		if (logger.isErrorEnabled()) {
			logger.error(msg + " | " + JSON.toJSONString(obj));
		}
	}

	/**
	 * 代替Logger.error方法
	 * 
	 * @param logger
	 * @param msg
	 * @param t
	 */
	public static void error(Logger logger, String msg, Throwable t) {
		if (logger.isErrorEnabled()) {
			logger.error(msg, t);
		}
	}

	/**
	 * 代替Logger.trace方法
	 * 
	 * @param logger
	 * @param msg
	 */
	public static void trace(Logger logger, String msg) {
		if (logger.isTraceEnabled()) {
			logger.trace(msg);
		}
	}

	/**
	 * 代替Logger.trace方法
	 * 
	 * @param logger
	 * @param msg
	 */
	public static void trace(Logger logger, String msg, Object obj) {
		if (logger.isTraceEnabled()) {
			logger.trace(msg + " | " + JSON.toJSONString(obj));
		}
	}

	/**
	 * 代替Logger.trace方法
	 * 
	 * @param logger
	 * @param msg
	 * @param t
	 */
	public static void trace(Logger logger, String msg, Throwable t) {
		if (logger.isTraceEnabled()) {
			logger.trace(msg, t);
		}
	}

}
