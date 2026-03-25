package o;

import com.okinc.planet.biz_plugin.domain.GetFuturesChatDataUseCase$invoke$2;
import com.okinc.planet.biz_plugin.future.data.FutureChatBean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tBZ {
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull Continuation<? super kotlin.Pair<FutureChatBean, java.lang.Boolean>> continuation) {
        return CoroutineScopeKt.coroutineScope(new GetFuturesChatDataUseCase$invoke$2(str5, str3, str4, str, str2, null), continuation);
    }
}
