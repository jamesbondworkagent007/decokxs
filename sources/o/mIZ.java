package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.cruilib.view.listitem.share.OKCRTrend;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mIZ extends ConstraintLayout {
    public final AbstractC31866mGv EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mIZ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mIZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.LoaderManager.iRxXKY int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:11) call: o.mIZ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ mIZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.LoaderManager.iRxXKY : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mIZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC31866mGv abstractC31866mGvCopydefault = AbstractC31866mGv.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC31866mGvCopydefault, "");
        this.EZpvd = abstractC31866mGvCopydefault;
        ConstraintLayout constraintLayout = abstractC31866mGvCopydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        C31899mIa.applyTouchFeedback$default((android.view.View) constraintLayout, abstractC31866mGvCopydefault.copydefault, false, 0, 6, (java.lang.Object) null);
    }

    public final void setTokenIcon(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.ImageView imageView = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.loadUrl$default(imageView, str, null, 0, 0, 14, null);
    }

    public final void setTokenName(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.AEQbTJ.setText(str);
    }

    public final void setTokenPriceChange(@NotNull java.lang.String str, @NotNull OKCRTrend oKCRTrend) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKCRTrend, "");
        copydefault(str);
        EZpvd(oKCRTrend);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.EZpvd.setText(str);
    }

    public final void EZpvd(@NotNull OKCRTrend oKCRTrend) {
        Intrinsics.checkNotNullParameter(oKCRTrend, "");
        android.widget.TextView textView = this.EZpvd.EZpvd;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setTextColor(C31932mJg.EZpvd(oKCRTrend, context));
    }

    public final <T> void setupClick(final T t, @NotNull final Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.mIY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                function1.invoke(t);
            }
        });
    }
}
