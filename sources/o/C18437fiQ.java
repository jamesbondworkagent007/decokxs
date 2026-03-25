package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fiQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18437fiQ extends ConstraintLayout {
    public final AbstractC17047evS KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18437fiQ(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:13) call: o.fiQ.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C18437fiQ(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18437fiQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC17047evS abstractC17047evS = (AbstractC17047evS) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C13754dXa.TaskDescription.IYdWPz, this, true);
        this.KWHzl = abstractC17047evS;
        android.widget.ImageView imageView = abstractC17047evS.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        this.copydefault = imageView;
        android.widget.TextView textView = abstractC17047evS.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        this.OLrzqt = textView;
    }
}
