package o;

import com.okinc.crcore.coreapi.enums.BalanceAccountType;
import com.okinc.crcore.coreapi.enums.ChannelCategoryCode;
import com.okinc.crcore.coreapi.enums.TradeType;
import com.okinc.crcore.coreapi.net.requestbean.SubmitOrderForOtcAgentRequestBean;
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
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanListRootBean;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanOrderListRootBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mDa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC31764mDa {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<CryptoListModelBean, OKServerException>> continuation);

    java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, @NotNull Continuation<? super AbstractC43419rot<RecurringBuyPlanListRootBean, OKServerException>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<CampaignBean, OKServerException>> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<UserInfoBean, OKServerException>> continuation);

    java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<FiatOrderListBean, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, @NotNull java.lang.String str5, java.lang.String str6, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<B2CQuotePriceBean>, OKServerException>> continuation);

    java.lang.Object EZpvd(java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<DefaultCurrencyBean, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull SubmitOrderForOtcAgentRequestBean submitOrderForOtcAgentRequestBean, @NotNull Continuation<? super AbstractC43419rot<SubmitOrderForOtcAgentBean, OKServerException>> continuation);

    java.lang.Object KWHzl(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, int i, int i2, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull Continuation<? super AbstractC43419rot<B2CQuoteBean, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DexBaseTokenBean>, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, java.lang.Integer num, int i, java.lang.String str7, boolean z, java.lang.String str8, java.lang.String str9, @NotNull Continuation<? super AbstractC43419rot<DexQuoteBean, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<FiatCommonUiFlowBean, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<OrderDetailBean, OKServerException>> continuation);

    java.lang.Object OLrzqt(java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<RecurringBuyFrequencyBean>, OKServerException>> continuation);

    java.lang.Object copydefault(ChannelCategoryCode channelCategoryCode, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull Continuation<? super AbstractC43419rot<DeletePaymentMethodBean, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, @NotNull Continuation<? super AbstractC43419rot<RecurringBuyPlanOrderListRootBean, OKServerException>> continuation);

    java.lang.Object copydefault(java.lang.String str, java.lang.Integer num, java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC43419rot<GetBannerBean, OKServerException>> continuation);

    java.lang.Object copydefault(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, @NotNull java.lang.String str7, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str8, java.lang.Boolean bool, java.lang.String str9, java.lang.String str10, java.lang.Boolean bool2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChannelBean>, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<SupportCurrenciesBean, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, int i, boolean z, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z2, @NotNull Continuation<? super AbstractC43419rot<TradeSuggestionBean, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<DexTradeStatusCheckBean, OKServerException>> continuation);

    java.lang.Object copydefault(java.lang.String str, java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<AvailableCurrencyBalanceBean, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, java.lang.Boolean bool, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CurrencyTokenBean>, OKServerException>> continuation);

    /* JADX INFO: renamed from: o.mDa$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object getB2cQuote$default(InterfaceC31764mDa interfaceC31764mDa, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, int i2, java.lang.String str8, java.lang.String str9, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31764mDa.KWHzl((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? TradeType.BUY.getType() : str6, (i3 & 64) != 0 ? "" : str7, (i3 & 128) != 0 ? 1 : i, (i3 & 256) != 0 ? 1 : i2, (i3 & 512) != 0 ? "" : str8, (i3 & 1024) != 0 ? "" : str9, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getB2cQuote");
        }

        public static /* synthetic */ java.lang.Object getRecurringFrequency$default(InterfaceC31764mDa interfaceC31764mDa, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecurringFrequency");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC31764mDa.OLrzqt(str, continuation);
        }

        public static /* synthetic */ java.lang.Object getRecurringBuyPlanList$default(InterfaceC31764mDa interfaceC31764mDa, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31764mDa.AEQbTJ((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (Continuation<? super AbstractC43419rot<RecurringBuyPlanListRootBean, OKServerException>>) continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecurringBuyPlanList");
        }

        public static /* synthetic */ java.lang.Object getRecurringBuyPlanOrderList$default(InterfaceC31764mDa interfaceC31764mDa, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31764mDa.copydefault(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (Continuation<? super AbstractC43419rot<RecurringBuyPlanOrderListRootBean, OKServerException>>) continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecurringBuyPlanOrderList");
        }

        public static /* synthetic */ java.lang.Object getFiatOrderList$default(InterfaceC31764mDa interfaceC31764mDa, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, Continuation continuation, int i3, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31764mDa.EZpvd((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 10 : i2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : num, (Continuation<? super AbstractC43419rot<FiatOrderListBean, OKServerException>>) continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFiatOrderList");
        }

        public static /* synthetic */ java.lang.Object getDefaultCurrency$default(InterfaceC31764mDa interfaceC31764mDa, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDefaultCurrency");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC31764mDa.EZpvd(str, continuation);
        }

        public static /* synthetic */ java.lang.Object getSellCryptoList$default(InterfaceC31764mDa interfaceC31764mDa, java.lang.String str, java.lang.String str2, boolean z, java.lang.Boolean bool, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSellCryptoList");
            }
            if ((i & 2) != 0) {
                str2 = "cefi";
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                bool = null;
            }
            return interfaceC31764mDa.copydefault(str, str3, z2, bool, (Continuation<? super AbstractC43419rot<? extends java.util.List<CurrencyTokenBean>, OKServerException>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getBuyCryptoList$default(InterfaceC31764mDa interfaceC31764mDa, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.String str3, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBuyCryptoList");
            }
            if ((i2 & 2) != 0) {
                str2 = "FIRST_CACHE";
            }
            java.lang.String str4 = str2;
            if ((i2 & 4) != 0) {
                num = 0;
            }
            java.lang.Integer num2 = num;
            if ((i2 & 8) != 0) {
                i = 1;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                str3 = "cefi";
            }
            return interfaceC31764mDa.AEQbTJ(str, str4, num2, i3, str3, (Continuation<? super AbstractC43419rot<CryptoListModelBean, OKServerException>>) continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mDa */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object getBanner$default(InterfaceC31764mDa interfaceC31764mDa, java.lang.String str, java.lang.Integer num, java.util.List list, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBanner");
            }
            if ((i & 1) != 0) {
                str = "FIRST_CACHE";
            }
            if ((i & 2) != 0) {
                num = 0;
            }
            if ((i & 4) != 0) {
                list = null;
            }
            return interfaceC31764mDa.copydefault(str, num, (java.util.List<java.lang.String>) list, (Continuation<? super AbstractC43419rot<GetBannerBean, OKServerException>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getCurrencyBalance$default(InterfaceC31764mDa interfaceC31764mDa, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrencyBalance");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC31764mDa.copydefault(str, str2, continuation);
        }

        public static /* synthetic */ java.lang.Object getChannelPaymentMethods$default(InterfaceC31764mDa interfaceC31764mDa, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str8, java.lang.Boolean bool, java.lang.String str9, java.lang.String str10, java.lang.Boolean bool2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31764mDa.copydefault((i & 1) != 0 ? BalanceAccountType.FUNDING.getValue() : str, (i & 2) != 0 ? "FIRST_CACHE" : str2, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? TradeType.BUY.getType() : str7, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : bool2, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChannelPaymentMethods");
        }

        public static /* synthetic */ java.lang.Object getFiatList$default(InterfaceC31764mDa interfaceC31764mDa, java.lang.String str, java.lang.String str2, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFiatList");
            }
            if ((i & 2) != 0) {
                str2 = "FIRST_CACHE";
            }
            if ((i & 4) != 0) {
                num = 900;
            }
            return interfaceC31764mDa.copydefault(str, str2, num, (Continuation<? super AbstractC43419rot<SupportCurrenciesBean, OKServerException>>) continuation);
        }

        public static /* synthetic */ java.lang.Object deletePaymentMethod$default(InterfaceC31764mDa interfaceC31764mDa, ChannelCategoryCode channelCategoryCode, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31764mDa.copydefault((i & 1) != 0 ? null : channelCategoryCode, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deletePaymentMethod");
        }

        public static /* synthetic */ java.lang.Object getDexQuote$default(InterfaceC31764mDa interfaceC31764mDa, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Integer num, int i, java.lang.String str7, boolean z, java.lang.String str8, java.lang.String str9, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31764mDa.OLrzqt(str, str2, str3, str4, str5, str6, (i2 & 64) != 0 ? null : num, i, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? null : str8, (i2 & 2048) != 0 ? null : str9, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDexQuote");
        }
    }
}
