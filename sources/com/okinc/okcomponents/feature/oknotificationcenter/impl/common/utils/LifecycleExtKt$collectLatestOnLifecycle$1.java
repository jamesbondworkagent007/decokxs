package com.okinc.okcomponents.feature.oknotificationcenter.impl.common.utils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes19.dex */
public final class LifecycleExtKt$collectLatestOnLifecycle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ yHO<CoroutineScope, T, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Flow<T> $this_collectLatestOnLifecycle;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.flow.Flow<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yHO<? super kotlinx.coroutines.CoroutineScope, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleExtKt$collectLatestOnLifecycle$1(LifecycleOwner lifecycleOwner, Lifecycle.State state, Flow<? extends T> flow, yHO<? super CoroutineScope, ? super T, ? super Continuation<? super Unit>, ? extends Object> yho, Continuation<? super LifecycleExtKt$collectLatestOnLifecycle$1> continuation) {
        super(2, continuation);
        this.$lifecycleOwner = lifecycleOwner;
        this.$state = state;
        this.$this_collectLatestOnLifecycle = flow;
        this.$block = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LifecycleExtKt$collectLatestOnLifecycle$1(this.$lifecycleOwner, this.$state, this.$this_collectLatestOnLifecycle, this.$block, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LifecycleExtKt$collectLatestOnLifecycle$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okcomponents.feature.oknotificationcenter.impl.common.utils.LifecycleExtKt$collectLatestOnLifecycle$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ yHO<CoroutineScope, T, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Flow<T> $this_collectLatestOnLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.flow.Flow<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super kotlinx.coroutines.CoroutineScope, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Flow<? extends T> flow, yHO<? super CoroutineScope, ? super T, ? super Continuation<? super Unit>, ? extends Object> yho, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_collectLatestOnLifecycle = flow;
            this.$block = yho;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_collectLatestOnLifecycle, this.$block, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: com.okinc.okcomponents.feature.oknotificationcenter.impl.common.utils.LifecycleExtKt$collectLatestOnLifecycle$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05311<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$repeatOnLifecycle;
            final /* synthetic */ yHO<CoroutineScope, T, Continuation<? super Unit>, Object> $block;
            /* synthetic */ Object L$0;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHO<? super kotlinx.coroutines.CoroutineScope, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05311(yHO<? super CoroutineScope, ? super T, ? super Continuation<? super Unit>, ? extends Object> yho, CoroutineScope coroutineScope, Continuation<? super C05311> continuation) {
                super(2, continuation);
                this.$block = yho;
                this.$$this$repeatOnLifecycle = coroutineScope;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05311 c05311 = new C05311(this.$block, this.$$this$repeatOnLifecycle, continuation);
                c05311.L$0 = obj;
                return c05311;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(T t, Continuation<? super Unit> continuation) {
                return ((C05311) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.okinc.okcomponents.feature.oknotificationcenter.impl.common.utils.LifecycleExtKt$collectLatestOnLifecycle$1$1$1<T> for r4v1 'this'  java.lang.Object
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
                    goto L29
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    o.C56391yDq.AEQbTJ(r5)
                    java.lang.Object r5 = r4.L$0
                    o.yHO<kotlinx.coroutines.CoroutineScope, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r4.$block
                    kotlinx.coroutines.CoroutineScope r3 = r4.$$this$repeatOnLifecycle
                    r4.label = r2
                    java.lang.Object r5 = r1.invoke(r3, r5, r4)
                    if (r5 != r0) goto L29
                    return r0
                L29:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.okinc.okcomponents.feature.oknotificationcenter.impl.common.utils.LifecycleExtKt$collectLatestOnLifecycle$1.AnonymousClass1.C05311.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow<T> flow = this.$this_collectLatestOnLifecycle;
                C05311 c05311 = new C05311(this.$block, coroutineScope, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c05311, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            Lifecycle.State state = this.$state;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_collectLatestOnLifecycle, this.$block, null);
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
