package o;

import android.view.View;
import com.okinc.business.trade.features.home.ui.cefi.common.OrderFilter;
import com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketFilter;
import com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketFilterItemBinder$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lfu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30692lfu extends AbstractC25436iwg<C55276xgr, hHR> {
    public final Function1<C55276xgr, Unit> AEQbTJ;
    public final AdvancedMarketFilter OLrzqt;

    /* JADX INFO: renamed from: o.lfu$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedMarketFilter.values().length];
            try {
                iArr[AdvancedMarketFilter.SWITCH_FILTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedMarketFilter.AMOUNTS_FILTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.xgr, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30692lfu(@NotNull AdvancedMarketFilter advancedMarketFilter, @NotNull Function1<? super C55276xgr, Unit> function1) {
        super(AdvancedMarketFilterItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(advancedMarketFilter, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = advancedMarketFilter;
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hHR> c25435iwf, @NotNull final C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        OLrzqt((hHR) c25435iwf.EZpvd(), c55276xgr, c25435iwf.getBindingAdapterPosition(), new Function1() { // from class: o.lfr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30692lfu.OLrzqt(this.KWHzl, c55276xgr, (C55276xgr) obj);
            }
        });
    }

    public static final Unit OLrzqt(C30692lfu c30692lfu, C55276xgr c55276xgr, C55276xgr c55276xgr2) {
        Intrinsics.checkNotNullParameter(c55276xgr2, "");
        c30692lfu.AEQbTJ.invoke(c55276xgr);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, C55276xgr c55276xgr, android.view.View view) {
        function1.invoke(c55276xgr);
    }

    public final void OLrzqt(hHR hhr, final C55276xgr c55276xgr, int i, final Function1<? super C55276xgr, Unit> function1) {
        hhr.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lft
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30692lfu.KWHzl(function1, c55276xgr, view);
            }
        });
        hhr.getRoot().setContentDescription(copydefault(c55276xgr, i));
        hhr.KWHzl.setText(c55276xgr.AhwBna());
        android.widget.ImageView imageView = hhr.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(c55276xgr.AEQbTJ() ^ true ? 4 : 0);
    }

    public final java.lang.String copydefault(C55276xgr c55276xgr, int i) {
        int i2 = Activity.AEQbTJ[this.OLrzqt.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (i == 0) {
                return "web3_dex_advance_orderbook_pricerange_all";
            }
            return "web3_dex_selection_sheet_cell_" + i;
        }
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        if (objOLrzqt == OrderFilter.Volume) {
            return "web3_dex_advance_orderbook_dimension_value";
        }
        if (objOLrzqt == OrderFilter.Amount) {
            return "web3_dex_advance_orderbook_dimension_amount";
        }
        return "web3_dex_selection_sheet_cell_" + (i + 1);
    }
}
