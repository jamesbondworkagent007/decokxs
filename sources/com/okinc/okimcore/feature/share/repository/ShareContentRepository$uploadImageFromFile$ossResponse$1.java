package com.okinc.okimcore.feature.share.repository;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMUploadMediaService;
import com.okinc.okimcore.model.remote.UploadMediaResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C44382sNt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import okhttp3.MultipartBody;

/* JADX INFO: loaded from: classes10.dex */
public final class ShareContentRepository$uploadImageFromFile$ossResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UploadMediaResponse>, Object> {
    final /* synthetic */ MultipartBody.Part $multipartBody;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44382sNt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareContentRepository$uploadImageFromFile$ossResponse$1(C44382sNt c44382sNt, MultipartBody.Part part, Continuation<? super ShareContentRepository$uploadImageFromFile$ossResponse$1> continuation) {
        super(2, continuation);
        this.this$0 = c44382sNt;
        this.$multipartBody = part;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShareContentRepository$uploadImageFromFile$ossResponse$1 shareContentRepository$uploadImageFromFile$ossResponse$1 = new ShareContentRepository$uploadImageFromFile$ossResponse$1(this.this$0, this.$multipartBody, continuation);
        shareContentRepository$uploadImageFromFile$ossResponse$1.L$0 = obj;
        return shareContentRepository$uploadImageFromFile$ossResponse$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UploadMediaResponse> continuation) {
        return ((ShareContentRepository$uploadImageFromFile$ossResponse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C44382sNt c44382sNt = this.this$0;
                MultipartBody.Part part = this.$multipartBody;
                InHouseIMUploadMediaService inHouseIMUploadMediaService = c44382sNt.KWHzl;
                this.label = 1;
                obj = InHouseIMUploadMediaService.Application.uploadMediaWithoutChannel$default(inHouseIMUploadMediaService, part, null, null, this, 6, null);
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
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        return actionBar.AEQbTJ();
    }
}
