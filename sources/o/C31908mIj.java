package o;

import androidx.databinding.BindingAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mIj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31908mIj {
    public static /* synthetic */ void setRtlTextDirectionIfNeeded$default(android.widget.TextView textView, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        KWHzl(textView, i);
    }

    @BindingAdapter({"setRtlTextDirectionIfNeeded"})
    public static final void KWHzl(@NotNull android.widget.TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "");
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            textView.setTextDirection(i);
        }
    }
}
