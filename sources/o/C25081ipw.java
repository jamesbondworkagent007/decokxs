package o;

import androidx.collection.ArrayMapKt;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ipw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25081ipw {
    public static final void OLrzqt(@NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.String str, @NotNull final AbstractC23101hrq abstractC23101hrq, @NotNull C25052ipT c25052ipT, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        int i;
        java.lang.String strKWHzl;
        java.lang.String slipPageFluctuationThresholdDesc = "";
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(c25052ipT, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DexAutoSlippageInfoParam dexAutoSlippageInfoParamAutoSlippageInfo = quotePriceRes.autoSlippageInfo();
        java.lang.String referenceSlippage = dexAutoSlippageInfoParamAutoSlippageInfo != null ? dexAutoSlippageInfoParamAutoSlippageInfo.getReferenceSlippage() : null;
        java.lang.String strAutoSlippage = (referenceSlippage == null || referenceSlippage.length() == 0) ? quotePriceRes.autoSlippage() : referenceSlippage;
        java.lang.String strOLrzqt = abstractC23101hrq.DCUTEI().OLrzqt(strAutoSlippage);
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        int i2 = 8;
        if (Intrinsics.EZpvd((java.lang.Object) quotePriceRes.getTokenType(), (java.lang.Object) "1") || quotePriceRes.isBridge()) {
            function1.invoke(java.lang.Boolean.FALSE);
            if (quotePriceRes.isShowFluctuateTips(strOLrzqt)) {
                if (quotePriceRes.isFluctuationThanThresholdDesc()) {
                    slipPageFluctuationThresholdDesc = quotePriceRes.getFluctuationThanThresholdDesc();
                } else if (quotePriceRes.isRateFluctuationThresholdDesc()) {
                    slipPageFluctuationThresholdDesc = quotePriceRes.getRateFluctuationThresholdDesc();
                } else if (quotePriceRes.isSlipPageFluctuationThresholdDesc()) {
                    slipPageFluctuationThresholdDesc = quotePriceRes.getSlipPageFluctuationThresholdDesc();
                }
                c25052ipT.setWarningText(slipPageFluctuationThresholdDesc);
                if (slipPageFluctuationThresholdDesc.length() != 0) {
                }
            }
            c25052ipT.setVisibility(i2);
        }
        boolean zEZpvd = abstractC23101hrq.DCUTEI().EZpvd();
        java.lang.String strOLrzqt2 = abstractC23101hrq.DCUTEI().OLrzqt(null);
        java.lang.String strOLrzqt3 = abstractC23101hrq.DCUTEI().OLrzqt();
        boolean zEZpvd2 = C23313hvq.EZpvd(strOLrzqt3, strAutoSlippage);
        boolean zEZpvd3 = C23313hvq.EZpvd(strOLrzqt2, strAutoSlippage);
        if (zEZpvd && zEZpvd3) {
            if (quotePriceRes.isSlipValueGt50(str, abstractC23101hrq.UlJrfe())) {
                function1.invoke(java.lang.Boolean.TRUE);
            } else {
                function1.invoke(java.lang.Boolean.FALSE);
            }
            c25052ipT.setVisibility(8);
            return;
        }
        java.lang.String str2 = (strOLrzqt2 == null || strOLrzqt2.length() == 0) ? strAutoSlippage : strOLrzqt2;
        androidx.collection.ArrayMap arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("tokenSymbol", abstractC23101hrq.QUSxYX().djBIcL()));
        if (C23313hvq.KWHzl(str2, quotePriceRes.getSlippageLimit(str, abstractC23101hrq.UlJrfe()))) {
            function1.invoke(java.lang.Boolean.FALSE);
            if ((zEZpvd && zEZpvd3) || zEZpvd2) {
                c25052ipT.setVisibility(8);
                return;
            }
            java.lang.String strDjBIcL = abstractC23101hrq.QUSxYX().djBIcL();
            if ((zEZpvd && C23313hvq.KWHzl(strOLrzqt2, strAutoSlippage)) || (C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt3) && C23313hvq.KWHzl(strOLrzqt3, strAutoSlippage))) {
                i = 1;
                strKWHzl = C33069mpW.copydefault(C23274hvD.Fragment.init, C56424yEw.gEmmrt(C56390yDp.OLrzqt("token", strDjBIcL), C56390yDp.OLrzqt("num", C23311hvo.formatPercent$default(strAutoSlippage, false, 0, 0, null, null, 31, null))));
            } else {
                i = 1;
                strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.ROgMPW, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("tokenSymbol", strDjBIcL), C56390yDp.OLrzqt("slippageTolerance", C23313hvq.mulCheckS$default(strAutoSlippage, "100", 1, null, RoundingMode.UP, 4, null))));
            }
        } else {
            i = 1;
            if (C23313hvq.EZpvd(str2, quotePriceRes.getSlippageLimit(str, abstractC23101hrq.UlJrfe()))) {
                function1.invoke(java.lang.Boolean.TRUE);
                strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.YqksP, arrayMapArrayMapOf);
            } else {
                function1.invoke(java.lang.Boolean.FALSE);
                strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.invokespecialsiEkQe, arrayMapArrayMapOf);
            }
        }
        c25052ipT.setWarningText(strKWHzl);
        C32866mlf.onEvent$default("app_swap_safemoon_tips", (TrackChannel[]) null, new Function1() { // from class: o.ipv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25081ipw.OLrzqt(abstractC23101hrq, (EventParamsList) obj);
            }
        }, i, (java.lang.Object) null);
        i2 = 0;
        c25052ipT.setVisibility(i2);
    }

    public static final Unit OLrzqt(AbstractC23101hrq abstractC23101hrq, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("user_address", abstractC23101hrq.QCjLjM(), false);
        return Unit.INSTANCE;
    }

    public static final java.lang.String OLrzqt(@NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.String str, @NotNull final AbstractC23101hrq abstractC23101hrq, @NotNull android.content.Context context) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(context, "");
        QuotePriceRes value = abstractC23101hrq.AubY().getValue();
        if (value != null && value.isReset()) {
            return "";
        }
        DexAutoSlippageInfoParam dexAutoSlippageInfoParamAutoSlippageInfo = quotePriceRes.autoSlippageInfo();
        java.lang.String referenceSlippage = dexAutoSlippageInfoParamAutoSlippageInfo != null ? dexAutoSlippageInfoParamAutoSlippageInfo.getReferenceSlippage() : null;
        java.lang.String strAutoSlippage = (referenceSlippage == null || referenceSlippage.length() == 0) ? quotePriceRes.autoSlippage() : referenceSlippage;
        java.lang.String strOLrzqt = abstractC23101hrq.DCUTEI().OLrzqt(strAutoSlippage);
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) quotePriceRes.getTokenType(), (java.lang.Object) "1") || quotePriceRes.isBridge()) {
            return quotePriceRes.isShowFluctuateTips(strOLrzqt) ? quotePriceRes.isFluctuationThanThresholdDesc() ? quotePriceRes.getFluctuationThanThresholdDesc() : quotePriceRes.isRateFluctuationThresholdDesc() ? quotePriceRes.getRateFluctuationThresholdDesc() : quotePriceRes.isSlipPageFluctuationThresholdDesc() ? quotePriceRes.getSlipPageFluctuationThresholdDesc() : "" : "";
        }
        boolean zEZpvd = abstractC23101hrq.DCUTEI().EZpvd();
        java.lang.String strOLrzqt2 = abstractC23101hrq.DCUTEI().OLrzqt(null);
        java.lang.String strOLrzqt3 = abstractC23101hrq.DCUTEI().OLrzqt();
        boolean zEZpvd2 = C23313hvq.EZpvd(strOLrzqt3, strAutoSlippage);
        boolean zEZpvd3 = C23313hvq.EZpvd(strOLrzqt2, strAutoSlippage);
        if (zEZpvd && zEZpvd3) {
            return "";
        }
        java.lang.String str2 = (strOLrzqt2 == null || strOLrzqt2.length() == 0) ? strAutoSlippage : strOLrzqt2;
        java.lang.String strDjBIcL = abstractC23101hrq.QUSxYX().djBIcL();
        java.lang.String slippageLimit = quotePriceRes.getSlippageLimit(str, abstractC23101hrq.UlJrfe());
        if (C23313hvq.KWHzl(str2, slippageLimit)) {
            if ((zEZpvd && zEZpvd3) || zEZpvd2) {
                return "";
            }
            if ((zEZpvd && C23313hvq.KWHzl(strOLrzqt2, strAutoSlippage)) || (C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt3) && C23313hvq.KWHzl(strOLrzqt3, strAutoSlippage))) {
                strKWHzl = C33069mpW.KWHzl(context, C23274hvD.Fragment.init, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("token", strDjBIcL), C56390yDp.OLrzqt("num", C23311hvo.formatPercent$default(strAutoSlippage, false, 0, 0, null, null, 31, null))));
            } else {
                strKWHzl = C33069mpW.KWHzl(context, C23274hvD.Fragment.ROgMPW, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("tokenSymbol", strDjBIcL), C56390yDp.OLrzqt("slippageTolerance", C23313hvq.mulCheckS$default(strAutoSlippage, "100", 1, null, RoundingMode.UP, 4, null))));
            }
        } else if (C23313hvq.EZpvd(str2, slippageLimit)) {
            strKWHzl = C33069mpW.KWHzl(context, C23274hvD.Fragment.YqksP, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("tokenSymbol", strDjBIcL)));
        } else {
            strKWHzl = C33069mpW.KWHzl(context, C23274hvD.Fragment.invokespecialsiEkQe, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("tokenSymbol", strDjBIcL)));
        }
        java.lang.String str3 = strKWHzl;
        C32866mlf.onEvent$default("app_swap_safemoon_tips", (TrackChannel[]) null, new Function1() { // from class: o.ips
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25081ipw.AEQbTJ(abstractC23101hrq, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return str3;
    }

    public static final Unit AEQbTJ(AbstractC23101hrq abstractC23101hrq, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("user_address", abstractC23101hrq.QCjLjM(), false);
        return Unit.INSTANCE;
    }
}
