package com.okinc.im.imui.contacts;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35639nzE;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44177sGd;

/* JADX INFO: loaded from: classes15.dex */
public final class SelectableContactListFragment$onResume$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35639nzE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableContactListFragment$onResume$1(C35639nzE c35639nzE, Continuation<? super SelectableContactListFragment$onResume$1> continuation) {
        super(2, continuation);
        this.this$0 = c35639nzE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SelectableContactListFragment$onResume$1 selectableContactListFragment$onResume$1 = new SelectableContactListFragment$onResume$1(this.this$0, continuation);
        selectableContactListFragment$onResume$1.L$0 = obj;
        return selectableContactListFragment$onResume$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectableContactListFragment$onResume$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C35639nzE c35639nzE = this.this$0;
                Result.Application application = Result.Companion;
                C44124sEe.imLogSync$default("SelectableContactListFragment: Syncing Contact List: started, updating DB", null, null, 6, null);
                InterfaceC44177sGd interfaceC44177sGdAEQbTJ = c35639nzE.gEmmrt().AEQbTJ().AEQbTJ();
                this.label = 1;
                obj = interfaceC44177sGdAEQbTJ.gEmmrt(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            C44124sEe.imLogSync$default("SelectableContactListFragment: Syncing Contact List: completed", null, null, 6, null);
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.imLogSync$default("SelectableContactListFragment: Syncing Contact List: failed", thM7380exceptionOrNullimpl, null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
