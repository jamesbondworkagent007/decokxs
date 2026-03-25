package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface xWS extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, long j);

    void EZpvd(@NotNull android.content.Context context, boolean z, boolean z2);

    void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, Function0<Unit> function0);

    void KWHzl(@NotNull android.content.Context context, boolean z, android.os.Bundle bundle);

    void KWHzl(@NotNull android.content.Context context, boolean z, boolean z2);

    void OLrzqt(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, Function0<Unit> function0);

    void OLrzqt(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, long j, java.lang.String str2);

    Function0<Unit> aT_();

    public static final class Application {
        public static /* synthetic */ void routeScanActivity$default(xWS xws, android.content.Context context, boolean z, boolean z2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeScanActivity");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            xws.KWHzl(context, z, z2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xWS */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void routeBackupWallet$default(xWS xws, AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeBackupWallet");
            }
            if ((i & 8) != 0) {
                function0 = null;
            }
            xws.OLrzqt(abstractActivityC33041mov, fragmentManager, str, (Function0<Unit>) function0);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xWS */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void routeBackupWallet$default(xWS xws, AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC9738bbJ interfaceC9738bbJ, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeBackupWallet");
            }
            if ((i & 8) != 0) {
                function0 = null;
            }
            xws.EZpvd(abstractActivityC33041mov, fragmentManager, interfaceC9738bbJ, function0);
        }

        public static /* synthetic */ void routeProfileAssetPage$default(xWS xws, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, long j, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeProfileAssetPage");
            }
            if ((i & 4) != 0) {
                j = Long.MIN_VALUE;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                str2 = null;
            }
            xws.OLrzqt(abstractActivityC33041mov, str, j2, str2);
        }

        public static /* synthetic */ void routeProfileAssetPage$default(xWS xws, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, long j, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeProfileAssetPage");
            }
            if ((i & 4) != 0) {
                j = Long.MIN_VALUE;
            }
            xws.AEQbTJ(abstractActivityC33041mov, str, j);
        }
    }
}
