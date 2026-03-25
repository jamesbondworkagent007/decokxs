package com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel;

import com.okinc.business.market.features.analysis.futures.sub.funding.ui.model.CoinPairVo;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25880jJu;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class SelectCoinPairViewModel$loadSwapCoinsData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoinPairVo $coinPairVo;
    final /* synthetic */ String $uid;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SelectCoinPairViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectCoinPairViewModel$loadSwapCoinsData$1(SelectCoinPairViewModel selectCoinPairViewModel, CoinPairVo coinPairVo, String str, Continuation<? super SelectCoinPairViewModel$loadSwapCoinsData$1> continuation) {
        super(2, continuation);
        this.this$0 = selectCoinPairViewModel;
        this.$coinPairVo = coinPairVo;
        this.$uid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SelectCoinPairViewModel$loadSwapCoinsData$1 selectCoinPairViewModel$loadSwapCoinsData$1 = new SelectCoinPairViewModel$loadSwapCoinsData$1(this.this$0, this.$coinPairVo, this.$uid, continuation);
        selectCoinPairViewModel$loadSwapCoinsData$1.L$0 = obj;
        return selectCoinPairViewModel$loadSwapCoinsData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectCoinPairViewModel$loadSwapCoinsData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            SelectCoinPairViewModel selectCoinPairViewModel = this.this$0;
            InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (selectCoinPairViewModel.OLrzqt((InterfaceC49371unL<? extends List<CoinPairVo>>) actionBar, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    SelectCoinPairViewModel selectCoinPairViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                        InterfaceC49371unL.Application application2 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, yDY.AhwBna());
                        this.L$0 = obj2;
                        this.label = 5;
                        if (selectCoinPairViewModel2.OLrzqt((InterfaceC49371unL<? extends List<CoinPairVo>>) application2, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
                obj2 = objM7377constructorimpl;
                SelectCoinPairViewModel selectCoinPairViewModel3 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    List list = (List) obj2;
                    if (!list.isEmpty()) {
                        selectCoinPairViewModel3.AEQbTJ = list;
                        InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(list);
                        this.L$0 = obj2;
                        this.label = 4;
                        if (selectCoinPairViewModel3.OLrzqt((InterfaceC49371unL<? extends List<CoinPairVo>>) activity, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        InterfaceC49371unL.TaskDescription taskDescription = new InterfaceC49371unL.TaskDescription(null, 1, null);
                        this.L$0 = obj2;
                        this.label = 3;
                        if (selectCoinPairViewModel3.OLrzqt((InterfaceC49371unL<? extends List<CoinPairVo>>) taskDescription, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                SelectCoinPairViewModel selectCoinPairViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        SelectCoinPairViewModel selectCoinPairViewModel4 = this.this$0;
        CoinPairVo coinPairVo = this.$coinPairVo;
        String str = this.$uid;
        Result.Application application3 = Result.Companion;
        C25880jJu c25880jJu = selectCoinPairViewModel4.OLrzqt;
        Pair pairOLrzqt = C56390yDp.OLrzqt(coinPairVo, str);
        this.L$0 = null;
        this.label = 2;
        obj = c25880jJu.EZpvd(pairOLrzqt, (Continuation) this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
        obj2 = objM7377constructorimpl;
        SelectCoinPairViewModel selectCoinPairViewModel32 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
        }
        SelectCoinPairViewModel selectCoinPairViewModel222 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
