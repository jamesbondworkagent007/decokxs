package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyMode;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection;
import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.ItemType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class hMY extends android.widget.FrameLayout {
    public RecyclerView EZpvd;
    public C21800hMu copydefault;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderStrategyType.values().length];
            try {
                iArr[OrderStrategyType.Limit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrderStrategyType.Tp.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderStrategyType.Sl.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderStrategyType.CopyTrade.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderStrategyType.Market.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hMY(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hMY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:42) call: o.hMY.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ hMY(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hMY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd();
    }

    public final void AEQbTJ(@NotNull java.lang.String str, OrderDetailResult orderDetailResult) {
        Intrinsics.checkNotNullParameter(str, "");
        if (orderDetailResult != null) {
            int i = StateListAnimator.KWHzl[OrderStrategyType.Companion.copydefault(orderDetailResult.getOrderType()).ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                C21800hMu c21800hMu = this.copydefault;
                if (c21800hMu != null) {
                    c21800hMu.EZpvd(EZpvd(str, orderDetailResult));
                    return;
                }
                return;
            }
            if (i != 4) {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                C21800hMu c21800hMu2 = this.copydefault;
                if (c21800hMu2 != null) {
                    c21800hMu2.EZpvd(KWHzl(str, orderDetailResult));
                }
            }
        }
    }

    public final java.util.List<AbstractC21793hMn> KWHzl(java.lang.String str, OrderDetailResult orderDetailResult) {
        java.util.ArrayList<AbstractC21793hMn> arrayList = new java.util.ArrayList<>();
        arrayList.add(new C21803hMx(orderDetailResult, DetailSection.OrderInfo, false, 4, null));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_ORDER_TYPE.getValue(), null, 4, null));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_LIMIT_CREATE_TIME.getValue(), null, 4, null));
        copydefault(arrayList, orderDetailResult);
        arrayList.add(new C21802hMw(orderDetailResult, ItemType.ITEM_TYPE_LIMIT_NETWORK.getValue()));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_SLIPPAGE.getValue(), null, 4, null));
        arrayList.add(new C21798hMs(orderDetailResult, ItemType.ITEM_TYPE_LIMIT_NETWORK_FEE.getValue(), new Function0() { // from class: o.hNd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hMY.AEQbTJ(this.OLrzqt);
            }
        }));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_LIMIT_SERVICE_FEE.getValue(), null, 4, null));
        if (orderDetailResult.getRouteSelection().length() > 0) {
            arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_ROUTE_SELECTION.getValue(), null, 4, null));
        }
        arrayList.add(new C21796hMq(orderDetailResult));
        arrayList.add(new C21803hMx(orderDetailResult, DetailSection.TradeInfo, false, 4, null));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_TRANSACTION_TYPE.getValue(), null, 4, null));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_SWAP_DURATION.getValue(), null, 4, null));
        arrayList.add(new C21805hMz(orderDetailResult, ItemType.ITEM_TYPE_EXECUTION_RATE.getValue(), null, 4, null));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_APPROVE_METHOD.getValue(), null, 4, null));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_PROVIDER.getValue(), null, 4, null));
        arrayList.add(new C21804hMy(orderDetailResult, orderDetailResult.getUserWalletAddress()));
        arrayList.add(new C21801hMv(orderDetailResult, ItemType.ITEM_TYPE_TX_HASH.getValue()));
        return arrayList;
    }

    public static final Unit AEQbTJ(hMY hmy) {
        android.content.Context context = hmy.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25352ivB.OLrzqt(context, "", C33070mpX.AYXKKw(C23274hvD.Fragment.sanitizeSessionIdIgnoreCase), C23274hvD.Fragment.MediaBrowserCompatServiceBinderWrapper);
        return Unit.INSTANCE;
    }

    public final java.util.List<AbstractC21793hMn> EZpvd(java.lang.String str, OrderDetailResult orderDetailResult) {
        java.util.ArrayList<AbstractC21793hMn> arrayList = new java.util.ArrayList<>();
        arrayList.add(new C21803hMx(orderDetailResult, DetailSection.OrderInfo, false, 4, null));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_ORDER_TYPE.getValue(), null, 4, null));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_LIMIT_TYPE.getValue(), null, 4, null));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_LIMIT_CREATE_TIME.getValue(), null, 4, null));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_LIMIT_EXPIRY_TIME.getValue(), null, 4, null));
        copydefault(arrayList, orderDetailResult);
        arrayList.add(new C21802hMw(orderDetailResult, ItemType.ITEM_TYPE_LIMIT_NETWORK.getValue()));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_SLIPPAGE.getValue(), null, 4, null));
        arrayList.add(new C21798hMs(orderDetailResult, ItemType.ITEM_TYPE_LIMIT_NETWORK_FEE.getValue(), new Function0() { // from class: o.hMW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hMY.EZpvd(this.OLrzqt);
            }
        }));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_LIMIT_SERVICE_FEE.getValue(), null, 4, null));
        if (orderDetailResult.getRouteSelection().length() > 0) {
            arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_ROUTE_SELECTION.getValue(), null, 4, null));
        }
        if (C19758gOf.AEQbTJ.copydefault(null, orderDetailResult.getStatus(), true)) {
            arrayList.add(new C21795hMp(orderDetailResult));
        }
        arrayList.add(new C21796hMq(orderDetailResult));
        arrayList.add(new C21803hMx(orderDetailResult, DetailSection.TradeInfo, false, 4, null));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_TRANSACTION_TYPE.getValue(), null, 4, null));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_CLOSING_TIME.getValue(), null, 4, null));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_SWAP_DURATION.getValue(), null, 4, null));
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(str).fARcdN();
        FromChildOrderDetailVO fromChildOrderDetailVO = orderDetailResult.getFromChildOrderDetailVO();
        final int i = interfaceC23194htdFARcdN.copydefault(C33129mqd.valueOf(fromChildOrderDetailVO != null ? fromChildOrderDetailVO.getFromChainId() : null)) ? C23274hvD.Fragment.fACtfg : C23274hvD.Fragment.ddhgMB;
        arrayList.add(new C21805hMz(orderDetailResult, ItemType.ITEM_TYPE_EXECUTION_RATE.getValue(), null, 4, null));
        if (orderDetailResult.getStrategyMode() != OrderStrategyMode.TEE_SA_EXCHANGE_RATE_BASED_LIMIT_ORDER.getStrategyMode()) {
            arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_LIMIT_EXECUTE_PRICE.getValue(), new Function0() { // from class: o.hMX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return hMY.KWHzl(this.EZpvd, i);
                }
            }));
        }
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_APPROVE_METHOD.getValue(), null, 4, null));
        arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_PROVIDER.getValue(), null, 4, null));
        arrayList.add(new C21804hMy(orderDetailResult, orderDetailResult.getUserWalletAddress()));
        arrayList.add(new C21801hMv(orderDetailResult, ItemType.ITEM_TYPE_TX_HASH.getValue()));
        return arrayList;
    }

    public static final Unit EZpvd(hMY hmy) {
        android.content.Context context = hmy.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25352ivB.OLrzqt(context, "", C33070mpX.AYXKKw(C23274hvD.Fragment.sanitizeSessionIdIgnoreCase), C23274hvD.Fragment.MediaBrowserCompatServiceBinderWrapper);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(hMY hmy, int i) {
        android.content.Context context = hmy.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25352ivB.OLrzqt(context, "", C33070mpX.AYXKKw(i), C23274hvD.Fragment.MediaBrowserCompatServiceBinderWrapper);
        return Unit.INSTANCE;
    }

    public final void copydefault(java.util.ArrayList<AbstractC21793hMn> arrayList, OrderDetailResult orderDetailResult) {
        int i = StateListAnimator.KWHzl[OrderStrategyType.Companion.copydefault(orderDetailResult.getOrderType()).ordinal()];
        if (i == 1) {
            if (orderDetailResult.getTriggerInfo().getTriggerRate().length() > 0) {
                arrayList.add(new C21805hMz(orderDetailResult, ItemType.ITEM_TYPE_LIMIT_TRIGGER_RATE.getValue(), null, 4, null));
                return;
            } else if (orderDetailResult.getTriggerInfo().getTriggerMarketCapacity().length() > 0) {
                arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_TRIGGER_PRICE_M_CAP.getValue(), null, 4, null));
                return;
            } else {
                arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_TRIGGER_PRICE.getValue(), null, 4, null));
                return;
            }
        }
        if (i == 2 || i == 3) {
            arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_TRIGGER_PRICE.getValue(), null, 4, null));
        } else if (i == 4) {
            arrayList.add(new C21797hMr(orderDetailResult, ItemType.ITEM_TYPE_COPY_TRADING_STRATEGY_TYPE.getValue(), null, 4, null));
        } else if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void EZpvd() {
        hGD hgdOLrzqt = hGD.OLrzqt(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(hgdOLrzqt, "");
        this.EZpvd = hgdOLrzqt.KWHzl;
        C21800hMu c21800hMu = new C21800hMu("default_trade");
        this.copydefault = c21800hMu;
        c21800hMu.KWHzl();
        RecyclerView recyclerView = this.EZpvd;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(C33047mpA.KWHzl(getContext()));
        }
        RecyclerView recyclerView2 = this.EZpvd;
        if (recyclerView2 != null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            recyclerView2.addItemDecoration(new C24290iaz(C55298xhM.OLrzqt(24, context), true));
        }
        RecyclerView recyclerView3 = this.EZpvd;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.copydefault);
        }
    }
}
