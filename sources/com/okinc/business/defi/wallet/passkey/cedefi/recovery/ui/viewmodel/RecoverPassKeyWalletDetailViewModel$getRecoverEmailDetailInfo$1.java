package com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.viewmodel;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountType;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletRecoverInfoRes;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.fLU;

/* JADX INFO: loaded from: classes5.dex */
public final class RecoverPassKeyWalletDetailViewModel$getRecoverEmailDetailInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RecoverPassKeyWalletDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecoverPassKeyWalletDetailViewModel$getRecoverEmailDetailInfo$1(RecoverPassKeyWalletDetailViewModel recoverPassKeyWalletDetailViewModel, Continuation<? super RecoverPassKeyWalletDetailViewModel$getRecoverEmailDetailInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = recoverPassKeyWalletDetailViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecoverPassKeyWalletDetailViewModel$getRecoverEmailDetailInfo$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoverPassKeyWalletDetailViewModel$getRecoverEmailDetailInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.AEQbTJ.setValue(new InterfaceC49371unL.ActionBar(null, 1, null));
                RecoverPassKeyWalletDetailViewModel recoverPassKeyWalletDetailViewModel = this.this$0;
                Result.Application application = Result.Companion;
                fLU flu = recoverPassKeyWalletDetailViewModel.EZpvd;
                int value = AccountType.CeDeFi.getValue();
                this.label = 1;
                objKWHzl = flu.KWHzl(value, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objKWHzl);
            objM7377constructorimpl = Result.m7377constructorimpl((PasskeyWalletRecoverInfoRes) objKWHzl);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        RecoverPassKeyWalletDetailViewModel recoverPassKeyWalletDetailViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            recoverPassKeyWalletDetailViewModel2.AEQbTJ.setValue(new InterfaceC49371unL.Activity(recoverPassKeyWalletDetailViewModel2.KWHzl((PasskeyWalletRecoverInfoRes) objM7377constructorimpl)));
        }
        RecoverPassKeyWalletDetailViewModel recoverPassKeyWalletDetailViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            recoverPassKeyWalletDetailViewModel3.AEQbTJ.setValue(new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null));
        }
        return Unit.INSTANCE;
    }
}
