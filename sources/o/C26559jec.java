package o;

import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C26559jec {
    public final long AEQbTJ;
    public final java.lang.String EZpvd;
    public final ProductDetailsByChain copydefault;

    public final void AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C27570jxg.investEvent$default("YieldDetails_Full_Button_Click", null, new Function1() { // from class: o.jeb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26559jec.KWHzl(this.copydefault, str, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(C26559jec c26559jec, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("investment_id", java.lang.String.valueOf(c26559jec.copydefault.OLrzqt()), false);
        eventParamsList.put("chain_id", C33129mqd.gEmmrt(c26559jec.copydefault), false);
        eventParamsList.put("source", c26559jec.EZpvd, true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        eventParamsList.put("duration", pTB.formatUpToMax$default(C33129mqd.EZpvd(java.lang.Double.valueOf((java.lang.System.currentTimeMillis() - c26559jec.AEQbTJ) / 1000.0d)), 1, null, 2, null), false);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackOpenDapp$default(C26559jec c26559jec, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c26559jec.OLrzqt(str, str2);
    }

    public final void OLrzqt(@NotNull final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C27570jxg.investEvent$default("YieldDetails_Mid_Protocol_Click", null, new Function1() { // from class: o.jef
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26559jec.OLrzqt(str, str2, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("protocol_page", str, false);
        if (str2 != null) {
            eventParamsList.put("protocol_id", str2, false);
        }
        return Unit.INSTANCE;
    }
}
