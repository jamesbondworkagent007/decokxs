package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JB extends AbstractC5258Ku {
    public JZ AEQbTJ;
    public IX copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public void AEQbTJ(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        this.AEQbTJ = jz;
    }

    @Override // com.amplitude.core.platform.Plugin
    public void KWHzl(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        super.KWHzl(jz);
        IX ixKWHzl = IX.Companion.KWHzl(jz.djBIcL().fetchVPNInfo());
        this.copydefault = ixKWHzl;
        if (ixKWHzl == null) {
            Intrinsics.gEmmrt("");
            ixKWHzl = null;
        }
        ixKWHzl.EZpvd().OLrzqt(new C5213Jb(jz.ejfBZ().copydefault(), jz.ejfBZ().KWHzl(), null, 4, null));
    }

    @Override // o.AbstractC5258Ku
    public void copydefault(java.lang.String str) {
        IX ix = this.copydefault;
        if (ix == null) {
            Intrinsics.gEmmrt("");
            ix = null;
        }
        ix.EZpvd().copydefault().EZpvd(str).copydefault();
    }

    @Override // o.AbstractC5258Ku
    public void EZpvd(java.lang.String str) {
        IX ix = this.copydefault;
        if (ix == null) {
            Intrinsics.gEmmrt("");
            ix = null;
        }
        ix.EZpvd().copydefault().copydefault(str).copydefault();
    }
}
