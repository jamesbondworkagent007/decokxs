package com.okinc.business.invest_biz.ui.screens.home;

import com.okinc.business.invest_biz.data.bean.HomeTokensItemData;
import com.okinc.business.invest_biz.data.bean.HomeTokensResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26474jcx;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHomeV2ViewModel$mBalanceListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeTokensResponse $currentTokens;
    final /* synthetic */ List<HomeTokensItemData> $updatedTokens;
    int label;
    final /* synthetic */ InvestHomeV2ViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestHomeV2ViewModel$mBalanceListener$1$1(InvestHomeV2ViewModel investHomeV2ViewModel, HomeTokensResponse homeTokensResponse, List<HomeTokensItemData> list, Continuation<? super InvestHomeV2ViewModel$mBalanceListener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = investHomeV2ViewModel;
        this.$currentTokens = homeTokensResponse;
        this.$updatedTokens = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestHomeV2ViewModel$mBalanceListener$1$1(this.this$0, this.$currentTokens, this.$updatedTokens, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestHomeV2ViewModel$mBalanceListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.AYXKKw;
            InterfaceC26474jcx.StateListAnimator stateListAnimator = new InterfaceC26474jcx.StateListAnimator(HomeTokensResponse.copy$default(this.$currentTokens, 0, this.$updatedTokens, 1, null));
            this.label = 1;
            if (mutableStateFlow.emit(stateListAnimator, this) == objCopydefault) {
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
}
