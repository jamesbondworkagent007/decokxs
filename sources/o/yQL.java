package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yQL extends yQG implements InterfaceC56840yUg {
    public final C56933yXs EZpvd;

    @Override // o.yTM
    public boolean EZpvd() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56840yUg
    public C56933yXs OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yTM
    public yTO copydefault(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return null;
    }

    public yQL(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        this.EZpvd = c56933yXs;
    }

    @Override // o.InterfaceC56840yUg
    public java.util.Collection<yTT> KWHzl(@NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return yDY.AhwBna();
    }

    @Override // o.InterfaceC56840yUg
    public java.util.Collection<InterfaceC56840yUg> copydefault() {
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/util/Collection; */
    @Override // o.yTM
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.util.List<yTO> AEQbTJ() {
        return yDY.AhwBna();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof yQL) && Intrinsics.EZpvd(OLrzqt(), ((yQL) obj).OLrzqt());
    }

    public int hashCode() {
        return OLrzqt().hashCode();
    }

    public java.lang.String toString() {
        return yQL.class.getName() + ": " + OLrzqt();
    }
}
