package com.okinc.business.defi.wallet.passkey.cedefi.create.viewmodel;

import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyAccountData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C17554fJq;
import o.C17560fJw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes18.dex */
public final class CreatePasskeyWalletViewModel$loadCreateAccount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C17560fJw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePasskeyWalletViewModel$loadCreateAccount$1(C17560fJw c17560fJw, Continuation<? super CreatePasskeyWalletViewModel$loadCreateAccount$1> continuation) {
        super(2, continuation);
        this.this$0 = c17560fJw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreatePasskeyWalletViewModel$loadCreateAccount$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreatePasskeyWalletViewModel$loadCreateAccount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objAEQbTJ;
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
            MutableSharedFlow mutableSharedFlow = this.this$0.EZpvd;
            InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
            this.label = 1;
            if (mutableSharedFlow.emit(actionBar, this) == objCopydefault) {
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
                    C17560fJw c17560fJw = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                        MutableSharedFlow mutableSharedFlow2 = c17560fJw.EZpvd;
                        InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity((PasskeyAccountData) obj2);
                        this.L$0 = obj2;
                        this.label = 4;
                        if (mutableSharedFlow2.emit(activity, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                C56391yDq.AEQbTJ(objAEQbTJ);
                objM7377constructorimpl = Result.m7377constructorimpl((PasskeyAccountData) objAEQbTJ);
                obj2 = objM7377constructorimpl;
                C17560fJw c17560fJw2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow3 = c17560fJw2.EZpvd;
                    InterfaceC49371unL.Application application2 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                    this.L$0 = obj2;
                    this.label = 3;
                    if (mutableSharedFlow3.emit(application2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                C17560fJw c17560fJw3 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C17560fJw c17560fJw4 = this.this$0;
        Result.Application application3 = Result.Companion;
        C17554fJq c17554fJq = c17560fJw4.AEQbTJ;
        this.label = 2;
        objAEQbTJ = c17554fJq.AEQbTJ(this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        objM7377constructorimpl = Result.m7377constructorimpl((PasskeyAccountData) objAEQbTJ);
        obj2 = objM7377constructorimpl;
        C17560fJw c17560fJw22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        C17560fJw c17560fJw32 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
        }
        return Unit.INSTANCE;
    }
}
