package o;

import com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendComponent;
import com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendInfoBean;
import com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendReqBean;
import com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendTotalBean;
import com.okinc.lifecycle.impl.net.LifecycleApiRetrofitService;
import com.okinc.lifecycle.impl.serviceImpl.LifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pOu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38169pOu extends AbstractC43215rlA implements pKL {
    public final LifecycleApiRetrofitService EZpvd;
    public final C38069pLb KWHzl;
    public final Function1<TokenRecommendInfoBean, AbstractC32996moC> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendInfoBean, ? extends o.moC> */
    /* JADX WARN: Multi-variable type inference failed */
    public C38169pOu(@NotNull LifecycleApiRetrofitService lifecycleApiRetrofitService, @NotNull C38069pLb c38069pLb, @NotNull Function1<? super TokenRecommendInfoBean, ? extends AbstractC32996moC> function1) {
        Intrinsics.checkNotNullParameter(lifecycleApiRetrofitService, "");
        Intrinsics.checkNotNullParameter(c38069pLb, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = lifecycleApiRetrofitService;
        this.KWHzl = c38069pLb;
        this.copydefault = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x0034, B:23:0x0075, B:25:0x007d, B:27:0x0083, B:28:0x0090), top: B:47:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull TokenRecommendComponent tokenRecommendComponent, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        LifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1 lifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1;
        TokenRecommendReqBean tokenRecommendReqBeanKWHzl;
        C38169pOu c38169pOu;
        TokenRecommendReqBean tokenRecommendReqBean;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof LifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1) {
            lifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1 = (LifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1) continuation;
            int i = lifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                lifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1 = new LifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1(this, continuation);
            }
        }
        java.lang.Object recommendTokensSuspend = lifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = lifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(recommendTokensSuspend);
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String upperCase = str2.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            java.lang.String upperCase2 = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "");
            tokenRecommendReqBeanKWHzl = this.KWHzl.KWHzl(tokenRecommendComponent, upperCase, upperCase2);
            try {
                LifecycleApiRetrofitService lifecycleApiRetrofitService = this.EZpvd;
                lifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1.L$0 = this;
                lifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1.L$1 = tokenRecommendReqBeanKWHzl;
                lifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1.label = 1;
                recommendTokensSuspend = lifecycleApiRetrofitService.getRecommendTokensSuspend(tokenRecommendReqBeanKWHzl, lifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1);
                if (recommendTokensSuspend == objCopydefault) {
                    return objCopydefault;
                }
                c38169pOu = this;
                tokenRecommendReqBean = tokenRecommendReqBeanKWHzl;
                responseData = (ResponseData) recommendTokensSuspend;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th) {
                th = th;
                c38169pOu = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                TokenRecommendReqBean tokenRecommendReqBean2 = tokenRecommendReqBeanKWHzl;
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                tokenRecommendReqBean = tokenRecommendReqBean2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tokenRecommendReqBean = (TokenRecommendReqBean) lifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1.L$1;
            c38169pOu = (C38169pOu) lifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1.L$0;
            try {
                C56391yDq.AEQbTJ(recommendTokensSuspend);
                responseData = (ResponseData) recommendTokensSuspend;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                tokenRecommendReqBeanKWHzl = tokenRecommendReqBean;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                TokenRecommendReqBean tokenRecommendReqBean22 = tokenRecommendReqBeanKWHzl;
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                tokenRecommendReqBean = tokenRecommendReqBean22;
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            TokenRecommendTotalBean tokenRecommendTotalBean = (TokenRecommendTotalBean) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            if (C33129mqd.KWHzl((java.util.Collection) tokenRecommendTotalBean.KWHzl())) {
                c38169pOu.KWHzl.AEQbTJ(tokenRecommendReqBean, tokenRecommendTotalBean);
            }
        }
        TokenRecommendTotalBean tokenRecommendTotalBean2 = (TokenRecommendTotalBean) actionBar.copydefault();
        return C56443yFo.KWHzl(C33129mqd.KWHzl((java.util.Collection) (tokenRecommendTotalBean2 != null ? tokenRecommendTotalBean2.KWHzl() : null)));
    }
}
