package com.okinc.okex.common.net.interceptors;

import com.okinc.okex.common.bean.SiteInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45311snR;
import o.C56391yDq;
import o.C56442yFn;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes23.dex */
public final class HandleWrongSiteInterceptor$intercept$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response>, Object> {
    final /* synthetic */ Interceptor.Chain $chain;
    final /* synthetic */ Request $request;
    final /* synthetic */ SiteInfoBean $siteInfo;
    int label;
    final /* synthetic */ C45311snR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleWrongSiteInterceptor$intercept$2(C45311snR c45311snR, Interceptor.Chain chain, Request request, SiteInfoBean siteInfoBean, Continuation<? super HandleWrongSiteInterceptor$intercept$2> continuation) {
        super(2, continuation);
        this.this$0 = c45311snR;
        this.$chain = chain;
        this.$request = request;
        this.$siteInfo = siteInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HandleWrongSiteInterceptor$intercept$2(this.this$0, this.$chain, this.$request, this.$siteInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response> continuation) {
        return ((HandleWrongSiteInterceptor$intercept$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45311snR c45311snR = this.this$0;
            Interceptor.Chain chain = this.$chain;
            Request request = this.$request;
            SiteInfoBean siteInfoBean = this.$siteInfo;
            this.label = 1;
            obj = c45311snR.EZpvd(chain, request, siteInfoBean, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
