package o;

import com.okinc.business.trade.features.home.ui.cefi.common.OrderFilter;
import com.okinc.business.trade.features.home.ui.cefi.orderbook.OrderBookItemBinder$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lfI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30654lfI extends AbstractC25436iwg<C28230kTs, hHB> {
    public OrderFilter copydefault;

    /* JADX INFO: renamed from: o.lfI$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderFilter.values().length];
            try {
                iArr[OrderFilter.Volume.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrderFilter.Amount.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(OrderFilter orderFilter) {
        if (orderFilter == null) {
            return;
        }
        this.copydefault = orderFilter;
    }

    public C30654lfI() {
        super(OrderBookItemBinder$1.INSTANCE);
        this.copydefault = OrderFilter.Volume;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hHB> c25435iwf, @NotNull C28230kTs c28230kTs) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c28230kTs, "");
        OLrzqt((hHB) c25435iwf.EZpvd(), c28230kTs);
    }

    public final void OLrzqt(hHB hhb, C28230kTs c28230kTs) {
        java.lang.String strAEQbTJ;
        int iTradeFallDefault$default;
        hhb.KWHzl.setText(c28230kTs.KWHzl());
        android.widget.TextView textView = hhb.copydefault;
        int i = TaskDescription.copydefault[this.copydefault.ordinal()];
        if (i == 1) {
            strAEQbTJ = c28230kTs.AEQbTJ();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strAEQbTJ = c28230kTs.OLrzqt();
        }
        textView.setText(strAEQbTJ);
        android.widget.TextView textView2 = hhb.KWHzl;
        if (c28230kTs.copydefault()) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = hhb.KWHzl.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iTradeFallDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
        } else {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = hhb.KWHzl.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iTradeFallDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null);
        }
        textView2.setTextColor(iTradeFallDefault$default);
    }
}
