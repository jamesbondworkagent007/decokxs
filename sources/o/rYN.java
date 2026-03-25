package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationAdvancedSettings;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rYN {
    public final C42600rYw KWHzl;

    @yCM
    public rYN(@NotNull C42600rYw c42600rYw) {
        Intrinsics.checkNotNullParameter(c42600rYw, "");
        this.KWHzl = c42600rYw;
    }

    public final java.lang.Object OLrzqt(int i, @NotNull Continuation<? super ResponseData<java.util.List<NotificationAdvancedSettings>>> continuation) {
        return this.KWHzl.copydefault(i, continuation);
    }
}
