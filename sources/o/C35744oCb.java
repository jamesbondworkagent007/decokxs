package o;

import com.okinc.affiliate.bean.AffiliateIMPermission;
import com.okinc.im.usecase.affiliate.GetAffiliateIMPermissionUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35744oCb {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC8171axh KWHzl;

    @yCM
    public C35744oCb(@yCL(AEQbTJ = "IMAffiliateService") InterfaceC8171axh interfaceC8171axh, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC8171axh;
        this.AEQbTJ = coroutineDispatcher;
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super AffiliateIMPermission> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new GetAffiliateIMPermissionUseCase$execute$2(this, null), continuation);
    }
}
