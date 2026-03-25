package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.balance.domain.FetchBalanceUseCase$execute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uHc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48158uHc extends vNH<StateListAnimator, Activity> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC50055vAf EZpvd;
    public final CoroutineDispatcher KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C48158uHc(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = interfaceC50055vAf;
    }

    /* JADX INFO: renamed from: o.uHc$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uHc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.uHc$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String AkhnZx;
        public final java.lang.String AuCTel;
        public final java.lang.Boolean DbNXlk;
        public final java.lang.Boolean EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.String ejfBZ;
        public final java.lang.String fARcdN;
        public final java.lang.String fIwbmz;
        public final java.lang.String fJNWhG;
        public final java.lang.String fetchVPNInfo;
        public final java.lang.String gEmmrt;
        public final java.lang.String getFieldNames;
        public final java.lang.Boolean hDKMBd;
        public final java.lang.String isConnected;
        public final java.lang.String valueOf;
        public final java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean AkhnZx() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AuCTel() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.Boolean bool2, java.lang.String str14, java.lang.String str15, java.lang.Boolean bool3, @NotNull java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str16, "");
            return new StateListAnimator(str, str2, str3, str4, str5, str6, bool, str7, str8, str9, str10, str11, str12, str13, bool2, str14, str15, bool3, str16, str17, str18, str19);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String ejfBZ() {
            return this.fJNWhG;
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
            return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) stateListAnimator.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) stateListAnimator.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) stateListAnimator.ejfBZ) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) stateListAnimator.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) stateListAnimator.fetchVPNInfo) && Intrinsics.EZpvd(this.DbNXlk, stateListAnimator.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) stateListAnimator.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) stateListAnimator.values) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) stateListAnimator.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) stateListAnimator.fIwbmz) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) stateListAnimator.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) stateListAnimator.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) stateListAnimator.AkhnZx) && Intrinsics.EZpvd(this.hDKMBd, stateListAnimator.hDKMBd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) stateListAnimator.isConnected) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) stateListAnimator.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) stateListAnimator.getFieldNames) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fARcdN() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fIwbmz() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fJNWhG() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fetchVPNInfo() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean hDKMBd() {
            return this.hDKMBd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AhwBna.hashCode();
            int iHashCode2 = this.AYXKKw.hashCode();
            int iHashCode3 = this.ejfBZ.hashCode();
            java.lang.String str = this.fARcdN;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.OLrzqt;
            int iHashCode5 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.fetchVPNInfo;
            int iHashCode6 = str3 == null ? 0 : str3.hashCode();
            java.lang.Boolean bool = this.DbNXlk;
            int iHashCode7 = bool == null ? 0 : bool.hashCode();
            java.lang.String str4 = this.AuCTel;
            int iHashCode8 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.values;
            int iHashCode9 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.djBIcL;
            int iHashCode10 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.fIwbmz;
            int iHashCode11 = str7 == null ? 0 : str7.hashCode();
            java.lang.String str8 = this.valueOf;
            int iHashCode12 = str8 == null ? 0 : str8.hashCode();
            java.lang.String str9 = this.fJNWhG;
            int iHashCode13 = str9 == null ? 0 : str9.hashCode();
            java.lang.String str10 = this.AkhnZx;
            int iHashCode14 = str10 == null ? 0 : str10.hashCode();
            java.lang.Boolean bool2 = this.hDKMBd;
            int iHashCode15 = bool2 == null ? 0 : bool2.hashCode();
            java.lang.String str11 = this.KWHzl;
            int iHashCode16 = str11 == null ? 0 : str11.hashCode();
            java.lang.String str12 = this.isConnected;
            int iHashCode17 = str12 == null ? 0 : str12.hashCode();
            java.lang.Boolean bool3 = this.EZpvd;
            int iHashCode18 = bool3 == null ? 0 : bool3.hashCode();
            int iHashCode19 = this.gEmmrt.hashCode();
            java.lang.String str13 = this.getFieldNames;
            int iHashCode20 = str13 == null ? 0 : str13.hashCode();
            java.lang.String str14 = this.AEQbTJ;
            int iHashCode21 = str14 == null ? 0 : str14.hashCode();
            java.lang.String str15 = this.copydefault;
            return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (str15 == null ? 0 : str15.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(instId=" + this.AhwBna + ", instType=" + this.AYXKKw + ", tdMode=" + this.ejfBZ + ", sourceCcy=" + this.fARcdN + ", ccy=" + this.OLrzqt + ", px=" + this.fetchVPNInfo + ", reduceOnly=" + this.DbNXlk + ", side=" + this.AuCTel + ", posMode=" + this.values + ", needTransfer=" + this.djBIcL + ", sz=" + this.fIwbmz + ", ordType=" + this.valueOf + ", tgtCcy=" + this.fJNWhG + ", quickMgnType=" + this.AkhnZx + ", unSpotOffset=" + this.hDKMBd + ", buySz=" + this.KWHzl + ", sellSz=" + this.isConnected + ", baseOnPositionDebt=" + this.EZpvd + ", needQueryAssetAndEarn=" + this.gEmmrt + ", tradeQuoteCcy=" + this.getFieldNames + ", excludeOrderId=" + this.AEQbTJ + ", excludeAlgoId=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String uzCIH() {
            return this.getFieldNames;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.values;
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.Boolean bool2, java.lang.String str14, java.lang.String str15, java.lang.Boolean bool3, @NotNull java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str16, "");
            this.AhwBna = str;
            this.AYXKKw = str2;
            this.ejfBZ = str3;
            this.fARcdN = str4;
            this.OLrzqt = str5;
            this.fetchVPNInfo = str6;
            this.DbNXlk = bool;
            this.AuCTel = str7;
            this.values = str8;
            this.djBIcL = str9;
            this.fIwbmz = str10;
            this.valueOf = str11;
            this.fJNWhG = str12;
            this.AkhnZx = str13;
            this.hDKMBd = bool2;
            this.KWHzl = str14;
            this.isConnected = str15;
            this.EZpvd = bool3;
            this.gEmmrt = str16;
            this.getFieldNames = str17;
            this.AEQbTJ = str18;
            this.copydefault = str19;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b5: CONSTRUCTOR 
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r49v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r49v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r49v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r33v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r49v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r49v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r49v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("1") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r49v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r49v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r49v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r49v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0057: ARITH (r49v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r41v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (32768 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006f: ARITH (65536 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0079: ARITH (131072 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r44v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (262144 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? ("0") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (524288 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0099: ARITH (1048576 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r49v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:63) call: o.uHc.StateListAnimator.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.Boolean bool2, java.lang.String str14, java.lang.String str15, java.lang.Boolean bool3, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? "1" : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? java.lang.Boolean.FALSE : bool2, (32768 & i) != 0 ? null : str14, (65536 & i) != 0 ? null : str15, (131072 & i) != 0 ? null : bool3, (262144 & i) != 0 ? "0" : str16, (524288 & i) != 0 ? null : str17, (1048576 & i) != 0 ? null : str18, (i & 2097152) != 0 ? null : str19);
        }
    }

    /* JADX INFO: renamed from: o.uHc$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        public static final int copydefault = MaxAvailableResp.$stable;
        public final MaxAvailableResp AEQbTJ;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, MaxAvailableResp maxAvailableResp, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                maxAvailableResp = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str = activity.KWHzl;
            }
            return activity.EZpvd(maxAvailableResp, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull MaxAvailableResp maxAvailableResp, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(maxAvailableResp, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(maxAvailableResp, str);
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
            return Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(maxAvailableResp=" + this.AEQbTJ + ", availableBalance=" + this.KWHzl + ")";
        }

        public Activity(@NotNull MaxAvailableResp maxAvailableResp, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(maxAvailableResp, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = maxAvailableResp;
            this.KWHzl = str;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013f A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #1 {all -> 0x0172, blocks: (B:39:0x0124, B:41:0x012c, B:43:0x0132, B:44:0x013f), top: B:63:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.vNH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull StateListAnimator stateListAnimator, @NotNull Continuation<? super Activity> continuation) throws java.lang.Throwable {
        FetchBalanceUseCase$execute$1 fetchBalanceUseCase$execute$1;
        java.lang.String strUzCIH;
        java.lang.String strAhwBna;
        java.lang.String str;
        java.lang.String str2;
        C48158uHc c48158uHc;
        StateListAnimator stateListAnimator2;
        InterfaceC50055vAf interfaceC50055vAf;
        java.lang.String strKWHzl;
        java.lang.String strEZpvd;
        java.lang.String strCopydefault;
        java.lang.String strIsConnected;
        java.lang.String strFJNWhG;
        java.lang.Boolean boolAkhnZx;
        java.lang.String strAuCTel;
        java.lang.String strValues;
        java.lang.String strGEmmrt;
        java.lang.String strFARcdN;
        java.lang.String strDjBIcL;
        java.lang.String strEjfBZ;
        java.lang.String strDbNXlk;
        java.lang.Boolean boolHDKMBd;
        java.lang.String strAEQbTJ;
        java.lang.String strFetchVPNInfo;
        java.lang.Boolean boolOLrzqt;
        java.lang.String strAYXKKw;
        java.lang.String str3;
        java.lang.String tradeSymbol;
        BizInstrument suggestedInstrument$default;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof FetchBalanceUseCase$execute$1) {
            fetchBalanceUseCase$execute$1 = (FetchBalanceUseCase$execute$1) continuation;
            int i = fetchBalanceUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchBalanceUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchBalanceUseCase$execute$1 = new FetchBalanceUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object obj = fetchBalanceUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchBalanceUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String strFIwbmz = stateListAnimator.fIwbmz();
            if (strFIwbmz != null && strFIwbmz.length() != 0) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, stateListAnimator.valueOf(), stateListAnimator.AhwBna(), null, null, 12, null)) == null || (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) == null) {
                    tradeSymbol = "BTC";
                }
                strAhwBna = tradeSymbol + "-" + stateListAnimator.fIwbmz();
                strUzCIH = stateListAnimator.fIwbmz();
            } else {
                strUzCIH = stateListAnimator.uzCIH();
                strAhwBna = stateListAnimator.AhwBna();
            }
            try {
                interfaceC50055vAf = this.EZpvd;
                strKWHzl = stateListAnimator.KWHzl();
                strEZpvd = stateListAnimator.EZpvd();
                strCopydefault = stateListAnimator.copydefault();
                strIsConnected = stateListAnimator.isConnected();
                strFJNWhG = stateListAnimator.fJNWhG();
                boolAkhnZx = stateListAnimator.AkhnZx();
                strAuCTel = stateListAnimator.AuCTel();
                strValues = stateListAnimator.values();
                strGEmmrt = stateListAnimator.gEmmrt();
                strFARcdN = stateListAnimator.fARcdN();
                strDjBIcL = stateListAnimator.djBIcL();
                strEjfBZ = stateListAnimator.ejfBZ();
                strDbNXlk = stateListAnimator.DbNXlk();
                boolHDKMBd = stateListAnimator.hDKMBd();
                strAEQbTJ = stateListAnimator.AEQbTJ();
                strFetchVPNInfo = stateListAnimator.fetchVPNInfo();
                boolOLrzqt = stateListAnimator.OLrzqt();
                strAYXKKw = stateListAnimator.AYXKKw();
                fetchBalanceUseCase$execute$1.L$0 = this;
                fetchBalanceUseCase$execute$1.L$1 = stateListAnimator;
                fetchBalanceUseCase$execute$1.label = 1;
                str3 = AbstractC43419rot.TAG;
                str2 = "Error: ";
            } catch (java.lang.Throwable th) {
                th = th;
                str = AbstractC43419rot.TAG;
                str2 = "Error: ";
            }
            try {
                java.lang.Object objCopydefault2 = interfaceC50055vAf.copydefault(strKWHzl, strEZpvd, strAhwBna, strCopydefault, strIsConnected, strFJNWhG, boolAkhnZx, strAuCTel, strValues, strGEmmrt, strFARcdN, strDjBIcL, strEjfBZ, strDbNXlk, boolHDKMBd, strAEQbTJ, strFetchVPNInfo, boolOLrzqt, strAYXKKw, strUzCIH, fetchBalanceUseCase$execute$1);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                stateListAnimator2 = stateListAnimator;
                obj = objCopydefault2;
                c48158uHc = this;
                responseData = (ResponseData) obj;
                if (responseData.getCode() != 0) {
                    str = str3;
                    pUU.copydefault(str, str2 + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                str = str3;
                c48158uHc = this;
                stateListAnimator2 = stateListAnimator;
                pUU.copydefault(str, str2 + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                MaxAvailableResp maxAvailableResp = (MaxAvailableResp) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) actionBar.AEQbTJ());
                return new Activity(maxAvailableResp, c48158uHc.EZpvd(stateListAnimator2.AhwBna(), stateListAnimator2.valueOf(), maxAvailableResp));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator2 = (StateListAnimator) fetchBalanceUseCase$execute$1.L$1;
            c48158uHc = (C48158uHc) fetchBalanceUseCase$execute$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                str3 = AbstractC43419rot.TAG;
                str2 = "Error: ";
                try {
                    responseData = (ResponseData) obj;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        java.lang.Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        str = str3;
                        try {
                            pUU.copydefault(str, str2 + responseData);
                            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            pUU.copydefault(str, str2 + th);
                            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    str = str3;
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                str = AbstractC43419rot.TAG;
                str2 = "Error: ";
                pUU.copydefault(str, str2 + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                MaxAvailableResp maxAvailableResp2 = (MaxAvailableResp) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) actionBar.AEQbTJ());
                return new Activity(maxAvailableResp2, c48158uHc.EZpvd(stateListAnimator2.AhwBna(), stateListAnimator2.valueOf(), maxAvailableResp2));
            }
        }
        MaxAvailableResp maxAvailableResp22 = (MaxAvailableResp) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) actionBar.AEQbTJ());
        return new Activity(maxAvailableResp22, c48158uHc.EZpvd(stateListAnimator2.AhwBna(), stateListAnimator2.valueOf(), maxAvailableResp22));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, MaxAvailableResp maxAvailableResp) {
        int iHashCode = str2.hashCode();
        if (iHashCode != 2552066) {
            if (iHashCode != 2558355) {
                if (!EZpvd(str, str2)) {
                    java.lang.String baseMax = maxAvailableResp.getBaseMax();
                    if (baseMax.length() != 0) {
                        return baseMax;
                    }
                } else {
                    java.lang.String quoteMax = maxAvailableResp.getQuoteMax();
                    if (quoteMax.length() != 0) {
                        return quoteMax;
                    }
                }
            } else if (!EZpvd(str, str2)) {
            }
        } else if (str2.equals("SPOT")) {
            java.lang.String quoteMax2 = maxAvailableResp.getQuoteMax();
            if (quoteMax2.length() != 0) {
                return quoteMax2;
            }
        } else {
            java.lang.String quoteMax3 = maxAvailableResp.getQuoteMax();
            if (quoteMax3.length() != 0) {
                return quoteMax3;
            }
        }
        return "0";
    }

    public final boolean EZpvd(java.lang.String str, java.lang.String str2) {
        BizInstrument suggestedInstrument$default;
        InterfaceC54581xNr interfaceC54581xNrAEQbTJ = C56066xvm.EZpvd.AEQbTJ();
        if (interfaceC54581xNrAEQbTJ == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrAEQbTJ, str2, str, null, null, 12, null)) == null) {
            return false;
        }
        return Intrinsics.EZpvd(suggestedInstrument$default.isNegativeContract(), java.lang.Boolean.TRUE);
    }
}
