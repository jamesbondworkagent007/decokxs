package com.okinc.business.trade.features.home.meme.viewmodel.transaction;

import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28297kWe;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeModeTransactionViewModel$requestConfig$2$presetConfigDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends DexPresetResultVO>>, Object> {
    final /* synthetic */ String $chainId;
    int label;
    final /* synthetic */ MemeModeTransactionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeModeTransactionViewModel$requestConfig$2$presetConfigDeferred$1(MemeModeTransactionViewModel memeModeTransactionViewModel, String str, Continuation<? super MemeModeTransactionViewModel$requestConfig$2$presetConfigDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = memeModeTransactionViewModel;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeModeTransactionViewModel$requestConfig$2$presetConfigDeferred$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends DexPresetResultVO>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<DexPresetResultVO>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<DexPresetResultVO>> continuation) {
        return ((MemeModeTransactionViewModel$requestConfig$2$presetConfigDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28297kWe c28297kWe = this.this$0.QOLQEE;
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
        return Result.m7376boximpl(objAEQbTJ);
    }
}
