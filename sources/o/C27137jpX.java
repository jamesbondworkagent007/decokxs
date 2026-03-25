package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jpX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27137jpX extends android.widget.LinearLayout {
    public iLF KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27137jpX(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27137jpX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27137jpX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd(context);
    }

    public final void EZpvd(android.content.Context context) {
        this.KWHzl = (iLF) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C25493ixk.Activity.DrNnAm, this, true);
        setOrientation(1);
        setGravity(1);
    }

    public final void setDrawable(int i) {
        android.widget.ImageView imageView;
        iLF ilf = this.KWHzl;
        if (ilf == null || (imageView = ilf.AEQbTJ) == null) {
            return;
        }
        imageView.setImageResource(i);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        iLF ilf = this.KWHzl;
        if (ilf == null || (textView = ilf.copydefault) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void setSubTitle(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        iLF ilf = this.KWHzl;
        if (ilf == null || (textView = ilf.EZpvd) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void setSubTitleShow(boolean z) {
        android.widget.TextView textView;
        iLF ilf = this.KWHzl;
        if (ilf == null || (textView = ilf.EZpvd) == null) {
            return;
        }
        textView.setVisibility(z ? 0 : 8);
    }

    public final void setButtonText(@NotNull java.lang.String str) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(str, "");
        iLF ilf = this.KWHzl;
        if (ilf == null || (c52794wYp = ilf.KWHzl) == null) {
            return;
        }
        c52794wYp.setText(str);
    }

    public final void setRetryClick(@NotNull final Function0<Unit> function0) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(function0, "");
        iLF ilf = this.KWHzl;
        if (ilf == null || (c52794wYp = ilf.KWHzl) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.jqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                function0.invoke();
            }
        });
    }

    public final void setRetryClickEnable(boolean z) {
        C52794wYp c52794wYp;
        iLF ilf = this.KWHzl;
        if (ilf == null || (c52794wYp = ilf.KWHzl) == null) {
            return;
        }
        c52794wYp.setClickable(z);
    }
}
