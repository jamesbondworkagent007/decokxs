package com.okinc.okimcore.channel.inhouse.impl;

import android.content.Context;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C44136sEq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44372sNj;
import o.sDN;
import o.sIS;
import o.sIT;

/* JADX INFO: loaded from: classes19.dex */
public final class InHouseIMQueryImpl$download$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC44372sNj $callback;
    final /* synthetic */ OKMessage $message;
    int label;
    final /* synthetic */ C44136sEq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMQueryImpl$download$1(OKMessage oKMessage, C44136sEq c44136sEq, InterfaceC44372sNj interfaceC44372sNj, Continuation<? super InHouseIMQueryImpl$download$1> continuation) {
        super(2, continuation);
        this.$message = oKMessage;
        this.this$0 = c44136sEq;
        this.$callback = interfaceC44372sNj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMQueryImpl$download$1(this.$message, this.this$0, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMQueryImpl$download$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sIT sit = sIT.AEQbTJ;
            OKMessage oKMessage = this.$message;
            Context contextKWHzl = this.this$0.KWHzl.KWHzl();
            this.label = 1;
            obj = sit.copydefault(oKMessage, contextKWHzl, this);
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
            C56391yDq.AEQbTJ(obj);
        }
        final InterfaceC44372sNj interfaceC44372sNj = this.$callback;
        final OKMessage oKMessage2 = this.$message;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.okimcore.channel.inhouse.impl.InHouseIMQueryImpl$download$1.1
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public final Object emit(sIS sis, Continuation<? super Unit> continuation) {
                if (sis instanceof sIS.StateListAnimator) {
                    Object objWithContext = BuildersKt.withContext(sDN.copydefault.AEQbTJ(), new C05751(interfaceC44372sNj, oKMessage2, ((sIS.StateListAnimator) sis).KWHzl(), null), continuation);
                    return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
                }
                if (sis instanceof sIS.Activity) {
                    Object objWithContext2 = BuildersKt.withContext(sDN.copydefault.AEQbTJ(), new AnonymousClass2(interfaceC44372sNj, oKMessage2, null), continuation);
                    return objWithContext2 == C56442yFn.copydefault() ? objWithContext2 : Unit.INSTANCE;
                }
                if (sis instanceof sIS.Application) {
                    Object objWithContext3 = BuildersKt.withContext(sDN.copydefault.AEQbTJ(), new AnonymousClass3(interfaceC44372sNj, oKMessage2, sis, null), continuation);
                    return objWithContext3 == C56442yFn.copydefault() ? objWithContext3 : Unit.INSTANCE;
                }
                if (!(sis instanceof sIS.TaskDescription)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objWithContext4 = BuildersKt.withContext(sDN.copydefault.AEQbTJ(), new AnonymousClass4(interfaceC44372sNj, oKMessage2, null), continuation);
                return objWithContext4 == C56442yFn.copydefault() ? objWithContext4 : Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.okinc.okimcore.channel.inhouse.impl.InHouseIMQueryImpl$download$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C05751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ InterfaceC44372sNj $callback;
                final /* synthetic */ OKMessage $message;
                final /* synthetic */ int $progress;
                int label;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05751(InterfaceC44372sNj interfaceC44372sNj, OKMessage oKMessage, int i, Continuation<? super C05751> continuation) {
                    super(2, continuation);
                    this.$callback = interfaceC44372sNj;
                    this.$message = oKMessage;
                    this.$progress = i;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C05751(this.$callback, this.$message, this.$progress, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C05751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        this.$callback.OLrzqt(this.$message, this.$progress);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: renamed from: com.okinc.okimcore.channel.inhouse.impl.InHouseIMQueryImpl$download$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ InterfaceC44372sNj $callback;
                final /* synthetic */ OKMessage $message;
                int label;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(InterfaceC44372sNj interfaceC44372sNj, OKMessage oKMessage, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$callback = interfaceC44372sNj;
                    this.$message = oKMessage;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$callback, this.$message, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        this.$callback.copydefault(this.$message);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: renamed from: com.okinc.okimcore.channel.inhouse.impl.InHouseIMQueryImpl$download$1$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ InterfaceC44372sNj $callback;
                final /* synthetic */ OKMessage $message;
                final /* synthetic */ sIS $result;
                int label;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(InterfaceC44372sNj interfaceC44372sNj, OKMessage oKMessage, sIS sis, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$callback = interfaceC44372sNj;
                    this.$message = oKMessage;
                    this.$result = sis;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(this.$callback, this.$message, this.$result, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        this.$callback.AEQbTJ(this.$message, ((sIS.Application) this.$result).copydefault());
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: renamed from: com.okinc.okimcore.channel.inhouse.impl.InHouseIMQueryImpl$download$1$1$4, reason: invalid class name */
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ InterfaceC44372sNj $callback;
                final /* synthetic */ OKMessage $message;
                int label;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(InterfaceC44372sNj interfaceC44372sNj, OKMessage oKMessage, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.$callback = interfaceC44372sNj;
                    this.$message = oKMessage;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(this.$callback, this.$message, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        this.$callback.EZpvd(this.$message);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        };
        this.label = 2;
        if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
