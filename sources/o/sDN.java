package o;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes10.dex */
public final class sDN {
    public static final sDN copydefault = new sDN();
    public static MainCoroutineDispatcher AEQbTJ = Dispatchers.getMain();
    public static CoroutineDispatcher gEmmrt = Dispatchers.getMain().getImmediate();
    public static CoroutineDispatcher OLrzqt = Dispatchers.getIO();
    public static CoroutineDispatcher EZpvd = Dispatchers.getDefault();
    public static CoroutineDispatcher AYXKKw = Dispatchers.getUnconfined();
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MainCoroutineDispatcher AEQbTJ() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher EZpvd() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher OLrzqt() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher copydefault() {
        return OLrzqt;
    }

    private sDN() {
    }
}
