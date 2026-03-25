package o;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C56671yO<KSrc, KDest, VSrc, VDest> implements Map.Entry<KDest, VDest>, InterfaceC56535yIz {
    public final Map.Entry<KSrc, VSrc> AEQbTJ;
    public final Function1<KSrc, KDest> KWHzl;
    public final Function1<VSrc, VDest> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Map.Entry
    public VDest setValue(VDest vdest) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map$Entry<? extends KSrc, ? extends VSrc> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super KSrc, ? extends KDest> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super VSrc, ? extends VDest> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56671yO(@NotNull Map.Entry<? extends KSrc, ? extends VSrc> entry, @NotNull Function1<? super KSrc, ? extends KDest> function1, @NotNull Function1<? super VSrc, ? extends VDest> function12) {
        Intrinsics.checkNotNullParameter(entry, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ = entry;
        this.KWHzl = function1;
        this.OLrzqt = function12;
    }

    @Override // java.util.Map.Entry
    public KDest getKey() {
        return (KDest) this.KWHzl.invoke(this.AEQbTJ.getKey());
    }

    @Override // java.util.Map.Entry
    public VDest getValue() {
        return (VDest) this.OLrzqt.invoke(this.AEQbTJ.getValue());
    }
}
