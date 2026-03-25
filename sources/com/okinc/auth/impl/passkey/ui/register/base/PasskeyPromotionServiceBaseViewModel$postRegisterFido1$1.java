package com.okinc.auth.impl.passkey.ui.register.base;

import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C5918aFY;
import o.C5922aFc;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyPromotionServiceBaseViewModel$postRegisterFido1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RegistrationFinishBody $body;
    Object L$0;
    int label;
    final /* synthetic */ PasskeyPromotionServiceBaseViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceBaseViewModel$postRegisterFido1$1(PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel, RegistrationFinishBody registrationFinishBody, Continuation<? super PasskeyPromotionServiceBaseViewModel$postRegisterFido1$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyPromotionServiceBaseViewModel;
        this.$body = registrationFinishBody;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceBaseViewModel$postRegisterFido1$1(this.this$0, this.$body, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceBaseViewModel$postRegisterFido1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5918aFY c5918aFY = this.this$0.gHZMYf;
            RegistrationFinishBody registrationFinishBody = this.$body;
            this.label = 1;
            objKWHzl = c5918aFY.KWHzl(2, registrationFinishBody, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "post register fido1: " + thM7380exceptionOrNullimpl.getMessage(), 2, null);
                    MutableSharedFlow mutableSharedFlow = passkeyPromotionServiceBaseViewModel.uzCIH;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    this.L$0 = obj2;
                    this.label = 3;
                    if (mutableSharedFlow.emit(message, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        obj2 = objKWHzl;
        PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
            MutableSharedFlow mutableSharedFlow2 = passkeyPromotionServiceBaseViewModel2.AhwBna;
            Unit unit = Unit.INSTANCE;
            this.L$0 = obj2;
            this.label = 2;
            if (mutableSharedFlow2.emit(unit, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel3 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
