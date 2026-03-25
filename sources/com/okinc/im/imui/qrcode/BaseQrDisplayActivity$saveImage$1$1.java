package com.okinc.im.imui.qrcode;

import android.net.Uri;
import android.view.View;
import com.okinc.im.imui.utils.IMImageHelper;
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
public final class BaseQrDisplayActivity$saveImage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseQrDisplayActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseQrDisplayActivity$saveImage$1$1(BaseQrDisplayActivity baseQrDisplayActivity, Continuation<? super BaseQrDisplayActivity$saveImage$1$1> continuation) {
        super(2, continuation);
        this.this$0 = baseQrDisplayActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseQrDisplayActivity$saveImage$1$1 baseQrDisplayActivity$saveImage$1$1 = new BaseQrDisplayActivity$saveImage$1$1(this.this$0, continuation);
        baseQrDisplayActivity$saveImage$1$1.L$0 = obj;
        return baseQrDisplayActivity$saveImage$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseQrDisplayActivity$saveImage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:6:0x000f, B:20:0x004e, B:22:0x0052, B:23:0x0059, B:24:0x0060, B:11:0x001f, B:17:0x003f, B:14:0x002c), top: B:35:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:6:0x000f, B:20:0x004e, B:22:0x0052, B:23:0x0059, B:24:0x0060, B:11:0x001f, B:17:0x003f, B:14:0x002c), top: B:35:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        BaseQrDisplayActivity baseQrDisplayActivity;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            baseQrDisplayActivity = this.this$0;
            Result.Application application2 = Result.Companion;
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            View viewFIwbmz = baseQrDisplayActivity.fIwbmz();
            this.L$0 = baseQrDisplayActivity;
            this.label = 1;
            obj = iMImageHelper.AEQbTJ(viewFIwbmz, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                if (((Uri) obj) == null) {
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        C44124sEe.AYXKKw("Failed to save image", thM7380exceptionOrNullimpl);
                        C55326xho.toastWithFailedIcon$default(C35399nuc.LoaderManager.fVBECu, 0, 1, (Object) null);
                    }
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                        C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.hCLrkq, 0, 1, (Object) null);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalArgumentException("Image copy failed");
            }
            baseQrDisplayActivity = (BaseQrDisplayActivity) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        IMImageHelper iMImageHelper2 = IMImageHelper.OLrzqt;
        this.L$0 = null;
        this.label = 2;
        obj = iMImageHelper2.copydefault(baseQrDisplayActivity, (String) obj, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        if (((Uri) obj) == null) {
        }
    }
}
