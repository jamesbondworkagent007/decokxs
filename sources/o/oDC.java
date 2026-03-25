package o;

import com.okinc.im.usecase.group.entryconfiguration.GroupEntryUpsertVerificationUseCase$execute$2;
import com.okinc.okimcore.model.remote.GroupEntryAssetVerification;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDC {
    public final C44255sJa KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public oDC(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C44255sJa c44255sJa) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c44255sJa, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = c44255sJa;
    }

    public final java.lang.Object KWHzl(long j, int i, GroupEntryAssetVerification groupEntryAssetVerification, GroupEntryBillingModel groupEntryBillingModel, @NotNull Continuation<? super AbstractC44414sOy> continuation) {
        return BuildersKt.withContext(this.copydefault, new GroupEntryUpsertVerificationUseCase$execute$2(this, j, i, groupEntryAssetVerification, groupEntryBillingModel, null), continuation);
    }
}
