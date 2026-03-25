package o;

import com.okinc.market.search.features.main.recommend.history.data.model.Rate;
import com.okinc.market.search.features.main.recommend.history.data.model.RateNum;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qIP {
    public static final java.lang.CharSequence copydefault(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str, @androidx.annotation.ColorInt int i, @NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        return C33061mpO.setupSpanStyles$default(charSequence, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.qIX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qIP.AEQbTJ(context, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit AEQbTJ(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, qZH.FragmentManager.copydefault));
        list.add(new android.text.style.TypefaceSpan(com.google.android.exoplayer2.C.SANS_SERIF_NAME));
        return Unit.INSTANCE;
    }

    public static final java.lang.String EZpvd(@NotNull Rate rate) {
        java.util.List<java.lang.String> value;
        java.util.List<java.lang.String> value2;
        java.lang.String type;
        Intrinsics.checkNotNullParameter(rate, "");
        RateNum rateNum = rate.getRateNum();
        java.lang.String str = null;
        java.util.List<java.lang.String> value3 = rateNum != null ? rateNum.getValue() : null;
        if (value3 != null && !value3.isEmpty()) {
            RateNum rateNum2 = rate.getRateNum();
            int i = 1;
            if (rateNum2 != null && (type = rateNum2.getType()) != null && java.lang.Integer.parseInt(type) == 1) {
                i = 100;
            }
            RateNum rateNum3 = rate.getRateNum();
            java.lang.String str2 = (rateNum3 == null || (value2 = rateNum3.getValue()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(value2);
            RateNum rateNum4 = rate.getRateNum();
            if (rateNum4 != null && (value = rateNum4.getValue()) != null) {
                str = (java.lang.String) CollectionsKt___CollectionsKt.AubY(value);
            }
            if (str2 != null && str != null) {
                if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) str)) {
                    return pTB.formatPercent$default(C33129mqd.EZpvd(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str2) / ((double) i))), 2, 0, null, null, 12, null);
                }
                double d = i;
                return ((java.lang.Object) pTB.formatPercent$default(C33129mqd.EZpvd(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str2) / d)), 2, 0, null, null, 12, null)) + "-" + ((java.lang.Object) pTB.formatPercent$default(C33129mqd.EZpvd(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str) / d)), 2, 0, null, null, 12, null));
            }
        }
        return "";
    }
}
