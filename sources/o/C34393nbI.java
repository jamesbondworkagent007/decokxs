package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nbI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34393nbI extends ConstraintLayout {
    public final C36089oOw AEQbTJ;
    public Function1<? super InterfaceC34425nbo, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34393nbI(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCellAction(@NotNull Function1<? super InterfaceC34425nbo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:14) call: o.nbI.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C34393nbI(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34393nbI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C36089oOw c36089oOwOLrzqt = C36089oOw.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c36089oOwOLrzqt, "");
        this.AEQbTJ = c36089oOwOLrzqt;
        this.OLrzqt = new Function1() { // from class: o.nbK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34393nbI.KWHzl((InterfaceC34425nbo) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(InterfaceC34425nbo interfaceC34425nbo) {
        Intrinsics.checkNotNullParameter(interfaceC34425nbo, "");
        return Unit.INSTANCE;
    }

    public final void setData(@NotNull final C34423nbm c34423nbm) {
        Intrinsics.checkNotNullParameter(c34423nbm, "");
        final C36089oOw c36089oOw = this.AEQbTJ;
        c36089oOw.copydefault.setText(c34423nbm.copydefault());
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
            this.AEQbTJ.OLrzqt.setImageDrawable(drawableKWHzl);
        }
        if (c34423nbm.gEmmrt().length() > 0) {
            AppCompatImageView appCompatImageView = c36089oOw.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C33054mpH.copydefault(appCompatImageView, c34423nbm.gEmmrt(), (Function1<? super java.lang.Boolean, Unit>) new Function1() { // from class: o.nbM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34393nbI.KWHzl(c34423nbm, c36089oOw, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        c36089oOw.EZpvd.setText(c34423nbm.OLrzqt());
        if (c34423nbm.EZpvd() != null) {
            AppCompatImageView appCompatImageView2 = c36089oOw.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            appCompatImageView2.setVisibility(0);
            mUO.setOnDoubleCheckClickListener$default(c36089oOw.getRoot(), 0L, new Function1() { // from class: o.nbN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34393nbI.AEQbTJ(c34423nbm, this, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit KWHzl(C34423nbm c34423nbm, C36089oOw c36089oOw, boolean z) {
        java.lang.Integer numAEQbTJ = c34423nbm.AEQbTJ();
        if (numAEQbTJ != null) {
            numAEQbTJ.intValue();
            android.graphics.drawable.Drawable drawable = c36089oOw.OLrzqt.getDrawable();
            if (drawable != null) {
                drawable.setTint(c34423nbm.AEQbTJ().intValue());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C34423nbm c34423nbm, C34393nbI c34393nbI, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c34393nbI.OLrzqt.invoke(c34423nbm.EZpvd());
        return Unit.INSTANCE;
    }
}
