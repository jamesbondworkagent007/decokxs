package com.okinc.okimcore.feature.message.manager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC44292sKk;
import o.C44124sEe;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.sDZ;

/* JADX INFO: loaded from: classes10.dex */
public final class ChannelMessenger$login$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC44292sKk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelMessenger$login$1(AbstractC44292sKk abstractC44292sKk, Continuation<? super ChannelMessenger$login$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC44292sKk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelMessenger$login$1 channelMessenger$login$1 = new ChannelMessenger$login$1(this.this$0, continuation);
        channelMessenger$login$1.L$0 = obj;
        return channelMessenger$login$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChannelMessenger$login$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: com.okinc.okimcore.feature.message.manager.ChannelMessenger$login$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AbstractC44292sKk this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC44292sKk abstractC44292sKk, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = abstractC44292sKk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C44124sEe.imLogGetAllUnreadCountFlow$default("start collect im restriction state flow", null, 2, null);
                StateFlow<sDZ.TaskDescription> stateFlowFetchVPNInfo = sDZ.AEQbTJ.fetchVPNInfo();
                C05791 c05791 = new C05791(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowFetchVPNInfo, c05791, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.okimcore.feature.message.manager.ChannelMessenger$login$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05791 extends SuspendLambda implements Function2<sDZ.TaskDescription, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AbstractC44292sKk this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05791(AbstractC44292sKk abstractC44292sKk, Continuation<? super C05791> continuation) {
                super(2, continuation);
                this.this$0 = abstractC44292sKk;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05791 c05791 = new C05791(this.this$0, continuation);
                c05791.L$0 = obj;
                return c05791;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(sDZ.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
                return ((C05791) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    sDZ.TaskDescription taskDescription = (sDZ.TaskDescription) this.L$0;
                    C44124sEe.imLogGetAllUnreadCountFlow$default("im restriction state flow updated, isRestrict:" + taskDescription.AEQbTJ() + ", isCache:" + taskDescription.EZpvd() + " isLogin:" + taskDescription.copydefault() + " userId:" + taskDescription.KWHzl(), null, 2, null);
                    if (!taskDescription.EZpvd() && !taskDescription.AEQbTJ() && Intrinsics.EZpvd(taskDescription.copydefault(), C56443yFo.KWHzl(true)) && Intrinsics.EZpvd((Object) taskDescription.KWHzl(), (Object) C44157sFk.copydefault(C44157sFk.gEmmrt()))) {
                        C44124sEe.imLogLogin$default("im restriction state flow updated: Try connect websocket", null, 2, null);
                        this.this$0.AEQbTJ();
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.okimcore.feature.message.manager.ChannelMessenger$login$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AbstractC44292sKk this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC44292sKk abstractC44292sKk, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = abstractC44292sKk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C44124sEe.imLogLogin$default("start collect user token change flow", null, 2, null);
                Flow<Unit> flowAuCTel = C44157sFk.gEmmrt().AuCTel();
                final AbstractC44292sKk abstractC44292sKk = this.this$0;
                FlowCollector<? super Unit> flowCollector = new FlowCollector() { // from class: com.okinc.okimcore.feature.message.manager.ChannelMessenger.login.1.2.2
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                        C44124sEe.imLogLogin$default("user token changed: Try reconnect websocket", null, 2, null);
                        abstractC44292sKk.copydefault();
                        abstractC44292sKk.AEQbTJ();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowAuCTel.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
