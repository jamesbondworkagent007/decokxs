package com.okinc.lifecycle.impl.business.recommend.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendInfoBean;
import com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendReqBean;
import com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendTotalBean;
import com.okinc.lifecycle.impl.net.LifecycleApiRetrofitService;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C38072pLe;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.pKZ;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class TokenRecommendViewModel$setup$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenRecommendInfoBean $infoBean;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C38072pLe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenRecommendViewModel$setup$2(C38072pLe c38072pLe, TokenRecommendInfoBean tokenRecommendInfoBean, LifecycleOwner lifecycleOwner, Continuation<? super TokenRecommendViewModel$setup$2> continuation) {
        super(2, continuation);
        this.this$0 = c38072pLe;
        this.$infoBean = tokenRecommendInfoBean;
        this.$lifecycleOwner = lifecycleOwner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TokenRecommendViewModel$setup$2 tokenRecommendViewModel$setup$2 = new TokenRecommendViewModel$setup$2(this.this$0, this.$infoBean, this.$lifecycleOwner, continuation);
        tokenRecommendViewModel$setup$2.L$0 = obj;
        return tokenRecommendViewModel$setup$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenRecommendViewModel$setup$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Type inference failed for: r14v8, types: [o.pLb] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendReqBean] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r3;
        AbstractC43419rot actionBar;
        C38072pLe c38072pLe;
        TokenRecommendTotalBean tokenRecommendTotalBean;
        ?? r32;
        TokenRecommendReqBean tokenRecommendReqBeanKWHzl;
        AbstractC43419rot actionBar2;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r1 = this.label;
        try {
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            r3 = r1;
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (r1 == 0) {
            C56391yDq.AEQbTJ(obj);
            tokenRecommendReqBeanKWHzl = this.this$0.valueOf.KWHzl(this.$infoBean.getComponentType(), this.$infoBean.getToken(), this.$infoBean.getTokenPair());
            LifecycleApiRetrofitService lifecycleApiRetrofitService = this.this$0.AEQbTJ;
            this.L$0 = tokenRecommendReqBeanKWHzl;
            this.label = 1;
            obj = lifecycleApiRetrofitService.getRecommendTokensSuspend(tokenRecommendReqBeanKWHzl, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (r1 != 1) {
                if (r1 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tokenRecommendTotalBean = (TokenRecommendTotalBean) this.L$3;
                actionBar = (AbstractC43419rot) this.L$2;
                c38072pLe = (C38072pLe) this.L$1;
                TokenRecommendReqBean tokenRecommendReqBean = (TokenRecommendReqBean) this.L$0;
                C56391yDq.AEQbTJ(obj);
                r32 = tokenRecommendReqBean;
                c38072pLe.valueOf.AEQbTJ(r32, tokenRecommendTotalBean);
                C38072pLe c38072pLe2 = this.this$0;
                if (actionBar instanceof AbstractC43419rot.ActionBar) {
                    OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl();
                    c38072pLe2.copydefault.setValue(new pKZ(null, null, 3, null));
                    pUU.copydefault(c38072pLe2.EZpvd, "getRecommendTokensSuspend error: " + oKServerException);
                }
                return Unit.INSTANCE;
            }
            tokenRecommendReqBeanKWHzl = (TokenRecommendReqBean) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        ResponseData responseData = (ResponseData) obj;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            actionBar2 = new AbstractC43419rot.StateListAnimator(data);
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        }
        r3 = tokenRecommendReqBeanKWHzl;
        actionBar = actionBar2;
        c38072pLe = this.this$0;
        LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            TokenRecommendTotalBean tokenRecommendTotalBean2 = (TokenRecommendTotalBean) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            this.L$0 = r3;
            this.L$1 = c38072pLe;
            this.L$2 = actionBar;
            this.L$3 = tokenRecommendTotalBean2;
            this.label = 2;
            if (c38072pLe.EZpvd(tokenRecommendTotalBean2, lifecycleOwner, this) == objCopydefault) {
                return objCopydefault;
            }
            tokenRecommendTotalBean = tokenRecommendTotalBean2;
            r32 = r3;
            c38072pLe.valueOf.AEQbTJ(r32, tokenRecommendTotalBean);
        }
        C38072pLe c38072pLe22 = this.this$0;
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
