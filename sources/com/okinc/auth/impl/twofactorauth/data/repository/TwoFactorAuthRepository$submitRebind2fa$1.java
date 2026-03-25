package com.okinc.auth.impl.twofactorauth.data.repository;

import com.google.gson.reflect.TypeToken;
import com.okinc.account.api.model.security.otp.TwoFactorAuth;
import com.okinc.auth.api.reset2fa.data.model.SubmitRebindMfaRequest;
import com.okinc.auth.impl.reset2fa.data.datasource.Reset2faRemoteDataSource;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import o.C43284rmQ;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.C6660aTY;
import o.C6737aUy;

/* JADX INFO: loaded from: classes3.dex */
public final class TwoFactorAuthRepository$submitRebind2fa$1 extends SuspendLambda implements Function2<FlowCollector<? super TwoFactorAuth<Object>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $newAreaCode;
    final /* synthetic */ String $newEmail;
    final /* synthetic */ String $newEmailCode;
    final /* synthetic */ String $newPhone;
    final /* synthetic */ String $newPhoneCode;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    final /* synthetic */ String $workflowToken;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6660aTY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoFactorAuthRepository$submitRebind2fa$1(C6660aTY c6660aTY, SubdomainStrategy subdomainStrategy, String str, String str2, String str3, String str4, String str5, String str6, Continuation<? super TwoFactorAuthRepository$submitRebind2fa$1> continuation) {
        super(2, continuation);
        this.this$0 = c6660aTY;
        this.$subdomainStrategy = subdomainStrategy;
        this.$workflowToken = str;
        this.$newAreaCode = str2;
        this.$newPhone = str3;
        this.$newPhoneCode = str4;
        this.$newEmail = str5;
        this.$newEmailCode = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TwoFactorAuthRepository$submitRebind2fa$1 twoFactorAuthRepository$submitRebind2fa$1 = new TwoFactorAuthRepository$submitRebind2fa$1(this.this$0, this.$subdomainStrategy, this.$workflowToken, this.$newAreaCode, this.$newPhone, this.$newPhoneCode, this.$newEmail, this.$newEmailCode, continuation);
        twoFactorAuthRepository$submitRebind2fa$1.L$0 = obj;
        return twoFactorAuthRepository$submitRebind2fa$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super TwoFactorAuth<Object>> flowCollector, Continuation<? super Unit> continuation) {
        return ((TwoFactorAuthRepository$submitRebind2fa$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ResponseData<Object> responseData;
        FlowCollector flowCollector;
        Object objSubmit;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (OKServerException e) {
            if (e.getCode() != -1) {
                try {
                    Object objFromJson = C6737aUy.OLrzqt().fromJson(e.getResponse(), TypeToken.getParameterized(ResponseData.class, Object.class).getType());
                    Intrinsics.copydefault(objFromJson);
                    responseData = (ResponseData) objFromJson;
                } catch (Throwable unused) {
                    Json jsonKWHzl = C43284rmQ.KWHzl();
                    responseData = (ResponseData) jsonKWHzl.decodeFromString(ResponseData.Companion.serializer(SerializersKt.noCompiledSerializer(jsonKWHzl.getSerializersModule(), C56524yIo.AEQbTJ(Object.class))), String.valueOf(e.getResponse()));
                }
            } else {
                throw e;
            }
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            C6660aTY c6660aTY = this.this$0;
            SubdomainStrategy subdomainStrategy = this.$subdomainStrategy;
            String str = this.$workflowToken;
            String str2 = this.$newAreaCode;
            String str3 = this.$newPhone;
            String str4 = this.$newPhoneCode;
            String str5 = this.$newEmail;
            String str6 = this.$newEmailCode;
            Reset2faRemoteDataSource reset2faRemoteDataSource = c6660aTY.AEQbTJ;
            SubmitRebindMfaRequest submitRebindMfaRequest = new SubmitRebindMfaRequest(str, str2, str3, str4, str5, str6, (String) null, (String) null, 192, (DefaultConstructorMarker) null);
            this.L$0 = flowCollector;
            this.label = 1;
            objSubmit = reset2faRemoteDataSource.submit(subdomainStrategy, submitRebindMfaRequest, this);
            if (objSubmit == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objSubmit = obj;
        }
        responseData = (ResponseData) objSubmit;
        TwoFactorAuth<Object> twoFactorAuthAEQbTJ = this.this$0.OLrzqt.AEQbTJ(responseData);
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(twoFactorAuthAEQbTJ, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
