package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wUt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52690wUt {
    public static final C52690wUt copydefault = new C52690wUt();

    private C52690wUt() {
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        for (java.lang.String str : strArr) {
            try {
                fragmentManager.clearFragmentResultListener(str);
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
