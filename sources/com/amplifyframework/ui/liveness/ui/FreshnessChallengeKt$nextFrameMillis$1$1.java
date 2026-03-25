package com.amplifyframework.ui.liveness.ui;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.PausingDispatcherKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes2.dex */
public final class FreshnessChallengeKt$nextFrameMillis$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ MutableState<Long> $millisState;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshnessChallengeKt$nextFrameMillis$1$1(LifecycleOwner lifecycleOwner, MutableState<Long> mutableState, Continuation<? super FreshnessChallengeKt$nextFrameMillis$1$1> continuation) {
        super(2, continuation);
        this.$lifecycleOwner = lifecycleOwner;
        this.$millisState = mutableState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FreshnessChallengeKt$nextFrameMillis$1$1(this.$lifecycleOwner, this.$millisState, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FreshnessChallengeKt$nextFrameMillis$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.amplifyframework.ui.liveness.ui.FreshnessChallengeKt$nextFrameMillis$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Long> $millisState;
        Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<Long> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$millisState = mutableState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$millisState, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = o.C56437yFi.OLrzqt()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r3.L$0
                androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                o.C56391yDq.AEQbTJ(r4)
                goto L30
            L13:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L1b:
                o.C56391yDq.AEQbTJ(r4)
            L1e:
                androidx.compose.runtime.MutableState<java.lang.Long> r1 = r3.$millisState
                com.amplifyframework.ui.liveness.ui.FreshnessChallengeKt$nextFrameMillis$1$1$1$$ExternalSyntheticLambda0 r4 = new com.amplifyframework.ui.liveness.ui.FreshnessChallengeKt$nextFrameMillis$1$1$1$$ExternalSyntheticLambda0
                r4.<init>()
                r3.L$0 = r1
                r3.label = r2
                java.lang.Object r4 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r4, r3)
                if (r4 != r0) goto L30
                return r0
            L30:
                r1.setValue(r4)
                goto L1e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.ui.liveness.ui.FreshnessChallengeKt$nextFrameMillis$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invokeSuspend$lambda$0(long j) {
            return System.currentTimeMillis();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$millisState, null);
            this.label = 1;
            if (PausingDispatcherKt.whenStarted(lifecycleOwner, anonymousClass1, this) == objCopydefault) {
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
