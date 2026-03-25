package com.okinc.business.trade.features.home.meme.viewmodel.preset;

import com.okinc.business.dexlogic.bean.CommonMemeQuoteParams;
import com.okinc.business.dexlogic.bean.MemeModeQuoteBean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28294kWb;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class PresetChildViewModel$memeQuote$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CommonMemeQuoteParams $memeCommonMemeQuoteParams;
    final /* synthetic */ C28294kWb.StateListAnimator $v6ExtraParams;
    int label;
    final /* synthetic */ PresetChildViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresetChildViewModel$memeQuote$1(PresetChildViewModel presetChildViewModel, CommonMemeQuoteParams commonMemeQuoteParams, C28294kWb.StateListAnimator stateListAnimator, Continuation<? super PresetChildViewModel$memeQuote$1> continuation) {
        super(2, continuation);
        this.this$0 = presetChildViewModel;
        this.$memeCommonMemeQuoteParams = commonMemeQuoteParams;
        this.$v6ExtraParams = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PresetChildViewModel$memeQuote$1(this.this$0, this.$memeCommonMemeQuoteParams, this.$v6ExtraParams, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PresetChildViewModel$memeQuote$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28294kWb c28294kWb = this.this$0.AYXKKw;
            CommonMemeQuoteParams commonMemeQuoteParams = this.$memeCommonMemeQuoteParams;
            C28294kWb.StateListAnimator stateListAnimator = this.$v6ExtraParams;
            this.label = 1;
            objKWHzl = c28294kWb.KWHzl(commonMemeQuoteParams, stateListAnimator, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        PresetChildViewModel presetChildViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            presetChildViewModel.OLrzqt.setValue(C56390yDp.OLrzqt(C56443yFo.KWHzl(true), (MemeModeQuoteBean) objKWHzl));
            presetChildViewModel.AEQbTJ.setValue(C56443yFo.KWHzl(false));
        }
        PresetChildViewModel presetChildViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            presetChildViewModel2.OLrzqt.setValue(C56390yDp.OLrzqt(C56443yFo.KWHzl(false), null));
            presetChildViewModel2.AEQbTJ.setValue(C56443yFo.KWHzl(false));
        }
        return Unit.INSTANCE;
    }
}
