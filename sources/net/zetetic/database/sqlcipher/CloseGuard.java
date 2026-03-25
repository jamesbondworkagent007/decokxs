package net.zetetic.database.sqlcipher;

/* JADX INFO: loaded from: classes13.dex */
public final class CloseGuard {
    public Throwable OLrzqt;
    public static final CloseGuard AEQbTJ = new CloseGuard();
    public static volatile boolean KWHzl = true;
    public static volatile Reporter EZpvd = new DefaultReporter();

    public interface Reporter {
        void EZpvd(String str, Throwable th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault() {
        this.OLrzqt = null;
    }

    public static CloseGuard EZpvd() {
        return !KWHzl ? AEQbTJ : new CloseGuard();
    }

    private CloseGuard() {
    }

    public void KWHzl(String str) {
        if (str == null) {
            throw new NullPointerException("closer == null");
        }
        if (this == AEQbTJ || !KWHzl) {
            return;
        }
        this.OLrzqt = new Throwable("Explicit termination method '" + str + "' not called");
    }

    public void AEQbTJ() {
        if (this.OLrzqt == null || !KWHzl) {
            return;
        }
        EZpvd.EZpvd("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", this.OLrzqt);
    }

    public static final class DefaultReporter implements Reporter {
        @Override // net.zetetic.database.sqlcipher.CloseGuard.Reporter
        public void EZpvd(String str, Throwable th) {
        }

        private DefaultReporter() {
        }
    }
}
