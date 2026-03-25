package o;

import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sSG {
    public final C44518sSu EZpvd;

    @yCM
    public sSG(@NotNull C44518sSu c44518sSu) {
        Intrinsics.checkNotNullParameter(c44518sSu, "");
        this.EZpvd = c44518sSu;
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Unit> continuation) {
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        SPUtils.commit(this.EZpvd.copydefault(), C56443yFo.KWHzl(java.lang.System.currentTimeMillis()));
        return Unit.INSTANCE;
    }
}
