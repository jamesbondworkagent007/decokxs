package com.okinc.business.defi.wallet.tee.activate.usecase;

import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C17833fTz;
import o.C56391yDq;
import o.C56442yFn;
import o.fTX;

/* JADX INFO: loaded from: classes18.dex */
public final class ActivateTeeViewDataReadyUseCase$invoke$2$teeMetaDataDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TeeMetadata>>, Object> {
    int label;
    final /* synthetic */ C17833fTz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateTeeViewDataReadyUseCase$invoke$2$teeMetaDataDeferred$1(C17833fTz c17833fTz, Continuation<? super ActivateTeeViewDataReadyUseCase$invoke$2$teeMetaDataDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = c17833fTz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateTeeViewDataReadyUseCase$invoke$2$teeMetaDataDeferred$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TeeMetadata>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<TeeMetadata>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<TeeMetadata>> continuation) {
        return ((ActivateTeeViewDataReadyUseCase$invoke$2$teeMetaDataDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            fTX ftx = this.this$0.copydefault;
            this.label = 1;
            objCopydefault = ftx.copydefault(this);
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
        return Result.m7376boximpl(objCopydefault);
    }
}
