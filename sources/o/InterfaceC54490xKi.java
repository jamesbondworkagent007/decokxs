package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.dex.biz.data.OKTDexChainInfoModel;
import com.okinc.unify_trade.dex.biz.data.OKTWalletInfo;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: renamed from: o.xKi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC54490xKi {
    public static final java.lang.String BANNER_CACHE_EXPIRY = "86400";
    public static final ActionBar Companion = ActionBar.KWHzl;

    @GET("/priapi/v5/dex/cefi/getWalletAddress")
    AbstractC58185ywX<ResponseData<java.util.List<OKTWalletInfo>>> AEQbTJ();

    @GET("/priapi/v5/public/dex/dex-chains")
    AbstractC58185ywX<ResponseData<java.util.List<OKTDexChainInfoModel>>> EZpvd();

    @GET("/priapi/v5/public/dex/dex-chains")
    java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.List<OKTDexChainInfoModel>>> continuation);

    @GET("/priapi/v5/dex/cefi/getWalletAddress")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<java.util.List<OKTWalletInfo>>> continuation);

    /* JADX INFO: renamed from: o.xKi$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }
    }
}
