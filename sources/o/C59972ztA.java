package o;

/* JADX INFO: renamed from: o.ztA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C59972ztA implements InterfaceC59980ztI {
    public static final C59972ztA EZpvd = new C59972ztA();
    public static C60022zty copydefault;

    private C59972ztA() {
    }

    @Override // o.InterfaceC59980ztI
    public C60022zty copydefault() {
        C60022zty c60022zty = copydefault;
        if (c60022zty != null) {
            return c60022zty;
        }
        throw new java.lang.IllegalStateException("KoinApplication has not been started".toString());
    }
}
