package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hXe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C22081hXe extends ConstraintLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22081hXe(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22081hXe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.hXe.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C22081hXe(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22081hXe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hXh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22081hXe.KWHzl(this.KWHzl);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hXf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22081hXe.AEQbTJ(this.KWHzl);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.HJWChPzRXNTw, (android.view.ViewGroup) this, true);
    }

    private final AppCompatTextView KWHzl() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView KWHzl(C22081hXe c22081hXe) {
        return (AppCompatTextView) c22081hXe.findViewById(C23274hvD.Application.onNothingSelected);
    }

    public static final C55258xgZ AEQbTJ(C22081hXe c22081hXe) {
        return (C55258xgZ) c22081hXe.findViewById(C23274hvD.Application.jumpToCurrentState);
    }

    private final C55258xgZ copydefault() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C55258xgZ) value;
    }

    public final void setServiceFeeInfo(@NotNull java.lang.String str, boolean z) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(str, "");
        C55258xgZ c55258xgZCopydefault = copydefault();
        if (!z) {
            string = getContext().getString(C23274hvD.Fragment.sendVolumeInfoChanged);
        } else {
            string = getContext().getString(C23274hvD.Fragment.onViewAttachedToWindow);
        }
        c55258xgZCopydefault.setTextValue(string);
        KWHzl().setText(str);
    }
}
