package com.okinc.business.invest_biz.ui.screens.univ3;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27024jnQ;
import o.C27492jwH;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeActivity$getReceiveInfoAndCheckState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $coinAmount;
    final /* synthetic */ InvestUniv3SubscribeActivity.AmountInputIndex $tokenIndex;
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$getReceiveInfoAndCheckState$1(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, String str, InvestUniv3SubscribeActivity.AmountInputIndex amountInputIndex, Continuation<? super InvestUniv3SubscribeActivity$getReceiveInfoAndCheckState$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeActivity;
        this.$coinAmount = str;
        this.$tokenIndex = amountInputIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$getReceiveInfoAndCheckState$1(this.this$0, this.$coinAmount, this.$tokenIndex, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$getReceiveInfoAndCheckState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String ratePercent$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InvestUniv3SubscribeViewModel investUniv3SubscribeViewModelIsConnected = this.this$0.isConnected();
            String str = this.$coinAmount;
            InvestUniv3SubscribeActivity.AmountInputIndex amountInputIndex = this.$tokenIndex;
            this.label = 1;
            obj = InvestUniv3SubscribeViewModel.getReceiveInfoAndCheckState$default(investUniv3SubscribeViewModelIsConnected, str, amountInputIndex, false, this, 4, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = (InvestUniv3SubscribeReceiveInfo) obj;
        String str2 = "--";
        if (investUniv3SubscribeReceiveInfo == null) {
            this.this$0.isConnected().QKVWgx().setValue(new C27024jnQ(null, null, 3, null));
            this.this$0.isConnected().gHZMYf().setValue("--");
        } else {
            this.this$0.isConnected().QKVWgx().setValue(new C27024jnQ(investUniv3SubscribeReceiveInfo, YieldState.FILLED));
            MutableLiveData<String> mutableLiveDataGHZMYf = this.this$0.isConnected().gHZMYf();
            String apr = investUniv3SubscribeReceiveInfo.getApr();
            if (apr != null && (ratePercent$default = C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, apr, false, 2, null)) != null) {
                str2 = ratePercent$default;
            }
            mutableLiveDataGHZMYf.setValue(str2);
        }
        return Unit.INSTANCE;
    }
}
