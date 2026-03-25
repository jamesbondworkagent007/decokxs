package o;

/* JADX INFO: renamed from: o.thD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46966thD implements InterfaceC46969thG {
    public static final C46966thD EZpvd = new C46966thD();

    private C46966thD() {
    }

    @Override // o.InterfaceC46969thG
    public InterfaceC46999thk OLrzqt() {
        try {
            java.lang.System.loadLibrary("collection_v3");
            return C47000thl.KWHzl;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        } catch (java.lang.UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
