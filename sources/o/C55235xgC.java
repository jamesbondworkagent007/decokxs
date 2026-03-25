package o;

import android.text.InputFilter;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55235xgC extends ConstraintLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public C52794wYp AEQbTJ;
    public View.OnClickListener AYXKKw;
    public int AhwBna;
    public final C54920xaF EZpvd;
    public wYC KWHzl;
    public java.lang.CharSequence copydefault;
    public int djBIcL;
    public java.lang.CharSequence gEmmrt;
    public View.OnClickListener valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55235xgC(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55235xgC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActionButton(C52794wYp c52794wYp) {
        this.AEQbTJ = c52794wYp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseIcon(wYC wyc) {
        this.KWHzl = wyc;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.xgC.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55235xgC(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55235xgC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C54920xaF c54920xaFKWHzl = C54920xaF.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c54920xaFKWHzl, "");
        this.EZpvd = c54920xaFKWHzl;
        this.copydefault = "";
        this.gEmmrt = "";
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.OqHLSf);
        setType(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.dkJJWw, 0));
        setStyle(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.fmdvVn, 0));
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.OeawrHOeawrH);
        setDescription(string != null ? string : "");
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setType(int i) {
        this.AhwBna = i;
        KWHzl();
    }

    public final void setStyle(int i) {
        this.djBIcL = i;
        OLrzqt();
    }

    public final void setDescription(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.copydefault = charSequence;
        this.EZpvd.copydefault.setText(charSequence);
    }

    public final void setEndButtonText(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.gEmmrt = charSequence;
        C52794wYp c52794wYp = this.AEQbTJ;
        if (c52794wYp != null) {
            c52794wYp.setText(charSequence);
        }
    }

    public final void setEndButtonClickListener(View.OnClickListener onClickListener) {
        this.AYXKKw = onClickListener;
        C52794wYp c52794wYp = this.AEQbTJ;
        if (c52794wYp != null) {
            c52794wYp.setOnClickListener(onClickListener);
        }
    }

    public final void setEndIconClickListener(View.OnClickListener onClickListener) {
        this.valueOf = onClickListener;
        wYC wyc = this.KWHzl;
        if (wyc != null) {
            wyc.setOnClickListener(onClickListener);
        }
    }

    private final void KWHzl() {
        int i = this.AhwBna;
        if (i == 0) {
            this.EZpvd.EZpvd.setImageResource(C52761wXj.TaskDescription.ORWKdN);
            return;
        }
        if (i == 1) {
            this.EZpvd.EZpvd.setImageResource(C52761wXj.TaskDescription.shErWi);
        } else if (i == 2) {
            this.EZpvd.EZpvd.setImageResource(C52761wXj.TaskDescription.TarCU);
        } else {
            if (i != 3) {
                return;
            }
            this.EZpvd.EZpvd.setImageResource(C52761wXj.TaskDescription.gqESXP);
        }
    }

    public final void OLrzqt() {
        int i = this.djBIcL;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            android.widget.FrameLayout frameLayout = this.EZpvd.KWHzl;
            frameLayout.removeAllViews();
            this.KWHzl = null;
            android.content.Context context = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C52794wYp c52794wYp = new C52794wYp(C55374xij.AEQbTJ(context, 32), null, 0, 6, null);
            this.AEQbTJ = c52794wYp;
            c52794wYp.setOKDSType(259);
            c52794wYp.setOKDSSize(24);
            c52794wYp.setFilters(new android.text.InputFilter[]{new InputFilter.LengthFilter(20)});
            c52794wYp.setContentDescription("snackbar_action");
            c52794wYp.setText(this.gEmmrt);
            c52794wYp.setOnClickListener(this.AYXKKw);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            Unit unit = Unit.INSTANCE;
            frameLayout.addView(c52794wYp, layoutParams);
            return;
        }
        android.widget.FrameLayout frameLayout2 = this.EZpvd.KWHzl;
        frameLayout2.removeAllViews();
        this.AEQbTJ = null;
        android.content.Context context2 = frameLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        wYC wyc = new wYC(context2, null, 0, 6, null);
        wyc.setId(C52761wXj.FragmentManager.hUfVAv);
        this.KWHzl = wyc;
        wyc.setImageResource(C52761wXj.TaskDescription.alsFma);
        ImageViewCompat.setImageTintList(wyc, android.content.res.ColorStateList.valueOf(ContextCompat.getColor(wyc.getContext(), C52761wXj.Activity.sIqKDg)));
        wyc.setContentDescription("snackbar_close");
        wyc.setOnClickListener(this.valueOf);
        android.content.Context context3 = frameLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        int iOLrzqt = C55298xhM.OLrzqt(24, context3);
        android.content.Context context4 = frameLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iOLrzqt, C55298xhM.OLrzqt(24, context4));
        layoutParams2.gravity = 48;
        Unit unit2 = Unit.INSTANCE;
        frameLayout2.addView(wyc, layoutParams2);
    }

    /* JADX INFO: renamed from: o.xgC$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xgC.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
