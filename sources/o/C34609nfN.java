package o;

import com.okinc.dexkline.market.features.tag.domain.TagMeta;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34609nfN {
    public static /* synthetic */ C34604nfI fromTagWrapper$default(TagWrapper tagWrapper, boolean z, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            context = null;
        }
        return AEQbTJ(tagWrapper, z, context);
    }

    public static final C34604nfI AEQbTJ(@NotNull TagWrapper tagWrapper, boolean z, android.content.Context context) {
        android.text.SpannedString spannedString;
        java.lang.String strGEmmrt;
        Intrinsics.checkNotNullParameter(tagWrapper, "");
        TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
        if (tagMetaAEQbTJ == null) {
            return null;
        }
        pFN pfn = pFN.OLrzqt;
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) pfn.KWHzl(), (java.lang.Object) "kline_dark");
        int textColor$default = C34498ndH.getTextColor$default(C34498ndH.OLrzqt, tagWrapper, zEZpvd, null, java.lang.Boolean.valueOf(pfn.valueOf()), 4, null);
        if (!z) {
            return new C34604nfI(tagWrapper.KWHzl(), zEZpvd ? tagMetaAEQbTJ.gEmmrt() : tagMetaAEQbTJ.AYXKKw(), null, new android.text.SpannedString(""), false, null, null, 100, null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) tagWrapper.KWHzl(), (java.lang.Object) "sniper")) {
            spannedString = AEQbTJ(tagWrapper, context);
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) tagMetaAEQbTJ.fetchVPNInfo());
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(textColor$default), 0, tagMetaAEQbTJ.fetchVPNInfo().length(), 33);
            spannedString = new android.text.SpannedString(spannableStringBuilder);
        }
        android.text.SpannedString spannedString2 = spannedString;
        java.lang.Integer numCopydefault = Intrinsics.EZpvd((java.lang.Object) tagWrapper.KWHzl(), (java.lang.Object) "sniper") ? copydefault(tagWrapper) : null;
        java.lang.String strKWHzl = tagWrapper.KWHzl();
        if (pfn.valueOf()) {
            strGEmmrt = zEZpvd ? tagMetaAEQbTJ.AEQbTJ() : tagMetaAEQbTJ.copydefault();
        } else {
            strGEmmrt = zEZpvd ? tagMetaAEQbTJ.gEmmrt() : tagMetaAEQbTJ.AYXKKw();
        }
        return new C34604nfI(strKWHzl, strGEmmrt, null, spannedString2, false, numCopydefault, tagWrapper.AEQbTJ().KWHzl(), 20, null);
    }

    public static /* synthetic */ android.text.SpannedString buildSniperSpan$default(TagWrapper tagWrapper, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            context = null;
        }
        return AEQbTJ(tagWrapper, context);
    }

    public static final android.text.SpannedString AEQbTJ(TagWrapper tagWrapper, android.content.Context context) {
        java.lang.Integer numKWHzl = tagWrapper.EZpvd().KWHzl().KWHzl();
        int iIntValue = numKWHzl != null ? numKWHzl.intValue() : 0;
        java.lang.Integer numCopydefault = tagWrapper.EZpvd().KWHzl().copydefault();
        int iIntValue2 = numCopydefault != null ? numCopydefault.intValue() : 0;
        if (iIntValue == 0 || context == null) {
            return new android.text.SpannedString("");
        }
        java.lang.String strValueOf = java.lang.String.valueOf(iIntValue2);
        java.lang.String strKWHzl = C33069mpW.KWHzl(context, C35964oKf.Fragment.DfrfUJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("num", strValueOf), C56390yDp.OLrzqt("num2", java.lang.String.valueOf(iIntValue))));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) strKWHzl);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_dark") ? C33070mpX.copydefault(C52761wXj.Activity.zblBkD) : C33070mpX.copydefault(C52761wXj.Activity.ixgjPv)), 0, strKWHzl.length(), 33);
        if (iIntValue2 > 0) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(mUM.copydefault(C52761wXj.Activity.gdmIOq)), 0, C55296xhK.OLrzqt(context) ? strValueOf.length() + 1 : strValueOf.length(), 33);
        }
        return new android.text.SpannedString(spannableStringBuilder);
    }

    public static final java.lang.Integer copydefault(@NotNull TagWrapper tagWrapper) {
        Intrinsics.checkNotNullParameter(tagWrapper, "");
        java.lang.Integer numCopydefault = tagWrapper.EZpvd().KWHzl().copydefault();
        if (numCopydefault == null || numCopydefault.intValue() == 0) {
            return java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl);
        }
        return null;
    }
}
