package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.crcore.coreapi.net.responsebean.FollowRankListResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.FollowerListResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.SectorListResponseBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.mDi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31772mDi {
    public static final StateListAnimator Companion = StateListAnimator.AEQbTJ;

    @GET("priapi/v5/ecotrade/public/spot/follow-rank")
    java.lang.Object AEQbTJ(@Query("latestNum") int i, @Query("size") int i2, @Query(TtmlNode.START) int i3, @Query("instNumLimit") int i4, @NotNull Continuation<? super ResponseData<java.util.List<FollowRankListResponseBean>>> continuation);

    @GET("priapi/v5/ecotrade/public/marketplace/sector-list-v2")
    java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<java.util.List<SectorListResponseBean>>> continuation);

    @GET("priapi/v5/ecotrade/spot/public/trader/follower-list")
    java.lang.Object KWHzl(@NotNull @Query("uniqueName") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<FollowerListResponseBean>>> continuation);

    /* JADX INFO: renamed from: o.mDi$StateListAnimator */
    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
        }
    }
}
