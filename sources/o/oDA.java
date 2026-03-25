package o;

import com.okinc.im.usecase.group.info.GetGroupInfoFromRemoteUseCase$execute$2;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDA {
    public final oCE KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final sIR copydefault;

    @yCM
    public oDA(@NotNull sIR sir, @NotNull oCE oce, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(oce, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = sir;
        this.KWHzl = oce;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super GroupInfo> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new GetGroupInfoFromRemoteUseCase$execute$2(this, str, null), continuation);
    }
}
