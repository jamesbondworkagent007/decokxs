package o;

import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class kBL {
    public static final android.view.View copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(str);
        textView.setTextSize(z2 ? 8.0f : 10.0f);
        textView.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
        textView.setGravity(17);
        textView.setBackgroundResource(C57406yhn.Activity.djBIcL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z ? i : -2, i);
        if (!z) {
            textView.setPadding(C55298xhM.dp2px$default(4.0f, null, 1, null), 0, C55298xhM.dp2px$default(4.0f, null, 1, null), 0);
        }
        textView.setLayoutParams(layoutParams);
        return textView;
    }
}
