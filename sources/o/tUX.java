package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tUX extends ConstraintLayout {
    public android.view.ViewGroup AEQbTJ;
    public android.widget.TextView AYXKKw;
    public tUZ AhwBna;
    public int EZpvd;
    public final long KWHzl;
    public Function1<? super java.lang.Integer, Unit> OLrzqt;
    public boolean copydefault;
    public android.widget.TextView djBIcL;
    public android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUX(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnVoteListener(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.tUX.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tUX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tUX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = 300L;
        android.view.View.inflate(context, C47501trL.Application.QDqgQU, this);
        valueOf();
        OLrzqt();
    }

    private final void valueOf() {
        this.AEQbTJ = (android.view.ViewGroup) findViewById(C47501trL.TaskDescription.DCUTEIdCUTEI);
        this.AYXKKw = (android.widget.TextView) findViewById(C47501trL.TaskDescription.RTWSvT);
        this.djBIcL = (android.widget.TextView) findViewById(C47501trL.TaskDescription.DDDCac);
        this.gEmmrt = (android.widget.TextView) findViewById(C47501trL.TaskDescription.ROgMPW);
        this.AhwBna = (tUZ) findViewById(C47501trL.TaskDescription.compare);
    }

    private final void OLrzqt() {
        tUZ tuz = this.AhwBna;
        if (tuz == null) {
            Intrinsics.gEmmrt("");
            tuz = null;
        }
        tuz.setOnVoteListener(new Function1() { // from class: o.tUV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tUX.AEQbTJ(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit AEQbTJ(tUX tux, int i) {
        Function1<? super java.lang.Integer, Unit> function1 = tux.OLrzqt;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
        tux.copydefault(i);
        return Unit.INSTANCE;
    }

    public final void setVoteData(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i2, int i3) {
        tUZ tuz;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        android.widget.TextView textView = this.AYXKKw;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(str);
        this.EZpvd = i2 + i3;
        this.copydefault = i != 0;
        AEQbTJ();
        EZpvd();
        tUZ tuz2 = this.AhwBna;
        if (tuz2 == null) {
            Intrinsics.gEmmrt("");
            tuz = null;
        } else {
            tuz = tuz2;
        }
        tuz.setVoteData(i, str2, str3, i2, i3);
    }

    public final void AEQbTJ() {
        int i = this.EZpvd;
        java.lang.String iCUCompact$default = pTB.formatICUCompact$default(java.lang.Integer.valueOf(i), RoundingMode.HALF_UP, C38307pTy.Companion.AEQbTJ(2), null, null, 12, null);
        android.widget.TextView textView = this.gEmmrt;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        android.content.res.Resources resources = C43246rlf.OLrzqt.valueOf().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        textView.setText(pTD.copydefault(resources, C47501trL.LoaderManager.OLrzqt, this.EZpvd, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", iCUCompact$default))));
    }

    public final void copydefault(int i) {
        if (i != 0) {
            this.copydefault = true;
            this.EZpvd++;
            AEQbTJ();
            copydefault();
        }
    }

    public final void copydefault() {
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        transitionSet.addTransition(new android.transition.Fade(2));
        transitionSet.addTransition(new android.transition.ChangeBounds());
        transitionSet.addTransition(new android.transition.Fade(1));
        transitionSet.setDuration(this.KWHzl);
        android.view.ViewGroup viewGroup = this.AEQbTJ;
        if (viewGroup == null) {
            Intrinsics.gEmmrt("");
            viewGroup = null;
        }
        android.transition.TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
        EZpvd();
    }

    public final void EZpvd() {
        android.widget.TextView textView = this.AYXKKw;
        android.widget.TextView textView2 = null;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setVisibility(this.copydefault ^ true ? 0 : 8);
        android.widget.TextView textView3 = this.djBIcL;
        if (textView3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            textView2 = textView3;
        }
        textView2.setVisibility(this.copydefault ? 0 : 8);
    }

    public final void KWHzl() {
        tUZ tuz = this.AhwBna;
        android.view.ViewGroup viewGroup = null;
        if (tuz == null) {
            Intrinsics.gEmmrt("");
            tuz = null;
        }
        tuz.OLrzqt();
        this.copydefault = false;
        android.view.ViewGroup viewGroup2 = this.AEQbTJ;
        if (viewGroup2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            viewGroup = viewGroup2;
        }
        android.transition.TransitionManager.endTransitions(viewGroup);
        EZpvd();
        int i = this.EZpvd;
        this.EZpvd = C56548yJl.EZpvd(i, 0, i - 1);
        AEQbTJ();
    }
}
