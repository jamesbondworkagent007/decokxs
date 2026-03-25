package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.PoolTokenInfoUIItem;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C26077jRb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jRb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26077jRb extends androidx.recyclerview.widget.ListAdapter<LiquidityPoolPairUIItem, ActionBar> {
    public static final Application AEQbTJ = new Application(null);
    public final Function1<LiquidityPoolPairUIItem, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<LiquidityPoolPairUIItem, Unit> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26077jRb(@NotNull Function1<? super LiquidityPoolPairUIItem, Unit> function1) {
        super(AEQbTJ);
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX INFO: renamed from: o.jRb$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final hDP EZpvd;
        public final /* synthetic */ C26077jRb OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C26077jRb c26077jRb, hDP hdp) {
            super(hdp.getRoot());
            Intrinsics.checkNotNullParameter(hdp, "");
            this.OLrzqt = c26077jRb;
            this.EZpvd = hdp;
        }

        public final void AEQbTJ(@NotNull final LiquidityPoolPairUIItem liquidityPoolPairUIItem) {
            java.lang.String tokenSymbol;
            java.lang.String tokenSymbol2;
            Intrinsics.checkNotNullParameter(liquidityPoolPairUIItem, "");
            hDP hdp = this.EZpvd;
            final C26077jRb c26077jRb = this.OLrzqt;
            AppCompatImageView appCompatImageView = hdp.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C25386ivj.loadCircleImage$default(appCompatImageView, liquidityPoolPairUIItem.getPoolLogoUrl(), false, 2, null);
            hdp.KWHzl.setText(liquidityPoolPairUIItem.getDexName());
            hdp.EZpvd.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, liquidityPoolPairUIItem.getLiquidity(), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
            java.util.List<PoolTokenInfoUIItem> poolTokenInfoList = liquidityPoolPairUIItem.getPoolTokenInfoList();
            if (poolTokenInfoList == null) {
                poolTokenInfoList = yDY.AhwBna();
            }
            PoolTokenInfoUIItem poolTokenInfoUIItem = (PoolTokenInfoUIItem) CollectionsKt___CollectionsKt.firstOrNull(poolTokenInfoList);
            java.lang.String str = "--";
            if (poolTokenInfoUIItem == null || (tokenSymbol = poolTokenInfoUIItem.getTokenSymbol()) == null) {
                tokenSymbol = "--";
            }
            PoolTokenInfoUIItem poolTokenInfoUIItem2 = (PoolTokenInfoUIItem) CollectionsKt___CollectionsKt.AkhnZx(poolTokenInfoList, 1);
            if (poolTokenInfoUIItem2 != null && (tokenSymbol2 = poolTokenInfoUIItem2.getTokenSymbol()) != null) {
                str = tokenSymbol2;
            }
            hdp.copydefault.setText(tokenSymbol + " | " + str + (poolTokenInfoList.size() > 2 ? " | ... " : ""));
            C25352ivB.setOnDoubleCheckClickListener$default(hdp.getRoot(), 0L, new Function1() { // from class: o.jQZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C26077jRb.ActionBar.EZpvd(c26077jRb, liquidityPoolPairUIItem, (android.view.View) obj);
                }
            }, 1, null);
        }

        public static final Unit EZpvd(C26077jRb c26077jRb, LiquidityPoolPairUIItem liquidityPoolPairUIItem, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            c26077jRb.OLrzqt().invoke(liquidityPoolPairUIItem);
            return Unit.INSTANCE;
        }

        public final void KWHzl(@NotNull LiquidityPoolPairUIItem liquidityPoolPairUIItem) {
            Intrinsics.checkNotNullParameter(liquidityPoolPairUIItem, "");
            this.EZpvd.EZpvd.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, liquidityPoolPairUIItem.getLiquidity(), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hDP hdpEZpvd = hDP.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hdpEZpvd, "");
        return new ActionBar(this, hdpEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        LiquidityPoolPairUIItem item = getItem(i);
        Intrinsics.copydefault(item);
        actionBar.AEQbTJ(item);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            LiquidityPoolPairUIItem item = getItem(i);
            Intrinsics.copydefault(item);
            actionBar.KWHzl(item);
            return;
        }
        super.onBindViewHolder(actionBar, i, list);
    }

    /* JADX INFO: renamed from: o.jRb$Application */
    public static final class Application extends DiffUtil.ItemCallback<LiquidityPoolPairUIItem> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jRb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull LiquidityPoolPairUIItem liquidityPoolPairUIItem, @NotNull LiquidityPoolPairUIItem liquidityPoolPairUIItem2) {
            Intrinsics.checkNotNullParameter(liquidityPoolPairUIItem, "");
            Intrinsics.checkNotNullParameter(liquidityPoolPairUIItem2, "");
            return Intrinsics.EZpvd((java.lang.Object) liquidityPoolPairUIItem.getPairAddress(), (java.lang.Object) liquidityPoolPairUIItem2.getPairAddress());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull LiquidityPoolPairUIItem liquidityPoolPairUIItem, @NotNull LiquidityPoolPairUIItem liquidityPoolPairUIItem2) {
            Intrinsics.checkNotNullParameter(liquidityPoolPairUIItem, "");
            Intrinsics.checkNotNullParameter(liquidityPoolPairUIItem2, "");
            return Intrinsics.EZpvd(liquidityPoolPairUIItem, liquidityPoolPairUIItem2);
        }

        /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public java.lang.Object getChangePayload(@NotNull LiquidityPoolPairUIItem liquidityPoolPairUIItem, @NotNull LiquidityPoolPairUIItem liquidityPoolPairUIItem2) {
            Intrinsics.checkNotNullParameter(liquidityPoolPairUIItem, "");
            Intrinsics.checkNotNullParameter(liquidityPoolPairUIItem2, "");
            if (Intrinsics.EZpvd((java.lang.Object) liquidityPoolPairUIItem.getDexName(), (java.lang.Object) liquidityPoolPairUIItem2.getDexName()) && Intrinsics.EZpvd((java.lang.Object) liquidityPoolPairUIItem.getExplorerUrl(), (java.lang.Object) liquidityPoolPairUIItem2.getExplorerUrl()) && Intrinsics.EZpvd((java.lang.Object) liquidityPoolPairUIItem.getPoolLogoUrl(), (java.lang.Object) liquidityPoolPairUIItem2.getPoolLogoUrl()) && liquidityPoolPairUIItem.isExpanded() == liquidityPoolPairUIItem2.isExpanded() && !Intrinsics.EZpvd(liquidityPoolPairUIItem.getPoolTokenInfoList(), liquidityPoolPairUIItem2.getPoolTokenInfoList()) && !Intrinsics.EZpvd((java.lang.Object) liquidityPoolPairUIItem.getLiquidity(), (java.lang.Object) liquidityPoolPairUIItem2.getLiquidity())) {
                return java.lang.Boolean.TRUE;
            }
            return null;
        }
    }
}
