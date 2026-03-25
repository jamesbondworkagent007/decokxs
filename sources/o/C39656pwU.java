package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.kline.data.KlineCoinInfo;
import com.okinc.kline.ui.unlock.data.po.UnlockProgressInfoPo;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenAllocation;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenEvent;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenSchedule;
import com.okinc.kline.ui.unlock.data.repository.UnlockTokenRepository$queryTokenEvent$2;
import com.okinc.kline.ui.unlock.data.repository.UnlockTokenRepository$queryTokenInfo$2;
import com.okinc.kline.ui.unlock.data.repository.UnlockTokenRepository$queryTokenProgress$2;
import com.okinc.kline.ui.unlock.data.repository.UnlockTokenRepository$queryUnlockAllocation$2;
import com.okinc.kline.ui.unlock.data.repository.UnlockTokenRepository$queryUnlockSchedule$2;
import com.okinc.kline.ui.unlock.data.repository.UnlockTokenRepository$requestData$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.pwU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39656pwU {
    public static final int $stable = 8;
    public final C39654pwS dataSource;
    public final CoroutineDispatcher dispatcher;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher EZpvd() {
        return this.dispatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39654pwS KWHzl() {
        return this.dataSource;
    }

    @yCM
    public C39656pwU(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C39654pwS c39654pwS) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c39654pwS, "");
        this.dispatcher = coroutineDispatcher;
        this.dataSource = c39654pwS;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super KlineCoinInfo> continuation) {
        return BuildersKt.withContext(EZpvd(), new UnlockTokenRepository$queryTokenInfo$2(this, str, null), continuation);
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super UnlockProgressInfoPo> continuation) {
        return BuildersKt.withContext(EZpvd(), new UnlockTokenRepository$queryTokenProgress$2(this, str, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull @Query("ccy") java.lang.String str, @NotNull @Query("type") java.lang.String str2, @NotNull Continuation<? super java.util.List<UnlockTokenEvent>> continuation) {
        return BuildersKt.withContext(EZpvd(), new UnlockTokenRepository$queryTokenEvent$2(this, str, str2, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull @Query("ccy") java.lang.String str, @NotNull Continuation<? super UnlockTokenAllocation> continuation) {
        return BuildersKt.withContext(EZpvd(), new UnlockTokenRepository$queryUnlockAllocation$2(this, str, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull @Query("ccy") java.lang.String str, @NotNull @Query(TypedValues.CycleType.S_WAVE_PERIOD) java.lang.String str2, @NotNull Continuation<? super java.util.List<UnlockTokenSchedule>> continuation) {
        return BuildersKt.withContext(EZpvd(), new UnlockTokenRepository$queryUnlockSchedule$2(this, str, str2, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object EZpvd(@NotNull Function1<? super Continuation<? super ResponseData<T>>, ? extends java.lang.Object> function1, @NotNull Continuation<? super T> continuation) throws java.lang.Exception {
        UnlockTokenRepository$requestData$1 unlockTokenRepository$requestData$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof UnlockTokenRepository$requestData$1) {
            unlockTokenRepository$requestData$1 = (UnlockTokenRepository$requestData$1) continuation;
            int i = unlockTokenRepository$requestData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unlockTokenRepository$requestData$1.label = i - Integer.MIN_VALUE;
            } else {
                unlockTokenRepository$requestData$1 = new UnlockTokenRepository$requestData$1(this, continuation);
            }
        }
        java.lang.Object objInvoke = unlockTokenRepository$requestData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unlockTokenRepository$requestData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objInvoke);
                Result.Application application = Result.Companion;
                unlockTokenRepository$requestData$1.label = 1;
                objInvoke = function1.invoke(unlockTokenRepository$requestData$1);
                if (objInvoke == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objInvoke);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) objInvoke);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        ResponseData responseData = (ResponseData) objM7377constructorimpl;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return data;
        }
        throw new java.lang.Exception(responseData.getMsg());
    }
}
