package com.okinc.auth.impl.facerecognition.domain;

import com.okinc.auth.api.facerecognition.FacialRecognitionRequest;
import com.okinc.auth.impl.facerecognition.data.FaceRecognitionApiService;
import com.okinc.auth.impl.facerecognition.model.FaceVerifyCreateSessionResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5729aBv;

/* JADX INFO: loaded from: classes3.dex */
public final class FaceRecognitionCreateSessionUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C5729aBv.Activity>, Object> {
    final /* synthetic */ FacialRecognitionRequest $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5729aBv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceRecognitionCreateSessionUseCase$invoke$2(C5729aBv c5729aBv, FacialRecognitionRequest facialRecognitionRequest, Continuation<? super FaceRecognitionCreateSessionUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5729aBv;
        this.$request = facialRecognitionRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FaceRecognitionCreateSessionUseCase$invoke$2 faceRecognitionCreateSessionUseCase$invoke$2 = new FaceRecognitionCreateSessionUseCase$invoke$2(this.this$0, this.$request, continuation);
        faceRecognitionCreateSessionUseCase$invoke$2.L$0 = obj;
        return faceRecognitionCreateSessionUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C5729aBv.Activity> continuation) {
        return ((FaceRecognitionCreateSessionUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5729aBv.Activity.Application application;
        ResponseData responseData;
        FaceVerifyCreateSessionResponse faceVerifyCreateSessionResponse;
        Integer numEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FaceRecognitionApiService faceRecognitionApiService = this.this$0.EZpvd;
                String strOLrzqt = this.$request.OLrzqt();
                int id = this.$request.copydefault().getId();
                String strEZpvd = this.$request.EZpvd();
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                this.L$0 = coroutineScope;
                this.label = 1;
                obj = faceRecognitionApiService.EZpvd(strOLrzqt, id, strEZpvd, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            responseData = (ResponseData) obj;
        } catch (Exception e) {
            application = new C5729aBv.Activity.Application(e.getMessage());
        }
        if (responseData.getCode() == 0 && responseData.getData() != null && (faceVerifyCreateSessionResponse = (FaceVerifyCreateSessionResponse) responseData.getData()) != null) {
            FaceVerifyCreateSessionResponse faceVerifyCreateSessionResponse2 = (FaceVerifyCreateSessionResponse) responseData.getData();
            if (faceVerifyCreateSessionResponse2 != null && (numEZpvd = faceVerifyCreateSessionResponse2.EZpvd()) != null && numEZpvd.intValue() > 0) {
                return new C5729aBv.Activity.ActionBar(faceVerifyCreateSessionResponse);
            }
            return new C5729aBv.Activity.StateListAnimator(faceVerifyCreateSessionResponse);
        }
        application = new C5729aBv.Activity.Application(responseData.getMsg());
        return application;
    }
}
