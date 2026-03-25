package com.okinc.tradingbot.impl.futures_grid;

import com.okinc.tradingbot.impl.futures_grid.dto.MarginBalanceType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C51045vfc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class FuturesGridWithdrawViewModel$debounceFetchMarginBalance$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $algoId;
    final /* synthetic */ String $amount;
    final /* synthetic */ MarginBalanceType $type;
    int label;
    final /* synthetic */ C51045vfc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesGridWithdrawViewModel$debounceFetchMarginBalance$1(String str, C51045vfc c51045vfc, String str2, MarginBalanceType marginBalanceType, Continuation<? super FuturesGridWithdrawViewModel$debounceFetchMarginBalance$1> continuation) {
        super(2, continuation);
        this.$amount = str;
        this.this$0 = c51045vfc;
        this.$algoId = str2;
        this.$type = marginBalanceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesGridWithdrawViewModel$debounceFetchMarginBalance$1(this.$amount, this.this$0, this.$algoId, this.$type, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesGridWithdrawViewModel$debounceFetchMarginBalance$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(300L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        String str = this.$amount;
        if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            str = "0";
        }
        this.this$0.copydefault(this.$algoId, this.$type, str);
        return Unit.INSTANCE;
    }
}
