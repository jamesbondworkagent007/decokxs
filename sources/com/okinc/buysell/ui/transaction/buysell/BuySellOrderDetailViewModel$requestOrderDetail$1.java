package com.okinc.buysell.ui.transaction.buysell;

import com.okinc.buysell.api.BuySellTradeType;
import com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailViewModel;
import com.okinc.crcore.shared.net.responsebean.bsc.OrderDetailBean;
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
public final class BuySellOrderDetailViewModel$requestOrderDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $orderId;
    final /* synthetic */ BuySellTradeType $tradeType;
    int label;
    final /* synthetic */ BuySellOrderDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuySellOrderDetailViewModel$requestOrderDetail$1(BuySellOrderDetailViewModel buySellOrderDetailViewModel, String str, BuySellTradeType buySellTradeType, Continuation<? super BuySellOrderDetailViewModel$requestOrderDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = buySellOrderDetailViewModel;
        this.$orderId = str;
        this.$tradeType = buySellTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuySellOrderDetailViewModel$requestOrderDetail$1(this.this$0, this.$orderId, this.$tradeType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuySellOrderDetailViewModel$requestOrderDetail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String type;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC31764mDa interfaceC31764mDa = this.this$0.OLrzqt;
            String str = this.$orderId;
            BuySellTradeType buySellTradeType = this.$tradeType;
            if (buySellTradeType == null || (type = buySellTradeType.getType()) == null) {
                type = BuySellTradeType.BUY.getType();
            }
            this.label = 1;
            obj = interfaceC31764mDa.OLrzqt(str, type, this);
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
        BuySellOrderDetailViewModel buySellOrderDetailViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            buySellOrderDetailViewModel.KWHzl().setValue(new C32989mnw<>(new BuySellOrderDetailViewModel.TaskDescription.StateListAnimator((OrderDetailBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl())));
        }
        BuySellOrderDetailViewModel buySellOrderDetailViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            buySellOrderDetailViewModel2.KWHzl().setValue(new C32989mnw<>(new BuySellOrderDetailViewModel.TaskDescription.ActionBar(((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getMessage())));
        }
        return Unit.INSTANCE;
    }
}
