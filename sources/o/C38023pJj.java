package o;

/* JADX INFO: renamed from: o.pJj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C38023pJj {
    public static volatile C38023pJj KWHzl;
    public volatile Application AEQbTJ;
    public boolean OLrzqt = false;
    public boolean copydefault = false;

    /* JADX INFO: renamed from: o.pJj$Application */
    public interface Application {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(Application application) {
        this.AEQbTJ = application;
    }

    private C38023pJj() {
    }

    public static C38023pJj KWHzl() {
        if (KWHzl == null) {
            synchronized (C38023pJj.class) {
                if (KWHzl == null) {
                    KWHzl = new C38023pJj();
                }
            }
        }
        return KWHzl;
    }
}
