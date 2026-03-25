package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yZP {
    public final C56798ySs EZpvd;
    public final yRX copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56798ySs copydefault() {
        return this.EZpvd;
    }

    public yZP(@NotNull C56798ySs c56798ySs, @NotNull yRX yrx) {
        Intrinsics.checkNotNullParameter(c56798ySs, "");
        Intrinsics.checkNotNullParameter(yrx, "");
        this.EZpvd = c56798ySs;
        this.copydefault = yrx;
    }

    public final InterfaceC56658yNn copydefault(@NotNull yTT ytt) {
        ySZ ysz;
        Intrinsics.checkNotNullParameter(ytt, "");
        C56933yXs c56933yXsValueOf = ytt.valueOf();
        if (c56933yXsValueOf != null && ytt.AkhnZx() == LightClassOriginKind.SOURCE) {
            return this.copydefault.KWHzl(c56933yXsValueOf);
        }
        yTT yttAuCTel = ytt.AuCTel();
        if (yttAuCTel == null) {
            if (c56933yXsValueOf == null || (ysz = (ySZ) CollectionsKt___CollectionsKt.firstOrNull(this.EZpvd.copydefault(c56933yXsValueOf.EZpvd()))) == null) {
                return null;
            }
            return ysz.OLrzqt(ytt);
        }
        InterfaceC56658yNn interfaceC56658yNnCopydefault = copydefault(yttAuCTel);
        InterfaceC59098zad interfaceC59098zadOcIXYQ = interfaceC56658yNnCopydefault != null ? interfaceC56658yNnCopydefault.OcIXYQ() : null;
        InterfaceC56663yNs interfaceC56663yNsEZpvd = interfaceC59098zadOcIXYQ != null ? interfaceC59098zadOcIXYQ.EZpvd(ytt.fIwbmz(), NoLookupLocation.FROM_JAVA_LOADER) : null;
        if (interfaceC56663yNsEZpvd instanceof InterfaceC56658yNn) {
            return (InterfaceC56658yNn) interfaceC56663yNsEZpvd;
        }
        return null;
    }
}
