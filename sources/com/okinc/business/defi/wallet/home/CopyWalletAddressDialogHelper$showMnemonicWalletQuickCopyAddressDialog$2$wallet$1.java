package com.okinc.business.defi.wallet.home;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C10337bmZ;
import o.C12827cuN;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9739bbK;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$2$wallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC12782ctV>, Object> {
    final /* synthetic */ String $walletId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$2$wallet$1(String str, Continuation<? super CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$2$wallet$1> continuation) {
        super(2, continuation);
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$2$wallet$1(this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC12782ctV> continuation) {
        return ((CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$2$wallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
            this.label = 1;
            if (AwaitKt.awaitFirst(abstractC58185ywXEnsureInitialized$default, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.$walletId, true);
        this.label = 2;
        obj = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
        return obj == objCopydefault ? objCopydefault : obj;
    }
}
