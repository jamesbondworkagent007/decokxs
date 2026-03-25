package o;

/* JADX INFO: renamed from: o.zva, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60093zva {
    public static final java.util.Map<java.lang.Class, java.lang.Long> AEQbTJ = new android.util.ArrayMap(20);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int OLrzqt(java.lang.Class cls) {
        if (cls == java.lang.Boolean.TYPE || cls == java.lang.Byte.TYPE) {
            return 1;
        }
        if (cls == java.lang.Character.TYPE || cls == java.lang.Short.TYPE) {
            return 2;
        }
        return (cls == java.lang.Integer.TYPE || cls == java.lang.Float.TYPE) ? 4 : 8;
    }

    private C60093zva() {
    }

    public static long EZpvd(java.lang.Class cls) {
        long jAEQbTJ = AEQbTJ(cls) + 8;
        for (java.lang.Class superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            jAEQbTJ += AEQbTJ(superclass);
        }
        return jAEQbTJ;
    }

    public static long AEQbTJ(java.lang.Class cls) {
        long jOLrzqt;
        java.lang.Long l = AEQbTJ.get(cls);
        if (l != null) {
            return l.longValue();
        }
        long j = 0;
        for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
            java.lang.Class<?> type = field.getType();
            if ((type.getModifiers() & 8) != 8) {
                if (type.isPrimitive()) {
                    jOLrzqt = OLrzqt(type);
                } else {
                    jOLrzqt = type.isArray() ? 16L : 12L;
                }
                j += jOLrzqt;
            }
        }
        AEQbTJ.put(cls, java.lang.Long.valueOf(j));
        return j;
    }
}
