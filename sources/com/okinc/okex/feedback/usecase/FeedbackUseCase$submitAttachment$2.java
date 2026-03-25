package com.okinc.okex.feedback.usecase;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.feedback.net.FeedbackApiService;
import com.okinc.okex.feedback.net.bean.FileUpload;
import com.okinc.okuser.data.Token;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43292rmY;
import o.C43401rob;
import o.C43422row;
import o.C45618stT;
import o.C56391yDq;
import o.C56442yFn;
import o.C6848aXC;
import o.pUU;
import o.xVW;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedbackUseCase$submitAttachment$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C45618stT.ActionBar>, Object> {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C45618stT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackUseCase$submitAttachment$2(C45618stT c45618stT, File file, Continuation<? super FeedbackUseCase$submitAttachment$2> continuation) {
        super(2, continuation);
        this.this$0 = c45618stT;
        this.$file = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FeedbackUseCase$submitAttachment$2 feedbackUseCase$submitAttachment$2 = new FeedbackUseCase$submitAttachment$2(this.this$0, this.$file, continuation);
        feedbackUseCase$submitAttachment$2.L$0 = obj;
        return feedbackUseCase$submitAttachment$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C45618stT.ActionBar> continuation) {
        return ((FeedbackUseCase$submitAttachment$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C45618stT c45618stT = this.this$0;
                File file = this.$file;
                FeedbackApiService feedbackApiService = c45618stT.AEQbTJ;
                String strFJNWhG = C43292rmY.OLrzqt.fJNWhG();
                Token tokenAhwBna = c45618stT.OLrzqt.AhwBna();
                String value = tokenAhwBna != null ? tokenAhwBna.getValue() : null;
                if (value == null) {
                    value = "";
                }
                String strEZpvd = C6848aXC.EZpvd.EZpvd();
                String strCopydefault = xVW.copydefault();
                if (!(!(strCopydefault == null || StringsKt__StringsKt.fARcdN((CharSequence) strCopydefault)))) {
                    strCopydefault = null;
                }
                MultipartBody.Part partCreateFormData = MultipartBody.Part.Companion.createFormData("file", file.getName(), RequestBody.Companion.create(MediaType.Companion.parse(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE), file));
                this.label = 1;
                obj = feedbackApiService.uploadImage(strFJNWhG, value, strEZpvd, strCopydefault, partCreateFormData, this);
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
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            return new C45618stT.ActionBar.TaskDescription((FileUpload) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            return new C45618stT.ActionBar.Activity((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }
}
