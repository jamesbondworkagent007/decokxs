package o;

import com.amplitude.core.platform.Plugin;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Kw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5260Kw {
    public final java.util.Map<Plugin.Type, C5257Kt> AYXKKw = C56424yEw.gEmmrt(C56390yDp.OLrzqt(Plugin.Type.Before, new C5257Kt(new java.util.ArrayList())), C56390yDp.OLrzqt(Plugin.Type.Enrichment, new C5257Kt(new java.util.ArrayList())), C56390yDp.OLrzqt(Plugin.Type.Destination, new C5257Kt(new java.util.ArrayList())), C56390yDp.OLrzqt(Plugin.Type.Utility, new C5257Kt(new java.util.ArrayList())));
    public JZ djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        this.djBIcL = jz;
    }

    public final JZ copydefault() {
        JZ jz = this.djBIcL;
        if (jz != null) {
            return jz;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public void copydefault(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        if (copydefault().djBIcL().hDKMBd()) {
            return;
        }
        KWHzl(Plugin.Type.Destination, KWHzl(Plugin.Type.Enrichment, KWHzl(Plugin.Type.Before, c5242Ke)));
    }

    public final void KWHzl(@NotNull com.amplitude.core.platform.Plugin plugin) {
        Intrinsics.checkNotNullParameter(plugin, "");
        plugin.KWHzl(copydefault());
        C5257Kt c5257Kt = this.AYXKKw.get(plugin.EZpvd());
        if (c5257Kt != null) {
            c5257Kt.EZpvd(plugin);
        }
    }

    public final C5242Ke KWHzl(@NotNull Plugin.Type type, C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(type, "");
        return KWHzl(this.AYXKKw.get(type), c5242Ke);
    }

    public final C5242Ke KWHzl(C5257Kt c5257Kt, C5242Ke c5242Ke) {
        if (c5242Ke != null) {
            return c5257Kt != null ? c5257Kt.KWHzl(c5242Ke) : null;
        }
        return c5242Ke;
    }

    public final void copydefault(@NotNull Function1<? super com.amplitude.core.platform.Plugin, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<Map.Entry<Plugin.Type, C5257Kt>> it = this.AYXKKw.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().EZpvd(function1);
        }
    }
}
