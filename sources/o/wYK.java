package o;

import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wYK extends AppCompatCheckBox implements InterfaceC55066xct {
    public static final int copydefault = 8;
    public final wYM AEQbTJ;
    public boolean EZpvd;
    public android.content.res.ColorStateList KWHzl;
    public boolean OLrzqt;
    public CompoundButton.OnCheckedChangeListener gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wYK(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wYK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] androidx.appcompat.R.attr.checkboxStyle int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.wYK.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wYK(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? androidx.appcompat.R.attr.checkboxStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wYK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        wYM wym = new wYM(this);
        this.AEQbTJ = wym;
        InterfaceC52764wXm.Application.loadFromAttributes$default(wym, attributeSet, i, 0, 4, null);
        this.OLrzqt = true;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.DcMfJK);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        if (typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.RZNAhV, 0) == 0) {
            post(new java.lang.Runnable() { // from class: o.wYN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    wYK.EZpvd(this.copydefault);
                }
            });
        }
        this.KWHzl = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.RbVjfb);
        setContentDescription("checkbox");
        typedArrayObtainStyledAttributes.recycle();
        C55296xhK.EZpvd((android.view.View) this, C55298xhM.OLrzqt(44, context));
    }

    public final void setError(boolean z) {
        this.EZpvd = z;
        copydefault(z);
    }

    public static final void EZpvd(wYK wyk) {
        if (wyk.getLayout() == null || wyk.getLayout().getLineCount() <= 1) {
            return;
        }
        wyk.setGravity(48);
    }

    public static /* synthetic */ void setErrorColor$default(wYK wyk, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = ContextCompat.getColor(wyk.getContext(), C52761wXj.Activity.UfveVb);
        }
        wyk.setErrorColor(i);
    }

    public final void setErrorColor(int i) {
        setTextColor(i);
        android.graphics.drawable.Drawable buttonDrawable = getButtonDrawable();
        android.graphics.drawable.Drawable drawableWrap = buttonDrawable != null ? DrawableCompat.wrap(buttonDrawable) : null;
        if (drawableWrap != null) {
            DrawableCompat.setTintList(drawableWrap, android.content.res.ColorStateList.valueOf(this.AEQbTJ.KWHzl()));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        java.lang.CharSequence text;
        super.onMeasure(i, i2);
        java.lang.CharSequence text2 = getText();
        if (text2 == null || text2.length() == 0 || (text = getText()) == null || StringsKt__StringsKt.fARcdN(text)) {
            return;
        }
        if (getLineCount() > 1 && getGravity() != 48) {
            setGravity(48);
        } else {
            if (getLineCount() != 1 || getGravity() == 16) {
                return;
            }
            setGravity(16);
        }
    }

    public final void setCheckedIgnoreListener(boolean z) {
        super.setOnCheckedChangeListener(null);
        setChecked(z);
        super.setOnCheckedChangeListener(this.gEmmrt);
    }

    public int OLrzqt() {
        return this.AEQbTJ.AEQbTJ();
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.AEQbTJ.setOKDSSize(i);
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        copydefault(this.EZpvd);
        return super.performClick();
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.gEmmrt = onCheckedChangeListener;
        super.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (android.text.TextUtils.isEmpty(charSequence) || !this.OLrzqt) {
            return;
        }
        setPaddingRelative(this.AEQbTJ.copydefault(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    public final void copydefault(boolean z) {
        android.graphics.drawable.Drawable drawableEZpvd;
        if (z && isEnabled()) {
            if (OLrzqt() == -4) {
                drawableEZpvd = this.AEQbTJ.OLrzqt();
            } else {
                drawableEZpvd = this.AEQbTJ.EZpvd();
            }
            setButtonDrawable(drawableEZpvd);
            setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.UfveVb));
            return;
        }
        this.AEQbTJ.gEmmrt();
        if (!isEnabled()) {
            setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.hfdhUn));
            return;
        }
        android.content.res.ColorStateList colorStateList = this.KWHzl;
        if (colorStateList == null) {
            setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.svhCHd));
        } else {
            setTextColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.hfdhUn));
        } else if (this.EZpvd) {
            setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.UfveVb));
        } else {
            setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.svhCHd));
        }
    }
}
