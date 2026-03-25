package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28540kch {
    public final Mutex AEQbTJ;
    public final C28541kci OLrzqt;
    public final java.util.HashMap<java.lang.Long, C28543kck> copydefault;

    @yCM
    public C28540kch(@NotNull C28541kci c28541kci) {
        Intrinsics.checkNotNullParameter(c28541kci, "");
        this.OLrzqt = c28541kci;
        this.AEQbTJ = MutexKt.Mutex$default(false, 1, null);
        this.copydefault = new java.util.HashMap<>(5);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00eb -> B:25:0x0071). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x015f -> B:71:0x0162). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    public final java.lang.Object EZpvd(@org.jetbrains.annotations.NotNull com.okinc.business.market.data.model.HomeTokenListWsData r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.okinc.business.market.features.home_token_list.domain.HomeToken>>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.okinc.business.market.features.home_token_list.domain.CollectWsChunkUseCase$onNewChunk$1
            if (r0 == 0) goto L13
            r0 = r12
            com.okinc.business.market.features.home_token_list.domain.CollectWsChunkUseCase$onNewChunk$1 r0 = (com.okinc.business.market.features.home_token_list.domain.CollectWsChunkUseCase$onNewChunk$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            com.okinc.business.market.features.home_token_list.domain.CollectWsChunkUseCase$onNewChunk$1 r0 = new com.okinc.business.market.features.home_token_list.domain.CollectWsChunkUseCase$onNewChunk$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = o.C56437yFi.OLrzqt()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L8b
            if (r2 == r5) goto L7b
            if (r2 == r4) goto L55
            if (r2 != r3) goto L4d
            java.lang.Object r11 = r0.L$3
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r2 = r0.L$2
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.sync.Mutex r4 = (kotlinx.coroutines.sync.Mutex) r4
            java.lang.Object r5 = r0.L$0
            o.kch r5 = (o.C28540kch) r5
            o.C56391yDq.AEQbTJ(r12)     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            kotlin.Result r12 = (kotlin.Result) r12     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            java.lang.Object r12 = r12.m7386unboximpl()     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            goto L162
        L47:
            r11 = move-exception
            goto L1c3
        L4a:
            r11 = move-exception
            goto L1c5
        L4d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L55:
            java.lang.Object r11 = r0.L$3
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r2 = r0.L$2
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r3 = r0.L$1
            kotlinx.coroutines.sync.Mutex r3 = (kotlinx.coroutines.sync.Mutex) r3
            java.lang.Object r5 = r0.L$0
            o.kch r5 = (o.C28540kch) r5
            o.C56391yDq.AEQbTJ(r12)     // Catch: java.lang.Throwable -> L75 java.util.concurrent.CancellationException -> L78
            kotlin.Result r12 = (kotlin.Result) r12     // Catch: java.lang.Throwable -> L75 java.util.concurrent.CancellationException -> L78
            java.lang.Object r12 = r12.m7386unboximpl()     // Catch: java.lang.Throwable -> L75 java.util.concurrent.CancellationException -> L78
            r9 = r0
            r0 = r11
            r11 = r3
        L71:
            r3 = r2
            r2 = r9
            goto Lef
        L75:
            r11 = move-exception
            goto L1c9
        L78:
            r11 = move-exception
            goto L1e1
        L7b:
            java.lang.Object r11 = r0.L$2
            kotlinx.coroutines.sync.Mutex r11 = (kotlinx.coroutines.sync.Mutex) r11
            java.lang.Object r2 = r0.L$1
            com.okinc.business.market.data.model.HomeTokenListWsData r2 = (com.okinc.business.market.data.model.HomeTokenListWsData) r2
            java.lang.Object r5 = r0.L$0
            o.kch r5 = (o.C28540kch) r5
            o.C56391yDq.AEQbTJ(r12)
            goto La2
        L8b:
            o.C56391yDq.AEQbTJ(r12)
            kotlinx.coroutines.sync.Mutex r12 = r10.AEQbTJ
            r0.L$0 = r10
            r0.L$1 = r11
            r0.L$2 = r12
            r0.label = r5
            java.lang.Object r2 = r12.lock(r6, r0)
            if (r2 != r1) goto L9f
            return r1
        L9f:
            r5 = r10
            r2 = r11
            r11 = r12
        La2:
            kotlin.Result$Application r12 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            int r12 = r2.EZpvd()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            if (r12 != 0) goto L10c
            java.util.List r12 = r2.copydefault()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            boolean r12 = r12.isEmpty()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            if (r12 == 0) goto Lba
            java.util.List r12 = kotlin.collections.CollectionsKt.EZpvd()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            goto L1bc
        Lba:
            java.util.HashMap<java.lang.Long, o.kck> r12 = r5.copydefault     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            r12.clear()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.util.List r12 = r2.copydefault()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            r2.<init>()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
        Lcc:
            boolean r3 = r12.hasNext()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            if (r3 == 0) goto L107
            java.lang.Object r3 = r12.next()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            com.okinc.business.market.data.model.HomeTokenData r3 = (com.okinc.business.market.data.model.HomeTokenData) r3     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            o.kci r7 = r5.OLrzqt     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            r0.L$3 = r12     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            r0.label = r4     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.lang.Object r3 = r7.copydefault(r3, r0)     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            if (r3 != r1) goto Leb
            return r1
        Leb:
            r9 = r0
            r0 = r12
            r12 = r3
            goto L71
        Lef:
            boolean r7 = kotlin.Result.m7383isFailureimpl(r12)     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            if (r7 == 0) goto Lf6
            r12 = r6
        Lf6:
            com.okinc.business.market.features.home_token_list.domain.HomeToken r12 = (com.okinc.business.market.features.home_token_list.domain.HomeToken) r12     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            if (r12 == 0) goto Lfd
            r3.add(r12)     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
        Lfd:
            r12 = r0
            r0 = r2
            r2 = r3
            goto Lcc
        L101:
            r12 = move-exception
            goto L1c7
        L104:
            r12 = move-exception
            goto L1df
        L107:
            r12 = r2
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            goto L1bc
        L10c:
            java.util.HashMap<java.lang.Long, o.kck> r12 = r5.copydefault     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            long r7 = r2.KWHzl()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.lang.Long r4 = o.C56443yFo.KWHzl(r7)     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.lang.Object r12 = r12.get(r4)     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            o.kck r12 = (o.C28543kck) r12     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            if (r12 != 0) goto L127
            o.kck r12 = new o.kck     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            int r4 = r2.EZpvd()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            r12.<init>(r4)     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
        L127:
            java.util.Set r4 = r12.copydefault()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            r4.add(r2)     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            boolean r4 = r12.OLrzqt()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            if (r4 == 0) goto L179
            java.util.List r12 = r12.AEQbTJ()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            r2.<init>()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            r4 = r11
            r11 = r12
        L143:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            if (r12 == 0) goto L171
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            com.okinc.business.market.data.model.HomeTokenData r12 = (com.okinc.business.market.data.model.HomeTokenData) r12     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            o.kci r7 = r5.OLrzqt     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            r0.L$3 = r11     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            r0.label = r3     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            java.lang.Object r12 = r7.copydefault(r12, r0)     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            if (r12 != r1) goto L162
            return r1
        L162:
            boolean r7 = kotlin.Result.m7383isFailureimpl(r12)     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            if (r7 == 0) goto L169
            r12 = r6
        L169:
            com.okinc.business.market.features.home_token_list.domain.HomeToken r12 = (com.okinc.business.market.features.home_token_list.domain.HomeToken) r12     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            if (r12 == 0) goto L143
            r2.add(r12)     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            goto L143
        L171:
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            java.util.HashMap<java.lang.Long, o.kck> r11 = r5.copydefault     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            r11.clear()     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            goto L1be
        L179:
            java.util.HashMap<java.lang.Long, o.kck> r0 = r5.copydefault     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            r1 = 5
            if (r0 < r1) goto L1ab
            java.util.HashMap<java.lang.Long, o.kck> r0 = r5.copydefault     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.util.List r0 = kotlin.collections.CollectionsKt.wlaJM(r0)     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.lang.Comparable r0 = kotlin.collections.CollectionsKt.isConnected(r0)     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            if (r0 == 0) goto L1ab
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.util.HashMap<java.lang.Long, o.kck> r3 = r5.copydefault     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.lang.Long r0 = o.C56443yFo.KWHzl(r0)     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.lang.Object r0 = r3.remove(r0)     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            o.kck r0 = (o.C28543kck) r0     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
        L1ab:
            java.util.HashMap<java.lang.Long, o.kck> r0 = r5.copydefault     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            long r1 = r2.KWHzl()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.lang.Long r1 = o.C56443yFo.KWHzl(r1)     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            r0.put(r1, r12)     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
            java.util.List r12 = kotlin.collections.CollectionsKt.EZpvd()     // Catch: java.lang.Throwable -> L101 java.util.concurrent.CancellationException -> L104
        L1bc:
            r4 = r11
            r2 = r12
        L1be:
            java.lang.Object r11 = kotlin.Result.m7377constructorimpl(r2)     // Catch: java.lang.Throwable -> L47 java.util.concurrent.CancellationException -> L4a
            goto L1db
        L1c3:
            r3 = r4
            goto L1c9
        L1c5:
            r3 = r4
            goto L1e1
        L1c7:
            r3 = r11
            r11 = r12
        L1c9:
            java.lang.String r12 = "DEX"
            java.lang.String r0 = "dexRunCatching"
            o.pUU.AEQbTJ(r12, r0, r11)     // Catch: java.lang.Throwable -> L1e2
            kotlin.Result$Application r12 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1e2
            java.lang.Object r11 = o.C56391yDq.EZpvd(r11)     // Catch: java.lang.Throwable -> L1e2
            java.lang.Object r11 = kotlin.Result.m7377constructorimpl(r11)     // Catch: java.lang.Throwable -> L1e2
            r4 = r3
        L1db:
            r4.unlock(r6)
            return r11
        L1df:
            r3 = r11
            r11 = r12
        L1e1:
            throw r11     // Catch: java.lang.Throwable -> L1e2
        L1e2:
            r11 = move-exception
            r3.unlock(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C28540kch.EZpvd(com.okinc.business.market.data.model.HomeTokenListWsData, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
