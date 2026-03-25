package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59381zfv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yNL<Type extends InterfaceC59381zfv> extends yOA<Type> {
    public final Type EZpvd;
    public final C56935yXu copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Type KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56935yXu OLrzqt() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yNL(@NotNull C56935yXu c56935yXu, @NotNull Type type) {
        super(null);
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(type, "");
        this.copydefault = c56935yXu;
        this.EZpvd = type;
    }

    @Override // o.yOA
    public boolean AEQbTJ(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return Intrinsics.EZpvd(this.copydefault, c56935yXu);
    }

    public java.lang.String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.copydefault + ", underlyingType=" + this.EZpvd + ')';
    }
}
