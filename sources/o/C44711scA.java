package o;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: renamed from: o.scA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44711scA {
    public static final C44711scA EZpvd = new C44711scA();
    public static MainCoroutineDispatcher KWHzl = Dispatchers.getMain();
    public static CoroutineDispatcher AEQbTJ = Dispatchers.getIO();
    public static CoroutineDispatcher OLrzqt = Dispatchers.getDefault();
    public static CoroutineDispatcher AhwBna = Dispatchers.getUnconfined();
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher EZpvd() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MainCoroutineDispatcher KWHzl() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher OLrzqt() {
        return AEQbTJ;
    }

    private C44711scA() {
    }
}
