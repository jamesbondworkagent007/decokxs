package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeExchangeDirection;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hgF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C22481hgF {
    public static final C22481hgF copydefault = new C22481hgF();

    private C22481hgF() {
    }

    public java.lang.String copydefault(@NotNull OrderDetailResult orderDetailResult, boolean z) {
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        if (C22689hkB.EZpvd.EZpvd(orderDetailResult.getTotalGasFee())) {
            return "--";
        }
        if (z) {
            return C23271hvA.getShowDataWithSymbol$default(C23271hvA.copydefault, orderDetailResult.getTotalGasFee(), orderDetailResult.getFeeToken(), false, RoundingMode.DOWN, false, false, 52, null);
        }
        return C23271hvA.getShowData$default(C23271hvA.copydefault, orderDetailResult.getTotalGasFee(), false, RoundingMode.DOWN, false, false, 26, null);
    }

    public java.lang.String AEQbTJ(@NotNull OrderDetailResult orderDetailResult) {
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        return C22689hkB.EZpvd.EZpvd(orderDetailResult.getTotalGasFeeUsdValue()) ? "" : C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, orderDetailResult.getTotalGasFeeUsdValue(), false, false, RoundingMode.DOWN, false, 22, null);
    }

    public java.lang.String OLrzqt(@NotNull OrderDetailResult orderDetailResult, boolean z) {
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        if (C22689hkB.EZpvd.EZpvd(orderDetailResult.getSurplus())) {
            return "--";
        }
        if (z) {
            C23271hvA c23271hvA = C23271hvA.copydefault;
            java.lang.String surplus = orderDetailResult.getSurplus();
            FromChildOrderDetailVO fromChildOrderDetailVO = orderDetailResult.getFromChildOrderDetailVO();
            java.lang.String fromTokenSymbol = fromChildOrderDetailVO != null ? fromChildOrderDetailVO.getFromTokenSymbol() : null;
            return C23271hvA.getShowDataWithSymbol$default(c23271hvA, surplus, fromTokenSymbol == null ? "" : fromTokenSymbol, false, RoundingMode.DOWN, false, false, 52, null);
        }
        return C23271hvA.getShowData$default(C23271hvA.copydefault, orderDetailResult.getSurplus(), false, RoundingMode.DOWN, false, false, 26, null);
    }

    public java.lang.String OLrzqt(@NotNull OrderDetailResult orderDetailResult) {
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        return C22689hkB.EZpvd.EZpvd(orderDetailResult.getSurplusUsdValue()) ? "" : C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, orderDetailResult.getSurplusUsdValue(), false, false, RoundingMode.DOWN, false, 22, null);
    }

    public java.lang.String AEQbTJ(@NotNull OrderDetailResult orderDetailResult, boolean z) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        java.lang.String triggerRate = orderDetailResult.getTriggerInfo().getTriggerRate();
        FromChildOrderDetailVO fromChildOrderDetailVO = orderDetailResult.getFromChildOrderDetailVO();
        java.lang.String fromTokenSymbol = fromChildOrderDetailVO != null ? fromChildOrderDetailVO.getFromTokenSymbol() : null;
        if (fromTokenSymbol == null) {
            fromTokenSymbol = "";
        }
        FromChildOrderDetailVO fromChildOrderDetailVO2 = orderDetailResult.getFromChildOrderDetailVO();
        java.lang.String toTokenSymbol = fromChildOrderDetailVO2 != null ? fromChildOrderDetailVO2.getToTokenSymbol() : null;
        java.lang.String str2 = toTokenSymbol != null ? toTokenSymbol : "";
        if (!z) {
            triggerRate = C23313hvq.divCheckS$default(1, triggerRate, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
        }
        java.lang.String showData$default = C23271hvA.getShowData$default(C23271hvA.copydefault, triggerRate, false, RoundingMode.DOWN, false, false, 18, null);
        if (C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf())) {
            if (z) {
                str = str2 + " " + showData$default + " = " + fromTokenSymbol + " 1";
            } else {
                str = fromTokenSymbol + " " + showData$default + "  = " + str2 + " 1";
            }
        } else if (z) {
            str = "1 " + fromTokenSymbol + " = " + showData$default + " " + str2;
        } else {
            str = "1 " + str2 + " = " + showData$default + " " + fromTokenSymbol;
        }
        return pTF.KWHzl.AEQbTJ(str);
    }

    public java.lang.String copydefault(@NotNull OrderDetailResult orderDetailResult) {
        java.lang.String tokenSymbol;
        java.lang.StringBuilder sb;
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        if (C22689hkB.EZpvd.EZpvd(orderDetailResult.getTransactionPrice())) {
            return "--";
        }
        if (orderDetailResult.getExchangeDirection() == LimitMemeExchangeDirection.BUY) {
            tokenSymbol = orderDetailResult.getToToken().getTokenSymbol();
        } else {
            tokenSymbol = orderDetailResult.getFromToken().getTokenSymbol();
        }
        java.lang.String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, orderDetailResult.getTransactionPrice(), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        if (C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf())) {
            sb = new java.lang.StringBuilder();
            sb.append(scientificCurrency$default);
            sb.append(" = ");
            sb.append(tokenSymbol);
            scientificCurrency$default = " 1";
        } else {
            sb = new java.lang.StringBuilder();
            sb.append("1 ");
            sb.append(tokenSymbol);
            sb.append(" = ");
        }
        sb.append(scientificCurrency$default);
        return pTF.KWHzl.AEQbTJ(sb.toString());
    }

    public java.lang.String EZpvd(@NotNull OrderDetailResult orderDetailResult, boolean z) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        java.lang.String transactionRate = orderDetailResult.getTransactionInfo().getTransactionRate();
        if (C22689hkB.EZpvd.EZpvd(transactionRate)) {
            return "--";
        }
        FromChildOrderDetailVO fromChildOrderDetailVO = orderDetailResult.getFromChildOrderDetailVO();
        java.lang.String fromTokenSymbol = fromChildOrderDetailVO != null ? fromChildOrderDetailVO.getFromTokenSymbol() : null;
        if (fromTokenSymbol == null) {
            fromTokenSymbol = "";
        }
        FromChildOrderDetailVO fromChildOrderDetailVO2 = orderDetailResult.getFromChildOrderDetailVO();
        java.lang.String toTokenSymbol = fromChildOrderDetailVO2 != null ? fromChildOrderDetailVO2.getToTokenSymbol() : null;
        java.lang.String str2 = toTokenSymbol != null ? toTokenSymbol : "";
        if (!z) {
            transactionRate = C23313hvq.divCheckS$default(1, transactionRate, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
        }
        java.lang.String showData$default = C23271hvA.getShowData$default(C23271hvA.copydefault, transactionRate, false, RoundingMode.DOWN, false, false, 18, null);
        if (C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf())) {
            if (z) {
                str = str2 + " " + showData$default + " = " + fromTokenSymbol + " 1";
            } else {
                str = fromTokenSymbol + " " + showData$default + " = " + str2 + " 1";
            }
        } else if (z) {
            str = "1 " + fromTokenSymbol + " = " + showData$default + " " + str2;
        } else {
            str = "1 " + str2 + " = " + showData$default + " " + fromTokenSymbol;
        }
        return pTF.KWHzl.AEQbTJ(str);
    }
}
