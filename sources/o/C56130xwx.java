package o;

import com.okinc.unify_trade.biz.SystemTimeData;
import com.okinc.unify_trade.biz.subscribe.OfflinePlan;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56130xwx {
    public final xIH AEQbTJ = new xIH();

    public InterfaceC58217yxC EZpvd(@NotNull InterfaceC55701xos<SystemTimeData> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.AEQbTJ.AEQbTJ(interfaceC55701xos);
    }

    public InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC55701xos<OfflinePlan> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.AEQbTJ.copydefault(str, str2, interfaceC55701xos);
    }
}
