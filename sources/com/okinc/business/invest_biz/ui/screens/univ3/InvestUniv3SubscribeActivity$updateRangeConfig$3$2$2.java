package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.data.bean.InvestUniv3RangeInfoType;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C27315jsq;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeActivity$updateRangeConfig$3$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InvestUniv3RangeInfoType $range;
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$updateRangeConfig$3$2$2(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, InvestUniv3RangeInfoType investUniv3RangeInfoType, Continuation<? super InvestUniv3SubscribeActivity$updateRangeConfig$3$2$2> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeActivity;
        this.$range = investUniv3RangeInfoType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$updateRangeConfig$3$2$2(this.this$0, this.$range, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$updateRangeConfig$3$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(this.this$0.isConnected().ejfBZ().getValue());
            BigDecimal bigDecimalSubtract = new BigDecimal(1).subtract(C33129mqd.EZpvd(this.$range.getOffset()));
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "");
            BigDecimal bigDecimalMultiply = bigDecimalEZpvd.multiply(bigDecimalSubtract);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
            MutableSharedFlow<C27315jsq> mutableSharedFlowSSMYrx = this.this$0.isConnected().sSMYrx();
            C27315jsq c27315jsqAEQbTJ = this.this$0.isConnected().AEQbTJ(bigDecimalMultiply);
            this.label = 1;
            if (mutableSharedFlowSSMYrx.emit(c27315jsqAEQbTJ, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.zsXlph();
                this.this$0.AuCTel();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(this.this$0.isConnected().ejfBZ().getValue());
        BigDecimal bigDecimalAdd = new BigDecimal(1).add(C33129mqd.EZpvd(this.$range.getOffset()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "");
        BigDecimal bigDecimalMultiply2 = bigDecimalEZpvd2.multiply(bigDecimalAdd);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "");
        MutableSharedFlow<C27315jsq> mutableSharedFlowIRxXKY = this.this$0.isConnected().iRxXKY();
        C27315jsq c27315jsqAEQbTJ2 = this.this$0.isConnected().AEQbTJ(bigDecimalMultiply2);
        this.label = 2;
        if (mutableSharedFlowIRxXKY.emit(c27315jsqAEQbTJ2, this) == objCopydefault) {
            return objCopydefault;
        }
        this.this$0.zsXlph();
        this.this$0.AuCTel();
        return Unit.INSTANCE;
    }
}
