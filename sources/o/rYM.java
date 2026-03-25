package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SwitchNotificationSettingsChannelReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rYM {
    public final C42600rYw OLrzqt;

    @yCM
    public rYM(@NotNull C42600rYw c42600rYw) {
        Intrinsics.checkNotNullParameter(c42600rYw, "");
        this.OLrzqt = c42600rYw;
    }

    public final java.lang.Object AEQbTJ(@NotNull SwitchNotificationSettingsChannelReq switchNotificationSettingsChannelReq, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return this.OLrzqt.KWHzl(switchNotificationSettingsChannelReq, continuation);
    }
}
