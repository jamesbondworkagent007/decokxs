package com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.viewmodel;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountType;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCheckRecoverRes;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C17637fMs;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.fLX;

/* JADX INFO: loaded from: classes5.dex */
public final class RecoverPassKeyWalletAccessViewModel$preCheckRecoverInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ RecoverPassKeyWalletAccessViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecoverPassKeyWalletAccessViewModel$preCheckRecoverInfo$1(RecoverPassKeyWalletAccessViewModel recoverPassKeyWalletAccessViewModel, Continuation<? super RecoverPassKeyWalletAccessViewModel$preCheckRecoverInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = recoverPassKeyWalletAccessViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecoverPassKeyWalletAccessViewModel$preCheckRecoverInfo$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoverPassKeyWalletAccessViewModel$preCheckRecoverInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objKWHzl;
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
            MutableStateFlow mutableStateFlow = this.this$0.copydefault;
            InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
            this.label = 1;
            if (mutableStateFlow.emit(actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    RecoverPassKeyWalletAccessViewModel recoverPassKeyWalletAccessViewModel = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                        MutableStateFlow mutableStateFlow2 = recoverPassKeyWalletAccessViewModel.copydefault;
                        InterfaceC49371unL.Application application2 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                        this.L$0 = obj2;
                        this.label = 4;
                        if (mutableStateFlow2.emit(application2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                C56391yDq.AEQbTJ(objKWHzl);
                objM7377constructorimpl = Result.m7377constructorimpl((PasskeyWalletCheckRecoverRes) objKWHzl);
                obj2 = objM7377constructorimpl;
                RecoverPassKeyWalletAccessViewModel recoverPassKeyWalletAccessViewModel2 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    PasskeyWalletCheckRecoverRes passkeyWalletCheckRecoverRes = (PasskeyWalletCheckRecoverRes) obj2;
                    MutableStateFlow mutableStateFlow3 = recoverPassKeyWalletAccessViewModel2.copydefault;
                    InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(new C17637fMs(true ^ passkeyWalletCheckRecoverRes.getAllowRecovery(), passkeyWalletCheckRecoverRes.getExistRecoveryFlow(), passkeyWalletCheckRecoverRes.getHasActiveLimitOrder()));
                    this.L$0 = obj2;
                    this.label = 3;
                    if (mutableStateFlow3.emit(activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                RecoverPassKeyWalletAccessViewModel recoverPassKeyWalletAccessViewModel3 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        RecoverPassKeyWalletAccessViewModel recoverPassKeyWalletAccessViewModel4 = this.this$0;
        Result.Application application3 = Result.Companion;
        fLX flx = recoverPassKeyWalletAccessViewModel4.AEQbTJ;
        int value = AccountType.CeDeFi.getValue();
        this.label = 2;
        objKWHzl = flx.KWHzl(value, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        C56391yDq.AEQbTJ(objKWHzl);
        objM7377constructorimpl = Result.m7377constructorimpl((PasskeyWalletCheckRecoverRes) objKWHzl);
        obj2 = objM7377constructorimpl;
        RecoverPassKeyWalletAccessViewModel recoverPassKeyWalletAccessViewModel22 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
        }
        RecoverPassKeyWalletAccessViewModel recoverPassKeyWalletAccessViewModel32 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
