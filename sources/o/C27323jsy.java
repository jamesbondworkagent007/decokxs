package o;

import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27323jsy extends android.widget.LinearLayout {
    public final C23909iNv EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27323jsy(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27323jsy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.jsy.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27323jsy(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27323jsy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C23909iNv c23909iNvCopydefault = C23909iNv.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c23909iNvCopydefault, "");
        this.EZpvd = c23909iNvCopydefault;
        setOrientation(1);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.KWHzl.setText(str);
    }

    public final void setCryptoItems(@NotNull java.util.List<C27021jnN> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.copydefault.removeAllViews();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            this.EZpvd.copydefault.addView(KWHzl((C27021jnN) obj));
            if (i < list.size() - 1) {
                android.view.View view = new android.view.View(getContext());
                android.content.Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                view.setLayoutParams(new LinearLayout.LayoutParams(-1, C55298xhM.copydefault(6.0f, context)));
                this.EZpvd.copydefault.addView(view);
            }
            i++;
        }
    }

    public final C27324jsz KWHzl(C27021jnN c27021jnN) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C27324jsz c27324jsz = new C27324jsz(context, null, 0, 6, null);
        c27324jsz.setCryptoItem(c27021jnN);
        return c27324jsz;
    }
}
