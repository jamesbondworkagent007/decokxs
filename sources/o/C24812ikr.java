package o;

import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ikr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24812ikr extends android.widget.LinearLayout {
    public final java.util.List<java.lang.String> AEQbTJ;
    public Function2<? super java.lang.String, ? super java.lang.Integer, Unit> EZpvd;
    public hFQ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceCallback(@NotNull Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24812ikr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = yDY.copydefault("0.25", SlippageConfigVo.MAX_SLIP, "0.75", "1");
        AEQbTJ();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24812ikr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24812ikr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24812ikr(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void AEQbTJ() {
        hFQ hfqEZpvd = hFQ.EZpvd(android.view.LayoutInflater.from(getContext()), this, true);
        this.OLrzqt = hfqEZpvd;
        if (hfqEZpvd != null) {
            hfqEZpvd.AEQbTJ.setText(C23311hvo.formatPercent$default(this.AEQbTJ.get(0), false, 0, 0, null, null, 31, null));
            hfqEZpvd.copydefault.setText(C23311hvo.formatPercent$default(this.AEQbTJ.get(1), false, 0, 0, null, null, 31, null));
            hfqEZpvd.OLrzqt.setText(C23311hvo.formatPercent$default(this.AEQbTJ.get(2), false, 0, 0, null, null, 31, null));
            hfqEZpvd.EZpvd.setText(C23311hvo.formatPercent$default(this.AEQbTJ.get(3), false, 0, 0, null, null, 31, null));
            C25352ivB.setOnDoubleCheckClickListener$default(hfqEZpvd.AEQbTJ, 0L, new Function1() { // from class: o.iko
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24812ikr.KWHzl(this.AEQbTJ, (android.view.View) obj);
                }
            }, 1, null);
            C25352ivB.setOnDoubleCheckClickListener$default(hfqEZpvd.copydefault, 0L, new Function1() { // from class: o.ikv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24812ikr.valueOf(this.OLrzqt, (android.view.View) obj);
                }
            }, 1, null);
            C25352ivB.setOnDoubleCheckClickListener$default(hfqEZpvd.OLrzqt, 0L, new Function1() { // from class: o.ikw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24812ikr.AhwBna(this.AEQbTJ, (android.view.View) obj);
                }
            }, 1, null);
            C25352ivB.setOnDoubleCheckClickListener$default(hfqEZpvd.EZpvd, 0L, new Function1() { // from class: o.iks
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24812ikr.AYXKKw(this.AEQbTJ, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit KWHzl(C24812ikr c24812ikr, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2 = c24812ikr.EZpvd;
        if (function2 != null) {
            function2.invoke(c24812ikr.AEQbTJ.get(0), 0);
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C24812ikr c24812ikr, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2 = c24812ikr.EZpvd;
        if (function2 != null) {
            function2.invoke(c24812ikr.AEQbTJ.get(1), 1);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C24812ikr c24812ikr, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2 = c24812ikr.EZpvd;
        if (function2 != null) {
            function2.invoke(c24812ikr.AEQbTJ.get(2), 2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C24812ikr c24812ikr, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2 = c24812ikr.EZpvd;
        if (function2 != null) {
            function2.invoke(c24812ikr.AEQbTJ.get(3), 3);
        }
        return Unit.INSTANCE;
    }
}
