package com.dx.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.beans.BeanCopier;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author dx
 * @create 2021/2/17 14:20
 * @for new
 */

public class BeanCopierUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(BeanCopierUtil.class);
    public static final ConcurrentHashMap<String, BeanCopier> BEAN_COPIER_MAP = new ConcurrentHashMap<>();

    public static String createKey(Class source, Class target) {
        return source.getName() + target.getName();
    }

    public static BeanCopier getBeanCopier(Class source, Class target) {
        String key = createKey(source, target);
        System.out.println("key : " + key);
        if (BEAN_COPIER_MAP.containsKey(key)) {
            LOGGER.info("get beancopier from map.....");
            return BEAN_COPIER_MAP.get(key);
        } else {
            BeanCopier beanCopier = BeanCopier.create(source, target, false);
            BEAN_COPIER_MAP.put(key, beanCopier);
            LOGGER.info("create a new  beancopier to map.....");
            return beanCopier;
        }
    }

    public static void copy(Object source, Object target) {
        BeanCopier beanCopier = getBeanCopier(source.getClass(), target.getClass());
        beanCopier.copy(source, target, null);
    }

}
