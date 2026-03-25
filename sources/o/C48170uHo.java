package o;

import androidx.camera.video.AudioStats;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uHo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48170uHo {
    public static final C48170uHo copydefault = new C48170uHo();

    private C48170uHo() {
    }

    public final InterfaceC48173uHr OLrzqt(@NotNull StrategyDetailsResponse strategyDetailsResponse, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        java.lang.Object next;
        C48179uHx c48179uHx;
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2");
        java.lang.String lever = strategyDetailsResponse.getLever();
        java.lang.String direction = strategyDetailsResponse.getDirection();
        java.lang.String lastPrice = strategyDetailsResponse.getLastPrice();
        java.lang.String str4 = lastPrice == null ? "" : lastPrice;
        java.lang.String instId = strategyDetailsResponse.getInstId();
        java.lang.String instType = strategyDetailsResponse.getInstType();
        java.lang.String orderType = strategyDetailsResponse.getOrderType();
        boolean zEZpvd2 = Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2");
        boolean z2 = z && !Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getCopyType(), (java.lang.Object) "2") && !Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getState(), (java.lang.Object) "no_close_position") && Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getOrderType(), (java.lang.Object) "spot_dca");
        java.lang.String tradeQuoteCcy = strategyDetailsResponse.getTradeQuoteCcy();
        java.lang.Object obj = null;
        if (tradeQuoteCcy == null) {
            tradeQuoteCcy = null;
        } else if (tradeQuoteCcy.length() == 0) {
            tradeQuoteCcy = strategyDetailsResponse.getInvestmentCcy();
        }
        C48169uHn c48169uHn = new C48169uHn(str, instId, instType, orderType, str4, direction, lever, str3, str2, tradeQuoteCcy == null ? "" : tradeQuoteCcy, zEZpvd2, z2, z);
        if (!zEZpvd) {
            java.lang.String pxSteps = strategyDetailsResponse.getPxSteps();
            java.lang.String tpPct = strategyDetailsResponse.getTpPct();
            java.lang.String initPx = strategyDetailsResponse.getInitPx();
            java.lang.String initOrdAmt = strategyDetailsResponse.getInitOrdAmt();
            java.lang.String safetyOrdAmt = strategyDetailsResponse.getSafetyOrdAmt();
            java.lang.String maxSafetyOrds = strategyDetailsResponse.getMaxSafetyOrds();
            java.lang.String pxStepsMult = strategyDetailsResponse.getPxStepsMult();
            java.lang.String volMult = strategyDetailsResponse.getVolMult();
            java.util.List<DcaTriggerParam> triggerParams = strategyDetailsResponse.getTriggerParams();
            if (triggerParams == null) {
                triggerParams = yDY.AhwBna();
            }
            java.util.Iterator<T> it = triggerParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DcaTriggerParam) next).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                    break;
                }
            }
            DcaTriggerParam dcaTriggerParam = (DcaTriggerParam) next;
            if (dcaTriggerParam == null) {
                dcaTriggerParam = new DcaTriggerParam((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1023, (DefaultConstructorMarker) null);
            }
            C48179uHx c48179uHx2 = new C48179uHx(dcaTriggerParam.getTriggerStrategy(), dcaTriggerParam.getTriggerCond(), dcaTriggerParam.getTriggerPx(), strategyDetailsResponse.getOrderType(), true, strategyDetailsResponse.getInvestmentCcy());
            if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getOrderType(), (java.lang.Object) "contract_dca")) {
                java.util.List<DcaTriggerParam> triggerParams2 = strategyDetailsResponse.getTriggerParams();
                if (triggerParams2 == null) {
                    triggerParams2 = yDY.AhwBna();
                }
                java.util.Iterator<T> it2 = triggerParams2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((DcaTriggerParam) next2).getTriggerAction(), (java.lang.Object) "stop")) {
                        obj = next2;
                        break;
                    }
                }
                DcaTriggerParam dcaTriggerParam2 = (DcaTriggerParam) obj;
                if (dcaTriggerParam2 == null) {
                    dcaTriggerParam2 = new DcaTriggerParam((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1023, (DefaultConstructorMarker) null);
                }
                c48179uHx = new C48179uHx(dcaTriggerParam2.getTriggerStrategy(), dcaTriggerParam2.getTriggerCond(), dcaTriggerParam2.getTriggerPx(), "contract_dca", false, strategyDetailsResponse.getInvestmentCcy());
            } else {
                c48179uHx = null;
            }
            return new C48171uHp(c48169uHn, initPx, pxSteps, tpPct, initOrdAmt, safetyOrdAmt, maxSafetyOrds, pxStepsMult, volMult, z, c48179uHx2, c48179uHx, new C48180uHy(strategyDetailsResponse.getOrderType(), strategyDetailsResponse.getSlPct(), strategyDetailsResponse.getSlMode()));
        }
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Double.valueOf(C56548yJl.KWHzl(C33129mqd.AEQbTJ(C33129mqd.mulS$default(strategyDetailsResponse.getTotalPnl(), strategyDetailsResponse.getProfitSharingRatio(), null, null, null, 14, null)), AudioStats.AUDIO_AMPLITUDE_NONE)));
        java.lang.String profitSharingRatio = strategyDetailsResponse.getProfitSharingRatio();
        return new C48176uHu(c48169uHn, strGEmmrt, profitSharingRatio != null ? profitSharingRatio : "", strategyDetailsResponse.getTrackingMode());
    }
}
