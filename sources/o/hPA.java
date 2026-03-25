package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.PoolTokenInfoUIItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hPA extends androidx.recyclerview.widget.ListAdapter<PoolTokenInfoUIItem, StateListAnimator> {
    public static final TaskDescription EZpvd = new TaskDescription(null);

    public hPA() {
        super(EZpvd);
    }

    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C23470hyo EZpvd;
        public final /* synthetic */ hPA OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull hPA hpa, C23470hyo c23470hyo) {
            super(c23470hyo.getRoot());
            Intrinsics.checkNotNullParameter(c23470hyo, "");
            this.OLrzqt = hpa;
            this.EZpvd = c23470hyo;
        }

        public final void EZpvd(@NotNull PoolTokenInfoUIItem poolTokenInfoUIItem) {
            Intrinsics.checkNotNullParameter(poolTokenInfoUIItem, "");
            C23470hyo c23470hyo = this.EZpvd;
            AppCompatImageView appCompatImageView = c23470hyo.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C25386ivj.loadCircleImage$default(appCompatImageView, poolTokenInfoUIItem.getTokenLogoUrl(), false, 2, null);
            c23470hyo.copydefault.setText(poolTokenInfoUIItem.getTokenSymbol());
            c23470hyo.AEQbTJ.setText(C23271hvA.formatTokenCode$default(C23271hvA.copydefault, poolTokenInfoUIItem.getAmount(), true, null, false, null, null, 30, null));
            c23470hyo.EZpvd.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, poolTokenInfoUIItem.getTokenAmountUsd(), true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C23470hyo c23470hyoKWHzl = C23470hyo.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23470hyoKWHzl, "");
        return new StateListAnimator(this, c23470hyoKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        PoolTokenInfoUIItem item = getItem(i);
        Intrinsics.copydefault(item);
        stateListAnimator.EZpvd(item);
    }

    public static final class TaskDescription extends DiffUtil.ItemCallback<PoolTokenInfoUIItem> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hPA.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull PoolTokenInfoUIItem poolTokenInfoUIItem, @NotNull PoolTokenInfoUIItem poolTokenInfoUIItem2) {
            Intrinsics.checkNotNullParameter(poolTokenInfoUIItem, "");
            Intrinsics.checkNotNullParameter(poolTokenInfoUIItem2, "");
            return Intrinsics.EZpvd((java.lang.Object) poolTokenInfoUIItem.getTokenContractAddress(), (java.lang.Object) poolTokenInfoUIItem2.getTokenContractAddress());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull PoolTokenInfoUIItem poolTokenInfoUIItem, @NotNull PoolTokenInfoUIItem poolTokenInfoUIItem2) {
            Intrinsics.checkNotNullParameter(poolTokenInfoUIItem, "");
            Intrinsics.checkNotNullParameter(poolTokenInfoUIItem2, "");
            return Intrinsics.EZpvd(poolTokenInfoUIItem, poolTokenInfoUIItem2);
        }
    }
}
