package com.okinc.kline.ui.formula.ui.viewmodel;

import com.okinc.kline.ui.formula.data.KlineFormulaData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C39384prL;
import o.C39503pta;
import o.C39507pte;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineFormulaViewModel$getHistoryFormulaCandles$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ KlineFormulaData $extractedFormula;
    final /* synthetic */ String $initialText;
    int label;
    final /* synthetic */ C39507pte this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineFormulaViewModel$getHistoryFormulaCandles$1(C39507pte c39507pte, KlineFormulaData klineFormulaData, String str, Continuation<? super KlineFormulaViewModel$getHistoryFormulaCandles$1> continuation) {
        super(2, continuation);
        this.this$0 = c39507pte;
        this.$extractedFormula = klineFormulaData;
        this.$initialText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineFormulaViewModel$getHistoryFormulaCandles$1(this.this$0, this.$extractedFormula, this.$initialText, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineFormulaViewModel$getHistoryFormulaCandles$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("KlineSettingViewModel", "getHistoryFormulaCandles failed", e);
            String message = e.getMessage();
            if (message != null) {
                MutableSharedFlow mutableSharedFlow = this.this$0.EZpvd;
                C39507pte.Activity.C0920Activity c0920Activity = new C39507pte.Activity.C0920Activity(message);
                this.label = 2;
                if (mutableSharedFlow.emit(c0920Activity, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C39384prL c39384prL = this.this$0.KWHzl;
            C39384prL.StateListAnimator stateListAnimator = new C39384prL.StateListAnimator(this.$extractedFormula.getCalcExpression(), this.$extractedFormula.getInstIdArray());
            this.label = 1;
            if (c39384prL.EZpvd(stateListAnimator, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.EZpvd.tryEmit(new C39507pte.Activity.Application(new C39503pta(this.$initialText, this.$extractedFormula)));
        return Unit.INSTANCE;
    }
}
