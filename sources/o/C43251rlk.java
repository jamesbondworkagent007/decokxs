package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43251rlk {
    public static /* synthetic */ InterfaceC43264rlx logger$default(java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "IMC";
        }
        return AEQbTJ(str);
    }

    public static final InterfaceC43264rlx AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C43248rlh.KWHzl.copydefault(str);
    }

    public static final <S extends InterfaceC43216rlB> S OLrzqt(@NotNull java.lang.Class<S> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return (S) C43248rlh.KWHzl.OLrzqt(cls);
    }

    public static final <S extends InterfaceC43216rlB> S OLrzqt(@NotNull InterfaceC56551yJo<S> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        return (S) OLrzqt(yHE.OLrzqt(interfaceC56551yJo));
    }

    public static final <S extends InterfaceC43217rlC> S copydefault(@NotNull java.lang.Class<S> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return (S) C43248rlh.KWHzl.AEQbTJ(cls);
    }

    public static final <S extends InterfaceC43217rlC> S AEQbTJ(@NotNull InterfaceC56551yJo<S> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        return (S) copydefault(yHE.OLrzqt(interfaceC56551yJo));
    }

    public static final <E extends InterfaceC43295rmb> java.util.List<E> KWHzl(@NotNull java.lang.Class<E> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        InterfaceC43298rme interfaceC43298rme = (InterfaceC43298rme) OLrzqt(InterfaceC43298rme.class);
        if (interfaceC43298rme != null) {
            return interfaceC43298rme.KWHzl(cls);
        }
        return null;
    }

    public static final <E extends InterfaceC43295rmb> java.util.List<E> KWHzl(@NotNull InterfaceC56551yJo<E> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        return KWHzl(yHE.OLrzqt(interfaceC56551yJo));
    }

    public static final <T, R> InterfaceC43218rlD<T, R> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return OLrzqt((kotlin.Pair<java.lang.String, java.lang.String>) C56390yDp.OLrzqt(str, str2));
    }

    public static final <T, R> InterfaceC43218rlD<T, R> OLrzqt(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        InterfaceC43219rlE interfaceC43219rlE = (InterfaceC43219rlE) OLrzqt(InterfaceC43219rlE.class);
        if (interfaceC43219rlE != null) {
            return interfaceC43219rlE.OLrzqt(pair.getFirst(), pair.getSecond());
        }
        return null;
    }
}
