package com.yhcui.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * <p>TODO</p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author cuiyh9
 * @version 1.0
 * @Date Created in 2020年02月14日 00:21
 * @since 1.0
 */
@Documented
@Target(ElementType.METHOD)
public @interface ConsumePower {

    /**
     * 耗时，单位MS
     * @return
     */
    int elapsedTime() default 0;

    /**
     * 内存消耗,单位MB
     * @return
     */
    float memeory() default 0;
}
