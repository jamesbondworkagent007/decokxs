package com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C23673iFb;
import o.C23676iFe;
import o.C26542jeL;
import o.C26543jeM;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes23.dex */
public final class CheckProductAvailabilityUseCase$invoke$2 extends SuspendLambda implements Function1<Continuation<? super C23676iFe>, Object> {
    final /* synthetic */ C23673iFb $details;
    int label;
    final /* synthetic */ C26542jeL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckProductAvailabilityUseCase$invoke$2(C26542jeL c26542jeL, C23673iFb c23673iFb, Continuation<? super CheckProductAvailabilityUseCase$invoke$2> continuation) {
        super(1, continuation);
        this.this$0 = c26542jeL;
        this.$details = c23673iFb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheckProductAvailabilityUseCase$invoke$2(this.this$0, this.$details, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super C23676iFe> continuation) {
        return ((CheckProductAvailabilityUseCase$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26543jeM c26543jeM = this.this$0.OLrzqt;
            this.label = 1;
            objOLrzqt = c26543jeM.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null) {
            objOLrzqt = C56443yFo.KWHzl(false);
        }
        return C23676iFe.copy$default(this.$details.OLrzqt(), false, this.$details.OLrzqt().copydefault() && !((Boolean) objOLrzqt).booleanValue(), null, 0, 13, null);
    }
}
