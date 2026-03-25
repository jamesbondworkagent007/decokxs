package o;

import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xXR implements RxBus.Application {
    public final xXP AEQbTJ;

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    public xXR(@NotNull xXP xxp) {
        Intrinsics.checkNotNullParameter(xxp, "");
        this.AEQbTJ = xxp;
    }
}
