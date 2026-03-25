package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kmD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29040kmD extends ConstraintLayout {
    public Function1<? super InterfaceC29065kmc, Unit> KWHzl;
    public final hFH copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29040kmD(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCellAction(@NotNull Function1<? super InterfaceC29065kmc, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:14) call: o.kmD.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C29040kmD(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29040kmD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hFH hfhEZpvd = hFH.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(hfhEZpvd, "");
        this.copydefault = hfhEZpvd;
        this.KWHzl = new Function1() { // from class: o.kmB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29040kmD.OLrzqt((InterfaceC29065kmc) obj);
            }
        };
    }

    public static final Unit OLrzqt(InterfaceC29065kmc interfaceC29065kmc) {
        Intrinsics.checkNotNullParameter(interfaceC29065kmc, "");
        return Unit.INSTANCE;
    }

    public final void setData(@NotNull final C29006klW c29006klW) {
        Intrinsics.checkNotNullParameter(c29006klW, "");
        final hFH hfh = this.copydefault;
        hfh.KWHzl.setText(c29006klW.KWHzl());
        java.lang.Integer numDjBIcL = c29006klW.djBIcL();
        if (numDjBIcL != null) {
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(numDjBIcL.intValue());
            java.lang.Integer numEZpvd = c29006klW.EZpvd();
            if (numEZpvd != null) {
                int iIntValue = numEZpvd.intValue();
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(iIntValue);
                }
            }
            this.copydefault.copydefault.setImageDrawable(drawableKWHzl);
        }
        if (c29006klW.AYXKKw().length() > 0) {
            AppCompatImageView appCompatImageView = hfh.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C33054mpH.copydefault(appCompatImageView, c29006klW.AYXKKw(), (Function1<? super java.lang.Boolean, Unit>) new Function1() { // from class: o.kmE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C29040kmD.AEQbTJ(c29006klW, hfh, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        hfh.EZpvd.setText(c29006klW.copydefault());
        if (c29006klW.AEQbTJ() != null) {
            AppCompatImageView appCompatImageView2 = hfh.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            appCompatImageView2.setVisibility(0);
            C25352ivB.setOnDoubleCheckClickListener$default(hfh.getRoot(), 0L, new Function1() { // from class: o.kmI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C29040kmD.AEQbTJ(c29006klW, this, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit AEQbTJ(C29006klW c29006klW, hFH hfh, boolean z) {
        java.lang.Integer numEZpvd = c29006klW.EZpvd();
        if (numEZpvd != null) {
            int iIntValue = numEZpvd.intValue();
            android.graphics.drawable.Drawable drawable = hfh.copydefault.getDrawable();
            if (drawable != null) {
                drawable.setTint(iIntValue);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C29006klW c29006klW, C29040kmD c29040kmD, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c29040kmD.KWHzl.invoke(c29006klW.AEQbTJ());
        return Unit.INSTANCE;
    }
}
