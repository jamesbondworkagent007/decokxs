package o;

import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kNy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28074kNy {
    public static /* synthetic */ C28072kNw fromTagWrapper$default(TagWrapper tagWrapper, boolean z, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            context = null;
        }
        return EZpvd(tagWrapper, z, context);
    }

    public static final C28072kNw EZpvd(@NotNull TagWrapper tagWrapper, boolean z, android.content.Context context) {
        android.text.SpannedString spannedString;
        java.lang.String strAYXKKw = "";
        Intrinsics.checkNotNullParameter(tagWrapper, "");
        TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
        if (tagMetaAEQbTJ == null) {
            return null;
        }
        boolean z2 = context != null && C33054mpH.AEQbTJ(context);
        C29694kyV c29694kyV = C29694kyV.AEQbTJ;
        int textColor$default = C29694kyV.getTextColor$default(c29694kyV, tagWrapper, z2, null, 4, null);
        if (!z) {
            return new C28072kNw(tagWrapper.OLrzqt(), z2 ? tagMetaAEQbTJ.KWHzl() : tagMetaAEQbTJ.AhwBna(), null, new android.text.SpannedString(""), false, null, null, tagWrapper.AEQbTJ().AEQbTJ(), tagWrapper.AEQbTJ().djBIcL(), 100, null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "sniper")) {
            spannedString = c29694kyV.copydefault(context, tagWrapper.copydefault().OLrzqt().AhwBna());
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            if (tagMetaAEQbTJ.values()) {
                java.lang.String strEZpvd = tagWrapper.copydefault().OLrzqt().EZpvd();
                if (strEZpvd != null) {
                    strAYXKKw = strEZpvd;
                }
            } else {
                strAYXKKw = tagMetaAEQbTJ.AYXKKw();
            }
            spannableStringBuilder.append((java.lang.CharSequence) strAYXKKw);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(textColor$default), 0, strAYXKKw.length(), 33);
            spannedString = new android.text.SpannedString(spannableStringBuilder);
        }
        return new C28072kNw(tagWrapper.OLrzqt(), z2 ? tagMetaAEQbTJ.KWHzl() : tagMetaAEQbTJ.AhwBna(), null, spannedString, false, Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "sniper") ? java.lang.Integer.valueOf(OLrzqt(tagWrapper.copydefault().OLrzqt().AhwBna())) : null, tagWrapper.AEQbTJ().copydefault(), tagWrapper.AEQbTJ().AEQbTJ(), tagWrapper.AEQbTJ().djBIcL(), 20, null);
    }

    public static final int OLrzqt(java.lang.Float f) {
        return (f == null || Intrinsics.EZpvd(f, 0.0f)) ? C52761wXj.Activity.DQYQgr : f.floatValue() <= 1.0f ? C52761wXj.ActionBar.DCUTEI : f.floatValue() < 10.0f ? C52761wXj.Activity.gdmIOq : C52761wXj.ActionBar.OuxcSI;
    }
}
