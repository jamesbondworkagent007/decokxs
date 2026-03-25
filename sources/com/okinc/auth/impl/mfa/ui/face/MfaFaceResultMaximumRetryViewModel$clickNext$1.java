package com.okinc.auth.impl.mfa.ui.face;

import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5766aCf;

/* JADX INFO: loaded from: classes3.dex */
public final class MfaFaceResultMaximumRetryViewModel$clickNext$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MfaScenario $mfaScenario;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    Object L$0;
    int label;
    final /* synthetic */ MfaFaceResultMaximumRetryViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaFaceResultMaximumRetryViewModel$clickNext$1(MfaFaceResultMaximumRetryViewModel mfaFaceResultMaximumRetryViewModel, String str, SubdomainStrategy subdomainStrategy, MfaScenario mfaScenario, Continuation<? super MfaFaceResultMaximumRetryViewModel$clickNext$1> continuation) {
        super(2, continuation);
        this.this$0 = mfaFaceResultMaximumRetryViewModel;
        this.$sessionId = str;
        this.$subdomainStrategy = subdomainStrategy;
        this.$mfaScenario = mfaScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MfaFaceResultMaximumRetryViewModel$clickNext$1(this.this$0, this.$sessionId, this.$subdomainStrategy, this.$mfaScenario, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MfaFaceResultMaximumRetryViewModel$clickNext$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5766aCf.Application application;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    application = (C5766aCf.Application) obj;
                    mutableSharedFlow = this.this$0.EZpvd;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = application;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    if (application instanceof C5766aCf.Application.StateListAnimator) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                application = (C5766aCf.Application) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (application instanceof C5766aCf.Application.StateListAnimator) {
                    MutableSharedFlow mutableSharedFlow3 = this.this$0.AEQbTJ;
                    MfaFailure mfaFailureEZpvd = ((C5766aCf.Application.StateListAnimator) application).EZpvd();
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableSharedFlow3.emit(mfaFailureEZpvd, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (application instanceof C5766aCf.Application.TaskDescription) {
                    MutableSharedFlow mutableSharedFlow4 = this.this$0.OLrzqt;
                    MfaResponse mfaResponseAEQbTJ = ((C5766aCf.Application.TaskDescription) application).AEQbTJ();
                    this.L$0 = null;
                    this.label = 5;
                    if (mutableSharedFlow4.emit(mfaResponseAEQbTJ, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5766aCf c5766aCf = this.this$0.copydefault;
        String str = this.$sessionId;
        SubdomainStrategy subdomainStrategy = this.$subdomainStrategy;
        MfaScenario mfaScenario = this.$mfaScenario;
        this.label = 2;
        obj = c5766aCf.copydefault(str, subdomainStrategy, mfaScenario, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        application = (C5766aCf.Application) obj;
        mutableSharedFlow = this.this$0.EZpvd;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = application;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
        }
        if (application instanceof C5766aCf.Application.StateListAnimator) {
        }
        return Unit.INSTANCE;
    }
}
