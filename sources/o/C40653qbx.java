package o;

import com.okinc.unify_trade.biz.DexInstrument;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41655qus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qbx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40653qbx implements InterfaceC41655qus {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final java.lang.String AEQbTJ;
    public final BigDecimal AYXKKw;
    public final BigDecimal AhwBna;
    public final java.lang.Object DbNXlk;
    public final java.lang.Boolean EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Double OLrzqt;
    public final java.lang.Double djBIcL;
    public final java.lang.Boolean fetchVPNInfo;
    public final DexInstrument gEmmrt;
    public final BigDecimal isConnected;
    public final boolean valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40653qbx copy$default(C40653qbx c40653qbx, DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj2) {
        return c40653qbx.copydefault((i & 1) != 0 ? c40653qbx.gEmmrt : dexInstrument, (i & 2) != 0 ? c40653qbx.OLrzqt : d, (i & 4) != 0 ? c40653qbx.djBIcL : d2, (i & 8) != 0 ? c40653qbx.isConnected : bigDecimal, (i & 16) != 0 ? c40653qbx.AYXKKw : bigDecimal2, (i & 32) != 0 ? c40653qbx.AhwBna : bigDecimal3, (i & 64) != 0 ? c40653qbx.DbNXlk : obj, (i & 128) != 0 ? c40653qbx.valueOf : z, (i & 256) != 0 ? c40653qbx.values : str, (i & 512) != 0 ? c40653qbx.fetchVPNInfo : bool, (i & 1024) != 0 ? c40653qbx.EZpvd : bool2, (i & 2048) != 0 ? c40653qbx.KWHzl : str2, (i & 4096) != 0 ? c40653qbx.AEQbTJ : str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public BigDecimal AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public BigDecimal AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWP
    public boolean DbNXlk() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Double KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public DexInstrument copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40653qbx copydefault(@NotNull DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        return new C40653qbx(dexInstrument, d, d2, bigDecimal, bigDecimal2, bigDecimal3, obj, z, str, bool, bool2, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Double djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40653qbx)) {
            return false;
        }
        C40653qbx c40653qbx = (C40653qbx) obj;
        return Intrinsics.EZpvd(this.gEmmrt, c40653qbx.gEmmrt) && Intrinsics.EZpvd(this.OLrzqt, c40653qbx.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, c40653qbx.djBIcL) && Intrinsics.EZpvd(this.isConnected, c40653qbx.isConnected) && Intrinsics.EZpvd(this.AYXKKw, c40653qbx.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, c40653qbx.AhwBna) && Intrinsics.EZpvd(this.DbNXlk, c40653qbx.DbNXlk) && this.valueOf == c40653qbx.valueOf && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c40653qbx.values) && Intrinsics.EZpvd(this.fetchVPNInfo, c40653qbx.fetchVPNInfo) && Intrinsics.EZpvd(this.EZpvd, c40653qbx.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c40653qbx.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c40653qbx.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Boolean fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41645qui
    public java.lang.String gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        java.lang.Double d = this.OLrzqt;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.djBIcL;
        int iHashCode3 = d2 == null ? 0 : d2.hashCode();
        BigDecimal bigDecimal = this.isConnected;
        int iHashCode4 = bigDecimal == null ? 0 : bigDecimal.hashCode();
        BigDecimal bigDecimal2 = this.AYXKKw;
        int iHashCode5 = bigDecimal2 == null ? 0 : bigDecimal2.hashCode();
        BigDecimal bigDecimal3 = this.AhwBna;
        int iHashCode6 = bigDecimal3 == null ? 0 : bigDecimal3.hashCode();
        java.lang.Object obj = this.DbNXlk;
        int iHashCode7 = obj == null ? 0 : obj.hashCode();
        int iHashCode8 = java.lang.Boolean.hashCode(this.valueOf);
        java.lang.String str = this.values;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        java.lang.Boolean bool = this.fetchVPNInfo;
        int iHashCode10 = bool == null ? 0 : bool.hashCode();
        java.lang.Boolean bool2 = this.EZpvd;
        int iHashCode11 = bool2 == null ? 0 : bool2.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode12 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.AEQbTJ;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Object isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DiscoverDexItemVo(dexInstrument=" + this.gEmmrt + ", changeRatioValue=" + this.OLrzqt + ", priceValue=" + this.djBIcL + ", turnoverValue=" + this.isConnected + ", marketCapValue=" + this.AYXKKw + ", liquidity=" + this.AhwBna + ", sortTag=" + this.DbNXlk + ", isWatching=" + this.valueOf + ", searchKeyword=" + this.values + ", verified=" + this.fetchVPNInfo + ", boosted=" + this.EZpvd + ", boostPercentage=" + this.KWHzl + ", boostRate=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public BigDecimal values() {
        return this.isConnected;
    }

    public C40653qbx(@NotNull DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        this.gEmmrt = dexInstrument;
        this.OLrzqt = d;
        this.djBIcL = d2;
        this.isConnected = bigDecimal;
        this.AYXKKw = bigDecimal2;
        this.AhwBna = bigDecimal3;
        this.DbNXlk = obj;
        this.valueOf = z;
        this.values = str;
        this.fetchVPNInfo = bool;
        this.EZpvd = bool2;
        this.KWHzl = str2;
        this.AEQbTJ = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0050: CONSTRUCTOR 
  (r18v0 com.okinc.unify_trade.biz.DexInstrument)
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r19v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r20v0 java.lang.Double))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r21v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x001b: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r22v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0023: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r23v0 java.math.BigDecimal))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x002b: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r24v0 java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (r27v0 java.lang.Boolean)
  (r28v0 java.lang.Boolean)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
 A[MD:(com.okinc.unify_trade.biz.DexInstrument, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:8) call: o.qbx.<init>(com.okinc.unify_trade.biz.DexInstrument, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C40653qbx(DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dexInstrument, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : bigDecimal, (i & 16) != 0 ? null : bigDecimal2, (i & 32) != 0 ? null : bigDecimal3, (i & 64) != 0 ? null : obj, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : str, bool, bool2, str2, str3);
    }

    /* JADX DEBUG: Method merged with bridge method: provideKey1()Ljava/lang/Object; */
    @Override // com.okinc.market.quotation.data.util.TwoKeyMap.StateListAnimator
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.String provideKey1() {
        return InterfaceC41655qus.ActionBar.copydefault(this);
    }

    @Override // o.InterfaceC41645qui
    public InterfaceC55797xqi AkhnZx() {
        return InterfaceC41655qus.ActionBar.KWHzl(this);
    }

    /* JADX DEBUG: Method merged with bridge method: provideKey2()Ljava/lang/Object; */
    @Override // com.okinc.market.quotation.data.util.TwoKeyMap.StateListAnimator
    /* JADX INFO: renamed from: AuCTel, reason: merged with bridge method [inline-methods] */
    public java.lang.String provideKey2() {
        return InterfaceC41655qus.ActionBar.EZpvd(this);
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

    /* JADX INFO: renamed from: o.qbx$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qbx.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final InterfaceC41652qup copydefault() {
            return new Activity();
        }

        /* JADX INFO: renamed from: o.qbx$Application$Activity */
        public static final class Activity implements InterfaceC41652qup {
            @Override // o.InterfaceC41652qup
            public InterfaceC41655qus OLrzqt(DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, boolean z, java.lang.Boolean bool, java.lang.String str, java.lang.String str2) {
                Intrinsics.checkNotNullParameter(dexInstrument, "");
                return new C40653qbx(dexInstrument, d, d2, bigDecimal, bigDecimal2, bigDecimal3, null, false, null, java.lang.Boolean.valueOf(z), bool, str, str2, 448, null);
            }
        }
    }

    @Override // o.InterfaceC41655qus
    public InterfaceC41655qus copydefault(java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj) {
        return copy$default(this, null, d, d2, bigDecimal, bigDecimal2, null, obj, false, null, null, null, null, null, 8097, null);
    }

    @Override // o.InterfaceC41655qus
    public InterfaceC41655qus KWHzl(boolean z) {
        return copy$default(this, null, null, null, null, null, null, null, z, null, null, null, null, null, 8063, null);
    }

    @Override // o.InterfaceC41655qus
    public InterfaceC41655qus KWHzl(java.lang.String str) {
        return copy$default(this, null, null, null, null, null, null, null, false, str, null, null, null, null, 7935, null);
    }
}
