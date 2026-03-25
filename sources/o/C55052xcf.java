package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55052xcf extends ConstraintLayout implements InterfaceC55066xct {
    public boolean AEQbTJ;
    public final C55065xcs EZpvd;
    public wZW KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55052xcf(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:26) call: o.xcf.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C55052xcf(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55052xcf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.EZpvd = c55065xcs;
        wZW wzwOLrzqt = wZW.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(wzwOLrzqt, "");
        this.KWHzl = wzwOLrzqt;
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, 0, 0, 6, null);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.getValue);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.GQzpsZgQzpsZ);
        if (drawable != null) {
            android.widget.ImageView imageViewAEQbTJ = AEQbTJ();
            imageViewAEQbTJ.setImageDrawable(drawable);
            imageViewAEQbTJ.setVisibility(0);
        }
        copydefault().setText(typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.hKJZrr));
        TextViewCompat.setLineHeight(copydefault(), C55298xhM.OLrzqt(16, context));
        typedArrayObtainStyledAttributes.recycle();
        setSize();
    }

    public final void setTitle(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.KWHzl.copydefault.setText(charSequence);
    }

    public final android.widget.ImageView AEQbTJ() {
        android.widget.ImageView imageView = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final android.widget.TextView copydefault() {
        android.widget.TextView textView = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.ImageView EZpvd() {
        android.widget.ImageView imageView = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public int KWHzl() {
        return this.EZpvd.copydefault();
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.EZpvd.setOKDSSize(i);
        setSize();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        setSelected(z, true);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        boolean z2 = isEnabled() != z;
        super.setEnabled(z);
        if (z2) {
            wZW wzw = this.KWHzl;
            wzw.copydefault.setEnabled(z);
            wzw.OLrzqt.setEnabled(z);
            KWHzl(isSelected());
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.AEQbTJ = onLongClickListener != null;
        super.setOnLongClickListener(onLongClickListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (hasOnClickListeners() || this.AEQbTJ) {
            if (motionEvent.getAction() == 0) {
                copydefault().setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.DCUTEIddSDPG));
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                copydefault().setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.fdOvFl));
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setSelected(boolean z, boolean z2) {
        boolean z3 = isSelected() != z;
        super.setSelected(z);
        if (isEnabled() && z3) {
            KWHzl(z);
        }
    }

    public final void KWHzl(boolean z) {
        if (z) {
            this.KWHzl.OLrzqt.setImageResource(C52761wXj.TaskDescription.dUDNAs);
        } else {
            this.KWHzl.OLrzqt.setImageResource(C52761wXj.TaskDescription.QSLkRj);
        }
    }

    public final void setSize() {
        android.content.Context context;
        int i;
        wZW wzw = this.KWHzl;
        if (KWHzl() >= -4) {
            context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i = 8;
        } else {
            context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i = 6;
        }
        int iOLrzqt = C55298xhM.OLrzqt(i, context);
        wzw.getRoot().setPadding(0, iOLrzqt, 0, iOLrzqt);
        wzw.copydefault.setTextSize(KWHzl() >= -4 ? 14.0f : 12.0f);
        android.widget.ImageView imageView = wzw.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            float f = KWHzl() >= -4 ? 16.0f : 12.0f;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iKWHzl = C55298xhM.KWHzl(f, context2);
            layoutParams.width = iKWHzl;
            layoutParams.height = iKWHzl;
            imageView.setLayoutParams(layoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
