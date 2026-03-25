package o;

import com.okinc.im.usecase.message.SendOkStickerUseCase$execute$2;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oEF {
    public final CoroutineDispatcher AEQbTJ;
    public final sKH KWHzl;

    @yCM
    public oEF(@NotNull sKH skh, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(skh, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = skh;
        this.AEQbTJ = coroutineDispatcher;
    }

    public final java.lang.Object AEQbTJ(@NotNull OKMessage oKMessage, @NotNull Continuation<? super OKMessage> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new SendOkStickerUseCase$execute$2(this, oKMessage, null), continuation);
    }
}
