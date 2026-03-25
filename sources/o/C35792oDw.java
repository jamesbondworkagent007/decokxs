package o;

import com.okinc.im.usecase.group.banner.GetGroupBannerListUseCase$invoke$2;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.remote.GroupBannerList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35792oDw {
    public final InHouseIMGroupService AEQbTJ;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C35792oDw(@NotNull InHouseIMGroupService inHouseIMGroupService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(inHouseIMGroupService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = inHouseIMGroupService;
        this.copydefault = coroutineDispatcher;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<GroupBannerList>> continuation) {
        return BuildersKt.withContext(this.copydefault, new GetGroupBannerListUseCase$invoke$2(this, str, null), continuation);
    }
}
