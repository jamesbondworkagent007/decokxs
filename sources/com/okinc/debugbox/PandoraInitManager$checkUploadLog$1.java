package com.okinc.debugbox;

import com.okinc.base.uploadlog.UploadLogTriggerMethodEnum;
import com.okinc.biz.util.UploadUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C6750aVK;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class PandoraInitManager$checkUploadLog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UploadUtils.UploadType.values().length];
            try {
                iArr[UploadUtils.UploadType.LOG_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadUtils.UploadType.APK_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PandoraInitManager$checkUploadLog$1(Continuation<? super PandoraInitManager$checkUploadLog$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PandoraInitManager$checkUploadLog$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PandoraInitManager$checkUploadLog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C6750aVK c6750aVK = C6750aVK.KWHzl;
            this.label = 1;
            obj = c6750aVK.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        UploadUtils.StateListAnimator stateListAnimator = (UploadUtils.StateListAnimator) obj;
        int i2 = StateListAnimator.copydefault[stateListAnimator.OLrzqt().ordinal()];
        if (i2 == 1) {
            pUU.KWHzl("PandoraInitManager", "checkUploadLog, needUpload is true. start upload, allowMix: " + stateListAnimator.AEQbTJ());
            C6750aVK.uploadLogs$default(C6750aVK.KWHzl, null, false, UploadLogTriggerMethodEnum.APP_LIFECYCLE, stateListAnimator.AEQbTJ(), null, 19, null);
        } else if (i2 == 2) {
            pUU.KWHzl("PandoraInitManager", "checkUploadLog, apk Upload is true. start upload");
            C6750aVK.uploadApk$default(C6750aVK.KWHzl, null, UploadLogTriggerMethodEnum.APK_UPLOAD, 1, null);
        }
        return Unit.INSTANCE;
    }
}
