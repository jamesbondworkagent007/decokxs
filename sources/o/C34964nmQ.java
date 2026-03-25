package o;

import com.okinc.unify_trade.biz.DexInstrument;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41655qus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nmQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34964nmQ implements InterfaceC41655qus {
    public final boolean AYXKKw;
    public final C41424qqZ AhwBna;
    public final java.lang.Double AkhnZx;
    public final BigDecimal DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.Boolean KWHzl;
    public final java.lang.Double OLrzqt;
    public final java.lang.String copydefault;
    public final boolean djBIcL;
    public final java.lang.Boolean fIwbmz;
    public final BigDecimal fetchVPNInfo;
    public final DexInstrument gEmmrt;
    public final java.lang.String isConnected;
    public final BigDecimal valueOf;
    public final java.lang.Object values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C34964nmQ copy$default(C34964nmQ c34964nmQ, DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, C41424qqZ c41424qqZ, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj2) {
        return c34964nmQ.OLrzqt((i & 1) != 0 ? c34964nmQ.gEmmrt : dexInstrument, (i & 2) != 0 ? c34964nmQ.OLrzqt : d, (i & 4) != 0 ? c34964nmQ.AkhnZx : d2, (i & 8) != 0 ? c34964nmQ.DbNXlk : bigDecimal, (i & 16) != 0 ? c34964nmQ.fetchVPNInfo : bigDecimal2, (i & 32) != 0 ? c34964nmQ.valueOf : bigDecimal3, (i & 64) != 0 ? c34964nmQ.values : obj, (i & 128) != 0 ? c34964nmQ.djBIcL : z, (i & 256) != 0 ? c34964nmQ.isConnected : str, (i & 512) != 0 ? c34964nmQ.AhwBna : c41424qqZ, (i & 1024) != 0 ? c34964nmQ.AYXKKw : z2, (i & 2048) != 0 ? c34964nmQ.fIwbmz : bool, (i & 4096) != 0 ? c34964nmQ.KWHzl : bool2, (i & 8192) != 0 ? c34964nmQ.EZpvd : str2, (i & 16384) != 0 ? c34964nmQ.copydefault : str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41424qqZ AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public BigDecimal AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public BigDecimal AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWP
    public boolean DbNXlk() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Double KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34964nmQ OLrzqt(@NotNull DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, C41424qqZ c41424qqZ, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        return new C34964nmQ(dexInstrument, d, d2, bigDecimal, bigDecimal2, bigDecimal3, obj, z, str, c41424qqZ, z2, bool, bool2, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public DexInstrument copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Double djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34964nmQ)) {
            return false;
        }
        C34964nmQ c34964nmQ = (C34964nmQ) obj;
        return Intrinsics.EZpvd(this.gEmmrt, c34964nmQ.gEmmrt) && Intrinsics.EZpvd(this.OLrzqt, c34964nmQ.OLrzqt) && Intrinsics.EZpvd(this.AkhnZx, c34964nmQ.AkhnZx) && Intrinsics.EZpvd(this.DbNXlk, c34964nmQ.DbNXlk) && Intrinsics.EZpvd(this.fetchVPNInfo, c34964nmQ.fetchVPNInfo) && Intrinsics.EZpvd(this.valueOf, c34964nmQ.valueOf) && Intrinsics.EZpvd(this.values, c34964nmQ.values) && this.djBIcL == c34964nmQ.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c34964nmQ.isConnected) && Intrinsics.EZpvd(this.AhwBna, c34964nmQ.AhwBna) && this.AYXKKw == c34964nmQ.AYXKKw && Intrinsics.EZpvd(this.fIwbmz, c34964nmQ.fIwbmz) && Intrinsics.EZpvd(this.KWHzl, c34964nmQ.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c34964nmQ.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c34964nmQ.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Boolean fetchVPNInfo() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41645qui
    public java.lang.String gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        java.lang.Double d = this.OLrzqt;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.AkhnZx;
        int iHashCode3 = d2 == null ? 0 : d2.hashCode();
        BigDecimal bigDecimal = this.DbNXlk;
        int iHashCode4 = bigDecimal == null ? 0 : bigDecimal.hashCode();
        BigDecimal bigDecimal2 = this.fetchVPNInfo;
        int iHashCode5 = bigDecimal2 == null ? 0 : bigDecimal2.hashCode();
        BigDecimal bigDecimal3 = this.valueOf;
        int iHashCode6 = bigDecimal3 == null ? 0 : bigDecimal3.hashCode();
        java.lang.Object obj = this.values;
        int iHashCode7 = obj == null ? 0 : obj.hashCode();
        int iHashCode8 = java.lang.Boolean.hashCode(this.djBIcL);
        java.lang.String str = this.isConnected;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        C41424qqZ c41424qqZ = this.AhwBna;
        int iHashCode10 = c41424qqZ == null ? 0 : c41424qqZ.hashCode();
        int iHashCode11 = java.lang.Boolean.hashCode(this.AYXKKw);
        java.lang.Boolean bool = this.fIwbmz;
        int iHashCode12 = bool == null ? 0 : bool.hashCode();
        java.lang.Boolean bool2 = this.KWHzl;
        int iHashCode13 = bool2 == null ? 0 : bool2.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode14 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.copydefault;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str3 == null ? 0 : str3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Object isConnected() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketHomeDexItemVo(dexInstrument=" + this.gEmmrt + ", changeRatioValue=" + this.OLrzqt + ", priceValue=" + this.AkhnZx + ", turnoverValue=" + this.DbNXlk + ", marketCapValue=" + this.fetchVPNInfo + ", liquidity=" + this.valueOf + ", sortTag=" + this.values + ", isWatching=" + this.djBIcL + ", searchKeyword=" + this.isConnected + ", formatResult=" + this.AhwBna + ", isShowTurnover=" + this.AYXKKw + ", verified=" + this.fIwbmz + ", boosted=" + this.KWHzl + ", boostPercentage=" + this.EZpvd + ", boostRate=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public BigDecimal values() {
        return this.DbNXlk;
    }

    public C34964nmQ(@NotNull DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, C41424qqZ c41424qqZ, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        this.gEmmrt = dexInstrument;
        this.OLrzqt = d;
        this.AkhnZx = d2;
        this.DbNXlk = bigDecimal;
        this.fetchVPNInfo = bigDecimal2;
        this.valueOf = bigDecimal3;
        this.values = obj;
        this.djBIcL = z;
        this.isConnected = str;
        this.AhwBna = c41424qqZ;
        this.AYXKKw = z2;
        this.fIwbmz = bool;
        this.KWHzl = bool2;
        this.EZpvd = str2;
        this.copydefault = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0095: CONSTRUCTOR 
  (r16v0 com.okinc.unify_trade.biz.DexInstrument)
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r17v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r18v0 java.lang.Double))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r19v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x001b: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r20v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0023: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r21v0 java.math.BigDecimal))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x002b: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r22v0 java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:o.qqZ:?: TERNARY null = ((wrap:int:0x0043: ARITH (r31v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r25v0 o.qqZ) : (null o.qqZ))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? true : (r26v0 boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0056: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r31v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r31v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
 A[MD:(com.okinc.unify_trade.biz.DexInstrument, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, o.qqZ, boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:10) call: o.nmQ.<init>(com.okinc.unify_trade.biz.DexInstrument, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, o.qqZ, boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C34964nmQ(DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, C41424qqZ c41424qqZ, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dexInstrument, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : bigDecimal, (i & 16) != 0 ? null : bigDecimal2, (i & 32) != 0 ? null : bigDecimal3, (i & 64) != 0 ? null : obj, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : str, (i & 512) == 0 ? c41424qqZ : null, (i & 1024) != 0 ? true : z2, (i & 2048) != 0 ? java.lang.Boolean.FALSE : bool, (i & 4096) != 0 ? java.lang.Boolean.FALSE : bool2, (i & 8192) != 0 ? "" : str2, (i & 16384) == 0 ? str3 : "");
    }

    @Override // o.InterfaceC41645qui
    public InterfaceC55797xqi AkhnZx() {
        return InterfaceC41655qus.ActionBar.KWHzl(this);
    }

    @Override // o.InterfaceC41655qus
    public InterfaceC41655qus EZpvd(boolean z) {
        return InterfaceC41655qus.ActionBar.AEQbTJ(this, z);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/String;)Lo/qui; */
    @Override // o.InterfaceC41645qui
    /* JADX INFO: renamed from: OLrzqt */
    public InterfaceC41655qus copydefault(java.lang.String str) {
        return InterfaceC41655qus.ActionBar.EZpvd(this, str);
    }

    /* JADX DEBUG: Method merged with bridge method: provideKey2()Ljava/lang/Object; */
    @Override // com.okinc.market.quotation.data.util.TwoKeyMap.StateListAnimator
    /* JADX INFO: renamed from: fARcdN, reason: merged with bridge method [inline-methods] */
    public java.lang.String provideKey2() {
        return InterfaceC41655qus.ActionBar.EZpvd(this);
    }

    /* JADX DEBUG: Method merged with bridge method: provideKey1()Ljava/lang/Object; */
    @Override // com.okinc.market.quotation.data.util.TwoKeyMap.StateListAnimator
    /* JADX INFO: renamed from: fIwbmz, reason: merged with bridge method [inline-methods] */
    public java.lang.String provideKey1() {
        return InterfaceC41655qus.ActionBar.copydefault(this);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC41655qus.ActionBar.copydefault(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC41655qus.ActionBar.OLrzqt(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC41645qui
    public InterfaceC55797xqi valueOf() {
        return InterfaceC41655qus.ActionBar.OLrzqt(this);
    }

    /* JADX INFO: renamed from: o.nmQ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nmQ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final InterfaceC41652qup copydefault() {
            return new Activity();
        }

        /* JADX INFO: renamed from: o.nmQ$TaskDescription$Activity */
        public static final class Activity implements InterfaceC41652qup {
            @Override // o.InterfaceC41652qup
            public InterfaceC41655qus OLrzqt(DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, boolean z, java.lang.Boolean bool, java.lang.String str, java.lang.String str2) {
                Intrinsics.checkNotNullParameter(dexInstrument, "");
                return new C34964nmQ(dexInstrument, d, d2, bigDecimal, bigDecimal2, bigDecimal3, null, false, null, null, false, java.lang.Boolean.valueOf(z), bool, str, str2, 1984, null);
            }
        }
    }

    @Override // o.InterfaceC41655qus
    public InterfaceC41655qus copydefault(java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj) {
        return copy$default(this, null, d, d2, bigDecimal, bigDecimal2, null, obj, false, null, null, false, null, null, null, null, 32673, null);
    }

    @Override // o.InterfaceC41655qus
    public InterfaceC41655qus KWHzl(boolean z) {
        return copy$default(this, null, null, null, null, null, null, null, z, null, null, false, null, null, null, null, 32639, null);
    }

    @Override // o.InterfaceC41655qus
    public InterfaceC41655qus KWHzl(java.lang.String str) {
        return copy$default(this, null, null, null, null, null, null, null, false, str, null, false, null, null, null, null, 32511, null);
    }
}
