package com.okinc.im.imui.group.groupentry;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC44413sOx;
import o.C35790oDu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class GroupEntryConfigurationViewModel$init$1$1$1$currencyDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC44413sOx>, Object> {
    int label;
    final /* synthetic */ GroupEntryConfigurationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupEntryConfigurationViewModel$init$1$1$1$currencyDeferred$1(GroupEntryConfigurationViewModel groupEntryConfigurationViewModel, Continuation<? super GroupEntryConfigurationViewModel$init$1$1$1$currencyDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = groupEntryConfigurationViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupEntryConfigurationViewModel$init$1$1$1$currencyDeferred$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC44413sOx> continuation) {
        return ((GroupEntryConfigurationViewModel$init$1$1$1$currencyDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35790oDu c35790oDu = this.this$0.fetchVPNInfo;
            this.label = 1;
            obj = c35790oDu.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
