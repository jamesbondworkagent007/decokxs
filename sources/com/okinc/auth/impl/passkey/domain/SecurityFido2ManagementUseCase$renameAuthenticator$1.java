package com.okinc.auth.impl.passkey.domain;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC32955mnO;
import o.C56391yDq;
import o.C56442yFn;
import o.C5973aGa;
import o.C5986aGn;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2ManagementUseCase$renameAuthenticator$1 extends SuspendLambda implements Function2<FlowCollector<? super AbstractC32955mnO<Unit>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $credentialId;
    final /* synthetic */ String $updatedName;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5973aGa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2ManagementUseCase$renameAuthenticator$1(String str, String str2, C5973aGa c5973aGa, Continuation<? super SecurityFido2ManagementUseCase$renameAuthenticator$1> continuation) {
        super(2, continuation);
        this.$updatedName = str;
        this.$credentialId = str2;
        this.this$0 = c5973aGa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SecurityFido2ManagementUseCase$renameAuthenticator$1 securityFido2ManagementUseCase$renameAuthenticator$1 = new SecurityFido2ManagementUseCase$renameAuthenticator$1(this.$updatedName, this.$credentialId, this.this$0, continuation);
        securityFido2ManagementUseCase$renameAuthenticator$1.L$0 = obj;
        return securityFido2ManagementUseCase$renameAuthenticator$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super AbstractC32955mnO<Unit>> flowCollector, Continuation<? super Unit> continuation) {
        return ((SecurityFido2ManagementUseCase$renameAuthenticator$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        ResponseData responseData;
        AbstractC32955mnO.Activity activity;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            AbstractC32955mnO.TaskDescription taskDescription = new AbstractC32955mnO.TaskDescription();
            this.L$0 = flowCollector2;
            this.label = 1;
            if (flowCollector2.emit(taskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
            flowCollector = flowCollector2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                flowCollector = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    AbstractC32955mnO.ActionBar actionBar = new AbstractC32955mnO.ActionBar(Unit.INSTANCE);
                    this.L$0 = null;
                    this.label = 3;
                    if (flowCollector.emit(actionBar, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    activity = new AbstractC32955mnO.Activity(responseData.getMsg());
                    this.L$0 = null;
                    this.label = 4;
                    if (flowCollector.emit(activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C5986aGn c5986aGn = new C5986aGn(this.$updatedName, this.$credentialId);
        PasskeyApiService passkeyApiService = this.this$0.copydefault;
        this.L$0 = flowCollector;
        this.label = 2;
        obj = passkeyApiService.rename(c5986aGn, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        responseData = (ResponseData) obj;
        if (responseData.getCode() != 0) {
            activity = new AbstractC32955mnO.Activity(responseData.getMsg());
            this.L$0 = null;
            this.label = 4;
            if (flowCollector.emit(activity, this) == objCopydefault) {
            }
        }
        return Unit.INSTANCE;
    }
}
