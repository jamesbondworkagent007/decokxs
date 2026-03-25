package o;

/* JADX INFO: renamed from: o.zpD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59867zpD {
    private C59867zpD() {
    }

    public static final <E> E[] copydefault(E[] eArr, int i) {
        E[] eArr2 = (E[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(eArr.getClass().getComponentType(), i));
        if (i >= eArr.length) {
            i = eArr.length;
        }
        java.lang.System.arraycopy(eArr, 0, eArr2, 0, i);
        return eArr2;
    }

    public static final int[] KWHzl(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        if (i >= iArr.length) {
            i = iArr.length;
        }
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }
}
