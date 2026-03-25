package o;

import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig;
import com.okinc.business.dex.trade.core.domain.model.common.V6CallData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.WalletDexService;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kWS extends AbstractC28328kXi {
    public final C28195kSk AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final gYX KWHzl;
    public final C23212htv OLrzqt;
    public final C19700gMb copydefault;
    public final kKG djBIcL;
    public final C28327kXh gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public kKG AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public gYX EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public C19700gMb KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public C28195kSk OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public C28327kXh copydefault() {
        return this.gEmmrt;
    }

    @yCM
    public kWS(@NotNull C23212htv c23212htv, @NotNull kKG kkg, @NotNull gYX gyx, @NotNull C28327kXh c28327kXh, @NotNull C28195kSk c28195kSk, @NotNull C19700gMb c19700gMb, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(gyx, "");
        Intrinsics.checkNotNullParameter(c28327kXh, "");
        Intrinsics.checkNotNullParameter(c28195kSk, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = c23212htv;
        this.djBIcL = kkg;
        this.KWHzl = gyx;
        this.gEmmrt = c28327kXh;
        this.AEQbTJ = c28195kSk;
        this.copydefault = c19700gMb;
        this.EZpvd = coroutineDispatcher;
    }

    @Override // o.AbstractC28328kXi
    public java.util.List<java.lang.String> copydefault(NewCallbackBean.DexCallbackBean dexCallbackBean, MevConfig mevConfig) {
        if (mevConfig == null || !mevConfig.getEnableMev() || dexCallbackBean == null) {
            return null;
        }
        return dexCallbackBean.getMevSuppliers();
    }

    @Override // o.AbstractC28328kXi
    public AbstractC58185ywX<kotlin.Pair<InterfaceC9734bbF, V6BaseQuoteResponse>> copydefault(@NotNull final V6BaseQuoteResponse v6BaseQuoteResponse, V6CalldataResponseData v6CalldataResponseData, java.lang.String str, final boolean z, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        DexMultiTokenInfoBean fromToken;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        final java.lang.String chainId = null;
        java.lang.Object objOLrzqt = OLrzqt(v6CalldataResponseData != null ? v6CalldataResponseData.getCallData() : null);
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
        if (thM7380exceptionOrNullimpl != null) {
            AbstractC58185ywX<kotlin.Pair<InterfaceC9734bbF, V6BaseQuoteResponse>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(thM7380exceptionOrNullimpl);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }
        BaseSignData baseSignData = (BaseSignData) objOLrzqt;
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        if (commonDexInfo != null && (fromToken = commonDexInfo.getFromToken()) != null) {
            chainId = fromToken.getChainId();
        }
        AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> abstractC58260yxtKWHzl = AhwBna().KWHzl(new SignDataArgs<>(AhwBna().OLrzqt(), null, C33129mqd.valueOf(chainId), baseSignData, null, null, null, null, null, null, 3, null, null, 1, null, function1, null, false, false, null, false, true, false, false, 14638066, null));
        final Function1 function12 = new Function1() { // from class: o.kXb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kWS.OLrzqt(this.KWHzl, chainId, z, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.kWX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return kWS.AYXKKw(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.kXa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kWS.AEQbTJ(v6BaseQuoteResponse, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<InterfaceC9734bbF, V6BaseQuoteResponse>> abstractC58185ywXAEQbTJ2 = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.kWY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return kWS.gEmmrt(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final InterfaceC60096zvd AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(kWS kws, java.lang.String str, boolean z, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        AbstractC58185ywX<java.util.List<WalletDexService.SupportedMevNodeBean>> abstractC58185ywXCopydefault = kws.copydefault(str, z);
        final Function1 function1 = new Function1() { // from class: o.kWW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kWS.OLrzqt(pair, (java.util.List) obj);
            }
        };
        return abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.kWU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return kWS.OLrzqt(function1, obj);
            }
        });
    }

    public static final kotlin.Pair OLrzqt(kotlin.Pair pair, java.util.List list) {
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

    public static final kotlin.Pair AEQbTJ(V6BaseQuoteResponse v6BaseQuoteResponse, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return C56390yDp.OLrzqt(pair.getFirst(), v6BaseQuoteResponse);
    }

    public static final kotlin.Pair gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<com.okinc.wallet.api.WalletDexService$SupportedMevNodeBean>> */
    @Override // o.AbstractC28328kXi
    public AbstractC58185ywX<java.util.List<WalletDexService.SupportedMevNodeBean>> copydefault(final java.lang.String str, boolean z) {
        if (!z) {
            AbstractC58185ywX<java.util.List<WalletDexService.SupportedMevNodeBean>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(yDY.AhwBna());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<java.util.ArrayList<WalletDexService.SupportedMevNodeBean>> abstractC58185ywXAEQbTJ = AhwBna().AEQbTJ();
        final Function1 function1 = new Function1() { // from class: o.kWV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kWS.KWHzl(str, (java.util.ArrayList) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.kWT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return kWS.AhwBna(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final java.util.List AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public final java.lang.Object OLrzqt(V6CallData v6CallData) {
        if (v6CallData == null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.NullPointerException("callData is null")));
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

    public static final java.util.List KWHzl(java.lang.String str, java.util.ArrayList arrayList) throws OKServerException {
        Intrinsics.checkNotNullParameter(arrayList, "");
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
}
