package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ygX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57337ygX {
    public static final void OLrzqt(@NotNull InterfaceC43220rlF interfaceC43220rlF, @NotNull java.lang.String str, @NotNull java.util.Set<java.lang.String> set, @NotNull InterfaceC56387yDm<? extends AbstractC57329ygP> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(interfaceC43220rlF, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            interfaceC43220rlF.AEQbTJ(str, (java.lang.String) it.next(), interfaceC56387yDm);
        }
    }

    public static final void EZpvd(@NotNull InterfaceC43220rlF interfaceC43220rlF, @NotNull InterfaceC57335ygV interfaceC57335ygV) {
        Intrinsics.checkNotNullParameter(interfaceC43220rlF, "");
        Intrinsics.checkNotNullParameter(interfaceC57335ygV, "");
        java.lang.String strKWHzl = interfaceC57335ygV.KWHzl();
        java.util.Iterator<T> it = interfaceC57335ygV.EZpvd().iterator();
        while (it.hasNext()) {
            interfaceC43220rlF.AEQbTJ(strKWHzl, (java.lang.String) it.next(), interfaceC57335ygV.copydefault());
        }
    }
}
