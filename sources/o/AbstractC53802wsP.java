package o;

import com.okinc.tradingbot.impl.dto.ContractDcaExtendInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wsP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC53802wsP {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wsP.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC53802wsP(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String OLrzqt();

    private AbstractC53802wsP() {
    }

    /* JADX INFO: renamed from: o.wsP$Application */
    public static final class Application extends AbstractC53802wsP {
        public final int AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String AkhnZx;
        public final java.lang.String DbNXlk;
        public final android.graphics.drawable.Drawable EZpvd;
        public final boolean KWHzl;
        public final java.lang.String OLrzqt;
        public final ContractDcaExtendInfo copydefault;
        public final boolean djBIcL;
        public final java.lang.String fetchVPNInfo;
        public final int gEmmrt;
        public final int isConnected;
        public final boolean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.graphics.drawable.Drawable AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AkhnZx() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContractDcaExtendInfo EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC53802wsP
        public java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, boolean z, @NotNull java.lang.String str5, @androidx.annotation.ColorInt int i, @NotNull java.lang.String str6, @androidx.annotation.ColorInt int i2, boolean z2, @androidx.annotation.ColorInt int i3, android.graphics.drawable.Drawable drawable, ContractDcaExtendInfo contractDcaExtendInfo, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new Application(str, str2, str3, str4, z, str5, i, str6, i2, z2, i3, drawable, contractDcaExtendInfo, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
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
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) application.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) application.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) application.AkhnZx) && this.KWHzl == application.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) application.fetchVPNInfo) && this.isConnected == application.isConnected && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) application.AYXKKw) && this.gEmmrt == application.gEmmrt && this.djBIcL == application.djBIcL && this.AEQbTJ == application.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && Intrinsics.EZpvd(this.copydefault, application.copydefault) && this.valueOf == application.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.AhwBna.hashCode();
            int iHashCode3 = this.DbNXlk.hashCode();
            java.lang.String str = this.AkhnZx;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            int iHashCode5 = java.lang.Boolean.hashCode(this.KWHzl);
            int iHashCode6 = this.fetchVPNInfo.hashCode();
            int iHashCode7 = java.lang.Integer.hashCode(this.isConnected);
            int iHashCode8 = this.AYXKKw.hashCode();
            int iHashCode9 = java.lang.Integer.hashCode(this.gEmmrt);
            int iHashCode10 = java.lang.Boolean.hashCode(this.djBIcL);
            int iHashCode11 = java.lang.Integer.hashCode(this.AEQbTJ);
            android.graphics.drawable.Drawable drawable = this.EZpvd;
            int iHashCode12 = drawable == null ? 0 : drawable.hashCode();
            ContractDcaExtendInfo contractDcaExtendInfo = this.copydefault;
            return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (contractDcaExtendInfo != null ? contractDcaExtendInfo.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.valueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Order(id=" + this.OLrzqt + ", ordId=" + this.AhwBna + ", title=" + this.DbNXlk + ", status=" + this.AkhnZx + ", enableCancelOrder=" + this.KWHzl + ", value=" + this.fetchVPNInfo + ", textColor=" + this.isConnected + ", orderTag=" + this.AYXKKw + ", lineColor=" + this.gEmmrt + ", isDottedLine=" + this.djBIcL + ", dotColor=" + this.AEQbTJ + ", dotDrawable=" + this.EZpvd + ", contractDcaExtendInfo=" + this.copydefault + ", isDetailsShown=" + this.valueOf + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean values() {
            return this.djBIcL;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, boolean z, @NotNull java.lang.String str5, @androidx.annotation.ColorInt int i, @NotNull java.lang.String str6, @androidx.annotation.ColorInt int i2, boolean z2, @androidx.annotation.ColorInt int i3, android.graphics.drawable.Drawable drawable, ContractDcaExtendInfo contractDcaExtendInfo, boolean z3) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.OLrzqt = str;
            this.AhwBna = str2;
            this.DbNXlk = str3;
            this.AkhnZx = str4;
            this.KWHzl = z;
            this.fetchVPNInfo = str5;
            this.isConnected = i;
            this.AYXKKw = str6;
            this.gEmmrt = i2;
            this.djBIcL = z2;
            this.AEQbTJ = i3;
            this.EZpvd = drawable;
            this.copydefault = contractDcaExtendInfo;
            this.valueOf = z3;
        }
    }

    /* JADX INFO: renamed from: o.wsP$Activity */
    public static final class Activity extends AbstractC53802wsP {
        public final int AEQbTJ;
        public final int EZpvd;
        public final java.lang.String KWHzl;
        public final int OLrzqt;
        public final boolean copydefault;
        public final java.lang.String gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                str = activity.KWHzl;
            }
            if ((i4 & 2) != 0) {
                str2 = activity.valueOf;
            }
            java.lang.String str4 = str2;
            if ((i4 & 4) != 0) {
                str3 = activity.gEmmrt;
            }
            java.lang.String str5 = str3;
            if ((i4 & 8) != 0) {
                i = activity.EZpvd;
            }
            int i5 = i;
            if ((i4 & 16) != 0) {
                i2 = activity.AEQbTJ;
            }
            int i6 = i2;
            if ((i4 & 32) != 0) {
                i3 = activity.OLrzqt;
            }
            int i7 = i3;
            if ((i4 & 64) != 0) {
                z = activity.copydefault;
            }
            return activity.KWHzl(str, str4, str5, i5, i6, i7, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new Activity(str, str2, str3, i, i2, i3, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC53802wsP
        public java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) activity.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) activity.gEmmrt) && this.EZpvd == activity.EZpvd && this.AEQbTJ == activity.AEQbTJ && this.OLrzqt == activity.OLrzqt && this.copydefault == activity.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.KWHzl.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Price(id=" + this.KWHzl + ", title=" + this.valueOf + ", value=" + this.gEmmrt + ", bgColor=" + this.EZpvd + ", textColor=" + this.AEQbTJ + ", lineColor=" + this.OLrzqt + ", isDottedLine=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.KWHzl = str;
            this.valueOf = str2;
            this.gEmmrt = str3;
            this.EZpvd = i;
            this.AEQbTJ = i2;
            this.OLrzqt = i3;
            this.copydefault = z;
        }
    }

    /* JADX INFO: renamed from: o.wsP$StateListAnimator */
    public static final class StateListAnimator extends AbstractC53802wsP {
        public final java.lang.String AEQbTJ;
        public final int AYXKKw;
        public final java.lang.String AhwBna;
        public final boolean EZpvd;
        public final int KWHzl;
        public final int OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String djBIcL;
        public final boolean gEmmrt;
        public final int valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, null, null, null, 0, 0, false, false, 0, 0, 1023, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, int i2, boolean z, boolean z2, int i3, int i4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new StateListAnimator(str, str2, str3, str4, i, i2, z, z2, i3, i4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC53802wsP
        public java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) stateListAnimator.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) stateListAnimator.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && this.KWHzl == stateListAnimator.KWHzl && this.AYXKKw == stateListAnimator.AYXKKw && this.EZpvd == stateListAnimator.EZpvd && this.gEmmrt == stateListAnimator.gEmmrt && this.valueOf == stateListAnimator.valueOf && this.OLrzqt == stateListAnimator.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((this.AEQbTJ.hashCode() * 31) + this.djBIcL.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.AYXKKw)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Integer.hashCode(this.valueOf)) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Empty(id=" + this.AEQbTJ + ", title=" + this.djBIcL + ", msg=" + this.AhwBna + ", btnText=" + this.copydefault + ", emptyType=" + this.KWHzl + ", marginTop=" + this.AYXKKw + ", isCenter=" + this.EZpvd + ", matchHeight=" + this.gEmmrt + ", marginBottom=" + this.valueOf + ", image=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0064: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("empty") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r22v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0029: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (96 int) : (r17v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r19v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0042: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 int) : (0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0049: ARITH (r22v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004d: SGET  A[WRAPPED] o.wXj.TaskDescription.gCNefq int) : (r21v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, boolean, int, int):void (m)] (LINE:51) call: o.wsP.StateListAnimator.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, boolean, int, int):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2, boolean z, boolean z2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? "empty" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? "" : str3, (i5 & 8) == 0 ? str4 : "", (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? 96 : i2, (i5 & 64) != 0 ? false : z, (i5 & 128) != 0 ? true : z2, (i5 & 256) == 0 ? i3 : 0, (i5 & 512) != 0 ? C52761wXj.TaskDescription.gCNefq : i4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, int i2, boolean z, boolean z2, int i3, int i4) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.AEQbTJ = str;
            this.djBIcL = str2;
            this.AhwBna = str3;
            this.copydefault = str4;
            this.KWHzl = i;
            this.AYXKKw = i2;
            this.EZpvd = z;
            this.gEmmrt = z2;
            this.valueOf = i3;
            this.OLrzqt = i4;
        }
    }
}
