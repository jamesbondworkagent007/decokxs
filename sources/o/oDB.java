package o;

import com.okinc.im.usecase.group.info.GetGroupInfoFromCacheUseCase$invoke$2;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDB {
    public final CoroutineDispatcher KWHzl;
    public final sFU copydefault;

    @yCM
    public oDB(@NotNull sFU sfu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sfu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = sfu;
        this.KWHzl = coroutineDispatcher;
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super GroupInfo> continuation) {
        return BuildersKt.withContext(this.KWHzl, new GetGroupInfoFromCacheUseCase$invoke$2(this, str, null), continuation);
    }
}
