package o;

import com.okinc.im.usecase.message.SendOkMediaMessageUseCase$execute$2;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35822oEz {
    public final sKH KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C35822oEz(@NotNull sKH skh, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(skh, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = skh;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object copydefault(@NotNull OKMessage oKMessage, @NotNull Continuation<? super OKMessage> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new SendOkMediaMessageUseCase$execute$2(this, oKMessage, null), continuation);
    }
}
