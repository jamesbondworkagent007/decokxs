package o;

import com.okinc.business.dexui.main.swap.widget.mev.MinimumReceivedParam;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iuv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25345iuv extends android.widget.LinearLayout {
    public C21618hGa OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25345iuv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25345iuv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25345iuv(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setData(@NotNull MinimumReceivedParam minimumReceivedParam) {
        Intrinsics.checkNotNullParameter(minimumReceivedParam, "");
        C21618hGa c21618hGa = this.OLrzqt;
        if (c21618hGa != null) {
            c21618hGa.EZpvd.setText(minimumReceivedParam.KWHzl());
            c21618hGa.KWHzl.setText(minimumReceivedParam.AEQbTJ());
            android.widget.TextView textView = c21618hGa.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(minimumReceivedParam.copydefault() ? 0 : 8);
        }
    }

    public final void copydefault() {
        this.OLrzqt = C21618hGa.copydefault(android.view.LayoutInflater.from(getContext()), this, true);
    }
}
