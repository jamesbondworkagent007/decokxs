package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseFailedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class StateListAnimator {
    public static final java.lang.String AEQbTJ(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof ResponseFailedException) {
            return th.getMessage();
        }
        if (th instanceof OKServerException) {
            return th.getMessage();
        }
        return null;
    }

    public static final void KWHzl(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        java.lang.String strAEQbTJ = AEQbTJ(th);
        if (strAEQbTJ != null) {
            C55326xho.toast$default(strAEQbTJ, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }
}
