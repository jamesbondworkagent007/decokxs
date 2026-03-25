package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.kline.data.KLineTechPic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39845pzy extends ConstraintLayout {
    public AbstractC36119oPz EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39845pzy(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39845pzy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.pzy.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C39845pzy(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39845pzy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = (AbstractC36119oPz) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C35964oKf.Application.gdmIOq, this, true);
    }

    public final void setContent(@NotNull KLineTechPic kLineTechPic, int i) {
        Intrinsics.checkNotNullParameter(kLineTechPic, "");
        AbstractC36119oPz abstractC36119oPz = this.EZpvd;
        if (abstractC36119oPz != null) {
            android.widget.ImageView imageView = abstractC36119oPz.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            pEU peu = pEU.copydefault;
            C57659ymb.EZpvd(imageView, peu.OLrzqt(kLineTechPic, i), C35964oKf.Activity.zuBGHE);
            abstractC36119oPz.OLrzqt.setText(peu.KWHzl(i));
        }
    }
}
