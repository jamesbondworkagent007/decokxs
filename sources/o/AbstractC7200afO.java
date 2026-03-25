package o;

/* JADX INFO: renamed from: o.afO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC7200afO {

    @java.lang.Deprecated
    public int AEQbTJ;

    public AbstractC7200afO(int i) {
        this.AEQbTJ = i;
    }

    public static Application AEQbTJ() {
        return Application.OLrzqt;
    }

    /* JADX INFO: renamed from: o.afO$Application */
    public static final class Application extends AbstractC7200afO {
        public static final Application OLrzqt = new Application(0);
        public static final Application KWHzl = new Application(16384);

        public Application(int i) {
            super(i);
        }

        public Application KWHzl() {
            return new Application(C7014abO.AEQbTJ(this.AEQbTJ, 32));
        }

        public Application copydefault() {
            return new Application(this.AEQbTJ | 256);
        }
    }
}
