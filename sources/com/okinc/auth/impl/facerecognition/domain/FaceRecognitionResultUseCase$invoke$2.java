package com.okinc.auth.impl.facerecognition.domain;

import com.okinc.auth.api.facerecognition.FacialRecognitionRequest;
import com.okinc.auth.impl.facerecognition.data.FaceRecognitionApiService;
import com.okinc.auth.impl.facerecognition.model.FaceRecognitionResultRequest;
import com.okinc.auth.impl.facerecognition.model.FaceRecognitionResultResponse;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5731aBx;

/* JADX INFO: loaded from: classes3.dex */
public final class FaceRecognitionResultUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C5731aBx.Application>, Object> {
    final /* synthetic */ FacialRecognitionRequest $faceRecognitionRequest;
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ C5731aBx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceRecognitionResultUseCase$invoke$2(FacialRecognitionRequest facialRecognitionRequest, String str, C5731aBx c5731aBx, Continuation<? super FaceRecognitionResultUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$faceRecognitionRequest = facialRecognitionRequest;
        this.$sessionId = str;
        this.this$0 = c5731aBx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FaceRecognitionResultUseCase$invoke$2(this.$faceRecognitionRequest, this.$sessionId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C5731aBx.Application> continuation) {
        return ((FaceRecognitionResultUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object c0812Application;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                int id = this.$faceRecognitionRequest.copydefault().getId();
                String str = this.$sessionId;
                String strEZpvd = this.$faceRecognitionRequest.EZpvd();
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                FaceRecognitionResultRequest faceRecognitionResultRequest = new FaceRecognitionResultRequest(id, str, strEZpvd, (String) null, (String) null, (String) null, (String) null, 120, (DefaultConstructorMarker) null);
                FaceRecognitionApiService faceRecognitionApiService = this.this$0.copydefault;
                String strOLrzqt = this.$faceRecognitionRequest.OLrzqt();
                this.label = 1;
                obj = faceRecognitionApiService.AEQbTJ(strOLrzqt, faceRecognitionResultRequest, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            C5731aBx c5731aBx = this.this$0;
            FaceRecognitionResultResponse faceRecognitionResultResponse = (FaceRecognitionResultResponse) responseData.getData();
            return c5731aBx.OLrzqt(responseData, faceRecognitionResultResponse != null ? faceRecognitionResultResponse.EZpvd() : null);
        } catch (OKServerException e) {
            c0812Application = new C5731aBx.Application.TaskDescription(e.getMessage());
            return c0812Application;
        } catch (Exception e2) {
            c0812Application = new C5731aBx.Application.C0812Application(e2.getMessage());
            return c0812Application;
        }
    }
}
