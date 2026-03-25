package o;

import com.okinc.okimcore.feature.group.entryconfiguration.GroupEntryConfigurationUseCase$createGroupEntryVerificationDetails$2;
import com.okinc.okimcore.feature.group.entryconfiguration.GroupEntryConfigurationUseCase$getGroupEntryListCurrency$2;
import com.okinc.okimcore.feature.group.entryconfiguration.GroupEntryConfigurationUseCase$getGroupEntryVerificationDetails$2;
import com.okinc.okimcore.feature.group.entryconfiguration.GroupEntryConfigurationUseCase$verifyAsset$2;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.remote.GroupEntryCreateVerificationRequestResponse;
import com.okinc.okimcore.model.remote.GroupEntryVerifyAsset;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sJa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44255sJa {
    public final InHouseIMGroupService AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C44255sJa(@NotNull InHouseIMGroupService inHouseIMGroupService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(inHouseIMGroupService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = inHouseIMGroupService;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object EZpvd(@NotNull GroupEntryCreateVerificationRequestResponse groupEntryCreateVerificationRequestResponse, @NotNull Continuation<? super AbstractC44414sOy> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new GroupEntryConfigurationUseCase$createGroupEntryVerificationDetails$2(groupEntryCreateVerificationRequestResponse, this, null), continuation);
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC44413sOx> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new GroupEntryConfigurationUseCase$getGroupEntryListCurrency$2(this, null), continuation);
    }

    public final java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super AbstractC44412sOw> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new GroupEntryConfigurationUseCase$getGroupEntryVerificationDetails$2(this, j, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull GroupEntryVerifyAsset groupEntryVerifyAsset, @NotNull Continuation<? super AbstractC44414sOy> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new GroupEntryConfigurationUseCase$verifyAsset$2(this, groupEntryVerifyAsset, null), continuation);
    }
}
