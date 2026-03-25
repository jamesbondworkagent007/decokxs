package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59365zff implements yNP {
    public static final java.util.Set<yNP> AEQbTJ;
    public static final C56935yXu AhwBna;
    public static final java.util.List<yNP> EZpvd;
    public static final java.util.List<yNP> KWHzl;
    public static final InterfaceC56387yDm OLrzqt;
    public static final C59365zff copydefault = new C59365zff();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56665yNu
    public <R, D> R AEQbTJ(@NotNull InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        Intrinsics.checkNotNullParameter(interfaceC56667yNw, "");
        return null;
    }

    @Override // o.InterfaceC56665yNu
    public InterfaceC56665yNu AYXKKw() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56935yXu AhwBna() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNP
    public boolean EZpvd(@NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNP
    public java.util.List<yNP> KWHzl() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNP
    public <T> T OLrzqt(@NotNull yNN<T> ynn) {
        Intrinsics.checkNotNullParameter(ynn, "");
        return null;
    }

    @Override // o.InterfaceC56665yNu
    /* JADX INFO: renamed from: bT_ */
    public InterfaceC56665yNu AhwBna() {
        return this;
    }

    private C59365zff() {
    }

    static {
        C56935yXu c56935yXuCopydefault = C56935yXu.copydefault(ErrorEntity.ERROR_MODULE.getDebugText());
        Intrinsics.checkNotNullExpressionValue(c56935yXuCopydefault, "");
        AhwBna = c56935yXuCopydefault;
        EZpvd = yDY.AhwBna();
        KWHzl = yDY.AhwBna();
        AEQbTJ = yEE.copydefault();
        OLrzqt = C56392yDr.copydefault(C59363zfd.KWHzl);
    }

    @Override // o.yOB
    public yOL copydefault() {
        return yOL.KWHzl.OLrzqt();
    }

    public static final C56638yMu djBIcL() {
        return C56638yMu.copydefault.copydefault();
    }

    @Override // o.yNP
    public AbstractC56640yMw AEQbTJ() {
        return (AbstractC56640yMw) OLrzqt.getValue();
    }

    @Override // o.yNP
    public java.util.Collection<C56933yXs> OLrzqt(@NotNull C56933yXs c56933yXs, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return yDY.AhwBna();
    }

    @Override // o.yNQ
    public C56935yXu bR_() {
        return AhwBna();
    }

    @Override // o.yNP
    public yNY copydefault(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        throw new java.lang.IllegalStateException("Should not be called!");
    }
}
