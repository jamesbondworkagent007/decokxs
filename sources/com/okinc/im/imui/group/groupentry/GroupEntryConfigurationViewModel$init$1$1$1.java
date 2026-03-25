package com.okinc.im.imui.group.groupentry;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.AbstractC44412sOw;
import o.AbstractC44413sOx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class GroupEntryConfigurationViewModel$init$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends AbstractC44412sOw, ? extends AbstractC44413sOx>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupEntryConfigurationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupEntryConfigurationViewModel$init$1$1$1(GroupEntryConfigurationViewModel groupEntryConfigurationViewModel, Continuation<? super GroupEntryConfigurationViewModel$init$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = groupEntryConfigurationViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupEntryConfigurationViewModel$init$1$1$1 groupEntryConfigurationViewModel$init$1$1$1 = new GroupEntryConfigurationViewModel$init$1$1$1(this.this$0, continuation);
        groupEntryConfigurationViewModel$init$1$1$1.L$0 = obj;
        return groupEntryConfigurationViewModel$init$1$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends AbstractC44412sOw, ? extends AbstractC44413sOx>> continuation) {
        return ((GroupEntryConfigurationViewModel$init$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferred;
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GroupEntryConfigurationViewModel$init$1$1$1$verificationDeferred$1(this.this$0, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GroupEntryConfigurationViewModel$init$1$1$1$currencyDeferred$1(this.this$0, null), 3, null);
            this.L$0 = deferredAsync$default2;
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            deferred = deferredAsync$default2;
            obj = objAwait;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                return new Pair(obj2, obj);
            }
            deferred = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = obj;
        this.label = 2;
        Object objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        obj2 = obj;
        obj = objAwait2;
        return new Pair(obj2, obj);
    }
}
