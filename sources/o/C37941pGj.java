package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;

/* JADX INFO: renamed from: o.pGj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37941pGj {
    public static final java.lang.String EZpvd(BizInstrument bizInstrument) {
        return ((bizInstrument instanceof SpotInstrument) && C33129mqd.OLrzqt((java.lang.CharSequence) ((SpotInstrument) bizInstrument).getLevel()) && C55608xnE.EZpvd()) ? "MARGIN" : "SPOT";
    }
}
