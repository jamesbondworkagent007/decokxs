package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yim, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57458yim extends ConstraintLayout {
    public final C57369yhC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57458yim(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57458yim(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.yim.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57458yim(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57458yim(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57369yhC c57369yhCKWHzl = C57369yhC.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57369yhCKWHzl, "");
        this.copydefault = c57369yhCKWHzl;
        setPadding(C57410yhr.AEQbTJ(), 0, C57410yhr.KWHzl(), 0);
    }

    public final void setIcon(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault.EZpvd.setText(str);
        android.widget.ImageView imageView = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C57659ymb.copydefault(imageView, str2, i, 0.0f, 24.0f);
    }

    public final void setAmount(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.AEQbTJ.setText(str);
    }
}
