package com.engagelab.privates.common.utils;

/* JADX INFO: loaded from: classes14.dex */
public class ReflectUtil {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void checkNull(Object obj) throws Exception {
        if (obj == null) {
            throw new Exception("owner can not be null");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void checkNum(Class<?>[] clsArr, Object[] objArr) throws Exception {
        if ((objArr != null ? objArr.length : 0) != (clsArr != null ? clsArr.length : 0)) {
            throw new Exception("argClasses' size is not equal to args' size");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> T invokeConstructor(Class<T> cls, Object[] objArr, Class<?>[] clsArr) throws Exception {
        checkNull(cls);
        checkNum(clsArr, objArr);
        return cls.getConstructor(clsArr).newInstance(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object invokeStaticMethod(Class<?> cls, String str, Object[] objArr, Class[] clsArr) throws Exception {
        checkNull(cls);
        checkNum(clsArr, objArr);
        return cls.getMethod(str, clsArr).invoke(cls, objArr);
    }
}
