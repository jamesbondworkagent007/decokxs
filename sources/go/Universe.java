package go;

import go.Seq;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Universe {
    public static native void _init();

    public static void touch() {
    }

    static {
        Seq.touch();
        _init();
    }

    private Universe() {
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class proxyerror extends Exception implements Seq.Proxy, error {
        private final int refnum;

        @Override // go.error
        public native String error();

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public proxyerror(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return error();
        }
    }
}
