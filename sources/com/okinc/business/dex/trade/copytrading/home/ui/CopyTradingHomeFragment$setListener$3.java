package com.okinc.business.dex.trade.copytrading.home.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C19949gVh;
import o.C19983gWo;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.gWR;
import o.gWU;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingHomeFragment$setListener$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19949gVh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingHomeFragment$setListener$3(C19949gVh c19949gVh, Continuation<? super CopyTradingHomeFragment$setListener$3> continuation) {
        super(2, continuation);
        this.this$0 = c19949gVh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingHomeFragment$setListener$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingHomeFragment$setListener$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$setListener$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<gWU, gWR, Continuation<? super Pair<? extends gWU, ? extends gWR>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(gWU gwu, gWR gwr, Continuation<? super Pair<? extends gWU, ? extends gWR>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = gwu;
            anonymousClass1.L$1 = gwr;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return C56390yDp.OLrzqt((gWU) this.L$0, (gWR) this.L$1);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowCombine = FlowKt.combine(this.this$0.EZpvd().KWHzl(), this.this$0.gEmmrt().OLrzqt(), new AnonymousClass1(null));
            final C19949gVh c19949gVh = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$setListener$3.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(Pair<? extends gWU, ? extends gWR> pair, Continuation<? super Unit> continuation) {
                    T next;
                    gWU gwuComponent1 = pair.component1();
                    gWR gwrComponent2 = pair.component2();
                    c19949gVh.valueOf().EZpvd((gwuComponent1 instanceof gWU.TaskDescription) || ((gwrComponent2 instanceof gWR.Activity) && ((gWR.Activity) gwrComponent2).OLrzqt()));
                    if (gwrComponent2 instanceof gWR.TaskDescription) {
                        List<C19983gWo> listOLrzqt = ((gWR.TaskDescription) gwrComponent2).OLrzqt();
                        ArrayList arrayList = new ArrayList();
                        for (T t : listOLrzqt) {
                            if (!((C19983gWo) t).fetchVPNInfo()) {
                                arrayList.add(t);
                            }
                        }
                        Iterator<T> it = arrayList.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                long jCopydefault = ((C19983gWo) next).copydefault();
                                do {
                                    T next2 = it.next();
                                    long jCopydefault2 = ((C19983gWo) next2).copydefault();
                                    if (jCopydefault < jCopydefault2) {
                                        next = next2;
                                        jCopydefault = jCopydefault2;
                                    }
                                } while (it.hasNext());
                            }
                        } else {
                            next = (T) null;
                        }
                        C19983gWo c19983gWo = next;
                        c19949gVh.valueOf().AEQbTJ(c19983gWo != null ? C56443yFo.KWHzl(c19983gWo.copydefault()) : null);
                    } else if (gwrComponent2 instanceof gWR.ActionBar) {
                        c19949gVh.valueOf().AEQbTJ((Long) null);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowCombine.collect(flowCollector, this) == objCopydefault) {
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
