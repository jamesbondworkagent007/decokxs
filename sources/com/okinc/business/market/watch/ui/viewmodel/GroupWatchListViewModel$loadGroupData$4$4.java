package com.okinc.business.market.watch.ui.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C27996kLa;
import o.C27997kLb;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListViewModel$loadGroupData$4$4 extends SuspendLambda implements Function2<C27997kLb, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupWatchListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListViewModel$loadGroupData$4$4(GroupWatchListViewModel groupWatchListViewModel, Continuation<? super GroupWatchListViewModel$loadGroupData$4$4> continuation) {
        super(2, continuation);
        this.this$0 = groupWatchListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupWatchListViewModel$loadGroupData$4$4 groupWatchListViewModel$loadGroupData$4$4 = new GroupWatchListViewModel$loadGroupData$4$4(this.this$0, continuation);
        groupWatchListViewModel$loadGroupData$4$4.L$0 = obj;
        return groupWatchListViewModel$loadGroupData$4$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C27997kLb c27997kLb, Continuation<? super Unit> continuation) {
        return ((GroupWatchListViewModel$loadGroupData$4$4) create(c27997kLb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C27997kLb c27997kLb = (C27997kLb) this.L$0;
            pUU.KWHzl("GroupWatchListViewModel", "groupQueryUseCase  success");
            if (c27997kLb.KWHzl().isEmpty() | (!c27997kLb.AEQbTJ())) {
                GroupWatchListViewModel groupWatchListViewModel = this.this$0;
                AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.watch.ui.viewmodel.GroupWatchListViewModel$loadGroupData$4$4.1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((C27996kLa) obj2).KWHzl();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((C27996kLa) obj2).OLrzqt((InterfaceC49371unL<C27997kLb>) obj3);
                    }
                };
                InterfaceC49371unL.TaskDescription taskDescription = new InterfaceC49371unL.TaskDescription(null, 1, null);
                this.label = 1;
                if (groupWatchListViewModel.KWHzl(anonymousClass1, taskDescription, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                GroupWatchListViewModel groupWatchListViewModel2 = this.this$0;
                AnonymousClass2 anonymousClass2 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.watch.ui.viewmodel.GroupWatchListViewModel$loadGroupData$4$4.2
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((C27996kLa) obj2).KWHzl();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((C27996kLa) obj2).OLrzqt((InterfaceC49371unL<C27997kLb>) obj3);
                    }
                };
                InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(c27997kLb);
                this.label = 2;
                if (groupWatchListViewModel2.KWHzl(anonymousClass2, activity, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
