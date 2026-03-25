package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wda, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53018wda extends android.widget.FrameLayout {
    public int EZpvd;
    public int OLrzqt;
    public final C48494uTm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53018wda(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:18) call: o.wda.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C53018wda(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53018wda(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C48494uTm c48494uTmEZpvd = C48494uTm.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c48494uTmEZpvd, "");
        this.copydefault = c48494uTmEZpvd;
        this.EZpvd = C55298xhM.dp2px$default(2.0f, null, 1, null);
        this.OLrzqt = C55298xhM.dp2px$default(8.0f, null, 1, null);
    }

    public final void setLeftTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.EZpvd.setText(str);
    }

    public final void setRightTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.AEQbTJ.setText(str);
    }

    public final void setLeftBgStyle(boolean z) {
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.copydefault.KWHzl.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = this.OLrzqt;
            layoutParams2.height = this.EZpvd;
            this.copydefault.KWHzl.setLayoutParams(layoutParams2);
        }
    }

    public final void setRightBgStyle(boolean z) {
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.copydefault.copydefault.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = this.OLrzqt;
            layoutParams2.height = this.EZpvd;
            this.copydefault.copydefault.setLayoutParams(layoutParams2);
        }
    }

    public final void setLeftBgColor(int i) {
        ViewCompat.setBackgroundTintList(this.copydefault.KWHzl, android.content.res.ColorStateList.valueOf(i));
    }

    public final void setRightBgColor(int i) {
        ViewCompat.setBackgroundTintList(this.copydefault.copydefault, android.content.res.ColorStateList.valueOf(i));
    }
}
