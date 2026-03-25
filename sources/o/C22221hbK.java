package o;

import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hbK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C22221hbK extends android.widget.FrameLayout {
    public final hGK AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22221hbK(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:14) call: o.hbK.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C22221hbK(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22221hbK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hGK hgkOLrzqt = hGK.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(hgkOLrzqt, "");
        this.AEQbTJ = hgkOLrzqt;
        if (C33492mxV.OLrzqt()) {
            setPadding(0, 0, C55298xhM.OLrzqt(24, context), 0);
            hgkOLrzqt.AEQbTJ.setCardBackgroundColor(C25382ivf.KWHzl(C52761wXj.Activity.OBJEWx));
        } else {
            setPadding(0, 0, C55298xhM.OLrzqt(22, context), 0);
            hgkOLrzqt.AEQbTJ.setUseCompatPadding(true);
            hgkOLrzqt.AEQbTJ.setCardElevation(C55298xhM.AEQbTJ(2, context));
            hgkOLrzqt.AEQbTJ.setCardBackgroundColor(C25382ivf.KWHzl(C52761wXj.Activity.dHguZz));
        }
    }

    public final void setOnReactiveAllClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        C55296xhK.singleClick$default(this.AEQbTJ.OLrzqt, onClickListener, 0L, 2, (java.lang.Object) null);
    }

    public final void setOnCancelAllClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        C55296xhK.singleClick$default(this.AEQbTJ.KWHzl, onClickListener, 0L, 2, (java.lang.Object) null);
    }
}
