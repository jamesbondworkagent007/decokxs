package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fEa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17403fEa implements InterfaceC17407fEe {
    public final int AEQbTJ;

    public C17403fEa(@androidx.annotation.ColorInt int i) {
        this.AEQbTJ = i;
    }

    @Override // o.InterfaceC17407fEe
    public java.lang.CharSequence KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(str, str2, 0, z, 2, (java.lang.Object) null);
        if (iIndexOf$default < 0) {
            return str;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(this.AEQbTJ), iIndexOf$default, str2.length() + iIndexOf$default, 33);
        return spannableStringBuilder;
    }
}
