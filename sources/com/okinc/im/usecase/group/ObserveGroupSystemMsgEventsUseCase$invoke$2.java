package com.okinc.im.usecase.group;

import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C33129mqd;
import o.C35781oDl;
import o.C44391sOb;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveGroupSystemMsgEventsUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flow<? extends C35781oDl.TaskDescription>>, Object> {
    final /* synthetic */ long $groupId;
    int label;
    final /* synthetic */ C35781oDl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveGroupSystemMsgEventsUseCase$invoke$2(C35781oDl c35781oDl, long j, Continuation<? super ObserveGroupSystemMsgEventsUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c35781oDl;
        this.$groupId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ObserveGroupSystemMsgEventsUseCase$invoke$2(this.this$0, this.$groupId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Flow<? extends C35781oDl.TaskDescription>> continuation) {
        return ((ObserveGroupSystemMsgEventsUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return new TaskDescription(new Application(this.this$0.AEQbTJ.djBIcL(), this.$groupId));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static final class Application implements Flow<C44391sOb> {
        public final /* synthetic */ Flow OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX INFO: renamed from: com.okinc.im.usecase.group.ObserveGroupSystemMsgEventsUseCase$invoke$2$Application$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, long j) {
                this.copydefault = flowCollector;
                this.KWHzl = j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                ObserveGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$filter$1$2$1 observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$filter$1$2$1;
                if (continuation instanceof ObserveGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$filter$1$2$1) {
                    observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$filter$1$2$1 = (ObserveGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i = observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$filter$1$2$1 = new ObserveGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    if (Intrinsics.EZpvd((Object) ((C44391sOb) obj).AEQbTJ(), (Object) String.valueOf(this.KWHzl))) {
                        observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow, long j) {
            this.OLrzqt = flow;
            this.copydefault = j;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super C44391sOb> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass2(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class TaskDescription implements Flow<C35781oDl.TaskDescription> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: com.okinc.im.usecase.group.ObserveGroupSystemMsgEventsUseCase$invoke$2$TaskDescription$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                ObserveGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$mapNotNull$1$2$1 observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$mapNotNull$1$2$1;
                Object obj2;
                if (continuation instanceof ObserveGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$mapNotNull$1$2$1) {
                    observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$mapNotNull$1$2$1 = (ObserveGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
                    int i = observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$mapNotNull$1$2$1 = new ObserveGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                Object obj3 = observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj3);
                    FlowCollector flowCollector = this.EZpvd;
                    C44391sOb c44391sOb = (C44391sOb) obj;
                    pUU.EZpvd("ObserveGroupSystemMsgEventsUseCase", "Received system message: " + c44391sOb);
                    int iAhwBna = C33129mqd.AhwBna(c44391sOb.OLrzqt().EZpvd());
                    if (iAhwBna == SystemMessageData.InvisibleSystemAction.SYSTEM_ACTION_GROUP_JOIN_APPLICATION.getSystemAction()) {
                        obj2 = C35781oDl.TaskDescription.Application.OLrzqt;
                    } else {
                        obj2 = (iAhwBna == SystemMessageData.InvisibleSystemAction.SYSTEM_ACTION_GROUP_APPROVAL.getSystemAction() || iAhwBna == SystemMessageData.InvisibleSystemAction.SYSTEM_ACTION_GROUP_REJECT.getSystemAction() || iAhwBna == SystemMessageData.InvisibleSystemAction.SYSTEM_ACTION_GROUP_WITHDRAWN_APPLICATION.getSystemAction()) ? C35781oDl.TaskDescription.ActionBar.KWHzl : null;
                    }
                    if (obj2 != null) {
                        observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(obj2, observeGroupSystemMsgEventsUseCase$invoke$2$invokeSuspend$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj3);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super C35781oDl.TaskDescription> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
