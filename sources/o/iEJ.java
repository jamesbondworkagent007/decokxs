package o;

import com.okinc.business.invest_biz.data.contants.HealthRateLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEJ {
    public static final Application Companion = new Application(null);
    public static final iEJ KWHzl = new iEJ(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    public final HealthRateLevel AEQbTJ;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public iEJ() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ iEJ copy$default(iEJ iej, HealthRateLevel healthRateLevel, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            healthRateLevel = iej.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = iej.OLrzqt;
        }
        return iej.AEQbTJ(healthRateLevel, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iEJ AEQbTJ(@NotNull HealthRateLevel healthRateLevel, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(healthRateLevel, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new iEJ(healthRateLevel, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iEJ)) {
            return false;
        }
        iEJ iej = (iEJ) obj;
        return this.AEQbTJ == iej.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) iej.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProtocolHealth(level=" + this.AEQbTJ + ", rate=" + this.OLrzqt + ")";
    }

    public iEJ(@NotNull HealthRateLevel healthRateLevel, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(healthRateLevel, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = healthRateLevel;
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.contants.HealthRateLevel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.contants.HealthRateLevel:0x0004: SGET  A[WRAPPED] (LINE:43) com.okinc.business.invest_biz.data.contants.HealthRateLevel.Unknown com.okinc.business.invest_biz.data.contants.HealthRateLevel) : (r1v0 com.okinc.business.invest_biz.data.contants.HealthRateLevel))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(com.okinc.business.invest_biz.data.contants.HealthRateLevel, java.lang.String):void (m)] (LINE:42) call: o.iEJ.<init>(com.okinc.business.invest_biz.data.contants.HealthRateLevel, java.lang.String):void type: THIS */
    public /* synthetic */ iEJ(HealthRateLevel healthRateLevel, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HealthRateLevel.Unknown : healthRateLevel, (i & 2) != 0 ? "" : str);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iEJ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
