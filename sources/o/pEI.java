package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.core.util.SPUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class pEI {
    public static boolean AhwBna;
    public static final pEI EZpvd = new pEI();
    public static final MutableLiveData<java.lang.Integer> KWHzl = new MutableLiveData<>();
    public static java.lang.String OLrzqt = "";
    public static AtomicInteger copydefault = new AtomicInteger();
    public static AtomicInteger valueOf = new AtomicInteger();
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd() {
        AhwBna = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        OLrzqt = "KLINE_DETAILY";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return AhwBna;
    }

    private pEI() {
    }

    public final boolean OLrzqt() {
        return SPUtils.getBoolean("trade_kline_hide_state", false);
    }

    public final void AYXKKw() {
        copydefault.set(0);
    }

    public final boolean AEQbTJ() {
        return SPUtils.getBoolean("kline_tradding_state", false);
    }

    public final void KWHzl(boolean z) {
        SPUtils.put("kline_tradding_state", java.lang.Boolean.valueOf(z));
    }

    public final void gEmmrt() {
        valueOf.set(0);
    }
}
