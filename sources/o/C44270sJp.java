package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.feature.group.paidgroup.PaidGroupWithdrawPaymentUseCase$withdrawPayment$2;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.remote.WithdrawPaidGroupPaymentRequest;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sJp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44270sJp {
    public final InHouseIMGroupService OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C44270sJp(@NotNull InHouseIMGroupService inHouseIMGroupService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(inHouseIMGroupService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = inHouseIMGroupService;
        this.copydefault = coroutineDispatcher;
    }

    public final java.lang.Object OLrzqt(@NotNull WithdrawPaidGroupPaymentRequest withdrawPaidGroupPaymentRequest, @NotNull Continuation<? super AbstractC43419rot<java.lang.Boolean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.copydefault, new PaidGroupWithdrawPaymentUseCase$withdrawPayment$2(this, withdrawPaidGroupPaymentRequest, null), continuation);
    }
}
