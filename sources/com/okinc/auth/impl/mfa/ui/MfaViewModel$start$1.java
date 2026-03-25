package com.okinc.auth.impl.mfa.ui;

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
import o.C5773aCm;

/* JADX INFO: loaded from: classes3.dex */
public final class MfaViewModel$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    Object L$0;
    int label;
    final /* synthetic */ MfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaViewModel$start$1(MfaViewModel mfaViewModel, String str, Continuation<? super MfaViewModel$start$1> continuation) {
        super(2, continuation);
        this.this$0 = mfaViewModel;
        this.$sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MfaViewModel$start$1(this.this$0, this.$sessionId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MfaViewModel$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        MfaResult mfaResult;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.djBIcL;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mfaResult = (MfaResult) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    if (!(mfaResult instanceof MfaResult.Success)) {
                        this.this$0.gEmmrt.setValue(((MfaResult.Success) mfaResult).KWHzl());
                    } else {
                        if (!(mfaResult instanceof MfaResult.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.this$0.EZpvd(((MfaResult.Failure) mfaResult).KWHzl());
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                MfaResult mfaResult2 = (MfaResult) obj;
                mutableSharedFlow = this.this$0.djBIcL;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = mfaResult2;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
                    return objCopydefault;
                }
                mfaResult = mfaResult2;
                if (!(mfaResult instanceof MfaResult.Success)) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.fetchVPNInfo.setValue(this.$sessionId);
        C5773aCm c5773aCm = this.this$0.AxsJAY;
        String str = this.$sessionId;
        SubdomainStrategy subdomainStrategyFIwbmz = this.this$0.fIwbmz();
        MfaScenario mfaScenarioDbNXlk = this.this$0.DbNXlk();
        this.label = 2;
        obj = c5773aCm.OLrzqt(str, subdomainStrategyFIwbmz, mfaScenarioDbNXlk, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        MfaResult mfaResult22 = (MfaResult) obj;
        mutableSharedFlow = this.this$0.djBIcL;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = mfaResult22;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
        }
    }
}
