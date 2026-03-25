package com.okinc.business.market.features.analysis.futures.root;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C25852jIt;
import o.C56391yDq;
import o.C56442yFn;
import o.C8220ayd;
import o.jHT;

/* JADX INFO: loaded from: classes18.dex */
public final class FuturesAnalysisRootFragment$setListener$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C25852jIt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisRootFragment$setListener$2(C25852jIt c25852jIt, Continuation<? super FuturesAnalysisRootFragment$setListener$2> continuation) {
        super(2, continuation);
        this.this$0 = c25852jIt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisRootFragment$setListener$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisRootFragment$setListener$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C25852jIt this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C25852jIt c25852jIt, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c25852jIt;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<C8220ayd> stateFlowEZpvd = this.this$0.fARcdN().KWHzl().EZpvd();
                C03441 c03441 = new C03441(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowEZpvd, c03441, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03441 extends SuspendLambda implements Function2<C8220ayd, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ C25852jIt this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03441(C25852jIt c25852jIt, Continuation<? super C03441> continuation) {
                super(2, continuation);
                this.this$0 = c25852jIt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03441 c03441 = new C03441(this.this$0, continuation);
                c03441.L$0 = obj;
                return c03441;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(C8220ayd c8220ayd, Continuation<? super Unit> continuation) {
                return ((C03441) create(c8220ayd, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                C8220ayd c8220ayd;
                List list;
                C8220ayd c8220ayd2;
                String strOLrzqt;
                Iterator it;
                Object next;
                jHT jht;
                C25852jIt c25852jIt;
                jHT jht2;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C8220ayd c8220ayd3 = (C8220ayd) this.L$0;
                    FuturesAnalysisViewModel futuresAnalysisViewModelFARcdN = this.this$0.fARcdN();
                    this.L$0 = c8220ayd3;
                    this.label = 1;
                    Object objKWHzl = futuresAnalysisViewModelFARcdN.KWHzl(this);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    c8220ayd = c8220ayd3;
                    obj = objKWHzl;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            jht2 = (jHT) this.L$1;
                            c25852jIt = (C25852jIt) this.L$0;
                            C56391yDq.AEQbTJ(obj);
                            c25852jIt.EZpvd(jht2);
                            return Unit.INSTANCE;
                        }
                        list = (List) this.L$1;
                        c8220ayd2 = (C8220ayd) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        strOLrzqt = c8220ayd2.AEQbTJ().OLrzqt();
                        if (!Intrinsics.EZpvd((Object) strOLrzqt, obj) && strOLrzqt.length() > 0) {
                            return Unit.INSTANCE;
                        }
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (Intrinsics.EZpvd((Object) ((jHT) next).EZpvd(), (Object) c8220ayd2.AEQbTJ().OLrzqt())) {
                                break;
                            }
                        }
                        jht = (jHT) next;
                        if (jht != null) {
                            c25852jIt = this.this$0;
                            FuturesAnalysisViewModel futuresAnalysisViewModelFARcdN2 = c25852jIt.fARcdN();
                            this.L$0 = c25852jIt;
                            this.L$1 = jht;
                            this.label = 3;
                            if (futuresAnalysisViewModelFARcdN2.EZpvd(strOLrzqt, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            jht2 = jht;
                            c25852jIt.EZpvd(jht2);
                        }
                        return Unit.INSTANCE;
                    }
                    c8220ayd = (C8220ayd) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                }
                List list2 = (List) obj;
                FuturesAnalysisViewModel futuresAnalysisViewModelFARcdN3 = this.this$0.fARcdN();
                this.L$0 = c8220ayd;
                this.L$1 = list2;
                this.label = 2;
                Object objAEQbTJ = futuresAnalysisViewModelFARcdN3.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                C8220ayd c8220ayd4 = c8220ayd;
                list = list2;
                obj = objAEQbTJ;
                c8220ayd2 = c8220ayd4;
                strOLrzqt = c8220ayd2.AEQbTJ().OLrzqt();
                if (!Intrinsics.EZpvd((Object) strOLrzqt, obj)) {
                }
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                jht = (jHT) next;
                if (jht != null) {
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25852jIt c25852jIt = this.this$0;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c25852jIt, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c25852jIt, state, anonymousClass1, this) == objCopydefault) {
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
