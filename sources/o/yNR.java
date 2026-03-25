package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59381zfv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yNR<Type extends InterfaceC59381zfv> extends yOA<Type> {
    public final java.util.Map<C56935yXu, Type> AEQbTJ;
    public final java.util.List<kotlin.Pair<C56935yXu, Type>> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<kotlin.Pair<C56935yXu, Type>> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends kotlin.Pair<o.yXu, ? extends Type extends o.zfv>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yNR(@NotNull java.util.List<? extends kotlin.Pair<C56935yXu, ? extends Type>> list) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
        java.util.Map<C56935yXu, Type> mapCopydefault = C56424yEw.copydefault(KWHzl());
        if (mapCopydefault.size() != KWHzl().size()) {
            throw new java.lang.IllegalArgumentException("Some properties have the same names".toString());
        }
        this.AEQbTJ = mapCopydefault;
    }

    @Override // o.yOA
    public boolean AEQbTJ(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return this.AEQbTJ.containsKey(c56935yXu);
    }

    public java.lang.String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + KWHzl() + ')';
    }
}
