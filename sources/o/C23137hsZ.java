package o;

import com.okinc.business.dexlogic.main.swap.trade.viewmodel.util.CacheStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hsZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23137hsZ {
    public kotlin.Pair<java.lang.String, ? extends CacheStatus> EZpvd = C56390yDp.OLrzqt("", CacheStatus.NONE);

    /* JADX INFO: renamed from: o.hsZ$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CacheStatus.values().length];
            try {
                iArr[CacheStatus.YES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CacheStatus.NO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull CacheStatus cacheStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cacheStatus, "");
        this.EZpvd = C56390yDp.OLrzqt(str, cacheStatus);
    }

    public final CacheStatus KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.EZpvd.getFirst())) {
            return this.EZpvd.getSecond();
        }
        CacheStatus cacheStatus = CacheStatus.NONE;
        this.EZpvd = C56390yDp.OLrzqt(str, cacheStatus);
        return cacheStatus;
    }

    public final void EZpvd() {
        this.EZpvd = C56390yDp.OLrzqt("", CacheStatus.NONE);
    }

    public final boolean copydefault(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = TaskDescription.copydefault[KWHzl(str).ordinal()];
        return i != 1 ? i != 2 && z && z2 : z;
    }
}
