package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.stickers.remote.model.StickerConfigResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sRq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC44487sRq {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, int i, int i2, @NotNull Continuation<? super java.util.List<? extends InterfaceC44488sRr>> continuation);

    java.lang.Object EZpvd(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation);

    Flow<java.util.List<InterfaceC44494sRx>> EZpvd();

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<StickerConfigResponse, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.io.File file, @NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Long> continuation);
}
