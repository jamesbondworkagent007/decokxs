package com.okinc.business.defi.common.utils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class LifecycleExtKt$collectOnLifecycle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<T, Unit> $collect;
    final /* synthetic */ Flow<T> $flow;
    final /* synthetic */ Lifecycle.State $lifecycleState;
    final /* synthetic */ LifecycleOwner $this_collectOnLifecycle;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.flow.Flow<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleExtKt$collectOnLifecycle$1(LifecycleOwner lifecycleOwner, Lifecycle.State state, Flow<? extends T> flow, Function1<? super T, Unit> function1, Continuation<? super LifecycleExtKt$collectOnLifecycle$1> continuation) {
        super(2, continuation);
        this.$this_collectOnLifecycle = lifecycleOwner;
        this.$lifecycleState = state;
        this.$flow = flow;
        this.$collect = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LifecycleExtKt$collectOnLifecycle$1(this.$this_collectOnLifecycle, this.$lifecycleState, this.$flow, this.$collect, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LifecycleExtKt$collectOnLifecycle$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.common.utils.LifecycleExtKt$collectOnLifecycle$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<T, Unit> $collect;
        final /* synthetic */ Flow<T> $flow;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.flow.Flow<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Flow<? extends T> flow, Function1<? super T, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$flow = flow;
            this.$collect = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$flow, this.$collect, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.okinc.business.defi.common.utils.LifecycleExtKt$collectOnLifecycle$1$1 for r4v1 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = o.C56437yFi.OLrzqt()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                o.C56391yDq.AEQbTJ(r5)
                goto L2c
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                o.C56391yDq.AEQbTJ(r5)
                kotlinx.coroutines.flow.Flow<T> r5 = r4.$flow
                com.okinc.business.defi.common.utils.LifecycleExtKt$collectOnLifecycle$1$1$1 r1 = new com.okinc.business.defi.common.utils.LifecycleExtKt$collectOnLifecycle$1$1$1
                kotlin.jvm.functions.Function1<T, kotlin.Unit> r3 = r4.$collect
                r1.<init>()
                r4.label = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L2c
                return r0
            L2c:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.defi.common.utils.LifecycleExtKt$collectOnLifecycle$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner lifecycleOwner = this.$this_collectOnLifecycle;
            Lifecycle.State state = this.$lifecycleState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flow, this.$collect, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
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
