package com.okinc.business.defi.wallet.walletaddressbinding;

import com.okinc.account.api.model.wallet.BindWalletResult;
import com.okinc.wallet.api.WalletCefiBindingService;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.gJE;
import o.gJR;
import o.gJY;

/* JADX INFO: loaded from: classes15.dex */
public final class WalletAddressBindGuideFragment$bindWalletLauncher$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BindWalletResult $bindWalletResult;
    int label;
    final /* synthetic */ gJE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressBindGuideFragment$bindWalletLauncher$1$1$1(BindWalletResult bindWalletResult, gJE gje, Continuation<? super WalletAddressBindGuideFragment$bindWalletLauncher$1$1$1> continuation) {
        super(2, continuation);
        this.$bindWalletResult = bindWalletResult;
        this.this$0 = gje;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletAddressBindGuideFragment$bindWalletLauncher$1$1$1(this.$bindWalletResult, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletAddressBindGuideFragment$bindWalletLauncher$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                BindWalletResult bindWalletResult = this.$bindWalletResult;
                gJE gje = this.this$0;
                Result.Application application = Result.Companion;
                gJY gjy = gJY.OLrzqt;
                Intrinsics.copydefault(bindWalletResult);
                String strAEQbTJ = gje.AEQbTJ().AEQbTJ();
                if (strAEQbTJ == null) {
                    strAEQbTJ = "";
                }
                WalletAddressBindViewModel walletAddressBindViewModelAEQbTJ = gje.AEQbTJ();
                this.label = 1;
                obj = gJY.toWalletCefiBindingResult$default(gjy, bindWalletResult, strAEQbTJ, walletAddressBindViewModelAEQbTJ, false, this, 4, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((WalletCefiBindingService.WalletCefiBindingResult) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        gJE gje2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            WalletCefiBindingService.WalletCefiBindingResult walletCefiBindingResult = (WalletCefiBindingService.WalletCefiBindingResult) objM7377constructorimpl;
            gje2.dismissLoading();
            gJR gjr = gje2.AhwBna;
            if (gjr != null) {
                gjr.OLrzqt(walletCefiBindingResult);
            }
        }
        gJE gje3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            gje3.dismissLoading();
        }
        return Unit.INSTANCE;
    }
}
