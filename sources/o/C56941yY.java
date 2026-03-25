package o;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.yIG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C56941yY<KSrc, KDest, VSrc, VDest> extends C56671yO<KSrc, KDest, VSrc, VDest> implements Map.Entry<KDest, VDest>, yIG.Activity {
    public final Map.Entry<KSrc, VSrc> EZpvd;
    public final Function1<KSrc, KDest> copydefault;
    public final Function1<VSrc, VDest> djBIcL;
    public final Function1<VDest, VSrc> valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super KSrc, ? extends KDest> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super VSrc, ? extends VDest> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super VDest, ? extends VSrc> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C56941yY(@NotNull Map.Entry<KSrc, VSrc> entry, @NotNull Function1<? super KSrc, ? extends KDest> function1, @NotNull Function1<? super VSrc, ? extends VDest> function12, @NotNull Function1<? super VDest, ? extends VSrc> function13) {
        super(entry, function1, function12);
        Intrinsics.checkNotNullParameter(entry, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        this.EZpvd = entry;
        this.copydefault = function1;
        this.djBIcL = function12;
        this.valueOf = function13;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // o.C56671yO, java.util.Map.Entry
    public VDest setValue(VDest vdest) {
        return this.djBIcL.invoke(this.EZpvd.setValue(this.valueOf.invoke(vdest)));
    }
}
