package com.okinc.oklive.app.ui.list.viewmodel;

import com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$onStreamEnded$1;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.AbstractC44569sUu;
import o.C56391yDq;
import o.C56406yEe;
import o.C56442yFn;
import o.sUN;

/* JADX INFO: loaded from: classes19.dex */
public final class LivestreamListViewModel$onStreamEnded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ sUN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListViewModel$onStreamEnded$1(sUN sun, Continuation<? super LivestreamListViewModel$onStreamEnded$1> continuation) {
        super(2, continuation);
        this.this$0 = sun;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamListViewModel$onStreamEnded$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamListViewModel$onStreamEnded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Long l;
        sUN sun;
        long j;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) this.this$0.OLrzqt.getValue());
            boolean zAEQbTJ = C56406yEe.AEQbTJ(listFJNWhG, new Function1() { // from class: o.sUU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(LivestreamListViewModel$onStreamEnded$1.invokeSuspend$lambda$0((AbstractC44569sUu) obj2));
                }
            });
            this.this$0.OLrzqt.setValue(listFJNWhG);
            if (zAEQbTJ && (l = this.this$0.DbNXlk) != null) {
                sUN sun2 = this.this$0;
                long jLongValue = l.longValue();
                this.L$0 = sun2;
                this.J$0 = jLongValue;
                this.label = 1;
                if (DelayKt.delay(1000L, this) == objCopydefault) {
                    return objCopydefault;
                }
                sun = sun2;
                j = jLongValue;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = this.J$0;
        sun = (sUN) this.L$0;
        C56391yDq.AEQbTJ(obj);
        sUN.loadData$default(sun, String.valueOf(j), false, true, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(AbstractC44569sUu abstractC44569sUu) {
        return abstractC44569sUu instanceof AbstractC44569sUu.Activity;
    }
}
