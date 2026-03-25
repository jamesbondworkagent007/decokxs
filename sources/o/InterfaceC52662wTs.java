package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wTs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC52662wTs extends LifecycleOwner {
    void DbNXlk();

    void EZpvd(@NotNull TacticsData tacticsData);

    TradeLiveData<java.util.ArrayList<java.lang.Object>> OLrzqt();

    void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void bz_();

    void copydefault(@NotNull java.lang.String str, int i, boolean z);

    void fARcdN();

    void gEmmrt();

    /* JADX INFO: renamed from: o.wTs$TaskDescription */
    public static final class TaskDescription {
        public static void AEQbTJ(@NotNull InterfaceC52662wTs interfaceC52662wTs) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void EZpvd(@NotNull InterfaceC52662wTs interfaceC52662wTs, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
        }

        public static void KWHzl(@NotNull InterfaceC52662wTs interfaceC52662wTs) {
        }

        public static void copydefault(@NotNull InterfaceC52662wTs interfaceC52662wTs) {
        }

        public static /* synthetic */ void showSnackbar$default(InterfaceC52662wTs interfaceC52662wTs, java.lang.String str, int i, boolean z, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSnackbar");
            }
            if ((i2 & 4) != 0) {
                z = false;
            }
            interfaceC52662wTs.copydefault(str, i, z);
        }
    }
}
