package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC34425nbo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.naU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34352naU extends ConstraintLayout {
    public Function1<? super InterfaceC34425nbo, Unit> EZpvd;
    public final C36086oOt KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34352naU(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCellAction(@NotNull Function1<? super InterfaceC34425nbo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:17) call: o.naU.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C34352naU(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34352naU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C36086oOt c36086oOtEZpvd = C36086oOt.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c36086oOtEZpvd, "");
        this.KWHzl = c36086oOtEZpvd;
        this.EZpvd = new Function1() { // from class: o.naY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34352naU.KWHzl((InterfaceC34425nbo) obj);
            }
        };
    }

    public static final Unit KWHzl(InterfaceC34425nbo interfaceC34425nbo) {
        Intrinsics.checkNotNullParameter(interfaceC34425nbo, "");
        return Unit.INSTANCE;
    }

    public final void setData(@NotNull final C34423nbm c34423nbm) {
        Intrinsics.checkNotNullParameter(c34423nbm, "");
        C36086oOt c36086oOt = this.KWHzl;
        boolean z = c34423nbm.AYXKKw() != null;
        C55258xgZ c55258xgZ = c36086oOt.AYXKKw;
        if (z) {
            c55258xgZ.setHelperLabelType(1);
            C55258xgZ c55258xgZ2 = c36086oOt.AYXKKw;
            c55258xgZ2.setOnClickListener(new StateListAnimator(c55258xgZ2, 1000L, c34423nbm, this));
        } else {
            c55258xgZ.setHelperLabelType(2);
        }
        c55258xgZ.setTextValue(c34423nbm.copydefault());
        AppCompatImageView appCompatImageView = c36086oOt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(c34423nbm.AhwBna() != null ? 0 : 8);
        java.lang.Integer numAhwBna = c34423nbm.AhwBna();
        if (numAhwBna != null) {
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(numAhwBna.intValue());
            java.lang.Integer numAEQbTJ = c34423nbm.AEQbTJ();
            if (numAEQbTJ != null) {
                numAEQbTJ.intValue();
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(c34423nbm.AEQbTJ().intValue());
                }
            }
            this.KWHzl.KWHzl.setImageDrawable(drawableKWHzl);
        }
        c36086oOt.gEmmrt.setText(c34423nbm.OLrzqt());
        AppCompatImageView appCompatImageView2 = c36086oOt.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        appCompatImageView2.setVisibility(c34423nbm.djBIcL() != null ? 0 : 8);
        java.lang.Integer numDjBIcL = c34423nbm.djBIcL();
        if (numDjBIcL != null) {
            this.KWHzl.copydefault.setImageDrawable(ContextCompat.getDrawable(this.KWHzl.getRoot().getContext(), numDjBIcL.intValue()));
        }
        InterfaceC34425nbo interfaceC34425nboEZpvd = c34423nbm.EZpvd();
        if (interfaceC34425nboEZpvd instanceof InterfaceC34425nbo.TaskDescription) {
            mUO.setOnDoubleCheckClickListener$default(c36086oOt.copydefault, 0L, new Function1() { // from class: o.naZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34352naU.KWHzl(c34423nbm, this, (android.view.View) obj);
                }
            }, 1, null);
            return;
        }
        if (interfaceC34425nboEZpvd instanceof InterfaceC34425nbo.StateListAnimator) {
            AppCompatImageView appCompatImageView3 = c36086oOt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
            appCompatImageView3.setVisibility(0);
            mUO.setOnDoubleCheckClickListener$default(c36086oOt.getRoot(), 0L, new Function1() { // from class: o.nba
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34352naU.AEQbTJ(c34423nbm, this, (android.view.View) obj);
                }
            }, 1, null);
            if (c34423nbm.AYXKKw() == null) {
                mUO.setOnDoubleCheckClickListener$default(c36086oOt.AYXKKw, 0L, new Function1() { // from class: o.naX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C34352naU.valueOf(c34423nbm, this, (android.view.View) obj);
                    }
                }, 1, null);
            }
        }
    }

    public static final Unit KWHzl(C34423nbm c34423nbm, C34352naU c34352naU, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c34352naU.EZpvd.invoke(c34423nbm.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C34423nbm c34423nbm, C34352naU c34352naU, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c34352naU.EZpvd.invoke(c34423nbm.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C34423nbm c34423nbm, C34352naU c34352naU, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c34352naU.EZpvd.invoke(c34423nbm.EZpvd());
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.gEmmrt.setText(str);
    }

    /* JADX INFO: renamed from: o.naU$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C34423nbm KWHzl;
        public final /* synthetic */ C34352naU OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C34423nbm c34423nbm, C34352naU c34352naU) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c34423nbm;
            this.OLrzqt = c34352naU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                InterfaceC34425nbo interfaceC34425nboAYXKKw = this.KWHzl.AYXKKw();
                if (interfaceC34425nboAYXKKw != null) {
                    this.OLrzqt.EZpvd.invoke(interfaceC34425nboAYXKKw);
                }
            }
        }
    }
}
