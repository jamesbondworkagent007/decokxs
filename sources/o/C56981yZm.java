package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56981yZm extends AbstractC56975yZg<kotlin.Pair<? extends C56929yXo, ? extends C56935yXu>> {
    public final C56935yXu AEQbTJ;
    public final C56929yXo KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56935yXu AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56981yZm(@NotNull C56929yXo c56929yXo, @NotNull C56935yXu c56935yXu) {
        super(C56390yDp.OLrzqt(c56929yXo, c56935yXu));
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        this.KWHzl = c56929yXo;
        this.AEQbTJ = c56935yXu;
    }

    @Override // o.AbstractC56975yZg
    public AbstractC59233zdF OLrzqt(@NotNull yNP ynp) {
        AbstractC59242zdO abstractC59242zdOBQ_;
        Intrinsics.checkNotNullParameter(ynp, "");
        InterfaceC56658yNn interfaceC56658yNnCopydefault = yNE.copydefault(ynp, this.KWHzl);
        if (interfaceC56658yNnCopydefault != null) {
            if (!yYH.values(interfaceC56658yNnCopydefault)) {
                interfaceC56658yNnCopydefault = null;
            }
            if (interfaceC56658yNnCopydefault != null && (abstractC59242zdOBQ_ = interfaceC56658yNnCopydefault.bQ_()) != null) {
                return abstractC59242zdOBQ_;
            }
        }
        return C59370zfk.EZpvd(ErrorTypeKind.ERROR_ENUM_TYPE, this.KWHzl.toString(), this.AEQbTJ.toString());
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:o.yXu:INVOKE), 46, (wrap:o.yXu:IGET) */
    @Override // o.AbstractC56975yZg
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.KWHzl.AYXKKw());
        sb.append('.');
        sb.append(this.AEQbTJ);
        return sb.toString();
    }
}
