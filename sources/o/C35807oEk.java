package o;

import com.okinc.im.usecase.message.GetMessageReadCountUseCase$invoke$2;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.message.repository.remote.IMMessageService;
import com.okinc.okimcore.model.remote.MessageReadInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35807oEk {
    public final IMMessageService AEQbTJ;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C35807oEk(@NotNull IMMessageService iMMessageService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(iMMessageService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = iMMessageService;
        this.copydefault = coroutineDispatcher;
    }

    public final java.lang.Object EZpvd(long j, long j2, @NotNull Continuation<? super ResponseData<MessageReadInfo>> continuation) {
        return BuildersKt.withContext(this.copydefault, new GetMessageReadCountUseCase$invoke$2(this, j, j2, null), continuation);
    }
}
