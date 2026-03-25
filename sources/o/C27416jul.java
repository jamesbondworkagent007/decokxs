package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27416jul extends android.widget.LinearLayout {
    public AbstractC23869iMi copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27416jul(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27416jul(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27416jul(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ(context);
    }

    public final void AEQbTJ(android.content.Context context) {
        this.copydefault = (AbstractC23869iMi) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C25493ixk.Activity.RSDDiY, this, true);
        setOrientation(1);
    }

    public final void setDrawable(int i) {
        android.widget.ImageView imageView;
        AbstractC23869iMi abstractC23869iMi = this.copydefault;
        if (abstractC23869iMi == null || (imageView = abstractC23869iMi.KWHzl) == null) {
            return;
        }
        imageView.setImageResource(i);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC23869iMi abstractC23869iMi = this.copydefault;
        if (abstractC23869iMi == null || (textView = abstractC23869iMi.OLrzqt) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void setSubTitle(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC23869iMi abstractC23869iMi = this.copydefault;
        if (abstractC23869iMi == null || (textView = abstractC23869iMi.AEQbTJ) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void setSubTitleShow(boolean z) {
        android.widget.TextView textView;
        AbstractC23869iMi abstractC23869iMi = this.copydefault;
        if (abstractC23869iMi == null || (textView = abstractC23869iMi.AEQbTJ) == null) {
            return;
        }
        textView.setVisibility(z ? 0 : 8);
    }

    public final void setButtonText(@NotNull java.lang.String str) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC23869iMi abstractC23869iMi = this.copydefault;
        if (abstractC23869iMi == null || (c52794wYp = abstractC23869iMi.EZpvd) == null) {
            return;
        }
        c52794wYp.setText(str);
    }

    public final void setRetryClick(@NotNull final Function0<Unit> function0) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC23869iMi abstractC23869iMi = this.copydefault;
        if (abstractC23869iMi == null || (c52794wYp = abstractC23869iMi.EZpvd) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.jum
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                function0.invoke();
            }
        });
    }

    public final void setRetryClickEnable(boolean z) {
        C52794wYp c52794wYp;
        AbstractC23869iMi abstractC23869iMi = this.copydefault;
        if (abstractC23869iMi == null || (c52794wYp = abstractC23869iMi.EZpvd) == null) {
            return;
        }
        c52794wYp.setClickable(z);
    }
}
