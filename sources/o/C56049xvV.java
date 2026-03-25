package o;

import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56049xvV {
    public static final java.lang.String EZpvd(@NotNull GridReq gridReq) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(gridReq, "");
        java.lang.String tpTriggerPx = gridReq.getTpTriggerPx();
        java.lang.String slTriggerPx = gridReq.getSlTriggerPx();
        if (tpTriggerPx != null && tpTriggerPx.length() != 0) {
            if (C33129mqd.AEQbTJ(slTriggerPx, 0) && C33129mqd.valueOf(tpTriggerPx, slTriggerPx)) {
                return C33070mpX.AYXKKw(C55688xof.Application.QfZsXX);
            }
            xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
            if (value == null || (strAYXKKw = value.AYXKKw()) == null) {
                strAYXKKw = "";
            }
            if (C33129mqd.AEQbTJ(strAYXKKw, 0) && C33129mqd.valueOf(tpTriggerPx, strAYXKKw)) {
                return C33070mpX.AYXKKw(C55688xof.Application.QsIRgs);
            }
        }
        return "";
    }

    public static final java.lang.String KWHzl(@NotNull GridReq gridReq) {
        Intrinsics.checkNotNullParameter(gridReq, "");
        java.lang.String tpTriggerPx = gridReq.getTpTriggerPx();
        java.lang.String slTriggerPx = gridReq.getSlTriggerPx();
        return (slTriggerPx == null || slTriggerPx.length() == 0 || !C33129mqd.AEQbTJ(tpTriggerPx, 0) || !C33129mqd.copydefault(slTriggerPx, tpTriggerPx)) ? "" : C33070mpX.AYXKKw(C55688xof.Application.QOjuYg);
    }

    public static final java.lang.String OLrzqt(@NotNull GridReq gridReq) {
        Intrinsics.checkNotNullParameter(gridReq, "");
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AuCTelauCTel(gridReq.getSignParams());
        if (!Intrinsics.EZpvd((java.lang.Object) advancedTriggerSign.getIndicator(), (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            return "";
        }
        java.lang.String triggerPx = advancedTriggerSign.getTriggerPx();
        if (C33129mqd.valueOf(triggerPx, 0)) {
            return C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImpl);
        }
        if (C33129mqd.AEQbTJ(gridReq.getMinPx(), 0) && C33129mqd.valueOf(triggerPx, gridReq.getMinPx())) {
            return C33070mpX.AYXKKw(C55688xof.Application.iLAtSv);
        }
        return (C33129mqd.AEQbTJ(gridReq.getTpTriggerPx(), 0) && C33129mqd.copydefault(triggerPx, gridReq.getTpTriggerPx())) ? C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallbackMessageHandler) : "";
    }
}
