package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zaJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59078zaJ {
    public final yWS EZpvd;
    public final ProtoBuf.Class KWHzl;
    public final InterfaceC56686yOo OLrzqt;
    public final yWQ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yWS AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56686yOo EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yWQ KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtoBuf.Class copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59078zaJ)) {
            return false;
        }
        C59078zaJ c59078zaJ = (C59078zaJ) obj;
        return Intrinsics.EZpvd(this.EZpvd, c59078zaJ.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c59078zaJ.KWHzl) && Intrinsics.EZpvd(this.copydefault, c59078zaJ.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c59078zaJ.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ClassData(nameResolver=" + this.EZpvd + ", classProto=" + this.KWHzl + ", metadataVersion=" + this.copydefault + ", sourceElement=" + this.OLrzqt + ')';
    }

    public C59078zaJ(@NotNull yWS yws, @NotNull ProtoBuf.Class r3, @NotNull yWQ ywq, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(r3, "");
        Intrinsics.checkNotNullParameter(ywq, "");
        Intrinsics.checkNotNullParameter(interfaceC56686yOo, "");
        this.EZpvd = yws;
        this.KWHzl = r3;
        this.copydefault = ywq;
        this.OLrzqt = interfaceC56686yOo;
    }
}
