package o;

import com.okinc.market.search.features.main.entry.ui.model.SearchRecommendVo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.qZH;

/* JADX INFO: renamed from: o.qCa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39903qCa {
    public static final java.lang.CharSequence KWHzl(SearchRecommendVo searchRecommendVo) {
        java.lang.CharSequence copywriting;
        if (searchRecommendVo != null && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) searchRecommendVo.getCopywriting()))) {
            java.lang.Integer icon = searchRecommendVo.getIcon();
            android.graphics.drawable.Drawable drawableKWHzl = icon != null ? C33070mpX.KWHzl(icon.intValue()) : null;
            if (drawableKWHzl != null) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                C40494qXy c40494qXy = new C40494qXy(drawableKWHzl);
                spannableStringBuilder.append((java.lang.CharSequence) " ");
                spannableStringBuilder.setSpan(c40494qXy, 0, 1, 33);
                copywriting = spannableStringBuilder.append((java.lang.CharSequence) (" " + searchRecommendVo.getCopywriting()));
            } else {
                copywriting = searchRecommendVo.getCopywriting();
            }
            Intrinsics.copydefault(copywriting);
            return copywriting;
        }
        return C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPfvRMlC);
    }
}
