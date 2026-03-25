package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFE {
    @yCM
    public oFE() {
    }

    public final boolean copydefault(@NotNull OKMessage oKMessage, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        if (l != null) {
            long seq = oKMessage.getSeq();
            if (seq < l.longValue() && seq > 0) {
                return false;
            }
        }
        return true;
    }
}
