package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyMode;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeOrderStrategyType;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.ItemType;
import com.okinc.business.dexui.main.limitorder.orderdetail.itemviewbinding.LimitCommonOrderItemViewBinder$1;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hMD extends AbstractC25436iwg<C21797hMr, C21471hAp> {
    public static final ActionBar Companion = new ActionBar(null);

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LimitMemeOrderStrategyType.values().length];
            try {
                iArr[LimitMemeOrderStrategyType.BUY_DIP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LimitMemeOrderStrategyType.TAKE_PROFIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[LimitMemeOrderStrategyType.STOP_LOSS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[LimitMemeOrderStrategyType.BUY_ABOVE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[LimitMemeOrderStrategyType.MARKET_BUY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[LimitMemeOrderStrategyType.MARKET_SELL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[OrderStrategyType.values().length];
            try {
                iArr2[OrderStrategyType.Market.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[OrderStrategyType.Limit.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[OrderStrategyType.Tp.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[OrderStrategyType.Sl.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[OrderStrategyType.CopyTrade.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            copydefault = iArr2;
        }
    }

    public hMD() {
        super(LimitCommonOrderItemViewBinder$1.INSTANCE);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hMD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21471hAp> c25435iwf, @NotNull C21797hMr c21797hMr) {
        java.lang.String strKWHzl;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String strAYXKKw = "";
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c21797hMr, "");
        ((C21471hAp) c25435iwf.EZpvd()).copydefault.setTipsCallback(c21797hMr.EZpvd());
        android.content.Context context = c25435iwf.itemView.getContext();
        java.lang.String strAEQbTJ = c21797hMr.AEQbTJ();
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_LIMIT_CREATE_TIME.getValue())) {
            hWN hwn = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn, "");
            java.lang.String string3 = context.getString(C23274hvD.Fragment.PlaybackStateCompat1);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            copydefault(hwn, string3, copydefault(c21797hMr.OLrzqt().getCreateTime()));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_LIMIT_EXPIRY_TIME.getValue())) {
            hWN hwn2 = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn2, "");
            java.lang.String string4 = context.getString(C23274hvD.Fragment.MediaSessionCompatToken);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            copydefault(hwn2, string4, copydefault(c21797hMr.OLrzqt().getExpireTime()));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_CLOSING_TIME.getValue())) {
            hWN hwn3 = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn3, "");
            copydefault(hwn3, C33070mpX.AYXKKw(C23274hvD.Fragment.QWSkGZ), copydefault(c21797hMr.OLrzqt().getTransactionTime()));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_LIMIT_TYPE.getValue())) {
            hWN hwn4 = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn4, "");
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.getPercentRating);
            switch (StateListAnimator.AEQbTJ[c21797hMr.OLrzqt().getLimitMemeOrderStrategyType().ordinal()]) {
                case 1:
                    strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.newUnratedRating);
                    break;
                case 2:
                    if (c21797hMr.OLrzqt().getStrategyMode() == OrderStrategyMode.TEE_SA_COPY_TRADE.getStrategyMode()) {
                        strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.zzJhsT);
                    } else {
                        strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.isThumbUp);
                    }
                    break;
                case 3:
                    if (c21797hMr.OLrzqt().getStrategyMode() == OrderStrategyMode.TEE_SA_COPY_TRADE.getStrategyMode()) {
                        strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.hgxRZI);
                    } else {
                        strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.isRated);
                    }
                    break;
                case 4:
                    strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.getRatingStyle);
                    break;
                case 5:
                case 6:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            copydefault(hwn4, strAYXKKw2, strAYXKKw);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_TRIGGER_PRICE_M_CAP.getValue())) {
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            java.lang.String triggerPrice = c21797hMr.OLrzqt().getTriggerPrice();
            RoundingMode roundingMode = RoundingMode.DOWN;
            java.lang.String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(c23272hvB, triggerPrice, true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
            java.lang.String scientificCurrency$default2 = C23272hvB.formatScientificCurrency$default(c23272hvB, c21797hMr.OLrzqt().getTriggerMarketCapacity(), true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
            hWN hwn5 = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn5, "");
            java.lang.String string5 = context.getString(C23274hvD.Fragment.PlaybackStateCompatState);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            copydefault(hwn5, string5, scientificCurrency$default + " / " + scientificCurrency$default2);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_SLIPPAGE.getValue())) {
            java.lang.String slippageValue = c21797hMr.OLrzqt().getSlippageInfo().getSlippageValue();
            strKWHzl = slippageValue.length() > 0 ? C23311hvo.formatPercent$default(slippageValue, false, 0, 0, null, null, 31, null) : "--";
            hWN hwn6 = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn6, "");
            copydefault(hwn6, C33070mpX.AYXKKw(C23274hvD.Fragment.MediaDescriptionCompatApi23Builder), strKWHzl);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_LIMIT_SERVICE_FEE.getValue())) {
            if (Intrinsics.EZpvd((java.lang.Object) c21797hMr.OLrzqt().getStatus(), (java.lang.Object) java.lang.String.valueOf(OrderSubStatus.Completed.getStatus()))) {
                string2 = context.getString(C23274hvD.Fragment.onViewAttachedToWindow);
            } else {
                string2 = context.getString(C23274hvD.Fragment.sendVolumeInfoChanged);
            }
            Intrinsics.copydefault((java.lang.Object) string2);
            hWN hwn7 = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn7, "");
            copydefault(hwn7, string2, copydefault(c21797hMr.OLrzqt()));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_ORDER_TYPE.getValue())) {
            OrderStrategyType orderStrategyTypeCopydefault = OrderStrategyType.Companion.copydefault(c21797hMr.OLrzqt().getOrderType());
            hWN hwn8 = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn8, "");
            java.lang.String string6 = context.getString(C23274hvD.Fragment.equals);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            int i = StateListAnimator.copydefault[orderStrategyTypeCopydefault.ordinal()];
            if (i == 1) {
                pUU.copydefault("LimitCommonOrderItemViewBinder", "LimitOrder but orderType is Market, orderId=" + c21797hMr.OLrzqt().getOrderId());
                string = context.getString(C23274hvD.Fragment.sendState);
            } else if (i == 2 || i == 3 || i == 4) {
                if (c21797hMr.OLrzqt().getTriggerInfo().getTriggerRate().length() > 0) {
                    string = context.getString(C23274hvD.Fragment.setActiveQueueItemId);
                } else {
                    string = context.getString(C23274hvD.Fragment.addCustomAction);
                }
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                string = context.getString(C23274hvD.Fragment.DXd);
            }
            Intrinsics.copydefault((java.lang.Object) string);
            copydefault(hwn8, string6, string);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_TRIGGER_PRICE.getValue())) {
            java.lang.String scientificCurrency$default3 = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c21797hMr.OLrzqt().getTriggerPrice(), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
            hWN hwn9 = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn9, "");
            java.lang.String string7 = context.getString(C23274hvD.Fragment.getName);
            Intrinsics.checkNotNullExpressionValue(string7, "");
            copydefault(hwn9, string7, scientificCurrency$default3);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_ROUTE_SELECTION.getValue())) {
            hWN hwn10 = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn10, "");
            java.lang.String string8 = context.getString(C23274hvD.Fragment.get);
            Intrinsics.checkNotNullExpressionValue(string8, "");
            java.lang.String routeSelection = c21797hMr.OLrzqt().getRouteSelection();
            copydefault(hwn10, string8, routeSelection.length() != 0 ? routeSelection : "--");
            ((C21471hAp) c25435iwf.EZpvd()).copydefault.setCommonValueStartIcon(c21797hMr.OLrzqt().getChainLogoUrl(), C57406yhn.Activity.QKVWgx);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_TRANSACTION_TYPE.getValue())) {
            hWN hwn11 = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn11, "");
            java.lang.String string9 = context.getString(C23274hvD.Fragment.setSessionToken2Bundle);
            Intrinsics.checkNotNullExpressionValue(string9, "");
            java.lang.String transactionType = c21797hMr.OLrzqt().getTransactionType();
            copydefault(hwn11, string9, transactionType.length() != 0 ? transactionType : "--");
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_SWAP_DURATION.getValue())) {
            strKWHzl = Intrinsics.EZpvd((java.lang.Object) c21797hMr.OLrzqt().getStatus(), (java.lang.Object) java.lang.String.valueOf(OrderSubStatus.Completed.getStatus())) ? C23311hvo.KWHzl(C33129mqd.AhwBna(C23313hvq.divCheckS$default(C23311hvo.copydefault(c21797hMr.OLrzqt().getSwapDuration()), 1000, null, null, null, 14, null)), true) : "--";
            hWN hwn12 = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn12, "");
            copydefault(hwn12, C33070mpX.AYXKKw(C23274hvD.Fragment.compare), strKWHzl);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_APPROVE_METHOD.getValue())) {
            hWN hwn13 = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn13, "");
            java.lang.String string10 = context.getString(C23274hvD.Fragment.OTJFaA);
            Intrinsics.checkNotNullExpressionValue(string10, "");
            java.lang.String approveMethod = c21797hMr.OLrzqt().getApproveMethod();
            copydefault(hwn13, string10, approveMethod.length() != 0 ? approveMethod : "--");
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_PROVIDER.getValue())) {
            hWN hwn14 = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn14, "");
            java.lang.String string11 = context.getString(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBase);
            Intrinsics.checkNotNullExpressionValue(string11, "");
            copydefault(hwn14, string11, c21797hMr.OLrzqt().getProviderInfo().getProvider());
            ((C21471hAp) c25435iwf.EZpvd()).copydefault.setCommonValueStartIcon(c21797hMr.OLrzqt().getProviderInfo().getProviderLogo(), C52761wXj.TaskDescription.gasjUx);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_LIMIT_EXECUTE_PRICE.getValue())) {
            hWN hwn15 = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn15, "");
            java.lang.String string12 = context.getString(C23274hvD.Fragment.OsDdEf);
            Intrinsics.checkNotNullExpressionValue(string12, "");
            copydefault(hwn15, string12, C22481hgF.copydefault.copydefault(c21797hMr.OLrzqt()));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_COPY_TRADING_STRATEGY_TYPE.getValue())) {
            hWN hwn16 = ((C21471hAp) c25435iwf.EZpvd()).copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn16, "");
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C23274hvD.Fragment.GhqvEQ);
            int i2 = StateListAnimator.AEQbTJ[c21797hMr.OLrzqt().getLimitMemeOrderStrategyType().ordinal()];
            if (i2 == 5) {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.sVvuFk);
            } else if (i2 == 6) {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.hbZCHz);
            }
            copydefault(hwn16, strAYXKKw3, strAYXKKw);
        }
    }

    public final java.lang.String copydefault(OrderDetailResult orderDetailResult) {
        if (Intrinsics.EZpvd((java.lang.Object) orderDetailResult.getStatus(), (java.lang.Object) java.lang.String.valueOf(OrderSubStatus.Completed.getStatus()))) {
            if (orderDetailResult.getServiceFeeInfo().getDiscountedServiceFee().length() > 0 && C23313hvq.OLrzqt(orderDetailResult.getServiceFeeInfo().getDiscountedServiceFee(), 0)) {
                return C23271hvA.getShowDataWithSymbol$default(C23271hvA.copydefault, orderDetailResult.getServiceFeeInfo().getDiscountedServiceFee(), orderDetailResult.getServiceFeeTokenSymbol(), false, null, false, false, 60, null);
            }
            if (orderDetailResult.getServiceFeeInfo().getDiscountedServiceFeeRate().length() > 0) {
                return C23311hvo.formatPercent$default(orderDetailResult.getServiceFeeInfo().getDiscountedServiceFeeRate(), false, 0, 0, null, null, 31, null);
            }
        } else if (orderDetailResult.getServiceFeeInfo().getDiscountedServiceFeeRate().length() > 0) {
            return C23311hvo.formatPercent$default(orderDetailResult.getServiceFeeInfo().getDiscountedServiceFeeRate(), false, 0, 0, null, null, 31, null);
        }
        return "--";
    }

    public final void copydefault(hWN hwn, java.lang.String str, java.lang.String str2) {
        hwn.setCommonTitle(str);
        hwn.setCommonValue(str2);
        hwn.KWHzl();
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return C22689hkB.EZpvd.EZpvd(str) ? "--" : pTA.format$default(new Date(C33129mqd.valueOf(str)), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
    }
}
