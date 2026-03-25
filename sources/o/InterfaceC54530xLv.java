package o;

import com.okinc.unify_trade.biz.BizInstrument;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xLv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC54530xLv {
    BizInstrument EZpvd();

    /* JADX INFO: renamed from: o.xLv$TaskDescription */
    public static final class TaskDescription {
        public static java.lang.String copydefault(@NotNull InterfaceC54530xLv interfaceC54530xLv) {
            java.lang.String instId;
            BizInstrument bizInstrumentEZpvd = interfaceC54530xLv.EZpvd();
            return (bizInstrumentEZpvd == null || (instId = bizInstrumentEZpvd.getInstId()) == null) ? "" : instId;
        }

        public static java.lang.String AEQbTJ(@NotNull InterfaceC54530xLv interfaceC54530xLv) {
            java.lang.String instType;
            BizInstrument bizInstrumentEZpvd = interfaceC54530xLv.EZpvd();
            return (bizInstrumentEZpvd == null || (instType = bizInstrumentEZpvd.getInstType()) == null) ? "" : instType;
        }

        public static java.lang.String KWHzl(@NotNull InterfaceC54530xLv interfaceC54530xLv) {
            BizInstrument bizInstrumentEZpvd = interfaceC54530xLv.EZpvd();
            if (bizInstrumentEZpvd != null) {
                return bizInstrumentEZpvd.getDisplayQuoteSymbol();
            }
            return null;
        }

        public static java.lang.String OLrzqt(@NotNull InterfaceC54530xLv interfaceC54530xLv) {
            BizInstrument bizInstrumentEZpvd = interfaceC54530xLv.EZpvd();
            if (bizInstrumentEZpvd != null) {
                return bizInstrumentEZpvd.getTradeSymbol();
            }
            return null;
        }
    }
}
