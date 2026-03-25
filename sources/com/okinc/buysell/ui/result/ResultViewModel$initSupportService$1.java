package com.okinc.buysell.ui.result;

import com.okinc.biz.model.SupportService;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.data.ResultType;
import com.okinc.okx.paymentapi.service.SmartBotParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31670lzr;
import o.lSO;
import o.mHA;

/* JADX INFO: loaded from: classes23.dex */
public final class ResultViewModel$initSupportService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ResultType.ResultErrorParams $params;
    int label;
    final /* synthetic */ lSO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultViewModel$initSupportService$1(ResultType.ResultErrorParams resultErrorParams, lSO lso, Continuation<? super ResultViewModel$initSupportService$1> continuation) {
        super(2, continuation);
        this.$params = resultErrorParams;
        this.this$0 = lso;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResultViewModel$initSupportService$1(this.$params, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResultViewModel$initSupportService$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TradeType tradeTypeAYXKKw;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ResultType.ResultErrorParams resultErrorParams = this.$params;
            if (resultErrorParams == null || (tradeTypeAYXKKw = resultErrorParams.AYXKKw()) == null) {
                tradeTypeAYXKKw = TradeType.BUY;
            }
            TradeType tradeType = tradeTypeAYXKKw;
            ResultType.ResultErrorParams resultErrorParams2 = this.$params;
            String strOLrzqt = resultErrorParams2 != null ? resultErrorParams2.OLrzqt() : null;
            String str = strOLrzqt == null ? "" : strOLrzqt;
            ResultType.ResultErrorParams resultErrorParams3 = this.$params;
            String strEZpvd = resultErrorParams3 != null ? resultErrorParams3.EZpvd() : null;
            String str2 = strEZpvd == null ? "" : strEZpvd;
            ResultType.ResultErrorParams resultErrorParams4 = this.$params;
            String strAhwBna = resultErrorParams4 != null ? resultErrorParams4.AhwBna() : null;
            String str3 = strAhwBna == null ? "" : strAhwBna;
            ResultType.ResultErrorParams resultErrorParams5 = this.$params;
            String strAEQbTJ = resultErrorParams5 != null ? resultErrorParams5.AEQbTJ() : null;
            String str4 = strAEQbTJ == null ? "" : strAEQbTJ;
            ResultType.ResultErrorParams resultErrorParams6 = this.$params;
            String strKWHzl = resultErrorParams6 != null ? resultErrorParams6.KWHzl() : null;
            String str5 = strKWHzl == null ? "" : strKWHzl;
            ResultType.ResultErrorParams resultErrorParams7 = this.$params;
            String strCopydefault = resultErrorParams7 != null ? resultErrorParams7.copydefault() : null;
            Flow<SupportService> flowAEQbTJ = ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AEQbTJ("fiat_payment_transaction_error_support", new SmartBotParams("error_result_page", str4, str5, tradeType, str, str2, str3, strCopydefault == null ? "" : strCopydefault, null, 256, null));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.buysell.ui.result.ResultViewModel$initSupportService$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<SupportService, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ lSO this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(lSO lso, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = lso;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SupportService supportService, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(supportService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                mHA.OLrzqt.OLrzqt(this.this$0.AhwBna, (SupportService) this.L$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
