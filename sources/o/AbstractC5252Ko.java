package o;

import com.amplitude.core.platform.Plugin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5252Ko implements InterfaceC5256Ks {
    public JZ KWHzl;
    public final Plugin.Type EZpvd = Plugin.Type.Destination;
    public final C5260Kw OLrzqt = new C5260Kw();
    public boolean copydefault = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public void AEQbTJ(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        this.KWHzl = jz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public Plugin.Type EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public final C5242Ke EZpvd(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        return null;
    }

    public JZ OLrzqt() {
        JZ jz = this.KWHzl;
        if (jz != null) {
            return jz;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // com.amplitude.core.platform.Plugin
    public void KWHzl(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        super.KWHzl(jz);
        this.OLrzqt.OLrzqt(jz);
    }

    public final void AEQbTJ(@NotNull com.amplitude.core.platform.Plugin plugin) {
        Intrinsics.checkNotNullParameter(plugin, "");
        plugin.AEQbTJ(OLrzqt());
        this.OLrzqt.KWHzl(plugin);
    }

    public final C5242Ke copydefault(C5242Ke c5242Ke) {
        C5242Ke c5242KeKWHzl;
        if (!this.copydefault) {
            return null;
        }
        C5242Ke c5242KeKWHzl2 = this.OLrzqt.KWHzl(Plugin.Type.Enrichment, this.OLrzqt.KWHzl(Plugin.Type.Before, c5242Ke));
        if (c5242KeKWHzl2 == null) {
            return null;
        }
        if (c5242KeKWHzl2 instanceof C5249Kl) {
            c5242KeKWHzl = OLrzqt((C5249Kl) c5242KeKWHzl2);
        } else if (c5242KeKWHzl2 instanceof C5248Kk) {
            c5242KeKWHzl = AEQbTJ((C5248Kk) c5242KeKWHzl2);
        } else if (c5242KeKWHzl2 instanceof C5251Kn) {
            c5242KeKWHzl = copydefault((C5251Kn) c5242KeKWHzl2);
        } else {
            c5242KeKWHzl = KWHzl(c5242KeKWHzl2);
        }
        return c5242KeKWHzl;
    }
}
