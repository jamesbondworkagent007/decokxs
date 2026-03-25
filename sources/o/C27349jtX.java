package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.DataBindingUtil;
import com.immomo.mls.fun.constants.TextAlign;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27349jtX extends ConstraintLayout {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public View.OnClickListener AEQbTJ;
    public int AYXKKw;
    public boolean AhwBna;
    public C25480ixX EZpvd;
    public final Activity KWHzl;
    public AbstractC23876iMp OLrzqt;
    public boolean djBIcL;
    public float gEmmrt;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27349jtX(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27349jtX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.AEQbTJ = onClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIntercept(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.jtX.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27349jtX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27349jtX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = true;
        this.KWHzl = new Activity();
        this.gEmmrt = 48.0f;
        copydefault(attributeSet);
    }

    /* JADX INFO: renamed from: o.jtX$Activity */
    public static final class Activity implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Activity() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C27349jtX.this.KWHzl();
            C27349jtX.this.djBIcL = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.AhwBna) {
            return true;
        }
        if (!this.djBIcL) {
            View.OnClickListener onClickListener = this.AEQbTJ;
            if (onClickListener != null) {
                onClickListener.onClick(this);
            }
            enterEditMode$default(this, false, 1, null);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void copydefault(android.util.AttributeSet attributeSet) {
        this.OLrzqt = (AbstractC23876iMp) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C25493ixk.Activity.RIuxYh, this, true);
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C25493ixk.PendingIntent.isConnected);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            try {
                this.valueOf = typedArrayObtainStyledAttributes.getBoolean(C25493ixk.PendingIntent.AkhnZx, true);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.AYXKKw = C33052mpF.EZpvd(210.0f, context);
        AbstractC23876iMp abstractC23876iMp = null;
        if (this.valueOf) {
            AbstractC23876iMp abstractC23876iMp2 = this.OLrzqt;
            if (abstractC23876iMp2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC23876iMp = abstractC23876iMp2;
            }
            C55033xcM c55033xcM = abstractC23876iMp.copydefault;
            TextViewCompat.setAutoSizeTextTypeWithDefaults(c55033xcM, 0);
            c55033xcM.setGravity(TextAlign.LEFT);
            ViewGroup.LayoutParams layoutParams = c55033xcM.getLayoutParams();
            android.content.Context context2 = c55033xcM.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            layoutParams.height = C33052mpF.EZpvd(60.0f, context2);
            c55033xcM.setTextSize(48.0f);
            c55033xcM.setMaxDecimalLength(6);
            c55033xcM.setMaxInputLength(30);
            return;
        }
        AbstractC23876iMp abstractC23876iMp3 = this.OLrzqt;
        if (abstractC23876iMp3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23876iMp = abstractC23876iMp3;
        }
        C55033xcM c55033xcM2 = abstractC23876iMp.copydefault;
        TextViewCompat.setAutoSizeTextTypeWithDefaults(c55033xcM2, 0);
        c55033xcM2.setGravity(TextAlign.LEFT);
        ViewGroup.LayoutParams layoutParams2 = c55033xcM2.getLayoutParams();
        android.content.Context context3 = c55033xcM2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        layoutParams2.height = C33052mpF.EZpvd(36.0f, context3);
        c55033xcM2.setTextSize(24.0f);
        c55033xcM2.setMaxDecimalLength(6);
        c55033xcM2.setMaxInputLength(30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl() {
        C25480ixX c25480ixX;
        C25480ixX c25480ixX2 = this.EZpvd;
        AbstractC23876iMp abstractC23876iMp = null;
        AbstractC23876iMp abstractC23876iMp2 = null;
        if (c25480ixX2 != null && c25480ixX2.valueOf()) {
            AbstractC23876iMp abstractC23876iMp3 = this.OLrzqt;
            if (abstractC23876iMp3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC23876iMp = abstractC23876iMp3;
            }
            abstractC23876iMp.gEmmrt.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DrNnAm));
            return;
        }
        if (!this.valueOf && (c25480ixX = this.EZpvd) != null && c25480ixX.gEmmrt()) {
            AbstractC23876iMp abstractC23876iMp4 = this.OLrzqt;
            if (abstractC23876iMp4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC23876iMp2 = abstractC23876iMp4;
            }
            abstractC23876iMp2.gEmmrt.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.fBE));
            return;
        }
        AbstractC23876iMp abstractC23876iMp5 = this.OLrzqt;
        if (abstractC23876iMp5 == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp5 = null;
        }
        android.widget.TextView textView = abstractC23876iMp5.gEmmrt;
        C25480ixX c25480ixX3 = this.EZpvd;
        textView.setText(c25480ixX3 != null ? c25480ixX3.AYXKKw() : null);
    }

    private final void KWHzl(C25480ixX c25480ixX) {
        if (c25480ixX.DbNXlk()) {
            return;
        }
        AbstractC23876iMp abstractC23876iMp = null;
        if (c25480ixX.fetchVPNInfo() && c25480ixX.djBIcL() != -1) {
            AbstractC23876iMp abstractC23876iMp2 = this.OLrzqt;
            if (abstractC23876iMp2 == null) {
                Intrinsics.gEmmrt("");
                abstractC23876iMp2 = null;
            }
            abstractC23876iMp2.copydefault.setMaxDecimalLength(c25480ixX.djBIcL());
        }
        if (this.valueOf && c25480ixX.isConnected()) {
            return;
        }
        AbstractC23876iMp abstractC23876iMp3 = this.OLrzqt;
        if (abstractC23876iMp3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23876iMp = abstractC23876iMp3;
        }
        abstractC23876iMp.copydefault.KWHzl().KWHzl(c25480ixX.OLrzqt());
    }

    public final void copydefault(C25480ixX c25480ixX) {
        AbstractC23876iMp abstractC23876iMp = this.OLrzqt;
        if (abstractC23876iMp == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp = null;
        }
        abstractC23876iMp.AEQbTJ.setText(c25480ixX.copydefault());
    }

    public static /* synthetic */ void enterEditMode$default(C27349jtX c27349jtX, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c27349jtX.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        this.gEmmrt = 48.0f;
        if (this.djBIcL || this.valueOf) {
            return;
        }
        this.djBIcL = true;
        this.valueOf = true;
        AbstractC23876iMp abstractC23876iMp = this.OLrzqt;
        AbstractC23876iMp abstractC23876iMp2 = null;
        if (abstractC23876iMp == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp = null;
        }
        float fDjBIcL = C33129mqd.djBIcL(java.lang.Integer.valueOf(C55298xhM.px2sp$default(abstractC23876iMp.copydefault.getTextSize(), (android.content.Context) null, 1, (java.lang.Object) null)));
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AbstractC23876iMp abstractC23876iMp3 = this.OLrzqt;
        if (abstractC23876iMp3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp3 = null;
        }
        java.lang.String string = abstractC23876iMp3.copydefault.getText().toString();
        AbstractC23876iMp abstractC23876iMp4 = this.OLrzqt;
        if (abstractC23876iMp4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23876iMp2 = abstractC23876iMp4;
        }
        android.text.TextPaint paint = abstractC23876iMp2.copydefault.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "");
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(java.lang.Math.min(24.0f, fDjBIcL), c27569jxf.copydefault(context, string, paint, this.AYXKKw, 48.0f, 2.0f, 2.0f)).setDuration(z ? 300L : 0L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.jub
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C27349jtX.copydefault(this.AEQbTJ, valueAnimator);
            }
        });
        duration.addListener(this.KWHzl);
        duration.start();
    }

    public static final void copydefault(C27349jtX c27349jtX, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        AbstractC23876iMp abstractC23876iMp = c27349jtX.OLrzqt;
        AbstractC23876iMp abstractC23876iMp2 = null;
        if (abstractC23876iMp == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp = null;
        }
        C55033xcM c55033xcM = abstractC23876iMp.copydefault;
        AbstractC23876iMp abstractC23876iMp3 = c27349jtX.OLrzqt;
        if (abstractC23876iMp3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp3 = null;
        }
        abstractC23876iMp3.copydefault.setTextSize(C33129mqd.djBIcL(valueAnimator.getAnimatedValue()));
        AbstractC23876iMp abstractC23876iMp4 = c27349jtX.OLrzqt;
        if (abstractC23876iMp4 == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp4 = null;
        }
        C55033xcM c55033xcM2 = abstractC23876iMp4.copydefault;
        AbstractC23876iMp abstractC23876iMp5 = c27349jtX.OLrzqt;
        if (abstractC23876iMp5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23876iMp2 = abstractC23876iMp5;
        }
        ViewGroup.LayoutParams layoutParams = abstractC23876iMp2.copydefault.getLayoutParams();
        android.content.Context context = c55033xcM.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        layoutParams.height = C33052mpF.EZpvd(36 + (valueAnimator.getAnimatedFraction() * 24), context);
        c55033xcM2.setLayoutParams(layoutParams);
    }

    public static /* synthetic */ void exitEditMode$default(C27349jtX c27349jtX, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c27349jtX.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        this.gEmmrt = 24.0f;
        if (this.djBIcL || !this.valueOf) {
            return;
        }
        this.djBIcL = true;
        this.valueOf = false;
        AbstractC23876iMp abstractC23876iMp = this.OLrzqt;
        AbstractC23876iMp abstractC23876iMp2 = null;
        if (abstractC23876iMp == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp = null;
        }
        float fDjBIcL = C33129mqd.djBIcL(java.lang.Integer.valueOf(C55298xhM.px2sp$default(abstractC23876iMp.copydefault.getTextSize(), (android.content.Context) null, 1, (java.lang.Object) null)));
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AbstractC23876iMp abstractC23876iMp3 = this.OLrzqt;
        if (abstractC23876iMp3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp3 = null;
        }
        java.lang.String string = abstractC23876iMp3.copydefault.getText().toString();
        AbstractC23876iMp abstractC23876iMp4 = this.OLrzqt;
        if (abstractC23876iMp4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23876iMp2 = abstractC23876iMp4;
        }
        android.text.TextPaint paint = abstractC23876iMp2.copydefault.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "");
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(fDjBIcL, c27569jxf.copydefault(context, string, paint, this.AYXKKw, 24.0f, 2.0f, 2.0f)).setDuration(z ? 300L : 0L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.jua
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C27349jtX.AEQbTJ(this.copydefault, valueAnimator);
            }
        });
        duration.addListener(this.KWHzl);
        duration.start();
    }

    public static final void AEQbTJ(C27349jtX c27349jtX, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        AbstractC23876iMp abstractC23876iMp = c27349jtX.OLrzqt;
        AbstractC23876iMp abstractC23876iMp2 = null;
        if (abstractC23876iMp == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp = null;
        }
        C55033xcM c55033xcM = abstractC23876iMp.copydefault;
        AbstractC23876iMp abstractC23876iMp3 = c27349jtX.OLrzqt;
        if (abstractC23876iMp3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp3 = null;
        }
        abstractC23876iMp3.copydefault.setTextSize(C33129mqd.djBIcL(valueAnimator.getAnimatedValue()));
        AbstractC23876iMp abstractC23876iMp4 = c27349jtX.OLrzqt;
        if (abstractC23876iMp4 == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp4 = null;
        }
        C55033xcM c55033xcM2 = abstractC23876iMp4.copydefault;
        AbstractC23876iMp abstractC23876iMp5 = c27349jtX.OLrzqt;
        if (abstractC23876iMp5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23876iMp2 = abstractC23876iMp5;
        }
        ViewGroup.LayoutParams layoutParams = abstractC23876iMp2.copydefault.getLayoutParams();
        android.content.Context context = c55033xcM.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        layoutParams.height = C33052mpF.EZpvd(60 - (valueAnimator.getAnimatedFraction() * 24), context);
        c55033xcM2.setLayoutParams(layoutParams);
    }

    public final void AEQbTJ(@NotNull C25480ixX c25480ixX) {
        Intrinsics.checkNotNullParameter(c25480ixX, "");
        this.EZpvd = c25480ixX;
        AbstractC23876iMp abstractC23876iMp = this.OLrzqt;
        AbstractC23876iMp abstractC23876iMp2 = null;
        if (abstractC23876iMp == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp = null;
        }
        abstractC23876iMp.EZpvd.setText(c25480ixX.EZpvd());
        copydefault(c25480ixX);
        KWHzl(c25480ixX);
        KWHzl();
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        AbstractC23876iMp abstractC23876iMp3 = this.OLrzqt;
        if (abstractC23876iMp3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp3 = null;
        }
        android.widget.ImageView imageView = abstractC23876iMp3.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView, c25480ixX.KWHzl(), c27569jxf.OLrzqt(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
        AbstractC23876iMp abstractC23876iMp4 = this.OLrzqt;
        if (abstractC23876iMp4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23876iMp2 = abstractC23876iMp4;
        }
        abstractC23876iMp2.EZpvd.post(new java.lang.Runnable() { // from class: o.jtZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C27349jtX.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final void AEQbTJ(C27349jtX c27349jtX) {
        C33566myq c33566myq = C33566myq.EZpvd;
        android.content.Context context = c27349jtX.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iEZpvd = c33566myq.EZpvd(context);
        android.content.Context context2 = c27349jtX.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iEZpvd2 = C33052mpF.EZpvd(78.0f, context2);
        AbstractC23876iMp abstractC23876iMp = c27349jtX.OLrzqt;
        if (abstractC23876iMp == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp = null;
        }
        c27349jtX.AYXKKw = (iEZpvd - iEZpvd2) - abstractC23876iMp.EZpvd.getWidth();
    }

    public final C55033xcM OLrzqt() {
        AbstractC23876iMp abstractC23876iMp = this.OLrzqt;
        if (abstractC23876iMp == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp = null;
        }
        C55033xcM c55033xcM = abstractC23876iMp.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55033xcM, "");
        return c55033xcM;
    }

    public final void copydefault() {
        AbstractC23876iMp abstractC23876iMp = this.OLrzqt;
        AbstractC23876iMp abstractC23876iMp2 = null;
        if (abstractC23876iMp == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp = null;
        }
        C55033xcM c55033xcM = abstractC23876iMp.copydefault;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AbstractC23876iMp abstractC23876iMp3 = this.OLrzqt;
        if (abstractC23876iMp3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23876iMp3 = null;
        }
        java.lang.String string = abstractC23876iMp3.copydefault.getText().toString();
        AbstractC23876iMp abstractC23876iMp4 = this.OLrzqt;
        if (abstractC23876iMp4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23876iMp2 = abstractC23876iMp4;
        }
        android.text.TextPaint paint = abstractC23876iMp2.copydefault.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "");
        c55033xcM.setTextSize(c27569jxf.copydefault(context, string, paint, this.AYXKKw, this.gEmmrt, 2.0f, 2.0f));
    }

    /* JADX INFO: renamed from: o.jtX$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jtX.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
