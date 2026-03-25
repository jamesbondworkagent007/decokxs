package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class wYB extends android.widget.LinearLayout implements InterfaceC55066xct {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final int AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public int KWHzl;
    public C55279xgu OLrzqt;
    public final C54951xak copydefault;
    public int djBIcL;
    public C55280xgv gEmmrt;
    public final C55065xcs valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wYB(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wYB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:34) call: o.wYB.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wYB(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wYB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C54951xak c54951xakKWHzl = C54951xak.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54951xakKWHzl, "");
        this.copydefault = c54951xakKWHzl;
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.valueOf = c55065xcs;
        this.gEmmrt = new C55280xgv();
        this.OLrzqt = new C55279xgu();
        this.AEQbTJ = 1;
        setOrientation(1);
        setGravity(17);
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, i, 0, 4, null);
        C55279xgu c55279xgu = this.OLrzqt;
        c55279xgu.OLrzqt(C55298xhM.EZpvd(999.0f, context));
        c55279xgu.copydefault(true);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.RTWSvT, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.KWHzl = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.iqMDAV, 0);
        this.AhwBna = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.ggKfIT, 1);
        this.djBIcL = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.UccSpe, 1);
        this.AYXKKw = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.RqmePg, 1);
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.RzdrRQ);
        if (drawable != null) {
            c54951xakKWHzl.copydefault.setImageDrawable(drawable);
        }
        EZpvd();
        c54951xakKWHzl.AEQbTJ.setText(C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.iHkeWl, 0, 4, null));
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.RgLUBD, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final android.widget.ImageView OLrzqt() {
        android.widget.ImageView imageView = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final android.widget.TextView AEQbTJ() {
        android.widget.TextView textView = this.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public static /* synthetic */ void setStyle$default(wYB wyb, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStyle");
        }
        if ((i2 & 1) != 0) {
            i = 0;
        }
        wyb.setStyle(i);
    }

    public final void setStyle(int i) {
        this.KWHzl = i;
        EZpvd();
        invalidate();
    }

    public static /* synthetic */ void setTintColor$default(wYB wyb, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTintColor");
        }
        if ((i4 & 1) != 0) {
            i = wyb.AEQbTJ;
        }
        if ((i4 & 2) != 0) {
            i2 = wyb.AEQbTJ;
        }
        if ((i4 & 4) != 0) {
            i3 = wyb.AEQbTJ;
        }
        wyb.setTintColor(i, i2, i3);
    }

    public final void setTintColor(int i, int i2, int i3) {
        this.AhwBna = i;
        this.djBIcL = i2;
        this.AYXKKw = i3;
        android.widget.ImageView imageView = this.copydefault.copydefault;
        if (!isEnabled()) {
            i = i3;
        }
        imageView.setImageTintList(android.content.res.ColorStateList.valueOf(i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (KWHzl() >= -2) {
            ViewGroup.LayoutParams layoutParams = this.copydefault.OLrzqt.getLayoutParams();
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            layoutParams.width = C55298xhM.OLrzqt(56, context);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            layoutParams.height = C55298xhM.OLrzqt(56, context2);
            ViewGroup.LayoutParams layoutParams2 = this.copydefault.copydefault.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                marginLayoutParams.width = C55298xhM.OLrzqt(28, context3);
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                marginLayoutParams.height = C55298xhM.OLrzqt(28, context4);
            }
        } else if (KWHzl() >= -3) {
            ViewGroup.LayoutParams layoutParams3 = this.copydefault.OLrzqt.getLayoutParams();
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            layoutParams3.width = C55298xhM.OLrzqt(48, context5);
            android.content.Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            layoutParams3.height = C55298xhM.OLrzqt(48, context6);
            ViewGroup.LayoutParams layoutParams4 = this.copydefault.copydefault.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                android.content.Context context7 = getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                marginLayoutParams2.width = C55298xhM.OLrzqt(24, context7);
                android.content.Context context8 = getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "");
                marginLayoutParams2.height = C55298xhM.OLrzqt(24, context8);
            }
        } else {
            ViewGroup.LayoutParams layoutParams5 = this.copydefault.OLrzqt.getLayoutParams();
            android.content.Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "");
            layoutParams5.width = C55298xhM.OLrzqt(32, context9);
            android.content.Context context10 = getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "");
            layoutParams5.height = C55298xhM.OLrzqt(32, context10);
            ViewGroup.LayoutParams layoutParams6 = this.copydefault.copydefault.getLayoutParams();
            android.content.Context context11 = getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "");
            layoutParams6.width = C55298xhM.OLrzqt(16, context11);
            android.content.Context context12 = getContext();
            Intrinsics.checkNotNullExpressionValue(context12, "");
            layoutParams6.height = C55298xhM.OLrzqt(16, context12);
        }
        super.onMeasure(i, i2);
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.valueOf.setOKDSSize(i);
        requestLayout();
    }

    public int KWHzl() {
        return this.valueOf.copydefault();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.copydefault.copydefault.performClick();
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (!isEnabled()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            android.widget.ImageView imageView = this.copydefault.copydefault;
            int i = this.djBIcL;
            imageView.setImageTintList(i != this.AEQbTJ ? android.content.res.ColorStateList.valueOf(i) : null);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            android.widget.ImageView imageView2 = this.copydefault.copydefault;
            int i2 = this.AhwBna;
            imageView2.setImageTintList(i2 != this.AEQbTJ ? android.content.res.ColorStateList.valueOf(i2) : null);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
        if (z) {
            C54951xak c54951xak = this.copydefault;
            android.widget.ImageView imageView = c54951xak.copydefault;
            int i2 = this.AhwBna;
            imageView.setImageTintList(i2 != this.AEQbTJ ? android.content.res.ColorStateList.valueOf(i2) : null);
            c54951xak.AEQbTJ.setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.svhCHd));
            return;
        }
        C54951xak c54951xak2 = this.copydefault;
        android.widget.ImageView imageView2 = c54951xak2.copydefault;
        int i3 = this.AYXKKw;
        imageView2.setImageTintList(i3 != this.AEQbTJ ? android.content.res.ColorStateList.valueOf(i3) : null);
        c54951xak2.AEQbTJ.setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.hfdhUn));
    }

    public final void EZpvd() {
        int i = this.KWHzl;
        if (i == 0) {
            setContainerSelectorColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.GQzpsZ), ContextCompat.getColor(getContext(), C52761wXj.Activity.GcnicV), ContextCompat.getColor(getContext(), C52761wXj.Activity.RXdAnZ));
        } else if (i == 1) {
            this.OLrzqt.DbNXlk(ContextCompat.getColor(getContext(), C52761wXj.Activity.aBDePw));
            setContainerSelectorColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.aBDePw), ContextCompat.getColor(getContext(), C52761wXj.Activity.GcnicV), ContextCompat.getColor(getContext(), C52761wXj.Activity.aBDePw));
        } else if (i == 2) {
            this.OLrzqt.DbNXlk(ContextCompat.getColor(getContext(), C52761wXj.Activity.aBDePw));
            setContainerSelectorColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.RFmUsE), ContextCompat.getColor(getContext(), C52761wXj.Activity.pXZxY), ContextCompat.getColor(getContext(), C52761wXj.Activity.gAnGwV));
        } else if (i == 3) {
            this.OLrzqt.DbNXlk(ContextCompat.getColor(getContext(), C52761wXj.Activity.aBDePw));
            C33517mxu c33517mxu = C33517mxu.KWHzl;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = c33517mxu.OLrzqt(context, C52761wXj.ActionBar.aKErDB);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            setContainerSelectorColor(iOLrzqt, c33517mxu.OLrzqt(context2, C52761wXj.ActionBar.fFgQHt), ContextCompat.getColor(getContext(), C52761wXj.Activity.RXdAnZ));
            if (this.AhwBna == this.AEQbTJ) {
                this.AhwBna = ContextCompat.getColor(getContext(), C52761wXj.Activity.sIqKDg);
            }
            if (this.djBIcL == this.AEQbTJ) {
                this.djBIcL = ContextCompat.getColor(getContext(), C52761wXj.Activity.sIqKDg);
            }
            if (this.AYXKKw == this.AEQbTJ) {
                this.AYXKKw = ContextCompat.getColor(getContext(), C52761wXj.Activity.hfdhUn);
            }
        }
        C55280xgv c55280xgv = this.gEmmrt;
        android.widget.LinearLayout linearLayout = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        c55280xgv.KWHzl(linearLayout, this.OLrzqt);
    }

    public final void setContainerSelectorColor(int i, int i2, int i3) {
        C55279xgu c55279xgu = this.OLrzqt;
        c55279xgu.AhwBna(i);
        c55279xgu.AYXKKw(i2);
        c55279xgu.valueOf(i3);
        C55280xgv c55280xgv = this.gEmmrt;
        android.widget.LinearLayout linearLayout = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        c55280xgv.KWHzl(linearLayout, this.OLrzqt);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wYB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
