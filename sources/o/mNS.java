package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mNS {
    public static ActionBar KWHzl;
    public static final mNS copydefault = new mNS();
    public static final int OLrzqt = 8;

    public interface ActionBar {
        void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

        void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2);

        void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

        void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map);
    }

    private mNS() {
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        ActionBar actionBar = KWHzl;
        if (actionBar != null) {
            actionBar.copydefault(str, str2, str3, str4);
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ActionBar actionBar = KWHzl;
        if (actionBar != null) {
            actionBar.KWHzl(str, str2);
        }
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        ActionBar actionBar = KWHzl;
        if (actionBar != null) {
            actionBar.AEQbTJ(str, str2, str3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mNS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void outputE2EMemoryLeakAPM$default(mNS mns, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "low";
        }
        if ((i & 4) != 0) {
            str3 = "memory_leak";
        }
        if ((i & 8) != 0) {
            map = C56424yEw.KWHzl();
        }
        mns.copydefault(str, str2, str3, map);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        ActionBar actionBar = KWHzl;
        if (actionBar != null) {
            actionBar.copydefault(str, str2, str3, map);
        }
    }
}
