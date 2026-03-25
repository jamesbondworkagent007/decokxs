package o;

import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oIn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35918oIn extends C52794wYp {
    public android.content.res.ColorStateList OLrzqt;
    public android.graphics.drawable.Drawable copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35918oIn(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35918oIn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.dUDNAs int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.oIn.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C35918oIn(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.dUDNAs : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35918oIn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C35399nuc.VoiceInteractor.zsXlph, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(C35399nuc.VoiceInteractor.AubY, 0);
            if (resourceId != 0) {
                android.graphics.drawable.Drawable drawableEZpvd = C33070mpX.EZpvd(resourceId, context);
                this.copydefault = drawableEZpvd != null ? drawableEZpvd.mutate() : null;
                setupSpacerText();
            }
            typedArrayObtainStyledAttributes.recycle();
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.drawableTint}, i, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            try {
                this.OLrzqt = typedArrayObtainStyledAttributes.getColorStateList(0);
                typedArrayObtainStyledAttributes.recycle();
                KWHzl();
            } finally {
            }
        } finally {
        }
    }

    public final void setupSpacerText() {
        if (this.copydefault != null) {
            java.lang.String strCopydefault = C59449zhJ.copydefault("_", ((int) (r0.getIntrinsicWidth() / getPaint().measureText("_"))) + 1);
            setTextColor(0);
            setText(strCopydefault);
        }
    }

    /* JADX DEBUG: Possible override for method o.wYp.KWHzl()Landroid/graphics/Rect; */
    public final void KWHzl() {
        android.content.res.ColorStateList colorStateList;
        android.graphics.drawable.Drawable drawable = this.copydefault;
        if (drawable == null || (colorStateList = this.OLrzqt) == null) {
            return;
        }
        DrawableCompat.setTintList(drawable, colorStateList);
    }

    @Override // o.C52794wYp, android.widget.TextView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        android.graphics.drawable.Drawable drawable = this.copydefault;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int width = (getWidth() - intrinsicWidth) / 2;
            int height = (getHeight() - intrinsicHeight) / 2;
            drawable.setBounds(width, height, intrinsicWidth + width, intrinsicHeight + height);
            drawable.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        android.graphics.drawable.Drawable drawable;
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable2 = this.copydefault;
        if (drawable2 == null || !drawable2.isStateful() || (drawable = this.copydefault) == null) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void setCenterDrawable(android.graphics.drawable.Drawable drawable) {
        this.copydefault = drawable != null ? drawable.mutate() : null;
        setupSpacerText();
        KWHzl();
        invalidate();
    }

    public final void setCenterDrawable(int i) {
        if (i != 0) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            setCenterDrawable(C33070mpX.EZpvd(i, context));
            return;
        }
        setCenterDrawable((android.graphics.drawable.Drawable) null);
    }

    public final void setCenterDrawableTint(android.content.res.ColorStateList colorStateList) {
        this.OLrzqt = colorStateList;
        KWHzl();
        invalidate();
    }

    public final void setCenterDrawableTint(int i) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        setCenterDrawableTint(android.content.res.ColorStateList.valueOf(C33070mpX.OLrzqt(i, context)));
    }
}
