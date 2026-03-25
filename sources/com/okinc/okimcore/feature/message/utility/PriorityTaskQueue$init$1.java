package com.okinc.okimcore.feature.message.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.sync.Mutex;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sMQ;
import o.sMV;

/* JADX INFO: loaded from: classes10.dex */
public final class PriorityTaskQueue$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ sMV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriorityTaskQueue$init$1(sMV smv, Continuation<? super PriorityTaskQueue$init$1> continuation) {
        super(2, continuation);
        this.this$0 = smv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PriorityTaskQueue$init$1 priorityTaskQueue$init$1 = new PriorityTaskQueue$init$1(this.this$0, continuation);
        priorityTaskQueue$init$1.L$0 = obj;
        return priorityTaskQueue$init$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PriorityTaskQueue$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: o.sMV */
    /* JADX DEBUG: Multi-variable search result rejected for r8v11, resolved type: o.sMV */
    /* JADX DEBUG: Multi-variable search result rejected for r8v5, resolved type: o.sMV */
    /* JADX WARN: Can't wrap try/catch for region: R(7:84|39|40|82|41|48|(5:80|50|(1:52)(1:53)|54|58)) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e0, code lost:
    
        r11 = kotlin.Result.Companion;
        r0 = kotlin.Result.m7377constructorimpl(o.C56391yDq.EZpvd(r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #1 {all -> 0x00b5, blocks: (B:13:0x0035, B:21:0x005e, B:23:0x0064, B:30:0x0099, B:32:0x009e, B:34:0x00a4, B:48:0x00ea, B:58:0x0115, B:57:0x010c, B:47:0x00e0, B:61:0x0120, B:62:0x0123, B:63:0x0124, B:16:0x0049, B:20:0x005c, B:50:0x00f0, B:52:0x00f8, B:54:0x0107, B:27:0x0083, B:29:0x0090), top: B:79:0x000d, outer: #0, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090 A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #5 {all -> 0x011f, blocks: (B:27:0x0083, B:29:0x0090), top: B:86:0x0083, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e A[Catch: all -> 0x00b5, TryCatch #1 {all -> 0x00b5, blocks: (B:13:0x0035, B:21:0x005e, B:23:0x0064, B:30:0x0099, B:32:0x009e, B:34:0x00a4, B:48:0x00ea, B:58:0x0115, B:57:0x010c, B:47:0x00e0, B:61:0x0120, B:62:0x0123, B:63:0x0124, B:16:0x0049, B:20:0x005c, B:50:0x00f0, B:52:0x00f8, B:54:0x0107, B:27:0x0083, B:29:0x0090), top: B:79:0x000d, outer: #0, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #1 {all -> 0x00b5, blocks: (B:13:0x0035, B:21:0x005e, B:23:0x0064, B:30:0x0099, B:32:0x009e, B:34:0x00a4, B:48:0x00ea, B:58:0x0115, B:57:0x010c, B:47:0x00e0, B:61:0x0120, B:62:0x0123, B:63:0x0124, B:16:0x0049, B:20:0x005c, B:50:0x00f0, B:52:0x00f8, B:54:0x0107, B:27:0x0083, B:29:0x0090), top: B:79:0x000d, outer: #0, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v6, types: [T, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x011c -> B:21:0x005e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        CoroutineScope coroutineScope;
        Mutex mutex;
        CoroutineScope coroutineScope2;
        sMV smv;
        Ref.ObjectRef objectRef;
        sMQ smqPoll;
        sMQ smq;
        Unit unit;
        sMV smv2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                sMV smv3 = this.this$0;
                Result.Application application2 = Result.Companion;
                smv2 = smv3;
            } else if (i == 1) {
                Mutex mutex2 = (Mutex) this.L$3;
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.L$2;
                coroutineScope2 = (CoroutineScope) this.L$1;
                sMV smv4 = (sMV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutex = mutex2;
                objectRef = objectRef2;
                smv = smv4;
                try {
                    smqPoll = smv.OLrzqt().poll();
                    if (smqPoll == null) {
                        ?? CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        smv.copydefault((CompletableDeferred<Unit>) CompletableDeferred$default);
                        objectRef.element = CompletableDeferred$default;
                    }
                    if (smqPoll == null) {
                        CompletableDeferred completableDeferred = (CompletableDeferred) objectRef.element;
                        if (completableDeferred != null) {
                            this.L$0 = smv;
                            this.L$1 = coroutineScope2;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 2;
                            if (completableDeferred.await(this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } else {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            smq = smqPoll;
                        }
                        Result.Application application3 = Result.Companion;
                        smq = smqPoll;
                        Object objM7377constructorimpl2 = Result.m7377constructorimpl(C56443yFo.KWHzl(smq.OLrzqt().complete(BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new PriorityTaskQueue$init$1$1$1$job$1(smv, smqPoll, null), 3, null))));
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                        if (thM7380exceptionOrNullimpl != null) {
                            try {
                            } catch (Throwable th3) {
                                Result.Application application4 = Result.Companion;
                                Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
                            }
                            Result.Application application5 = Result.Companion;
                            Continuation<Unit> continuationAEQbTJ = smq.AEQbTJ();
                            if (continuationAEQbTJ != null) {
                                continuationAEQbTJ.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
                                unit = Unit.INSTANCE;
                            } else {
                                unit = null;
                            }
                            Result.m7377constructorimpl(unit);
                            smq.OLrzqt().completeExceptionally(thM7380exceptionOrNullimpl);
                        }
                    }
                    coroutineScope = coroutineScope2;
                    smv2 = smv;
                } finally {
                    mutex.unlock(null);
                }
            } else {
                if (i != 2) {
                    if (i == 3) {
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th4 = (Throwable) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    throw th4;
                }
                coroutineScope = (CoroutineScope) this.L$1;
                sMV smv5 = (sMV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                smv2 = smv5;
            }
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                mutex = smv2.KWHzl;
                this.L$0 = smv2;
                this.L$1 = coroutineScope;
                this.L$2 = objectRef3;
                this.L$3 = mutex;
                this.label = 1;
                if (mutex.lock(null, this) == objCopydefault) {
                    return objCopydefault;
                }
                coroutineScope2 = coroutineScope;
                objectRef = objectRef3;
                smv = smv2;
                smqPoll = smv.OLrzqt().poll();
                if (smqPoll == null) {
                }
                if (smqPoll == null) {
                }
                coroutineScope = coroutineScope2;
                smv2 = smv;
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    sMV smv6 = this.this$0;
                    Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl2 != null) {
                        C44124sEe.imLogSync$default(smv6.gEmmrt + " => priority task queue failed", thM7380exceptionOrNullimpl2, null, 4, null);
                    }
                    NonCancellable nonCancellable = NonCancellable.INSTANCE;
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                    if (BuildersKt.withContext(nonCancellable, anonymousClass3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
            }
        } catch (Throwable th5) {
            NonCancellable nonCancellable2 = NonCancellable.INSTANCE;
            AnonymousClass3 anonymousClass32 = new AnonymousClass3(this.this$0, null);
            this.L$0 = th5;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 4;
            if (BuildersKt.withContext(nonCancellable2, anonymousClass32, this) == objCopydefault) {
                return objCopydefault;
            }
            throw th5;
        }
    }

    /* JADX INFO: renamed from: com.okinc.okimcore.feature.message.utility.PriorityTaskQueue$init$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ sMV this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(sMV smv, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = smv;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List<sMQ> arrayList;
            Mutex mutex;
            sMV smv;
            Unit unit;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                smv = (sMV) this.L$3;
                mutex = (Mutex) this.L$2;
                arrayList = (List) this.L$1;
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                arrayList = new ArrayList();
                mutex = this.this$0.KWHzl;
                sMV smv2 = this.this$0;
                this.L$0 = coroutineScope;
                this.L$1 = arrayList;
                this.L$2 = mutex;
                this.L$3 = smv2;
                this.label = 1;
                if (mutex.lock(null, this) == objCopydefault) {
                    return objCopydefault;
                }
                smv = smv2;
            }
            try {
                if (!smv.OLrzqt().isEmpty()) {
                    arrayList.addAll(smv.OLrzqt());
                    smv.OLrzqt().clear();
                }
                Unit unit2 = Unit.INSTANCE;
                mutex.unlock(null);
                if (!arrayList.isEmpty()) {
                    CancellationException cancellationException = new CancellationException(this.this$0.gEmmrt + " => priority task queue cancelled");
                    sMV smv3 = this.this$0;
                    for (sMQ smq : arrayList) {
                        pUU.EZpvd(smv3.gEmmrt, smq + " => task cancelled due to queue shutdown");
                        try {
                            Result.Application application = Result.Companion;
                            Continuation<Unit> continuationAEQbTJ = smq.AEQbTJ();
                            if (continuationAEQbTJ != null) {
                                continuationAEQbTJ.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(cancellationException)));
                                unit = Unit.INSTANCE;
                            } else {
                                unit = null;
                            }
                            Result.m7377constructorimpl(unit);
                        } catch (Throwable th) {
                            Result.Application application2 = Result.Companion;
                            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                        smq.OLrzqt().completeExceptionally(cancellationException);
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                mutex.unlock(null);
                throw th2;
            }
        }
    }
}
