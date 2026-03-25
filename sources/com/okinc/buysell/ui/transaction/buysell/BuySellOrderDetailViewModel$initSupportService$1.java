package com.okinc.buysell.ui.transaction.buysell;

import com.okinc.biz.model.SupportService;
import com.okinc.buysell.api.BuySellTradeType;
import com.okinc.crcore.shared.net.responsebean.bsc.OrderDetailBean;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.C32989mnw;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C6811aWS;
import o.InterfaceC6804aWL;

/* JADX INFO: loaded from: classes23.dex */
public final class BuySellOrderDetailViewModel$initSupportService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OrderDetailBean $detailBean;
    final /* synthetic */ BuySellTradeType $tradeType;
    int label;
    final /* synthetic */ BuySellOrderDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuySellOrderDetailViewModel$initSupportService$1(OrderDetailBean orderDetailBean, BuySellTradeType buySellTradeType, BuySellOrderDetailViewModel buySellOrderDetailViewModel, Continuation<? super BuySellOrderDetailViewModel$initSupportService$1> continuation) {
        super(2, continuation);
        this.$detailBean = orderDetailBean;
        this.$tradeType = buySellTradeType;
        this.this$0 = buySellOrderDetailViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuySellOrderDetailViewModel$initSupportService$1(this.$detailBean, this.$tradeType, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuySellOrderDetailViewModel$initSupportService$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailViewModel$initSupportService$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super SupportService>, Continuation<? super Unit>, Object> {
        final /* synthetic */ OrderDetailBean $detailBean;
        final /* synthetic */ BuySellTradeType $tradeType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OrderDetailBean orderDetailBean, BuySellTradeType buySellTradeType, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$detailBean = orderDetailBean;
            this.$tradeType = buySellTradeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$detailBean, this.$tradeType, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super SupportService> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            FlowCollector flowCollector;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                flowCollector = (FlowCollector) this.L$0;
                OrderDetailBean orderDetailBean = this.$detailBean;
                BuySellTradeType buySellTradeType = this.$tradeType;
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                JsonElementBuildersKt.put(jsonObjectBuilder, "currency", orderDetailBean.getQuoteCurrencySymbol());
                JsonElementBuildersKt.put(jsonObjectBuilder, "tradeType", buySellTradeType != null ? buySellTradeType.getType() : null);
                JsonElementBuildersKt.put(jsonObjectBuilder, "depositPlatformCode", orderDetailBean.getDepositPlatformCode());
                JsonElementBuildersKt.put(jsonObjectBuilder, "fromPage", "transaction_details_page");
                JsonElementBuildersKt.put(jsonObjectBuilder, "orderId", orderDetailBean.getOrderNo());
                JsonElementBuildersKt.put(jsonObjectBuilder, OtcExtraKeys.AMOUNT, orderDetailBean.getQuoteAmount());
                JsonElementBuildersKt.put(jsonObjectBuilder, "errorCode", orderDetailBean.getBusinessErrorCode());
                C6811aWS c6811aWS = new C6811aWS("fiat_payment_transaction_details_support", null, null, jsonObjectBuilder.build(), 6, null);
                InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class);
                this.L$0 = flowCollector;
                this.label = 1;
                obj = interfaceC6804aWL.AEQbTJ(c6811aWS, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                flowCollector = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            this.L$0 = null;
            this.label = 2;
            if (flowCollector.emit(obj, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowFlowOn = FlowKt.flowOn(FlowKt.flow(new AnonymousClass1(this.$detailBean, this.$tradeType, null)), Dispatchers.getIO());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$detailBean, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFlowOn, anonymousClass2, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailViewModel$initSupportService$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<SupportService, Continuation<? super Unit>, Object> {
        final /* synthetic */ OrderDetailBean $detailBean;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BuySellOrderDetailViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BuySellOrderDetailViewModel buySellOrderDetailViewModel, OrderDetailBean orderDetailBean, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = buySellOrderDetailViewModel;
            this.$detailBean = orderDetailBean;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$detailBean, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SupportService supportService, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(supportService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt().setValue(new C32989mnw<>(new Pair((SupportService) this.L$0, this.$detailBean)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
