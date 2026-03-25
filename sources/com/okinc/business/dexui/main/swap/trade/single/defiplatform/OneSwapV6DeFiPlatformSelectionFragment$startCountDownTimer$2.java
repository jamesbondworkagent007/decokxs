package com.okinc.business.dexui.main.swap.trade.single.defiplatform;

import com.google.android.material.progressindicator.CircularProgressIndicator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import o.C21670hHz;
import o.C22416heu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class OneSwapV6DeFiPlatformSelectionFragment$startCountDownTimer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OneSwapV6DeFiPlatformSelectionFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSwapV6DeFiPlatformSelectionFragment$startCountDownTimer$2(OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment, Continuation<? super OneSwapV6DeFiPlatformSelectionFragment$startCountDownTimer$2> continuation) {
        super(2, continuation);
        this.this$0 = oneSwapV6DeFiPlatformSelectionFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OneSwapV6DeFiPlatformSelectionFragment$startCountDownTimer$2 oneSwapV6DeFiPlatformSelectionFragment$startCountDownTimer$2 = new OneSwapV6DeFiPlatformSelectionFragment$startCountDownTimer$2(this.this$0, continuation);
        oneSwapV6DeFiPlatformSelectionFragment$startCountDownTimer$2.L$0 = obj;
        return oneSwapV6DeFiPlatformSelectionFragment$startCountDownTimer$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneSwapV6DeFiPlatformSelectionFragment$startCountDownTimer$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        int i;
        C21670hHz c21670hHz;
        CircularProgressIndicator circularProgressIndicator;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            i = 0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        while (i < 100 && CoroutineScopeKt.isActive(coroutineScope)) {
            if (!C22416heu.ejfBZ() && (c21670hHz = this.this$0.valueOf) != null && (circularProgressIndicator = c21670hHz.djBIcL) != null) {
                circularProgressIndicator.setProgressCompat(i, true);
            }
            i++;
            this.L$0 = coroutineScope;
            this.I$0 = i;
            this.label = 1;
            if (DelayKt.delay(100L, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        this.this$0.OLrzqt();
        return Unit.INSTANCE;
    }
}
