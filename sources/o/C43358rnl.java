package o;

import com.okinc.network.okg.core.ThreadPoolType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43358rnl {
    public final C43356rnj EZpvd = new C43356rnj();
    public final C43355rni AEQbTJ = new C43355rni();
    public final C43364rnr copydefault = new C43364rnr();
    public final C43353rng KWHzl = new C43353rng();

    /* JADX INFO: renamed from: o.rnl$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ThreadPoolType.values().length];
            try {
                iArr[ThreadPoolType.DOH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ThreadPoolType.HTTP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ThreadPoolType.WEBSOCKET.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ThreadPoolType.OTHER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    public InterfaceC43351rne AEQbTJ(@NotNull ThreadPoolType threadPoolType) {
        Intrinsics.checkNotNullParameter(threadPoolType, "");
        int i = Activity.OLrzqt[threadPoolType.ordinal()];
        if (i == 1) {
            return this.AEQbTJ;
        }
        if (i == 2) {
            return this.KWHzl;
        }
        if (i == 3) {
            return this.copydefault;
        }
        if (i == 4) {
            return this.EZpvd;
        }
        throw new NoWhenBranchMatchedException();
    }
}
