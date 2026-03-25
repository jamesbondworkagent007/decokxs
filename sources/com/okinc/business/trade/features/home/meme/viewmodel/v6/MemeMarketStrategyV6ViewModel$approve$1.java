package com.okinc.business.trade.features.home.meme.viewmodel.v6;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6ApproveExecutionUseCase;
import com.okinc.business.trade.features.home.meme.viewmodel.v6.MemeMarketStrategyV6ViewModel$approve$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC28352kYf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeMarketStrategyV6ViewModel$approve$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MemeV6ApproveExecutionUseCase.ApproveExecutionParams $params;
    int label;
    final /* synthetic */ AbstractC28352kYf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeMarketStrategyV6ViewModel$approve$1(AbstractC28352kYf abstractC28352kYf, MemeV6ApproveExecutionUseCase.ApproveExecutionParams approveExecutionParams, Continuation<? super MemeMarketStrategyV6ViewModel$approve$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC28352kYf;
        this.$params = approveExecutionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeMarketStrategyV6ViewModel$approve$1(this.this$0, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeMarketStrategyV6ViewModel$approve$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MemeV6ApproveExecutionUseCase memeV6ApproveExecutionUseCaseDvKsVJ = this.this$0.dvKsVJ();
            CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this.this$0);
            MemeV6ApproveExecutionUseCase.ApproveExecutionParams approveExecutionParams = this.$params;
            Function1<? super Bundle, Unit> function1 = new Function1() { // from class: o.kYp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MemeMarketStrategyV6ViewModel$approve$1.invokeSuspend$lambda$0((android.os.Bundle) obj2);
                }
            };
            final AbstractC28352kYf abstractC28352kYf = this.this$0;
            Function1<? super Boolean, Unit> function12 = new Function1() { // from class: o.kYr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MemeMarketStrategyV6ViewModel$approve$1.invokeSuspend$lambda$1(abstractC28352kYf, ((java.lang.Boolean) obj2).booleanValue());
                }
            };
            this.label = 1;
            if (memeV6ApproveExecutionUseCaseDvKsVJ.EZpvd(viewModelScope, approveExecutionParams, function1, function12, this) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Bundle bundle) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(AbstractC28352kYf abstractC28352kYf, boolean z) {
        abstractC28352kYf.djSkpj.setValue(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }
}
