package o;

import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.api.bean.DexFeature;
import com.okinc.business.defi.api.model.tx.signdata.EVMContractSignData;
import com.okinc.business.dex.api.bean.BridgeRedeemStatus;
import com.okinc.business.dex.api.bean.ChainInfo;
import com.okinc.business.dex.api.bean.ChainListInfo;
import com.okinc.business.dex.api.bean.ChainRequest;
import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailResultVo;
import com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailVO;
import com.okinc.business.dex.api.bean.GasStationBean;
import com.okinc.business.dex.api.bean.LimitParam;
import com.okinc.business.dex.api.bean.NotSupportChain;
import com.okinc.business.dex.api.bean.OKDCoinDetailConfig;
import com.okinc.business.dex.api.bean.OKDSourceType;
import com.okinc.business.dex.api.bean.OrderListParams;
import com.okinc.business.dex.api.bean.OrderStatus;
import com.okinc.business.dex.api.bean.SignalTabApi;
import com.okinc.business.dex.api.bean.SupportSwapCheck;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.api.bean.TradeDetails;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dex.api.bean.sa_small_assets.CheckRepeatParam;
import com.okinc.business.dex.api.bean.sa_small_assets.CheckRepeatResult;
import com.okinc.business.dex.api.bean.sa_small_assets.DustTokenQuoteParam;
import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetOrderParam;
import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetQuoteData;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingCreateParams;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradingHomeParams;
import com.okinc.business.dex.trade.order.domain.model.GetOrderCountRequest;
import com.okinc.business.dex.trade.order.domain.model.OrderListPageType;
import com.okinc.business.dexlogic.bean.BridgeRedeemCallDataObject;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeTransactionParams;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.dexlogic.track.enums.DexHistoryDetailsPageView;
import com.okinc.business.dexui.api.serviceimpl.DexTradeApiImpl$getDexSingleChainList$1;
import com.okinc.business.dexui.api.serviceimpl.DexTradeApiImpl$getStrategyOrderCount$1;
import com.okinc.business.dexui.api.serviceimpl.DexTradeApiImpl$goToDexTrade$1;
import com.okinc.business.dexui.api.serviceimpl.DexTradeApiImpl$jumpToDexTradeTab$1;
import com.okinc.business.dexui.api.serviceimpl.DexTradeApiImpl$smallAssetBatchCreateOrder$$inlined$getApiResult$1;
import com.okinc.business.dexui.api.serviceimpl.DexTradeApiImpl$smallAssetBatchCreateOrder$1;
import com.okinc.business.dexui.api.serviceimpl.DexTradeApiImpl$smallAssetBatchQuote$$inlined$getApiResult$1;
import com.okinc.business.dexui.api.serviceimpl.DexTradeApiImpl$smallAssetBatchQuote$1;
import com.okinc.business.dexui.api.serviceimpl.DexTradeApiImpl$smallAssetCheckRepeat$$inlined$getApiResult$1;
import com.okinc.business.dexui.api.serviceimpl.DexTradeApiImpl$smallAssetCheckRepeat$1;
import com.okinc.business.dexui.api.serviceimpl.DexTradeApiImpl$startBridgeRedeem$1;
import com.okinc.business.dexui.main.limitorder.orderdetail.LimitOrderDetailActivity;
import com.okinc.business.dexui.main.market.MarketParams;
import com.okinc.business.market.features.module.ui.detail.ModuleInfo;
import com.okinc.business.market.features.vibes.ui.VibesActivityParams;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.TxDirection;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.JsonElement;
import o.AbstractC22421hez;
import o.AbstractC43419rot;
import o.InterfaceC22387heR;
import o.gKO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23285hvO extends AbstractC43215rlA implements gKO {
    public InterfaceC23234huQ AEQbTJ;
    public kUP AYXKKw;
    public InterfaceC19677gLf EZpvd;
    public C28264kUz KWHzl;
    public gZF OLrzqt;
    public InterfaceC19674gLc copydefault;
    public CoroutineDispatcher gEmmrt;

    /* JADX INFO: renamed from: o.hvO$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKDSourceType.values().length];
            try {
                iArr[OKDSourceType.WALLET_SOURCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKDSourceType.YIELD_SOURCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKDSourceType.NFT_SOURCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[OKDSourceType.DAPP_SOURCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[OKDSourceType.CEFI_SOURCE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[OKDSourceType.DEX_MARKET_SOURCE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[OKDSourceType.DEX_SWAP_SOURCE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[OrderListParams.Page.values().length];
            try {
                iArr2[OrderListParams.Page.OpenOrder.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[OrderListParams.Page.History.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[OrderListParams.Page.Trades.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[OrderListParams.Page.Bridge.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            copydefault = iArr2;
        }
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
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKO
    public void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull GasStationBean gasStationBean, int i) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(gasStationBean, "");
    }

    @Override // o.AbstractC43215rlA
    public void onInit(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onInit(context);
        C58114yvF c58114yvF = C58114yvF.EZpvd;
        InterfaceC23286hvP interfaceC23286hvP = (InterfaceC23286hvP) C58114yvF.OLrzqt(context, InterfaceC23286hvP.class);
        this.KWHzl = interfaceC23286hvP.zsXlph();
        this.OLrzqt = interfaceC23286hvP.AuCTelauCTel();
        this.AYXKKw = interfaceC23286hvP.AwvSrB();
        this.AEQbTJ = interfaceC23286hvP.zLjUOn();
        this.gEmmrt = Dispatchers.getIO();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    @Override // o.gKO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(@NotNull android.content.Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull TradeParam tradeParam, @NotNull java.lang.String str, Function1<? super java.lang.Boolean, Unit> function1, int i, @NotNull Function1<? super gKW, Unit> function12) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(tradeParam, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function12, "");
        if (C22416heu.copydefault(context)) {
            return;
        }
        java.lang.String type = tradeParam.getType();
        switch (type.hashCode()) {
            case -1171865311:
                str2 = "nft_trade";
                if (!type.equals("nft_trade")) {
                    str2 = "default_trade";
                }
                break;
            case -237696453:
                str2 = "inner_trade";
                if (!type.equals("inner_trade")) {
                }
                break;
            case 920262194:
                str2 = "yield_trade";
                if (!type.equals("yield_trade")) {
                }
                break;
            case 921962910:
                if (type.equals("wallet_trade")) {
                    str2 = "wallet_trade";
                    break;
                }
                break;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "wallet_trade")) {
            AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.BroadcastReceiver.copydefault);
        }
        C28264kUz c28264kUz = this.KWHzl;
        if (c28264kUz == null) {
            Intrinsics.gEmmrt("");
            c28264kUz = null;
        }
        TradingType tradingTypeCopydefault = c28264kUz.copydefault();
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new DexTradeApiImpl$goToDexTrade$1(tradingTypeCopydefault, context, tradeParam, function1, this, str2, null), 3, null);
    }

    @Override // o.gKO
    public void EZpvd(@NotNull android.content.Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull TradeParam tradeParam, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(tradeParam, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (C22416heu.copydefault(context)) {
            return;
        }
        if (tradeParam.isFromWalletCoinDetail()) {
            AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.BroadcastReceiver.copydefault);
        }
        if (Intrinsics.EZpvd((java.lang.Object) tradeParam.getSwapType(), (java.lang.Object) "type_bridge")) {
            EZpvd(context, tradeParam);
            return;
        }
        C28264kUz c28264kUz = this.KWHzl;
        if (c28264kUz == null) {
            Intrinsics.gEmmrt("");
            c28264kUz = null;
        }
        TradingType tradingTypeCopydefault = c28264kUz.copydefault();
        function1.invoke(java.lang.Boolean.TRUE);
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new DexTradeApiImpl$jumpToDexTradeTab$1(tradingTypeCopydefault, context, tradeParam, function1, this, null), 3, null);
    }

    public static final java.lang.String copydefault(TradeParam tradeParam) {
        return tradeParam.getToCoinInfo().getChainId();
    }

    public final void OLrzqt(android.content.Context context, final TradeParam tradeParam) {
        ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).KWHzl(context, gKZ.EZpvd.AEQbTJ("dex/meme/swap"), C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainId", C31256lqb.KWHzl(tradeParam.getFromCoinInfo().getChainId(), (Function0<java.lang.String>) new Function0() { // from class: o.hvZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23285hvO.copydefault(tradeParam);
            }
        })), C56390yDp.OLrzqt("tokenContractAddress", C31256lqb.KWHzl(tradeParam.getFromCoinInfo().getTokenAddress(), (Function0<java.lang.String>) new Function0() { // from class: o.hwb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23285hvO.djBIcL(tradeParam);
            }
        })), C56390yDp.OLrzqt("transaction_direction", 0), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "")), new Function1() { // from class: o.hwa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23285hvO.AYXKKw((AbstractC43238rlX) obj);
            }
        });
    }

    public static final java.lang.String djBIcL(TradeParam tradeParam) {
        java.lang.String tokenAddress = tradeParam.getToCoinInfo().getTokenAddress();
        return tokenAddress == null ? "" : tokenAddress;
    }

    public static final Unit AYXKKw(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final java.lang.String EZpvd(TradeParam tradeParam) {
        return tradeParam.getToCoinInfo().getChainId();
    }

    public final void AEQbTJ(android.content.Context context, final TradeParam tradeParam) {
        TxDirection txDirection;
        java.lang.String strKWHzl = C31256lqb.KWHzl(tradeParam.getFromCoinInfo().getChainId(), (Function0<java.lang.String>) new Function0() { // from class: o.hwg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23285hvO.EZpvd(tradeParam);
            }
        });
        if (C33129mqd.OLrzqt((java.lang.CharSequence) tradeParam.getFromCoinInfo().getChainId())) {
            txDirection = TxDirection.SELL;
        } else {
            txDirection = TxDirection.BUY;
        }
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        java.lang.String strAEQbTJ = gKZ.EZpvd.AEQbTJ(txDirection == TxDirection.BUY ? "dex/advanced/buy" : "dex/advanced/sell");
        kotlin.Pair[] pairArr = new kotlin.Pair[7];
        pairArr[0] = C56390yDp.OLrzqt("chainId", strKWHzl);
        java.lang.String tokenAddress = tradeParam.getToCoinInfo().getTokenAddress();
        if (tokenAddress == null) {
            tokenAddress = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("buyTokenContractAddress", tokenAddress);
        java.lang.String tokenAddress2 = tradeParam.getFromCoinInfo().getTokenAddress();
        if (tokenAddress2 == null) {
            tokenAddress2 = "";
        }
        pairArr[2] = C56390yDp.OLrzqt("payTokenContractAddress", tokenAddress2);
        java.lang.String tokenAddress3 = tradeParam.getFromCoinInfo().getTokenAddress();
        if (tokenAddress3 == null) {
            tokenAddress3 = "";
        }
        pairArr[3] = C56390yDp.OLrzqt("sellTokenContractAddress", tokenAddress3);
        java.lang.String tokenAddress4 = tradeParam.getToCoinInfo().getTokenAddress();
        pairArr[4] = C56390yDp.OLrzqt("forTokenContractAddress", tokenAddress4 != null ? tokenAddress4 : "");
        pairArr[5] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, tradeParam.getFromAmount());
        pairArr[6] = C56390yDp.OLrzqt("orderType", java.lang.Integer.valueOf(C33129mqd.AhwBna(tradeParam.getStrategyType())));
        interfaceC43294rma.KWHzl(context, strAEQbTJ, C56424yEw.gEmmrt(pairArr), new Function1() { // from class: o.hwh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23285hvO.EZpvd((AbstractC43238rlX) obj);
            }
        });
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.content.Context context, TradeParam tradeParam) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        java.lang.String strAEQbTJ = gKZ.EZpvd.AEQbTJ("dex/swap");
        kotlin.Pair[] pairArr = new kotlin.Pair[9];
        java.lang.String swapType = tradeParam.getSwapType();
        if (swapType == null) {
            swapType = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("swapType", swapType);
        pairArr[1] = C56390yDp.OLrzqt("fromChainId", tradeParam.getFromCoinInfo().getChainId());
        pairArr[2] = C56390yDp.OLrzqt("isOldTradingDialog", java.lang.Boolean.TRUE);
        java.lang.String tokenAddress = tradeParam.getFromCoinInfo().getTokenAddress();
        if (tokenAddress == null) {
            tokenAddress = "";
        }
        pairArr[3] = C56390yDp.OLrzqt("fromTokenContractAddress", tokenAddress);
        pairArr[4] = C56390yDp.OLrzqt("isFromNative", tradeParam.getFromCoinInfo().isNativeToken() ? "1" : "0");
        pairArr[5] = C56390yDp.OLrzqt("toChainId", tradeParam.getToCoinInfo().getChainId());
        java.lang.String tokenAddress2 = tradeParam.getToCoinInfo().getTokenAddress();
        pairArr[6] = C56390yDp.OLrzqt("toTokenContractAddress", tokenAddress2 != null ? tokenAddress2 : "");
        pairArr[7] = C56390yDp.OLrzqt("isToNative", tradeParam.getToCoinInfo().isNativeToken() ? "1" : "0");
        pairArr[8] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "0");
        interfaceC43294rma.KWHzl(context, strAEQbTJ, C56424yEw.gEmmrt(pairArr), new Function1() { // from class: o.hwi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23285hvO.AEQbTJ((AbstractC43238rlX) obj);
            }
        });
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    @Override // o.gKO
    public void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull TradeParam tradeParam) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tradeParam, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC30394laN.class);
        C31200lpY.EZpvd(intent, str);
        intent.putExtra("trade_data", tradeParam);
        context.startActivity(intent);
    }

    @Override // o.gKO
    public AbstractC58185ywX<SupportSwapCheck> KWHzl(@NotNull ChainRequest chainRequest) {
        Intrinsics.checkNotNullParameter(chainRequest, "");
        final Ref.IntRef intRef = new Ref.IntRef();
        final Ref.IntRef intRef2 = new Ref.IntRef();
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(chainRequest);
        final Function1 function1 = new Function1() { // from class: o.hwm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23285hvO.copydefault(this.KWHzl, intRef, intRef2, (ChainRequest) obj);
            }
        };
        AbstractC58185ywX<SupportSwapCheck> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.hwl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23285hvO.fetchVPNInfo(function1, obj);
            }
        }).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(final C23285hvO c23285hvO, final Ref.IntRef intRef, final Ref.IntRef intRef2, final ChainRequest chainRequest) throws NotSupportChain {
        CoinInfo toCoinInfo;
        Intrinsics.checkNotNullParameter(chainRequest, "");
        CoinInfo fromCoinInfo = chainRequest.getFromCoinInfo();
        if (fromCoinInfo != null && fromCoinInfo.coinError() && (toCoinInfo = chainRequest.getToCoinInfo()) != null && toCoinInfo.coinError()) {
            throw new NotSupportChain();
        }
        AbstractC58185ywX<InterfaceC9738bbJ> abstractC58185ywXEZpvd = c23285hvO.EZpvd("default_trade").OLrzqt().EZpvd();
        final Function1 function1 = new Function1() { // from class: o.hwe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23285hvO.KWHzl(this.copydefault, chainRequest, intRef, intRef2, (InterfaceC9738bbJ) obj);
            }
        };
        return abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.hwr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23285hvO.AkhnZx(function1, obj);
            }
        });
    }

    public static final InterfaceC60096zvd AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C23285hvO c23285hvO, final ChainRequest chainRequest, final Ref.IntRef intRef, final Ref.IntRef intRef2, InterfaceC9738bbJ interfaceC9738bbJ) throws NotSupportChain {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        if (interfaceC9738bbJ.zsXlph() || interfaceC9738bbJ.QfsBiF()) {
            throw new NotSupportChain();
        }
        AbstractC58185ywX<ChainListInfo> abstractC58185ywXAF_ = c23285hvO.KWHzl("default_trade").aF_();
        final Function1 function1 = new Function1() { // from class: o.hvS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23285hvO.OLrzqt(chainRequest, intRef, intRef2, (ChainListInfo) obj);
            }
        };
        return abstractC58185ywXAF_.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hvU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23285hvO.AYXKKw(function1, obj);
            }
        });
    }

    public static final SupportSwapCheck AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SupportSwapCheck) function1.invoke(obj);
    }

    public static final SupportSwapCheck OLrzqt(ChainRequest chainRequest, Ref.IntRef intRef, Ref.IntRef intRef2, ChainListInfo chainListInfo) {
        java.lang.String chainId;
        java.lang.Object next;
        java.lang.String chainId2;
        java.lang.Object next2;
        Intrinsics.checkNotNullParameter(chainListInfo, "");
        CoinInfo fromCoinInfo = chainRequest.getFromCoinInfo();
        java.lang.Object obj = null;
        if (fromCoinInfo != null && (chainId2 = fromCoinInfo.getChainId()) != null && chainId2.length() > 0) {
            java.util.Iterator<T> it = chainListInfo.getSwap().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                java.lang.String str = (java.lang.String) next2;
                CoinInfo fromCoinInfo2 = chainRequest.getFromCoinInfo();
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (fromCoinInfo2 != null ? fromCoinInfo2.getChainId() : null))) {
                    break;
                }
            }
            if (next2 != null) {
                intRef.element = 1;
            }
            java.util.Iterator<T> it2 = chainListInfo.getBridge().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next3 = it2.next();
                java.lang.String str2 = (java.lang.String) next3;
                CoinInfo fromCoinInfo3 = chainRequest.getFromCoinInfo();
                if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) (fromCoinInfo3 != null ? fromCoinInfo3.getChainId() : null))) {
                    obj = next3;
                    break;
                }
            }
            if (obj != null) {
                intRef2.element = 1;
            }
        } else {
            CoinInfo toCoinInfo = chainRequest.getToCoinInfo();
            if (toCoinInfo != null && (chainId = toCoinInfo.getChainId()) != null && chainId.length() > 0) {
                java.util.Iterator<T> it3 = chainListInfo.getSwap().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    java.lang.String str3 = (java.lang.String) next;
                    CoinInfo toCoinInfo2 = chainRequest.getToCoinInfo();
                    if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) (toCoinInfo2 != null ? toCoinInfo2.getChainId() : null))) {
                        break;
                    }
                }
                if (next != null) {
                    intRef.element = 1;
                }
                java.util.Iterator<T> it4 = chainListInfo.getBridge().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    java.lang.Object next4 = it4.next();
                    java.lang.String str4 = (java.lang.String) next4;
                    CoinInfo toCoinInfo3 = chainRequest.getToCoinInfo();
                    if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) (toCoinInfo3 != null ? toCoinInfo3.getChainId() : null))) {
                        obj = next4;
                        break;
                    }
                }
                if (obj != null) {
                    intRef2.element = 1;
                }
            }
        }
        return new SupportSwapCheck(intRef.element, intRef2.element);
    }

    public void AEQbTJ(@NotNull final android.app.Activity activity, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        InterfaceC22598hiQ interfaceC22598hiQKWHzl = KWHzl("default_trade");
        InterfaceC23194htd interfaceC23194htdEZpvd = EZpvd("default_trade");
        AbstractC58185ywX supportChainList$default = InterfaceC22387heR.Application.getSupportChainList$default(interfaceC22598hiQKWHzl, "3", false, 2, null);
        AbstractC58185ywX<InterfaceC9738bbJ> abstractC58185ywXEZpvd = interfaceC23194htdEZpvd.OLrzqt().EZpvd();
        final Function2 function2 = new Function2() { // from class: o.hwn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C23285hvO.KWHzl((java.util.List) obj, (InterfaceC9738bbJ) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(supportChainList$default, abstractC58185ywXEZpvd, new InterfaceC58223yxI() { // from class: o.hwq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C23285hvO.copydefault(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXKWHzl, lifecycleOwner, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.hwp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23285hvO.EZpvd(activity, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hwo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23285hvO.DbNXlk(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hww
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23285hvO.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hws
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23285hvO.isConnected(function12, obj);
            }
        });
    }

    public static final java.lang.Boolean copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.lang.Boolean) function2.invoke(obj, obj2);
    }

    public static final java.lang.Boolean KWHzl(java.util.List list, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return java.lang.Boolean.valueOf(!interfaceC9738bbJ.zsXlph());
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(android.app.Activity activity, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) ActivityC22185hab.class));
        }
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.gKO
    public void AEQbTJ(@NotNull android.app.Activity activity, @NotNull TradeDetails tradeDetails, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(tradeDetails, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC22009hUn.class);
        C31200lpY.EZpvd(intent, "default_trade");
        intent.putExtra(OtcExtraKeys.ORDER_ID, tradeDetails.getOrderId());
        intent.putExtra("source", DexHistoryDetailsPageView.Source.WALLET.getValue());
        activity.startActivity(intent);
    }

    @Override // o.gKO
    public void copydefault(@NotNull android.content.Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull Function1<? super BridgeRedeemStatus, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new DexTradeApiImpl$startBridgeRedeem$1(str, this, str2, function1, context, z, null), 3, null);
    }

    @Override // o.gKO
    public void EZpvd(@NotNull android.app.Activity activity, @NotNull TradeDetails tradeDetails, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(tradeDetails, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        OLrzqt(activity, new gKT(tradeDetails.getOrderId(), 6, null));
    }

    public void OLrzqt(@NotNull android.content.Context context, @NotNull gKT gkt) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(gkt, "");
        OLrzqt(context, gkt.KWHzl(), gkt.OLrzqt(), gkt.AEQbTJ());
    }

    public void OLrzqt(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC28566kdG.class);
        C31200lpY.EZpvd(intent, "default_trade");
        activity.startActivity(intent);
    }

    @Override // o.gKO
    public void copydefault(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        activity.startActivity(ActivityC28975kks.Companion.KWHzl(activity, new ModuleInfo(str, null, str2, str3, null, false, null, null, null, null, false, null, null, null, null, 32754, null)));
    }

    @Override // o.gKO
    public void EZpvd(@NotNull android.content.Context context, @NotNull TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        java.lang.String chainId = tokenBase.getChainId();
        java.lang.String chainName = tokenBase.getChainName();
        C25352ivB.openMarketDetailPage$default(context, "default_trade", new TokenBase(chainId, tokenBase.getTokenContractAddress(), tokenBase.getTokenLogoUrl(), tokenBase.getChainLogoUrl(), null, tokenBase.getTokenSymbol(), tokenBase.getTokenName(), 0, 0, 0, 0, null, copydefault(tokenBase.getSource()), tokenBase.getTokenSource(), null, chainName, null, 0, 0, false, null, tokenBase.getMarketTabName(), tokenBase.getShowSourceAlert(), false, null, null, tokenBase.getSourcePageName(), tokenBase.getSrcType(), false, null, null, false, -207663216, null), "deeplink", null, new int[0], 8, null);
    }

    @Override // o.gKO
    public void OLrzqt(@NotNull android.app.Activity activity, @NotNull OKDCoinDetailConfig oKDCoinDetailConfig) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(oKDCoinDetailConfig, "");
        java.lang.String strKWHzl = KWHzl(oKDCoinDetailConfig.getSourceType());
        TokenBase tokenBase = new TokenBase(oKDCoinDetailConfig.getChainId(), oKDCoinDetailConfig.getTokenContractAddress(), oKDCoinDetailConfig.getTokenLogoUrl(), oKDCoinDetailConfig.getChainLogoUrl(), null, oKDCoinDetailConfig.getTokenSymbol(), oKDCoinDetailConfig.getTokenName(), 0, 0, 0, 0, null, copydefault(strKWHzl), null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -4208, null);
        switch (Activity.KWHzl[oKDCoinDetailConfig.getSourceType().ordinal()]) {
            case 1:
                str = "wallet_asset";
                break;
            case 2:
                str = "yield";
                break;
            case 3:
            case 4:
            case 5:
                str = "deeplink";
                break;
            case 6:
                str = "market_trending";
                break;
            case 7:
                str = "trade_simple";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        C25352ivB.copydefault(activity, strKWHzl, tokenBase, str, oKDCoinDetailConfig.getRedirection(), new int[0]);
    }

    @Override // o.gKO
    public AbstractC58185ywX<ResponseData<DexMarketCheckCoinDetailResultVo>> KWHzl(@NotNull OKDSourceType oKDSourceType, @NotNull DexMarketCheckCoinDetailVO dexMarketCheckCoinDetailVO) {
        Intrinsics.checkNotNullParameter(oKDSourceType, "");
        Intrinsics.checkNotNullParameter(dexMarketCheckCoinDetailVO, "");
        return C22380heK.OLrzqt.copydefault(KWHzl(oKDSourceType)).isConnected().KWHzl(dexMarketCheckCoinDetailVO);
    }

    public void OLrzqt(@NotNull android.app.Activity activity, @NotNull TradeParam tradeParam, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(tradeParam, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        copydefault("default_trade", (Intrinsics.EZpvd((java.lang.Object) tradeParam.getSwapType(), (java.lang.Object) "type_bridge") || Intrinsics.EZpvd((java.lang.Object) tradeParam.getFromCoinInfo().getChainId(), (java.lang.Object) "0") || Intrinsics.EZpvd((java.lang.Object) tradeParam.getToCoinInfo().getChainId(), (java.lang.Object) "0") || (tradeParam.getFromCoinInfo().getChainId().length() != 0 && tradeParam.getToCoinInfo().getChainId().length() != 0 && !Intrinsics.EZpvd((java.lang.Object) tradeParam.getFromCoinInfo().getChainId(), (java.lang.Object) tradeParam.getToCoinInfo().getChainId()) && !C33129mqd.OLrzqt((java.lang.CharSequence) tradeParam.getTradeMode()))) ? false : true).valueOf().postValue(tradeParam);
    }

    @Override // o.gKO
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        KWHzl(str, str2, i, str3, str4, 0, "", "");
    }

    @Override // o.gKO
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i2, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        KWHzl(str, str2, i, str3, str4, i2, str5, "");
    }

    @Override // o.gKO
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i2, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        C22380heK.OLrzqt.copydefault("default_trade").values().postValue(new MemeTransactionParams(new TokenBase(str, str2, null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, true, null, null, false, false, null, null, str5, i2, false, null, null, false, -201850884, null), i, str3, str4, StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str6) ^ true ? new TokenBase(str, str6, null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, true, null, null, false, false, null, null, str5, i2, false, null, null, false, -201850884, null) : null));
    }

    @Override // o.gKO
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, int i, @NotNull java.lang.String str4, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C22380heK.OLrzqt.copydefault("default_trade").EZpvd().postValue(new AdvancedModeParams(str2 != null ? new DexMultiTokenInfoBean((java.lang.String) null, str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -67, 134217727, (DefaultConstructorMarker) null) : null, str3 != null ? new DexMultiTokenInfoBean((java.lang.String) null, str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -67, 134217727, (DefaultConstructorMarker) null) : null, TxDirection.Companion.KWHzl(i), str4, AdvancedOrderType.Companion.copydefault(i2), null, 32, null));
    }

    @Override // o.gKO
    public void EZpvd(int i) {
        C22380heK.OLrzqt.copydefault("default_trade").KWHzl().postValue(new CopyTradingHomeParams(i));
    }

    @Override // o.gKO
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C22380heK.OLrzqt.copydefault("default_trade").AEQbTJ().postValue(new CopyTradingCreateParams(str, str2));
    }

    @Override // o.gKO
    public void OLrzqt(java.lang.String str, java.lang.String str2) {
        InterfaceC22598hiQ interfaceC22598hiQKWHzl = KWHzl("default_trade");
        interfaceC22598hiQKWHzl.djBIcL().postValue(java.lang.Boolean.TRUE);
        interfaceC22598hiQKWHzl.AEQbTJ(new MarketParams("deeplink", str, str2));
    }

    public void AEQbTJ(@NotNull android.app.Activity activity, @NotNull LifecycleOwner lifecycleOwner, @NotNull LimitParam limitParam) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(limitParam, "");
        C22380heK.OLrzqt.copydefault("default_trade").AhwBna().OLrzqt().postValue(limitParam);
    }

    public void KWHzl(@NotNull final android.app.Activity activity, @NotNull final LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final InterfaceC22598hiQ interfaceC22598hiQKWHzl = KWHzl("default_trade");
        final InterfaceC23194htd interfaceC23194htdEZpvd = EZpvd("default_trade");
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = interfaceC23194htdEZpvd.OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.hwd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23285hvO.KWHzl(this.copydefault, activity, lifecycleOwner, interfaceC22598hiQKWHzl, interfaceC23194htdEZpvd, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hwf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23285hvO.values(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hwj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23285hvO.AEQbTJ(this.KWHzl, activity, lifecycleOwner, interfaceC22598hiQKWHzl, interfaceC23194htdEZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hwk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23285hvO.AuCTel(function12, obj);
            }
        });
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C23285hvO c23285hvO, android.app.Activity activity, LifecycleOwner lifecycleOwner, InterfaceC22598hiQ interfaceC22598hiQ, InterfaceC23194htd interfaceC23194htd, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (interfaceC9738bbJ.getFieldNames()) {
            c23285hvO.AEQbTJ(activity, lifecycleOwner);
        } else {
            c23285hvO.AEQbTJ(activity, lifecycleOwner, interfaceC22598hiQ, interfaceC23194htd);
        }
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C23285hvO c23285hvO, android.app.Activity activity, LifecycleOwner lifecycleOwner, InterfaceC22598hiQ interfaceC22598hiQ, InterfaceC23194htd interfaceC23194htd, java.lang.Throwable th) {
        c23285hvO.AEQbTJ(activity, lifecycleOwner, interfaceC22598hiQ, interfaceC23194htd);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final android.app.Activity activity, LifecycleOwner lifecycleOwner, InterfaceC22598hiQ interfaceC22598hiQ, InterfaceC23194htd interfaceC23194htd) {
        AbstractC58185ywX supportChainList$default = InterfaceC22387heR.Application.getSupportChainList$default(interfaceC22598hiQ, "3", false, 2, null);
        AbstractC58185ywX<InterfaceC9738bbJ> abstractC58185ywXEZpvd = interfaceC23194htd.OLrzqt().EZpvd();
        final Function2 function2 = new Function2() { // from class: o.hvV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C23285hvO.EZpvd((java.util.List) obj, (InterfaceC9738bbJ) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(supportChainList$default, abstractC58185ywXEZpvd, new InterfaceC58223yxI() { // from class: o.hvW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C23285hvO.KWHzl(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXKWHzl, lifecycleOwner, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.hvX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23285hvO.OLrzqt(activity, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hvT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23285hvO.ejfBZ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hvY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23285hvO.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hwc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23285hvO.fJNWhG(function12, obj);
            }
        });
    }

    public static final java.lang.Boolean KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.lang.Boolean) function2.invoke(obj, obj2);
    }

    public static final java.lang.Boolean EZpvd(java.util.List list, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return java.lang.Boolean.valueOf(!interfaceC9738bbJ.zsXlph());
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(android.app.Activity activity, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) ActivityC22185hab.class));
        }
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.gKO
    public void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, int i, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) LimitOrderDetailActivity.class);
        C31200lpY.EZpvd(intent, "default_trade");
        intent.putExtra(OtcExtraKeys.ORDER_ID, str);
        intent.putExtra(OtcExtraKeys.CRYPTO_ORDER_TYPE, i);
        if (num != null) {
            intent.putExtra("limit_strategy_type", num.intValue());
        }
        intent.putExtra("extra_universal_1", false);
        context.startActivity(intent);
    }

    public final InterfaceC23194htd EZpvd(java.lang.String str) {
        return C22380heK.OLrzqt.copydefault(str).fARcdN();
    }

    public final InterfaceC22598hiQ KWHzl(java.lang.String str) {
        return C22380heK.OLrzqt.copydefault(str).copydefault();
    }

    public final InterfaceC22598hiQ copydefault(java.lang.String str, boolean z) {
        return C22380heK.OLrzqt.copydefault(str).EZpvd(z);
    }

    @Override // o.gKO
    public AbstractC58185ywX<java.lang.Boolean> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.gKO
    public void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        gKO.StateListAnimator.showGasStationDialog$default(this, supportFragmentManager, str, str2, str3, str4, str5, 0, 64, null);
    }

    @Override // o.gKO
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(C22416heu.EZpvd(DexFeature.TRADE));
    }

    @Override // o.gKO
    public java.lang.String AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C23271hvA.getLocalCurrencyWithPrecision$default(C23271hvA.copydefault, str, null, 1, null);
    }

    @Override // o.gKO
    public java.lang.String valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return "--";
        }
        if (!C23313hvq.copydefault(str, 0)) {
            return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, false, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        }
        return C23272hvB.KWHzl.OLrzqt().getSymbol() + C23271hvA.formatTokenCode$default(C23271hvA.copydefault, str, false, null, false, null, null, 31, null);
    }

    @Override // o.gKO
    public java.lang.String EZpvd(@NotNull java.lang.String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(z ? this : java.lang.Double.valueOf(C33129mqd.divD$default(str, 100, null, null, null, 14, null)));
        pTF ptf = pTF.KWHzl;
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        return ptf.AEQbTJ(pTB.KWHzl(bigDecimalEZpvd, 2, i, roundingMode, locale));
    }

    @Override // o.gKO
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC21863hPc.class);
        intent.putExtra("token_base", tokenBase);
        context.startActivity(intent);
    }

    @Override // o.gKO
    public AbstractC58260yxt<java.lang.Boolean> aO_() {
        return ((xWO) C43251rlk.copydefault(xWO.class)).aO_();
    }

    public void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull SignalTabApi signalTabApi) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(signalTabApi, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC29699kya.class);
        intent.putExtra("module_name_english", str);
        intent.putExtra("signalTab", signalTabApi.getTabValue());
        context.startActivity(intent);
    }

    @Override // o.gKO
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        jBN.copydefault.KWHzl();
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC25672jCb.class);
        intent.putExtra("key.page_from", str);
        intent.putExtra("param_tracker_tab_position", i);
        context.startActivity(intent);
    }

    @Override // o.gKO
    public void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25632jAp.KWHzl.EZpvd(context, new VibesActivityParams(str2, C33129mqd.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(java.lang.String str) {
        switch (str.hashCode()) {
            case -1237250742:
                return !str.equals("cefi_trade") ? "Unknown" : "cefi_search";
            case -628088350:
                str.equals("dapp_trade");
            case 920262194:
                if (str.equals("yield_trade")) {
                    return "defi_earn";
                }
                break;
            case 921962910:
                if (str.equals("wallet_trade")) {
                    return "wallet_asset";
                }
                break;
        }
    }

    public final java.lang.String KWHzl(OKDSourceType oKDSourceType) {
        switch (Activity.KWHzl[oKDSourceType.ordinal()]) {
            case 1:
                return "wallet_trade";
            case 2:
                return "yield_trade";
            case 3:
                return "nft_trade";
            case 4:
                return "dapp_trade";
            case 5:
                return "cefi_trade";
            case 6:
            case 7:
                return "default_trade";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // o.gKO
    public java.lang.String KWHzl(@NotNull java.lang.String str, boolean z, @NotNull RoundingMode roundingMode, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull DisplaySign displaySign, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, z, roundingMode, z2, z3, z4, z5, displaySign, z6, false, 256, null);
    }

    @Override // o.gKO
    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, TokenBase tokenBase, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (C22416heu.iwGUEr()) {
            C31204lpc.Companion.copydefault(str, tokenBase, i, str2, (48 & 16) != 0 ? "0" : null, (48 & 32) != 0 ? null : null, function0).show(fragmentManager, "QuickBuySellBottomSheet");
        }
    }

    @Override // o.gKO
    public void KWHzl(@NotNull InterfaceC19677gLf interfaceC19677gLf, InterfaceC19674gLc interfaceC19674gLc) {
        Intrinsics.checkNotNullParameter(interfaceC19677gLf, "");
        this.EZpvd = interfaceC19677gLf;
        this.copydefault = interfaceC19674gLc;
        C19675gLd.OLrzqt.OLrzqt(interfaceC19677gLf, interfaceC19674gLc);
    }

    public final java.lang.String copydefault(BridgeRedeemCallDataObject bridgeRedeemCallDataObject) {
        if (bridgeRedeemCallDataObject == null) {
            return "";
        }
        java.lang.String strCopydefault = C33491mxU.copydefault(bridgeRedeemCallDataObject.getValue());
        java.lang.String to = bridgeRedeemCallDataObject.getTo();
        java.lang.String from = bridgeRedeemCallDataObject.getFrom();
        java.lang.String data = bridgeRedeemCallDataObject.getData();
        return C23316hvt.OLrzqt(new EVMContractSignData(null, C33491mxU.copydefault(bridgeRedeemCallDataObject.getGasPrice()), C33491mxU.copydefault(bridgeRedeemCallDataObject.getGas()), strCopydefault, to, data, from, null, null, null, null, null, null, null, 16257, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.gKO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull gKU gku, @NotNull Continuation<? super gKV> continuation) throws java.lang.Throwable {
        DexTradeApiImpl$getStrategyOrderCount$1 dexTradeApiImpl$getStrategyOrderCount$1;
        java.util.ArrayList arrayList;
        if (continuation instanceof DexTradeApiImpl$getStrategyOrderCount$1) {
            dexTradeApiImpl$getStrategyOrderCount$1 = (DexTradeApiImpl$getStrategyOrderCount$1) continuation;
            int i = dexTradeApiImpl$getStrategyOrderCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexTradeApiImpl$getStrategyOrderCount$1.label = i - Integer.MIN_VALUE;
            } else {
                dexTradeApiImpl$getStrategyOrderCount$1 = new DexTradeApiImpl$getStrategyOrderCount$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = dexTradeApiImpl$getStrategyOrderCount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexTradeApiImpl$getStrategyOrderCount$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            gZF gzf = this.OLrzqt;
            if (gzf == null) {
                Intrinsics.gEmmrt("");
                gzf = null;
            }
            java.lang.String strCopydefault = gku.copydefault();
            java.util.List<java.lang.String> listAEQbTJ = gku.AEQbTJ();
            java.util.List<OrderStatus> listEZpvd = gku.EZpvd();
            if (listEZpvd != null) {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
                java.util.Iterator<T> it = listEZpvd.iterator();
                while (it.hasNext()) {
                    arrayList.add(C56443yFo.AEQbTJ(((OrderStatus) it.next()).getStatus()));
                }
            } else {
                arrayList = null;
            }
            GetOrderCountRequest getOrderCountRequest = new GetOrderCountRequest(strCopydefault, listAEQbTJ, arrayList);
            dexTradeApiImpl$getStrategyOrderCount$1.label = 1;
            objAEQbTJ = gzf.AEQbTJ(getOrderCountRequest, dexTradeApiImpl$getStrategyOrderCount$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
        if (abstractC43419rot.OLrzqt()) {
            return null;
        }
        return abstractC43419rot.copydefault();
    }

    @Override // o.gKO
    public void OLrzqt(@NotNull android.content.Context context, @NotNull OrderListParams orderListParams) {
        OrderListPageType orderListPageType;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(orderListParams, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC22185hab.class);
        int i = Activity.copydefault[orderListParams.EZpvd().ordinal()];
        if (i == 1) {
            orderListPageType = OrderListPageType.OpenOrder;
        } else if (i == 2) {
            orderListPageType = OrderListPageType.History;
        } else if (i == 3) {
            orderListPageType = OrderListPageType.Trades;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            orderListPageType = OrderListPageType.Bridge;
        }
        Intrinsics.copydefault(orderListPageType, "");
        intent.putExtra("type", (android.os.Parcelable) orderListPageType);
        if (orderListParams.KWHzl().length() > 0) {
            intent.putExtra("chain_id", orderListParams.KWHzl());
        }
        context.startActivity(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.gKO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DustTokenQuoteParam dustTokenQuoteParam, @NotNull Continuation<? super AbstractC43419rot<SmallAssetQuoteData, OKServerException>> continuation) throws java.lang.Throwable {
        DexTradeApiImpl$smallAssetBatchQuote$1 dexTradeApiImpl$smallAssetBatchQuote$1;
        if (continuation instanceof DexTradeApiImpl$smallAssetBatchQuote$1) {
            dexTradeApiImpl$smallAssetBatchQuote$1 = (DexTradeApiImpl$smallAssetBatchQuote$1) continuation;
            int i = dexTradeApiImpl$smallAssetBatchQuote$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexTradeApiImpl$smallAssetBatchQuote$1.label = i - Integer.MIN_VALUE;
            } else {
                dexTradeApiImpl$smallAssetBatchQuote$1 = new DexTradeApiImpl$smallAssetBatchQuote$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dexTradeApiImpl$smallAssetBatchQuote$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexTradeApiImpl$smallAssetBatchQuote$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.gEmmrt;
                if (coroutineDispatcher == null) {
                    Intrinsics.gEmmrt("");
                    coroutineDispatcher = null;
                }
                DexTradeApiImpl$smallAssetBatchQuote$$inlined$getApiResult$1 dexTradeApiImpl$smallAssetBatchQuote$$inlined$getApiResult$1 = new DexTradeApiImpl$smallAssetBatchQuote$$inlined$getApiResult$1(null, this, dustTokenQuoteParam);
                dexTradeApiImpl$smallAssetBatchQuote$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, dexTradeApiImpl$smallAssetBatchQuote$$inlined$getApiResult$1, dexTradeApiImpl$smallAssetBatchQuote$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.gKO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull CheckRepeatParam checkRepeatParam, @NotNull Continuation<? super AbstractC43419rot<CheckRepeatResult, OKServerException>> continuation) throws java.lang.Throwable {
        DexTradeApiImpl$smallAssetCheckRepeat$1 dexTradeApiImpl$smallAssetCheckRepeat$1;
        if (continuation instanceof DexTradeApiImpl$smallAssetCheckRepeat$1) {
            dexTradeApiImpl$smallAssetCheckRepeat$1 = (DexTradeApiImpl$smallAssetCheckRepeat$1) continuation;
            int i = dexTradeApiImpl$smallAssetCheckRepeat$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexTradeApiImpl$smallAssetCheckRepeat$1.label = i - Integer.MIN_VALUE;
            } else {
                dexTradeApiImpl$smallAssetCheckRepeat$1 = new DexTradeApiImpl$smallAssetCheckRepeat$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dexTradeApiImpl$smallAssetCheckRepeat$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexTradeApiImpl$smallAssetCheckRepeat$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.gEmmrt;
                if (coroutineDispatcher == null) {
                    Intrinsics.gEmmrt("");
                    coroutineDispatcher = null;
                }
                DexTradeApiImpl$smallAssetCheckRepeat$$inlined$getApiResult$1 dexTradeApiImpl$smallAssetCheckRepeat$$inlined$getApiResult$1 = new DexTradeApiImpl$smallAssetCheckRepeat$$inlined$getApiResult$1(null, this, checkRepeatParam);
                dexTradeApiImpl$smallAssetCheckRepeat$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, dexTradeApiImpl$smallAssetCheckRepeat$$inlined$getApiResult$1, dexTradeApiImpl$smallAssetCheckRepeat$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.gKO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull SmallAssetOrderParam smallAssetOrderParam, @NotNull Continuation<? super AbstractC43419rot<? extends JsonElement, OKServerException>> continuation) throws java.lang.Throwable {
        DexTradeApiImpl$smallAssetBatchCreateOrder$1 dexTradeApiImpl$smallAssetBatchCreateOrder$1;
        if (continuation instanceof DexTradeApiImpl$smallAssetBatchCreateOrder$1) {
            dexTradeApiImpl$smallAssetBatchCreateOrder$1 = (DexTradeApiImpl$smallAssetBatchCreateOrder$1) continuation;
            int i = dexTradeApiImpl$smallAssetBatchCreateOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexTradeApiImpl$smallAssetBatchCreateOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                dexTradeApiImpl$smallAssetBatchCreateOrder$1 = new DexTradeApiImpl$smallAssetBatchCreateOrder$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dexTradeApiImpl$smallAssetBatchCreateOrder$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexTradeApiImpl$smallAssetBatchCreateOrder$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.gEmmrt;
                if (coroutineDispatcher == null) {
                    Intrinsics.gEmmrt("");
                    coroutineDispatcher = null;
                }
                DexTradeApiImpl$smallAssetBatchCreateOrder$$inlined$getApiResult$1 dexTradeApiImpl$smallAssetBatchCreateOrder$$inlined$getApiResult$1 = new DexTradeApiImpl$smallAssetBatchCreateOrder$$inlined$getApiResult$1(null, this, smallAssetOrderParam);
                dexTradeApiImpl$smallAssetBatchCreateOrder$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, dexTradeApiImpl$smallAssetBatchCreateOrder$$inlined$getApiResult$1, dexTradeApiImpl$smallAssetBatchCreateOrder$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    @Override // o.gKO
    public boolean fARcdN() {
        return C22416heu.fetchVPNInfo();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.gKO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainInfo>, OKServerException>> continuation) throws java.lang.Throwable {
        DexTradeApiImpl$getDexSingleChainList$1 dexTradeApiImpl$getDexSingleChainList$1;
        if (continuation instanceof DexTradeApiImpl$getDexSingleChainList$1) {
            dexTradeApiImpl$getDexSingleChainList$1 = (DexTradeApiImpl$getDexSingleChainList$1) continuation;
            int i = dexTradeApiImpl$getDexSingleChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexTradeApiImpl$getDexSingleChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                dexTradeApiImpl$getDexSingleChainList$1 = new DexTradeApiImpl$getDexSingleChainList$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = dexTradeApiImpl$getDexSingleChainList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexTradeApiImpl$getDexSingleChainList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            kUP kup = this.AYXKKw;
            if (kup == null) {
                Intrinsics.gEmmrt("");
                kup = null;
            }
            dexTradeApiImpl$getDexSingleChainList$1.label = 1;
            objKWHzl = kup.KWHzl(dexTradeApiImpl$getDexSingleChainList$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objKWHzl;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            java.util.List list = (java.util.List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((DefiChainInfo) it.next()).toChainInfo());
            }
            return new AbstractC43419rot.StateListAnimator(arrayList);
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }
}
