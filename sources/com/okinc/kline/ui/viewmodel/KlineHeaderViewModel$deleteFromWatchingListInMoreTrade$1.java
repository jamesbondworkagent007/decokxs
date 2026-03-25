package com.okinc.kline.ui.viewmodel;

import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC40387qTz;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineHeaderViewModel$deleteFromWatchingListInMoreTrade$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WatchListData $data;
    final /* synthetic */ String $instId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ KlineHeaderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineHeaderViewModel$deleteFromWatchingListInMoreTrade$1(KlineHeaderViewModel klineHeaderViewModel, WatchListData watchListData, String str, Continuation<? super KlineHeaderViewModel$deleteFromWatchingListInMoreTrade$1> continuation) {
        super(2, continuation);
        this.this$0 = klineHeaderViewModel;
        this.$data = watchListData;
        this.$instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KlineHeaderViewModel$deleteFromWatchingListInMoreTrade$1 klineHeaderViewModel$deleteFromWatchingListInMoreTrade$1 = new KlineHeaderViewModel$deleteFromWatchingListInMoreTrade$1(this.this$0, this.$data, this.$instId, continuation);
        klineHeaderViewModel$deleteFromWatchingListInMoreTrade$1.L$0 = obj;
        return klineHeaderViewModel$deleteFromWatchingListInMoreTrade$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineHeaderViewModel$deleteFromWatchingListInMoreTrade$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Throwable th;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th2) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            KlineHeaderViewModel klineHeaderViewModel = this.this$0;
            WatchListData watchListData = this.$data;
            Result.Application application2 = Result.Companion;
            InterfaceC40387qTz interfaceC40387qTz = klineHeaderViewModel.DbNXlk;
            this.label = 1;
            if (interfaceC40387qTz.KWHzl(watchListData, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.L$1;
                    C56391yDq.AEQbTJ(obj);
                    pUU.copydefault("KlineHeaderViewModel", "deleteFromWatchingListInMoreTrade failed: " + th);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                KlineHeaderViewModel klineHeaderViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow = klineHeaderViewModel2.KWHzl;
                    Boolean boolKWHzl = C56443yFo.KWHzl(true);
                    this.L$0 = obj2;
                    this.L$1 = thM7380exceptionOrNullimpl;
                    this.label = 4;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    th = thM7380exceptionOrNullimpl;
                    pUU.copydefault("KlineHeaderViewModel", "deleteFromWatchingListInMoreTrade failed: " + th);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        obj2 = objM7377constructorimpl;
        KlineHeaderViewModel klineHeaderViewModel3 = this.this$0;
        String str = this.$instId;
        if (Result.m7384isSuccessimpl(obj2)) {
            if (Intrinsics.EZpvd((Object) klineHeaderViewModel3.copydefault().getInstrumentId(), (Object) str)) {
                MutableSharedFlow mutableSharedFlow2 = klineHeaderViewModel3.AEQbTJ;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
                this.L$0 = obj2;
                this.label = 2;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                MutableSharedFlow mutableSharedFlow3 = klineHeaderViewModel3.KWHzl;
                Boolean boolKWHzl3 = C56443yFo.KWHzl(false);
                this.L$0 = obj2;
                this.label = 3;
                if (mutableSharedFlow3.emit(boolKWHzl3, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        KlineHeaderViewModel klineHeaderViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
