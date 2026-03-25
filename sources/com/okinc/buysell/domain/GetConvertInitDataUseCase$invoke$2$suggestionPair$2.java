package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.CurrencySuggestionPairsBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.lyU;
import o.lyZ;

/* JADX INFO: loaded from: classes18.dex */
public final class GetConvertInitDataUseCase$invoke$2$suggestionPair$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CurrencySuggestionPairsBean>, Object> {
    final /* synthetic */ String $toCcy;
    final /* synthetic */ String $valuationUnit;
    int label;
    final /* synthetic */ lyU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetConvertInitDataUseCase$invoke$2$suggestionPair$2(lyU lyu, String str, String str2, Continuation<? super GetConvertInitDataUseCase$invoke$2$suggestionPair$2> continuation) {
        super(2, continuation);
        this.this$0 = lyu;
        this.$toCcy = str;
        this.$valuationUnit = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetConvertInitDataUseCase$invoke$2$suggestionPair$2(this.this$0, this.$toCcy, this.$valuationUnit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CurrencySuggestionPairsBean> continuation) {
        return ((GetConvertInitDataUseCase$invoke$2$suggestionPair$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            lyZ lyz = this.this$0.AEQbTJ;
            String str = this.$toCcy;
            String str2 = this.$valuationUnit;
            this.label = 1;
            obj = lyZ.invoke$default(lyz, false, str, str2, this, 1, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
