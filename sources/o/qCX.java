package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48917uei;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class qCX extends android.widget.LinearLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final C42860reQ EZpvd;
    public Function1<? super java.lang.Boolean, Unit> KWHzl;
    public boolean OLrzqt;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qCX(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClearClickCallback(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnExpandCallback(Function1<? super java.lang.Boolean, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:16) call: o.qCX.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ qCX(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qCX(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C42860reQ c42860reQEZpvd = C42860reQ.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42860reQEZpvd, "");
        this.EZpvd = c42860reQEZpvd;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qDe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qCX.KWHzl(context, this);
            }
        });
        android.view.ViewParent parent = c42860reQEZpvd.EZpvd.getParent();
        Intrinsics.copydefault(parent, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        viewGroup.removeView(c42860reQEZpvd.EZpvd);
        viewGroup.addView(AEQbTJ(), c42860reQEZpvd.EZpvd.getLayoutParams());
        c42860reQEZpvd.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.qDd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                qCX.AEQbTJ(this.copydefault, view);
            }
        });
    }

    private final C39930qDa AEQbTJ() {
        return (C39930qDa) this.AEQbTJ.getValue();
    }

    public static final C39930qDa KWHzl(android.content.Context context, qCX qcx) {
        C39930qDa c39930qDa = new C39930qDa(context);
        c39930qDa.setId(qcx.EZpvd.EZpvd.getId());
        return c39930qDa;
    }

    public static final void AEQbTJ(qCX qcx, android.view.View view) {
        Function0<Unit> function0 = qcx.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        qcx.EZpvd.OLrzqt.setVisibility(8);
        C39930qDa c39930qDaAEQbTJ = qcx.AEQbTJ();
        c39930qDaAEQbTJ.removeAllViews();
        c39930qDaAEQbTJ.setVisibility(8);
    }

    public final <T extends C48917uei.Application> void setHistoryRecordList(@NotNull java.util.List<? extends T> list, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd.OLrzqt.setVisibility(0);
        AEQbTJ().setVisibility(0);
        AEQbTJ().setHistoryData$OKMarket_market_impl(list, this.OLrzqt, function1, new Function1() { // from class: o.qDf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qCX.KWHzl(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit KWHzl(qCX qcx, boolean z) {
        qcx.OLrzqt = z;
        Function1<? super java.lang.Boolean, Unit> function1 = qcx.KWHzl;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }

    public final void setTitle(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.EZpvd.copydefault.setText(charSequence);
    }
}
