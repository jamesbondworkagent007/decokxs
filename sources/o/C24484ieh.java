package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ieh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24484ieh extends android.widget.FrameLayout {
    public C21496hBn copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24484ieh(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24484ieh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24484ieh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ(context);
    }

    public final void AEQbTJ(android.content.Context context) {
        this.copydefault = C21496hBn.copydefault(android.view.LayoutInflater.from(context), this, true);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C21496hBn c21496hBn = this.copydefault;
        if (c21496hBn != null && (imageView2 = c21496hBn.copydefault) != null) {
            C25386ivj.loadImageWithBorder$default(imageView2, str, null, 2, null);
        }
        C21496hBn c21496hBn2 = this.copydefault;
        if (c21496hBn2 == null || (imageView = c21496hBn2.KWHzl) == null) {
            return;
        }
        C25386ivj.loadImageWithBorder$default(imageView, str2, null, 2, null);
    }
}
