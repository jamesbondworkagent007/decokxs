package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hWr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22067hWr extends ConstraintLayout {
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22067hWr(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22067hWr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.hWr.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C22067hWr(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22067hWr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hWt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22067hWr.KWHzl(this.KWHzl);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hWs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22067hWr.AEQbTJ(this.EZpvd);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.RihMUf, (android.view.ViewGroup) this, true);
    }

    private final AppCompatTextView EZpvd() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView KWHzl(C22067hWr c22067hWr) {
        return (AppCompatTextView) c22067hWr.findViewById(C23274hvD.Application.parseTransition);
    }

    private final C52794wYp AEQbTJ() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C52794wYp) value;
    }

    public static final C52794wYp AEQbTJ(C22067hWr c22067hWr) {
        return (C52794wYp) c22067hWr.findViewById(C23274hvD.Application.sendQueueTitle);
    }

    public final void EZpvd(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.hWv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C22067hWr.OLrzqt(function0, view);
            }
        });
    }

    public static final void OLrzqt(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public final void setTimeOutInfo() {
        AEQbTJ().setVisibility(0);
        EZpvd().setText(C33070mpX.AYXKKw(C23274hvD.Fragment.getIconBitmap));
    }

    public final void setBalanceUpdateInfo() {
        AEQbTJ().setVisibility(8);
        EZpvd().setText(C33070mpX.AYXKKw(C23274hvD.Fragment.setMediaId));
    }
}
