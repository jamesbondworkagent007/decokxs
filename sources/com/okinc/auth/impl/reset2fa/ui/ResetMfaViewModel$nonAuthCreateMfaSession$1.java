package com.okinc.auth.impl.reset2fa.ui;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateResponse;
import com.okinc.auth.api.service.NonAuthMfaCreateSessionRequest;
import com.okinc.auth.api.service.NonAuthMfaCreateSessionResponse;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C6619aSk;
import o.C8206ayP;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetMfaViewModel$nonAuthCreateMfaSession$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    int label;
    final /* synthetic */ ResetMfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetMfaViewModel$nonAuthCreateMfaSession$1(ResetMfaViewModel resetMfaViewModel, SubdomainStrategy subdomainStrategy, Continuation<? super ResetMfaViewModel$nonAuthCreateMfaSession$1> continuation) {
        super(2, continuation);
        this.this$0 = resetMfaViewModel;
        this.$subdomainStrategy = subdomainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResetMfaViewModel$nonAuthCreateMfaSession$1(this.this$0, this.$subdomainStrategy, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetMfaViewModel$nonAuthCreateMfaSession$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl.setValue(new C32989mnw(C56443yFo.KWHzl(true)));
            C6619aSk c6619aSk = this.this$0.getFieldNames;
            ResetMfaInitiateResponse resetMfaInitiateResponse = (ResetMfaInitiateResponse) this.this$0.copydefault.getValue();
            NonAuthMfaCreateSessionRequest nonAuthMfaCreateSessionRequest = new NonAuthMfaCreateSessionRequest(resetMfaInitiateResponse != null ? resetMfaInitiateResponse.getWorkflowToken() : null);
            SubdomainStrategy subdomainStrategy = this.$subdomainStrategy;
            this.label = 1;
            objKWHzl = c6619aSk.KWHzl(nonAuthMfaCreateSessionRequest, subdomainStrategy, this);
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
        this.this$0.KWHzl.setValue(new C32989mnw(C56443yFo.KWHzl(false)));
        ResetMfaViewModel resetMfaViewModel = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("Error in ResetMfaViewModel related to createMFA session");
            if (thM7380exceptionOrNullimpl instanceof OKServerException) {
                resetMfaViewModel.KWHzl((OKServerException) thM7380exceptionOrNullimpl);
            } else {
                MutableLiveData mutableLiveData = resetMfaViewModel.AEQbTJ;
                String message = thM7380exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = resetMfaViewModel.DbNXlk(C8206ayP.Dialog.DPHNDa);
                }
                mutableLiveData.setValue(new C32989mnw(message));
            }
        }
        ResetMfaViewModel resetMfaViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            MutableLiveData mutableLiveData2 = resetMfaViewModel2.AYXKKw;
            String sessionId = ((NonAuthMfaCreateSessionResponse) objKWHzl).getSessionId();
            if (sessionId == null) {
                sessionId = "";
            }
            mutableLiveData2.setValue(new C32989mnw(sessionId));
        }
        return Unit.INSTANCE;
    }
}
