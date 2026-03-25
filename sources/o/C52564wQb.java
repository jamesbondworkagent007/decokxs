package o;

import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wQb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52564wQb extends android.widget.LinearLayout {
    public AbstractC50863vcF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52564wQb(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52564wQb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.wQb.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52564wQb(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52564wQb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC50863vcF abstractC50863vcF = (AbstractC50863vcF) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.ORrpqH, this, true);
        this.copydefault = abstractC50863vcF;
        if (abstractC50863vcF != null && (imageView2 = abstractC50863vcF.KWHzl) != null) {
            imageView2.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.fHqPtx));
        }
        AbstractC50863vcF abstractC50863vcF2 = this.copydefault;
        if (abstractC50863vcF2 == null || (imageView = abstractC50863vcF2.KWHzl) == null) {
            return;
        }
        imageView.setImageTintList(ContextCompat.getColorStateList(context, C52761wXj.Activity.DeEinT));
    }

    public final android.widget.ImageView copydefault() {
        AbstractC50863vcF abstractC50863vcF = this.copydefault;
        if (abstractC50863vcF != null) {
            return abstractC50863vcF.KWHzl;
        }
        return null;
    }

    public final C55173xeu EZpvd() {
        AbstractC50863vcF abstractC50863vcF = this.copydefault;
        if (abstractC50863vcF != null) {
            return abstractC50863vcF.copydefault;
        }
        return null;
    }
}
