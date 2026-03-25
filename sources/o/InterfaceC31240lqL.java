package o;

import com.okinc.business.web3pay.lib.features.campaign.model.CampaignGuideResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: renamed from: o.lqL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31240lqL {
    @GET("/priapi/v5/reward-earn/campaign/guide")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<CampaignGuideResponse>> continuation);
}
