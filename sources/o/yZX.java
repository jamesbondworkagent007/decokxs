package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yZX implements InterfaceC59098zad {
    public abstract InterfaceC59098zad KWHzl();

    public final InterfaceC59098zad OLrzqt() {
        if (KWHzl() instanceof yZX) {
            InterfaceC59098zad interfaceC59098zadKWHzl = KWHzl();
            Intrinsics.copydefault(interfaceC59098zadKWHzl, "");
            return ((yZX) interfaceC59098zadKWHzl).OLrzqt();
        }
        return KWHzl();
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: java.util.Collection<? extends o.yOp>, java.util.Collection<o.yOp> */
    @Override // o.InterfaceC59098zad, o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return KWHzl().AEQbTJ(c56935yXu, yqv);
    }

    @Override // o.InterfaceC59101zag
    public InterfaceC56663yNs EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return KWHzl().EZpvd(c56935yXu, yqv);
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: java.util.Collection<? extends o.yOe>, java.util.Collection<o.yOe> */
    @Override // o.InterfaceC59098zad
    public java.util.Collection<InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return KWHzl().copydefault(c56935yXu, yqv);
    }

    @Override // o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56665yNu> copydefault(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return KWHzl().copydefault(yzu, function1);
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> AEQbTJ() {
        return KWHzl().AEQbTJ();
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> bP_() {
        return KWHzl().bP_();
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> EZpvd() {
        return KWHzl().EZpvd();
    }

    @Override // o.InterfaceC59101zag
    public void OLrzqt(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        KWHzl().OLrzqt(c56935yXu, yqv);
    }
}
