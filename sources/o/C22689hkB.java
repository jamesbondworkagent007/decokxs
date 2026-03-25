package o;

import androidx.collection.ArrayMapKt;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hkB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C22689hkB {
    public static final C22689hkB EZpvd = new C22689hkB();

    private C22689hkB() {
    }

    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull OrderDetailBean orderDetailBean, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        return getValueContentByStatus$default(this, str, orderDetailBean.getStatus(), orderDetailBean.getNetworkFee(), copydefault(str, orderDetailBean), z, true, false, null, 192, null);
    }

    public java.lang.String copydefault(@NotNull java.lang.String str, @NotNull OrderDetailBean orderDetailBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        return orderDetailBean.getFromNetworkFeeSymbol();
    }

    public java.lang.String OLrzqt(@NotNull OrderDetailBean orderDetailBean) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        boolean zCopydefault = C22822hmc.copydefault(false, orderDetailBean.getStatus());
        if (!orderDetailBean.isSingleSwapStyle() && !orderDetailBean.isGasStation()) {
            return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.getFlagsMask, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("chainName", orderDetailBean.getFromChainName())));
        }
        if (!zCopydefault) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.PlaybackStateCompatApi22);
        }
        return C33070mpX.AYXKKw(C23274hvD.Fragment.subscribe);
    }

    public java.lang.String EZpvd(@NotNull OrderDetailBean orderDetailBean) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        return (EZpvd(orderDetailBean.getNetworkFee()) || orderDetailBean.getFromGasTokenPriceUsd().length() == 0) ? "" : C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, C23313hvq.mulCheckS$default(orderDetailBean.getFromGasTokenPriceUsd(), orderDetailBean.getNetworkFee(), null, null, null, 14, null), false, false, RoundingMode.DOWN, false, 22, null);
    }

    public java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull OrderDetailBean orderDetailBean, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        java.lang.String bridgeFromTokenSymbol = orderDetailBean.getBridgeFromTokenSymbol();
        return getValueContentByStatus$default(this, str, orderDetailBean.getStatus(), orderDetailBean.getOtherFees(), bridgeFromTokenSymbol != null ? bridgeFromTokenSymbol : "", z, true, false, null, 192, null);
    }

    public java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull OrderDetailBean orderDetailBean, boolean z) {
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        java.lang.String bridgeToTokenSymbol = orderDetailBean.getBridgeToTokenSymbol();
        java.lang.String valueContentByStatus$default = getValueContentByStatus$default(this, str, orderDetailBean.getStatus(), orderDetailBean.getBridgeFee(), bridgeToTokenSymbol == null ? "" : bridgeToTokenSymbol, z, true, false, null, 192, null);
        if (orderDetailBean.getBridgeFee().length() == 0) {
            return "--";
        }
        if (orderDetailBean.getBridgeFeeUsd().length() != 0) {
            str2 = " (" + C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, orderDetailBean.getBridgeFeeUsd(), false, false, RoundingMode.DOWN, false, 22, null) + ")";
        }
        return valueContentByStatus$default + str2;
    }

    public final java.lang.String copydefault(@NotNull OrderDetailBean orderDetailBean) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        C23271hvA c23271hvA = C23271hvA.copydefault;
        java.lang.String estimateBridgeFeeAmount = orderDetailBean.getEstimateBridgeFeeAmount();
        java.lang.String nativeTokenSymbol = orderDetailBean.getNativeTokenSymbol();
        RoundingMode roundingMode = RoundingMode.DOWN;
        return C23271hvA.getShowDataWithSymbol$default(c23271hvA, estimateBridgeFeeAmount, nativeTokenSymbol, false, roundingMode, false, false, 52, null) + " (" + (orderDetailBean.getEstimateBridgeFeeAmountUsd().length() == 0 ? "--" : C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, orderDetailBean.getEstimateBridgeFeeAmountUsd(), false, false, roundingMode, false, 22, null)) + ")";
    }

    public java.lang.String copydefault(@NotNull java.lang.String str, @NotNull OrderDetailBean orderDetailBean, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        return getValueContentByStatus$default(this, str, orderDetailBean.getStatus(), orderDetailBean.getToSwapFee(), C33129mqd.OLrzqt((java.lang.CharSequence) orderDetailBean.getToChainNativeTokenSymbol()) ? orderDetailBean.getToChainNativeTokenSymbol() : "", z, true, false, null, 192, null);
    }

    public java.lang.String KWHzl(@NotNull OrderDetailBean orderDetailBean) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        return (EZpvd(orderDetailBean.getToSwapFee()) || orderDetailBean.getToGasTokenPriceUsd().length() == 0) ? "" : C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, C23313hvq.mulCheckS$default(orderDetailBean.getToGasTokenPriceUsd(), orderDetailBean.getToSwapFee(), null, null, null, 14, null), false, false, RoundingMode.DOWN, false, 22, null);
    }

    public java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return getValueContentByStatus$default(this, str, str3, str2, "", false, true, false, null, 192, null);
    }

    public java.lang.String KWHzl(@NotNull OrderDetailBean orderDetailBean, boolean z) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        return OLrzqt(orderDetailBean, z);
    }

    public java.lang.String copydefault(@NotNull OrderDetailBean orderDetailBean, boolean z) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        return AEQbTJ(orderDetailBean, z);
    }

    public java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return getValueContentByStatus$default(this, str3, str2, str, str4, z, true, false, null, 128, null);
    }

    public java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return getFromValueContentByStatus$default(this, str3, str2, str, str4, z, true, false, null, 128, null);
    }

    public static /* synthetic */ java.lang.String getValueContentByStatus$default(C22689hkB c22689hkB, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, boolean z3, RoundingMode roundingMode, int i, java.lang.Object obj) {
        return c22689hkB.OLrzqt(str, str2, str3, str4, (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? true : z3, (i & 128) != 0 ? RoundingMode.DOWN : roundingMode);
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, boolean z3, RoundingMode roundingMode) {
        if (!EZpvd(str2, str3, z2)) {
            return "--";
        }
        if (z) {
            return C23271hvA.getShowDataWithSymbol$default(C23271hvA.copydefault, str3, str4, false, roundingMode, z3, false, 32, null);
        }
        return C23271hvA.getShowData$default(C23271hvA.copydefault, str3, false, roundingMode, z3, false, 16, null);
    }

    public static /* synthetic */ java.lang.String getFromValueContentByStatus$default(C22689hkB c22689hkB, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, boolean z3, RoundingMode roundingMode, int i, java.lang.Object obj) {
        return c22689hkB.EZpvd(str, str2, str3, str4, (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? true : z3, (i & 128) != 0 ? RoundingMode.DOWN : roundingMode);
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, boolean z3, RoundingMode roundingMode) {
        if (!EZpvd(str2, str3, z2)) {
            return "--";
        }
        if (z) {
            return C23271hvA.copydefault.KWHzl(str3, str4, "12");
        }
        return C23271hvA.copydefault.EZpvd(str3, "12");
    }

    public static /* synthetic */ java.lang.String getPriceFormatSymbol$default(C22689hkB c22689hkB, OrderDetailBean orderDetailBean, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c22689hkB.AEQbTJ(orderDetailBean, z);
    }

    public final java.lang.String AEQbTJ(OrderDetailBean orderDetailBean, boolean z) {
        java.lang.String str;
        if (EZpvd(orderDetailBean.getStatus(), orderDetailBean.getPrice(), true)) {
            java.lang.String showData$default = C23271hvA.getShowData$default(C23271hvA.copydefault, z ? C23313hvq.divCheckS$default(1, orderDetailBean.getPrice(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null) : orderDetailBean.getPrice(), false, RoundingMode.DOWN, false, false, 18, null);
            java.lang.String strEZpvd = C25352ivB.EZpvd(orderDetailBean.getFromTokenSymbol());
            java.lang.String strEZpvd2 = C25352ivB.EZpvd(orderDetailBean.getToTokenSymbol());
            if (C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf())) {
                if (!z) {
                    str = strEZpvd + " " + showData$default + " = " + strEZpvd2 + " 1";
                } else {
                    str = strEZpvd2 + " " + showData$default + " = " + strEZpvd + " 1";
                }
            } else if (!z) {
                str = "1 " + strEZpvd2 + " = " + showData$default + " " + strEZpvd;
            } else {
                str = "1 " + strEZpvd + " = " + showData$default + " " + strEZpvd2;
            }
        } else {
            str = "--";
        }
        return pTF.KWHzl.AEQbTJ(str);
    }

    public static /* synthetic */ java.lang.String getPriceFormat$default(C22689hkB c22689hkB, OrderDetailBean orderDetailBean, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c22689hkB.OLrzqt(orderDetailBean, z);
    }

    public final java.lang.String OLrzqt(OrderDetailBean orderDetailBean, boolean z) {
        java.lang.String str;
        if (getOrderState$default(this, orderDetailBean.getStatus(), orderDetailBean.getToAmount(), false, 4, null)) {
            java.lang.String showData$default = C23271hvA.getShowData$default(C23271hvA.copydefault, z ? C23313hvq.divCheckS$default(1, orderDetailBean.getPrice(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null) : orderDetailBean.getPrice(), false, RoundingMode.DOWN, false, false, 18, null);
            if (C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf())) {
                if (!z) {
                    str = orderDetailBean.getFromTokenSymbol() + " " + showData$default + " = " + orderDetailBean.getToTokenSymbol() + " 1";
                } else {
                    str = orderDetailBean.getToTokenSymbol() + " " + showData$default + " = " + orderDetailBean.getFromTokenSymbol() + " 1";
                }
            } else if (!z) {
                str = "1 " + orderDetailBean.getToTokenSymbol() + " = " + showData$default + " " + orderDetailBean.getFromTokenSymbol();
            } else {
                str = "1 " + orderDetailBean.getFromTokenSymbol() + " = " + showData$default + " " + orderDetailBean.getToTokenSymbol();
            }
        } else {
            str = "--";
        }
        return pTF.KWHzl.AEQbTJ(str);
    }

    public static /* synthetic */ boolean getOrderState$default(C22689hkB c22689hkB, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c22689hkB.EZpvd(str, str2, z);
    }

    public final boolean EZpvd(java.lang.String str, java.lang.String str2, boolean z) {
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) || str2.length() == 0) {
            return false;
        }
        if (z) {
            return true;
        }
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1");
    }

    public final boolean EZpvd(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) || str == null || str.length() == 0;
    }
}
