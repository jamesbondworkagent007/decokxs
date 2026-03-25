package com.okinc.business.defi.wallet.switchComponent.viewmodel;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.AbstractC12784ctX;
import o.C17776fRw;
import o.C17781fSa;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSwitchViewModel$refreshMpcWalletCache$2 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C17781fSa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSwitchViewModel$refreshMpcWalletCache$2(C17781fSa c17781fSa, Continuation<? super WalletSwitchViewModel$refreshMpcWalletCache$2> continuation) {
        super(1, continuation);
        this.this$0 = c17781fSa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WalletSwitchViewModel$refreshMpcWalletCache$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
        return invoke2((Continuation<Object>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<Object> continuation) {
        return ((WalletSwitchViewModel$refreshMpcWalletCache$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C17781fSa c17781fSa;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            c17781fSa = this.this$0;
            Result.Application application2 = Result.Companion;
            C17776fRw c17776fRw = c17781fSa.fIwbmz;
            this.L$0 = c17781fSa;
            this.label = 1;
            obj = c17776fRw.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            c17781fSa = (C17781fSa) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (c17781fSa.AEQbTJ((List<? extends AbstractC12784ctX>) obj, (Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
