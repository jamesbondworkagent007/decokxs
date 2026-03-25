package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.model.im.OKMessage;
import java.util.AbstractMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C44138sEs;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;
import o.C59454zhO;
import o.InterfaceC44290sKi;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class InHouseIMSendImpl$sendMediaMessageOnChannel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC44290sKi $callback;
    final /* synthetic */ Ref.ObjectRef<Job> $job;
    final /* synthetic */ OKMessage $message;
    final /* synthetic */ Ref.ObjectRef<String> $registeredId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44138sEs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMSendImpl$sendMediaMessageOnChannel$1(C44138sEs c44138sEs, OKMessage oKMessage, InterfaceC44290sKi interfaceC44290sKi, Ref.ObjectRef<String> objectRef, Ref.ObjectRef<Job> objectRef2, Continuation<? super InHouseIMSendImpl$sendMediaMessageOnChannel$1> continuation) {
        super(2, continuation);
        this.this$0 = c44138sEs;
        this.$message = oKMessage;
        this.$callback = interfaceC44290sKi;
        this.$registeredId = objectRef;
        this.$job = objectRef2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMSendImpl$sendMediaMessageOnChannel$1 inHouseIMSendImpl$sendMediaMessageOnChannel$1 = new InHouseIMSendImpl$sendMediaMessageOnChannel$1(this.this$0, this.$message, this.$callback, this.$registeredId, this.$job, continuation);
        inHouseIMSendImpl$sendMediaMessageOnChannel$1.L$0 = obj;
        return inHouseIMSendImpl$sendMediaMessageOnChannel$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMSendImpl$sendMediaMessageOnChannel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x00c8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0013 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: kotlinx.coroutines.CoroutineScope */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: kotlinx.coroutines.CoroutineScope */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: kotlinx.coroutines.CoroutineScope */
    /* JADX DEBUG: Multi-variable search result rejected for r6v15, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r6v16, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r6v17, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r6v6, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r6v7, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [kotlin.coroutines.CoroutineContext$TaskDescription, kotlinx.coroutines.Job$Key] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        CoroutineScope coroutineScope2 = this.label;
        Object objCollect = " (cancelled)";
        try {
            if (coroutineScope2 == 0) {
                C56391yDq.AEQbTJ(obj);
                coroutineScope2 = (CoroutineScope) this.L$0;
                C44138sEs c44138sEs = this.this$0;
                obj2 = " (cancelled)";
                try {
                    Flow<C44502sSe.StateListAnimator> flowAEQbTJ = c44138sEs.AEQbTJ(FlowKt.onEach(c44138sEs.EZpvd.AkhnZx().KWHzl(this.$message), new AnonymousClass1(this.$registeredId, this.this$0, this.$job, this.$message, this.$callback, null)), this.$message, this.$callback);
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    objCollect = FlowKt.collect(flowAEQbTJ, this);
                    coroutineScope = coroutineScope2;
                    if (objCollect == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (Throwable th) {
                    th = th;
                    Job job = (Job) coroutineScope2.getCoroutineContext().get(Job.Key);
                    boolean z = job != null && job.isCancelled();
                    String str = this.$registeredId.element;
                    if (str != null) {
                        this.this$0.copydefault().remove(str);
                        pUU.EZpvd("FileUploadProgress", "[" + C59454zhO.isConnected(str, 8) + "] sendMediaMessageOnChannel: cleaned up upload job" + (z ? obj2 : ""));
                    }
                    throw th;
                }
            } else {
                if (coroutineScope2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj2 = " (cancelled)";
                coroutineScope = coroutineScope3;
            }
            CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
            coroutineScope2 = Job.Key;
            Job job2 = (Job) coroutineContext.get(coroutineScope2);
            boolean z2 = job2 != null && job2.isCancelled();
            String str2 = this.$registeredId.element;
            if (str2 != null) {
                this.this$0.copydefault().remove(str2);
                pUU.EZpvd("FileUploadProgress", "[" + C59454zhO.isConnected(str2, 8) + "] sendMediaMessageOnChannel: cleaned up upload job" + (z2 ? obj2 : ""));
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            obj2 = objCollect;
        }
    }

    /* JADX INFO: renamed from: com.okinc.okimcore.channel.inhouse.impl.InHouseIMSendImpl$sendMediaMessageOnChannel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C44502sSe.StateListAnimator, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC44290sKi $callback;
        final /* synthetic */ Ref.ObjectRef<Job> $job;
        final /* synthetic */ OKMessage $message;
        final /* synthetic */ Ref.ObjectRef<String> $registeredId;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C44138sEs this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<String> objectRef, C44138sEs c44138sEs, Ref.ObjectRef<Job> objectRef2, OKMessage oKMessage, InterfaceC44290sKi interfaceC44290sKi, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$registeredId = objectRef;
            this.this$0 = c44138sEs;
            this.$job = objectRef2;
            this.$message = oKMessage;
            this.$callback = interfaceC44290sKi;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$registeredId, this.this$0, this.$job, this.$message, this.$callback, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C44502sSe.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r6v7, types: [T, java.lang.Object, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Job job;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C44502sSe.StateListAnimator stateListAnimator = (C44502sSe.StateListAnimator) this.L$0;
                if (stateListAnimator instanceof C44502sSe.StateListAnimator.C0942StateListAnimator) {
                    ?? messageId = ((C44502sSe.StateListAnimator.C0942StateListAnimator) stateListAnimator).OLrzqt().getMessageId();
                    this.$registeredId.element = messageId;
                    AbstractMap abstractMapCopydefault = this.this$0.copydefault();
                    Job job2 = this.$job.element;
                    if (job2 == null) {
                        Intrinsics.gEmmrt("");
                        job = null;
                    } else {
                        job = job2;
                    }
                    abstractMapCopydefault.put(messageId, new C44138sEs.Application(job, this.$message, this.$callback));
                    pUU.EZpvd("FileUploadProgress", "[" + C59454zhO.isConnected(messageId, 8) + "] sendMediaMessageOnChannel: registered upload job");
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
