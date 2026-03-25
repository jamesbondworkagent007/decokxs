package o;

/* JADX INFO: renamed from: o.dmy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14521dmy {
    public static long copydefault;
    public static final C14521dmy EZpvd = new C14521dmy();
    public static long AEQbTJ = 600000;
    public static final int OLrzqt = 8;

    private C14521dmy() {
    }

    public final boolean EZpvd() {
        return java.lang.System.currentTimeMillis() - copydefault < AEQbTJ;
    }

    public final void KWHzl() {
        copydefault = java.lang.System.currentTimeMillis();
    }
}
