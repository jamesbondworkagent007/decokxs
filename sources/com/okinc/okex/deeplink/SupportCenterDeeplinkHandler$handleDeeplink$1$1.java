package com.okinc.okex.deeplink;

import android.content.Context;
import com.okinc.biz.model.SupportService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C6807aWO;
import o.C6811aWS;
import o.InterfaceC6804aWL;
import o.InterfaceC6817aWY;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportCenterDeeplinkHandler$handleDeeplink$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $entranceId;
    final /* synthetic */ C6807aWO $scRequest;
    final /* synthetic */ InterfaceC6804aWL $service;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportCenterDeeplinkHandler$handleDeeplink$1$1(String str, C6807aWO c6807aWO, InterfaceC6804aWL interfaceC6804aWL, Context context, Continuation<? super SupportCenterDeeplinkHandler$handleDeeplink$1$1> continuation) {
        super(2, continuation);
        this.$entranceId = str;
        this.$scRequest = c6807aWO;
        this.$service = interfaceC6804aWL;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportCenterDeeplinkHandler$handleDeeplink$1$1(this.$entranceId, this.$scRequest, this.$service, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportCenterDeeplinkHandler$handleDeeplink$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C6811aWS c6811aWS = new C6811aWS(this.$entranceId, null, this.$scRequest, null, 10, null);
            InterfaceC6804aWL interfaceC6804aWL = this.$service;
            this.label = 1;
            obj = interfaceC6804aWL.AEQbTJ(c6811aWS, this);
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
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC6817aWY serviceAction = ((SupportService) obj).getServiceAction();
        Context context = this.$context;
        this.label = 2;
        if (serviceAction.OLrzqt(context, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
