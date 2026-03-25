package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pIj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C37996pIj {
    public static final C37996pIj KWHzl = new C37996pIj();

    private C37996pIj() {
    }

    public final void EZpvd(@NotNull android.text.SpannableStringBuilder spannableStringBuilder) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "");
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) spannableStringBuilder, (java.lang.CharSequence) "\n", false, 2, (java.lang.Object) null)) {
            return;
        }
        spannableStringBuilder.append("\n");
    }

    public static /* synthetic */ void makeUpMargin$default(C37996pIj c37996pIj, android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 15;
        }
        c37996pIj.KWHzl(spannableStringBuilder, i);
    }

    public final void KWHzl(@NotNull android.text.SpannableStringBuilder spannableStringBuilder, int i) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "");
        EZpvd(spannableStringBuilder);
        spannableStringBuilder.insert(0, "[space]");
        spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan(C55298xhM.sp2px$default(i, null, 1, null)), 0, 7, 33);
        spannableStringBuilder.setSpan(new pHM(i), 0, 7, 33);
    }
}
