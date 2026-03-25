package com.okinc.buysell.ui.pro.transaction.list.viewmodel;

import com.okinc.buysell.ui.pro.transaction.list.viewmodel.BuySellOrderListPageActivityViewModel;
import com.okinc.crcore.shared.net.responsebean.bsc.UserInfoBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31764mDa;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellOrderListPageActivityViewModel$fetchUserInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BuySellOrderListPageActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuySellOrderListPageActivityViewModel$fetchUserInfo$1(BuySellOrderListPageActivityViewModel buySellOrderListPageActivityViewModel, Continuation<? super BuySellOrderListPageActivityViewModel$fetchUserInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = buySellOrderListPageActivityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuySellOrderListPageActivityViewModel$fetchUserInfo$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuySellOrderListPageActivityViewModel$fetchUserInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC31764mDa interfaceC31764mDa = this.this$0.EZpvd;
            this.label = 1;
            obj = interfaceC31764mDa.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        BuySellOrderListPageActivityViewModel buySellOrderListPageActivityViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            buySellOrderListPageActivityViewModel.AEQbTJ.setValue(new C32989mnw(new BuySellOrderListPageActivityViewModel.Application.C0386Application((UserInfoBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl())));
        }
        BuySellOrderListPageActivityViewModel buySellOrderListPageActivityViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            buySellOrderListPageActivityViewModel2.AEQbTJ.setValue(new C32989mnw(new BuySellOrderListPageActivityViewModel.Application.Activity(((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getMessage())));
        }
        return Unit.INSTANCE;
    }
}
