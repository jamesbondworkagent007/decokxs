package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.fLG;

/* JADX INFO: loaded from: classes18.dex */
public final class EscapePassKeyConfirmViewModel$selectWalletCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ fLG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyConfirmViewModel$selectWalletCheck$1(fLG flg, Continuation<? super EscapePassKeyConfirmViewModel$selectWalletCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = flg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EscapePassKeyConfirmViewModel$selectWalletCheck$1 escapePassKeyConfirmViewModel$selectWalletCheck$1 = new EscapePassKeyConfirmViewModel$selectWalletCheck$1(this.this$0, continuation);
        escapePassKeyConfirmViewModel$selectWalletCheck$1.L$0 = obj;
        return escapePassKeyConfirmViewModel$selectWalletCheck$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePassKeyConfirmViewModel$selectWalletCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[Catch: all -> 0x0093, CancellationException -> 0x00a0, TryCatch #2 {CancellationException -> 0x00a0, all -> 0x0093, blocks: (B:7:0x0015, B:22:0x0079, B:24:0x007f, B:26:0x008a, B:25:0x0085, B:12:0x0029, B:18:0x0063, B:15:0x0038), top: B:34:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[Catch: all -> 0x0093, CancellationException -> 0x00a0, TryCatch #2 {CancellationException -> 0x00a0, all -> 0x0093, blocks: (B:7:0x0015, B:22:0x0079, B:24:0x007f, B:26:0x008a, B:25:0x0085, B:12:0x0029, B:18:0x0063, B:15:0x0038), top: B:34:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        fLG flg;
        Deferred deferredAsync$default;
        int i;
        fLG.Activity stateListAnimator;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            flg = this.this$0;
            Result.Application application2 = Result.Companion;
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new EscapePassKeyConfirmViewModel$selectWalletCheck$1$1$initializedResult$1(null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new EscapePassKeyConfirmViewModel$selectWalletCheck$1$1$getRootWalletsByType$1(null), 3, null);
            this.L$0 = flg;
            this.L$1 = deferredAsync$default;
            this.label = 1;
            obj = deferredAsync$default2.await(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                flg = (fLG) this.L$0;
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow = flg.EZpvd;
                if (i != 0) {
                    stateListAnimator = new fLG.Activity.ActionBar();
                } else {
                    stateListAnimator = new fLG.Activity.StateListAnimator();
                }
                mutableStateFlow.setValue(stateListAnimator);
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            Deferred deferred = (Deferred) this.L$1;
            fLG flg2 = (fLG) this.L$0;
            C56391yDq.AEQbTJ(obj);
            deferredAsync$default = deferred;
            flg = flg2;
        }
        int iIntValue = ((Number) obj).intValue();
        this.L$0 = flg;
        this.L$1 = null;
        this.I$0 = iIntValue;
        this.label = 2;
        if (deferredAsync$default.await(this) == objCopydefault) {
            return objCopydefault;
        }
        i = iIntValue;
        MutableStateFlow mutableStateFlow2 = flg.EZpvd;
        if (i != 0) {
        }
        mutableStateFlow2.setValue(stateListAnimator);
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
