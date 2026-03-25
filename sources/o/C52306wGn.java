package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.core.widget.SortTextView;
import com.okinc.unify_trade.bot.data.GridDealRecordFilterBarData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52306wGn;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wGn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52306wGn extends AbstractC59533zio<GridDealRecordFilterBarData, StateListAnimator> {
    public final View.OnClickListener EZpvd;
    public final Function2<SortTextView, SortTextView.SortType, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<SortTextView, SortTextView.SortType, Unit> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.core.widget.SortTextView, ? super com.okinc.core.widget.SortTextView$SortType, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52306wGn(@NotNull Function2<? super SortTextView, ? super SortTextView.SortType, Unit> function2, @NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.copydefault = function2;
        this.EZpvd = onClickListener;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C50882vcY c50882vcYOLrzqt = C50882vcY.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c50882vcYOLrzqt, "");
        return new StateListAnimator(this, c50882vcYOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull GridDealRecordFilterBarData gridDealRecordFilterBarData) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(gridDealRecordFilterBarData, "");
        C55258xgZ c55258xgZ = stateListAnimator.KWHzl().OLrzqt;
        c55258xgZ.setTextValue(C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKtBackHandler11) + "(" + gridDealRecordFilterBarData.getUnit() + ")");
        c55258xgZ.setHelperLabelType(gridDealRecordFilterBarData.getShowHover() ? 1 : 2);
        stateListAnimator.KWHzl().OLrzqt.setOnClickListener(this.EZpvd);
    }

    /* JADX INFO: renamed from: o.wGn$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final /* synthetic */ C52306wGn AEQbTJ;
        public final C50882vcY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C50882vcY KWHzl() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C52306wGn c52306wGn, C50882vcY c50882vcY) {
            super(c50882vcY.getRoot());
            Intrinsics.checkNotNullParameter(c50882vcY, "");
            this.AEQbTJ = c52306wGn;
            this.KWHzl = c50882vcY;
            SortTextView sortTextView = c50882vcY.copydefault;
            SortTextView.SortType sortType = SortTextView.SortType.DOWN;
            sortTextView.setSortType(sortType, false);
            c50882vcY.copydefault.setSortTypeOrderList(sortType, SortTextView.SortType.UP);
            c50882vcY.copydefault.setOnSortTypeChangeListener(c52306wGn.KWHzl());
            c50882vcY.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.wGl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52306wGn.StateListAnimator.copydefault(this.OLrzqt, view);
                }
            });
        }

        public static final void copydefault(StateListAnimator stateListAnimator, android.view.View view) {
            SortTextView sortTextView = stateListAnimator.KWHzl.copydefault;
            SortTextView.setSortType$default(sortTextView, sortTextView.EZpvd(), false, 2, null);
        }
    }
}
