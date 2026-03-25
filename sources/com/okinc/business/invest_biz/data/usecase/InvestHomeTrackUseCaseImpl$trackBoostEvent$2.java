package com.okinc.business.invest_biz.data.usecase;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.invest_biz.data.usecase.InvestHomeTrackUseCaseImpl$trackBoostEvent$2;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23703iGe;
import o.C27570jxg;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHomeTrackUseCaseImpl$trackBoostEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ String $tokenName;
    int label;
    final /* synthetic */ C23703iGe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestHomeTrackUseCaseImpl$trackBoostEvent$2(C23703iGe c23703iGe, String str, int i, Continuation<? super InvestHomeTrackUseCaseImpl$trackBoostEvent$2> continuation) {
        super(2, continuation);
        this.this$0 = c23703iGe;
        this.$tokenName = str;
        this.$index = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestHomeTrackUseCaseImpl$trackBoostEvent$2(this.this$0, this.$tokenName, this.$index, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestHomeTrackUseCaseImpl$trackBoostEvent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.OLrzqt().add(this.$tokenName)) {
                final String str = this.$tokenName;
                final int i = this.$index;
                C27570jxg.investEvent$default("YieldHome_Card_HoldingRecommend_View", null, new Function1() { // from class: o.iGi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return InvestHomeTrackUseCaseImpl$trackBoostEvent$2.invokeSuspend$lambda$0(str, i, (EventParamsList) obj2);
                    }
                }, 1, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(String str, int i, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "version", OtpEventTracker.OTP_EVENT_VALUE_NEW, false, 4, null);
        EventParamsList.put$default(eventParamsList, "source", "newhomepagelist", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "index", String.valueOf(i), false, 4, null);
        return Unit.INSTANCE;
    }
}
