package o;

import com.okinc.okimcore.feature.group.paidgroup.PaidGroupConfigurationUseCase$getBillingModel$2;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sJj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44264sJj {
    public final CoroutineDispatcher KWHzl;
    public final InHouseIMGroupService OLrzqt;

    @yCM
    public C44264sJj(@NotNull InHouseIMGroupService inHouseIMGroupService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(inHouseIMGroupService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = inHouseIMGroupService;
        this.KWHzl = coroutineDispatcher;
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super sOZ> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PaidGroupConfigurationUseCase$getBillingModel$2(this, null), continuation);
    }
}
