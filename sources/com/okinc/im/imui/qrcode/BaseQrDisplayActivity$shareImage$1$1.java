package com.okinc.im.imui.qrcode;

import android.view.View;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.image.ImageSource;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35399nuc;
import o.C44124sEe;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class BaseQrDisplayActivity$shareImage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseQrDisplayActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseQrDisplayActivity$shareImage$1$1(BaseQrDisplayActivity baseQrDisplayActivity, Continuation<? super BaseQrDisplayActivity$shareImage$1$1> continuation) {
        super(2, continuation);
        this.this$0 = baseQrDisplayActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseQrDisplayActivity$shareImage$1$1 baseQrDisplayActivity$shareImage$1$1 = new BaseQrDisplayActivity$shareImage$1$1(this.this$0, continuation);
        baseQrDisplayActivity$shareImage$1$1.L$0 = obj;
        return baseQrDisplayActivity$shareImage$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseQrDisplayActivity$shareImage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        BaseQrDisplayActivity baseQrDisplayActivity;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                BaseQrDisplayActivity baseQrDisplayActivity2 = this.this$0;
                Result.Application application = Result.Companion;
                IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
                View viewFIwbmz = baseQrDisplayActivity2.fIwbmz();
                this.L$0 = baseQrDisplayActivity2;
                this.label = 1;
                Object objAEQbTJ = iMImageHelper.AEQbTJ(viewFIwbmz, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                baseQrDisplayActivity = baseQrDisplayActivity2;
                obj = objAEQbTJ;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                baseQrDisplayActivity = (BaseQrDisplayActivity) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            String str = (String) obj;
            ImageShareParams imageShareParamsCreate$default = ImageShareParams.ActionBar.create$default(ImageShareParams.Companion, ImageSource.Companion.EZpvd(str), str, null, 4, null);
            imageShareParamsCreate$default.setTitle(baseQrDisplayActivity.getFieldNames());
            imageShareParamsCreate$default.setBody(baseQrDisplayActivity.fARcdN());
            imageShareParamsCreate$default.setShareFrom("OKIM");
            objM7377constructorimpl = Result.m7377constructorimpl(ShareConfig.ActionBar.create$default(ShareConfig.Companion, imageShareParamsCreate$default, null, 2, null));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.AYXKKw("Failed to share image", thM7380exceptionOrNullimpl);
            C55326xho.toastWithFailedIcon$default(C35399nuc.LoaderManager.fVBECu, 0, 1, (Object) null);
        }
        BaseQrDisplayActivity baseQrDisplayActivity3 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            baseQrDisplayActivity3.EZpvd((ShareConfig) objM7377constructorimpl);
        }
        return Unit.INSTANCE;
    }
}
