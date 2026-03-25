package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.V6CallData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketEVMTxV6UseCase$submitOrderWithDualSign$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.WalletDexService;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kRg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28164kRg extends kRB {
    public final CoroutineDispatcher AEQbTJ;
    public final C28180kRw AYXKKw;
    public final C28195kSk EZpvd;
    public final C23212htv KWHzl;
    public final C19700gMb OLrzqt;
    public final gYX copydefault;
    public final C28196kSl gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kRB
    public C19700gMb AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kRB
    public C28196kSl EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kRB
    public gYX KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kRB
    public CoroutineDispatcher OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kRB
    public C28180kRw copydefault() {
        return this.AYXKKw;
    }

    @yCM
    public C28164kRg(@NotNull C23212htv c23212htv, @NotNull C28196kSl c28196kSl, @NotNull gYX gyx, @NotNull C28180kRw c28180kRw, @NotNull C28195kSk c28195kSk, @NotNull C19700gMb c19700gMb, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(gyx, "");
        Intrinsics.checkNotNullParameter(c28180kRw, "");
        Intrinsics.checkNotNullParameter(c28195kSk, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c23212htv;
        this.gEmmrt = c28196kSl;
        this.copydefault = gyx;
        this.AYXKKw = c28180kRw;
        this.EZpvd = c28195kSk;
        this.OLrzqt = c19700gMb;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.kRB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull V6CalldataResponseData v6CalldataResponseData, @NotNull ApproveUnsignedData approveUnsignedData, boolean z, @NotNull FragmentActivity fragmentActivity, boolean z2, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        AdvancedMarketEVMTxV6UseCase$submitOrderWithDualSign$1 advancedMarketEVMTxV6UseCase$submitOrderWithDualSign$1;
        DexMultiTokenInfoBean fromToken;
        DexMultiTokenInfoBean fromToken2;
        if (continuation instanceof AdvancedMarketEVMTxV6UseCase$submitOrderWithDualSign$1) {
            advancedMarketEVMTxV6UseCase$submitOrderWithDualSign$1 = (AdvancedMarketEVMTxV6UseCase$submitOrderWithDualSign$1) continuation;
            int i = advancedMarketEVMTxV6UseCase$submitOrderWithDualSign$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMarketEVMTxV6UseCase$submitOrderWithDualSign$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMarketEVMTxV6UseCase$submitOrderWithDualSign$1 = new AdvancedMarketEVMTxV6UseCase$submitOrderWithDualSign$1(this, continuation);
            }
        }
        java.lang.Object obj = advancedMarketEVMTxV6UseCase$submitOrderWithDualSign$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMarketEVMTxV6UseCase$submitOrderWithDualSign$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String chainId = (commonDexInfo == null || (fromToken2 = commonDexInfo.getFromToken()) == null) ? null : fromToken2.getChainId();
        if (chainId == null) {
            chainId = "";
        }
        java.lang.String str = chainId;
        C28195kSk c28195kSk = this.EZpvd;
        CommonDexInfo commonDexInfo2 = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String tokenContractAddress = (commonDexInfo2 == null || (fromToken = commonDexInfo2.getFromToken()) == null) ? null : fromToken.getTokenContractAddress();
        CommonDexInfo commonDexInfo3 = v6BaseQuoteResponse.getCommonDexInfo();
        C28194kSj c28194kSj = new C28194kSj(str, v6CalldataResponseData, approveUnsignedData, z, tokenContractAddress, commonDexInfo3 != null ? commonDexInfo3.getFromTokenAmount() : null, z2);
        advancedMarketEVMTxV6UseCase$submitOrderWithDualSign$1.label = 1;
        java.lang.Object objOLrzqt = c28195kSk.OLrzqt(c28194kSj, fragmentActivity, advancedMarketEVMTxV6UseCase$submitOrderWithDualSign$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }

    @Override // o.kRB
    public AbstractC58185ywX<kotlin.Pair<InterfaceC9734bbF, V6BaseQuoteResponse>> KWHzl(@NotNull final V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull V6CalldataResponseData v6CalldataResponseData, final boolean z, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        DexMultiTokenInfoBean fromToken;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(v6CalldataResponseData, "");
        java.lang.Object objOLrzqt = OLrzqt(v6CalldataResponseData.getCallData());
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
        if (thM7380exceptionOrNullimpl != null) {
            AbstractC58185ywX<kotlin.Pair<InterfaceC9734bbF, V6BaseQuoteResponse>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(thM7380exceptionOrNullimpl);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }
        BaseSignData baseSignData = (BaseSignData) objOLrzqt;
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        final java.lang.String chainId = (commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getChainId();
        AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> abstractC58260yxtKWHzl = EZpvd().KWHzl(new SignDataArgs<>(EZpvd().copydefault(), null, C33129mqd.valueOf(chainId), baseSignData, null, null, null, null, null, null, 3, null, null, 1, null, function1, null, false, false, null, false, true, false, false, 14638066, null));
        final Function1 function12 = new Function1() { // from class: o.kRe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28164kRg.KWHzl(this.KWHzl, chainId, z, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.kRi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C28164kRg.AYXKKw(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.kRk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28164kRg.copydefault(v6BaseQuoteResponse, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<InterfaceC9734bbF, V6BaseQuoteResponse>> abstractC58185ywXAEQbTJ2 = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.kRl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C28164kRg.djBIcL(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final InterfaceC60096zvd AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C28164kRg c28164kRg, java.lang.String str, boolean z, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        AbstractC58185ywX<java.util.List<WalletDexService.SupportedMevNodeBean>> abstractC58185ywXEZpvd = c28164kRg.EZpvd(str, z);
        final Function1 function1 = new Function1() { // from class: o.kRj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28164kRg.KWHzl(pair, (java.util.List) obj);
            }
        };
        return abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.kRm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C28164kRg.AEQbTJ(function1, obj);
            }
        });
    }

    public static final kotlin.Pair KWHzl(kotlin.Pair pair, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.Object first = pair.getFirst();
        InterfaceC9743bbO interfaceC9743bbO = first instanceof InterfaceC9743bbO ? (InterfaceC9743bbO) first : null;
        if (!list.isEmpty()) {
            if (interfaceC9743bbO != null) {
                interfaceC9743bbO.a_(list);
            }
        } else if (interfaceC9743bbO != null) {
            interfaceC9743bbO.fARcdN();
        }
        return pair;
    }

    public static final kotlin.Pair copydefault(V6BaseQuoteResponse v6BaseQuoteResponse, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return C56390yDp.OLrzqt(pair.getFirst(), v6BaseQuoteResponse);
    }

    public static final kotlin.Pair djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.kRB
    public java.util.List<java.lang.String> OLrzqt(@NotNull NewCallbackBean newCallbackBean, @NotNull V6CalldataResponseData v6CalldataResponseData) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        Intrinsics.checkNotNullParameter(v6CalldataResponseData, "");
        NewCallbackBean.DexCallbackBean dexCallbackBean = newCallbackBean.getDexCallbackBean();
        if (dexCallbackBean != null) {
            return dexCallbackBean.getMevSuppliers();
        }
        return null;
    }

    public static final java.util.List valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<com.okinc.wallet.api.WalletDexService$SupportedMevNodeBean>> */
    @Override // o.kRB
    public AbstractC58185ywX<java.util.List<WalletDexService.SupportedMevNodeBean>> EZpvd(final java.lang.String str, final boolean z) {
        AbstractC58185ywX<java.util.ArrayList<WalletDexService.SupportedMevNodeBean>> abstractC58185ywXAEQbTJ = EZpvd().AEQbTJ();
        final Function1 function1 = new Function1() { // from class: o.kRn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28164kRg.copydefault(z, str, (java.util.ArrayList) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.kRq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C28164kRg.valueOf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final java.util.List copydefault(boolean z, java.lang.String str, java.util.ArrayList arrayList) throws OKServerException {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (!z) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            java.util.List<java.lang.Integer> chainIds = ((WalletDexService.SupportedMevNodeBean) obj).getChainIds();
            if (chainIds != null && !chainIds.isEmpty()) {
                java.util.Iterator<T> it = chainIds.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()), (java.lang.Object) str)) {
                        arrayList2.add(obj);
                        break;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            throw new OKServerException(C33129mqd.AhwBna("1000005555"), null, null, null, 14, null);
        }
        return arrayList2;
    }

    public final java.lang.Object OLrzqt(V6CallData v6CallData) {
        if (v6CallData == null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null)));
        }
        Result.Application application2 = Result.Companion;
        java.lang.String strCopydefault = C33491mxU.copydefault(v6CallData.getValue());
        java.lang.String to = v6CallData.getTo();
        java.lang.String from = v6CallData.getFrom();
        java.lang.String data = v6CallData.getData();
        java.lang.String maxFeePerGas = v6CallData.getMaxFeePerGas();
        java.lang.String strCopydefault2 = maxFeePerGas != null ? C33491mxU.copydefault(maxFeePerGas) : null;
        java.lang.String maxPriorityFeePerGas = v6CallData.getMaxPriorityFeePerGas();
        java.lang.String strCopydefault3 = maxPriorityFeePerGas != null ? C33491mxU.copydefault(maxPriorityFeePerGas) : null;
        java.lang.String strCopydefault4 = C33491mxU.copydefault(v6CallData.getGas());
        java.lang.String gasPrice = v6CallData.getGasPrice();
        return Result.m7377constructorimpl(new EVMContractSignData(null, gasPrice != null ? C33491mxU.copydefault(gasPrice) : null, strCopydefault4, strCopydefault, to, data, from, null, null, strCopydefault2, strCopydefault3, null, null, null, 14721, null));
    }
}
