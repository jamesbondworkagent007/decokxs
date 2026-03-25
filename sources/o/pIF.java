package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pIF {
    public static /* synthetic */ void log$default(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        OLrzqt(str, z, str2, str3);
    }

    public static final void OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        java.lang.String str4;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str3.length() > 0) {
            str4 = str2 + str + "[" + str3 + "]";
        } else {
            str4 = str2 + str;
        }
        if (z) {
            C38002pIp.Companion.iwGUEr().KWHzl("Monitor.Dionysus", str4);
        } else {
            C38002pIp.Companion.iwGUEr().OLrzqt("Monitor.Dionysus", str4);
        }
    }
}
