package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.feature.group.paidgroup.PaidGroupTransactionsSummaryUseCase$getTransactionsSummary$2;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.remote.PaidGroupTransactionsSummaryResponse;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sJn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44268sJn {
    public final CoroutineDispatcher AEQbTJ;
    public final InHouseIMGroupService OLrzqt;

    @yCM
    public C44268sJn(@NotNull InHouseIMGroupService inHouseIMGroupService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(inHouseIMGroupService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = inHouseIMGroupService;
        this.AEQbTJ = coroutineDispatcher;
    }

    public final java.lang.Object copydefault(long j, @NotNull Continuation<? super AbstractC43419rot<PaidGroupTransactionsSummaryResponse, OKServerException>> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new PaidGroupTransactionsSummaryUseCase$getTransactionsSummary$2(this, j, null), continuation);
    }
}
