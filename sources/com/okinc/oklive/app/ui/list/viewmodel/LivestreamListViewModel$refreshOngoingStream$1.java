package com.okinc.oklive.app.ui.list.viewmodel;

import com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse;
import com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$refreshOngoingStream$1;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC44569sUu;
import o.C44554sUf;
import o.C56391yDq;
import o.C56406yEe;
import o.C56442yFn;
import o.sUN;

/* JADX INFO: loaded from: classes19.dex */
public final class LivestreamListViewModel$refreshOngoingStream$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $uid;
    int label;
    final /* synthetic */ sUN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListViewModel$refreshOngoingStream$1(sUN sun, long j, Continuation<? super LivestreamListViewModel$refreshOngoingStream$1> continuation) {
        super(2, continuation);
        this.this$0 = sun;
        this.$uid = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamListViewModel$refreshOngoingStream$1(this.this$0, this.$uid, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamListViewModel$refreshOngoingStream$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44554sUf c44554sUf = this.this$0.fJNWhG;
            long j = this.$uid;
            this.label = 1;
            obj = c44554sUf.KWHzl(j, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        LivestreamInfoResponse livestreamInfoResponse = (LivestreamInfoResponse) obj;
        List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) this.this$0.OLrzqt.getValue());
        boolean zAEQbTJ = C56406yEe.AEQbTJ(listFJNWhG, new Function1() { // from class: o.sUV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(LivestreamListViewModel$refreshOngoingStream$1.invokeSuspend$lambda$0((AbstractC44569sUu) obj2));
            }
        });
        if (livestreamInfoResponse != null) {
            listFJNWhG.add(0, this.this$0.copydefault(livestreamInfoResponse));
        }
        if (zAEQbTJ || livestreamInfoResponse != null) {
            this.this$0.OLrzqt.setValue(listFJNWhG);
            if (!zAEQbTJ && livestreamInfoResponse != null) {
                this.this$0.gEmmrt.setValue(sUN.TaskDescription.FragmentManager.OLrzqt);
            } else if (listFJNWhG.isEmpty()) {
                this.this$0.gEmmrt.setValue(!this.this$0.djBIcL() ? sUN.TaskDescription.ActionBar.EZpvd : sUN.TaskDescription.C0943TaskDescription.AEQbTJ);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(AbstractC44569sUu abstractC44569sUu) {
        return abstractC44569sUu instanceof AbstractC44569sUu.Activity;
    }
}
