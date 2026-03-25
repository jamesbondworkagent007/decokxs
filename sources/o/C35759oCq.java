package o;

import com.okinc.im.usecase.banner.RecordGroupAnnouncementBannerShowAlreadyUseCase$execute$2;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35759oCq {
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C35759oCq(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
    }

    public final java.lang.Object EZpvd(@NotNull GroupInfo groupInfo, @NotNull C36551odB c36551odB, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.KWHzl, new RecordGroupAnnouncementBannerShowAlreadyUseCase$execute$2(groupInfo, c36551odB, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
