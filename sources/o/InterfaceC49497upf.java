package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.biz.TradeType;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.tradeapi.bean.CurrencyModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FundingFeeDetailItem;
import com.okinc.unify_trade.biz.TokenBusinessData;
import com.okinc.unify_trade.biz.UserCurrencyListBalanceResp;
import com.okinc.unify_trade.header.CacheSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.upf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49497upf extends InterfaceC49424uoL {
    java.util.ArrayList<java.lang.String> AEQbTJ(BizInstrument bizInstrument, java.lang.String str, TradeType tradeType);

    xND AEQbTJ();

    void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull android.os.Bundle bundle);

    void AEQbTJ(FragmentActivity fragmentActivity, @NotNull CurrencyModel currencyModel, Function1<? super UserCurrencyListBalanceResp, Unit> function1);

    void AEQbTJ(@NotNull FragmentActivity fragmentActivity, java.util.ArrayList<java.lang.String> arrayList, @NotNull java.lang.String str, Function1<? super java.lang.Boolean, Unit> function1);

    java.lang.Boolean EZpvd();

    InterfaceC49437uoY EZpvd(@NotNull android.content.Context context, @NotNull Function0<Unit> function0);

    void EZpvd(@NotNull android.content.Context context);

    void EZpvd(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2);

    void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z, @NotNull java.lang.String str3, @NotNull Function0<Unit> function0, Function1<? super java.lang.String, Unit> function1);

    boolean EZpvd(BizInstrument bizInstrument, java.util.ArrayList<java.lang.String> arrayList, TradeType tradeType);

    java.lang.String KWHzl();

    InterfaceC49492upa KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull FundingFeeDetailItem fundingFeeDetailItem, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j);

    void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.lang.String OLrzqt(BizInstrument bizInstrument, TradeType tradeType);

    java.lang.String OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    kotlin.Pair<java.lang.Boolean, androidx.fragment.app.Fragment> OLrzqt(Function0<Unit> function0);

    void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str);

    void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    void OLrzqt(@NotNull FragmentActivity fragmentActivity, CurrencyModel currencyModel, boolean z);

    void OLrzqt(Function1<? super MarketArbCoinInfo, Unit> function1, Function1<? super java.lang.Boolean, Unit> function12, androidx.fragment.app.FragmentManager fragmentManager, boolean z);

    androidx.fragment.app.Fragment copydefault(java.lang.String str);

    java.lang.Object copydefault(@NotNull android.app.Application application, boolean z, boolean z2, boolean z3, CacheSource cacheSource, @NotNull Continuation<? super java.util.ArrayList<TokenBusinessData>> continuation);

    java.lang.String copydefault();

    InterfaceC49438uoZ copydefault(@NotNull android.content.Context context, @NotNull Function0<Unit> function0);

    void copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, @NotNull java.lang.String str6);

    /* JADX INFO: renamed from: o.upf$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ void openAllOptionsWithInstFamily$default(InterfaceC49497upf interfaceC49497upf, android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openAllOptionsWithInstFamily");
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            interfaceC49497upf.KWHzl(context, str, str2);
        }

        public static /* synthetic */ void openSimpleOptionPage$default(InterfaceC49497upf interfaceC49497upf, android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openSimpleOptionPage");
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            interfaceC49497upf.OLrzqt(context, str, str2);
        }

        public static /* synthetic */ java.lang.String getBizInstTitle$default(InterfaceC49497upf interfaceC49497upf, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBizInstTitle");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                str3 = "";
            }
            if ((i & 8) != 0) {
                str4 = "";
            }
            return interfaceC49497upf.OLrzqt(str, str2, str3, str4);
        }

        public static /* synthetic */ void goToDeposit$default(InterfaceC49497upf interfaceC49497upf, FragmentActivity fragmentActivity, CurrencyModel currencyModel, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToDeposit");
            }
            if ((i & 2) != 0) {
                currencyModel = null;
            }
            interfaceC49497upf.OLrzqt(fragmentActivity, currencyModel, z);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.upf */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ kotlin.Pair getOptionCopilotGuideFragment$default(InterfaceC49497upf interfaceC49497upf, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptionCopilotGuideFragment");
            }
            if ((i & 1) != 0) {
                function0 = null;
            }
            return interfaceC49497upf.OLrzqt(function0);
        }

        public static /* synthetic */ InterfaceC49492upa showSwapFundingFeeDetailDialogFragment$default(InterfaceC49497upf interfaceC49497upf, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, FundingFeeDetailItem fundingFeeDetailItem, java.lang.String str2, java.lang.String str3, long j, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC49497upf.KWHzl(fragmentManager, str, fundingFeeDetailItem, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? 0L : j);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSwapFundingFeeDetailDialogFragment");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.upf */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void openCollateralCoinFragment$default(InterfaceC49497upf interfaceC49497upf, FragmentActivity fragmentActivity, java.util.ArrayList arrayList, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openCollateralCoinFragment");
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            interfaceC49497upf.AEQbTJ(fragmentActivity, arrayList, str, function1);
        }

        public static /* synthetic */ java.util.ArrayList getCollateralCoinMarginList$default(InterfaceC49497upf interfaceC49497upf, BizInstrument bizInstrument, java.lang.String str, TradeType tradeType, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCollateralCoinMarginList");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return interfaceC49497upf.AEQbTJ(bizInstrument, str, tradeType);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.upf */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showArbitrageSearchDialog$default(InterfaceC49497upf interfaceC49497upf, Function1 function1, Function1 function12, androidx.fragment.app.FragmentManager fragmentManager, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showArbitrageSearchDialog");
            }
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            interfaceC49497upf.OLrzqt((Function1<? super MarketArbCoinInfo, Unit>) function1, (Function1<? super java.lang.Boolean, Unit>) function12, fragmentManager, z);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.upf */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void getMoreToolsFragment$default(InterfaceC49497upf interfaceC49497upf, java.lang.String str, java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, boolean z, java.lang.String str3, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMoreToolsFragment");
            }
            interfaceC49497upf.EZpvd(str, str2, fragmentManager, z, str3, function0, (i & 64) != 0 ? null : function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.upf */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showInsufficientSheetDelegate$default(InterfaceC49497upf interfaceC49497upf, FragmentActivity fragmentActivity, CurrencyModel currencyModel, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showInsufficientSheetDelegate");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            interfaceC49497upf.AEQbTJ(fragmentActivity, currencyModel, (Function1<? super UserCurrencyListBalanceResp, Unit>) function1);
        }

        public static /* synthetic */ androidx.fragment.app.Fragment getFundingFeeWith7Days$default(InterfaceC49497upf interfaceC49497upf, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFundingFeeWith7Days");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC49497upf.copydefault(str);
        }

        public static /* synthetic */ java.lang.Object getBusinessList$default(InterfaceC49497upf interfaceC49497upf, android.app.Application application, boolean z, boolean z2, boolean z3, CacheSource cacheSource, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC49497upf.copydefault(application, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? CacheSource.POPUP_WINDOW : cacheSource, (Continuation<? super java.util.ArrayList<TokenBusinessData>>) continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBusinessList");
        }
    }
}
