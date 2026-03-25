package com.okinc.okex.common.net.interceptors;

import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.okex.common.bean.SiteInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45309snP;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes23.dex */
public final class HandleWrongSiteInterceptor$intercept$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response>, Object> {
    final /* synthetic */ Interceptor.Chain $chain;
    final /* synthetic */ Request $request;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleWrongSiteInterceptor$intercept$1(Request request, Interceptor.Chain chain, Continuation<? super HandleWrongSiteInterceptor$intercept$1> continuation) {
        super(2, continuation);
        this.$request = request;
        this.$chain = chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HandleWrongSiteInterceptor$intercept$1(this.$request, this.$chain, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response> continuation) {
        return ((HandleWrongSiteInterceptor$intercept$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45309snP c45309snP = C45309snP.copydefault;
            SiteInfoBean siteInfoBeanOLrzqt = c45309snP.OLrzqt();
            this.label = 1;
            obj = c45309snP.KWHzl(siteInfoBeanOLrzqt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        SubdomainStrategy subdomainStrategy = (SubdomainStrategy) obj;
        pUU.KWHzl("SupportHandleWrongSiteInterceptor", "[" + this.$request.url() + "]: newStrategy=" + subdomainStrategy);
        Request.Builder builderNewBuilder = this.$request.newBuilder();
        builderNewBuilder.header("Subdomain-Strategy", subdomainStrategy.toString());
        return this.$chain.proceed(builderNewBuilder.build());
    }
}
