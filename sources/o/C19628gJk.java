package o;

import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gJk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19628gJk extends android.widget.LinearLayout {
    public AbstractC17162exb copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19628gJk(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19628gJk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19628gJk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    public final void KWHzl(android.content.Context context) {
        this.copydefault = (AbstractC17162exb) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C13754dXa.TaskDescription.UJpkuA, this, true);
    }

    public final void setDrawable(int i) {
        android.widget.ImageView imageView;
        AbstractC17162exb abstractC17162exb = this.copydefault;
        if (abstractC17162exb == null || (imageView = abstractC17162exb.copydefault) == null) {
            return;
        }
        imageView.setImageResource(i);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC17162exb abstractC17162exb = this.copydefault;
        if (abstractC17162exb == null || (textView = abstractC17162exb.AEQbTJ) == null) {
            return;
        }
        textView.setText(str);
    }
}
