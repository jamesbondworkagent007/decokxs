package o;

import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import o.InterfaceC8101awQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tUQ extends android.widget.FrameLayout {
    public final StateListAnimator AEQbTJ;
    public int AYXKKw;
    public float AhwBna;
    public float DbNXlk;
    public int djBIcL;
    public boolean fetchVPNInfo;
    public int gEmmrt;
    public final LottieAnimationView isConnected;
    public float valueOf;
    public float values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public static final int KWHzl = C52761wXj.Activity.zuBGHE;
    public static final int EZpvd = C52761wXj.Activity.dvKsVJ;
    public static final int OLrzqt = C52761wXj.Activity.wlaJM;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUQ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:47) call: o.tUQ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tUQ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tUQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = EZpvd(2.0f);
        this.AhwBna = EZpvd(2.0f);
        this.djBIcL = C33070mpX.copydefault(EZpvd);
        this.AYXKKw = C33070mpX.copydefault(KWHzl);
        this.gEmmrt = C33070mpX.copydefault(OLrzqt);
        this.DbNXlk = EZpvd(14.0f);
        this.values = EZpvd(14.0f);
        StateListAnimator stateListAnimator = new StateListAnimator(this, context, null, 0, 6, null);
        stateListAnimator.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        stateListAnimator.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.AEQbTJ = stateListAnimator;
        addView(stateListAnimator);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.DbNXlk, (int) this.values);
        layoutParams.gravity = 8388693;
        lottieAnimationView.setLayoutParams(layoutParams);
        lottieAnimationView.setAnimation(C47501trL.PendingIntent.valueOf);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setVisibility(8);
        this.isConnected = lottieAnimationView;
        addView(lottieAnimationView);
        if (attributeSet != null) {
            EZpvd(attributeSet);
        }
    }

    public final void EZpvd(android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C47501trL.FragmentManager.AkhnZx);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.fetchVPNInfo = typedArrayObtainStyledAttributes.getBoolean(C47501trL.FragmentManager.uzCIH, false);
            this.djBIcL = typedArrayObtainStyledAttributes.getColor(C47501trL.FragmentManager.fIwbmz, C33070mpX.copydefault(EZpvd));
            this.gEmmrt = typedArrayObtainStyledAttributes.getColor(C47501trL.FragmentManager.AuCTel, C33070mpX.copydefault(OLrzqt));
            this.valueOf = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.ejfBZ, EZpvd(2.0f));
            this.AhwBna = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.fARcdN, EZpvd(2.0f));
            this.DbNXlk = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.hDKMBd, EZpvd(14.0f));
            this.values = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.fJNWhG, EZpvd(14.0f));
            typedArrayObtainStyledAttributes.recycle();
            copydefault();
            OLrzqt();
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void copydefault() {
        LottieAnimationView lottieAnimationView = this.isConnected;
        ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = (int) this.DbNXlk;
        layoutParams2.height = (int) this.values;
        lottieAnimationView.setLayoutParams(layoutParams2);
    }

    public final void setIndicatorSize(int i, int i2) {
        this.DbNXlk = i;
        this.values = i2;
        copydefault();
    }

    public final void setIndicatorSizeDp(float f, float f2) {
        this.DbNXlk = EZpvd(f);
        this.values = EZpvd(f2);
        copydefault();
    }

    public final void setLiveState(boolean z) {
        if (this.fetchVPNInfo == z) {
            return;
        }
        this.fetchVPNInfo = z;
        OLrzqt();
    }

    public final void EZpvd(boolean z) {
        this.fetchVPNInfo = false;
        StateListAnimator stateListAnimator = this.AEQbTJ;
        stateListAnimator.setRingVisible(true);
        stateListAnimator.setRingColors(z ? this.djBIcL : this.AYXKKw, this.gEmmrt);
        stateListAnimator.setRingWidths(this.valueOf, this.AhwBna);
        LottieAnimationView lottieAnimationView = this.isConnected;
        lottieAnimationView.setVisibility(8);
        lottieAnimationView.cancelAnimation();
    }

    public final void OLrzqt() {
        StateListAnimator stateListAnimator = this.AEQbTJ;
        stateListAnimator.setRingVisible(this.fetchVPNInfo);
        stateListAnimator.setRingColors(this.djBIcL, this.gEmmrt);
        stateListAnimator.setRingWidths(this.valueOf, this.AhwBna);
        LottieAnimationView lottieAnimationView = this.isConnected;
        lottieAnimationView.setVisibility(this.fetchVPNInfo ? 0 : 8);
        if (this.fetchVPNInfo) {
            lottieAnimationView.playAnimation();
        } else {
            lottieAnimationView.cancelAnimation();
        }
    }

    public final void KWHzl(java.lang.String str) {
        StateListAnimator stateListAnimator = this.AEQbTJ;
        if (str == null) {
            str = "";
        }
        C33054mpH.loadAvatar$default(stateListAnimator, str, null, null, 6, null);
    }

    public static /* synthetic */ void loadSelfAvatar$default(tUQ tuq, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        tuq.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        InterfaceC8101awQ interfaceC8101awQ = (InterfaceC8101awQ) C43251rlk.OLrzqt(InterfaceC8101awQ.class);
        if (interfaceC8101awQ != null) {
            InterfaceC8101awQ.Activity.loadUserAvatar$default(interfaceC8101awQ, this.AEQbTJ, z, null, 4, null);
        }
    }

    public final void setAvatarResource(int i) {
        this.AEQbTJ.setImageResource(i);
    }

    public final float EZpvd(float f) {
        return C55298xhM.dp2pxFloat$default(f, null, 1, null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tUQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final class StateListAnimator extends AppCompatImageView {
        public boolean AEQbTJ;
        public float EZpvd;
        public final android.graphics.Paint KWHzl;
        public float OLrzqt;
        public final android.graphics.Paint copydefault;
        public final /* synthetic */ tUQ gEmmrt;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 o.tUQ)
  (r2v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(o.tUQ, android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:262) call: o.tUQ.StateListAnimator.<init>(o.tUQ, android.content.Context, android.util.AttributeSet, int):void type: THIS */
        public /* synthetic */ StateListAnimator(tUQ tuq, android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(tuq, context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull tUQ tuq, android.content.Context context, android.util.AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            Intrinsics.checkNotNullParameter(context, "");
            this.gEmmrt = tuq;
            this.OLrzqt = tuq.EZpvd(2.0f);
            this.EZpvd = tuq.EZpvd(2.0f);
            android.graphics.Paint paint = new android.graphics.Paint(1);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setColor(tuq.djBIcL);
            paint.setStrokeWidth(this.OLrzqt);
            this.copydefault = paint;
            android.graphics.Paint paint2 = new android.graphics.Paint(1);
            paint2.setStyle(style);
            paint2.setColor(tuq.gEmmrt);
            paint2.setStrokeWidth(this.EZpvd);
            this.KWHzl = paint2;
        }

        public final void setRingVisible(boolean z) {
            this.AEQbTJ = z;
            invalidate();
        }

        public final void setRingColors(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2) {
            this.copydefault.setColor(i);
            this.KWHzl.setColor(i2);
            invalidate();
        }

        public final void setRingWidths(float f, float f2) {
            this.OLrzqt = f;
            this.EZpvd = f2;
            this.copydefault.setStrokeWidth(f);
            this.KWHzl.setStrokeWidth(f2);
            invalidate();
        }

        @Override // android.widget.ImageView, android.view.View
        public void onDraw(@NotNull android.graphics.Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "");
            if (this.AEQbTJ) {
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f = this.OLrzqt / 2.0f;
                float fMin = (java.lang.Math.min(getWidth(), getHeight()) / 2.0f) - f;
                float f2 = this.EZpvd / 2.0f;
                canvas.drawCircle(width, height, fMin, this.copydefault);
                canvas.drawCircle(width, height, (fMin - f) - f2, this.KWHzl);
                int i = (int) (this.OLrzqt + this.EZpvd);
                setPadding(i, i, i, i);
            } else {
                setPadding(0, 0, 0, 0);
            }
            super.onDraw(canvas);
        }
    }
}
