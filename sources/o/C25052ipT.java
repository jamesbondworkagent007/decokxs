package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ipT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25052ipT extends android.widget.LinearLayout {
    public C21510hCa copydefault;

    public C25052ipT(android.content.Context context) {
        super(context);
        copydefault(context, null);
    }

    public C25052ipT(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        copydefault(context, attributeSet);
    }

    public C25052ipT(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        copydefault(context, attributeSet);
    }

    public final void copydefault(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (context == null) {
            return;
        }
        this.copydefault = C21510hCa.KWHzl(android.view.LayoutInflater.from(context), this, true);
    }

    public final void setWarningText(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        C21510hCa c21510hCa = this.copydefault;
        if (c21510hCa == null || (textView = c21510hCa.EZpvd) == null) {
            return;
        }
        textView.setText(str);
    }
}
