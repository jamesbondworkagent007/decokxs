package o;

import com.okinc.business.dex.api.bean.ChainListInfo;
import com.okinc.business.dexlogic.bean.CandleResultBean;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.FaqSwapBean;
import com.okinc.localization2.bean.server.AppLanguage;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.huK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC23228huK {
    public static final StateListAnimator Companion = StateListAnimator.EZpvd;

    @GET("/priapi/v1/dx/public/app/swap/chain/list")
    AbstractC58185ywX<ResponseData<java.util.List<DefiChainInfo>>> AEQbTJ(@NotNull @Query("businessLine") java.lang.String str);

    @GET("/priapi/v1/dx/market/kLine/infos")
    AbstractC58185ywX<ResponseData<CandleResultBean>> EZpvd(@NotNull @Query("fromChainId") java.lang.String str, @NotNull @Query("fromTokenAddress") java.lang.String str2, @NotNull @Query("toChainId") java.lang.String str3, @NotNull @Query("toTokenAddress") java.lang.String str4, @NotNull @Query("scale") java.lang.String str5);

    @GET("/priapi/v1/dx/trade/multi/business/chain/list")
    AbstractC58185ywX<ResponseData<ChainListInfo>> KWHzl();

    @GET("/priapi/v1/assistant/service-center/simple-faq")
    AbstractC58185ywX<ResponseData<FaqSwapBean>> KWHzl(@Header("locale") @NotNull java.lang.String str, @NotNull @Query(AppLanguage.KEY_FALLBACK) java.lang.String str2, @NotNull @Query("category") java.lang.String str3);

    @GET("/priapi/v1/dx/trade/bridge/chain/list")
    AbstractC58185ywX<ResponseData<java.util.List<DefiChainInfo>>> OLrzqt(@NotNull @Query("businessLine") java.lang.String str);

    /* JADX INFO: renamed from: o.huK$StateListAnimator */
    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator EZpvd = new StateListAnimator();

        private StateListAnimator() {
        }

        public final InterfaceC23228huK KWHzl(@NotNull C43280rmM c43280rmM) {
            Intrinsics.checkNotNullParameter(c43280rmM, "");
            return (InterfaceC23228huK) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC23228huK.class), c43280rmM);
        }
    }
}
