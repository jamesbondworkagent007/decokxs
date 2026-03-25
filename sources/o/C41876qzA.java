package o;

import com.okinc.unify_trade.biz.DexInstrument;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41655qus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qzA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41876qzA implements InterfaceC41655qus {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final java.lang.Boolean AEQbTJ;
    public final java.lang.Double AYXKKw;
    public final boolean AhwBna;
    public final java.lang.Boolean AkhnZx;
    public final java.lang.String DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.Double KWHzl;
    public final java.lang.String OLrzqt;
    public final DexInstrument djBIcL;
    public boolean fetchVPNInfo;
    public final BigDecimal gEmmrt;
    public final java.lang.Object isConnected;
    public final BigDecimal valueOf;
    public final BigDecimal values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41876qzA copy$default(C41876qzA c41876qzA, DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj2) {
        return c41876qzA.AEQbTJ((i & 1) != 0 ? c41876qzA.djBIcL : dexInstrument, (i & 2) != 0 ? c41876qzA.KWHzl : d, (i & 4) != 0 ? c41876qzA.AYXKKw : d2, (i & 8) != 0 ? c41876qzA.values : bigDecimal, (i & 16) != 0 ? c41876qzA.valueOf : bigDecimal2, (i & 32) != 0 ? c41876qzA.gEmmrt : bigDecimal3, (i & 64) != 0 ? c41876qzA.isConnected : obj, (i & 128) != 0 ? c41876qzA.AhwBna : z, (i & 256) != 0 ? c41876qzA.DbNXlk : str, (i & 512) != 0 ? c41876qzA.fetchVPNInfo : z2, (i & 1024) != 0 ? c41876qzA.AkhnZx : bool, (i & 2048) != 0 ? c41876qzA.AEQbTJ : bool2, (i & 4096) != 0 ? c41876qzA.OLrzqt : str2, (i & 8192) != 0 ? c41876qzA.EZpvd : str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41876qzA AEQbTJ(@NotNull DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        return new C41876qzA(dexInstrument, d, d2, bigDecimal, bigDecimal2, bigDecimal3, obj, z, str, z2, bool, bool2, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public BigDecimal AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public BigDecimal AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWP
    public boolean DbNXlk() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Double KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.fetchVPNInfo = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public DexInstrument copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Double djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41876qzA)) {
            return false;
        }
        C41876qzA c41876qzA = (C41876qzA) obj;
        return Intrinsics.EZpvd(this.djBIcL, c41876qzA.djBIcL) && Intrinsics.EZpvd(this.KWHzl, c41876qzA.KWHzl) && Intrinsics.EZpvd(this.AYXKKw, c41876qzA.AYXKKw) && Intrinsics.EZpvd(this.values, c41876qzA.values) && Intrinsics.EZpvd(this.valueOf, c41876qzA.valueOf) && Intrinsics.EZpvd(this.gEmmrt, c41876qzA.gEmmrt) && Intrinsics.EZpvd(this.isConnected, c41876qzA.isConnected) && this.AhwBna == c41876qzA.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c41876qzA.DbNXlk) && this.fetchVPNInfo == c41876qzA.fetchVPNInfo && Intrinsics.EZpvd(this.AkhnZx, c41876qzA.AkhnZx) && Intrinsics.EZpvd(this.AEQbTJ, c41876qzA.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c41876qzA.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c41876qzA.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Boolean fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41645qui
    public java.lang.String gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.djBIcL.hashCode();
        java.lang.Double d = this.KWHzl;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.AYXKKw;
        int iHashCode3 = d2 == null ? 0 : d2.hashCode();
        BigDecimal bigDecimal = this.values;
        int iHashCode4 = bigDecimal == null ? 0 : bigDecimal.hashCode();
        BigDecimal bigDecimal2 = this.valueOf;
        int iHashCode5 = bigDecimal2 == null ? 0 : bigDecimal2.hashCode();
        BigDecimal bigDecimal3 = this.gEmmrt;
        int iHashCode6 = bigDecimal3 == null ? 0 : bigDecimal3.hashCode();
        java.lang.Object obj = this.isConnected;
        int iHashCode7 = obj == null ? 0 : obj.hashCode();
        int iHashCode8 = java.lang.Boolean.hashCode(this.AhwBna);
        java.lang.String str = this.DbNXlk;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        int iHashCode10 = java.lang.Boolean.hashCode(this.fetchVPNInfo);
        java.lang.Boolean bool = this.AkhnZx;
        int iHashCode11 = bool == null ? 0 : bool.hashCode();
        java.lang.Boolean bool2 = this.AEQbTJ;
        int iHashCode12 = bool2 == null ? 0 : bool2.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode13 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.EZpvd;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Object isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FavoriteDexItemVo(dexInstrument=" + this.djBIcL + ", changeRatioValue=" + this.KWHzl + ", priceValue=" + this.AYXKKw + ", turnoverValue=" + this.values + ", marketCapValue=" + this.valueOf + ", liquidity=" + this.gEmmrt + ", sortTag=" + this.isConnected + ", isWatching=" + this.AhwBna + ", searchKeyword=" + this.DbNXlk + ", selected=" + this.fetchVPNInfo + ", verified=" + this.AkhnZx + ", boosted=" + this.AEQbTJ + ", boostPercentage=" + this.OLrzqt + ", boostRate=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public BigDecimal values() {
        return this.values;
    }

    public C41876qzA(@NotNull DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        this.djBIcL = dexInstrument;
        this.KWHzl = d;
        this.AYXKKw = d2;
        this.values = bigDecimal;
        this.valueOf = bigDecimal2;
        this.gEmmrt = bigDecimal3;
        this.isConnected = obj;
        this.AhwBna = z;
        this.DbNXlk = str;
        this.fetchVPNInfo = z2;
        this.AkhnZx = bool;
        this.AEQbTJ = bool2;
        this.OLrzqt = str2;
        this.EZpvd = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008b: CONSTRUCTOR 
  (r15v0 com.okinc.unify_trade.biz.DexInstrument)
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r16v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r17v0 java.lang.Double))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0013: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r18v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x001b: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r19v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0023: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r20v0 java.math.BigDecimal))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x002b: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r21v0 java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r29v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0043: ARITH (r29v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r24v0 boolean) : false)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0053: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0057: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r26v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r29v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r29v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
 A[MD:(com.okinc.unify_trade.biz.DexInstrument, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:9) call: o.qzA.<init>(com.okinc.unify_trade.biz.DexInstrument, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C41876qzA(DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dexInstrument, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : bigDecimal, (i & 16) != 0 ? null : bigDecimal2, (i & 32) != 0 ? null : bigDecimal3, (i & 64) != 0 ? null : obj, (i & 128) != 0 ? false : z, (i & 256) == 0 ? str : null, (i & 512) == 0 ? z2 : false, (i & 1024) != 0 ? java.lang.Boolean.FALSE : bool, (i & 2048) != 0 ? java.lang.Boolean.FALSE : bool2, (i & 4096) != 0 ? "" : str2, (i & 8192) == 0 ? str3 : "");
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
    /* JADX INFO: renamed from: ejfBZ, reason: merged with bridge method [inline-methods] */
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

    /* JADX INFO: renamed from: o.qzA$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qzA.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final InterfaceC41652qup OLrzqt() {
            return new Application();
        }

        /* JADX INFO: renamed from: o.qzA$ActionBar$Application */
        public static final class Application implements InterfaceC41652qup {
            @Override // o.InterfaceC41652qup
            public InterfaceC41655qus OLrzqt(DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, boolean z, java.lang.Boolean bool, java.lang.String str, java.lang.String str2) {
                Intrinsics.checkNotNullParameter(dexInstrument, "");
                return new C41876qzA(dexInstrument, d, d2, bigDecimal, bigDecimal2, bigDecimal3, null, false, null, false, java.lang.Boolean.valueOf(z), bool, str, str2, 960, null);
            }
        }
    }

    @Override // o.InterfaceC41655qus
    public InterfaceC41655qus copydefault(java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj) {
        return copy$default(this, null, d, d2, bigDecimal, bigDecimal2, null, obj, false, null, false, null, null, null, null, 16289, null);
    }

    @Override // o.InterfaceC41655qus
    public InterfaceC41655qus KWHzl(boolean z) {
        return copy$default(this, null, null, null, null, null, null, null, z, null, false, null, null, null, null, 16255, null);
    }

    @Override // o.InterfaceC41655qus
    public InterfaceC41655qus KWHzl(java.lang.String str) {
        return copy$default(this, null, null, null, null, null, null, null, false, str, false, null, null, null, null, 16127, null);
    }
}
