package com.okinc.business.defi.wallet.custom;

import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.ActivityC16104edd;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CustomChainMeta $chain;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC16104edd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1(ActivityC16104edd activityC16104edd, CustomChainMeta customChainMeta, Continuation<? super AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC16104edd;
        this.$chain = customChainMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1 addCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1 = new AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1(this.this$0, this.$chain, continuation);
        addCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1.L$0 = obj;
        return addCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                ActivityC16104edd activityC16104edd = this.this$0;
                CustomChainMeta customChainMeta = this.$chain;
                Result.Application application = Result.Companion;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1$1$1 addCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1$1$1 = new AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1$1$1(activityC16104edd, customChainMeta, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, addCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1$1$1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        ActivityC16104edd activityC16104edd2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(activityC16104edd2.getTAG(), "error message = " + thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }
}
