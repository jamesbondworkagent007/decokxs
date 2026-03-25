package o;

import com.okinc.crcore.coreapi.enums.ChannelCategoryCode;
import com.okinc.crcore.coreapi.net.requestbean.SubmitOrderForOtcAgentRequestBean;
import com.okinc.crcore.coreapi.net.requestbean.recurringbuy.RecurringBuyPlanUpdateRequestBean;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$deletePaymentMethod$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getB2cQuote$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getBanner$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getBaseTokenInfo$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getBuyCryptoList$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getCampaign$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getChannelPaymentMethods$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getCurrencyBalance$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getDefaultCurrency$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getDexQuote$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getDexTradeStatusCheck$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getFiatCommonUiFlow$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getFiatList$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getFiatOrderList$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getOrderDetail$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getQuotedPrice$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getRecurringBuyPlanList$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getRecurringBuyPlanOrderList$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getRecurringFrequency$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getRecurringPlanDetail$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getSellCryptoList$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getTradeSuggestion$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getUserInfo$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$submitOrderForOtcAgent$2;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$updateRecurringPlan$2;
import com.okinc.crcore.shared.net.responsebean.B2CQuotePriceBean;
import com.okinc.crcore.shared.net.responsebean.DexBaseTokenBean;
import com.okinc.crcore.shared.net.responsebean.DexQuoteBean;
import com.okinc.crcore.shared.net.responsebean.SubmitOrderForOtcAgentBean;
import com.okinc.crcore.shared.net.responsebean.bsc.AvailableCurrencyBalanceBean;
import com.okinc.crcore.shared.net.responsebean.bsc.B2CQuoteBean;
import com.okinc.crcore.shared.net.responsebean.bsc.CampaignBean;
import com.okinc.crcore.shared.net.responsebean.bsc.ChannelBean;
import com.okinc.crcore.shared.net.responsebean.bsc.CryptoListModelBean;
import com.okinc.crcore.shared.net.responsebean.bsc.CurrencyTokenBean;
import com.okinc.crcore.shared.net.responsebean.bsc.DefaultCurrencyBean;
import com.okinc.crcore.shared.net.responsebean.bsc.DeletePaymentMethodBean;
import com.okinc.crcore.shared.net.responsebean.bsc.DexTradeStatusCheckBean;
import com.okinc.crcore.shared.net.responsebean.bsc.FiatCommonUiFlowBean;
import com.okinc.crcore.shared.net.responsebean.bsc.FiatOrderListBean;
import com.okinc.crcore.shared.net.responsebean.bsc.GetBannerBean;
import com.okinc.crcore.shared.net.responsebean.bsc.OrderDetailBean;
import com.okinc.crcore.shared.net.responsebean.bsc.SupportCurrenciesBean;
import com.okinc.crcore.shared.net.responsebean.bsc.TradeSuggestionBean;
import com.okinc.crcore.shared.net.responsebean.bsc.UserInfoBean;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyFrequencyBean;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanDetailRootBean;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanListRootBean;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanOrderListRootBean;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanUpdateBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mBv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31731mBv implements InterfaceC31764mDa {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC31770mDg copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C31731mBv(@NotNull InterfaceC31770mDg interfaceC31770mDg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC31770mDg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC31770mDg;
        this.EZpvd = coroutineDispatcher;
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, int i, boolean z, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z2, @NotNull Continuation<? super AbstractC43419rot<TradeSuggestionBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getTradeSuggestion$2(this, str2, str, str3, str4, str5, str6, i, z, str7, str8, z2, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, @NotNull java.lang.String str5, java.lang.String str6, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<B2CQuotePriceBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getQuotedPrice$2(this, str, str2, str4, str3, i, str5, str6, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object KWHzl(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, int i, int i2, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull Continuation<? super AbstractC43419rot<B2CQuoteBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getB2cQuote$2(this, str, str2, str3, str4, str5, str6, str7, i, i2, str8, str9, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object OLrzqt(java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<RecurringBuyFrequencyBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getRecurringFrequency$2(this, str, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, @NotNull Continuation<? super AbstractC43419rot<RecurringBuyPlanListRootBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getRecurringBuyPlanList$2(this, str, str2, str3, num, num2, null), continuation);
    }

    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<RecurringBuyPlanDetailRootBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getRecurringPlanDetail$2(this, str, null), continuation);
    }

    public java.lang.Object OLrzqt(@NotNull RecurringBuyPlanUpdateRequestBean recurringBuyPlanUpdateRequestBean, @NotNull Continuation<? super AbstractC43419rot<RecurringBuyPlanUpdateBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$updateRecurringPlan$2(this, recurringBuyPlanUpdateRequestBean, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, @NotNull Continuation<? super AbstractC43419rot<RecurringBuyPlanOrderListRootBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getRecurringBuyPlanOrderList$2(this, str, num, num2, num3, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<OrderDetailBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getOrderDetail$2(this, str, str2, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<UserInfoBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getUserInfo$2(this, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<FiatOrderListBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getFiatOrderList$2(this, str, str2, i, i2, str3, str4, num, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object EZpvd(java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<DefaultCurrencyBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getDefaultCurrency$2(this, str, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, java.lang.Boolean bool, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CurrencyTokenBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getSellCryptoList$2(z, this, str, str2, bool, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<CryptoListModelBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getBuyCryptoList$2(this, str, str2, num, i, str3, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object copydefault(java.lang.String str, java.lang.Integer num, java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC43419rot<GetBannerBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getBanner$2(this, str, num, list, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object copydefault(java.lang.String str, java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<AvailableCurrencyBalanceBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getCurrencyBalance$2(this, str, str2, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object copydefault(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, @NotNull java.lang.String str7, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str8, java.lang.Boolean bool, java.lang.String str9, java.lang.String str10, java.lang.Boolean bool2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChannelBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getChannelPaymentMethods$2(this, str, str2, num, str3, str4, str5, str6, str7, num2, num3, str8, bool, str9, str10, bool2, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<FiatCommonUiFlowBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getFiatCommonUiFlow$2(this, str, str2, str3, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object copydefault(ChannelCategoryCode channelCategoryCode, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull Continuation<? super AbstractC43419rot<DeletePaymentMethodBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$deletePaymentMethod$2(this, channelCategoryCode, str, str2, str3, str4, str5, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<SupportCurrenciesBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getFiatList$2(this, str, str2, num, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, java.lang.Integer num, int i, java.lang.String str7, boolean z, java.lang.String str8, java.lang.String str9, @NotNull Continuation<? super AbstractC43419rot<DexQuoteBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getDexQuote$2(this, str, str2, str3, str4, str5, str6, num, i, str7, z, str8, str9, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<DexTradeStatusCheckBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getDexTradeStatusCheck$2(this, str, str2, str3, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DexBaseTokenBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getBaseTokenInfo$2(this, str, str2, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object KWHzl(@NotNull SubmitOrderForOtcAgentRequestBean submitOrderForOtcAgentRequestBean, @NotNull Continuation<? super AbstractC43419rot<SubmitOrderForOtcAgentBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$submitOrderForOtcAgent$2(this, submitOrderForOtcAgentRequestBean, null), continuation);
    }

    @Override // o.InterfaceC31764mDa
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<CampaignBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRB2CRepository$getCampaign$2(this, str, null), continuation);
    }

    /* JADX INFO: renamed from: o.mBv$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mBv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
