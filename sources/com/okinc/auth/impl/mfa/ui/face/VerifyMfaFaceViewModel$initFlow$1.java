package com.okinc.auth.impl.mfa.ui.face;

import com.okinc.auth.impl.mfa.model.MfaFailure;
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
import o.C5707aBZ;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMfaFaceViewModel$initFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MfaScenario $mfaScenario;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    Object L$0;
    int label;
    final /* synthetic */ VerifyMfaFaceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaFaceViewModel$initFlow$1(VerifyMfaFaceViewModel verifyMfaFaceViewModel, String str, MfaScenario mfaScenario, SubdomainStrategy subdomainStrategy, Continuation<? super VerifyMfaFaceViewModel$initFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = verifyMfaFaceViewModel;
        this.$sessionId = str;
        this.$mfaScenario = mfaScenario;
        this.$subdomainStrategy = subdomainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaFaceViewModel$initFlow$1(this.this$0, this.$sessionId, this.$mfaScenario, this.$subdomainStrategy, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyMfaFaceViewModel$initFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5707aBZ.Activity activity;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl.setValue(this.$sessionId);
            this.this$0.AEQbTJ.setValue(this.$mfaScenario);
            this.this$0.copydefault().setValue(this.$subdomainStrategy);
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
                    activity = (C5707aBZ.Activity) obj;
                    mutableSharedFlow = this.this$0.OLrzqt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = activity;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    if (activity instanceof C5707aBZ.Activity.C0811Activity) {
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
                activity = (C5707aBZ.Activity) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (activity instanceof C5707aBZ.Activity.C0811Activity) {
                    String strCopydefault = ((C5707aBZ.Activity.C0811Activity) activity).copydefault();
                    MutableSharedFlow mutableSharedFlow3 = this.this$0.AYXKKw;
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableSharedFlow3.emit(strCopydefault, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (activity instanceof C5707aBZ.Activity.StateListAnimator) {
                    MutableSharedFlow mutableSharedFlow4 = this.this$0.copydefault;
                    MfaFailure mfaFailureKWHzl = ((C5707aBZ.Activity.StateListAnimator) activity).KWHzl();
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
        C5707aBZ c5707aBZ = this.this$0.gEmmrt;
        String str = (String) this.this$0.KWHzl.getValue();
        if (str == null) {
            str = "";
        }
        SubdomainStrategy value = this.this$0.copydefault().getValue();
        MfaScenario mfaScenario = this.$mfaScenario;
        this.label = 2;
        obj = c5707aBZ.AEQbTJ(str, value, mfaScenario, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        activity = (C5707aBZ.Activity) obj;
        mutableSharedFlow = this.this$0.OLrzqt;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = activity;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
        }
        if (activity instanceof C5707aBZ.Activity.C0811Activity) {
        }
        return Unit.INSTANCE;
    }
}
