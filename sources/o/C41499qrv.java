package o;

import com.okinc.market.quotation.domain.dex.GetDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1;
import com.okinc.market.quotation.domain.dex.GetDexVosWithWatchingUseCase$mergeWithWatchingFlow$1;
import com.okinc.market.quotation.domain.dex.GetDexVosWithWatchingUseCase$mergeWithWatchingFlow$resultFlow$1;
import com.okinc.market.quotation.domain.dex.GetDexVosWithWatchingUseCase$onExecute$1;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41499qrv extends AbstractC49400uno<C41500qrw, Flow<? extends java.util.List<? extends InterfaceC41655qus>>> {
    public final CoroutineDispatcher AEQbTJ;
    public final C41494qrq EZpvd;
    public final C41483qrf KWHzl;
    public final C40486qXq OLrzqt;
    public final C41452qrA copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public C41499qrv(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41494qrq c41494qrq, @NotNull C41483qrf c41483qrf, @NotNull C40486qXq c40486qXq, @NotNull C41452qrA c41452qrA) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41494qrq, "");
        Intrinsics.checkNotNullParameter(c41483qrf, "");
        Intrinsics.checkNotNullParameter(c40486qXq, "");
        Intrinsics.checkNotNullParameter(c41452qrA, "");
        this.AEQbTJ = coroutineDispatcher;
        this.EZpvd = c41494qrq;
        this.KWHzl = c41483qrf;
        this.OLrzqt = c40486qXq;
        this.copydefault = c41452qrA;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8 A[PHI: r11
  0x00b8: PHI (r11v10 java.lang.Object) = (r11v9 java.lang.Object), (r11v1 java.lang.Object) binds: [B:26:0x00b5, B:13:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41500qrw c41500qrw, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41655qus>>> continuation) throws java.lang.Throwable {
        GetDexVosWithWatchingUseCase$onExecute$1 getDexVosWithWatchingUseCase$onExecute$1;
        C41499qrv c41499qrv;
        if (continuation instanceof GetDexVosWithWatchingUseCase$onExecute$1) {
            getDexVosWithWatchingUseCase$onExecute$1 = (GetDexVosWithWatchingUseCase$onExecute$1) continuation;
            int i = getDexVosWithWatchingUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexVosWithWatchingUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexVosWithWatchingUseCase$onExecute$1 = new GetDexVosWithWatchingUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getDexVosWithWatchingUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDexVosWithWatchingUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C41434qqj.KWHzl.KWHzl("GetDexVosWithWatchingUseCase", "get dex vos with watching, [input: " + c41500qrw + "]");
            getDexVosWithWatchingUseCase$onExecute$1.L$0 = this;
            getDexVosWithWatchingUseCase$onExecute$1.L$1 = c41500qrw;
            getDexVosWithWatchingUseCase$onExecute$1.label = 1;
            objKWHzl = KWHzl(c41500qrw, (Continuation<? super java.util.List<? extends InterfaceC41655qus>>) getDexVosWithWatchingUseCase$onExecute$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c41499qrv = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C56391yDq.AEQbTJ(objKWHzl);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c41500qrw = (C41500qrw) getDexVosWithWatchingUseCase$onExecute$1.L$1;
                c41499qrv = (C41499qrv) getDexVosWithWatchingUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                java.lang.String strGEmmrt = c41500qrw.gEmmrt();
                getDexVosWithWatchingUseCase$onExecute$1.L$0 = null;
                getDexVosWithWatchingUseCase$onExecute$1.L$1 = null;
                getDexVosWithWatchingUseCase$onExecute$1.label = 3;
                objKWHzl = c41499qrv.EZpvd((java.util.List) objKWHzl, strGEmmrt, getDexVosWithWatchingUseCase$onExecute$1);
                return objKWHzl != objCopydefault ? objCopydefault : objKWHzl;
            }
            c41500qrw = (C41500qrw) getDexVosWithWatchingUseCase$onExecute$1.L$1;
            c41499qrv = (C41499qrv) getDexVosWithWatchingUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        C41452qrA c41452qrA = c41499qrv.copydefault;
        Triple triple = new Triple(c41500qrw.AhwBna().getFirst(), c41500qrw.AhwBna().getSecond(), (java.util.List) objKWHzl);
        getDexVosWithWatchingUseCase$onExecute$1.L$0 = c41499qrv;
        getDexVosWithWatchingUseCase$onExecute$1.L$1 = c41500qrw;
        getDexVosWithWatchingUseCase$onExecute$1.label = 2;
        objKWHzl = c41452qrA.EZpvd(triple, getDexVosWithWatchingUseCase$onExecute$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        java.lang.String strGEmmrt2 = c41500qrw.gEmmrt();
        getDexVosWithWatchingUseCase$onExecute$1.L$0 = null;
        getDexVosWithWatchingUseCase$onExecute$1.L$1 = null;
        getDexVosWithWatchingUseCase$onExecute$1.label = 3;
        objKWHzl = c41499qrv.EZpvd((java.util.List) objKWHzl, strGEmmrt2, getDexVosWithWatchingUseCase$onExecute$1);
        if (objKWHzl != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.List<? extends InterfaceC41655qus> list, java.lang.String str, Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41655qus>>> continuation) throws java.lang.Throwable {
        GetDexVosWithWatchingUseCase$mergeWithWatchingFlow$1 getDexVosWithWatchingUseCase$mergeWithWatchingFlow$1;
        if (continuation instanceof GetDexVosWithWatchingUseCase$mergeWithWatchingFlow$1) {
            getDexVosWithWatchingUseCase$mergeWithWatchingFlow$1 = (GetDexVosWithWatchingUseCase$mergeWithWatchingFlow$1) continuation;
            int i = getDexVosWithWatchingUseCase$mergeWithWatchingFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexVosWithWatchingUseCase$mergeWithWatchingFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexVosWithWatchingUseCase$mergeWithWatchingFlow$1 = new GetDexVosWithWatchingUseCase$mergeWithWatchingFlow$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getDexVosWithWatchingUseCase$mergeWithWatchingFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDexVosWithWatchingUseCase$mergeWithWatchingFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C40486qXq c40486qXq = this.OLrzqt;
            getDexVosWithWatchingUseCase$mergeWithWatchingFlow$1.L$0 = list;
            getDexVosWithWatchingUseCase$mergeWithWatchingFlow$1.label = 1;
            objEZpvd = c40486qXq.EZpvd(str, getDexVosWithWatchingUseCase$mergeWithWatchingFlow$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) getDexVosWithWatchingUseCase$mergeWithWatchingFlow$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return FlowKt.combine(FlowKt.flowOf(list), (Flow) objEZpvd, new GetDexVosWithWatchingUseCase$mergeWithWatchingFlow$resultFlow$1(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(C41500qrw c41500qrw, Continuation<? super java.util.List<? extends InterfaceC41655qus>> continuation) throws java.lang.Throwable {
        GetDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1 getDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1;
        java.util.List<InterfaceC41655qus> listCopydefault;
        java.util.ArrayList arrayList;
        if (continuation instanceof GetDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1) {
            getDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1 = (GetDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1) continuation;
            int i = getDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1.label = i - Integer.MIN_VALUE;
            } else {
                getDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1 = new GetDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            java.lang.String strKWHzl = c41500qrw.KWHzl();
            listCopydefault = c41500qrw.copydefault();
            DexChainGroupVo dexChainGroupVoEZpvd = c41500qrw.EZpvd();
            DexPeriodEnum dexPeriodEnumOLrzqt = c41500qrw.OLrzqt();
            kotlin.Pair<DexSortByEnum, SortOrder> pairAEQbTJ = c41500qrw.AEQbTJ();
            InterfaceC41652qup interfaceC41652qupValueOf = c41500qrw.valueOf();
            boolean zAYXKKw = c41500qrw.AYXKKw();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
                if (!dexChainGroupVoEZpvd.KWHzl()) {
                    if (dexChainGroupVoEZpvd.AhwBna()) {
                        if (listCopydefault != null) {
                            arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj : listCopydefault) {
                                if (Intrinsics.EZpvd(((InterfaceC41655qus) obj).OLrzqt(), C56443yFo.KWHzl(true))) {
                                    arrayList.add(obj);
                                }
                            }
                            listCopydefault = arrayList;
                        }
                        listCopydefault = null;
                    } else {
                        if (listCopydefault != null) {
                            arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj2 : listCopydefault) {
                                if (Intrinsics.EZpvd((java.lang.Object) ((InterfaceC41655qus) obj2).copydefault().getChainId(), (java.lang.Object) dexChainGroupVoEZpvd.copydefault())) {
                                    arrayList.add(obj2);
                                }
                            }
                            listCopydefault = arrayList;
                        }
                        listCopydefault = null;
                    }
                }
            } else if (dexChainGroupVoEZpvd.AhwBna()) {
                C41483qrf c41483qrf = this.KWHzl;
                C41495qrr c41495qrr = new C41495qrr(dexChainGroupVoEZpvd, dexPeriodEnumOLrzqt, pairAEQbTJ, interfaceC41652qupValueOf, null, zAYXKKw, 16, null);
                getDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1.label = 1;
                objOLrzqt = c41483qrf.EZpvd(c41495qrr, getDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                listCopydefault = (java.util.List) objOLrzqt;
            } else {
                C41494qrq c41494qrq = this.EZpvd;
                C41495qrr c41495qrr2 = new C41495qrr(dexChainGroupVoEZpvd, dexPeriodEnumOLrzqt, pairAEQbTJ, interfaceC41652qupValueOf, null, zAYXKKw, 16, null);
                getDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1.label = 2;
                objOLrzqt = c41494qrq.OLrzqt(c41495qrr2, getDexVosWithWatchingUseCase$groupingVoListOrRequestRankingList$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                listCopydefault = (java.util.List) objOLrzqt;
            }
        } else if (i2 == 1) {
            C56391yDq.AEQbTJ(objOLrzqt);
            listCopydefault = (java.util.List) objOLrzqt;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            listCopydefault = (java.util.List) objOLrzqt;
        }
        return listCopydefault == null ? yDY.AhwBna() : listCopydefault;
    }
}
