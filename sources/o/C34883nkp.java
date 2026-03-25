package o;

import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34883nkp extends android.widget.FrameLayout {
    public final C42675rar AEQbTJ;
    public int EZpvd;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34883nkp(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:17) call: o.nkp.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C34883nkp(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34883nkp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C42675rar c42675rarCopydefault = C42675rar.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c42675rarCopydefault, "");
        this.AEQbTJ = c42675rarCopydefault;
        this.EZpvd = C55298xhM.dp2px$default(2.0f, null, 1, null);
        this.OLrzqt = C55298xhM.dp2px$default(8.0f, null, 1, null);
    }

    public final void setLeftTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.OLrzqt.setText(str);
    }

    public final void setRightTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.AEQbTJ.setText(str);
    }

    public final void setLeftBgStyle(boolean z) {
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.AEQbTJ.EZpvd.getLayoutParams();
            layoutParams.width = this.OLrzqt;
            layoutParams.height = this.EZpvd;
            this.AEQbTJ.EZpvd.setLayoutParams(layoutParams);
        }
    }

    public final void setRightBgStyle(boolean z) {
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.AEQbTJ.copydefault.getLayoutParams();
            layoutParams.width = this.OLrzqt;
            layoutParams.height = this.EZpvd;
            this.AEQbTJ.copydefault.setLayoutParams(layoutParams);
        }
    }

    public final void setLeftBgColor(int i) {
        ViewCompat.setBackgroundTintList(this.AEQbTJ.EZpvd, android.content.res.ColorStateList.valueOf(i));
    }

    public final void setRightBgColor(int i) {
        ViewCompat.setBackgroundTintList(this.AEQbTJ.copydefault, android.content.res.ColorStateList.valueOf(i));
    }
}
