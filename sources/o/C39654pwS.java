package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.kline.data.KlineCoinInfo;
import com.okinc.kline.ui.unlock.data.api.KlineUnlockTokenApi;
import com.okinc.kline.ui.unlock.data.po.UnlockProgressInfoPo;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenAllocation;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenEvent;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenSchedule;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.pwS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39654pwS {
    public static final int $stable = 8;
    public final InterfaceC56387yDm httpApi$delegate = C56392yDr.copydefault(new Function0() { // from class: o.pwT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39654pwS.AEQbTJ();
        }
    });

    @yCM
    public C39654pwS() {
    }

    public final KlineUnlockTokenApi KWHzl() {
        return (KlineUnlockTokenApi) this.httpApi$delegate.getValue();
    }

    public static final KlineUnlockTokenApi AEQbTJ() {
        return (KlineUnlockTokenApi) C43417ror.OLrzqt(C56524yIo.AEQbTJ(KlineUnlockTokenApi.class));
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<KlineCoinInfo>> continuation) {
        return KWHzl().getCoinInvestment(str, continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<UnlockProgressInfoPo>> continuation) {
        return KWHzl().queryTokenProgress(str, continuation);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.kline.ui.unlock.data.api.KlineUnlockTokenApi.TaskDescription.queryTokenEvent$default(com.okinc.kline.ui.unlock.data.api.KlineUnlockTokenApi, java.lang.String, java.lang.String, java.lang.Long, int, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    public final java.lang.Object KWHzl(@NotNull @Query("ccy") java.lang.String str, @NotNull @Query("type") java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<UnlockTokenEvent>>> continuation) {
        return KlineUnlockTokenApi.TaskDescription.queryTokenEvent$default(KWHzl(), str, str2, null, 0, continuation, 12, null);
    }

    public final java.lang.Object EZpvd(@NotNull @Query("ccy") java.lang.String str, @NotNull Continuation<? super ResponseData<UnlockTokenAllocation>> continuation) {
        return KWHzl().queryUnlockAllocation(str, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull @Query("ccy") java.lang.String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<UnlockTokenSchedule>>> continuation) {
        return KWHzl().queryUnlockSchedule(str, str2, continuation);
    }
}
