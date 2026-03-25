package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.feature.group.paidgroup.PaidGroupCreatePaymentUseCase$createPayment$2;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.remote.CreatePaidGroupPaymentRequest;
import com.okinc.okimcore.model.remote.CreatePaidGroupPaymentResponse;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sJh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44262sJh {
    public static final int AEQbTJ = 8;
    public final InHouseIMGroupService EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C44262sJh(@NotNull InHouseIMGroupService inHouseIMGroupService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(inHouseIMGroupService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = inHouseIMGroupService;
        this.copydefault = coroutineDispatcher;
    }

    public final java.lang.Object OLrzqt(@NotNull CreatePaidGroupPaymentRequest createPaidGroupPaymentRequest, @NotNull Continuation<? super AbstractC43419rot<CreatePaidGroupPaymentResponse, OKServerException>> continuation) {
        return BuildersKt.withContext(this.copydefault, new PaidGroupCreatePaymentUseCase$createPayment$2(this, createPaidGroupPaymentRequest, null), continuation);
    }
}
