package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Kt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5257Kt {
    public final java.util.List<com.amplitude.core.platform.Plugin> copydefault;

    public C5257Kt(@NotNull java.util.List<com.amplitude.core.platform.Plugin> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    public final boolean EZpvd(@NotNull com.amplitude.core.platform.Plugin plugin) {
        boolean zAdd;
        Intrinsics.checkNotNullParameter(plugin, "");
        synchronized (this.copydefault) {
            zAdd = this.copydefault.add(plugin);
        }
        return zAdd;
    }

    public final C5242Ke KWHzl(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        synchronized (this.copydefault) {
            for (com.amplitude.core.platform.Plugin plugin : this.copydefault) {
                if (c5242Ke != null) {
                    if (plugin instanceof AbstractC5252Ko) {
                        try {
                            ((AbstractC5252Ko) plugin).copydefault(c5242Ke);
                        } catch (java.lang.Exception e) {
                            e.printStackTrace();
                        }
                    } else if (plugin instanceof InterfaceC5256Ks) {
                        c5242Ke = plugin.EZpvd(c5242Ke);
                        if (c5242Ke instanceof C5249Kl) {
                            Intrinsics.copydefault(c5242Ke, "");
                            c5242Ke = ((InterfaceC5256Ks) plugin).OLrzqt((C5249Kl) c5242Ke);
                        } else if (c5242Ke instanceof C5248Kk) {
                            Intrinsics.copydefault(c5242Ke, "");
                            c5242Ke = ((InterfaceC5256Ks) plugin).AEQbTJ((C5248Kk) c5242Ke);
                        } else if (c5242Ke instanceof C5251Kn) {
                            Intrinsics.copydefault(c5242Ke, "");
                            c5242Ke = ((InterfaceC5256Ks) plugin).copydefault((C5251Kn) c5242Ke);
                        } else if (c5242Ke != null) {
                            Intrinsics.copydefault(c5242Ke, "");
                            c5242Ke = ((InterfaceC5256Ks) plugin).KWHzl(c5242Ke);
                        }
                    } else {
                        c5242Ke = plugin.EZpvd(c5242Ke);
                    }
                }
            }
        }
        return c5242Ke;
    }

    public final void EZpvd(@NotNull Function1<? super com.amplitude.core.platform.Plugin, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        synchronized (this.copydefault) {
            java.util.Iterator<T> it = this.copydefault.iterator();
            while (it.hasNext()) {
                function1.invoke((com.amplitude.core.platform.Plugin) it.next());
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
