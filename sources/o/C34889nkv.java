package o;

import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34889nkv extends android.widget.FrameLayout {
    public final C42679rav OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34889nkv(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:15) call: o.nkv.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C34889nkv(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34889nkv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C42679rav c42679ravOLrzqt = C42679rav.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c42679ravOLrzqt, "");
        this.OLrzqt = c42679ravOLrzqt;
    }

    public final void setFirstTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.valueOf.setText(str);
    }

    public final void setSecondTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.AYXKKw.setText(str);
    }

    public final void setThirdTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.DbNXlk.setText(str);
    }

    public final void setFirstBgColor(int i) {
        ViewCompat.setBackgroundTintList(this.OLrzqt.AEQbTJ, android.content.res.ColorStateList.valueOf(i));
    }

    public final void setSecondBgColor(int i) {
        ViewCompat.setBackgroundTintList(this.OLrzqt.OLrzqt, android.content.res.ColorStateList.valueOf(i));
    }

    public final void setThirdBgColor(int i) {
        ViewCompat.setBackgroundTintList(this.OLrzqt.EZpvd, android.content.res.ColorStateList.valueOf(i));
    }
}
