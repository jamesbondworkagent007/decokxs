package com.okinc.share.platforms;

import com.okinc.share.bean.SharePlatformComponents;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import o.API;
import o.APK;
import o.C48889ueG;
import o.C49129uii;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class SharePlatformHub$RustSharePlatformHubImpl$getShareComponentConfig$1 extends SuspendLambda implements Function2<ProducerScope<? super SharePlatformComponents>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C49129uii.ActionBar this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePlatformHub$RustSharePlatformHubImpl$getShareComponentConfig$1(C49129uii.ActionBar actionBar, Continuation<? super SharePlatformHub$RustSharePlatformHubImpl$getShareComponentConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SharePlatformHub$RustSharePlatformHubImpl$getShareComponentConfig$1 sharePlatformHub$RustSharePlatformHubImpl$getShareComponentConfig$1 = new SharePlatformHub$RustSharePlatformHubImpl$getShareComponentConfig$1(this.this$0, continuation);
        sharePlatformHub$RustSharePlatformHubImpl$getShareComponentConfig$1.L$0 = obj;
        return sharePlatformHub$RustSharePlatformHubImpl$getShareComponentConfig$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super SharePlatformComponents> producerScope, Continuation<? super Unit> continuation) {
        return ((SharePlatformHub$RustSharePlatformHubImpl$getShareComponentConfig$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProducerScope producerScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            producerScope = (ProducerScope) this.L$0;
            APK apk = this.this$0.copydefault;
            this.L$0 = producerScope;
            this.label = 1;
            obj = apk.AEQbTJ(this);
            if (obj == objCopydefault) {
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
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        SharePlatformComponents sharePlatformComponentsCopydefault = C48889ueG.KWHzl.copydefault((API) obj);
        this.L$0 = null;
        this.label = 2;
        if (producerScope.send(sharePlatformComponentsCopydefault, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
