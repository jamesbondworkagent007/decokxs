package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.crcore.coreapi.net.responsebean.AnnounceDetailResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.CoinDataInfoResponseBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.mDk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31774mDk {
    public static final ActionBar Companion = ActionBar.OLrzqt;

    @GET("/v2/support/info/announce/detail")
    java.lang.Object EZpvd(@NotNull @Query("projectName") java.lang.String str, @Header("Cache-Strategy") @NotNull java.lang.String str2, @Header("Cache-Expire") int i, @NotNull Continuation<? super ResponseData<AnnounceDetailResponseBean>> continuation);

    @GET("/v2/support/info/announce/coinDataInfo")
    java.lang.Object KWHzl(@NotNull @Query("projectName") java.lang.String str, @Header("Cache-Strategy") @NotNull java.lang.String str2, @Header("Cache-Expire") int i, @NotNull Continuation<? super ResponseData<CoinDataInfoResponseBean>> continuation);

    /* JADX INFO: renamed from: o.mDk$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ java.lang.Object getAnnounceDetail$default(InterfaceC31774mDk interfaceC31774mDk, java.lang.String str, java.lang.String str2, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAnnounceDetail");
            }
            if ((i2 & 4) != 0) {
                i = RemoteMessageConst.DEFAULT_TTL;
            }
            return interfaceC31774mDk.EZpvd(str, str2, i, continuation);
        }

        public static /* synthetic */ java.lang.Object getCoinDataInfo$default(InterfaceC31774mDk interfaceC31774mDk, java.lang.String str, java.lang.String str2, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCoinDataInfo");
            }
            if ((i2 & 4) != 0) {
                i = 7200;
            }
            return interfaceC31774mDk.KWHzl(str, str2, i, continuation);
        }
    }

    /* JADX INFO: renamed from: o.mDk$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar OLrzqt = new ActionBar();

        private ActionBar() {
        }
    }
}
