package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C56617yM {
    public static final <Src, Dest> java.util.Collection<Dest> EZpvd(@NotNull java.util.Collection<? extends Src> collection, @NotNull Function1<? super Src, ? extends Dest> function1, @NotNull Function1<? super Dest, ? extends Src> function12) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return new C56590yL(collection, function1, function12);
    }

    public static final <Src, Dest> C56698yP<Src, Dest> AEQbTJ(@NotNull java.util.Iterator<? extends Src> it, @NotNull Function1<? super Src, ? extends Dest> function1) {
        Intrinsics.checkNotNullParameter(it, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new C56698yP<>(it, function1);
    }

    public static final <Src, Dest> C56752yR<Src, Dest> copydefault(@NotNull java.util.List<? extends Src> list, @NotNull Function1<? super Src, ? extends Dest> function1, @NotNull Function1<? super Dest, ? extends Src> function12) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return new C56752yR<>(list, function1, function12);
    }

    public static final <Src, Dest> C56725yQ<Src, Dest> AEQbTJ(@NotNull java.util.ListIterator<? extends Src> listIterator, @NotNull Function1<? super Src, ? extends Dest> function1) {
        Intrinsics.checkNotNullParameter(listIterator, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new C56725yQ<>(listIterator, function1);
    }

    public static final <Src, Dest> C56806yT<Src, Dest> OLrzqt(@NotNull java.util.Collection<Src> collection, @NotNull Function1<? super Src, ? extends Dest> function1, @NotNull Function1<? super Dest, ? extends Src> function12) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return new C56806yT<>(collection, function1, function12);
    }

    public static final <Src, Dest> C56914yX<Src, Dest> OLrzqt(@NotNull java.util.Iterator<? extends Src> it, @NotNull Function1<? super Src, ? extends Dest> function1) {
        Intrinsics.checkNotNullParameter(it, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new C56914yX<>(it, function1);
    }

    public static final <Src, Dest> C56968yZ<Src, Dest> OLrzqt(@NotNull java.util.List<Src> list, @NotNull Function1<? super Src, ? extends Dest> function1, @NotNull Function1<? super Dest, ? extends Src> function12) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return new C56968yZ<>(list, function1, function12);
    }

    public static final <Src, Dest> C56887yW<Src, Dest> copydefault(@NotNull java.util.ListIterator<Src> listIterator, @NotNull Function1<? super Src, ? extends Dest> function1, @NotNull Function1<? super Dest, ? extends Src> function12) {
        Intrinsics.checkNotNullParameter(listIterator, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return new C56887yW<>(listIterator, function1, function12);
    }

    public static final <KSrc, KDest, VSrc, VDest> C59280ze<KSrc, KDest, VSrc, VDest> OLrzqt(@NotNull InterfaceC56347yC<KSrc, VSrc> interfaceC56347yC, @NotNull Function1<? super KSrc, ? extends KDest> function1, @NotNull Function1<? super KDest, ? extends KSrc> function12, @NotNull Function1<? super VSrc, ? extends VDest> function13, @NotNull Function1<? super VDest, ? extends VSrc> function14) {
        Intrinsics.checkNotNullParameter(interfaceC56347yC, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        return new C59280ze<>(interfaceC56347yC, function1, function12, function13, function14);
    }

    public static final <Src, Dest> C59121zb<Src, Dest> copydefault(@NotNull java.util.Set<Src> set, @NotNull Function1<? super Src, ? extends Dest> function1, @NotNull Function1<? super Dest, ? extends Src> function12) {
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return new C59121zb<>(set, function1, function12);
    }

    public static final <Src, Dest> C59227zd<Src, Dest> EZpvd(@NotNull java.util.Set<? extends Src> set, @NotNull Function1<? super Src, ? extends Dest> function1, @NotNull Function1<? super Dest, ? extends Src> function12) {
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return new C59227zd<>(set, function1, function12);
    }
}
