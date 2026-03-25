package com.okinc.im.imui.tracking;

import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C37708oyt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHS;

/* JADX INFO: loaded from: classes8.dex */
public final class IMTracker$dispatchResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $key;
    final /* synthetic */ IMTrackerMetadataImpl $metadata;
    final /* synthetic */ Object[] $params;
    final /* synthetic */ Object $result;
    final /* synthetic */ long $timeCost;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C37708oyt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMTracker$dispatchResult$1(C37708oyt c37708oyt, int i, long j, Object[] objArr, IMTrackerMetadataImpl iMTrackerMetadataImpl, Object obj, Continuation<? super IMTracker$dispatchResult$1> continuation) {
        super(2, continuation);
        this.this$0 = c37708oyt;
        this.$key = i;
        this.$timeCost = j;
        this.$params = objArr;
        this.$metadata = iMTrackerMetadataImpl;
        this.$result = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IMTracker$dispatchResult$1 iMTracker$dispatchResult$1 = new IMTracker$dispatchResult$1(this.this$0, this.$key, this.$timeCost, this.$params, this.$metadata, this.$result, continuation);
        iMTracker$dispatchResult$1.L$0 = obj;
        return iMTracker$dispatchResult$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IMTracker$dispatchResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C37708oyt c37708oyt = this.this$0;
            int i = this.$key;
            long j = this.$timeCost;
            Object[] objArr = this.$params;
            IMTrackerMetadataImpl iMTrackerMetadataImpl = this.$metadata;
            Object obj2 = this.$result;
            try {
                Result.Application application = Result.Companion;
                Iterator it = c37708oyt.AEQbTJ.iterator();
                while (it.hasNext()) {
                    ((yHS) it.next()).invoke(C56443yFo.AEQbTJ(i), C56443yFo.KWHzl(j), objArr, iMTrackerMetadataImpl, obj2);
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
