package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vKO extends ConstraintLayout {
    public AbstractC48483uTb KWHzl;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vKO(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vKO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.vKO.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ vKO(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vKO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "";
        AbstractC48483uTb abstractC48483uTbCopydefault = AbstractC48483uTb.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC48483uTbCopydefault, "");
        this.KWHzl = abstractC48483uTbCopydefault;
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.fzHEvu);
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl));
        }
        this.KWHzl.copydefault.setImageDrawable(drawable);
    }

    public final void setText(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C55312xha c55312xhaValueOf = this.KWHzl.OLrzqt.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setText(str);
        }
        this.KWHzl.KWHzl.setText(str2);
        this.OLrzqt = str3;
    }

    public final void setTextTvGravity(int i) {
        this.KWHzl.KWHzl.setGravity(i);
    }

    public final C55258xgZ OLrzqt() {
        C55258xgZ c55258xgZ = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        return c55258xgZ;
    }

    public final android.widget.TextView EZpvd() {
        android.widget.TextView textView = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final void setTitle(java.lang.String str) {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = this.KWHzl.OLrzqt.valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        c55320xhiKWHzl.setText(str);
    }

    public final java.lang.String KWHzl() {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = this.KWHzl.OLrzqt.valueOf();
        return C33129mqd.gEmmrt((c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) ? null : c55320xhiKWHzl.getText());
    }

    public final void setValue(java.lang.String str) {
        android.widget.TextView textView = this.KWHzl.KWHzl;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }

    public final void setShowClick(boolean z, @NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.KWHzl.copydefault.setVisibility(z ? 0 : 4);
        C55296xhK.singleClick$default(this.KWHzl.copydefault, onClickListener, 0L, 2, (java.lang.Object) null);
    }

    public final void EZpvd(boolean z, View.OnClickListener onClickListener) {
        C55312xha c55312xhaValueOf = this.KWHzl.OLrzqt.valueOf();
        if (c55312xhaValueOf != null) {
            c55312xhaValueOf.setShowUnderline(z);
        }
        C55312xha c55312xhaValueOf2 = this.KWHzl.OLrzqt.valueOf();
        if (c55312xhaValueOf2 != null) {
            if (!z) {
                onClickListener = null;
            }
            c55312xhaValueOf2.setOnClickListener(onClickListener);
        }
    }
}
