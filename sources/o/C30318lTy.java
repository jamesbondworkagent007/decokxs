package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.biz.model.SupportService;
import com.okinc.buysell.api.BSCTargetTab;
import com.okinc.buysell.api.BuySellTradeType;
import com.okinc.buysell.ui.transaction.buysell.view.UnifiedOrderDetailFooterView$updateContactSupportFooter$1$2;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.ok_app.api.LitePortfolioSourceEnum;
import com.okinc.core.ok_app.api.bean.LiteNavigationTabEnum;
import com.okinc.crcore.shared.net.responsebean.bsc.ConvertOrderDetailBean;
import com.okinc.crcore.shared.net.responsebean.bsc.DexOrderDetailBean;
import com.okinc.crcore.shared.net.responsebean.bsc.OrderDetailBean;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.DexTokenParameters;
import com.okinc.okx.paymentapi.service.HistoryOrderStatus;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.p2p.api.OtcRouteConst;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33244msm;
import o.C31351lsQ;
import o.InterfaceC33171mrS;
import o.InterfaceC47251tmX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lTy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30318lTy extends android.widget.FrameLayout {
    public final AbstractC31610lxl KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30318lTy(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromResultScreen(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:55) call: o.lTy.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C30318lTy(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30318lTy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = (AbstractC31610lxl) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C31351lsQ.ActionBar.OHqIaq, this, true);
    }

    public static /* synthetic */ void setData$default(C30318lTy c30318lTy, OrderDetailBean orderDetailBean, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        c30318lTy.setData(orderDetailBean, str, z);
    }

    public final void setData(@NotNull final OrderDetailBean orderDetailBean, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        this.copydefault = z;
        this.OLrzqt = lTJ.KWHzl.EZpvd(orderDetailBean);
        int status = orderDetailBean.getStatus();
        if (status == HistoryOrderStatus.PENDING.getValue()) {
            EZpvd();
            return;
        }
        if (status == HistoryOrderStatus.PROCESSING.getValue()) {
            if (orderDetailBean.getCategoryCode() == ChannelCategoryCode.THIRD_PARTY.getCode()) {
                if (orderDetailBean.getShowCustomer() && orderDetailBean.getCustomerUrl().length() > 0) {
                    AbstractC31610lxl abstractC31610lxl = this.KWHzl;
                    abstractC31610lxl.AhwBna.setVisibility(0);
                    abstractC31610lxl.copydefault.setVisibility(8);
                    C52794wYp c52794wYp = abstractC31610lxl.gEmmrt;
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    c52794wYp.setText(C33069mpW.KWHzl(context, C31351lsQ.Activity.DSiOMJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("thirdparty", orderDetailBean.getDepositName()))));
                    abstractC31610lxl.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.lTw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C30318lTy.setData$lambda$3$lambda$2$lambda$1(this.copydefault, orderDetailBean, view);
                        }
                    });
                    return;
                }
                EZpvd();
                return;
            }
            EZpvd();
            return;
        }
        if (status == HistoryOrderStatus.FAILED.getValue()) {
            if (orderDetailBean.getCategoryCode() == ChannelCategoryCode.THIRD_PARTY.getCode()) {
                if (!orderDetailBean.getShowCustomer() || orderDetailBean.getCustomerUrl().length() <= 0) {
                    return;
                }
                AbstractC31610lxl abstractC31610lxl2 = this.KWHzl;
                abstractC31610lxl2.AhwBna.setVisibility(0);
                abstractC31610lxl2.copydefault.setVisibility(8);
                C52794wYp c52794wYp2 = abstractC31610lxl2.gEmmrt;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c52794wYp2.setText(C33069mpW.KWHzl(context2, C31351lsQ.Activity.DSiOMJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("thirdparty", orderDetailBean.getDepositName()))));
                abstractC31610lxl2.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.lTx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C30318lTy.setData$lambda$5$lambda$4(this.KWHzl, orderDetailBean, view);
                    }
                });
                return;
            }
            if (orderDetailBean.getCategoryCode() == ChannelCategoryCode.NATIVE.getCode()) {
                AbstractC31610lxl abstractC31610lxl3 = this.KWHzl;
                final DexOrderDetailBean dexOrderDetail = orderDetailBean.getDexOrderDetail();
                if (dexOrderDetail != null) {
                    abstractC31610lxl3.AhwBna.setVisibility(8);
                    abstractC31610lxl3.copydefault.setVisibility(8);
                    abstractC31610lxl3.djBIcL.setVisibility(0);
                    abstractC31610lxl3.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.lTC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C30318lTy.setData$lambda$12$lambda$8$lambda$7(orderDetailBean, dexOrderDetail, view);
                        }
                    });
                    return;
                }
                abstractC31610lxl3.AhwBna.setVisibility(0);
                abstractC31610lxl3.copydefault.setVisibility(8);
                abstractC31610lxl3.djBIcL.setVisibility(8);
                abstractC31610lxl3.gEmmrt.setText(getContext().getString(C31351lsQ.Activity.OHqIaq));
                abstractC31610lxl3.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.lTE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) throws java.io.IOException {
                        C30318lTy.setData$lambda$12$lambda$11$lambda$10(this.KWHzl, view);
                    }
                });
                return;
            }
            EZpvd();
            return;
        }
        if (status == HistoryOrderStatus.COMPLETED.getValue()) {
            if (orderDetailBean.isConvert()) {
                ConvertOrderDetailBean convertOrderDetail = orderDetailBean.getConvertOrderDetail();
                java.lang.Integer numValueOf = convertOrderDetail != null ? java.lang.Integer.valueOf(convertOrderDetail.getOrderStatus()) : null;
                if (numValueOf != null && numValueOf.intValue() == 2) {
                    EZpvd();
                    return;
                }
                if ((numValueOf != null && numValueOf.intValue() == -1) || ((numValueOf != null && numValueOf.intValue() == 3) || ((numValueOf != null && numValueOf.intValue() == -3) || (numValueOf != null && numValueOf.intValue() == -2)))) {
                    this.KWHzl.copydefault.setVisibility(0);
                    this.KWHzl.AhwBna.setVisibility(8);
                    this.KWHzl.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.lTD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            this.EZpvd.AEQbTJ();
                        }
                    });
                    this.KWHzl.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.lTB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            this.EZpvd.OLrzqt(orderDetailBean);
                        }
                    });
                    return;
                }
                EZpvd();
                return;
            }
            EZpvd();
            return;
        }
        if (status == HistoryOrderStatus.REFUNDED.getValue()) {
            EZpvd();
            return;
        }
        if (status == HistoryOrderStatus.EXPIRED.getValue()) {
            this.KWHzl.copydefault.setVisibility(8);
            this.KWHzl.AhwBna.setVisibility(8);
        } else if (status == HistoryOrderStatus.CANCELLED.getValue()) {
            EZpvd();
        } else {
            EZpvd();
        }
    }

    public static final void setData$lambda$3$lambda$2$lambda$1(C30318lTy c30318lTy, OrderDetailBean orderDetailBean, android.view.View view) {
        c30318lTy.EZpvd(orderDetailBean.getCustomerUrl());
    }

    public static final void setData$lambda$5$lambda$4(C30318lTy c30318lTy, OrderDetailBean orderDetailBean, android.view.View view) {
        c30318lTy.EZpvd(orderDetailBean.getCustomerUrl());
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.tmX.StateListAnimator.goToBuySellConvertPage$default(o.tmX, androidx.fragment.app.FragmentActivity, com.okinc.okx.paymentapi.service.BuySellConvertParameters, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public static final void setData$lambda$12$lambda$8$lambda$7(OrderDetailBean orderDetailBean, DexOrderDetailBean dexOrderDetailBean, android.view.View view) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        FragmentActivity fragmentActivity = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
        if (fragmentActivity != null) {
            InterfaceC47251tmX.StateListAnimator.goToBuySellConvertPage$default((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class), fragmentActivity, new BuySellConvertParameters(OKPaymentSource.PAYMENT_INTERNAL_FLOW, Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getTradeType(), (java.lang.Object) BuySellTradeType.SELL.getType()) ? TargetTab.SELL : TargetTab.BUY, null, null, null, null, null, null, new DexTokenParameters(orderDetailBean.getChain(), dexOrderDetailBean.getTokenAddress()), 252, null), null, 4, null);
        }
    }

    public static final void setData$lambda$12$lambda$11$lambda$10(C30318lTy c30318lTy, android.view.View view) throws java.io.IOException {
        InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class);
        android.content.Context context = c30318lTy.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.app.Activity activityKWHzl = C35334ntP.KWHzl(context);
        ChatBotRequest chatBotRequest = new ChatBotRequest();
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("buy_sell_start", "payments_buysell_help");
        java.lang.String str = (java.lang.String) pairOLrzqt.component1();
        java.lang.String str2 = (java.lang.String) pairOLrzqt.component2();
        chatBotRequest.setGreetingAda("63f32047ec578d5fc52e55e1");
        chatBotRequest.setContextualBot(str);
        chatBotRequest.setOkaFrom(str2);
        chatBotRequest.setOkaChatbotMessage("payments_ogps");
        Unit unit = Unit.INSTANCE;
        interfaceC6804aWL.copydefault(activityKWHzl, chatBotRequest);
    }

    public final void OLrzqt(@NotNull final android.content.Context context, @NotNull final CoroutineScope coroutineScope, @NotNull final SupportService supportService, @NotNull final OrderDetailBean orderDetailBean, final BuySellTradeType buySellTradeType) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(supportService, "");
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        this.KWHzl.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.lTA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30318lTy.EZpvd(coroutineScope, orderDetailBean, buySellTradeType, supportService, context, view);
            }
        });
    }

    public static final void EZpvd(CoroutineScope coroutineScope, final OrderDetailBean orderDetailBean, final BuySellTradeType buySellTradeType, SupportService supportService, android.content.Context context, android.view.View view) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("FiatPayment_ContactSupport_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lTv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30318lTy.KWHzl(orderDetailBean, buySellTradeType, (EventParamsList) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new UnifiedOrderDetailFooterView$updateContactSupportFooter$1$2(supportService, context, null), 3, null);
    }

    public static final Unit KWHzl(OrderDetailBean orderDetailBean, BuySellTradeType buySellTradeType, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from_page", "transaction_details_page", false, 4, null);
        EventParamsList.put$default(eventParamsList, "deposit_platform_code", orderDetailBean.getDepositPlatformCode(), false, 4, null);
        java.lang.String type = buySellTradeType != null ? buySellTradeType.getType() : null;
        EventParamsList.put$default(eventParamsList, "trade_type", type == null ? "" : type, false, 4, null);
        EventParamsList.put$default(eventParamsList, "error_code", orderDetailBean.getBusinessErrorCode(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "currency", orderDetailBean.getQuoteCurrencySymbol(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(OrderDetailBean orderDetailBean) {
        java.lang.String baseAmount;
        java.lang.String convertBaseCurrency;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        FragmentActivity fragmentActivity = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
        if (fragmentActivity != null) {
            ConvertOrderDetailBean convertOrderDetail = orderDetailBean.getConvertOrderDetail();
            if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ()) {
                InterfaceC47251tmX.StateListAnimator.goToBuySellConvertPage$default((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class), fragmentActivity, new BuySellConvertParameters(OKPaymentSource.UNKNOWN_SOURCE, TargetTab.CONVERT, null, null, null, (convertOrderDetail == null || (baseAmount = convertOrderDetail.getBaseAmount()) == null) ? "" : baseAmount, null, (convertOrderDetail == null || (convertBaseCurrency = convertOrderDetail.getConvertBaseCurrency()) == null) ? "" : convertBaseCurrency, null, 348, null), null, 4, null);
                return;
            }
            ((InterfaceC31422lti) C43251rlk.copydefault(InterfaceC31422lti.class)).KWHzl(fragmentActivity, BSCTargetTab.CONVERT);
        }
    }

    public final void AEQbTJ() {
        if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("portfolio_source", LitePortfolioSourceEnum.BUY_SUCCESS);
            InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            bundle.putParcelable("tab_type", LiteNavigationTabEnum.LITE_PORTFOLIO);
            Unit unit = Unit.INSTANCE;
            InterfaceC33171mrS.Activity.switchToAppMode$default(interfaceC33171mrS, context, 2, false, 0, bundle, null, 32, null);
            return;
        }
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("path", "main/account");
            bundle2.putString(OtcRouteConst.MAIN_ROUTE_NAV, "funding_account");
            ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).copydefault(activityAEQbTJ, bundle2);
        }
    }

    public final void KWHzl() {
        LiteNavigationTabEnum liteNavigationTabEnum;
        if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ()) {
            if (Intrinsics.EZpvd(((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).KWHzl(), AbstractC33244msm.ActionBar.KWHzl)) {
                liteNavigationTabEnum = LiteNavigationTabEnum.ACTIVITY;
            } else {
                liteNavigationTabEnum = LiteNavigationTabEnum.LITE_SIMPLE_ACTIVITY;
            }
            InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("tab_type", liteNavigationTabEnum);
            Unit unit = Unit.INSTANCE;
            InterfaceC33171mrS.Activity.switchToAppMode$default(interfaceC33171mrS, context, 2, false, 0, bundle, null, 32, null);
            return;
        }
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("path", "main/account");
            bundle2.putString(OtcRouteConst.MAIN_ROUTE_NAV, "funding_account");
            ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).copydefault(activityAEQbTJ, bundle2);
        }
    }

    public final void OLrzqt() {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("path", "main/account");
            ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).copydefault(activityAEQbTJ, bundle);
        }
    }

    public final void EZpvd(java.lang.String str) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, C35334ntP.KWHzl(context), bundleBundleOf, null, 4, null);
    }

    public final void EZpvd() {
        AbstractC31610lxl abstractC31610lxl = this.KWHzl;
        if (abstractC31610lxl != null) {
            abstractC31610lxl.copydefault.setVisibility(8);
            abstractC31610lxl.AhwBna.setVisibility(8);
        }
        if (this.OLrzqt) {
            return;
        }
        copydefault();
    }

    public final void copydefault() {
        AbstractC31610lxl abstractC31610lxl = this.KWHzl;
        if (abstractC31610lxl != null) {
            if (this.copydefault) {
                if (!((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).OLrzqt(OKComplianceRestrictionService.Feature.NEW_ONSHORE_IA)) {
                    if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ()) {
                        abstractC31610lxl.KWHzl.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.zYHWMc));
                        abstractC31610lxl.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.lTI
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                C30318lTy.gEmmrt(this.OLrzqt, view);
                            }
                        });
                    } else {
                        abstractC31610lxl.KWHzl.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.iPSTqm));
                        abstractC31610lxl.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.lTF
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                C30318lTy.AhwBna(this.AEQbTJ, view);
                            }
                        });
                    }
                } else {
                    abstractC31610lxl.KWHzl.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DarRvM));
                    abstractC31610lxl.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.lTG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C30318lTy.AYXKKw(this.copydefault, view);
                        }
                    });
                }
                abstractC31610lxl.OLrzqt.setVisibility(0);
                return;
            }
            abstractC31610lxl.OLrzqt.setVisibility(8);
        }
    }

    public static final void gEmmrt(C30318lTy c30318lTy, android.view.View view) {
        C32866mlf.onEvent$default("Simpletrade_OrderDetails_ToActivity_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        c30318lTy.KWHzl();
    }

    public static final void AhwBna(C30318lTy c30318lTy, android.view.View view) {
        C32866mlf.onEvent$default("Simpletrade_OrderDetails_ToActivity_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        c30318lTy.OLrzqt();
    }

    public static final void AYXKKw(C30318lTy c30318lTy, android.view.View view) {
        C32866mlf.onEvent$default("Simpletrade_OrderDetails_ToPortfolio_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        c30318lTy.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.lTy$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lTy.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
