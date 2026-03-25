package o;

import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41490qrm {
    public final InterfaceC41652qup AEQbTJ;
    public final java.util.List<DexInstrument> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qrm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41490qrm copy$default(C41490qrm c41490qrm, java.util.List list, InterfaceC41652qup interfaceC41652qup, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c41490qrm.KWHzl;
        }
        if ((i & 2) != 0) {
            interfaceC41652qup = c41490qrm.AEQbTJ;
        }
        return c41490qrm.copydefault(list, interfaceC41652qup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC41652qup AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<DexInstrument> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41490qrm copydefault(@NotNull java.util.List<DexInstrument> list, @NotNull InterfaceC41652qup interfaceC41652qup) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC41652qup, "");
        return new C41490qrm(list, interfaceC41652qup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41490qrm)) {
            return false;
        }
        C41490qrm c41490qrm = (C41490qrm) obj;
        return Intrinsics.EZpvd(this.KWHzl, c41490qrm.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c41490qrm.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    public C41490qrm(@NotNull java.util.List<DexInstrument> list, @NotNull InterfaceC41652qup interfaceC41652qup) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC41652qup, "");
        this.KWHzl = list;
        this.AEQbTJ = interfaceC41652qup;
    }

    public java.lang.String toString() {
        return "GetDexTokenPayload(dexInstrumentList size=" + this.KWHzl.size() + ", voFactory=" + this.AEQbTJ + ")";
    }
}
