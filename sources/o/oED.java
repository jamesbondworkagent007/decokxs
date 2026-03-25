package o;

import com.okinc.im.usecase.message.SendTypingIndicatorMessageUseCase$invoke$2;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oED {
    public final C35821oEy EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final oCE copydefault;

    @yCM
    public oED(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull oCE oce, @NotNull C35821oEy c35821oEy) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(oce, "");
        Intrinsics.checkNotNullParameter(c35821oEy, "");
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = oce;
        this.EZpvd = c35821oEy;
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super OKMessage> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new SendTypingIndicatorMessageUseCase$invoke$2(this, str, null), continuation);
    }
}
