package o;

import com.okinc.im.imui.messageV2.model.SendMessageRequest;
import com.okinc.im.usecase.message.SendOkMessageBySendMessageRequestUseCase$execute$2;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oEB {
    public final oEF AEQbTJ;
    public final C35822oEz EZpvd;
    public final C35821oEy KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public oEB(@NotNull C35821oEy c35821oEy, @NotNull C35822oEz c35822oEz, @NotNull oEF oef, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c35821oEy, "");
        Intrinsics.checkNotNullParameter(c35822oEz, "");
        Intrinsics.checkNotNullParameter(oef, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c35821oEy;
        this.EZpvd = c35822oEz;
        this.AEQbTJ = oef;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object EZpvd(@NotNull SendMessageRequest sendMessageRequest, @NotNull OKMessage oKMessage, @NotNull Continuation<? super OKMessage> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new SendOkMessageBySendMessageRequestUseCase$execute$2(sendMessageRequest, this, oKMessage, null), continuation);
    }
}
