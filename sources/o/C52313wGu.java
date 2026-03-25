package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.GridDealRecordSummaryHeaderData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wGu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52313wGu extends AbstractC59533zio<GridDealRecordSummaryHeaderData, StateListAnimator> {
    /* JADX DEBUG: Method merged with bridge method: getItemId(Ljava/lang/Object;)J */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public long getItemId(@NotNull GridDealRecordSummaryHeaderData gridDealRecordSummaryHeaderData) {
        Intrinsics.checkNotNullParameter(gridDealRecordSummaryHeaderData, "");
        return super.getItemId(gridDealRecordSummaryHeaderData);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C50939vdc c50939vdcCopydefault = C50939vdc.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c50939vdcCopydefault, "");
        return new StateListAnimator(this, c50939vdcCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull GridDealRecordSummaryHeaderData gridDealRecordSummaryHeaderData) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(gridDealRecordSummaryHeaderData, "");
        stateListAnimator.KWHzl().OLrzqt.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.inahnb));
        stateListAnimator.KWHzl().KWHzl.setText(gridDealRecordSummaryHeaderData.getAverageArbitrage());
        stateListAnimator.KWHzl().AhwBna.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.QhsCdE));
        stateListAnimator.KWHzl().valueOf.setText(gridDealRecordSummaryHeaderData.getExecution());
        stateListAnimator.KWHzl().EZpvd.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.invokespecialhrnhsO));
        stateListAnimator.KWHzl().copydefault.setText(gridDealRecordSummaryHeaderData.getArbitrageCount());
    }

    /* JADX INFO: renamed from: o.wGu$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C50939vdc KWHzl;
        public final /* synthetic */ C52313wGu OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C50939vdc KWHzl() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C52313wGu c52313wGu, C50939vdc c50939vdc) {
            super(c50939vdc.getRoot());
            Intrinsics.checkNotNullParameter(c50939vdc, "");
            this.OLrzqt = c52313wGu;
            this.KWHzl = c50939vdc;
        }
    }
}
