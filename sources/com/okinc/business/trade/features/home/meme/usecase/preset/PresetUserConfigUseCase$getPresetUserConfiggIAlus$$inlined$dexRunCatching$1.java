package com.okinc.business.trade.features.home.meme.usecase.preset;

import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28297kWe;
import o.C56391yDq;
import o.C56442yFn;
import o.kVC;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.meme.usecase.preset.PresetUserConfigUseCase$getPresetUserConfig-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class PresetUserConfigUseCase$getPresetUserConfiggIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends DexPresetResultVO>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    int label;
    final /* synthetic */ C28297kWe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresetUserConfigUseCase$getPresetUserConfiggIAlus$$inlined$dexRunCatching$1(Continuation continuation, C28297kWe c28297kWe, String str) {
        super(2, continuation);
        this.this$0 = c28297kWe;
        this.$chainId$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PresetUserConfigUseCase$getPresetUserConfiggIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends DexPresetResultVO>> continuation) {
        return ((PresetUserConfigUseCase$getPresetUserConfiggIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                kVC kvc = this.this$0.EZpvd;
                String str = this.$chainId$inlined;
                String strCopydefault = this.this$0.KWHzl.copydefault(this.$chainId$inlined);
                this.label = 1;
                obj = kvc.EZpvd(str, strCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) obj).AEQbTJ());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
