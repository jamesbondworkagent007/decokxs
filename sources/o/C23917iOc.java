package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.bean.CurrencyPrependSign;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.DuplicateOrder;
import com.okinc.business.defi.api.bean.DuplicateOrderReq;
import com.okinc.business.defi.api.bean.GasLimitBean;
import com.okinc.business.defi.api.bean.GasPriceBean;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.NewSignCallbackBean;
import com.okinc.business.defi.api.bean.OKWalletCloseTokenModel;
import com.okinc.business.defi.api.bean.OKWalletHiddenSmallAssetTokenModel;
import com.okinc.business.defi.api.bean.SimpleSubmitTxReq;
import com.okinc.business.defi.api.bean.SwitchNetworkInput;
import com.okinc.business.defi.api.bean.SwitchNetworkResult;
import com.okinc.business.defi.api.bean.UTXOConfirmBalanceReq;
import com.okinc.business.defi.api.bean.UTXOConfirmBalanceResp;
import com.okinc.business.defi.api.bean.UTXONFTListReq;
import com.okinc.business.defi.api.bean.UTXONFTListResp;
import com.okinc.business.defi.share.Web3ShareService;
import com.okinc.business.defi.share.bean.Web3ShareFooterInfo;
import com.okinc.business.defi.share.bean.Web3ShareModel;
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
import com.okinc.dapp.bean.DappSearchResultBean;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionDiffSet;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.modular.deeplinkv2.LinkSource;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareData;
import com.okinc.share.bean.ShareFooterInfo;
import com.okinc.share.platforms.SharePlatform;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.WalletDappInteractionBizService;
import com.okinc.wallet.api.WalletReferralSource;
import com.okinc.wallet.api.bean.CurrentWalletNotSupportedMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.DappSupportCheck;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.wallet.api.bean.SupportedNetworkType;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import com.okinc.wallet.api.bean.WalletBtcAddressBean;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.wallet.api.bean.WalletRechargeResult;
import com.okinc.wallet.api.bean.WalletScanInformationBean;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import com.okinc.wallet.api.bean.Web3ReferralCodeInfo;
import com.okinc.web.bean.WebShareInfo;
import com.okinc.web.web.IWebActivityAPI;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.serialization.json.JsonElement;
import o.InterfaceC49121uia;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.iOc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class C23917iOc implements InterfaceC23916iOb, Web3ShareService {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final InterfaceC43294rma AEQbTJ;
    public final OKComplianceRestrictionService AYXKKw;
    public final InterfaceC48893ueK AhwBna;
    public final InterfaceC9851bdQ AkhnZx;
    public final xWL AuCTel;
    public final InterfaceC9852bdR DbNXlk;
    public final gKO EZpvd;
    public final InterfaceC54828xWv KWHzl;
    public final InterfaceC54829xWw OLrzqt;
    public final MpcWalletService djBIcL;
    public final InterfaceC9857bdW ejfBZ;
    public final xWO fARcdN;
    public final xWX fIwbmz;
    public final xWS fJNWhG;
    public final xWK fetchVPNInfo;
    public final java.util.List<InterfaceC43217rlC> gEmmrt;
    public final Web3ShareService getFieldNames;
    public final InterfaceC9859bdY getNewProxyInstance;
    public final WalletDappInteractionBizService isConnected;
    public final InterfaceC46553tYp valueOf;
    public final InterfaceC9854bdT values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWL
    public java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super xWM> continuation) {
        return this.AuCTel.AEQbTJ(j, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public java.lang.Object AEQbTJ(@NotNull DustTokenQuoteParam dustTokenQuoteParam, @NotNull Continuation<? super AbstractC43419rot<SmallAssetQuoteData, OKServerException>> continuation) {
        return this.EZpvd.AEQbTJ(dustTokenQuoteParam, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainInfo>, OKServerException>> continuation) {
        return this.EZpvd.AEQbTJ(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return this.DbNXlk.AEQbTJ(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.DbNXlk.AEQbTJ(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9857bdW
    public java.lang.String AEQbTJ(@NotNull BigDecimal bigDecimal, int i, int i2, boolean z, @NotNull DisplaySign displaySign, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return this.ejfBZ.AEQbTJ(bigDecimal, i, i2, z, displaySign, roundingMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9857bdW
    public java.lang.String AEQbTJ(@NotNull BigDecimal bigDecimal, @NotNull CurrencyPrependSign currencyPrependSign, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return this.ejfBZ.AEQbTJ(bigDecimal, currencyPrependSign, roundingMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public InterfaceC9740bbL AEQbTJ() {
        return this.DbNXlk.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public ViewOnClickListenerC54939xaY AEQbTJ(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return this.AhwBna.AEQbTJ(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9854bdT
    public AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(@NotNull java.lang.String str, @NotNull SimpleSubmitTxReq simpleSubmitTxReq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(simpleSubmitTxReq, "");
        return this.values.AEQbTJ(str, simpleSubmitTxReq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public AbstractC58185ywX<C48887ueE> AEQbTJ(@NotNull java.lang.String str, @NotNull C48891ueI c48891ueI) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c48891ueI, "");
        return this.AhwBna.AEQbTJ(str, c48891ueI);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public AbstractC58185ywX<java.util.Map<java.lang.String, MpcWalletService.MpcWalletAbleStatus>> AEQbTJ(@NotNull java.util.List<? extends InterfaceC9738bbJ> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return this.djBIcL.AEQbTJ(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public AbstractC58260yxt<java.util.List<OKWalletCloseTokenModel>> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.DbNXlk.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void AEQbTJ(@NotNull android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt.AEQbTJ(activity, bundle, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void AEQbTJ(@NotNull android.app.Activity activity, @NotNull TradeDetails tradeDetails, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(tradeDetails, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.EZpvd.AEQbTJ(activity, tradeDetails, lifecycleOwner);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54828xWv
    public void AEQbTJ(@NotNull android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.Long l, Function0<Unit> function0, java.util.List<java.lang.Integer> list, @NotNull java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl.AEQbTJ(activity, str, str2, l, function0, list, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46553tYp
    public void AEQbTJ(@NotNull android.content.Context context, int i, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf.AEQbTJ(context, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        this.OLrzqt.AEQbTJ(context, activityResultLauncher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9854bdT
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.values.AEQbTJ(context, dappInteractionArgs, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9854bdT
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function13) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.values.AEQbTJ(context, dappInteractionArgs, function1, function12, function13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        this.EZpvd.AEQbTJ(context, tokenBase);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43294rma
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull LinkSource linkSource, boolean z, @NotNull Function1<? super AbstractC43238rlX, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(linkSource, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.AEQbTJ(context, str, map, linkSource, z, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.EZpvd.AEQbTJ(fragmentActivity, str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        this.OLrzqt.AEQbTJ(fragmentManager, walletTxDetailBean, yho);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC54859xXz interfaceC54859xXz, InterfaceC54856xXw interfaceC54856xXw) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC54859xXz, "");
        this.fARcdN.AEQbTJ(fragmentManager, str, str2, interfaceC54859xXz, interfaceC54856xXw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9851bdQ
    public void AEQbTJ(MutableLiveData<java.lang.Integer> mutableLiveData) {
        this.AkhnZx.AEQbTJ(mutableLiveData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        this.DbNXlk.AEQbTJ(str, str2, str3, valueCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public void AEQbTJ(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL.AEQbTJ(function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public void AEQbTJ(@NotNull CoroutineScope coroutineScope, @NotNull OKComplianceRestrictionService.UserEvent userEvent, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(userEvent, "");
        this.AYXKKw.AEQbTJ(coroutineScope, userEvent, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public void AEQbTJ(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL.AEQbTJ(interfaceC9738bbJ, fragmentActivity, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWS
    public void AEQbTJ(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.fJNWhG.AEQbTJ(abstractActivityC33041mov, str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54828xWv
    public void AEQbTJ(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, java.util.List<? extends java.lang.Object> list, java.lang.String str, java.lang.Long l, java.lang.String str2, java.util.List<java.lang.String> list2, java.lang.Boolean bool, boolean z, boolean z2, boolean z3, java.util.List<java.lang.Integer> list3, Function2<? super java.lang.Long, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.KWHzl.AEQbTJ(abstractActivityC33041mov, list, str, l, str2, list2, bool, z, z2, z3, list3, function2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46553tYp
    public void AEQbTJ(@NotNull InterfaceC46547tYj interfaceC46547tYj) {
        Intrinsics.checkNotNullParameter(interfaceC46547tYj, "");
        this.valueOf.AEQbTJ(interfaceC46547tYj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public void AEQbTJ(@NotNull InterfaceC49001ugM interfaceC49001ugM) {
        Intrinsics.checkNotNullParameter(interfaceC49001ugM, "");
        this.AhwBna.AEQbTJ(interfaceC49001ugM);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public void AEQbTJ(boolean z, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AhwBna.AEQbTJ(z, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public boolean AEQbTJ(@NotNull OKComplianceRestrictionService.CefiMode cefiMode) {
        Intrinsics.checkNotNullParameter(cefiMode, "");
        return this.AYXKKw.AEQbTJ(cefiMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public boolean AEQbTJ(@NotNull OKComplianceRestrictionService.Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "");
        return this.AYXKKw.AEQbTJ(feature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public boolean AEQbTJ(@NotNull SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        return this.AhwBna.AEQbTJ(sharePlatform);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public java.lang.String AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.AYXKKw(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<Unit> AYXKKw() {
        return this.DbNXlk.AYXKKw();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public InterfaceC9739bbK AhwBna() {
        return this.DbNXlk.AhwBna();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9859bdY
    public AbstractC58185ywX<C9917bed> AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.getNewProxyInstance.AhwBna(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9851bdQ
    public MutableLiveData<java.lang.Boolean> AkhnZx() {
        return this.AkhnZx.AkhnZx();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43294rma
    public boolean AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.AkhnZx(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public java.util.List<java.lang.String> AuCTel() {
        return this.AYXKKw.AuCTel();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public java.lang.String AuCTelauCTel() {
        return this.AYXKKw.AuCTelauCTel();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public java.lang.String AubY() {
        return this.AhwBna.AubY();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public JsonObject AwvSrB() {
        return this.AYXKKw.AwvSrB();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public SharedFlow<Unit> AxsJAY() {
        return this.AYXKKw.AxsJAY();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public InterfaceC49000ugL DTwDnp() {
        return this.AhwBna.DTwDnp();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9851bdQ
    public LiveData<java.lang.Boolean> DbNXlk() {
        return this.AkhnZx.DbNXlk();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public int EZpvd(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.fARcdN.EZpvd(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public android.view.View EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        return this.fARcdN.EZpvd(abstractActivityC33041mov);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public FeatureRestrictionInfo EZpvd(@NotNull OKComplianceRestrictionService.Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "");
        return this.AYXKKw.EZpvd(feature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43294rma
    public java.lang.Object EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43238rlX> continuation) {
        return this.AEQbTJ.EZpvd(context, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9854bdT
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation) {
        return this.values.EZpvd(str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public java.lang.Object EZpvd(@NotNull Continuation<? super Web3ReferralCodeInfo> continuation) {
        return this.fARcdN.EZpvd(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public java.lang.String EZpvd(@NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, @NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return this.djBIcL.EZpvd(mpcWalletAbleStatus, interfaceC9738bbJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public java.lang.String EZpvd(@NotNull java.lang.String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.EZpvd(str, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43294rma
    public java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return this.AEQbTJ.EZpvd(str, map, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9857bdW
    public java.lang.String EZpvd(@NotNull BigDecimal bigDecimal, int i, int i2, @NotNull DisplaySign displaySign, @NotNull CurrencyDisplayStyle currencyDisplayStyle, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return this.ejfBZ.EZpvd(bigDecimal, i, i2, displaySign, currencyDisplayStyle, roundingMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9857bdW
    public java.lang.String EZpvd(@NotNull BigDecimal bigDecimal, int i, int i2, @NotNull java.lang.String str, @NotNull DisplaySign displaySign, @NotNull RoundingMode roundingMode, java.lang.Boolean bool, boolean z) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return this.ejfBZ.EZpvd(bigDecimal, i, i2, str, displaySign, roundingMode, bool, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public InterfaceC9732bbD EZpvd() {
        return this.DbNXlk.EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public <T extends AbstractActivityC33041mov> InterfaceC48892ueJ EZpvd(@NotNull T t, @NotNull MultiShareConfig multiShareConfig, InterfaceC49097uiC interfaceC49097uiC) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(multiShareConfig, "");
        return this.AhwBna.EZpvd(t, multiShareConfig, interfaceC49097uiC);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.WalletDappInteractionBizService
    public AbstractC58185ywX<ResponseData<xWF>> EZpvd(@NotNull android.content.Context context, int i, @NotNull DappInteractionArgs dappInteractionArgs, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        return this.isConnected.EZpvd(context, i, dappInteractionArgs, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.WalletDappInteractionBizService
    public AbstractC58185ywX<WalletDappInteractionBizService.SubmitResult> EZpvd(@NotNull DappInteractionArgs dappInteractionArgs) {
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        return this.isConnected.EZpvd(dappInteractionArgs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9854bdT
    public AbstractC58185ywX<DuplicateOrder> EZpvd(@NotNull DuplicateOrderReq duplicateOrderReq) {
        Intrinsics.checkNotNullParameter(duplicateOrderReq, "");
        return this.values.EZpvd(duplicateOrderReq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void EZpvd(int i) {
        this.EZpvd.EZpvd(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public void EZpvd(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AhwBna.EZpvd(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void EZpvd(@NotNull android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt.EZpvd(activity, bundle, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void EZpvd(@NotNull android.app.Activity activity, @NotNull TradeDetails tradeDetails, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(tradeDetails, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.EZpvd.EZpvd(activity, tradeDetails, lifecycleOwner);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54828xWv
    public void EZpvd(@NotNull android.app.Activity activity, java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl.EZpvd(activity, str, str2, str3, fragmentManager, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.WalletDappInteractionBizService
    public void EZpvd(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.Integer num, java.lang.Long l, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.isConnected.EZpvd(activity, str, str2, str3, str4, num, l, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void EZpvd(@NotNull android.content.Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull TradeParam tradeParam, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(tradeParam, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd.EZpvd(context, lifecycleOwner, tradeParam, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9854bdT
    public void EZpvd(@NotNull android.content.Context context, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function13) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.values.EZpvd(context, dappInteractionArgs, function1, function12, function13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9854bdT
    public void EZpvd(@NotNull android.content.Context context, @NotNull DappSignArgs dappSignArgs, Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappSignArgs, "");
        this.values.EZpvd(context, dappSignArgs, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void EZpvd(@NotNull android.content.Context context, @NotNull TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        this.EZpvd.EZpvd(context, tokenBase);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull TradeParam tradeParam) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tradeParam, "");
        this.EZpvd.EZpvd(context, str, tradeParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9854bdT
    public void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z, boolean z2, java.lang.String str2, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.values.EZpvd(context, str, z, z2, str2, function2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWS
    public void EZpvd(@NotNull android.content.Context context, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "");
        this.fJNWhG.EZpvd(context, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull android.content.Context context, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.fARcdN.EZpvd(fragmentManager, context, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWX
    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull CurrentWalletSwitchConfig currentWalletSwitchConfig, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> function2, @NotNull java.util.List<? extends UnsupportedWalletType> list, @NotNull InterfaceC54855xXv interfaceC54855xXv) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(currentWalletSwitchConfig, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC54855xXv, "");
        this.fIwbmz.EZpvd(fragmentManager, currentWalletSwitchConfig, function2, list, interfaceC54855xXv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, TokenBase tokenBase, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.EZpvd.EZpvd(fragmentManager, str, tokenBase, i, str2, str3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC54859xXz interfaceC54859xXz, java.util.List<SupportedNetworkType> list, @NotNull java.util.List<? extends UnsupportedWalletType> list2, InterfaceC54856xXw interfaceC54856xXw) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC54859xXz, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.fARcdN.EZpvd(fragmentManager, interfaceC54859xXz, list, list2, interfaceC54856xXw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fARcdN.EZpvd(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, int i, @NotNull java.lang.String str4, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.EZpvd.EZpvd(str, str2, str3, i, str4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public void EZpvd(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.fARcdN.EZpvd(str, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public void EZpvd(@NotNull CoroutineScope coroutineScope, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.AYXKKw.EZpvd(coroutineScope, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public void EZpvd(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL.EZpvd(interfaceC9738bbJ, fragmentActivity, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWS
    public void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        this.fJNWhG.EZpvd(abstractActivityC33041mov, fragmentManager, interfaceC9738bbJ, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull WalletRechargeBean walletRechargeBean, int i, Function1<? super WalletRechargeResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(walletRechargeBean, "");
        this.OLrzqt.EZpvd(abstractActivityC33041mov, walletRechargeBean, i, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, IWebActivityAPI iWebActivityAPI, WebShareInfo webShareInfo) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.AhwBna.EZpvd(abstractActivityC33041mov, iWebActivityAPI, webShareInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public void EZpvd(@NotNull InterfaceC49121uia interfaceC49121uia) {
        Intrinsics.checkNotNullParameter(interfaceC49121uia, "");
        this.AhwBna.EZpvd(interfaceC49121uia);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public ISharePreviewConfig KWHzl(@NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(iShareParams, "");
        return this.AhwBna.KWHzl(iShareParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public SharePlatform KWHzl(int i) {
        return this.AhwBna.KWHzl(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public java.lang.Object KWHzl(@NotNull CheckRepeatParam checkRepeatParam, @NotNull Continuation<? super AbstractC43419rot<CheckRepeatResult, OKServerException>> continuation) {
        return this.EZpvd.KWHzl(checkRepeatParam, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public java.lang.Object KWHzl(@NotNull SmallAssetOrderParam smallAssetOrderParam, @NotNull Continuation<? super AbstractC43419rot<? extends JsonElement, OKServerException>> continuation) {
        return this.EZpvd.KWHzl(smallAssetOrderParam, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9854bdT
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.String> continuation) {
        return this.values.KWHzl(str, str2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9854bdT
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.lang.String> continuation) {
        return this.values.KWHzl(str, list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.EZpvd.KWHzl(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public java.lang.String KWHzl(@NotNull java.lang.String str, boolean z, @NotNull RoundingMode roundingMode, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull DisplaySign displaySign, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        return this.EZpvd.KWHzl(str, z, roundingMode, z2, z3, z4, z5, displaySign, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public InterfaceC9733bbE KWHzl() {
        return this.DbNXlk.KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public InterfaceC48895ueM KWHzl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "");
        return this.AhwBna.KWHzl(context, attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9859bdY
    public C57567ykp KWHzl(boolean z) {
        return this.getNewProxyInstance.KWHzl(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<ResponseData<GasPriceBean>> KWHzl(long j) {
        return this.DbNXlk.KWHzl(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public AbstractC58185ywX<SupportSwapCheck> KWHzl(@NotNull ChainRequest chainRequest) {
        Intrinsics.checkNotNullParameter(chainRequest, "");
        return this.EZpvd.KWHzl(chainRequest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public AbstractC58185ywX<ResponseData<DexMarketCheckCoinDetailResultVo>> KWHzl(@NotNull OKDSourceType oKDSourceType, @NotNull DexMarketCheckCoinDetailVO dexMarketCheckCoinDetailVO) {
        Intrinsics.checkNotNullParameter(oKDSourceType, "");
        Intrinsics.checkNotNullParameter(dexMarketCheckCoinDetailVO, "");
        return this.EZpvd.KWHzl(oKDSourceType, dexMarketCheckCoinDetailVO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<Unit> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.DbNXlk.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public AbstractC58185ywX<java.lang.Boolean> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.EZpvd.KWHzl(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<ResponseData<GasLimitBean>> KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.Long l, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return this.DbNXlk.KWHzl(str, str2, str3, l, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public JSONObject KWHzl(@NotNull java.util.ArrayList<java.lang.String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return this.AYXKKw.KWHzl(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void KWHzl(@NotNull android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt.KWHzl(activity, bundle, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9854bdT
    public void KWHzl(@NotNull android.app.Activity activity, @NotNull SwitchNetworkInput switchNetworkInput, @NotNull Function1<? super SwitchNetworkResult, Unit> function1, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(switchNetworkInput, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.values.KWHzl(activity, switchNetworkInput, function1, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public void KWHzl(@NotNull android.app.Activity activity, @NotNull IShareParams iShareParams, @NotNull SharePlatform sharePlatform, InterfaceC49121uia.Activity activity2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        this.AhwBna.KWHzl(activity, iShareParams, sharePlatform, activity2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54828xWv
    public void KWHzl(@NotNull android.app.Activity activity, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.Long l, Function0<Unit> function0, java.util.List<java.lang.Integer> list, @NotNull java.lang.String str5, java.lang.String str6, @NotNull androidx.fragment.app.FragmentManager fragmentManager, int i, java.lang.String str7) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.KWHzl.KWHzl(activity, str, str2, str3, str4, l, function0, list, str5, str6, fragmentManager, i, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void KWHzl(@NotNull android.content.Context context, long j, @NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager, Function1<? super android.os.Bundle, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.OLrzqt.KWHzl(context, j, str, fragmentManager, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void KWHzl(@NotNull android.content.Context context, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        this.OLrzqt.KWHzl(context, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void KWHzl(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.OLrzqt.KWHzl(context, fragmentManager);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9854bdT
    public void KWHzl(@NotNull android.content.Context context, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function13) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.values.KWHzl(context, dappInteractionArgs, function1, function12, function13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd.KWHzl(context, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43294rma
    public void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull Function1<? super AbstractC43238rlX, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.KWHzl(context, str, map, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWS
    public void KWHzl(@NotNull android.content.Context context, boolean z, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        this.fJNWhG.KWHzl(context, z, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWS
    public void KWHzl(@NotNull android.content.Context context, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "");
        this.fJNWhG.KWHzl(context, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public void KWHzl(@NotNull androidx.fragment.app.Fragment fragment, @NotNull InterfaceC48970ufi interfaceC48970ufi) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(interfaceC48970ufi, "");
        this.AhwBna.KWHzl(fragment, interfaceC48970ufi);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        this.OLrzqt.KWHzl(fragmentManager, walletTxDetailBean, yho);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.EZpvd.KWHzl(fragmentManager, str, str2, str3, str4, str5, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9851bdQ
    public void KWHzl(MutableLiveData<java.lang.Boolean> mutableLiveData) {
        this.AkhnZx.KWHzl(mutableLiveData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public void KWHzl(@NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL.KWHzl(mpcWalletAbleStatus, interfaceC9738bbJ, fragmentActivity, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i2, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.EZpvd.KWHzl(str, str2, i, str3, str4, i2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i2, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.EZpvd.KWHzl(str, str2, i, str3, str4, i2, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public void KWHzl(@NotNull java.util.List<? extends InterfaceC9738bbJ> list, @NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super java.util.Map<java.lang.String, ? extends MpcWalletService.MpcWalletAbleStatus>, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL.KWHzl(list, fragmentActivity, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public void KWHzl(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL.KWHzl(function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public void KWHzl(@NotNull CoroutineScope coroutineScope, java.lang.Boolean bool, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.AYXKKw.KWHzl(coroutineScope, bool, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public void KWHzl(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL.KWHzl(interfaceC9738bbJ, fragmentActivity, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void KWHzl(@NotNull InterfaceC19677gLf interfaceC19677gLf, InterfaceC19674gLc interfaceC19674gLc) {
        Intrinsics.checkNotNullParameter(interfaceC19677gLf, "");
        this.EZpvd.KWHzl(interfaceC19677gLf, interfaceC19674gLc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public int OLrzqt(int i) {
        return this.fARcdN.OLrzqt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public OKWalletHiddenSmallAssetTokenModel OLrzqt() {
        return this.DbNXlk.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43294rma
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.AEQbTJ.OLrzqt(str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return this.DbNXlk.OLrzqt(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9857bdW
    public java.lang.String OLrzqt(@NotNull BigDecimal bigDecimal, boolean z, @NotNull CurrencyPrependSign currencyPrependSign, @NotNull CurrencyDisplayStyle currencyDisplayStyle) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        return this.ejfBZ.OLrzqt(bigDecimal, z, currencyPrependSign, currencyDisplayStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public <T extends AbstractActivityC33041mov> InterfaceC48892ueJ OLrzqt(@NotNull T t, @NotNull MultiShareConfig multiShareConfig) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(multiShareConfig, "");
        return this.AhwBna.OLrzqt(t, multiShareConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public <T extends AbstractActivityC33041mov> InterfaceC48892ueJ OLrzqt(@NotNull T t, @NotNull ShareConfig shareConfig, InterfaceC49097uiC interfaceC49097uiC) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(shareConfig, "");
        return this.AhwBna.OLrzqt(t, shareConfig, interfaceC49097uiC);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public AbstractC49065uhX OLrzqt(@NotNull ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        return this.AhwBna.OLrzqt(shareConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9854bdT
    public AbstractC58185ywX<ResponseData<UTXOConfirmBalanceResp>> OLrzqt(@NotNull UTXOConfirmBalanceReq uTXOConfirmBalanceReq) {
        Intrinsics.checkNotNullParameter(uTXOConfirmBalanceReq, "");
        return this.values.OLrzqt(uTXOConfirmBalanceReq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9854bdT
    public AbstractC58185ywX<ResponseData<UTXONFTListResp>> OLrzqt(@NotNull UTXONFTListReq uTXONFTListReq) {
        Intrinsics.checkNotNullParameter(uTXONFTListReq, "");
        return this.values.OLrzqt(uTXONFTListReq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<ResponseData<GasPriceBean>> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.DbNXlk.OLrzqt(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<Unit> OLrzqt(@NotNull java.lang.String str, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.DbNXlk.OLrzqt(str, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void OLrzqt(@NotNull android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt.OLrzqt(activity, bundle, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void OLrzqt(@NotNull android.app.Activity activity, @NotNull OKDCoinDetailConfig oKDCoinDetailConfig) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(oKDCoinDetailConfig, "");
        this.EZpvd.OLrzqt(activity, oKDCoinDetailConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54828xWv
    public void OLrzqt(@NotNull android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.Long l, Function0<Unit> function0, java.util.List<java.lang.Integer> list, java.lang.Boolean bool, @NotNull java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl.OLrzqt(activity, str, str2, l, function0, list, bool, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd.OLrzqt(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void OLrzqt(@NotNull android.content.Context context, @NotNull OrderListParams orderListParams) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(orderListParams, "");
        this.EZpvd.OLrzqt(context, orderListParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, int i, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.OLrzqt(context, str, i, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9854bdT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull java.util.List<DappInteractionArgs> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.values.OLrzqt(context, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull GasStationBean gasStationBean, int i) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(gasStationBean, "");
        this.EZpvd.OLrzqt(fragmentManager, gasStationBean, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWX
    public void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull CurrentWalletNotSupportedMode currentWalletNotSupportedMode, @NotNull CurrentWalletSwitchConfig currentWalletSwitchConfig, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> function2, @NotNull java.util.List<? extends UnsupportedWalletType> list, @NotNull InterfaceC54855xXv interfaceC54855xXv) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(currentWalletNotSupportedMode, "");
        Intrinsics.checkNotNullParameter(currentWalletSwitchConfig, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC54855xXv, "");
        this.fIwbmz.OLrzqt(fragmentManager, currentWalletNotSupportedMode, currentWalletSwitchConfig, function2, list, interfaceC54855xXv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C6810aWR c6810aWR, @NotNull InterfaceC54850xXq interfaceC54850xXq) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(c6810aWR, "");
        Intrinsics.checkNotNullParameter(interfaceC54850xXq, "");
        this.OLrzqt.OLrzqt(fragmentManager, c6810aWR, interfaceC54850xXq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void OLrzqt(java.lang.String str, java.lang.String str2) {
        this.EZpvd.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.EZpvd.OLrzqt(str, str2, i, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public void OLrzqt(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL.OLrzqt(interfaceC9738bbJ, fragmentActivity, z, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWS
    public void OLrzqt(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.fJNWhG.OLrzqt(abstractActivityC33041mov, fragmentManager, str, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWS
    public void OLrzqt(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, long j, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.fJNWhG.OLrzqt(abstractActivityC33041mov, str, j, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public void OLrzqt(@NotNull InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        Intrinsics.checkNotNullParameter(interfaceC48969ufh, "");
        this.AhwBna.OLrzqt(interfaceC48969ufh);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public boolean OLrzqt(@NotNull OKComplianceRestrictionService.AppMode appMode) {
        Intrinsics.checkNotNullParameter(appMode, "");
        return this.AYXKKw.OLrzqt(appMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public boolean OLrzqt(@NotNull OKComplianceRestrictionService.Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "");
        return this.AYXKKw.OLrzqt(feature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public ShareFooterInfo ORxRYg() {
        return this.AhwBna.ORxRYg();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46553tYp
    public int OcIXYQ() {
        return this.valueOf.OcIXYQ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46553tYp
    public int QKVWgx() {
        return this.valueOf.QKVWgx();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46553tYp
    public java.util.ArrayList<ValuationCurrencyBean> QOLQEE() {
        return this.valueOf.QOLQEE();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46553tYp
    public java.lang.String QUSxYX() {
        return this.valueOf.QUSxYX();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46553tYp
    public java.lang.String QVAiDq() {
        return this.valueOf.QVAiDq();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46553tYp
    public double QbewEr() {
        return this.valueOf.QbewEr();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46553tYp
    public int QfsBiF() {
        return this.valueOf.QfsBiF();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46553tYp
    public java.lang.String RJOkX() {
        return this.valueOf.RJOkX();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public void RcXXUw() {
        this.AYXKKw.RcXXUw();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public boolean UeEOUB() {
        return this.AhwBna.UeEOUB();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public AbstractC58260yxt<java.lang.Boolean> aJ_() {
        return this.fARcdN.aJ_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public boolean aKErDB() {
        return this.AhwBna.aKErDB();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public int aK_() {
        return this.fARcdN.aK_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public int aL_() {
        return this.fARcdN.aL_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public java.util.Map<java.lang.String, java.lang.String> aM_() {
        return this.fARcdN.aM_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public AbstractC58260yxt<java.lang.Boolean> aN_() {
        return this.fARcdN.aN_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54828xWv
    public AbstractC58260yxt<java.util.List<DappSearchResultBean>> aP_() {
        return this.KWHzl.aP_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public Function1<java.lang.Boolean, Unit> aQ_() {
        return this.djBIcL.aQ_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public Function1<java.lang.Boolean, Unit> aR_() {
        return this.djBIcL.aR_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public Function1<java.lang.Boolean, Unit> aS_() {
        return this.djBIcL.aS_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWS
    public Function0<Unit> aT_() {
        return this.fJNWhG.aT_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public MpcWalletService.MpcWalletAbleStatus copydefault(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return this.djBIcL.copydefault(interfaceC9738bbJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.AYXKKw.copydefault(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public java.lang.Object copydefault(@NotNull gKU gku, @NotNull Continuation<? super gKV> continuation) {
        return this.EZpvd.copydefault(gku, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.DbNXlk.copydefault(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9857bdW
    public java.lang.String copydefault(@NotNull BigDecimal bigDecimal, @NotNull CurrencyPrependSign currencyPrependSign, @NotNull CurrencyDisplayStyle currencyDisplayStyle, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return this.ejfBZ.copydefault(bigDecimal, currencyPrependSign, currencyDisplayStyle, roundingMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public InterfaceC9737bbI copydefault() {
        return this.DbNXlk.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public <T extends AbstractActivityC33041mov> InterfaceC48892ueJ copydefault(@NotNull T t, @NotNull ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(shareConfig, "");
        return this.AhwBna.copydefault(t, shareConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public InterfaceC48901ueS copydefault(java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, java.lang.Integer num, java.lang.Float f, boolean z) {
        return this.AhwBna.copydefault(charSequence, drawable, num, f, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public InterfaceC49121uia copydefault(@NotNull SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        return this.AhwBna.copydefault(sharePlatform);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.WalletDappInteractionBizService
    public AbstractC58185ywX<java.util.List<WalletBtcAddressBean>> copydefault(@NotNull java.lang.String str, long j, java.lang.Integer num, java.lang.Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.isConnected.copydefault(str, j, num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<Unit> copydefault(@NotNull java.util.List<java.lang.Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return this.DbNXlk.copydefault(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void copydefault(long j, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt.copydefault(j, fragmentManager, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void copydefault(@NotNull android.app.Activity activity, long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.copydefault(activity, j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void copydefault(@NotNull android.app.Activity activity, @NotNull EnterWalletMainBean enterWalletMainBean) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(enterWalletMainBean, "");
        this.OLrzqt.copydefault(activity, enterWalletMainBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54828xWv
    public void copydefault(@NotNull android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.Long l, Function0<Unit> function0, java.util.List<java.lang.Integer> list, @NotNull java.lang.String str3, java.lang.String str4, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl.copydefault(activity, str, str2, l, function0, list, str3, str4, fragmentManager, num, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void copydefault(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.EZpvd.copydefault(activity, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54828xWv
    public void copydefault(@NotNull android.app.Activity activity, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.Long l, Function0<Unit> function0, java.util.List<java.lang.Integer> list, @NotNull java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.KWHzl.copydefault(activity, str, str2, str3, str4, l, function0, list, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.fARcdN.copydefault(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void copydefault(@NotNull android.content.Context context, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        this.OLrzqt.copydefault(context, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void copydefault(@NotNull android.content.Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull TradeParam tradeParam, @NotNull java.lang.String str, Function1<? super java.lang.Boolean, Unit> function1, int i, @NotNull Function1<? super gKW, Unit> function12) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(tradeParam, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.EZpvd.copydefault(context, lifecycleOwner, tradeParam, str, function1, i, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void copydefault(@NotNull android.content.Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull Function1<? super BridgeRedeemStatus, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd.copydefault(context, lifecycleOwner, str, str2, z, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.copydefault(context, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWX
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.fIwbmz.copydefault(fragmentManager);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        this.OLrzqt.copydefault(fragmentManager, walletTxDetailBean, yho);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C54836xXc c54836xXc, @NotNull InterfaceC54859xXz interfaceC54859xXz, InterfaceC54856xXw interfaceC54856xXw, InterfaceC54852xXs interfaceC54852xXs) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(c54836xXc, "");
        Intrinsics.checkNotNullParameter(interfaceC54859xXz, "");
        this.fARcdN.copydefault(fragmentManager, c54836xXc, interfaceC54859xXz, interfaceC54856xXw, interfaceC54852xXs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public void copydefault(IWebActivityAPI iWebActivityAPI, WebShareInfo webShareInfo) {
        this.AhwBna.copydefault(iWebActivityAPI, webShareInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public void copydefault(@NotNull java.lang.String str, @NotNull InterfaceC49002ugN interfaceC49002ugN) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC49002ugN, "");
        this.AhwBna.copydefault(str, interfaceC49002ugN);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46553tYp
    public void copydefault(@NotNull java.util.ArrayList<ValuationCurrencyBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.valueOf.copydefault(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public void copydefault(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL.copydefault(function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public void copydefault(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super MpcWalletService.MpcWalletAbleStatus, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL.copydefault(interfaceC9738bbJ, fragmentActivity, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, Function1<? super WalletRechargeResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.OLrzqt.copydefault(abstractActivityC33041mov, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.WalletDappInteractionBizService
    public boolean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.isConnected.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public boolean dNCPSb() {
        return this.AYXKKw.dNCPSb();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.share.Web3ShareService
    public void destroyShareMLNInstance() {
        this.getFieldNames.destroyShareMLNInstance();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public java.lang.String djBIcL() {
        return this.DbNXlk.djBIcL();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9859bdY
    public AbstractC58185ywX<java.util.List<C9922bei>> djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.getNewProxyInstance.djBIcL(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public boolean djSkpj() {
        return this.AYXKKw.djSkpj();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public java.util.List<java.lang.String> ejfBZ() {
        return this.AYXKKw.ejfBZ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public boolean fARcdN() {
        return this.EZpvd.fARcdN();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public java.util.List<java.lang.String> fIwbmz() {
        return this.AYXKKw.fIwbmz();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46553tYp
    public void fJNWhG() {
        this.valueOf.fJNWhG();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public boolean fZBcTu() {
        return this.AhwBna.fZBcTu();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public java.lang.String f_(java.lang.String str) {
        return this.fARcdN.f_(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43294rma
    public java.util.Map<java.lang.String, java.lang.Object> fetchVPNInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.fetchVPNInfo(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9851bdQ
    public boolean fetchVPNInfo() {
        return this.AkhnZx.fetchVPNInfo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public InterfaceC9741bbM gEmmrt() {
        return this.DbNXlk.gEmmrt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9859bdY
    public AbstractC58185ywX<C9921beh> gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.getNewProxyInstance.gEmmrt(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public SharedFlow<FeatureRestrictionDiffSet> gHZMYf() {
        return this.AYXKKw.gHZMYf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xWO
    public AbstractC58185ywX<java.lang.String> g_(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.fARcdN.g_(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public void getFieldNames() {
        this.AYXKKw.getFieldNames();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public java.util.List<java.lang.String> getNewProxyInstance() {
        return this.AYXKKw.getNewProxyInstance();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.share.Web3ShareService
    public Web3ShareFooterInfo getWeb3CommonFooterInfo() {
        return this.getFieldNames.getWeb3CommonFooterInfo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public java.lang.String hDKMBd() {
        return this.AYXKKw.hDKMBd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54829xWw
    public WalletScanInformationBean h_(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.OLrzqt.h_(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9859bdY
    public AbstractC58185ywX<C9860bdZ> i_(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.getNewProxyInstance.i_(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9859bdY
    public AbstractC58185ywX<java.lang.Boolean> isConnected() {
        return this.getNewProxyInstance.isConnected();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public java.lang.String iwGUEr() {
        return this.AhwBna.iwGUEr();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.MpcWalletService
    public AbstractC58185ywX<DappSupportCheck> j_(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.djBIcL.j_(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public java.lang.CharSequence sSMYrx() {
        return this.AhwBna.sSMYrx();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.share.Web3ShareService
    public void share(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Web3ShareModel web3ShareModel, InterfaceC13655dTj interfaceC13655dTj) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(web3ShareModel, "");
        this.getFieldNames.share(abstractActivityC33041mov, web3ShareModel, interfaceC13655dTj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.share.Web3ShareService
    public void shareByMiniProgram(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, InterfaceC13655dTj interfaceC13655dTj, WalletReferralSource walletReferralSource) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.getFieldNames.shareByMiniProgram(fragment, str, str2, i, str3, str4, str5, str6, interfaceC13655dTj, walletReferralSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.share.Web3ShareService
    public void shareByMiniProgramActivity(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, InterfaceC13655dTj interfaceC13655dTj) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.getFieldNames.shareByMiniProgramActivity(activity, str, str2, i, str3, str4, str5, str6, interfaceC13655dTj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public boolean uzCIH() {
        return this.AhwBna.uzCIH();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public java.lang.String valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.valueOf(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<Unit> valueOf() {
        return this.DbNXlk.valueOf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9859bdY
    public C57567ykp values() {
        return this.getNewProxyInstance.values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43294rma
    public boolean values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.values(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43294rma
    public java.lang.String wlaJM() {
        return this.AEQbTJ.wlaJM();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46553tYp
    public ValuationCurrencyBean zLjUOn() {
        return this.valueOf.zLjUOn();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public java.lang.String zsXlph() {
        return this.AYXKKw.zsXlph();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48893ueK
    public ShareData zuBGHE() {
        return this.AhwBna.zuBGHE();
    }

    public C23917iOc(@NotNull InterfaceC9852bdR interfaceC9852bdR, @NotNull xWO xwo, @NotNull InterfaceC54829xWw interfaceC54829xWw, @NotNull InterfaceC9851bdQ interfaceC9851bdQ, @NotNull InterfaceC54828xWv interfaceC54828xWv, @NotNull InterfaceC9859bdY interfaceC9859bdY, @NotNull InterfaceC46553tYp interfaceC46553tYp, @NotNull MpcWalletService mpcWalletService, @NotNull gKO gko, @NotNull InterfaceC48893ueK interfaceC48893ueK, @NotNull InterfaceC9854bdT interfaceC9854bdT, @NotNull xWS xws, @NotNull OKComplianceRestrictionService oKComplianceRestrictionService, @NotNull xWK xwk, @NotNull xWL xwl, @NotNull InterfaceC43294rma interfaceC43294rma, @NotNull WalletDappInteractionBizService walletDappInteractionBizService, @NotNull xWX xwx, @NotNull Web3ShareService web3ShareService, @NotNull InterfaceC9857bdW interfaceC9857bdW) {
        Intrinsics.checkNotNullParameter(interfaceC9852bdR, "");
        Intrinsics.checkNotNullParameter(xwo, "");
        Intrinsics.checkNotNullParameter(interfaceC54829xWw, "");
        Intrinsics.checkNotNullParameter(interfaceC9851bdQ, "");
        Intrinsics.checkNotNullParameter(interfaceC54828xWv, "");
        Intrinsics.checkNotNullParameter(interfaceC9859bdY, "");
        Intrinsics.checkNotNullParameter(interfaceC46553tYp, "");
        Intrinsics.checkNotNullParameter(mpcWalletService, "");
        Intrinsics.checkNotNullParameter(gko, "");
        Intrinsics.checkNotNullParameter(interfaceC48893ueK, "");
        Intrinsics.checkNotNullParameter(interfaceC9854bdT, "");
        Intrinsics.checkNotNullParameter(xws, "");
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        Intrinsics.checkNotNullParameter(xwk, "");
        Intrinsics.checkNotNullParameter(xwl, "");
        Intrinsics.checkNotNullParameter(interfaceC43294rma, "");
        Intrinsics.checkNotNullParameter(walletDappInteractionBizService, "");
        Intrinsics.checkNotNullParameter(xwx, "");
        Intrinsics.checkNotNullParameter(web3ShareService, "");
        Intrinsics.checkNotNullParameter(interfaceC9857bdW, "");
        this.DbNXlk = interfaceC9852bdR;
        this.fARcdN = xwo;
        this.OLrzqt = interfaceC54829xWw;
        this.AkhnZx = interfaceC9851bdQ;
        this.KWHzl = interfaceC54828xWv;
        this.getNewProxyInstance = interfaceC9859bdY;
        this.valueOf = interfaceC46553tYp;
        this.djBIcL = mpcWalletService;
        this.EZpvd = gko;
        this.AhwBna = interfaceC48893ueK;
        this.values = interfaceC9854bdT;
        this.fJNWhG = xws;
        this.AYXKKw = oKComplianceRestrictionService;
        this.fetchVPNInfo = xwk;
        this.AuCTel = xwl;
        this.AEQbTJ = interfaceC43294rma;
        this.isConnected = walletDappInteractionBizService;
        this.fIwbmz = xwx;
        this.getFieldNames = web3ShareService;
        this.ejfBZ = interfaceC9857bdW;
        this.gEmmrt = yDY.gEmmrt(interfaceC9852bdR, xwo, interfaceC54829xWw, interfaceC9851bdQ, interfaceC54828xWv, interfaceC9859bdY, interfaceC46553tYp, mpcWalletService, gko, interfaceC48893ueK, interfaceC9854bdT, xws, oKComplianceRestrictionService, interfaceC43294rma, walletDappInteractionBizService, xwx, interfaceC9857bdW);
    }

    /* JADX INFO: renamed from: o.iOc$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iOc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final InterfaceC23916iOb copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            C58114yvF c58114yvF = C58114yvF.EZpvd;
            return ((iNX) C58114yvF.OLrzqt(context, iNX.class)).QUSxYX();
        }
    }

    @Override // o.xWO
    public AbstractC58260yxt<java.lang.Boolean> aO_() {
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(java.lang.Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    @Override // o.InterfaceC43216rlB
    public void init(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.util.Iterator<T> it = this.gEmmrt.iterator();
        while (it.hasNext()) {
            ((InterfaceC43217rlC) it.next()).init(context);
        }
    }

    @Override // o.InterfaceC43216rlB
    public boolean isInitialized() {
        java.util.List<InterfaceC43217rlC> list = this.gEmmrt;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((InterfaceC43217rlC) it.next()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }
}
