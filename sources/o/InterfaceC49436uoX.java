package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uoX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49436uoX {
    android.view.View AEQbTJ();

    void EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, boolean z2);

    androidx.fragment.app.FragmentManager copydefault();

    /* JADX INFO: renamed from: o.uoX$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void AEQbTJ(@NotNull InterfaceC49436uoX interfaceC49436uoX, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
        }

        public static androidx.fragment.app.FragmentManager KWHzl(@NotNull InterfaceC49436uoX interfaceC49436uoX) {
            return null;
        }

        public static /* synthetic */ void switchCoinCall$default(InterfaceC49436uoX interfaceC49436uoX, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchCoinCall");
            }
            if ((i & 16) != 0) {
                z = true;
            }
            boolean z3 = z;
            if ((i & 32) != 0) {
                z2 = false;
            }
            interfaceC49436uoX.EZpvd(str, str2, str3, str4, z3, z2);
        }
    }
}
