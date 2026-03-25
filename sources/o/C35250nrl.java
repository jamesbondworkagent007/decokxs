package o;

import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35250nrl implements RxBus.Application {
    public static final int KWHzl = WSSendReactionData.$stable;
    public final WSSendReactionData copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendReactionData AEQbTJ() {
        return this.copydefault;
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    public C35250nrl(@NotNull WSSendReactionData wSSendReactionData) {
        Intrinsics.checkNotNullParameter(wSSendReactionData, "");
        this.copydefault = wSSendReactionData;
    }
}
