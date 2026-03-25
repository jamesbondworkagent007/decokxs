package com.okinc.business.market.watch.ui.viewmodel;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.FlowCollector;
import o.C27996kLa;
import o.C27997kLb;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListViewModel$loadGroupData$4$2 extends SuspendLambda implements yHO<FlowCollector<? super C27997kLb>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ Unit $it;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupWatchListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListViewModel$loadGroupData$4$2(Unit unit, GroupWatchListViewModel groupWatchListViewModel, Continuation<? super GroupWatchListViewModel$loadGroupData$4$2> continuation) {
        super(3, continuation);
        this.$it = unit;
        this.this$0 = groupWatchListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super C27997kLb> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        GroupWatchListViewModel$loadGroupData$4$2 groupWatchListViewModel$loadGroupData$4$2 = new GroupWatchListViewModel$loadGroupData$4$2(this.$it, this.this$0, continuation);
        groupWatchListViewModel$loadGroupData$4$2.L$0 = th;
        return groupWatchListViewModel$loadGroupData$4$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Throwable th = (Throwable) this.L$0;
            if (th instanceof CancellationException) {
                pUU.KWHzl("GroupWatchListViewModel", "watchBizRep flow error has cached " + this.$it);
                return Unit.INSTANCE;
            }
            pUU.KWHzl("GroupWatchListViewModel", "watchBizRep flow error " + this.$it);
            GroupWatchListViewModel groupWatchListViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.watch.ui.viewmodel.GroupWatchListViewModel$loadGroupData$4$2.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C27996kLa) obj2).KWHzl();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C27996kLa) obj2).OLrzqt((InterfaceC49371unL<C27997kLb>) obj3);
                }
            };
            InterfaceC49371unL.Application application = new InterfaceC49371unL.Application(th, null, 2, null);
            this.label = 1;
            if (groupWatchListViewModel.KWHzl(anonymousClass1, application, this) == objCopydefault) {
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
