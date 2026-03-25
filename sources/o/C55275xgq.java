package o;

import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55275xgq extends AppCompatTextView {
    public android.graphics.drawable.Drawable copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55275xgq(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectedDrawable(android.graphics.drawable.Drawable drawable) {
        this.copydefault = drawable;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:20) call: o.xgq.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C55275xgq(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55275xgq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        setTextColor(ContextCompat.getColorStateList(context, C52761wXj.Activity.QSAYLr));
        setCompoundDrawablePadding(C55298xhM.OLrzqt(12, context));
        int iOLrzqt = C55298xhM.OLrzqt(16, context);
        int iOLrzqt2 = C55298xhM.OLrzqt(12, context);
        setPaddingRelative(iOLrzqt, iOLrzqt2, iOLrzqt, iOLrzqt2);
        setMaxLines(3);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        C55051xce c55051xce = C55051xce.OLrzqt;
        setTypeface(z ? c55051xce.OLrzqt() : c55051xce.valueOf());
        setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, z ? this.copydefault : null, (android.graphics.drawable.Drawable) null);
    }
}
