package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.unify_trade.biz.FundingFeeApyItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wdl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC53029wdl extends ConstraintLayout {
    public abstract void AEQbTJ(java.util.List<FundingFeeApyItem> list, boolean z, boolean z2);

    public abstract void setFirstApyViewExplainClickListener(@NotNull Function1<? super android.view.View, Unit> function1);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC53029wdl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void refreshView$default(AbstractC53029wdl abstractC53029wdl, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshView");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        abstractC53029wdl.AEQbTJ(list, z, z2);
    }
}
