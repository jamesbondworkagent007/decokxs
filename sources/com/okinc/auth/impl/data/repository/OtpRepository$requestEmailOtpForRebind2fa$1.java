package com.okinc.auth.impl.data.repository;

import com.google.gson.reflect.TypeToken;
import com.okinc.account.api.model.security.otp.Otp;
import com.okinc.account.api.model.security.otp.OtpError;
import com.okinc.auth.api.reset2fa.data.model.SendEmailCodeForRebind2faRequest;
import com.okinc.auth.impl.reset2fa.data.datasource.Reset2faRemoteDataSource;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.json.Json;
import o.C43284rmQ;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C6737aUy;
import o.C8211ayU;

/* JADX INFO: loaded from: classes3.dex */
public final class OtpRepository$requestEmailOtpForRebind2fa$1 extends SuspendLambda implements Function2<FlowCollector<? super Otp>, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $behavior;
    final /* synthetic */ String $email;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    final /* synthetic */ String $token;
    final /* synthetic */ String $uuid;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C8211ayU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpRepository$requestEmailOtpForRebind2fa$1(C8211ayU c8211ayU, SubdomainStrategy subdomainStrategy, int i, String str, String str2, String str3, Continuation<? super OtpRepository$requestEmailOtpForRebind2fa$1> continuation) {
        super(2, continuation);
        this.this$0 = c8211ayU;
        this.$subdomainStrategy = subdomainStrategy;
        this.$behavior = i;
        this.$email = str;
        this.$token = str2;
        this.$uuid = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OtpRepository$requestEmailOtpForRebind2fa$1 otpRepository$requestEmailOtpForRebind2fa$1 = new OtpRepository$requestEmailOtpForRebind2fa$1(this.this$0, this.$subdomainStrategy, this.$behavior, this.$email, this.$token, this.$uuid, continuation);
        otpRepository$requestEmailOtpForRebind2fa$1.L$0 = obj;
        return otpRepository$requestEmailOtpForRebind2fa$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Otp> flowCollector, Continuation<? super Unit> continuation) {
        return ((OtpRepository$requestEmailOtpForRebind2fa$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x0008 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ResponseData responseData;
        ?? r1;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r12 = this.label;
        try {
        } catch (OKServerException e) {
            if (e.getCode() != -1) {
                try {
                    Object objFromJson = C6737aUy.OLrzqt().fromJson(e.getResponse(), TypeToken.getParameterized(ResponseData.class, Unit.class).getType());
                    Intrinsics.copydefault(objFromJson);
                    responseData = (ResponseData) objFromJson;
                    r1 = r12;
                } catch (Throwable unused) {
                    Json jsonKWHzl = C43284rmQ.KWHzl();
                    String strValueOf = String.valueOf(e.getResponse());
                    jsonKWHzl.getSerializersModule();
                    responseData = (ResponseData) jsonKWHzl.decodeFromString(ResponseData.Companion.serializer(UnitSerializer.INSTANCE), strValueOf);
                    r1 = r12;
                }
            } else {
                throw e;
            }
        }
        if (r12 == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            C8211ayU c8211ayU = this.this$0;
            SubdomainStrategy subdomainStrategy = this.$subdomainStrategy;
            int i = this.$behavior;
            String str = this.$email;
            String str2 = this.$token;
            String str3 = this.$uuid;
            Reset2faRemoteDataSource reset2faRemoteDataSource = c8211ayU.copydefault;
            SendEmailCodeForRebind2faRequest sendEmailCodeForRebind2faRequest = new SendEmailCodeForRebind2faRequest(C56443yFo.AEQbTJ(i), str, str2, str3);
            this.L$0 = flowCollector;
            this.label = 1;
            obj = reset2faRemoteDataSource.sendEmailOtp(subdomainStrategy, sendEmailCodeForRebind2faRequest, this);
            r12 = flowCollector;
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (r12 != 1) {
                if (r12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            r12 = flowCollector2;
        }
        responseData = (ResponseData) obj;
        r1 = r12;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Otp otp = new Otp(responseData.getCode());
            this.L$0 = null;
            this.label = 2;
            if (r1.emit(otp, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        throw new OtpError(responseData.getCode(), responseData.getMsg());
    }
}
