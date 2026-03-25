package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ieC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24453ieC extends AbstractC24459ieI {
    public android.view.animation.Animation AEQbTJ;
    public boolean AYXKKw;
    public Function1<? super java.lang.Boolean, Unit> AhwBna;
    public java.lang.Runnable EZpvd;
    public hBX KWHzl;
    public android.view.View OLrzqt;
    public android.view.animation.Animation copydefault;
    public Function0<Unit> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnExpandStateChangeListener(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AhwBna = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24453ieC(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        isConnected();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24453ieC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        isConnected();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24453ieC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        isConnected();
    }

    private final void isConnected() {
        android.widget.LinearLayout linearLayout;
        hBX hbxKWHzl = hBX.KWHzl(android.view.LayoutInflater.from(getContext()), DbNXlk(), true);
        this.KWHzl = hbxKWHzl;
        if (hbxKWHzl != null && (linearLayout = hbxKWHzl.copydefault) != null) {
            linearLayout.setVisibility(8);
        }
        setupClickListeners();
        AYXKKw();
    }

    public final void AYXKKw() {
        android.view.View viewValues = values();
        if (viewValues != null) {
            ViewGroup.LayoutParams layoutParams = viewValues.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.removeRule(21);
                layoutParams2.addRule(20);
                viewValues.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // o.AbstractC24459ieI
    public android.view.View AEQbTJ() {
        hBX hbx = this.KWHzl;
        if (hbx != null) {
            return hbx.KWHzl;
        }
        return null;
    }

    public final void setupClickListeners() {
        hBX hbx = this.KWHzl;
        if (hbx != null) {
            hbx.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.ieH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.OLrzqt.djBIcL();
                }
            });
        }
    }

    public final void djBIcL() {
        if (this.AYXKKw) {
            copydefault();
        } else {
            KWHzl();
        }
    }

    public final void KWHzl() {
        if (this.AYXKKw) {
            return;
        }
        this.AYXKKw = true;
        AhwBna();
        Function1<? super java.lang.Boolean, Unit> function1 = this.AhwBna;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
        final android.view.View view = this.OLrzqt;
        if (view != null) {
            android.view.animation.Animation animation = this.copydefault;
            if (animation != null) {
                animation.cancel();
            }
            this.copydefault = C25352ivB.expand$default(view, 0L, new Function0() { // from class: o.ieE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C24453ieC.KWHzl(view);
                }
            }, 2, null);
        }
    }

    public static final Unit KWHzl(android.view.View view) {
        view.setVisibility(0);
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        if (this.AYXKKw) {
            this.AYXKKw = false;
            valueOf();
            Function1<? super java.lang.Boolean, Unit> function1 = this.AhwBna;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.FALSE);
            }
            final android.view.View view = this.OLrzqt;
            if (view != null) {
                android.view.animation.Animation animation = this.AEQbTJ;
                if (animation != null) {
                    animation.cancel();
                }
                this.AEQbTJ = C25352ivB.collapse$default(view, 0L, new Function0() { // from class: o.ieG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C24453ieC.EZpvd(view);
                    }
                }, 2, null);
            }
        }
    }

    public static final Unit EZpvd(android.view.View view) {
        view.setVisibility(8);
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        hBX hbx = this.KWHzl;
        if (hbx != null) {
            hbx.OLrzqt.setText((java.lang.CharSequence) null);
            hbx.EZpvd.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
        }
        copydefault(true);
    }

    public final void valueOf() {
        hBX hbx = this.KWHzl;
        if (hbx != null) {
            hbx.OLrzqt.setText(getContext().getString(C57406yhn.ActionBar.copydefault));
            hbx.EZpvd.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
        }
        copydefault(false);
    }

    public final void copydefault(boolean z) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = z ? getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fetchVPNInfo) : 0;
            setLayoutParams(marginLayoutParams);
        }
    }

    public final void setRateInfo(@NotNull java.lang.CharSequence charSequence) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(charSequence, "");
        hBX hbx = this.KWHzl;
        if (hbx == null || (textView = hbx.KWHzl) == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public final void OLrzqt(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        setRateInfo(charSequence);
        hBX hbx = this.KWHzl;
        if (hbx != null) {
            hbx.KWHzl.setClickable(true);
        }
    }

    public final void OLrzqt() {
        android.widget.TextView textView;
        hBX hbx = this.KWHzl;
        if (hbx == null || (textView = hbx.KWHzl) == null) {
            return;
        }
        textView.setClickable(false);
    }

    public final void setRateSwitchListener(@NotNull final Function0<Unit> function0) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(function0, "");
        this.gEmmrt = function0;
        hBX hbx = this.KWHzl;
        if (hbx == null || (textView = hbx.KWHzl) == null) {
            return;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.iez
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                function0.invoke();
            }
        });
    }

    public final void setRateClickable(boolean z) {
        android.widget.TextView textView;
        hBX hbx = this.KWHzl;
        if (hbx == null || (textView = hbx.KWHzl) == null) {
            return;
        }
        textView.setClickable(z);
    }

    @Override // o.AbstractC24459ieI, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.view.animation.Animation animation = this.copydefault;
        if (animation != null) {
            animation.cancel();
        }
        android.view.animation.Animation animation2 = this.AEQbTJ;
        if (animation2 != null) {
            animation2.cancel();
        }
        this.copydefault = null;
        this.AEQbTJ = null;
        java.lang.Runnable runnable = this.EZpvd;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.EZpvd = null;
    }

    @Override // o.AbstractC24459ieI
    public void copydefault(long j) {
        java.lang.Runnable runnable = this.EZpvd;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: o.ieF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C24453ieC.copydefault(this.copydefault);
            }
        };
        this.EZpvd = runnable2;
        postDelayed(runnable2, j);
        super.copydefault(j);
    }

    public static final void copydefault(C24453ieC c24453ieC) {
        android.widget.LinearLayout linearLayout;
        hBX hbx = c24453ieC.KWHzl;
        if (hbx == null || (linearLayout = hbx.copydefault) == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override // o.AbstractC24459ieI
    public void gEmmrt() {
        android.widget.LinearLayout linearLayout;
        java.lang.Runnable runnable = this.EZpvd;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.EZpvd = null;
        hBX hbx = this.KWHzl;
        if (hbx != null && (linearLayout = hbx.copydefault) != null) {
            linearLayout.setVisibility(0);
        }
        super.gEmmrt();
    }
}
