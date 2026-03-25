package o;

import com.okinc.im.usecase.relationinfo.GetRelationInfoFromRemoteIfAddedContactUseCase$execute$2;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35858oGh {
    public final CoroutineDispatcher EZpvd;
    public final C35859oGi KWHzl;

    @yCM
    public C35858oGh(@NotNull C35859oGi c35859oGi, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c35859oGi, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c35859oGi;
        this.EZpvd = coroutineDispatcher;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull OKMessage oKMessage, @NotNull Continuation<? super RelationInfo> continuation) {
        return BuildersKt.withContext(this.EZpvd, new GetRelationInfoFromRemoteIfAddedContactUseCase$execute$2(oKMessage, this, str, null), continuation);
    }
}
