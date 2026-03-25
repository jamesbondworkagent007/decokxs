package o;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFB {
    @yCM
    public oFB() {
    }

    public final java.util.Set<java.lang.Class<? extends OKMessageContent>> copydefault() {
        return C35696oAh.KWHzl.copydefault();
    }

    public final boolean copydefault(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return C44170sFx.copydefault(oKMessage, copydefault());
    }
}
