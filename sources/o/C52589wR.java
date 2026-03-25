package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C52589wR {
    /* JADX INFO: renamed from: AuthOption-Jh0Pmzk$default, reason: not valid java name */
    public static /* synthetic */ InterfaceC52616wS m8783AuthOptionJh0Pmzk$default(java.lang.String str, InterfaceC57843yq interfaceC57843yq, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC57843yq = C58108yv.copydefault();
        }
        return copydefault(str, interfaceC57843yq);
    }

    public static final InterfaceC52616wS copydefault(@NotNull java.lang.String str, @NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        return new C52535wP(str, interfaceC57843yq, null);
    }
}
