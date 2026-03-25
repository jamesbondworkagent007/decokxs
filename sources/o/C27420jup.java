package o;

import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jup, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27420jup extends android.widget.LinearLayout {
    public AbstractC23873iMm KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27420jup(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27420jup(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27420jup(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ(context);
    }

    public final void AEQbTJ(android.content.Context context) {
        this.KWHzl = (AbstractC23873iMm) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C25493ixk.Activity.DcMfJK, this, true);
        setOrientation(1);
    }

    public final void setDrawable(int i) {
        android.widget.ImageView imageView;
        AbstractC23873iMm abstractC23873iMm = this.KWHzl;
        if (abstractC23873iMm == null || (imageView = abstractC23873iMm.EZpvd) == null) {
            return;
        }
        imageView.setImageResource(i);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC23873iMm abstractC23873iMm = this.KWHzl;
        if (abstractC23873iMm == null || (textView = abstractC23873iMm.AEQbTJ) == null) {
            return;
        }
        textView.setText(str);
    }
}
