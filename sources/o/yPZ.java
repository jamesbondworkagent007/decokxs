package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC56764yRl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yPZ implements InterfaceC56764yRl {
    public final java.lang.ClassLoader OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56764yRl
    public java.util.Set<java.lang.String> AEQbTJ(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return null;
    }

    public yPZ(@NotNull java.lang.ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "");
        this.OLrzqt = classLoader;
    }

    @Override // o.InterfaceC56764yRl
    public yTT EZpvd(@NotNull InterfaceC56764yRl.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56929yXo c56929yXoCopydefault = taskDescription.copydefault();
        C56933yXs c56933yXsOLrzqt = c56929yXoCopydefault.OLrzqt();
        java.lang.String strReplace$default = C59449zhJ.replace$default(c56929yXoCopydefault.copydefault().KWHzl(), '.', '$', false, 4, (java.lang.Object) null);
        if (!c56933yXsOLrzqt.AEQbTJ()) {
            strReplace$default = c56933yXsOLrzqt.KWHzl() + '.' + strReplace$default;
        }
        java.lang.Class<?> clsAEQbTJ = C56728yQc.AEQbTJ(this.OLrzqt, strReplace$default);
        if (clsAEQbTJ != null) {
            return new C56750yQy(clsAEQbTJ);
        }
        return null;
    }

    @Override // o.InterfaceC56764yRl
    public InterfaceC56840yUg AEQbTJ(@NotNull C56933yXs c56933yXs, boolean z) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return new yQL(c56933yXs);
    }
}
