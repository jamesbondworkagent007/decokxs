package o;

import com.okinc.business.defi.biz.net.bean.AddressCoinHistoryDetail;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.eXb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15836eXb {
    public final void copydefault(@NotNull AddressCoinHistoryDetail addressCoinHistoryDetail, @NotNull yHO<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        int i;
        java.lang.String strAYXKKw;
        java.lang.String strCopydefault;
        int i2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(addressCoinHistoryDetail, "");
        Intrinsics.checkNotNullParameter(yho, "");
        int txType = addressCoinHistoryDetail.getTxType();
        if (txType == 1) {
            i = C13754dXa.Activity.OxVOHk;
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.createFullyDrawnExecutor);
            strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.initViewTreeOwners) + C14079deg.getAddressStr$default(C14079deg.EZpvd, addressCoinHistoryDetail.getFrom(), false, 2, null);
        } else if (txType == 2) {
            i = C13754dXa.Activity.QwvEab;
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambdanew2);
            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.onScrollStateChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, C14079deg.getAddressStr$default(C14079deg.EZpvd, addressCoinHistoryDetail.getTo(), false, 2, null))));
        } else {
            if (txType == 3) {
                i2 = C13754dXa.Activity.QSLkRj;
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivity);
            } else {
                i2 = C13754dXa.Activity.QSLkRj;
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivity);
            }
            yho.invoke(java.lang.Integer.valueOf(i2), strAYXKKw, str);
        }
        int i3 = i;
        str = strCopydefault;
        i2 = i3;
        yho.invoke(java.lang.Integer.valueOf(i2), strAYXKKw, str);
    }

    public final java.lang.String AEQbTJ(int i) {
        if (i == 1) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.createFullyDrawnExecutor);
        }
        if (i == 2) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambdanew2);
        }
        if (i == 3) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivity);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivity);
    }

    public final void KWHzl(@NotNull AddressCoinHistoryDetail addressCoinHistoryDetail, @NotNull C15503eKt c15503eKt, int i) {
        java.lang.String str;
        java.lang.String strOLrzqt;
        int iCopydefault;
        Intrinsics.checkNotNullParameter(addressCoinHistoryDetail, "");
        Intrinsics.checkNotNullParameter(c15503eKt, "");
        c15503eKt.setTextSize(16.0f);
        java.lang.String direction = addressCoinHistoryDetail.getDirection();
        if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "1")) {
            str = Marker.ANY_NON_NULL_MARKER;
        } else {
            str = Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "2") ? "-" : "";
        }
        c15503eKt.setAutoSizeTextTypeFixWithConfiguration(12.0f, 16.0f, 2);
        java.lang.String coinAmount = addressCoinHistoryDetail.getCoinAmount();
        if (coinAmount == null || (strOLrzqt = C54870xYj.OLrzqt(coinAmount, (249 & 1) != 0 ? 0 : 0, i, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null)) == null) {
            strOLrzqt = "--";
        }
        java.lang.String str2 = str + strOLrzqt;
        java.lang.String coinSymbol = addressCoinHistoryDetail.getCoinSymbol();
        C15503eKt.setText$default(c15503eKt, str2, " ", coinSymbol == null ? "" : coinSymbol, false, 8, null);
        java.lang.String direction2 = addressCoinHistoryDetail.getDirection();
        if (Intrinsics.EZpvd((java.lang.Object) direction2, (java.lang.Object) "1")) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = c15503eKt.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iCopydefault = C33512mxp.profitAlternativeColor$default(c33512mxp, context, 0.0f, 2, null);
        } else {
            iCopydefault = Intrinsics.EZpvd((java.lang.Object) direction2, (java.lang.Object) "2") ? C33070mpX.copydefault(C52761wXj.Activity.fdOvFl) : C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        c15503eKt.setTextColor(iCopydefault);
    }
}
