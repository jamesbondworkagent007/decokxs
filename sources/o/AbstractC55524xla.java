package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xla, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55524xla extends C55525xlb {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xla.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC55524xla(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC55524xla() {
    }

    /* JADX INFO: renamed from: o.xla$Application */
    public static final class Application extends AbstractC55524xla {
        public final java.lang.String AYXKKw;
        public final java.lang.String AkhnZx;
        public final java.lang.String AuCTel;
        public final java.lang.String DbNXlk;
        public final java.lang.String ejfBZ;
        public final java.lang.String fIwbmz;
        public final java.lang.String fJNWhG;
        public final java.lang.String fetchVPNInfo;
        public final java.lang.String gEmmrt;
        public final java.lang.String isConnected;
        public final java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            return new Application(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) application.values) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) application.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) application.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) application.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) application.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) application.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) application.ejfBZ) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) application.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) application.fIwbmz) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) application.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) application.AkhnZx);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((this.values.hashCode() * 31) + this.AYXKKw.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.AuCTel.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.ejfBZ.hashCode()) * 31) + this.fJNWhG.hashCode()) * 31) + this.fIwbmz.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AkhnZx.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HotConcernItem(coinName=" + this.values + ", baseCoinName=" + this.AYXKKw + ", heat=" + this.isConnected + ", lastPrice=" + this.DbNXlk + ", riseFallDownValue=" + this.AuCTel + ", icon=" + this.fetchVPNInfo + ", volume=" + this.ejfBZ + ", turnOver=" + this.fJNWhG + ", newFullName=" + this.fIwbmz + ", ccy=" + this.gEmmrt + ", displayId=" + this.AkhnZx + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.fJNWhG;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            this.values = str;
            this.AYXKKw = str2;
            this.isConnected = str3;
            this.DbNXlk = str4;
            this.AuCTel = str5;
            this.fetchVPNInfo = str6;
            this.ejfBZ = str7;
            this.fJNWhG = str8;
            this.fIwbmz = str9;
            this.gEmmrt = str10;
            this.AkhnZx = str11;
        }
    }

    /* JADX INFO: renamed from: o.xla$StateListAnimator */
    public static final class StateListAnimator extends AbstractC55524xla {
        public final int AYXKKw;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(0, 1, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = stateListAnimator.AYXKKw;
            }
            return stateListAnimator.OLrzqt(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(int i) {
            return new StateListAnimator(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && this.AYXKKw == ((StateListAnimator) obj).AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.AYXKKw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowAllItem(positionPage=" + this.AYXKKw + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.AYXKKw;
        }

        public StateListAnimator(int i) {
            super(null);
            this.AYXKKw = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:39) call: o.xla.StateListAnimator.<init>(int):void type: THIS */
        public /* synthetic */ StateListAnimator(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }
    }
}
