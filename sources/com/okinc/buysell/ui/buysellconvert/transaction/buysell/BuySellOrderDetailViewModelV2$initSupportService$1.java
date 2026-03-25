package com.okinc.buysell.ui.buysellconvert.transaction.buysell;

import com.okinc.biz.model.SupportService;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.NoWhenBranchMatchedException;
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
import o.C3682AqZ;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C6811aWS;
import o.InterfaceC6804aWL;
import uniffi.buy_sell.BuySellTradeType;

/* JADX INFO: loaded from: classes23.dex */
public final class BuySellOrderDetailViewModelV2$initSupportService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C3682AqZ $order;
    int label;
    final /* synthetic */ BuySellOrderDetailViewModelV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuySellOrderDetailViewModelV2$initSupportService$1(C3682AqZ c3682AqZ, BuySellOrderDetailViewModelV2 buySellOrderDetailViewModelV2, Continuation<? super BuySellOrderDetailViewModelV2$initSupportService$1> continuation) {
        super(2, continuation);
        this.$order = c3682AqZ;
        this.this$0 = buySellOrderDetailViewModelV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuySellOrderDetailViewModelV2$initSupportService$1(this.$order, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuySellOrderDetailViewModelV2$initSupportService$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailViewModelV2$initSupportService$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super SupportService>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3682AqZ $order;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailViewModelV2$initSupportService$1$1$StateListAnimator */
        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[BuySellTradeType.values().length];
                try {
                    iArr[BuySellTradeType.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BuySellTradeType.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BuySellTradeType.CONVERT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C3682AqZ c3682AqZ, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$order = c3682AqZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$order, continuation);
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
            String str;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                flowCollector = (FlowCollector) this.L$0;
                C3682AqZ c3682AqZ = this.$order;
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                JsonElementBuildersKt.put(jsonObjectBuilder, "currency", c3682AqZ.gHZMYf());
                int i2 = StateListAnimator.OLrzqt[c3682AqZ.ORxRYg().ordinal()];
                if (i2 == 1) {
                    str = "buy";
                } else if (i2 == 2) {
                    str = "sell";
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "convert";
                }
                JsonElementBuildersKt.put(jsonObjectBuilder, "tradeType", str);
                JsonElementBuildersKt.put(jsonObjectBuilder, "depositPlatformCode", c3682AqZ.fetchVPNInfo());
                JsonElementBuildersKt.put(jsonObjectBuilder, "fromPage", "transaction_details_page");
                JsonElementBuildersKt.put(jsonObjectBuilder, "orderId", c3682AqZ.iwGUEr());
                JsonElementBuildersKt.put(jsonObjectBuilder, OtcExtraKeys.AMOUNT, c3682AqZ.wlaJM());
                JsonElementBuildersKt.put(jsonObjectBuilder, "errorCode", c3682AqZ.EZpvd());
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
            Flow flowFlowOn = FlowKt.flowOn(FlowKt.flow(new AnonymousClass1(this.$order, null)), Dispatchers.getIO());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$order, null);
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

    /* JADX INFO: renamed from: com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailViewModelV2$initSupportService$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<SupportService, Continuation<? super Unit>, Object> {
        final /* synthetic */ C3682AqZ $order;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BuySellOrderDetailViewModelV2 this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BuySellOrderDetailViewModelV2 buySellOrderDetailViewModelV2, C3682AqZ c3682AqZ, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = buySellOrderDetailViewModelV2;
            this.$order = c3682AqZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$order, continuation);
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
                this.this$0.KWHzl().setValue(new C32989mnw<>(new Pair((SupportService) this.L$0, this.$order)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
