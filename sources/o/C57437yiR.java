package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57437yiR extends ConstraintLayout {
    public final C57387yhU copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57437yiR(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:17) call: o.yiR.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C57437yiR(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57437yiR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C57387yhU c57387yhUCopydefault = C57387yhU.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57387yhUCopydefault, "");
        this.copydefault = c57387yhUCopydefault;
        setPadding(C57410yhr.AEQbTJ(), C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), C57410yhr.KWHzl(), C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public final AppCompatTextView EZpvd() {
        AppCompatTextView appCompatTextView = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        return appCompatTextView;
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.copydefault.setText(str);
    }

    public final void setValue(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.OLrzqt.setText(str);
    }
}
