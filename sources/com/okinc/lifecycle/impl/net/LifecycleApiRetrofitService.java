package com.okinc.lifecycle.impl.net;

import com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendReqBean;
import com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendTotalBean;
import com.okinc.lifecycle.impl.net.LifecycleApiRetrofitService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import o.AbstractC58185ywX;
import o.C43417ror;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes9.dex */
public interface LifecycleApiRetrofitService {
    public static final TaskDescription Companion = TaskDescription.AEQbTJ;

    @POST("/priapi/lifecycle/token-rec/v2/tokens")
    AbstractC58185ywX<ResponseData<TokenRecommendTotalBean>> getRecommendTokens(@Body @NotNull TokenRecommendReqBean tokenRecommendReqBean);

    @POST("/priapi/lifecycle/token-rec/v2/tokens")
    Object getRecommendTokensSuspend(@Body @NotNull TokenRecommendReqBean tokenRecommendReqBean, @NotNull Continuation<? super ResponseData<TokenRecommendTotalBean>> continuation);

    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription AEQbTJ = new TaskDescription();
        public static final InterfaceC56387yDm<LifecycleApiRetrofitService> EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.pOr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LifecycleApiRetrofitService.TaskDescription.EZpvd();
            }
        });

        private TaskDescription() {
        }

        public static final LifecycleApiRetrofitService EZpvd() {
            return (LifecycleApiRetrofitService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(LifecycleApiRetrofitService.class));
        }

        public final LifecycleApiRetrofitService OLrzqt() {
            return EZpvd.getValue();
        }

        public final LifecycleApiRetrofitService AEQbTJ() {
            return OLrzqt();
        }
    }
}
