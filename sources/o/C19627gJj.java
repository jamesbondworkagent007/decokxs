package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gJj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19627gJj extends android.widget.LinearLayout {
    public AbstractC17106ewY KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19627gJj(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19627gJj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19627gJj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd(context);
    }

    public final void EZpvd(android.content.Context context) {
        this.KWHzl = (AbstractC17106ewY) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C13754dXa.TaskDescription.DDDCac, this, true);
    }

    public final void setDrawable(int i) {
        android.widget.ImageView imageView;
        AbstractC17106ewY abstractC17106ewY = this.KWHzl;
        if (abstractC17106ewY == null || (imageView = abstractC17106ewY.KWHzl) == null) {
            return;
        }
        imageView.setImageResource(i);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC17106ewY abstractC17106ewY = this.KWHzl;
        if (abstractC17106ewY == null || (textView = abstractC17106ewY.AEQbTJ) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void setSubTitle(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC17106ewY abstractC17106ewY = this.KWHzl;
        if (abstractC17106ewY == null || (textView = abstractC17106ewY.copydefault) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void setButtonText(@NotNull java.lang.String str) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC17106ewY abstractC17106ewY = this.KWHzl;
        if (abstractC17106ewY == null || (c52794wYp = abstractC17106ewY.EZpvd) == null) {
            return;
        }
        c52794wYp.setText(str);
    }

    public final void setRetryClick(@NotNull final Function0<Unit> function0) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC17106ewY abstractC17106ewY = this.KWHzl;
        if (abstractC17106ewY == null || (c52794wYp = abstractC17106ewY.EZpvd) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.gJg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                function0.invoke();
            }
        });
    }

    public final void setRetryClickEnable(boolean z) {
        C52794wYp c52794wYp;
        AbstractC17106ewY abstractC17106ewY = this.KWHzl;
        if (abstractC17106ewY == null || (c52794wYp = abstractC17106ewY.EZpvd) == null) {
            return;
        }
        c52794wYp.setClickable(z);
    }
}
