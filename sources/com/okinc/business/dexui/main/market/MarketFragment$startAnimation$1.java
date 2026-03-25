package com.okinc.business.dexui.main.market;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.hNW;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketFragment$startAnimation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delay;
    final /* synthetic */ long $duration;
    final /* synthetic */ List<String> $tokens;
    int label;
    final /* synthetic */ hNW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFragment$startAnimation$1(hNW hnw, List<String> list, long j, long j2, Continuation<? super MarketFragment$startAnimation$1> continuation) {
        super(2, continuation);
        this.this$0 = hnw;
        this.$tokens = list;
        this.$delay = j;
        this.$duration = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketFragment$startAnimation$1(this.this$0, this.$tokens, this.$delay, this.$duration, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketFragment$startAnimation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.dexui.main.market.MarketFragment$startAnimation$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $delay;
        final /* synthetic */ long $duration;
        final /* synthetic */ List<String> $tokens;
        Object L$0;
        int label;
        final /* synthetic */ hNW this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(hNW hnw, List<String> list, long j, long j2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = hnw;
            this.$tokens = list;
            this.$delay = j;
            this.$duration = j2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$tokens, this.$delay, this.$duration, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a9 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a7 -> B:28:0x006e). Please report as a decompilation issue!!! */
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
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = o.C56437yFi.OLrzqt()
                int r1 = r9.label
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L35
                if (r1 == r5) goto L2d
                if (r1 == r4) goto L22
                if (r1 != r3) goto L1a
                java.lang.Object r1 = r9.L$0
                kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
                o.C56391yDq.AEQbTJ(r10)     // Catch: java.lang.Exception -> L2a
                goto L6e
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                java.lang.Object r1 = r9.L$0
                kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
                o.C56391yDq.AEQbTJ(r10)     // Catch: java.lang.Exception -> L2a
                goto L9d
            L2a:
                r10 = move-exception
                goto Laa
            L2d:
                java.lang.Object r1 = r9.L$0
                kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
                o.C56391yDq.AEQbTJ(r10)
                goto L6e
            L35:
                o.C56391yDq.AEQbTJ(r10)
                kotlin.jvm.internal.Ref$IntRef r1 = new kotlin.jvm.internal.Ref$IntRef
                r1.<init>()
                o.hNW r10 = r9.this$0
                o.hAL r10 = o.hNW.copydefault(r10)
                if (r10 == 0) goto L52
                o.xfy r10 = r10.isConnected
                if (r10 == 0) goto L52
                com.okinc.uilab.edit.OKEditText r10 = r10.KWHzl()
                if (r10 == 0) goto L52
                r10.setTranslationY(r2)
            L52:
                o.hNW r10 = r9.this$0
                java.util.List<java.lang.String> r6 = r9.$tokens
                int r7 = r1.element
                java.lang.Object r6 = r6.get(r7)
                java.lang.String r6 = (java.lang.String) r6
                o.hNW.copydefault(r10, r6)
                long r6 = r9.$delay
                r9.L$0 = r1
                r9.label = r5
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r6, r9)
                if (r10 != r0) goto L6e
                return r0
            L6e:
                kotlin.jvm.internal.Ref$BooleanRef r10 = new kotlin.jvm.internal.Ref$BooleanRef
                r10.<init>()
                o.hNW r5 = r9.this$0     // Catch: java.lang.Exception -> L2a
                com.okinc.business.market.features.home.ui.MarketHomeViewModel r5 = o.hNW.valueOf(r5)     // Catch: java.lang.Exception -> L2a
                long r6 = r9.$duration     // Catch: java.lang.Exception -> L2a
                kotlinx.coroutines.flow.Flow r5 = r5.copydefault(r6)     // Catch: java.lang.Exception -> L2a
                com.okinc.business.dexui.main.market.MarketFragment$startAnimation$1$1$1 r6 = new com.okinc.business.dexui.main.market.MarketFragment$startAnimation$1$1$1     // Catch: java.lang.Exception -> L2a
                r7 = 0
                r6.<init>(r7)     // Catch: java.lang.Exception -> L2a
                kotlinx.coroutines.flow.Flow r5 = kotlinx.coroutines.flow.FlowKt.m7441catch(r5, r6)     // Catch: java.lang.Exception -> L2a
                com.okinc.business.dexui.main.market.MarketFragment$startAnimation$1$1$3 r6 = new com.okinc.business.dexui.main.market.MarketFragment$startAnimation$1$1$3     // Catch: java.lang.Exception -> L2a
                o.hNW r7 = r9.this$0     // Catch: java.lang.Exception -> L2a
                java.util.List<java.lang.String> r8 = r9.$tokens     // Catch: java.lang.Exception -> L2a
                r6.<init>()     // Catch: java.lang.Exception -> L2a
                r9.L$0 = r1     // Catch: java.lang.Exception -> L2a
                r9.label = r4     // Catch: java.lang.Exception -> L2a
                java.lang.Object r10 = r5.collect(r6, r9)     // Catch: java.lang.Exception -> L2a
                if (r10 != r0) goto L9d
                return r0
            L9d:
                long r5 = r9.$delay     // Catch: java.lang.Exception -> L2a
                r9.L$0 = r1     // Catch: java.lang.Exception -> L2a
                r9.label = r3     // Catch: java.lang.Exception -> L2a
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r5, r9)     // Catch: java.lang.Exception -> L2a
                if (r10 != r0) goto L6e
                return r0
            Laa:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "animation exception: "
                r0.append(r1)
                r0.append(r10)
                java.lang.String r10 = "MarketFragment"
                java.lang.String r0 = r0.toString()
                o.pUU.EZpvd(r10, r0)
                o.hNW r10 = r9.this$0
                o.hAL r10 = o.hNW.copydefault(r10)
                if (r10 == 0) goto Ld5
                o.xfy r10 = r10.isConnected
                if (r10 == 0) goto Ld5
                com.okinc.uilab.edit.OKEditText r10 = r10.KWHzl()
                if (r10 == 0) goto Ld5
                r10.setTranslationY(r2)
            Ld5:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.dexui.main.market.MarketFragment$startAnimation$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.okinc.business.dexui.main.market.MarketFragment$startAnimation$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03311 extends SuspendLambda implements yHO<FlowCollector<? super Float>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C03311(Continuation<? super C03311> continuation) {
                super(3, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // o.yHO
            public final Object invoke(FlowCollector<? super Float> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                C03311 c03311 = new C03311(continuation);
                c03311.L$0 = th;
                return c03311.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    pUU.EZpvd("MarketFragment", "catch exception: " + ((Throwable) this.L$0));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            hNW hnw = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(hnw, this.$tokens, this.$delay, this.$duration, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(hnw, state, anonymousClass1, this) == objCopydefault) {
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
