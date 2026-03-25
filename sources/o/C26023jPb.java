package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jPb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26023jPb extends android.widget.LinearLayout {
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26023jPb(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26023jPb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.jPb.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C26023jPb(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26023jPb(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.jOZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26023jPb.copydefault(context, this);
            }
        });
    }

    private final C23402hxZ OLrzqt() {
        return (C23402hxZ) this.OLrzqt.getValue();
    }

    public static final C23402hxZ copydefault(android.content.Context context, C26023jPb c26023jPb) {
        return C23402hxZ.OLrzqt(android.view.LayoutInflater.from(context), c26023jPb, true);
    }

    public final void setData(@NotNull C26022jPa c26022jPa) {
        Intrinsics.checkNotNullParameter(c26022jPa, "");
        C23402hxZ c23402hxZOLrzqt = OLrzqt();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c26022jPa.copydefault())) {
            android.widget.ImageView imageView = c23402hxZOLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C33054mpH.AEQbTJ(imageView, c26022jPa.copydefault());
        } else {
            c23402hxZOLrzqt.copydefault.setImageResource(c26022jPa.KWHzl());
        }
        c23402hxZOLrzqt.AEQbTJ.setText(c26022jPa.EZpvd());
        android.widget.TextView textView = c23402hxZOLrzqt.AEQbTJ;
        java.lang.Integer numAEQbTJ = c26022jPa.AEQbTJ();
        textView.setTextColor(numAEQbTJ != null ? numAEQbTJ.intValue() : c26022jPa.gEmmrt());
        android.widget.ImageView imageView2 = c23402hxZOLrzqt.copydefault;
        java.lang.Integer numOLrzqt = c26022jPa.OLrzqt();
        imageView2.setColorFilter(numOLrzqt != null ? numOLrzqt.intValue() : c26022jPa.gEmmrt());
    }
}
