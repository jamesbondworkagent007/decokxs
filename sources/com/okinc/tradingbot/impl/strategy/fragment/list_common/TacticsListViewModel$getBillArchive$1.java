package com.okinc.tradingbot.impl.strategy.fragment.list_common;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.vNB;
import o.wTK;

/* JADX INFO: loaded from: classes11.dex */
public final class TacticsListViewModel$getBillArchive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $accountId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TacticsListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TacticsListViewModel$getBillArchive$1(TacticsListViewModel tacticsListViewModel, Long l, Continuation<? super TacticsListViewModel$getBillArchive$1> continuation) {
        super(2, continuation);
        this.this$0 = tacticsListViewModel;
        this.$accountId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TacticsListViewModel$getBillArchive$1 tacticsListViewModel$getBillArchive$1 = new TacticsListViewModel$getBillArchive$1(this.this$0, this.$accountId, continuation);
        tacticsListViewModel$getBillArchive$1.L$0 = obj;
        return tacticsListViewModel$getBillArchive$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TacticsListViewModel$getBillArchive$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        TacticsListViewModel tacticsListViewModel;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tacticsListViewModel = this.this$0;
            Long l = this.$accountId;
            Result.Application application2 = Result.Companion;
            long jCurrentTimeMillis = System.currentTimeMillis();
            wTK wtk = tacticsListViewModel.copydefault;
            wTK.Activity activity = new wTK.Activity(l, "MARGIN", 9, jCurrentTimeMillis - 604800000, jCurrentTimeMillis, 100);
            this.L$0 = tacticsListViewModel;
            this.label = 1;
            objKWHzl = wtk.KWHzl(activity, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                TacticsListViewModel tacticsListViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableStateFlow mutableStateFlow = tacticsListViewModel2.KWHzl;
                    vNB.StateListAnimator stateListAnimator = new vNB.StateListAnimator(thM7380exceptionOrNullimpl);
                    this.L$0 = objM7377constructorimpl;
                    this.label = 3;
                    if (mutableStateFlow.emit(stateListAnimator, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            tacticsListViewModel = (TacticsListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        MutableStateFlow mutableStateFlow2 = tacticsListViewModel.KWHzl;
        vNB.TaskDescription taskDescription = new vNB.TaskDescription((List) objKWHzl);
        this.L$0 = null;
        this.label = 2;
        if (mutableStateFlow2.emit(taskDescription, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        TacticsListViewModel tacticsListViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
