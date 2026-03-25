package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.feature.group.paidgroup.PaidGroupTransactionsListUseCase$getTransactionsList$2;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.remote.PaidGroupTransactionsListResponse;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sJl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44266sJl {
    public final InHouseIMGroupService KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C44266sJl(@NotNull InHouseIMGroupService inHouseIMGroupService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(inHouseIMGroupService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = inHouseIMGroupService;
        this.copydefault = coroutineDispatcher;
    }

    public final java.lang.Object copydefault(long j, java.lang.String str, java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<PaidGroupTransactionsListResponse, OKServerException>> continuation) {
        return BuildersKt.withContext(this.copydefault, new PaidGroupTransactionsListUseCase$getTransactionsList$2(this, j, str, num, null), continuation);
    }
}
