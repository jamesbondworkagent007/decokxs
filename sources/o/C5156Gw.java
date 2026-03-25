package o;

import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Gw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5156Gw extends AbstractC5151Gr {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5156Gw(@NotNull InterfaceC60100zvh interfaceC60100zvh) {
        super(interfaceC60100zvh);
        Intrinsics.checkNotNullParameter(interfaceC60100zvh, "");
    }

    @Override // o.InterfaceC5148Go
    public InterfaceC5147Gn KWHzl(@NotNull LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "");
        InterfaceC60078zvA interfaceC60078zvAOLrzqt = OLrzqt().OLrzqt(GC.KWHzl(logLevel));
        Intrinsics.checkNotNullExpressionValue(interfaceC60078zvAOLrzqt, "");
        return new C5157Gx(interfaceC60078zvAOLrzqt);
    }
}
