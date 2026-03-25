package o;

/* JADX INFO: renamed from: o.yyd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58297yyd {
    public static final InterfaceC58224yxJ<java.lang.Object, java.lang.Object> copydefault = new Application();

    public static int AEQbTJ(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public static int copydefault(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static <T> InterfaceC58224yxJ<T, T> copydefault() {
        return (InterfaceC58224yxJ<T, T>) copydefault;
    }

    private C58297yyd() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> T AEQbTJ(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static boolean AEQbTJ(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int OLrzqt(int i, java.lang.String str) {
        if (i > 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(str + " > 0 required but it was " + i);
    }

    public static long KWHzl(long j, java.lang.String str) {
        if (j > 0) {
            return j;
        }
        throw new java.lang.IllegalArgumentException(str + " > 0 required but it was " + j);
    }

    /* JADX INFO: renamed from: o.yyd$Application */
    public static final class Application implements InterfaceC58224yxJ<java.lang.Object, java.lang.Object> {
        @Override // o.InterfaceC58224yxJ
        public boolean AEQbTJ(java.lang.Object obj, java.lang.Object obj2) {
            return C58297yyd.AEQbTJ(obj, obj2);
        }
    }
}
