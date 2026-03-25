package com.okinc.kline.ui.viewmodel;

import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC40387qTz;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineHeaderViewModel$queryIsWatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WatchListData $data;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ KlineHeaderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineHeaderViewModel$queryIsWatching$1(KlineHeaderViewModel klineHeaderViewModel, WatchListData watchListData, Continuation<? super KlineHeaderViewModel$queryIsWatching$1> continuation) {
        super(2, continuation);
        this.this$0 = klineHeaderViewModel;
        this.$data = watchListData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KlineHeaderViewModel$queryIsWatching$1 klineHeaderViewModel$queryIsWatching$1 = new KlineHeaderViewModel$queryIsWatching$1(this.this$0, this.$data, continuation);
        klineHeaderViewModel$queryIsWatching$1.L$0 = obj;
        return klineHeaderViewModel$queryIsWatching$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineHeaderViewModel$queryIsWatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Throwable th;
        KlineHeaderViewModel klineHeaderViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th2) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            klineHeaderViewModel = this.this$0;
            WatchListData watchListData = this.$data;
            Result.Application application2 = Result.Companion;
            InterfaceC40387qTz interfaceC40387qTz = klineHeaderViewModel.DbNXlk;
            this.L$0 = klineHeaderViewModel;
            this.label = 1;
            obj = interfaceC40387qTz.copydefault(watchListData, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.L$1;
                    C56391yDq.AEQbTJ(obj);
                    pUU.copydefault("KlineHeaderViewModel", "queryIsWatching failed: " + th);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                KlineHeaderViewModel klineHeaderViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow = klineHeaderViewModel2.OLrzqt;
                    Boolean boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = thM7380exceptionOrNullimpl;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    th = thM7380exceptionOrNullimpl;
                    pUU.copydefault("KlineHeaderViewModel", "queryIsWatching failed: " + th);
                }
                return Unit.INSTANCE;
            }
            klineHeaderViewModel = (KlineHeaderViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        MutableSharedFlow mutableSharedFlow2 = klineHeaderViewModel.OLrzqt;
        Boolean boolKWHzl2 = C56443yFo.KWHzl(zBooleanValue);
        this.L$0 = null;
        this.label = 2;
        if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        KlineHeaderViewModel klineHeaderViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
