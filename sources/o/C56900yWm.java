package o;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.PointerIconCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yWm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56900yWm {
    public static final C56900yWm AEQbTJ;
    public static final C56900yWm AYXKKw;
    public static final C56900yWm AhwBna;
    public static final C56900yWm EZpvd;
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public static final C56900yWm OLrzqt;
    public static final C56900yWm copydefault;
    public static final C56900yWm djBIcL;
    public static final C56900yWm gEmmrt;
    public static final C56900yWm valueOf;
    public final C56900yWm AkhnZx;
    public final boolean AuCTel;
    public final boolean DbNXlk;
    public final boolean ejfBZ;
    public final boolean fARcdN;
    public final boolean fIwbmz;
    public final boolean fJNWhG;
    public final C56900yWm fetchVPNInfo;
    public final C56900yWm isConnected;
    public final boolean values;

    /* JADX INFO: renamed from: o.yWm$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.INVARIANT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56900yWm() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.fIwbmz;
    }

    public C56900yWm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C56900yWm c56900yWm, boolean z6, C56900yWm c56900yWm2, C56900yWm c56900yWm3, boolean z7) {
        this.fJNWhG = z;
        this.AuCTel = z2;
        this.DbNXlk = z3;
        this.ejfBZ = z4;
        this.fARcdN = z5;
        this.fetchVPNInfo = c56900yWm;
        this.values = z6;
        this.AkhnZx = c56900yWm2;
        this.isConnected = c56900yWm3;
        this.fIwbmz = z7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C56900yWm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C56900yWm c56900yWm, boolean z6, C56900yWm c56900yWm2, C56900yWm c56900yWm3, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z8 = (i & 1) != 0 ? true : z;
        boolean z9 = (i & 2) != 0 ? true : z2;
        boolean z10 = (i & 4) != 0 ? false : z3;
        boolean z11 = (i & 8) != 0 ? false : z4;
        boolean z12 = (i & 16) != 0 ? false : z5;
        C56900yWm c56900yWm4 = (i & 32) != 0 ? null : c56900yWm;
        this(z8, z9, z10, z11, z12, c56900yWm4, (i & 64) == 0 ? z6 : true, (i & 128) != 0 ? c56900yWm4 : c56900yWm2, (i & 256) != 0 ? c56900yWm4 : c56900yWm3, (i & 512) == 0 ? z7 : false);
    }

    /* JADX INFO: renamed from: o.yWm$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yWm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    static {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        C56900yWm c56900yWm = null;
        boolean z5 = false;
        C56900yWm c56900yWm2 = null;
        C56900yWm c56900yWm3 = null;
        boolean z6 = false;
        DefaultConstructorMarker defaultConstructorMarker = null;
        C56900yWm c56900yWm4 = new C56900yWm(z, false, z2, z3, z4, c56900yWm, z5, c56900yWm2, c56900yWm3, z6, 1023, defaultConstructorMarker);
        EZpvd = c56900yWm4;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        C56900yWm c56900yWm5 = null;
        C56900yWm c56900yWm6 = null;
        boolean z13 = true;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        C56900yWm c56900yWm7 = new C56900yWm(z7, z8, z9, z10, z11, null, z12, c56900yWm5, c56900yWm6, z13, FrameMetricsAggregator.EVERY_DURATION, defaultConstructorMarker2);
        gEmmrt = c56900yWm7;
        AhwBna = new C56900yWm(z, true, z2, z3, z4, c56900yWm, z5, c56900yWm2, c56900yWm3, z6, PointerIconCompat.TYPE_GRABBING, defaultConstructorMarker);
        int i = 988;
        OLrzqt = new C56900yWm(z, false, z2, z3, z4, c56900yWm4, z5, c56900yWm2, c56900yWm3, z6, i, defaultConstructorMarker);
        AEQbTJ = new C56900yWm(z7, z8, z9, z10, z11, c56900yWm7, z12, c56900yWm5, c56900yWm6, z13, 476, defaultConstructorMarker2);
        copydefault = new C56900yWm(z, true, z2, z3, z4, c56900yWm4, z5, c56900yWm2, c56900yWm3, z6, i, defaultConstructorMarker);
        boolean z14 = false;
        boolean z15 = true;
        djBIcL = new C56900yWm(z, z14, z2, z15, z4, c56900yWm4, z5, c56900yWm2, c56900yWm3, z6, 983, defaultConstructorMarker);
        AYXKKw = new C56900yWm(z, z14, z2, z15, z4, c56900yWm4, z5, c56900yWm2, c56900yWm3, z6, 919, defaultConstructorMarker);
        valueOf = new C56900yWm(z, z14, true, false, z4, c56900yWm4, z5, c56900yWm2, c56900yWm3, z6, 984, defaultConstructorMarker);
    }

    public final C56900yWm EZpvd(@NotNull Variance variance, boolean z) {
        Intrinsics.checkNotNullParameter(variance, "");
        if (!z || !this.DbNXlk) {
            int i = StateListAnimator.AEQbTJ[variance.ordinal()];
            if (i == 1) {
                C56900yWm c56900yWm = this.AkhnZx;
                if (c56900yWm != null) {
                    return c56900yWm;
                }
            } else if (i != 2) {
                C56900yWm c56900yWm2 = this.fetchVPNInfo;
                if (c56900yWm2 != null) {
                    return c56900yWm2;
                }
            } else {
                C56900yWm c56900yWm3 = this.isConnected;
                if (c56900yWm3 != null) {
                    return c56900yWm3;
                }
            }
        }
        return this;
    }

    public final C56900yWm gEmmrt() {
        return new C56900yWm(this.fJNWhG, true, this.DbNXlk, this.ejfBZ, this.fARcdN, this.fetchVPNInfo, this.values, this.AkhnZx, this.isConnected, false, 512, null);
    }
}
