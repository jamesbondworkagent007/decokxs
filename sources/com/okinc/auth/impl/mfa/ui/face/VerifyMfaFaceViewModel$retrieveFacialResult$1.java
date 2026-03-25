package com.okinc.auth.impl.mfa.ui.face;

import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaResult;
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
import o.C5769aCi;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMfaFaceViewModel$retrieveFacialResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    Object L$0;
    int label;
    final /* synthetic */ VerifyMfaFaceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaFaceViewModel$retrieveFacialResult$1(VerifyMfaFaceViewModel verifyMfaFaceViewModel, String str, Continuation<? super VerifyMfaFaceViewModel$retrieveFacialResult$1> continuation) {
        super(2, continuation);
        this.this$0 = verifyMfaFaceViewModel;
        this.$sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaFaceViewModel$retrieveFacialResult$1(this.this$0, this.$sessionId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyMfaFaceViewModel$retrieveFacialResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MfaResult mfaResult;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.OLrzqt;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    mfaResult = (MfaResult) obj;
                    mutableSharedFlow = this.this$0.OLrzqt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = mfaResult;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    if (mfaResult instanceof MfaResult.Success) {
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
                mfaResult = (MfaResult) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (mfaResult instanceof MfaResult.Success) {
                    MutableSharedFlow mutableSharedFlow3 = this.this$0.EZpvd;
                    MfaResponse mfaResponseKWHzl = ((MfaResult.Success) mfaResult).KWHzl();
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableSharedFlow3.emit(mfaResponseKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (mfaResult instanceof MfaResult.Failure) {
                    MutableSharedFlow mutableSharedFlow4 = this.this$0.copydefault;
                    MfaFailure mfaFailureKWHzl = ((MfaResult.Failure) mfaResult).KWHzl();
                    this.L$0 = null;
                    this.label = 5;
                    if (mutableSharedFlow4.emit(mfaFailureKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5769aCi c5769aCi = this.this$0.isConnected;
        String str = this.$sessionId;
        SubdomainStrategy value = this.this$0.copydefault().getValue();
        MfaScenario mfaScenario = (MfaScenario) this.this$0.AEQbTJ.getValue();
        if (mfaScenario == null) {
            mfaScenario = MfaScenario.IsPostLogin;
        }
        this.label = 2;
        obj = c5769aCi.EZpvd(str, value, mfaScenario, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        mfaResult = (MfaResult) obj;
        mutableSharedFlow = this.this$0.OLrzqt;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = mfaResult;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
        }
        if (mfaResult instanceof MfaResult.Success) {
        }
        return Unit.INSTANCE;
    }
}
