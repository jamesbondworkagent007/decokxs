package com.okinc.okimcore.usecase;

import com.okinc.okimcore.model.im.inhouseim.ws.WSJoinLiveStream;
import com.okinc.okimcore.model.im.inhouseim.ws.WSJoinLiveStreamData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C44499sSb;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class LiveStreamUseCase$joinLiveStream$1 extends SuspendLambda implements Function2<FlowCollector<? super C44499sSb.Activity>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44499sSb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveStreamUseCase$joinLiveStream$1(C44499sSb c44499sSb, String str, Continuation<? super LiveStreamUseCase$joinLiveStream$1> continuation) {
        super(2, continuation);
        this.this$0 = c44499sSb;
        this.$channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LiveStreamUseCase$joinLiveStream$1 liveStreamUseCase$joinLiveStream$1 = new LiveStreamUseCase$joinLiveStream$1(this.this$0, this.$channelId, continuation);
        liveStreamUseCase$joinLiveStream$1.L$0 = obj;
        return liveStreamUseCase$joinLiveStream$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super C44499sSb.Activity> flowCollector, Continuation<? super Unit> continuation) {
        return ((LiveStreamUseCase$joinLiveStream$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r1 = this.label;
        try {
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to join livestream";
            }
            C44499sSb.Activity.TaskDescription taskDescription = new C44499sSb.Activity.TaskDescription(message, e);
            this.L$0 = null;
            this.label = 3;
            if (r1.emit(taskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        if (r1 == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            C44499sSb c44499sSb = this.this$0;
            WSJoinLiveStream wSJoinLiveStream = new WSJoinLiveStream(new WSJoinLiveStreamData(this.$channelId));
            this.L$0 = flowCollector;
            this.label = 1;
            if (c44499sSb.OLrzqt(wSJoinLiveStream, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (r1 != 1) {
                if (r1 == 2) {
                    C56391yDq.AEQbTJ(obj);
                } else {
                    if (r1 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C44499sSb.Activity.Application application = C44499sSb.Activity.Application.OLrzqt;
        this.L$0 = flowCollector;
        this.label = 2;
        if (flowCollector.emit(application, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
