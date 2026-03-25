package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.data.OrderBookInfo;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28179kRv;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28226kTo;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketInfoVM$subscribeOrderBook$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OrderBookInfo $orderInfo;
    Object L$0;
    int label;
    final /* synthetic */ AdvancedMarketInfoVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketInfoVM$subscribeOrderBook$1(AdvancedMarketInfoVM advancedMarketInfoVM, OrderBookInfo orderBookInfo, Continuation<? super AdvancedMarketInfoVM$subscribeOrderBook$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedMarketInfoVM;
        this.$orderInfo = orderBookInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMarketInfoVM$subscribeOrderBook$1(this.this$0, this.$orderInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedMarketInfoVM$subscribeOrderBook$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        AbstractC43419rot abstractC43419rot2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28179kRv c28179kRv = this.this$0.AuCTel;
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.this$0.copydefault();
            OrderBookInfo orderBookInfo = this.$orderInfo;
            this.label = 1;
            obj = c28179kRv.KWHzl(dexMultiTokenInfoBeanCopydefault, orderBookInfo, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC43419rot2 = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                abstractC43419rot = abstractC43419rot2;
                AdvancedMarketInfoVM advancedMarketInfoVM = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    advancedMarketInfoVM.OLrzqt.setValue(InterfaceC28226kTo.TaskDescription.OLrzqt);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        AdvancedMarketInfoVM advancedMarketInfoVM2 = this.this$0;
        OrderBookInfo orderBookInfo2 = this.$orderInfo;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            advancedMarketInfoVM2.OLrzqt.setValue(new InterfaceC28226kTo.ActionBar((List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()));
            C28179kRv c28179kRv2 = advancedMarketInfoVM2.AuCTel;
            this.L$0 = abstractC43419rot;
            this.label = 2;
            if (c28179kRv2.OLrzqt(orderBookInfo2, this) == objCopydefault) {
                return objCopydefault;
            }
            abstractC43419rot2 = abstractC43419rot;
            abstractC43419rot = abstractC43419rot2;
        }
        AdvancedMarketInfoVM advancedMarketInfoVM3 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
