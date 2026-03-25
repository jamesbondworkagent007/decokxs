package o;

import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.SwapCoinPairPo;
import com.okinc.business.market.features.analysis.futures.sub.funding.domain.usecase.GetSwapCoinsUseCase$onExecute$1;
import com.okinc.business.market.features.analysis.futures.sub.funding.domain.usecase.GetSwapCoinsUseCase$toVo$1;
import com.okinc.business.market.features.analysis.futures.sub.funding.ui.model.CoinPairVo;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC54577xNn;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jJu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25880jJu extends AbstractC49400uno<kotlin.Pair<? extends CoinPairVo, ? extends java.lang.String>, java.util.List<? extends CoinPairVo>> {
    public final InterfaceC54577xNn AEQbTJ;
    public final CoroutineDispatcher KWHzl;
    public final C25878jJs OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((kotlin.Pair<CoinPairVo, java.lang.String>) obj, (Continuation<? super java.util.List<CoinPairVo>>) continuation);
    }

    @yCM
    public C25880jJu(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn, @NotNull C25878jJs c25878jJs) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c25878jJs, "");
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = interfaceC54577xNn;
        this.OLrzqt = c25878jJs;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull kotlin.Pair<CoinPairVo, java.lang.String> pair, @NotNull Continuation<? super java.util.List<CoinPairVo>> continuation) throws java.lang.Throwable {
        GetSwapCoinsUseCase$onExecute$1 getSwapCoinsUseCase$onExecute$1;
        C25880jJu c25880jJu;
        CoinPairVo coinPairVo;
        java.util.List list;
        if (continuation instanceof GetSwapCoinsUseCase$onExecute$1) {
            getSwapCoinsUseCase$onExecute$1 = (GetSwapCoinsUseCase$onExecute$1) continuation;
            int i = getSwapCoinsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSwapCoinsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getSwapCoinsUseCase$onExecute$1 = new GetSwapCoinsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getSwapCoinsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSwapCoinsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            CoinPairVo first = pair.getFirst();
            java.lang.String second = pair.getSecond();
            C25878jJs c25878jJs = this.OLrzqt;
            getSwapCoinsUseCase$onExecute$1.L$0 = this;
            getSwapCoinsUseCase$onExecute$1.L$1 = first;
            getSwapCoinsUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd2 = c25878jJs.EZpvd(second, getSwapCoinsUseCase$onExecute$1);
            if (objEZpvd2 == objCopydefault) {
                return objCopydefault;
            }
            c25880jJu = this;
            objEZpvd = objEZpvd2;
            coinPairVo = first;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                list = (java.util.List) objEZpvd;
                if (list != null) {
                    return list;
                }
                return yDY.AhwBna();
            }
            coinPairVo = (CoinPairVo) getSwapCoinsUseCase$onExecute$1.L$1;
            c25880jJu = (C25880jJu) getSwapCoinsUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.List<SwapCoinPairPo> list2 = (java.util.List) objEZpvd;
        if (list2 != null) {
            getSwapCoinsUseCase$onExecute$1.L$0 = null;
            getSwapCoinsUseCase$onExecute$1.L$1 = null;
            getSwapCoinsUseCase$onExecute$1.label = 2;
            objEZpvd = c25880jJu.EZpvd(list2, coinPairVo, getSwapCoinsUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            list = (java.util.List) objEZpvd;
            if (list != null) {
            }
        }
        return yDY.AhwBna();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.List<SwapCoinPairPo> list, CoinPairVo coinPairVo, Continuation<? super java.util.List<CoinPairVo>> continuation) throws java.lang.Throwable {
        GetSwapCoinsUseCase$toVo$1 getSwapCoinsUseCase$toVo$1;
        java.util.List<SwapCoinPairPo> list2;
        CoinPairVo coinPairVo2;
        C25880jJu c25880jJu;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.lang.Object objEZpvd;
        CoinPairVo coinPairVo3;
        java.util.List<SwapCoinPairPo> list3;
        if (continuation instanceof GetSwapCoinsUseCase$toVo$1) {
            getSwapCoinsUseCase$toVo$1 = (GetSwapCoinsUseCase$toVo$1) continuation;
            int i = getSwapCoinsUseCase$toVo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSwapCoinsUseCase$toVo$1.label = i - Integer.MIN_VALUE;
            } else {
                getSwapCoinsUseCase$toVo$1 = new GetSwapCoinsUseCase$toVo$1(this, continuation);
            }
        }
        java.lang.Object obj = getSwapCoinsUseCase$toVo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSwapCoinsUseCase$toVo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNn2 = this.AEQbTJ;
            if (interfaceC54577xNn2 != null) {
                xNE xne = new xNE();
                getSwapCoinsUseCase$toVo$1.L$0 = this;
                list2 = list;
                getSwapCoinsUseCase$toVo$1.L$1 = list2;
                coinPairVo2 = coinPairVo;
                getSwapCoinsUseCase$toVo$1.L$2 = coinPairVo2;
                getSwapCoinsUseCase$toVo$1.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn2, false, xne, getSwapCoinsUseCase$toVo$1, 1, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c25880jJu = this;
            } else {
                list2 = list;
                coinPairVo2 = coinPairVo;
                c25880jJu = this;
                interfaceC54577xNn = c25880jJu.AEQbTJ;
                if (interfaceC54577xNn != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
                    getSwapCoinsUseCase$toVo$1.L$0 = list2;
                    getSwapCoinsUseCase$toVo$1.L$1 = coinPairVo2;
                    getSwapCoinsUseCase$toVo$1.L$2 = null;
                    getSwapCoinsUseCase$toVo$1.label = 2;
                    objEZpvd = interfaceC54581xNrOLrzqt.EZpvd("SWAP", getSwapCoinsUseCase$toVo$1);
                    if (objEZpvd != objCopydefault) {
                        return objCopydefault;
                    }
                    coinPairVo3 = coinPairVo2;
                    list3 = list2;
                    obj = objEZpvd;
                    list2 = list3;
                    coinPairVo2 = coinPairVo3;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (r1.hasNext()) {
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
                arrayList2.add(0, new CoinPairVo(null, C33070mpX.AYXKKw(qZH.PendingIntent.ORWKdN), coinPairVo2.getInstId() == null));
                return arrayList2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coinPairVo3 = (CoinPairVo) getSwapCoinsUseCase$toVo$1.L$1;
                list3 = (java.util.List) getSwapCoinsUseCase$toVo$1.L$0;
                C56391yDq.AEQbTJ(obj);
                list2 = list3;
                coinPairVo2 = coinPairVo3;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (SwapCoinPairPo swapCoinPairPo : list2) {
                    java.lang.String instId = swapCoinPairPo.getInstId();
                    java.lang.String titleByIdAndType$default = C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, swapCoinPairPo.getInstId(), "SWAP", false, false, false, 24, null);
                    CoinPairVo coinPairVo4 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) titleByIdAndType$default) ? null : new CoinPairVo(instId, titleByIdAndType$default, Intrinsics.EZpvd((java.lang.Object) swapCoinPairPo.getInstId(), (java.lang.Object) coinPairVo2.getInstId()));
                    if (coinPairVo4 != null) {
                        arrayList3.add(coinPairVo4);
                    }
                }
                java.util.ArrayList arrayList22 = new java.util.ArrayList(arrayList3);
                arrayList22.add(0, new CoinPairVo(null, C33070mpX.AYXKKw(qZH.PendingIntent.ORWKdN), coinPairVo2.getInstId() == null));
                return arrayList22;
            }
            CoinPairVo coinPairVo5 = (CoinPairVo) getSwapCoinsUseCase$toVo$1.L$2;
            java.util.List<SwapCoinPairPo> list4 = (java.util.List) getSwapCoinsUseCase$toVo$1.L$1;
            c25880jJu = (C25880jJu) getSwapCoinsUseCase$toVo$1.L$0;
            C56391yDq.AEQbTJ(obj);
            coinPairVo2 = coinPairVo5;
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
            list2 = list4;
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        interfaceC54577xNn = c25880jJu.AEQbTJ;
        if (interfaceC54577xNn != null) {
            getSwapCoinsUseCase$toVo$1.L$0 = list2;
            getSwapCoinsUseCase$toVo$1.L$1 = coinPairVo2;
            getSwapCoinsUseCase$toVo$1.L$2 = null;
            getSwapCoinsUseCase$toVo$1.label = 2;
            objEZpvd = interfaceC54581xNrOLrzqt.EZpvd("SWAP", getSwapCoinsUseCase$toVo$1);
            if (objEZpvd != objCopydefault) {
            }
        }
        java.util.ArrayList arrayList32 = new java.util.ArrayList();
        while (r1.hasNext()) {
        }
        java.util.ArrayList arrayList222 = new java.util.ArrayList(arrayList32);
        arrayList222.add(0, new CoinPairVo(null, C33070mpX.AYXKKw(qZH.PendingIntent.ORWKdN), coinPairVo2.getInstId() == null));
        return arrayList222;
    }
}
