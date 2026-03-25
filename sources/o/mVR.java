package o;

import com.okinc.dexkline.market.features.alert.data.repo.AlertRemindRepo$queryAlertList$2;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mVR {
    public final CoroutineDispatcher EZpvd;
    public final mVT copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher EZpvd() {
        return this.EZpvd;
    }

    @yCM
    public mVR(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull mVT mvt) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mvt, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = mvt;
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<java.util.List<AlertRemindPo>>> continuation) {
        return BuildersKt.withContext(EZpvd(), new AlertRemindRepo$queryAlertList$2(this, null), continuation);
    }
}
