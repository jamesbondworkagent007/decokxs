package o;

import androidx.core.content.ContextCompat;
import com.okinc.business.invest_biz.data.contants.HealthRateLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jpN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27127jpN extends android.widget.FrameLayout {
    public final iLG OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27127jpN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27127jpN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:16) call: o.jpN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27127jpN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27127jpN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        iLG ilgAEQbTJ = iLG.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(ilgAEQbTJ, "");
        this.OLrzqt = ilgAEQbTJ;
    }

    public static /* synthetic */ void setHealthRate$default(C27127jpN c27127jpN, HealthRateLevel healthRateLevel, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        c27127jpN.setHealthRate(healthRateLevel, str);
    }

    public final void setHealthRate(@NotNull HealthRateLevel healthRateLevel, java.lang.String str) {
        Intrinsics.checkNotNullParameter(healthRateLevel, "");
        C27536jwz c27536jwz = C27536jwz.OLrzqt;
        int color = ContextCompat.getColor(getContext(), c27536jwz.KWHzl(healthRateLevel));
        this.OLrzqt.EZpvd.setBackgroundTintList(android.content.res.ColorStateList.valueOf(c27536jwz.EZpvd(color, 10)));
        android.widget.ImageView imageView = this.OLrzqt.OLrzqt;
        imageView.setImageDrawable(ContextCompat.getDrawable(imageView.getContext(), C27487jwC.KWHzl.OLrzqt(healthRateLevel)));
        imageView.setImageTintList(android.content.res.ColorStateList.valueOf(color));
        android.widget.TextView textView = this.OLrzqt.copydefault;
        C27488jwD c27488jwD = C27488jwD.copydefault;
        if (str == null) {
            str = "--";
        }
        textView.setText(c27488jwD.KWHzl(str));
        textView.setTextColor(color);
    }
}
