package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.uIq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C48199uIq implements Function0 {
    public static int AEQbTJ;
    public static int copydefault;
    public final /* synthetic */ wUK OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.uIl.EZpvd(com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartViewModel$TaskDescription):void] */
    public /* synthetic */ C48199uIq(wUK wuk) {
        this.OLrzqt = wuk;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.uIl.OLrzqt(o.wUK):kotlin.Unit */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        return C48194uIl.EZpvd(this.OLrzqt);
    }

    public static int KWHzl() {
        int i = copydefault;
        int i2 = i % 8689371;
        copydefault = i + 1;
        if (i2 != 0) {
            return AEQbTJ;
        }
        int iMaxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
        AEQbTJ = iMaxMemory;
        return iMaxMemory;
    }
}
