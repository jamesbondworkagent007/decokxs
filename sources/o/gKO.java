package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.dex.api.bean.BridgeRedeemStatus;
import com.okinc.business.dex.api.bean.ChainInfo;
import com.okinc.business.dex.api.bean.ChainRequest;
import com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailResultVo;
import com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailVO;
import com.okinc.business.dex.api.bean.GasStationBean;
import com.okinc.business.dex.api.bean.OKDCoinDetailConfig;
import com.okinc.business.dex.api.bean.OKDSourceType;
import com.okinc.business.dex.api.bean.OrderListParams;
import com.okinc.business.dex.api.bean.SupportSwapCheck;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.api.bean.TradeDetails;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dex.api.bean.sa_small_assets.CheckRepeatParam;
import com.okinc.business.dex.api.bean.sa_small_assets.CheckRepeatResult;
import com.okinc.business.dex.api.bean.sa_small_assets.DustTokenQuoteParam;
import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetOrderParam;
import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetQuoteData;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface gKO extends InterfaceC43217rlC {
    java.lang.Object AEQbTJ(@NotNull DustTokenQuoteParam dustTokenQuoteParam, @NotNull Continuation<? super AbstractC43419rot<SmallAssetQuoteData, OKServerException>> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainInfo>, OKServerException>> continuation);

    void AEQbTJ(@NotNull android.app.Activity activity, @NotNull TradeDetails tradeDetails, @NotNull LifecycleOwner lifecycleOwner);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull TokenBase tokenBase);

    void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5);

    java.lang.String AYXKKw(@NotNull java.lang.String str);

    java.lang.String EZpvd(@NotNull java.lang.String str, int i, boolean z);

    void EZpvd(int i);

    void EZpvd(@NotNull android.app.Activity activity, @NotNull TradeDetails tradeDetails, @NotNull LifecycleOwner lifecycleOwner);

    void EZpvd(@NotNull android.content.Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull TradeParam tradeParam, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    void EZpvd(@NotNull android.content.Context context, @NotNull TokenBase tokenBase);

    void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull TradeParam tradeParam);

    void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, TokenBase tokenBase, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, Function0<Unit> function0);

    void EZpvd(@NotNull java.lang.String str, java.lang.String str2);

    void EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, int i, @NotNull java.lang.String str4, int i2);

    java.lang.Object KWHzl(@NotNull CheckRepeatParam checkRepeatParam, @NotNull Continuation<? super AbstractC43419rot<CheckRepeatResult, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull SmallAssetOrderParam smallAssetOrderParam, @NotNull Continuation<? super AbstractC43419rot<? extends JsonElement, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.String KWHzl(@NotNull java.lang.String str, boolean z, @NotNull RoundingMode roundingMode, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull DisplaySign displaySign, boolean z6);

    AbstractC58185ywX<SupportSwapCheck> KWHzl(@NotNull ChainRequest chainRequest);

    AbstractC58185ywX<ResponseData<DexMarketCheckCoinDetailResultVo>> KWHzl(@NotNull OKDSourceType oKDSourceType, @NotNull DexMarketCheckCoinDetailVO dexMarketCheckCoinDetailVO);

    AbstractC58185ywX<java.lang.Boolean> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i);

    void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i2, @NotNull java.lang.String str5);

    void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i2, @NotNull java.lang.String str5, @NotNull java.lang.String str6);

    void KWHzl(@NotNull InterfaceC19677gLf interfaceC19677gLf, InterfaceC19674gLc interfaceC19674gLc);

    void OLrzqt(@NotNull android.app.Activity activity, @NotNull OKDCoinDetailConfig oKDCoinDetailConfig);

    void OLrzqt(@NotNull android.content.Context context);

    void OLrzqt(@NotNull android.content.Context context, @NotNull OrderListParams orderListParams);

    void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, int i, java.lang.Integer num);

    void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull GasStationBean gasStationBean, int i);

    void OLrzqt(java.lang.String str, java.lang.String str2);

    void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    AbstractC58260yxt<java.lang.Boolean> aO_();

    java.lang.Object copydefault(@NotNull gKU gku, @NotNull Continuation<? super gKV> continuation);

    void copydefault(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    void copydefault(@NotNull android.content.Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull TradeParam tradeParam, @NotNull java.lang.String str, Function1<? super java.lang.Boolean, Unit> function1, int i, @NotNull Function1<? super gKW, Unit> function12);

    void copydefault(@NotNull android.content.Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull Function1<? super BridgeRedeemStatus, Unit> function1);

    void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, int i);

    boolean fARcdN();

    java.lang.String valueOf(@NotNull java.lang.String str);

    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.gKO */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void goToDexTrade$default(gKO gko, android.content.Context context, LifecycleOwner lifecycleOwner, TradeParam tradeParam, java.lang.String str, Function1 function1, int i, Function1 function12, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToDexTrade");
            }
            gko.copydefault(context, lifecycleOwner, tradeParam, str, (i2 & 16) != 0 ? null : function1, (i2 & 32) != 0 ? -1 : i, function12);
        }

        public static /* synthetic */ void openDexGeneralModule$default(gKO gko, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openDexGeneralModule");
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            if ((i & 8) != 0) {
                str3 = "";
            }
            gko.copydefault(activity, str, str2, str3);
        }

        public static /* synthetic */ void goToGasStation$default(gKO gko, androidx.fragment.app.FragmentManager fragmentManager, GasStationBean gasStationBean, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToGasStation");
            }
            if ((i2 & 4) != 0) {
                i = -1;
            }
            gko.OLrzqt(fragmentManager, gasStationBean, i);
        }

        public static /* synthetic */ void goToLimitOrderHistoryDetail$default(gKO gko, android.content.Context context, java.lang.String str, int i, java.lang.Integer num, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToLimitOrderHistoryDetail");
            }
            if ((i2 & 4) != 0) {
                i = 6;
            }
            if ((i2 & 8) != 0) {
                num = null;
            }
            gko.OLrzqt(context, str, i, num);
        }

        public static /* synthetic */ void getToDexHomeMemePage$default(gKO gko, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToDexHomeMemePage");
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                str3 = "";
            }
            gko.OLrzqt(str, str2, i3, str3, str4);
        }

        public static /* synthetic */ void getToDexHomeMemePage$default(gKO gko, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, int i2, java.lang.String str5, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToDexHomeMemePage");
            }
            gko.KWHzl(str, str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str3, str4, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str5);
        }

        public static /* synthetic */ void getToDexHomeMemePage$default(gKO gko, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, int i2, java.lang.String str5, java.lang.String str6, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToDexHomeMemePage");
            }
            gko.KWHzl(str, str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str3, str4, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? "" : str6);
        }

        public static /* synthetic */ void getToDexAdvancedPage$default(gKO gko, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4, int i2, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToDexAdvancedPage");
            }
            if ((i3 & 8) != 0) {
                i = 0;
            }
            int i4 = i;
            if ((i3 & 16) != 0) {
                str4 = "";
            }
            java.lang.String str5 = str4;
            if ((i3 & 32) != 0) {
                i2 = 1;
            }
            gko.EZpvd(str, str2, str3, i4, str5, i2);
        }

        public static /* synthetic */ void getToDexCopyTradeHome$default(gKO gko, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToDexCopyTradeHome");
            }
            if ((i2 & 1) != 0) {
                i = 0;
            }
            gko.EZpvd(i);
        }

        public static /* synthetic */ void getToDexCreateCopyTrade$default(gKO gko, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToDexCreateCopyTrade");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            gko.EZpvd(str, str2);
        }

        public static /* synthetic */ void getToDexMarketTab$default(gKO gko, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToDexMarketTab");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            gko.OLrzqt(str, str2);
        }

        public static /* synthetic */ void showGasStationDialog$default(gKO gko, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showGasStationDialog");
            }
            gko.KWHzl(fragmentManager, str, str2, str3, str4, str5, (i2 & 64) != 0 ? -1 : i);
        }

        public static /* synthetic */ void goToAddressTracker$default(gKO gko, android.content.Context context, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToAddressTracker");
            }
            if ((i2 & 4) != 0) {
                i = -1;
            }
            gko.copydefault(context, str, i);
        }

        public static /* synthetic */ java.lang.String dexFormatScientificCurrency$default(gKO gko, java.lang.String str, boolean z, RoundingMode roundingMode, boolean z2, boolean z3, boolean z4, boolean z5, DisplaySign displaySign, boolean z6, int i, java.lang.Object obj) {
            if (obj == null) {
                return gko.KWHzl(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? RoundingMode.HALF_UP : roundingMode, (i & 8) != 0 ? true : z2, (i & 16) == 0 ? z3 : true, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? false : z5, (i & 128) != 0 ? DisplaySign.AUTO : displaySign, (i & 256) == 0 ? z6 : false);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dexFormatScientificCurrency");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.gKO */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void openMemeQuickTransaction$default(gKO gko, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, TokenBase tokenBase, int i, java.lang.String str2, java.lang.String str3, Function0 function0, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openMemeQuickTransaction");
            }
            gko.EZpvd(fragmentManager, str, (i2 & 4) != 0 ? null : tokenBase, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "0" : str3, (i2 & 64) != 0 ? null : function0);
        }

        public static /* synthetic */ void initializeComplianceHandlers$default(gKO gko, InterfaceC19677gLf interfaceC19677gLf, InterfaceC19674gLc interfaceC19674gLc, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initializeComplianceHandlers");
            }
            if ((i & 2) != 0) {
                interfaceC19674gLc = null;
            }
            gko.KWHzl(interfaceC19677gLf, interfaceC19674gLc);
        }
    }
}
