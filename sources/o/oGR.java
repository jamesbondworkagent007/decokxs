package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oGR {
    public final sKH OLrzqt;

    @yCM
    public oGR(@NotNull sKH skh) {
        Intrinsics.checkNotNullParameter(skh, "");
        this.OLrzqt = skh;
    }

    public final java.lang.Object AEQbTJ(@NotNull OKMessage oKMessage, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objOLrzqt = this.OLrzqt.OLrzqt(oKMessage, (java.lang.String) null, (Continuation<? super C44461sQr>) continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }
}
