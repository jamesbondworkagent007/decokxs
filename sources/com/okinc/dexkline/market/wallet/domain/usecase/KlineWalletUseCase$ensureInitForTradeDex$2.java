package com.okinc.dexkline.market.wallet.domain.usecase;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34587ner;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54572xNi;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineWalletUseCase$ensureInitForTradeDex$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C34587ner this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineWalletUseCase$ensureInitForTradeDex$2(C34587ner c34587ner, Continuation<? super KlineWalletUseCase$ensureInitForTradeDex$2> continuation) {
        super(2, continuation);
        this.this$0 = c34587ner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineWalletUseCase$ensureInitForTradeDex$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((KlineWalletUseCase$ensureInitForTradeDex$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C34587ner c34587ner;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C34587ner c34587ner2 = this.this$0;
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            this.L$0 = c34587ner2;
            this.label = 1;
            Object objKWHzl = c54589xNz.KWHzl(false, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c34587ner = c34587ner2;
            objM7386unboximpl = objKWHzl;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c34587ner = (C34587ner) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            objM7386unboximpl = null;
        }
        c34587ner.KWHzl = (InterfaceC54572xNi) objM7386unboximpl;
        pUU.copydefault(this.this$0.OLrzqt, "ensureInitForTradeDex dexTrade: " + (this.this$0.KWHzl != null));
        return C56443yFo.KWHzl(this.this$0.KWHzl != null);
    }
}
