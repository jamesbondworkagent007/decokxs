package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.mls.fun.constants.TextAlign;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mUy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32247mUy extends ConstraintLayout {
    public final C36076oOj AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32247mUy(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:13) call: o.mUy.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C32247mUy(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32247mUy(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C36076oOj c36076oOjEZpvd = C36076oOj.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c36076oOjEZpvd, "");
        this.AEQbTJ = c36076oOjEZpvd;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mUv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C32247mUy.copydefault(context));
            }
        });
        AEQbTJ(attributeSet);
    }

    public final void setText(java.lang.CharSequence charSequence) {
        this.AEQbTJ.EZpvd.setText(charSequence);
    }

    public final void setTitle(java.lang.CharSequence charSequence) {
        this.AEQbTJ.OLrzqt.setText(charSequence);
    }

    private final int copydefault() {
        return ((java.lang.Number) this.KWHzl.getValue()).intValue();
    }

    public static final int copydefault(android.content.Context context) {
        return C55298xhM.OLrzqt(4, context);
    }

    public final void setHorizontalStyle() {
        if (this.copydefault) {
            this.copydefault = false;
            ViewGroup.LayoutParams layoutParams = this.AEQbTJ.EZpvd.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            layoutParams2.topToBottom = -1;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            layoutParams2.endToEnd = 0;
            layoutParams2.topToTop = 0;
            layoutParams2.startToStart = -1;
            this.AEQbTJ.EZpvd.setGravity(TextAlign.RIGHT);
            this.AEQbTJ.EZpvd.setLayoutParams(layoutParams2);
        }
    }

    public final AppCompatTextView EZpvd() {
        AppCompatTextView appCompatTextView = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        return appCompatTextView;
    }

    public final void setVerticalStyle() {
        if (this.copydefault) {
            return;
        }
        this.copydefault = true;
        ViewGroup.LayoutParams layoutParams = this.AEQbTJ.EZpvd.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.topToBottom = this.AEQbTJ.OLrzqt.getId();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C55298xhM.OLrzqt(2, context);
        layoutParams2.endToEnd = -1;
        layoutParams2.topToTop = -1;
        layoutParams2.startToStart = this.AEQbTJ.OLrzqt.getId();
        this.AEQbTJ.EZpvd.setGravity(TextAlign.LEFT);
        this.AEQbTJ.EZpvd.setLayoutParams(layoutParams2);
    }

    public final boolean OLrzqt() {
        return (this.AEQbTJ.OLrzqt.getMeasuredWidth() + this.AEQbTJ.EZpvd.getMeasuredWidth()) + copydefault() > getMeasuredWidth();
    }

    private final void AEQbTJ(android.util.AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C35964oKf.PendingIntent.dNCPSb);
        Intrinsics.copydefault(typedArrayObtainStyledAttributes);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        setTitle(C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C35964oKf.PendingIntent.RcXXUw, 0, 4, null));
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setText(C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context2, C35964oKf.PendingIntent.UeEOUB, 0, 4, null));
        typedArrayObtainStyledAttributes.recycle();
    }
}
