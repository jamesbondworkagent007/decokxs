package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCH {
    public final oGM AEQbTJ;
    public final oCF EZpvd;
    public final oGI KWHzl;

    @yCM
    public oCH(@NotNull oGM ogm, @NotNull oGI ogi, @NotNull oCF ocf) {
        Intrinsics.checkNotNullParameter(ogm, "");
        Intrinsics.checkNotNullParameter(ogi, "");
        Intrinsics.checkNotNullParameter(ocf, "");
        this.AEQbTJ = ogm;
        this.KWHzl = ogi;
        this.EZpvd = ocf;
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull OKMessage oKMessage, @NotNull Continuation<? super Unit> continuation) {
        boolean zKWHzl = this.KWHzl.KWHzl();
        java.lang.String strAEQbTJ = this.AEQbTJ.AEQbTJ();
        if (zKWHzl && !Intrinsics.EZpvd((java.lang.Object) oKMessage.getSenderUserId(), (java.lang.Object) strAEQbTJ)) {
            java.lang.Object objOLrzqt = this.EZpvd.OLrzqt(str, continuation);
            return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
