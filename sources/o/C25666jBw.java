package o;

import com.okinc.business.market.features.address_tracker_sa.domain.LeaderBoardFilterUseCase$fetchFilterData$1;
import com.okinc.business.market.features.address_tracker_sa.domain.LeaderBoardFilterUseCase$fetchFilterDataIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jBw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25666jBw {
    public final CoroutineDispatcher OLrzqt;
    public final jBW copydefault;

    @yCM
    public C25666jBw(@NotNull jBW jbw, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(jbw, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = jbw;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Result<? extends java.util.List<LeaderBoardFilterModel>>> continuation) throws java.lang.Throwable {
        LeaderBoardFilterUseCase$fetchFilterData$1 leaderBoardFilterUseCase$fetchFilterData$1;
        if (continuation instanceof LeaderBoardFilterUseCase$fetchFilterData$1) {
            leaderBoardFilterUseCase$fetchFilterData$1 = (LeaderBoardFilterUseCase$fetchFilterData$1) continuation;
            int i = leaderBoardFilterUseCase$fetchFilterData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                leaderBoardFilterUseCase$fetchFilterData$1.label = i - Integer.MIN_VALUE;
            } else {
                leaderBoardFilterUseCase$fetchFilterData$1 = new LeaderBoardFilterUseCase$fetchFilterData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = leaderBoardFilterUseCase$fetchFilterData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = leaderBoardFilterUseCase$fetchFilterData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            LeaderBoardFilterUseCase$fetchFilterDataIoAF18A$$inlined$dexRunCatching$1 leaderBoardFilterUseCase$fetchFilterDataIoAF18A$$inlined$dexRunCatching$1 = new LeaderBoardFilterUseCase$fetchFilterDataIoAF18A$$inlined$dexRunCatching$1(null, this);
            leaderBoardFilterUseCase$fetchFilterData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, leaderBoardFilterUseCase$fetchFilterDataIoAF18A$$inlined$dexRunCatching$1, leaderBoardFilterUseCase$fetchFilterData$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.copydefault.EZpvd(str, continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull LeaderBoardFilterModel leaderBoardFilterModel, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.copydefault.copydefault(leaderBoardFilterModel, continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super LeaderBoardFilterModel> continuation) {
        return this.copydefault.KWHzl(str, continuation);
    }
}
