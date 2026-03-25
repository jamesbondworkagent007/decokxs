package o;

/* JADX INFO: renamed from: o.yvE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58113yvE {
    public static <T> T copydefault(java.lang.Object obj, java.lang.Class<T> cls) {
        if (obj instanceof InterfaceC58210yww) {
            if (obj instanceof InterfaceC58207ywt) {
                C58209ywv.copydefault(!AEQbTJ(cls, "dagger.hilt.android.EarlyEntryPoint"), "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
            }
            return cls.cast(obj);
        }
        if (obj instanceof InterfaceC58206yws) {
            return (T) copydefault(((InterfaceC58206yws) obj).aA_(), cls);
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("Given component holder %s does not implement %s or %s", obj.getClass(), InterfaceC58210yww.class, InterfaceC58206yws.class));
    }

    public static boolean AEQbTJ(java.lang.Class<?> cls, java.lang.String str) {
        for (java.lang.annotation.Annotation annotation : cls.getAnnotations()) {
            if (annotation.annotationType().getCanonicalName().contentEquals(str)) {
                return true;
            }
        }
        return false;
    }

    private C58113yvE() {
    }
}
