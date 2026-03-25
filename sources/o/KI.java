package o;

import com.amplitude.eventbridge.EventChannel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KI implements InterfaceC5281Lr {
    public final JZ EZpvd;

    public KI(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        this.EZpvd = jz;
    }

    @Override // o.InterfaceC5281Lr
    public void OLrzqt(@NotNull EventChannel eventChannel, @NotNull C5276Lm c5276Lm) {
        Intrinsics.checkNotNullParameter(eventChannel, "");
        Intrinsics.checkNotNullParameter(c5276Lm, "");
        this.EZpvd.DbNXlk().OLrzqt("Receive event from event bridge " + c5276Lm.KWHzl());
        JZ.track$default(this.EZpvd, KJ.copydefault(c5276Lm), (C5247Kj) null, (yHO) null, 6, (java.lang.Object) null);
    }
}
