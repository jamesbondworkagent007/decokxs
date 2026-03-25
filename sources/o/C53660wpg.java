package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53660wpg extends vNA<Activity, java.lang.Boolean> {
    public static final Application Companion = new Application(null);

    @yCM
    public C53660wpg() {
    }

    /* JADX INFO: renamed from: o.wpg$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wpg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C53660wpg EZpvd() {
            return ((InterfaceC51009vet) C58114yvF.OLrzqt(C32979mnm.EZpvd.OLrzqt(), InterfaceC51009vet.class)).RAQtXZ();
        }
    }

    /* JADX INFO: renamed from: o.wpg$Activity */
    public static final class Activity {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.AEQbTJ;
            }
            return activity.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((Activity) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(ordType=" + this.AEQbTJ + ")";
        }

        public Activity(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    @Override // o.vNA
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Boolean KWHzl(@NotNull Activity activity) {
        boolean z;
        Intrinsics.checkNotNullParameter(activity, "");
        java.lang.String strOLrzqt = activity.OLrzqt();
        switch (strOLrzqt.hashCode()) {
            case -1831183611:
                z = strOLrzqt.equals("spot_dca");
                break;
            case -1402017003:
                if (!strOLrzqt.equals("contract_dca")) {
                }
                break;
            case -1216369070:
                if (!strOLrzqt.equals("smart_portfolio")) {
                }
                break;
            case -1086683216:
                if (!strOLrzqt.equals("signal_bot")) {
                }
                break;
            case -557961837:
                if (!strOLrzqt.equals("smart_arbitrage")) {
                }
                break;
            case -512749997:
                if (!strOLrzqt.equals("contract_grid")) {
                }
                break;
            case 3181382:
                if (!strOLrzqt.equals("grid")) {
                }
                break;
            case 1165749981:
                if (!strOLrzqt.equals("recurring")) {
                }
                break;
            case 1485620813:
                if (!strOLrzqt.equals("dcd_bot")) {
                }
                break;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
