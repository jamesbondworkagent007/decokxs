package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tDz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45996tDz extends android.widget.FrameLayout {
    public final AbstractC46304tPj KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45996tDz(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45996tDz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.tDz.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C45996tDz(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45996tDz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C47501trL.Application.aJFbMH, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.KWHzl = (AbstractC46304tPj) viewDataBindingInflate;
    }

    public final void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.KWHzl.OLrzqt.setText(str);
        this.KWHzl.OLrzqt.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) str) ? 0 : 8);
        this.KWHzl.copydefault.setText(str2);
        this.KWHzl.KWHzl.setText(str3);
        if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "buy")) {
            this.KWHzl.KWHzl.setOKDSStyle(14);
        } else {
            this.KWHzl.KWHzl.setOKDSStyle(13);
        }
        this.KWHzl.AEQbTJ.setTagType(12);
        C55251xgS.setBorder$default(this.KWHzl.AEQbTJ, C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG), 0, 2, null);
        this.KWHzl.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        this.KWHzl.AEQbTJ.setText(str4);
        this.KWHzl.AEQbTJ.setVisibility(z ? 0 : 8);
    }

    public final int EZpvd() {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return getMeasuredWidth();
    }
}
