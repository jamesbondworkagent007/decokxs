package com.okinc.business.market.features.data.ui.liquidity;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C26088jRm;
import o.C56391yDq;
import o.C56442yFn;
import o.jQN;

/* JADX INFO: loaded from: classes6.dex */
public final class DataLiquidityPoolViewModel$getLiquidityList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenAddress;
    int label;
    final /* synthetic */ DataLiquidityPoolViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataLiquidityPoolViewModel$getLiquidityList$1(DataLiquidityPoolViewModel dataLiquidityPoolViewModel, String str, String str2, Continuation<? super DataLiquidityPoolViewModel$getLiquidityList$1> continuation) {
        super(2, continuation);
        this.this$0 = dataLiquidityPoolViewModel;
        this.$chainId = str;
        this.$tokenAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataLiquidityPoolViewModel$getLiquidityList$1(this.this$0, this.$chainId, this.$tokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DataLiquidityPoolViewModel$getLiquidityList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jQN jqn = this.this$0.EZpvd;
            String str = this.$chainId;
            String str2 = this.$tokenAddress;
            this.label = 1;
            objCopydefault = jqn.copydefault(str, str2, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        DataLiquidityPoolViewModel dataLiquidityPoolViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            dataLiquidityPoolViewModel.OLrzqt.setValue(new C26088jRm(false, false, (List) objCopydefault, 3, null));
        }
        DataLiquidityPoolViewModel dataLiquidityPoolViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
            dataLiquidityPoolViewModel2.OLrzqt.setValue(new C26088jRm(false, true, null, 5, null));
        }
        return Unit.INSTANCE;
    }
}
