package com.okinc.auth.impl.passkey.ui.register.okxpay;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC5991aGs;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5895aFB;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityRegisterOkxPayPasskeyServiceViewModel$register$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $unlockToken;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SecurityRegisterOkxPayPasskeyServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityRegisterOkxPayPasskeyServiceViewModel$register$1(SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel, String str, Continuation<? super SecurityRegisterOkxPayPasskeyServiceViewModel$register$1> continuation) {
        super(2, continuation);
        this.this$0 = securityRegisterOkxPayPasskeyServiceViewModel;
        this.$unlockToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityRegisterOkxPayPasskeyServiceViewModel$register$1(this.this$0, this.$unlockToken, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityRegisterOkxPayPasskeyServiceViewModel$register$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel;
        AbstractC5991aGs abstractC5991aGs;
        MutableSharedFlow mutableSharedFlow;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5895aFB c5895aFB = this.this$0.AkhnZx;
            String str = this.$unlockToken;
            this.label = 1;
            obj = c5895aFB.EZpvd(str, this);
            if (obj == objCopydefault) {
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
                abstractC5991aGs = (AbstractC5991aGs) this.L$1;
                securityRegisterOkxPayPasskeyServiceViewModel = (SecurityRegisterOkxPayPasskeyServiceViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = securityRegisterOkxPayPasskeyServiceViewModel.OLrzqt;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (mutableSharedFlow.emit(abstractC5991aGs, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        SecurityRegisterOkxPayPasskeyServiceViewModel securityRegisterOkxPayPasskeyServiceViewModel2 = this.this$0;
        AbstractC5991aGs abstractC5991aGs2 = (AbstractC5991aGs) obj;
        MutableSharedFlow mutableSharedFlow2 = securityRegisterOkxPayPasskeyServiceViewModel2.EZpvd;
        Boolean boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = securityRegisterOkxPayPasskeyServiceViewModel2;
        this.L$1 = abstractC5991aGs2;
        this.label = 2;
        if (mutableSharedFlow2.emit(boolKWHzl, this) == objCopydefault) {
            return objCopydefault;
        }
        securityRegisterOkxPayPasskeyServiceViewModel = securityRegisterOkxPayPasskeyServiceViewModel2;
        abstractC5991aGs = abstractC5991aGs2;
        mutableSharedFlow = securityRegisterOkxPayPasskeyServiceViewModel.OLrzqt;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        if (mutableSharedFlow.emit(abstractC5991aGs, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
