package com.okinc.business.trade.features.home.meme.viewmodel.preset;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserParams;
import com.okinc.business.trade.features.home.ui.uistate.preset.MemePresetSaveUiState;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28297kWe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class PresetSelectionViewModel$savePreset$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexPresetResultVO $data;
    final /* synthetic */ PresetUserParams $presetParams;
    int label;
    final /* synthetic */ PresetSelectionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresetSelectionViewModel$savePreset$1(PresetSelectionViewModel presetSelectionViewModel, DexPresetResultVO dexPresetResultVO, PresetUserParams presetUserParams, Continuation<? super PresetSelectionViewModel$savePreset$1> continuation) {
        super(2, continuation);
        this.this$0 = presetSelectionViewModel;
        this.$data = dexPresetResultVO;
        this.$presetParams = presetUserParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PresetSelectionViewModel$savePreset$1(this.this$0, this.$data, this.$presetParams, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PresetSelectionViewModel$savePreset$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28297kWe c28297kWe = this.this$0.valueOf;
            DexPresetResultVO dexPresetResultVO = this.$data;
            PresetUserParams presetUserParams = this.$presetParams;
            this.label = 1;
            objCopydefault = c28297kWe.copydefault(dexPresetResultVO, presetUserParams, this);
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
        PresetSelectionViewModel presetSelectionViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            presetSelectionViewModel.KWHzl.setValue(C56443yFo.KWHzl(false));
            presetSelectionViewModel.OLrzqt.setValue(new MemePresetSaveUiState(false, true, false, "", null, 16, null));
        }
        PresetSelectionViewModel presetSelectionViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
            presetSelectionViewModel2.KWHzl.setValue(C56443yFo.KWHzl(false));
            MutableLiveData mutableLiveData = presetSelectionViewModel2.OLrzqt;
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            mutableLiveData.setValue(new MemePresetSaveUiState(false, false, true, "", message));
        }
        return Unit.INSTANCE;
    }
}
