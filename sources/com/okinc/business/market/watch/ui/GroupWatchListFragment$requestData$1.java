package com.okinc.business.market.watch.ui;

import com.okinc.business.market.watch.ui.viewmodel.GroupWatchListViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.kKI;
import o.pWO;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListFragment$requestData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ kKI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListFragment$requestData$1(kKI kki, Continuation<? super GroupWatchListFragment$requestData$1> continuation) {
        super(2, continuation);
        this.this$0 = kki;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupWatchListFragment$requestData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupWatchListFragment$requestData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        kKI kki;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kki = this.this$0;
            Result.Application application2 = Result.Companion;
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            this.L$0 = kki;
            this.label = 1;
            if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl, false, null, this, 3, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            kki = (kKI) this.L$0;
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        GroupWatchListViewModel groupWatchListViewModelAkhnZx = kki.AkhnZx();
        this.L$0 = null;
        this.label = 2;
        if (groupWatchListViewModelAkhnZx.copydefault(this) == objCopydefault) {
            return objCopydefault;
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
