package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yVR implements InterfaceC59082zaN {
    public final yVO AEQbTJ;
    public final InterfaceC56888yWa OLrzqt;

    public yVR(@NotNull InterfaceC56888yWa interfaceC56888yWa, @NotNull yVO yvo) {
        Intrinsics.checkNotNullParameter(interfaceC56888yWa, "");
        Intrinsics.checkNotNullParameter(yvo, "");
        this.OLrzqt = interfaceC56888yWa;
        this.AEQbTJ = yvo;
    }

    @Override // o.InterfaceC59082zaN
    public C59078zaJ AEQbTJ(@NotNull C56929yXo c56929yXo) {
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        InterfaceC56893yWf interfaceC56893yWfOLrzqt = yVZ.OLrzqt(this.OLrzqt, c56929yXo, C59432zgt.EZpvd(this.AEQbTJ.KWHzl().OLrzqt()));
        if (interfaceC56893yWfOLrzqt == null) {
            return null;
        }
        Intrinsics.EZpvd(interfaceC56893yWfOLrzqt.KWHzl(), c56929yXo);
        return this.AEQbTJ.EZpvd(interfaceC56893yWfOLrzqt);
    }
}
