package com.okinc.business.trade.features.home.meme.viewmodel.preset;

import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C28297kWe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class PresetBuySellViewModel$resetPreset$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $presetType;
    int label;
    final /* synthetic */ PresetBuySellViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresetBuySellViewModel$resetPreset$1(PresetBuySellViewModel presetBuySellViewModel, String str, String str2, Continuation<? super PresetBuySellViewModel$resetPreset$1> continuation) {
        super(2, continuation);
        this.this$0 = presetBuySellViewModel;
        this.$chainId = str;
        this.$presetType = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PresetBuySellViewModel$resetPreset$1(this.this$0, this.$chainId, this.$presetType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PresetBuySellViewModel$resetPreset$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd.setValue(C56443yFo.KWHzl(true));
            C28297kWe c28297kWe = this.this$0.AEQbTJ;
            String str = this.$chainId;
            String str2 = this.$presetType;
            this.label = 1;
            objEZpvd = c28297kWe.EZpvd(str, str2, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        PresetBuySellViewModel presetBuySellViewModel = this.this$0;
        String str3 = this.$presetType;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            Iterator<T> it = ((DexPresetResultVO) objEZpvd).getDexPresetResultVOList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((PresetUserConfigBean) next).getPresetType(), (Object) str3)) {
                    break;
                }
            }
            PresetUserConfigBean presetUserConfigBean = (PresetUserConfigBean) next;
            if (presetUserConfigBean != null) {
                presetBuySellViewModel.copydefault.setValue(presetUserConfigBean);
            }
            presetBuySellViewModel.EZpvd.setValue(C56443yFo.KWHzl(false));
            presetBuySellViewModel.OLrzqt.setValue(C56443yFo.KWHzl(true));
        }
        PresetBuySellViewModel presetBuySellViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
            thM7380exceptionOrNullimpl.printStackTrace();
            presetBuySellViewModel2.EZpvd.setValue(C56443yFo.KWHzl(false));
            presetBuySellViewModel2.OLrzqt.setValue(C56443yFo.KWHzl(false));
        }
        return Unit.INSTANCE;
    }
}
