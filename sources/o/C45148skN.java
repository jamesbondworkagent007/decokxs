package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.skN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45148skN extends android.widget.LinearLayout {
    public final C47535trt KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45148skN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45148skN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.skN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C45148skN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45148skN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C47535trt c47535trtAEQbTJ = C47535trt.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c47535trtAEQbTJ, "");
        this.KWHzl = c47535trtAEQbTJ;
    }

    public final ConstraintLayout KWHzl() {
        ConstraintLayout constraintLayout = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        return constraintLayout;
    }

    public final android.widget.ImageView EZpvd() {
        android.widget.ImageView imageView = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final android.widget.TextView AYXKKw() {
        android.widget.TextView textView = this.KWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final C55251xgS OLrzqt() {
        C55251xgS c55251xgS = this.KWHzl.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        return c55251xgS;
    }

    public final android.widget.TextView djBIcL() {
        android.widget.TextView textView = this.KWHzl.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView AEQbTJ() {
        android.widget.TextView textView = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final MaterialTextView gEmmrt() {
        MaterialTextView materialTextView = this.KWHzl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(materialTextView, "");
        return materialTextView;
    }

    public final android.widget.TextView AhwBna() {
        android.widget.TextView textView = this.KWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView valueOf() {
        android.widget.TextView textView = this.KWHzl.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final C52794wYp copydefault() {
        C52794wYp c52794wYp = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        return c52794wYp;
    }

    public final void setTagStatus(java.lang.String str, java.lang.Integer num) {
        OLrzqt().setText(str);
        OLrzqt().setOKDSStyle(num != null ? num.intValue() : 0);
        OLrzqt().setVisibility((str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || num == null) ? 8 : 0);
    }
}
