package o;

import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5155Gv extends AbstractC5151Gr {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5155Gv(@NotNull InterfaceC60100zvh interfaceC60100zvh) {
        super(interfaceC60100zvh);
        Intrinsics.checkNotNullParameter(interfaceC60100zvh, "");
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.Gz.copydefault():o.Gn */
    @Override // o.InterfaceC5148Go
    public InterfaceC5147Gn KWHzl(@NotNull LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "");
        if (OLrzqt(logLevel)) {
            return new C5152Gs(this, logLevel);
        }
        return C5159Gz.copydefault;
    }
}
