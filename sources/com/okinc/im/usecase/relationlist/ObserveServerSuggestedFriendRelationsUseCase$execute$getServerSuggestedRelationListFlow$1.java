package com.okinc.im.usecase.relationlist;

import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C35867oGq;
import o.C35873oGw;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends RelationInfo>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ CacheStrategy $cacheStrategy;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35873oGw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$1(C35873oGw c35873oGw, CacheStrategy cacheStrategy, Continuation<? super ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c35873oGw;
        this.$cacheStrategy = cacheStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$1 observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$1 = new ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$1(this.this$0, this.$cacheStrategy, continuation);
        observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$1.L$0 = obj;
        return observeServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends RelationInfo>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<RelationInfo>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<RelationInfo>> flowCollector, Continuation<? super Unit> continuation) {
        return ((ObserveServerSuggestedFriendRelationsUseCase$execute$getServerSuggestedRelationListFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            C35867oGq c35867oGq = this.this$0.KWHzl;
            CacheStrategy cacheStrategy = this.$cacheStrategy;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = c35867oGq.EZpvd(cacheStrategy, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(obj, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
