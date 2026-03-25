package com.okinc.okassetslite.api.assets_lite_api.portfoliooverview.utils;

import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okassetslite.api.assets_lite_api.portfoliooverview.utils.CacheApiLoader;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC43419rot;
import o.rWO;
import o.yHO;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes23.dex */
public final class CacheApiLoader$getCacheThenNetworkFlow$2<R> extends SuspendLambda implements Function2<FlowCollector<? super rWO<? extends R>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ yHO<CacheStrategy, Integer, Continuation<? super AbstractC43419rot<? extends T, OKServerException>>, Object> $apiCall;
    final /* synthetic */ CacheApiLoader.ExpiryStrategy $expiryStrategy;
    final /* synthetic */ Function2<T, Continuation<? super R>, Object> $mapper;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CacheApiLoader this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super com.okinc.network.okg.cache.CacheStrategy, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super o.rot<? extends T, com.okinc.network.okg.response.OKServerException>>, ? extends java.lang.Object> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CacheApiLoader$getCacheThenNetworkFlow$2(CacheApiLoader cacheApiLoader, yHO<? super CacheStrategy, ? super Integer, ? super Continuation<? super AbstractC43419rot<? extends T, OKServerException>>, ? extends Object> yho, CacheApiLoader.ExpiryStrategy expiryStrategy, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super CacheApiLoader$getCacheThenNetworkFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = cacheApiLoader;
        this.$apiCall = yho;
        this.$expiryStrategy = expiryStrategy;
        this.$mapper = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CacheApiLoader$getCacheThenNetworkFlow$2 cacheApiLoader$getCacheThenNetworkFlow$2 = new CacheApiLoader$getCacheThenNetworkFlow$2(this.this$0, this.$apiCall, this.$expiryStrategy, this.$mapper, continuation);
        cacheApiLoader$getCacheThenNetworkFlow$2.L$0 = obj;
        return cacheApiLoader$getCacheThenNetworkFlow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super rWO<? extends R>> flowCollector, Continuation<? super Unit> continuation) {
        return ((CacheApiLoader$getCacheThenNetworkFlow$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.okinc.okassetslite.api.assets_lite_api.portfoliooverview.utils.CacheApiLoader$getCacheThenNetworkFlow$2<R> for r11v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r11.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L45
            if (r1 == r6) goto L3d
            if (r1 == r5) goto L35
            if (r1 == r4) goto L2d
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            o.C56391yDq.AEQbTJ(r12)
            goto Lda
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            o.C56391yDq.AEQbTJ(r12)
            goto Lbe
        L2d:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            o.C56391yDq.AEQbTJ(r12)
            goto L8f
        L35:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            o.C56391yDq.AEQbTJ(r12)
            goto L76
        L3d:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            o.C56391yDq.AEQbTJ(r12)
            goto L66
        L45:
            o.C56391yDq.AEQbTJ(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            com.okinc.okassetslite.api.assets_lite_api.portfoliooverview.utils.CacheApiLoader r1 = r11.this$0
            o.yHO<com.okinc.network.okg.cache.CacheStrategy, java.lang.Integer, kotlin.coroutines.Continuation<? super o.rot<? extends T, com.okinc.network.okg.response.OKServerException>>, java.lang.Object> r7 = r11.$apiCall
            com.okinc.okassetslite.api.assets_lite_api.portfoliooverview.utils.CacheApiLoader$ExpiryStrategy r8 = r11.$expiryStrategy
            int r8 = r8.getExpiryInSeconds()
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r9 = r11.$mapper
            r11.L$0 = r12
            r11.label = r6
            java.lang.Object r1 = com.okinc.okassetslite.api.assets_lite_api.portfoliooverview.utils.CacheApiLoader.OLrzqt(r1, r7, r8, r9, r11)
            if (r1 != r0) goto L63
            return r0
        L63:
            r10 = r1
            r1 = r12
            r12 = r10
        L66:
            o.rWO$Activity r6 = new o.rWO$Activity
            r6.<init>(r12)
            r11.L$0 = r1
            r11.label = r5
            java.lang.Object r12 = r1.emit(r6, r11)
            if (r12 != r0) goto L76
            return r0
        L76:
            o.yHO<com.okinc.network.okg.cache.CacheStrategy, java.lang.Integer, kotlin.coroutines.Continuation<? super o.rot<? extends T, com.okinc.network.okg.response.OKServerException>>, java.lang.Object> r12 = r11.$apiCall
            com.okinc.network.okg.cache.CacheStrategy r5 = com.okinc.network.okg.cache.CacheStrategy.NO_CACHE
            com.okinc.okassetslite.api.assets_lite_api.portfoliooverview.utils.CacheApiLoader$ExpiryStrategy r6 = r11.$expiryStrategy
            int r6 = r6.getExpiryInSeconds()
            java.lang.Integer r6 = o.C56443yFo.AEQbTJ(r6)
            r11.L$0 = r1
            r11.label = r4
            java.lang.Object r12 = r12.invoke(r5, r6, r11)
            if (r12 != r0) goto L8f
            return r0
        L8f:
            o.rot r12 = (o.AbstractC43419rot) r12
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "emit network response: "
            r4.append(r5)
            r4.append(r12)
            java.lang.String r5 = "FirstCacheAlwaysNetworkApiLoader"
            java.lang.String r4 = r4.toString()
            o.pUU.KWHzl(r5, r4)
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r11.$mapper
            boolean r5 = r12 instanceof o.AbstractC43419rot.StateListAnimator
            if (r5 == 0) goto Lc5
            o.rot$StateListAnimator r12 = (o.AbstractC43419rot.StateListAnimator) r12
            java.lang.Object r12 = r12.KWHzl()
            r11.L$0 = r1
            r11.label = r3
            java.lang.Object r12 = r4.invoke(r12, r11)
            if (r12 != r0) goto Lbe
            return r0
        Lbe:
            o.rot$StateListAnimator r3 = new o.rot$StateListAnimator
            r3.<init>(r12)
            r12 = r3
            goto Lc9
        Lc5:
            boolean r3 = r12 instanceof o.AbstractC43419rot.ActionBar
            if (r3 == 0) goto Ldd
        Lc9:
            o.rWO$StateListAnimator r3 = new o.rWO$StateListAnimator
            r3.<init>(r12)
            r12 = 0
            r11.L$0 = r12
            r11.label = r2
            java.lang.Object r12 = r1.emit(r3, r11)
            if (r12 != r0) goto Lda
            return r0
        Lda:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        Ldd:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.okassetslite.api.assets_lite_api.portfoliooverview.utils.CacheApiLoader$getCacheThenNetworkFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
