package com.okinc.auth.impl.passkey.domain;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse;
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

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2ManagementUseCase$getAuthenticatorList$1 extends SuspendLambda implements Function2<FlowCollector<? super AbstractC32955mnO<GetAuthenticatorListResponse>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5973aGa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2ManagementUseCase$getAuthenticatorList$1(C5973aGa c5973aGa, Continuation<? super SecurityFido2ManagementUseCase$getAuthenticatorList$1> continuation) {
        super(2, continuation);
        this.this$0 = c5973aGa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SecurityFido2ManagementUseCase$getAuthenticatorList$1 securityFido2ManagementUseCase$getAuthenticatorList$1 = new SecurityFido2ManagementUseCase$getAuthenticatorList$1(this.this$0, continuation);
        securityFido2ManagementUseCase$getAuthenticatorList$1.L$0 = obj;
        return securityFido2ManagementUseCase$getAuthenticatorList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super AbstractC32955mnO<GetAuthenticatorListResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return ((SecurityFido2ManagementUseCase$getAuthenticatorList$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        AbstractC32955mnO.ActionBar actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r1 = this.label;
        try {
        } catch (Exception e) {
            AbstractC32955mnO.Activity activity = new AbstractC32955mnO.Activity(e.getMessage());
            this.L$0 = null;
            this.label = 4;
            if (r1.emit(activity, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        if (r1 == 0) {
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
            if (r1 != 1) {
                if (r1 == 2) {
                    flowCollector = (FlowCollector) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    actionBar = new AbstractC32955mnO.ActionBar(((ResponseData) obj).getData());
                    this.L$0 = flowCollector;
                    this.label = 3;
                    if (flowCollector.emit(actionBar, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                if (r1 == 3) {
                    C56391yDq.AEQbTJ(obj);
                } else {
                    if (r1 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        PasskeyApiService passkeyApiService = this.this$0.copydefault;
        this.L$0 = flowCollector;
        this.label = 2;
        obj = passkeyApiService.getAuthenticatorList(this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        actionBar = new AbstractC32955mnO.ActionBar(((ResponseData) obj).getData());
        this.L$0 = flowCollector;
        this.label = 3;
        if (flowCollector.emit(actionBar, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
