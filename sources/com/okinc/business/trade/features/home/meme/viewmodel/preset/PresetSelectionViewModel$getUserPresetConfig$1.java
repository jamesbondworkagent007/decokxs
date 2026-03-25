package com.okinc.business.trade.features.home.meme.viewmodel.preset;

import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28297kWe;
import o.C30924lkN;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class PresetSelectionViewModel$getUserPresetConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    int label;
    final /* synthetic */ PresetSelectionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresetSelectionViewModel$getUserPresetConfig$1(PresetSelectionViewModel presetSelectionViewModel, String str, Continuation<? super PresetSelectionViewModel$getUserPresetConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = presetSelectionViewModel;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PresetSelectionViewModel$getUserPresetConfig$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PresetSelectionViewModel$getUserPresetConfig$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl.setValue(C56443yFo.KWHzl(true));
            C28297kWe c28297kWe = this.this$0.valueOf;
            String str = this.$chainId;
            this.label = 1;
            objAEQbTJ = c28297kWe.AEQbTJ(str, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        PresetSelectionViewModel presetSelectionViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            presetSelectionViewModel.copydefault.setValue(C30924lkN.copydefault((DexPresetResultVO) objAEQbTJ));
            presetSelectionViewModel.KWHzl.setValue(C56443yFo.KWHzl(false));
            presetSelectionViewModel.EZpvd.setValue(C56443yFo.KWHzl(true));
        }
        PresetSelectionViewModel presetSelectionViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            thM7380exceptionOrNullimpl.printStackTrace();
            presetSelectionViewModel2.KWHzl.setValue(C56443yFo.KWHzl(false));
            presetSelectionViewModel2.EZpvd.setValue(C56443yFo.KWHzl(false));
        }
        return Unit.INSTANCE;
    }
}
