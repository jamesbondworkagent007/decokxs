package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qzT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41895qzT extends ConstraintLayout {
    public final C42681rax copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41895qzT(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41895qzT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.qzT.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C41895qzT(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41895qzT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42681rax c42681raxKWHzl = C42681rax.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c42681raxKWHzl, "");
        this.copydefault = c42681raxKWHzl;
    }

    public final void setData(@NotNull final BizInstrument bizInstrument, boolean z, @NotNull final Function1<? super BizInstrument, Unit> function1) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AppCompatTextView appCompatTextView = this.copydefault.OLrzqt;
        java.lang.String displayId = bizInstrument.getDisplayId();
        if (displayId.length() == 0) {
            displayId = bizInstrument.getInstId();
        }
        appCompatTextView.setText(displayId);
        AppCompatImageView appCompatImageView = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C33054mpH.AEQbTJ(appCompatImageView, C55687xoe.AEQbTJ.OLrzqt(bizInstrument.getTradeSymbol()));
        this.copydefault.AEQbTJ.setVisibility(z ? 0 : 8);
        this.copydefault.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.qzW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                function1.invoke(bizInstrument);
            }
        });
    }
}
