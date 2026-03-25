package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.itD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25248itD extends LinearLayoutCompat {
    public final InterfaceC56387yDm AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25248itD(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:20) call: o.itD.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C25248itD(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25248itD(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(1);
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.itz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25248itD.EZpvd(context, this);
            }
        });
    }

    private final C21632hGo OLrzqt() {
        return (C21632hGo) this.AEQbTJ.getValue();
    }

    public static final C21632hGo EZpvd(android.content.Context context, C25248itD c25248itD) {
        C21632hGo c21632hGoCopydefault = C21632hGo.copydefault(android.view.LayoutInflater.from(context), c25248itD);
        Intrinsics.checkNotNullExpressionValue(c21632hGoCopydefault, "");
        return c21632hGoCopydefault;
    }

    public final void setCoinInfo(java.lang.String str) {
        AppCompatTextView appCompatTextView = OLrzqt().AhwBna;
        if (str == null) {
            str = "--";
        }
        appCompatTextView.setText(str);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2) {
        java.lang.String showDataWithPrefix$default;
        AppCompatTextView appCompatTextView = OLrzqt().KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C25352ivB.setRiseDownPercentColorAndValue$default(appCompatTextView, str2 == null ? "" : str2, false, 0, 6, null);
        AppCompatTextView appCompatTextView2 = OLrzqt().OLrzqt;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            Intrinsics.copydefault((java.lang.Object) str);
            showDataWithPrefix$default = C23272hvB.getShowDataWithPrefix$default(c23272hvB, str, false, false, RoundingMode.DOWN, false, 20, null);
        } else {
            showDataWithPrefix$default = "--";
        }
        appCompatTextView2.setText(showDataWithPrefix$default);
    }
}
