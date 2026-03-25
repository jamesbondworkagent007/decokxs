package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xkZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55470xkZ extends C55525xlb {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xkZ.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC55470xkZ(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC55470xkZ() {
    }

    /* JADX INFO: renamed from: o.xkZ$StateListAnimator */
    public static final class StateListAnimator extends AbstractC55470xkZ {
        public final java.lang.String AYXKKw;
        public final java.lang.String AkhnZx;
        public final java.lang.String AuCTel;
        public final long DbNXlk;
        public final java.lang.String ejfBZ;
        public final boolean fARcdN;
        public final java.lang.String fIwbmz;
        public final java.lang.String fJNWhG;
        public final java.lang.String fetchVPNInfo;
        public final java.lang.String gEmmrt;
        public java.lang.String isConnected;
        public java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, null, null, null, null, null, null, null, false, null, null, 2047, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z, @NotNull java.lang.String str9, java.lang.String str10) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            return new StateListAnimator(str, str2, str3, str4, str5, str6, str7, str8, z, str9, str10);
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
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) stateListAnimator.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) stateListAnimator.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) stateListAnimator.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) stateListAnimator.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) stateListAnimator.ejfBZ) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) stateListAnimator.values) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) stateListAnimator.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) stateListAnimator.fIwbmz) && this.fARcdN == stateListAnimator.fARcdN && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) stateListAnimator.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) stateListAnimator.AuCTel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fetchVPNInfo() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.fetchVPNInfo.hashCode();
            int iHashCode2 = this.gEmmrt.hashCode();
            int iHashCode3 = this.AYXKKw.hashCode();
            int iHashCode4 = this.fJNWhG.hashCode();
            int iHashCode5 = this.ejfBZ.hashCode();
            int iHashCode6 = this.values.hashCode();
            int iHashCode7 = this.isConnected.hashCode();
            int iHashCode8 = this.fIwbmz.hashCode();
            int iHashCode9 = java.lang.Boolean.hashCode(this.fARcdN);
            int iHashCode10 = this.AkhnZx.hashCode();
            java.lang.String str = this.AuCTel;
            return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WaitOnlineItem(imageUrl=" + this.fetchVPNInfo + ", coinName=" + this.gEmmrt + ", baseCoinName=" + this.AYXKKw + ", onlineTime=" + this.fJNWhG + ", waitOnlineTime=" + this.ejfBZ + ", noticeUrlCn=" + this.values + ", noticeUrlEn=" + this.isConnected + ", type=" + this.fIwbmz + ", tradeReady=" + this.fARcdN + ", displayId=" + this.AkhnZx + ", ruleType=" + this.AuCTel + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r21v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:31) call: o.xkZ.StateListAnimator.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, boolean z, java.lang.String str9, java.lang.String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? true : z, (i & 512) != 0 ? "" : str9, (i & 1024) == 0 ? str10 : "");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z, @NotNull java.lang.String str9, java.lang.String str10) {
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
            this.fetchVPNInfo = str;
            this.gEmmrt = str2;
            this.AYXKKw = str3;
            this.fJNWhG = str4;
            this.ejfBZ = str5;
            this.values = str6;
            this.isConnected = str7;
            this.fIwbmz = str8;
            this.fARcdN = z;
            this.AkhnZx = str9;
            this.AuCTel = str10;
            this.DbNXlk = android.os.SystemClock.elapsedRealtime();
        }

        public final long valueOf() {
            long j = 1000;
            long jValueOf = (C33129mqd.valueOf(this.fJNWhG) - java.lang.System.currentTimeMillis()) / j;
            if (java.lang.Math.abs(jValueOf - C33129mqd.valueOf(this.ejfBZ)) < 100) {
                return jValueOf;
            }
            return C33129mqd.valueOf(this.ejfBZ) - ((android.os.SystemClock.elapsedRealtime() - this.DbNXlk) / j);
        }

        public final long AYXKKw() {
            return (valueOf() * ((long) 1000)) + java.lang.System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: o.xkZ$ActionBar */
    public static final class ActionBar extends AbstractC55470xkZ implements InterfaceC40516qYt {
        public final java.lang.String AYXKKw;
        public final java.lang.String AkhnZx;
        public final boolean AuCTel;
        public final java.lang.String DbNXlk;
        public final java.lang.String ejfBZ;
        public final java.lang.String fARcdN;
        public final java.lang.Object fIwbmz;
        public final java.lang.String fJNWhG;
        public final java.lang.String fetchVPNInfo;
        public final java.lang.String gEmmrt;
        public final java.lang.String hDKMBd;
        public final java.lang.String isConnected;
        public final java.lang.String uzCIH;
        public final java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Object DbNXlk() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, boolean z, java.lang.Object obj, @NotNull java.lang.String str8, java.lang.String str9, @NotNull java.lang.String str10) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str10, "");
            return new ActionBar(str, str2, str3, str4, str5, str6, str7, z, obj, str8, str9, str10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.DbNXlk;
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
            return Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) actionBar.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) actionBar.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) actionBar.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) actionBar.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) actionBar.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) actionBar.values) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) actionBar.ejfBZ) && this.AuCTel == actionBar.AuCTel && Intrinsics.EZpvd(this.fIwbmz, actionBar.fIwbmz) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) actionBar.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.hDKMBd, (java.lang.Object) actionBar.hDKMBd) && Intrinsics.EZpvd((java.lang.Object) this.uzCIH, (java.lang.Object) actionBar.uzCIH);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fARcdN() {
            return this.uzCIH;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fJNWhG() {
            return this.hDKMBd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean fetchVPNInfo() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.fetchVPNInfo;
            int iHashCode = str == null ? 0 : str.hashCode();
            int iHashCode2 = this.isConnected.hashCode();
            int iHashCode3 = this.AYXKKw.hashCode();
            int iHashCode4 = this.gEmmrt.hashCode();
            int iHashCode5 = this.fARcdN.hashCode();
            int iHashCode6 = this.values.hashCode();
            int iHashCode7 = this.ejfBZ.hashCode();
            int iHashCode8 = java.lang.Boolean.hashCode(this.AuCTel);
            java.lang.Object obj = this.fIwbmz;
            int iHashCode9 = obj == null ? 0 : obj.hashCode();
            int iHashCode10 = this.DbNXlk.hashCode();
            java.lang.String str2 = this.hDKMBd;
            return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.uzCIH.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC40516qYt
        public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NewCoinItem(instType=" + this.fetchVPNInfo + ", imageUrl=" + this.isConnected + ", coinName=" + this.AYXKKw + ", baseCoinName=" + this.gEmmrt + ", onlineTime=" + this.fARcdN + ", lastPrice=" + this.values + ", riseFallDownValue=" + this.ejfBZ + ", pricePercentZero=" + this.AuCTel + ", rawCoinItemPo=" + this.fIwbmz + ", displayId=" + this.DbNXlk + ", ruleType=" + this.hDKMBd + ", state=" + this.uzCIH + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x001d: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r25v0 java.lang.Object))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Object, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:62) call: o.xkZ.ActionBar.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Object, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z, java.lang.Object obj, java.lang.String str8, java.lang.String str9, java.lang.String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, str3, str4, str5, str6, str7, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : obj, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, boolean z, java.lang.Object obj, @NotNull java.lang.String str8, java.lang.String str9, @NotNull java.lang.String str10) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str10, "");
            this.fetchVPNInfo = str;
            this.isConnected = str2;
            this.AYXKKw = str3;
            this.gEmmrt = str4;
            this.fARcdN = str5;
            this.values = str6;
            this.ejfBZ = str7;
            this.AuCTel = z;
            this.fIwbmz = obj;
            this.DbNXlk = str8;
            this.hDKMBd = str9;
            this.uzCIH = str10;
            this.fJNWhG = pXE.OLrzqt(C33129mqd.valueOf(str5));
            this.AkhnZx = pTB.formatLocalized$default(str6, null, 1, null);
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return (interfaceC40516qYt instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) copydefault(), (java.lang.Object) ((ActionBar) interfaceC40516qYt).copydefault());
        }
    }

    /* JADX INFO: renamed from: o.xkZ$Application */
    public static final class Application extends AbstractC55470xkZ {
        public final int AYXKKw;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(0, 1, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = application.AYXKKw;
            }
            return application.EZpvd(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(int i) {
            return new Application(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && this.AYXKKw == ((Application) obj).AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.AYXKKw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ShowAllItem(positionPage=" + this.AYXKKw + ")";
        }

        public Application(int i) {
            super(null);
            this.AYXKKw = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:96) call: o.xkZ.Application.<init>(int):void type: THIS */
        public /* synthetic */ Application(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }
    }
}
