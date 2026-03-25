package com.okinc.auth.impl.reset2fa.domain.reset2fa;

import com.google.gson.reflect.TypeToken;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateRequest;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateResponse;
import com.okinc.auth.impl.reset2fa.data.datasource.Reset2faRemoteDataSource;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import o.C43284rmQ;
import o.C56391yDq;
import o.C56442yFn;
import o.C6624aSp;
import o.C6737aUy;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetMfaInitiateUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C6624aSp.Application>, Object> {
    final /* synthetic */ ResetMfaInitiateRequest $initiateRequest;
    final /* synthetic */ boolean $isForgetPasswordFlowReset;
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6624aSp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetMfaInitiateUseCase$invoke$2(boolean z, C6624aSp c6624aSp, SubdomainStrategy subdomainStrategy, ResetMfaInitiateRequest resetMfaInitiateRequest, Continuation<? super ResetMfaInitiateUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$isForgetPasswordFlowReset = z;
        this.this$0 = c6624aSp;
        this.$subdomainStrategy = subdomainStrategy;
        this.$initiateRequest = resetMfaInitiateRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ResetMfaInitiateUseCase$invoke$2 resetMfaInitiateUseCase$invoke$2 = new ResetMfaInitiateUseCase$invoke$2(this.$isForgetPasswordFlowReset, this.this$0, this.$subdomainStrategy, this.$initiateRequest, continuation);
        resetMfaInitiateUseCase$invoke$2.L$0 = obj;
        return resetMfaInitiateUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C6624aSp.Application> continuation) {
        return ((ResetMfaInitiateUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ResponseData responseData;
        ResponseData responseData2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
                try {
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        if (this.$isForgetPasswordFlowReset) {
                            C6624aSp c6624aSp = this.this$0;
                            SubdomainStrategy subdomainStrategy = this.$subdomainStrategy;
                            ResetMfaInitiateRequest resetMfaInitiateRequest = this.$initiateRequest;
                            Reset2faRemoteDataSource reset2faRemoteDataSource = c6624aSp.copydefault;
                            this.label = 1;
                            obj = reset2faRemoteDataSource.nonAuthReset2faInitiateV2(subdomainStrategy, resetMfaInitiateRequest, this);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            responseData = (ResponseData) obj;
                        } else {
                            C6624aSp c6624aSp2 = this.this$0;
                            SubdomainStrategy subdomainStrategy2 = this.$subdomainStrategy;
                            ResetMfaInitiateRequest resetMfaInitiateRequest2 = this.$initiateRequest;
                            Reset2faRemoteDataSource reset2faRemoteDataSource2 = c6624aSp2.copydefault;
                            this.label = 2;
                            obj = reset2faRemoteDataSource2.reset2faInitiate(subdomainStrategy2, resetMfaInitiateRequest2, this);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            responseData = (ResponseData) obj;
                        }
                    } else if (i == 1) {
                        C56391yDq.AEQbTJ(obj);
                        responseData = (ResponseData) obj;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        responseData = (ResponseData) obj;
                    }
                } catch (OKServerException e) {
                    if (e.getCode() != -1) {
                        try {
                            Object objFromJson = C6737aUy.OLrzqt().fromJson(e.getResponse(), TypeToken.getParameterized(ResponseData.class, ResetMfaInitiateResponse.class).getType());
                            Intrinsics.copydefault(objFromJson);
                            responseData2 = (ResponseData) objFromJson;
                            responseData = responseData2;
                        } catch (Throwable unused) {
                            Json jsonKWHzl = C43284rmQ.KWHzl();
                            String strValueOf = String.valueOf(e.getResponse());
                            jsonKWHzl.getSerializersModule();
                            responseData = (ResponseData) jsonKWHzl.decodeFromString(ResponseData.Companion.serializer(ResetMfaInitiateResponse.Companion.serializer()), strValueOf);
                        }
                    } else {
                        throw e;
                    }
                }
            } catch (OKServerException e2) {
                if (e2.getCode() != -1) {
                    try {
                        Object objFromJson2 = C6737aUy.OLrzqt().fromJson(e2.getResponse(), TypeToken.getParameterized(ResponseData.class, ResetMfaInitiateResponse.class).getType());
                        Intrinsics.copydefault(objFromJson2);
                        responseData2 = (ResponseData) objFromJson2;
                        responseData = responseData2;
                    } catch (Throwable unused2) {
                        Json jsonKWHzl2 = C43284rmQ.KWHzl();
                        String strValueOf2 = String.valueOf(e2.getResponse());
                        jsonKWHzl2.getSerializersModule();
                        responseData = (ResponseData) jsonKWHzl2.decodeFromString(ResponseData.Companion.serializer(ResetMfaInitiateResponse.Companion.serializer()), strValueOf2);
                    }
                } else {
                    throw e2;
                }
            }
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                return new C6624aSp.Application.Activity((ResetMfaInitiateResponse) responseData.getData());
            }
            if (responseData.getCode() == 33000) {
                return new C6624aSp.Application.StateListAnimator(responseData.getMsg());
            }
            if (responseData.getCode() == 429) {
                return C6624aSp.Application.C0822Application.AEQbTJ;
            }
            return new C6624aSp.Application.ActionBar(responseData.getMsg(), responseData.getCode());
        } catch (Exception e3) {
            String message = e3.getMessage();
            if (message == null) {
                message = "";
            }
            return new C6624aSp.Application.TaskDescription(message);
        }
    }
}
