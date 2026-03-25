package o;

import android.view.ViewGroup;
import com.okinc.localization.util.format.DisplaySign;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.klB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28985klB extends android.widget.LinearLayout {
    public final C21589hEz KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28985klB(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28985klB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.klB.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28985klB(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28985klB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C21589hEz c21589hEzAEQbTJ = C21589hEz.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c21589hEzAEQbTJ, "");
        this.KWHzl = c21589hEzAEQbTJ;
    }

    public final void setContent(@NotNull final C28897kjT c28897kjT, @NotNull java.lang.String str, @NotNull final Function1<? super C28897kjT, Unit> function1) {
        Intrinsics.checkNotNullParameter(c28897kjT, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C21589hEz c21589hEz = this.KWHzl;
        android.widget.TextView textView = c21589hEz.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        kLY.formatPercentage$default(textView, c28897kjT.gEmmrt(), DisplaySign.EXCEPT_ZERO, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 16, null);
        android.widget.FrameLayout frameLayout = c21589hEz.copydefault;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        kLW.copydefault(frameLayout, c28897kjT.djBIcL(), (30 & 2) != 0 ? new C25385ivi(null, null, 0.0f, 0, 15, null) : null, (30 & 4) != 0 ? 20.0f : 0.0f, (30 & 8) != 0 ? 14.0f : 0.0f, (30 & 16) != 0 ? null : null);
        c21589hEz.KWHzl.setText(c28897kjT.AuCTel());
        c21589hEz.getRoot().setContentDescription(str);
        C25352ivB.setOnDoubleCheckClickListener$default(c21589hEz.getRoot(), 0L, new Function1() { // from class: o.klx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28985klB.KWHzl(function1, c28897kjT, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(Function1 function1, C28897kjT c28897kjT, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        function1.invoke(c28897kjT);
        return Unit.INSTANCE;
    }

    public final void setFullWidth() {
        ViewGroup.LayoutParams layoutParams = this.KWHzl.getRoot().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            this.KWHzl.getRoot().setLayoutParams(layoutParams);
        }
    }
}
