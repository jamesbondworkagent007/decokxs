package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iaM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24251iaM extends android.widget.FrameLayout {
    public C21639hGv OLrzqt;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24251iaM(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24251iaM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24251iaM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24251iaM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd(context);
    }

    public final void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C21639hGv.EZpvd(android.view.LayoutInflater.from(context), this, true);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(str, "");
        C21639hGv c21639hGv = this.OLrzqt;
        if (c21639hGv == null || (imageView = c21639hGv.AEQbTJ) == null) {
            return;
        }
        int i = C52761wXj.Activity.fZc;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25386ivj.KWHzl(imageView, str, new C25385ivi(null, null, 0.0f, C25382ivf.copydefault(i, context), 7, null));
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(str, "");
        C21639hGv c21639hGv = this.OLrzqt;
        if (c21639hGv == null || (imageView = c21639hGv.copydefault) == null) {
            return;
        }
        int i = C52761wXj.Activity.fZc;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25386ivj.KWHzl(imageView, str, new C25385ivi(null, null, 0.0f, C25382ivf.copydefault(i, context), 7, null));
    }
}
