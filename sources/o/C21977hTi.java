package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hTi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21977hTi extends ConstraintLayout {
    public final hDX AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21977hTi(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:11) call: o.hTi.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C21977hTi(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21977hTi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hDX hdxKWHzl = hDX.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hdxKWHzl, "");
        this.AEQbTJ = hdxKWHzl;
        copydefault(attributeSet);
    }

    public final void setText(java.lang.CharSequence charSequence) {
        this.AEQbTJ.OLrzqt.setText(charSequence);
    }

    public final void setTitle(java.lang.CharSequence charSequence) {
        this.AEQbTJ.AEQbTJ.setText(charSequence);
    }

    public final AppCompatTextView copydefault() {
        AppCompatTextView appCompatTextView = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        return appCompatTextView;
    }

    public final AppCompatTextView AEQbTJ() {
        AppCompatTextView appCompatTextView = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        return appCompatTextView;
    }

    public final void copydefault(android.util.AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C23274hvD.LoaderManager.finit);
        Intrinsics.copydefault(typedArrayObtainStyledAttributes);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        setTitle(C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C23274hvD.LoaderManager.dxcTrN, 0, 4, null));
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setText(C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context2, C23274hvD.LoaderManager.fFgQHt, 0, 4, null));
        typedArrayObtainStyledAttributes.recycle();
    }
}
