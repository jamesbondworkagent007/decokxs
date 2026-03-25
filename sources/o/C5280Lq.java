package o;

import com.amplitude.eventbridge.EventChannel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Lq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5280Lq implements InterfaceC5277Ln {
    public final java.lang.Object EZpvd = new java.lang.Object();
    public final java.util.Map<EventChannel, C5279Lp> KWHzl = new LinkedHashMap();

    @Override // o.InterfaceC5277Ln
    public void AEQbTJ(@NotNull EventChannel eventChannel, @NotNull C5276Lm c5276Lm) {
        C5279Lp c5279Lp;
        Intrinsics.checkNotNullParameter(eventChannel, "");
        Intrinsics.checkNotNullParameter(c5276Lm, "");
        synchronized (this.EZpvd) {
            java.util.Map<EventChannel, C5279Lp> map = this.KWHzl;
            C5279Lp c5279Lp2 = map.get(eventChannel);
            if (c5279Lp2 == null) {
                c5279Lp2 = new C5279Lp(eventChannel);
                map.put(eventChannel, c5279Lp2);
            }
            c5279Lp = c5279Lp2;
        }
        c5279Lp.EZpvd(c5276Lm);
    }

    @Override // o.InterfaceC5277Ln
    public void AEQbTJ(@NotNull EventChannel eventChannel, @NotNull InterfaceC5281Lr interfaceC5281Lr) {
        C5279Lp c5279Lp;
        Intrinsics.checkNotNullParameter(eventChannel, "");
        Intrinsics.checkNotNullParameter(interfaceC5281Lr, "");
        synchronized (this.EZpvd) {
            java.util.Map<EventChannel, C5279Lp> map = this.KWHzl;
            C5279Lp c5279Lp2 = map.get(eventChannel);
            if (c5279Lp2 == null) {
                c5279Lp2 = new C5279Lp(eventChannel);
                map.put(eventChannel, c5279Lp2);
            }
            c5279Lp = c5279Lp2;
        }
        c5279Lp.OLrzqt(interfaceC5281Lr);
    }
}
