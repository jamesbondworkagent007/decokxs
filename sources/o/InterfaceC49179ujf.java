package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.share.bean.ShareChannelsResp;
import com.okinc.share.bean.ShareFooterDecodeInfo;
import com.okinc.share.bean.SharePlatformComponents;
import com.okinc.share.bean.ShortLinkReq;
import com.okinc.share.bean.ShortLinkResp;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.ujf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49179ujf {
    public static final StateListAnimator Companion = StateListAnimator.KWHzl;

    @GET("priapi/v3/growth/mobile/support/common/share-components")
    AbstractC58185ywX<ResponseData<SharePlatformComponents>> AEQbTJ();

    @POST("/priapi/v3/growth/mobile/support/common/create-share-link")
    AbstractC58185ywX<ResponseData<ShortLinkResp>> KWHzl(@Body @NotNull ShortLinkReq shortLinkReq);

    @GET("priapi/v3/growth/mobile/support/common/share-configV3")
    AbstractC58185ywX<ResponseData<ShareChannelsResp>> OLrzqt();

    @GET("/v2/support/universal/link/info")
    AbstractC58185ywX<ResponseData<ShareFooterDecodeInfo>> copydefault(@NotNull @Query("shortCode") java.lang.String str);

    /* JADX INFO: renamed from: o.ujf$StateListAnimator */
    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }

        public final InterfaceC49179ujf AEQbTJ() {
            return (InterfaceC49179ujf) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC49179ujf.class), null, 1, null);
        }
    }
}
