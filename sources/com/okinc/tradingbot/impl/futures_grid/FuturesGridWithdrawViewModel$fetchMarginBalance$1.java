package com.okinc.tradingbot.impl.futures_grid;

import com.okinc.tradingbot.impl.futures_grid.dto.MarginBalanceType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C51045vfc;
import o.C51052vfj;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.uLU;

/* JADX INFO: loaded from: classes11.dex */
public final class FuturesGridWithdrawViewModel$fetchMarginBalance$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $algoId;
    final /* synthetic */ String $amount;
    final /* synthetic */ MarginBalanceType $type;
    int label;
    final /* synthetic */ C51045vfc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesGridWithdrawViewModel$fetchMarginBalance$1(C51045vfc c51045vfc, String str, String str2, MarginBalanceType marginBalanceType, Continuation<? super FuturesGridWithdrawViewModel$fetchMarginBalance$1> continuation) {
        super(2, continuation);
        this.this$0 = c51045vfc;
        this.$amount = str;
        this.$algoId = str2;
        this.$type = marginBalanceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesGridWithdrawViewModel$fetchMarginBalance$1(this.this$0, this.$amount, this.$algoId, this.$type, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesGridWithdrawViewModel$fetchMarginBalance$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (((uLU) this.this$0.copydefault.getValue()).KWHzl() == null) {
                    this.this$0.copydefault.setValue(uLU.Companion.EZpvd(true));
                }
                C51052vfj c51052vfj = this.this$0.AYXKKw;
                C51052vfj.StateListAnimator stateListAnimator = new C51052vfj.StateListAnimator(this.$amount, this.$algoId, this.$type);
                this.label = 1;
                obj = c51052vfj.KWHzl(stateListAnimator, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            C51052vfj.Application application = (C51052vfj.Application) obj;
            C51045vfc.Activity activity = new C51045vfc.Activity(application.copydefault(), application.EZpvd(), application.OLrzqt());
            this.this$0.copydefault.setValue(uLU.Companion.AEQbTJ(activity));
            pUU.EZpvd("FuturesGridWithdrawViewModel", "Fetch margin balance success: " + activity);
        } catch (Exception e) {
            pUU.AEQbTJ("FuturesGridWithdrawViewModel", "Fetch margin balance failed", e);
            if (((uLU) this.this$0.copydefault.getValue()).KWHzl() == null) {
                this.this$0.copydefault.setValue(uLU.Companion.KWHzl(e));
            }
        }
        return Unit.INSTANCE;
    }
}
