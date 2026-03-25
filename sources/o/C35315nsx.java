package o;

import android.view.View;
import android.widget.FrameLayout;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.im.camera.OKIMCaptureMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.InterfaceC35275nsJ;
import o.InterfaceC35317nsz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nsx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35315nsx extends android.widget.FrameLayout {
    public final int AYXKKw;
    public int AhwBna;
    public final android.widget.ImageView AkhnZx;
    public Function0<Unit> DbNXlk;
    public final android.widget.ImageView EZpvd;
    public InterfaceC35317nsz KWHzl;
    public final int OLrzqt;
    public final C35309nsr copydefault;
    public final int djBIcL;
    public InterfaceC35275nsJ ejfBZ;
    public final android.widget.TextView fARcdN;
    public final C35274nsI fetchVPNInfo;
    public final android.widget.ImageView gEmmrt;
    public final android.widget.ImageView isConnected;
    public int valueOf;
    public Function0<Unit> values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.nsx$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKIMCaptureMode.values().length];
            try {
                iArr[OKIMCaptureMode.BOTH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKIMCaptureMode.CAPTURE_ONLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKIMCaptureMode.RECORD_ONLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35315nsx(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35315nsx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC35317nsz OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftClickListener(Function0<Unit> function0) {
        this.DbNXlk = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightClickListener(Function0<Unit> function0) {
        this.values = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTypeListener(InterfaceC35275nsJ interfaceC35275nsJ) {
        this.ejfBZ = interfaceC35275nsJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:30) call: o.nsx.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C35315nsx(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35315nsx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        int i2 = context.getResources().getDisplayMetrics().widthPixels;
        this.AYXKKw = i2;
        int iEZpvd = C33518mxv.EZpvd(context, 96.0f);
        this.OLrzqt = iEZpvd;
        this.djBIcL = ((iEZpvd / 5) * 2) + iEZpvd + 100;
        setWillNotDraw(false);
        float f = iEZpvd;
        C35309nsr c35309nsr = new C35309nsr(context, (int) (0.75f * f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        c35309nsr.setLayoutParams(layoutParams);
        c35309nsr.setCaptureListener(new Application());
        this.copydefault = c35309nsr;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setImageResource(C35399nuc.ActionBar.dxcTrN);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iEZpvd, iEZpvd);
        layoutParams2.gravity = TextAlign.LEFT;
        int i3 = ((i2 / 2) - iEZpvd) - 64;
        layoutParams2.setMarginStart(i3);
        imageView.setLayoutParams(layoutParams2);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.nsw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35315nsx.valueOf(this.KWHzl, view);
            }
        });
        imageView.setVisibility(8);
        this.EZpvd = imageView;
        android.widget.ImageView imageView2 = new android.widget.ImageView(context);
        imageView2.setImageResource(C35399nuc.ActionBar.fFgQHt);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iEZpvd, iEZpvd);
        layoutParams3.gravity = TextAlign.RIGHT;
        layoutParams3.setMarginEnd(i3);
        imageView2.setLayoutParams(layoutParams3);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.nsC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35315nsx.AhwBna(this.KWHzl, view);
            }
        });
        imageView2.setVisibility(8);
        this.gEmmrt = imageView2;
        C35274nsI c35274nsI = new C35274nsI(context, (int) (f / 2.5f));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = TextAlign.LEFT;
        int i4 = i2 / 6;
        layoutParams4.setMarginStart(i4);
        c35274nsI.setLayoutParams(layoutParams4);
        c35274nsI.setOnClickListener(new View.OnClickListener() { // from class: o.nsB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35315nsx.gEmmrt(this.KWHzl, view);
            }
        });
        this.fetchVPNInfo = c35274nsI;
        android.widget.ImageView imageView3 = new android.widget.ImageView(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = TextAlign.LEFT;
        layoutParams5.setMarginStart(i4);
        imageView3.setLayoutParams(layoutParams5);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: o.nsD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35315nsx.djBIcL(this.OLrzqt, view);
            }
        });
        imageView3.setVisibility(8);
        this.isConnected = imageView3;
        android.widget.ImageView imageView4 = new android.widget.ImageView(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = TextAlign.RIGHT;
        layoutParams6.setMarginEnd(i4);
        imageView4.setLayoutParams(layoutParams6);
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: o.nsE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35315nsx.AYXKKw(this.AEQbTJ, view);
            }
        });
        imageView4.setVisibility(8);
        this.AkhnZx = imageView4;
        android.widget.TextView textView = new android.widget.TextView(context);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams7.gravity = 1;
        layoutParams7.setMargins(0, 20, 0, 0);
        textView.setLayoutParams(layoutParams7);
        textView.setTextColor(-1);
        textView.setGravity(17);
        this.fARcdN = textView;
        addView(c35309nsr);
        addView(imageView);
        addView(imageView2);
        addView(c35274nsI);
        addView(imageView3);
        addView(imageView4);
        addView(textView);
        EZpvd(c35309nsr.AEQbTJ());
    }

    /* JADX INFO: renamed from: o.nsx$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nsx.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void setCaptureListener(InterfaceC35317nsz interfaceC35317nsz) {
        this.KWHzl = interfaceC35317nsz;
        this.copydefault.setCaptureListener(interfaceC35317nsz);
    }

    /* JADX INFO: renamed from: o.nsx$Application */
    public static final class Application implements InterfaceC35317nsz {
        public Application() {
        }

        @Override // o.InterfaceC35317nsz
        public void OLrzqt(InterfaceC35317nsz.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            if ((stateListAnimator instanceof InterfaceC35317nsz.StateListAnimator.Fragment) || (stateListAnimator instanceof InterfaceC35317nsz.StateListAnimator.Application)) {
                C35315nsx.this.KWHzl();
            }
            InterfaceC35317nsz interfaceC35317nszOLrzqt = C35315nsx.this.OLrzqt();
            if (interfaceC35317nszOLrzqt != null) {
                interfaceC35317nszOLrzqt.OLrzqt(stateListAnimator);
            }
        }
    }

    public static final void valueOf(final C35315nsx c35315nsx, android.view.View view) {
        c35315nsx.copydefault(new Function0() { // from class: o.nsF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35315nsx.gEmmrt(this.KWHzl);
            }
        });
    }

    public static final Unit gEmmrt(C35315nsx c35315nsx) {
        InterfaceC35275nsJ interfaceC35275nsJ = c35315nsx.ejfBZ;
        if (interfaceC35275nsJ != null) {
            interfaceC35275nsJ.EZpvd(InterfaceC35275nsJ.Activity.C0896Activity.KWHzl);
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(C35315nsx c35315nsx, android.view.View view) {
        InterfaceC35275nsJ interfaceC35275nsJ = c35315nsx.ejfBZ;
        if (interfaceC35275nsJ != null) {
            interfaceC35275nsJ.EZpvd(InterfaceC35275nsJ.Activity.StateListAnimator.OLrzqt);
        }
    }

    public static final void gEmmrt(C35315nsx c35315nsx, android.view.View view) {
        Function0<Unit> function0 = c35315nsx.DbNXlk;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void djBIcL(C35315nsx c35315nsx, android.view.View view) {
        Function0<Unit> function0 = c35315nsx.DbNXlk;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void AYXKKw(C35315nsx c35315nsx, android.view.View view) {
        Function0<Unit> function0 = c35315nsx.values;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.AYXKKw, this.djBIcL);
    }

    /* JADX INFO: renamed from: o.nsx$PendingIntent */
    public static final class PendingIntent extends android.animation.AnimatorListenerAdapter {
        public PendingIntent() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C35315nsx.this.EZpvd.setClickable(true);
            C35315nsx.this.gEmmrt.setClickable(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nsx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void hideTypeButtons$default(C35315nsx c35315nsx, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c35315nsx.copydefault((Function0<Unit>) function0);
    }

    public final void copydefault(Function0<Unit> function0) {
        android.animation.ObjectAnimator objectAnimatorOfFloat;
        android.animation.ObjectAnimator objectAnimatorOfFloat2;
        this.EZpvd.setClickable(false);
        this.gEmmrt.setClickable(false);
        float f = (this.OLrzqt / 2.0f) + 64;
        boolean zAEQbTJ = C55296xhK.AEQbTJ(this);
        if (!zAEQbTJ) {
            objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.EZpvd, "translationX", 0.0f, f);
        } else {
            objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.EZpvd, "translationX", 0.0f, -f);
        }
        if (!zAEQbTJ) {
            objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this.gEmmrt, "translationX", 0.0f, -f);
        } else {
            objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this.gEmmrt, "translationX", 0.0f, f);
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new TaskDescription(function0));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: o.nsx$TaskDescription */
    public static final class TaskDescription extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ Function0<Unit> copydefault;

        public TaskDescription(Function0<Unit> function0) {
            this.copydefault = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C35315nsx.this.EZpvd.setTranslationX(0.0f);
            C35315nsx.this.gEmmrt.setTranslationX(0.0f);
            C35315nsx.this.AEQbTJ();
            Function0<Unit> function0 = this.copydefault;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fARcdN.setText(str);
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.fARcdN, "alpha", 0.0f, 1.0f, 1.0f, 0.0f);
        objectAnimatorOfFloat.addListener(new ActionBar());
        objectAnimatorOfFloat.setDuration(2500L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: o.nsx$ActionBar */
    public static final class ActionBar extends android.animation.AnimatorListenerAdapter {
        public ActionBar() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C35315nsx c35315nsx = C35315nsx.this;
            c35315nsx.EZpvd(c35315nsx.copydefault.AEQbTJ());
            C35315nsx.this.fARcdN.setAlpha(1.0f);
        }
    }

    public final void AEQbTJ() {
        this.copydefault.valueOf();
        this.EZpvd.setVisibility(8);
        this.gEmmrt.setVisibility(8);
        this.copydefault.setVisibility(0);
        EZpvd(this.copydefault.AEQbTJ());
        this.fARcdN.setVisibility(8);
        if (this.AhwBna != 0) {
            this.isConnected.setVisibility(0);
        } else {
            this.fetchVPNInfo.setVisibility(0);
        }
        if (this.valueOf != 0) {
            this.AkhnZx.setVisibility(0);
        }
    }

    public final void setDuration(int i) {
        this.copydefault.setMaxDuration(i);
    }

    public final void setCaptureMode(@NotNull OKIMCaptureMode oKIMCaptureMode) {
        Intrinsics.checkNotNullParameter(oKIMCaptureMode, "");
        this.copydefault.setCaptureMode(oKIMCaptureMode);
        EZpvd(oKIMCaptureMode);
    }

    public final void setIconSrc(@androidx.annotation.DrawableRes int i, @androidx.annotation.DrawableRes int i2) {
        this.AhwBna = i;
        this.valueOf = i2;
        if (i != 0) {
            this.isConnected.setImageResource(i);
            this.isConnected.setVisibility(0);
            this.fetchVPNInfo.setVisibility(8);
        } else {
            this.isConnected.setVisibility(8);
            this.fetchVPNInfo.setVisibility(0);
        }
        if (i2 != 0) {
            this.AkhnZx.setImageResource(i2);
            this.AkhnZx.setVisibility(0);
        } else {
            this.AkhnZx.setVisibility(8);
        }
    }

    public final void EZpvd(OKIMCaptureMode oKIMCaptureMode) {
        java.lang.String string;
        int i = Activity.KWHzl[oKIMCaptureMode.ordinal()];
        if (i == 1) {
            string = getContext().getString(C35399nuc.LoaderManager.geLlBI);
        } else if (i == 2) {
            string = getContext().getString(C35399nuc.LoaderManager.sWlOSi);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            string = getContext().getString(C35399nuc.LoaderManager.sYOsaF);
        }
        Intrinsics.copydefault((java.lang.Object) string);
        this.fARcdN.setText(string);
    }

    public final void EZpvd() {
        android.animation.ObjectAnimator objectAnimatorOfFloat;
        android.animation.ObjectAnimator objectAnimatorOfFloat2;
        if (this.AhwBna != 0) {
            this.isConnected.setVisibility(8);
        } else {
            this.fetchVPNInfo.setVisibility(8);
        }
        if (this.valueOf != 0) {
            this.AkhnZx.setVisibility(8);
        }
        this.copydefault.setVisibility(8);
        this.EZpvd.setVisibility(0);
        this.gEmmrt.setVisibility(0);
        this.EZpvd.setClickable(false);
        this.gEmmrt.setClickable(false);
        float f = (this.OLrzqt / 2.0f) + 64;
        boolean zAEQbTJ = C55296xhK.AEQbTJ(this);
        if (!zAEQbTJ) {
            objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.EZpvd, "translationX", f, 0.0f);
        } else {
            objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.EZpvd, "translationX", -f, 0.0f);
        }
        if (!zAEQbTJ) {
            objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this.gEmmrt, "translationX", -f, 0.0f);
        } else {
            objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this.gEmmrt, "translationX", f, 0.0f);
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new PendingIntent());
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void KWHzl() {
        this.fARcdN.setVisibility(4);
    }
}
