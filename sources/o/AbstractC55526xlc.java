package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xlc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55526xlc extends C55525xlb {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xlc.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC55526xlc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC55526xlc() {
    }

    /* JADX INFO: renamed from: o.xlc$ActionBar */
    public static final class ActionBar extends AbstractC55526xlc {
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
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11) {
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
            return new ActionBar(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) actionBar.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) actionBar.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) actionBar.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) actionBar.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) actionBar.fIwbmz) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) actionBar.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) actionBar.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) actionBar.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) actionBar.ejfBZ) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) actionBar.values) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) actionBar.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fetchVPNInfo() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((this.DbNXlk.hashCode() * 31) + this.AYXKKw.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.fIwbmz.hashCode()) * 31) + this.AuCTel.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.fJNWhG.hashCode()) * 31) + this.ejfBZ.hashCode()) * 31) + this.values.hashCode()) * 31) + this.gEmmrt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PercentChangeItem(coinName=" + this.DbNXlk + ", baseCoinName=" + this.AYXKKw + ", heat=" + this.AkhnZx + ", lastPrice=" + this.isConnected + ", subPrice=" + this.fIwbmz + ", riseFallDownValue=" + this.AuCTel + ", icon=" + this.fetchVPNInfo + ", volume=" + this.fJNWhG + ", turnOver=" + this.ejfBZ + ", newFullName=" + this.values + ", ccy=" + this.gEmmrt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.gEmmrt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11) {
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
            this.DbNXlk = str;
            this.AYXKKw = str2;
            this.AkhnZx = str3;
            this.isConnected = str4;
            this.fIwbmz = str5;
            this.AuCTel = str6;
            this.fetchVPNInfo = str7;
            this.fJNWhG = str8;
            this.ejfBZ = str9;
            this.values = str10;
            this.gEmmrt = str11;
        }
    }

    /* JADX INFO: renamed from: o.xlc$TaskDescription */
    public static final class TaskDescription extends AbstractC55526xlc {
        public final int gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(0, 1, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.gEmmrt;
            }
            return taskDescription.EZpvd(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(int i) {
            return new TaskDescription(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && this.gEmmrt == ((TaskDescription) obj).gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowAllItem(positionPage=" + this.gEmmrt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.gEmmrt;
        }

        public TaskDescription(int i) {
            super(null);
            this.gEmmrt = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:43) call: o.xlc.TaskDescription.<init>(int):void type: THIS */
        public /* synthetic */ TaskDescription(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }
    }
}
