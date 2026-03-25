package com.okinc.business.defi.wallet.mine.walletbind;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.wYF;

/* JADX INFO: loaded from: classes15.dex */
public final class WalletBindConfirmBottomSheet$observeData$1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ wYF $buttonbox;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindConfirmBottomSheet$observeData$1(wYF wyf, Continuation<? super WalletBindConfirmBottomSheet$observeData$1> continuation) {
        super(2, continuation);
        this.$buttonbox = wyf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletBindConfirmBottomSheet$observeData$1 walletBindConfirmBottomSheet$observeData$1 = new WalletBindConfirmBottomSheet$observeData$1(this.$buttonbox, continuation);
        walletBindConfirmBottomSheet$observeData$1.Z$0 = ((Boolean) obj).booleanValue();
        return walletBindConfirmBottomSheet$observeData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((WalletBindConfirmBottomSheet$observeData$1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.Z$0) {
                C52794wYp c52794wYpCopydefault = this.$buttonbox.copydefault();
                if (c52794wYpCopydefault != null) {
                    C52794wYp.startLoading$default(c52794wYpCopydefault, 0L, 1, null);
                }
            } else {
                C52794wYp c52794wYpCopydefault2 = this.$buttonbox.copydefault();
                if (c52794wYpCopydefault2 != null) {
                    c52794wYpCopydefault2.fIwbmz();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
