package o;

import com.okinc.unify_trade.biz.bot.TpSLTriggerItem;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55765xqC {
    public static final TpSlTriggerParamReqResp AEQbTJ(@NotNull TpSlTriggerParam tpSlTriggerParam) {
        java.lang.String stopType;
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        TpSlTriggerParamReqResp tpSlTriggerParamReqResp = new TpSlTriggerParamReqResp(tpSlTriggerParam.getStopType(), tpSlTriggerParam.getDelaySeconds(), (java.util.ArrayList) null, 4, (DefaultConstructorMarker) null);
        if (tpSlTriggerParam.getTp().getValue() != null && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tpSlTriggerParam.getTp().getIndicator()))) {
            tpSlTriggerParamReqResp.getTriggers().add(tpSlTriggerParam.getTp());
        }
        if (tpSlTriggerParam.getSl().getValue() != null && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tpSlTriggerParam.getSl().getIndicator()))) {
            tpSlTriggerParamReqResp.getTriggers().add(tpSlTriggerParam.getSl());
        }
        if (tpSlTriggerParamReqResp.getTriggers().isEmpty() || (stopType = tpSlTriggerParam.getStopType()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stopType)) {
            return null;
        }
        return tpSlTriggerParamReqResp;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TpSlTriggerParam OLrzqt(@NotNull TpSlTriggerParamReqResp tpSlTriggerParamReqResp) {
        java.lang.Object next;
        java.lang.Object next2;
        Intrinsics.checkNotNullParameter(tpSlTriggerParamReqResp, "");
        java.lang.String stopType = tpSlTriggerParamReqResp.getStopType();
        java.lang.String str = stopType != null ? stopType : "";
        java.lang.String delaySeconds = tpSlTriggerParamReqResp.getDelaySeconds();
        TpSLTriggerItem tpSLTriggerItem = null;
        if (delaySeconds == null) {
            delaySeconds = null;
        } else {
            if (!(!(C33129mqd.djBIcL(delaySeconds) == 0.0f))) {
            }
        }
        java.util.Iterator<T> it = tpSlTriggerParamReqResp.getTriggers().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((TpSLTriggerItem) next).getType(), (java.lang.Object) "tp")) {
                break;
            }
        }
        TpSLTriggerItem tpSLTriggerItem2 = (TpSLTriggerItem) next;
        if (tpSLTriggerItem2 != null) {
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tpSLTriggerItem2.getIndicator())) || !C33129mqd.OLrzqt((java.lang.CharSequence) tpSLTriggerItem2.getValue()) || C33129mqd.djBIcL(tpSLTriggerItem2.getValue()) == 0.0f) {
                tpSLTriggerItem2 = null;
            }
            if (tpSLTriggerItem2 == null) {
            }
        } else {
            tpSLTriggerItem2 = new TpSLTriggerItem("tp", SpotTpSlTypeConfigData.PRICE.getType(), (java.lang.String) null, 4, (DefaultConstructorMarker) null);
        }
        java.util.Iterator<T> it2 = tpSlTriggerParamReqResp.getTriggers().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((TpSLTriggerItem) next2).getType(), (java.lang.Object) "sl")) {
                break;
            }
        }
        TpSLTriggerItem tpSLTriggerItem3 = (TpSLTriggerItem) next2;
        if (tpSLTriggerItem3 != null) {
            if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tpSLTriggerItem3.getIndicator())) && C33129mqd.OLrzqt((java.lang.CharSequence) tpSLTriggerItem3.getValue()) && C33129mqd.djBIcL(tpSLTriggerItem3.getValue()) != 0.0f) {
                tpSLTriggerItem = tpSLTriggerItem3;
            }
            if (tpSLTriggerItem == null) {
            }
        } else {
            tpSLTriggerItem = new TpSLTriggerItem("sl", SpotTpSlTypeConfigData.PRICE.getType(), (java.lang.String) null, 4, (DefaultConstructorMarker) null);
        }
        return new TpSlTriggerParam(str, delaySeconds, tpSLTriggerItem2, tpSLTriggerItem);
    }
}
