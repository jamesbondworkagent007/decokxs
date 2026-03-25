package com.okinc.business.market.features.meme.ui;

import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C28908kje;
import o.C28915kjl;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MemePumpAdapter$startTimeUpdates$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C28908kje this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemePumpAdapter$startTimeUpdates$1(C28908kje c28908kje, Continuation<? super MemePumpAdapter$startTimeUpdates$1> continuation) {
        super(2, continuation);
        this.this$0 = c28908kje;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MemePumpAdapter$startTimeUpdates$1 memePumpAdapter$startTimeUpdates$1 = new MemePumpAdapter$startTimeUpdates$1(this.this$0, continuation);
        memePumpAdapter$startTimeUpdates$1.L$0 = obj;
        return memePumpAdapter$startTimeUpdates$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemePumpAdapter$startTimeUpdates$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:7:0x0012, B:15:0x002e, B:17:0x0039, B:20:0x0046, B:23:0x005d, B:12:0x0022), top: B:29:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006b -> B:15:0x002e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        long jOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
            } else if (i == 1) {
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                jOLrzqt = this.this$0.OLrzqt();
                this.L$0 = coroutineScope;
                this.label = 2;
                if (DelayKt.delay(jOLrzqt, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            CoroutineScopeKt.ensureActive(coroutineScope);
            if (!this.this$0.OLrzqt && !this.this$0.fARcdN.isEmpty()) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.L$0 = coroutineScope;
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
                jOLrzqt = this.this$0.OLrzqt();
                this.L$0 = coroutineScope;
                this.label = 2;
                if (DelayKt.delay(jOLrzqt, this) == objCopydefault) {
                }
                CoroutineScopeKt.ensureActive(coroutineScope);
                if (!this.this$0.OLrzqt) {
                    MainCoroutineDispatcher main2 = Dispatchers.getMain();
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, null);
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (BuildersKt.withContext(main2, anonymousClass12, this) == objCopydefault) {
                    }
                    jOLrzqt = this.this$0.OLrzqt();
                    this.L$0 = coroutineScope;
                    this.label = 2;
                    if (DelayKt.delay(jOLrzqt, this) == objCopydefault) {
                    }
                    CoroutineScopeKt.ensureActive(coroutineScope);
                    if (!this.this$0.OLrzqt) {
                    }
                }
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.meme.ui.MemePumpAdapter$startTimeUpdates$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C28908kje this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C28908kje c28908kje, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c28908kje;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScopeKt.ensureActive((CoroutineScope) this.L$0);
                Set set = this.this$0.fARcdN;
                C28908kje c28908kje = this.this$0;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int adapterPosition = ((C28915kjl) it.next()).getAdapterPosition();
                    if (adapterPosition != -1 && adapterPosition < c28908kje.getCurrentList().size()) {
                        c28908kje.notifyItemChanged(adapterPosition, C28908kje.FragmentManager.copydefault);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
