package com.okinc.auth.impl.passkey.ui.management;

import com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.C5982aGj;
import o.InterfaceC33174mrV;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityPasskeyManagementViewModel$initTabAndViewPager$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SecurityPasskeyManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityPasskeyManagementViewModel$initTabAndViewPager$1(SecurityPasskeyManagementViewModel securityPasskeyManagementViewModel, Continuation<? super SecurityPasskeyManagementViewModel$initTabAndViewPager$1> continuation) {
        super(2, continuation);
        this.this$0 = securityPasskeyManagementViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityPasskeyManagementViewModel$initTabAndViewPager$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityPasskeyManagementViewModel$initTabAndViewPager$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        GetAuthenticatorListResponse getAuthenticatorListResponse;
        InterfaceC33174mrV interfaceC33174mrV;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.KWHzl;
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
                    getAuthenticatorListResponse = (GetAuthenticatorListResponse) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    if (getAuthenticatorListResponse != null) {
                        this.this$0.copydefault.setValue(C56443yFo.KWHzl(false));
                    } else {
                        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33174mrV.class));
                        boolean z = (listKWHzl == null || (interfaceC33174mrV = (InterfaceC33174mrV) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null || !interfaceC33174mrV.copydefault()) ? false : true;
                        pUU.AEQbTJ("SecurityPasskeyManagementViewModel isSupportOKXPay: " + z);
                        this.this$0.copydefault.setValue(C56443yFo.KWHzl(z && (getAuthenticatorListResponse.getAuthenticators().isEmpty() ^ true)));
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                    objAEQbTJ = null;
                }
                GetAuthenticatorListResponse getAuthenticatorListResponse2 = (GetAuthenticatorListResponse) objAEQbTJ;
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = getAuthenticatorListResponse2;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
                    return objCopydefault;
                }
                getAuthenticatorListResponse = getAuthenticatorListResponse2;
                if (getAuthenticatorListResponse != null) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5982aGj c5982aGj = this.this$0.valueOf;
        this.label = 2;
        objAEQbTJ = c5982aGj.AEQbTJ(this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
        }
        GetAuthenticatorListResponse getAuthenticatorListResponse22 = (GetAuthenticatorListResponse) objAEQbTJ;
        mutableSharedFlow = this.this$0.KWHzl;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.L$0 = getAuthenticatorListResponse22;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) != objCopydefault) {
        }
    }
}
