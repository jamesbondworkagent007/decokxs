package com.okinc.business.defi.biz.core.wallet.create;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C12977cxE;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class SyncWalletTaskManager$startSyncTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C12977cxE<T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncWalletTaskManager$startSyncTask$1(C12977cxE<T> c12977cxE, Continuation<? super SyncWalletTaskManager$startSyncTask$1> continuation) {
        super(2, continuation);
        this.this$0 = c12977cxE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SyncWalletTaskManager$startSyncTask$1 syncWalletTaskManager$startSyncTask$1 = new SyncWalletTaskManager$startSyncTask$1(this.this$0, continuation);
        syncWalletTaskManager$startSyncTask$1.L$0 = obj;
        return syncWalletTaskManager$startSyncTask$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SyncWalletTaskManager$startSyncTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.SyncWalletTaskManager$startSyncTask$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C12977cxE<T> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C12977cxE<T> c12977cxE, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c12977cxE;
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

        /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.SyncWalletTaskManager$startSyncTask$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ C12977cxE<T> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02471(C12977cxE<T> c12977cxE, Continuation<? super C02471> continuation) {
                super(2, continuation);
                this.this$0 = c12977cxE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02471(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX DEBUG: Duplicate block (B:24:0x0033) to fix multi-entry loop: BACK_EDGE: B:24:0x0033 -> B:13:0x0033 */
            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0033 */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0059 -> B:13:0x0033). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x0033
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = o.C56437yFi.OLrzqt()
                    int r1 = r5.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r1 = r5.L$0
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    o.C56391yDq.AEQbTJ(r6)     // Catch: java.lang.Exception -> L33
                    goto L33
                L16:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1e:
                    java.lang.Object r1 = r5.L$0
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    o.C56391yDq.AEQbTJ(r6)
                    goto L3e
                L26:
                    o.C56391yDq.AEQbTJ(r6)
                    o.cxE<T> r6 = r5.this$0
                    kotlinx.coroutines.channels.Channel r6 = o.C12977cxE.OLrzqt(r6)
                    kotlinx.coroutines.channels.ChannelIterator r1 = r6.iterator()
                L33:
                    r5.L$0 = r1
                    r5.label = r3
                    java.lang.Object r6 = r1.hasNext(r5)
                    if (r6 != r0) goto L3e
                    return r0
                L3e:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L5c
                    java.lang.Object r6 = r1.next()
                    o.cxG r6 = (o.C12979cxG) r6
                    java.lang.String r4 = "fcj start work1"
                    o.pUU.OLrzqt(r4)
                    r5.L$0 = r1     // Catch: java.lang.Exception -> L33
                    r5.label = r2     // Catch: java.lang.Exception -> L33
                    java.lang.Object r6 = r6.EZpvd(r5)     // Catch: java.lang.Exception -> L33
                    if (r6 != r0) goto L33
                    return r0
                L5c:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.defi.biz.core.wallet.create.SyncWalletTaskManager$startSyncTask$1.AnonymousClass1.C02471.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C02471 c02471 = new C02471(this.this$0, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c02471, this) == objCopydefault) {
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
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, null), 3, null);
            BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3, null);
            BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass3(this.this$0, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.SyncWalletTaskManager$startSyncTask$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C12977cxE<T> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C12977cxE<T> c12977cxE, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c12977cxE;
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

        /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.SyncWalletTaskManager$startSyncTask$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ C12977cxE<T> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C12977cxE<T> c12977cxE, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = c12977cxE;
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

            /* JADX DEBUG: Duplicate block (B:24:0x0033) to fix multi-entry loop: BACK_EDGE: B:24:0x0033 -> B:13:0x0033 */
            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0033 */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0059 -> B:13:0x0033). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x0033
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = o.C56437yFi.OLrzqt()
                    int r1 = r5.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r1 = r5.L$0
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    o.C56391yDq.AEQbTJ(r6)     // Catch: java.lang.Exception -> L33
                    goto L33
                L16:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1e:
                    java.lang.Object r1 = r5.L$0
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    o.C56391yDq.AEQbTJ(r6)
                    goto L3e
                L26:
                    o.C56391yDq.AEQbTJ(r6)
                    o.cxE<T> r6 = r5.this$0
                    kotlinx.coroutines.channels.Channel r6 = o.C12977cxE.OLrzqt(r6)
                    kotlinx.coroutines.channels.ChannelIterator r1 = r6.iterator()
                L33:
                    r5.L$0 = r1
                    r5.label = r3
                    java.lang.Object r6 = r1.hasNext(r5)
                    if (r6 != r0) goto L3e
                    return r0
                L3e:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L5c
                    java.lang.Object r6 = r1.next()
                    o.cxG r6 = (o.C12979cxG) r6
                    java.lang.String r4 = "fcj start work2"
                    o.pUU.OLrzqt(r4)
                    r5.L$0 = r1     // Catch: java.lang.Exception -> L33
                    r5.label = r2     // Catch: java.lang.Exception -> L33
                    java.lang.Object r6 = r6.EZpvd(r5)     // Catch: java.lang.Exception -> L33
                    if (r6 != r0) goto L33
                    return r0
                L5c:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.defi.biz.core.wallet.create.SyncWalletTaskManager$startSyncTask$1.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.SyncWalletTaskManager$startSyncTask$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C12977cxE<T> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C12977cxE<T> c12977cxE, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = c12977cxE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.SyncWalletTaskManager$startSyncTask$1$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ C12977cxE<T> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C12977cxE<T> c12977cxE, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = c12977cxE;
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

            /* JADX DEBUG: Duplicate block (B:24:0x0033) to fix multi-entry loop: BACK_EDGE: B:24:0x0033 -> B:13:0x0033 */
            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0033 */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0059 -> B:13:0x0033). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x0033
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = o.C56437yFi.OLrzqt()
                    int r1 = r5.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r1 = r5.L$0
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    o.C56391yDq.AEQbTJ(r6)     // Catch: java.lang.Exception -> L33
                    goto L33
                L16:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1e:
                    java.lang.Object r1 = r5.L$0
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    o.C56391yDq.AEQbTJ(r6)
                    goto L3e
                L26:
                    o.C56391yDq.AEQbTJ(r6)
                    o.cxE<T> r6 = r5.this$0
                    kotlinx.coroutines.channels.Channel r6 = o.C12977cxE.OLrzqt(r6)
                    kotlinx.coroutines.channels.ChannelIterator r1 = r6.iterator()
                L33:
                    r5.L$0 = r1
                    r5.label = r3
                    java.lang.Object r6 = r1.hasNext(r5)
                    if (r6 != r0) goto L3e
                    return r0
                L3e:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L5c
                    java.lang.Object r6 = r1.next()
                    o.cxG r6 = (o.C12979cxG) r6
                    java.lang.String r4 = "fcj start work3"
                    o.pUU.OLrzqt(r4)
                    r5.L$0 = r1     // Catch: java.lang.Exception -> L33
                    r5.label = r2     // Catch: java.lang.Exception -> L33
                    java.lang.Object r6 = r6.EZpvd(r5)     // Catch: java.lang.Exception -> L33
                    if (r6 != r0) goto L33
                    return r0
                L5c:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.defi.biz.core.wallet.create.SyncWalletTaskManager$startSyncTask$1.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
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
