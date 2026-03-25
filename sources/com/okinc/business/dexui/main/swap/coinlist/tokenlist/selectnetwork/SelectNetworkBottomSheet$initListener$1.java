package com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C22593hiL;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC22600hiS;
import o.hTL;
import o.yET;

/* JADX INFO: loaded from: classes6.dex */
public final class SelectNetworkBottomSheet$initListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ hTL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectNetworkBottomSheet$initListener$1(hTL htl, Continuation<? super SelectNetworkBottomSheet$initListener$1> continuation) {
        super(2, continuation);
        this.this$0 = htl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectNetworkBottomSheet$initListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectNetworkBottomSheet$initListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<InterfaceC22600hiS> stateFlowEZpvd = this.this$0.AYXKKw().EZpvd();
            final hTL htl = this.this$0;
            FlowCollector<? super InterfaceC22600hiS> flowCollector = new FlowCollector() { // from class: com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.SelectNetworkBottomSheet$initListener$1.2

                /* JADX INFO: renamed from: com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.SelectNetworkBottomSheet$initListener$1$2$Activity */
                public static final class Activity<T> implements Comparator {
                    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
                    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return yET.KWHzl(Long.valueOf(C33129mqd.valueOf(((C22593hiL) t2).KWHzl().getPopularWeight())), Long.valueOf(C33129mqd.valueOf(((C22593hiL) t).KWHzl().getPopularWeight())));
                    }
                }

                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(InterfaceC22600hiS interfaceC22600hiS, Continuation<? super Unit> continuation) {
                    if (interfaceC22600hiS instanceof InterfaceC22600hiS.StateListAnimator) {
                        InterfaceC22600hiS.StateListAnimator stateListAnimator = (InterfaceC22600hiS.StateListAnimator) interfaceC22600hiS;
                        List<C22593hiL> listKWHzl = stateListAnimator.KWHzl();
                        ArrayList arrayList = new ArrayList();
                        for (T t : listKWHzl) {
                            if (((C22593hiL) t).KWHzl().getPopularChain()) {
                                arrayList.add(t);
                            }
                        }
                        htl.OLrzqt((List<C22593hiL>) stateListAnimator.KWHzl(), (List<C22593hiL>) CollectionsKt___CollectionsKt.fJNWhG((Collection) CollectionsKt___CollectionsKt.EZpvd(arrayList, new Activity())));
                    } else if (!Intrinsics.EZpvd(interfaceC22600hiS, InterfaceC22600hiS.ActionBar.copydefault)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
