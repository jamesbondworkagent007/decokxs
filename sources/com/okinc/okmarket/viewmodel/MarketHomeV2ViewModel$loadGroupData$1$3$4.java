package com.okinc.okmarket.viewmodel;

import com.okinc.okmarket.ui.market.data.UserGroupVo;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2ViewModel$loadGroupData$1$3$4 extends SuspendLambda implements Function2<MarketHomeV2ViewModel.TaskDescription, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketHomeV2ViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeV2ViewModel$loadGroupData$1$3$4(MarketHomeV2ViewModel marketHomeV2ViewModel, Continuation<? super MarketHomeV2ViewModel$loadGroupData$1$3$4> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeV2ViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeV2ViewModel$loadGroupData$1$3$4 marketHomeV2ViewModel$loadGroupData$1$3$4 = new MarketHomeV2ViewModel$loadGroupData$1$3$4(this.this$0, continuation);
        marketHomeV2ViewModel$loadGroupData$1$3$4.L$0 = obj;
        return marketHomeV2ViewModel$loadGroupData$1$3$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarketHomeV2ViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
        return ((MarketHomeV2ViewModel$loadGroupData$1$3$4) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MarketHomeV2ViewModel.TaskDescription taskDescription;
        MarketHomeV2ViewModel marketHomeV2ViewModel;
        List listAhwBna;
        MarketHomeV2ViewModel marketHomeV2ViewModel2;
        List<UserGroupVo> listEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            taskDescription = (MarketHomeV2ViewModel.TaskDescription) this.L$0;
            pUU.KWHzl("MarketHomeV2ViewModel", "loadGroupData groupQueryUseCase success, favGroup size = " + taskDescription.EZpvd().size());
            if (taskDescription.EZpvd().isEmpty() | (!taskDescription.copydefault())) {
                MarketHomeV2ViewModel marketHomeV2ViewModel3 = this.this$0;
                AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$loadGroupData$1$3$4.1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((MarketHomeV2ViewModel.ActionBar) obj2).KWHzl();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((MarketHomeV2ViewModel.ActionBar) obj2).KWHzl((InterfaceC49371unL) obj3);
                    }
                };
                InterfaceC49371unL.TaskDescription taskDescription2 = new InterfaceC49371unL.TaskDescription(null, 1, null);
                this.label = 1;
                if (marketHomeV2ViewModel3.KWHzl(anonymousClass1, taskDescription2, this) == objCopydefault) {
                    return objCopydefault;
                }
                marketHomeV2ViewModel = this.this$0;
                listAhwBna = yDY.AhwBna();
                this.label = 2;
                if (marketHomeV2ViewModel.KWHzl((List<UserGroupVo>) listAhwBna, (Continuation<? super Unit>) this) == objCopydefault) {
                }
            } else {
                MarketHomeV2ViewModel marketHomeV2ViewModel4 = this.this$0;
                AnonymousClass2 anonymousClass2 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel$loadGroupData$1$3$4.2
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((MarketHomeV2ViewModel.ActionBar) obj2).KWHzl();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((MarketHomeV2ViewModel.ActionBar) obj2).KWHzl((InterfaceC49371unL) obj3);
                    }
                };
                InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(taskDescription);
                this.L$0 = taskDescription;
                this.label = 3;
                if (marketHomeV2ViewModel4.KWHzl(anonymousClass2, activity, this) == objCopydefault) {
                    return objCopydefault;
                }
                marketHomeV2ViewModel2 = this.this$0;
                listEZpvd = taskDescription.EZpvd();
                this.L$0 = null;
                this.label = 4;
                if (marketHomeV2ViewModel2.KWHzl((List<UserGroupVo>) listEZpvd, (Continuation<? super Unit>) this) == objCopydefault) {
                }
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    taskDescription = (MarketHomeV2ViewModel.TaskDescription) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    marketHomeV2ViewModel2 = this.this$0;
                    listEZpvd = taskDescription.EZpvd();
                    this.L$0 = null;
                    this.label = 4;
                    if (marketHomeV2ViewModel2.KWHzl((List<UserGroupVo>) listEZpvd, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            marketHomeV2ViewModel = this.this$0;
            listAhwBna = yDY.AhwBna();
            this.label = 2;
            if (marketHomeV2ViewModel.KWHzl((List<UserGroupVo>) listAhwBna, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
