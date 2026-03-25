package o;

import com.okinc.buysell.data.BannerFlowType;
import com.okinc.okx.paymentapi.service.SupportBanner;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes15.dex */
public final class lTU {
    public static java.util.ArrayList<SupportBanner> EZpvd;
    public static final lTU OLrzqt = new lTU();
    public static java.util.Map<BannerFlowType, java.util.ArrayList<java.lang.Integer>> KWHzl = new LinkedHashMap();
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<BannerFlowType, java.util.ArrayList<java.lang.Integer>> EZpvd() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<SupportBanner> OLrzqt() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.util.ArrayList<SupportBanner> arrayList) {
        EZpvd = arrayList;
    }

    private lTU() {
    }
}
