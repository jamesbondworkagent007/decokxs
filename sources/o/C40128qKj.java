package o;

import com.okinc.unify_trade.biz.DexInstrument;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41655qus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qKj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40128qKj implements InterfaceC41655qus, InterfaceC40237qOk {
    public final BigDecimal AYXKKw;
    public final java.lang.Double AhwBna;
    public final BigDecimal AkhnZx;
    public final java.lang.Object DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Double OLrzqt;
    public final java.lang.Boolean copydefault;
    public final boolean djBIcL;
    public final java.lang.Boolean fetchVPNInfo;
    public final BigDecimal gEmmrt;
    public final DexInstrument valueOf;
    public final java.lang.String values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40128qKj copy$default(C40128qKj c40128qKj, DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj2) {
        return c40128qKj.AEQbTJ((i & 1) != 0 ? c40128qKj.valueOf : dexInstrument, (i & 2) != 0 ? c40128qKj.OLrzqt : d, (i & 4) != 0 ? c40128qKj.AhwBna : d2, (i & 8) != 0 ? c40128qKj.AkhnZx : bigDecimal, (i & 16) != 0 ? c40128qKj.gEmmrt : bigDecimal2, (i & 32) != 0 ? c40128qKj.AYXKKw : bigDecimal3, (i & 64) != 0 ? c40128qKj.DbNXlk : obj, (i & 128) != 0 ? c40128qKj.djBIcL : z, (i & 256) != 0 ? c40128qKj.values : str, (i & 512) != 0 ? c40128qKj.fetchVPNInfo : bool, (i & 1024) != 0 ? c40128qKj.copydefault : bool2, (i & 2048) != 0 ? c40128qKj.EZpvd : str2, (i & 4096) != 0 ? c40128qKj.KWHzl : str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40128qKj AEQbTJ(@NotNull DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        return new C40128qKj(dexInstrument, d, d2, bigDecimal, bigDecimal2, bigDecimal3, obj, z, str, bool, bool2, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public BigDecimal AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public BigDecimal AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWP
    public boolean DbNXlk() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Double KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public DexInstrument copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Double djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40128qKj)) {
            return false;
        }
        C40128qKj c40128qKj = (C40128qKj) obj;
        return Intrinsics.EZpvd(this.valueOf, c40128qKj.valueOf) && Intrinsics.EZpvd(this.OLrzqt, c40128qKj.OLrzqt) && Intrinsics.EZpvd(this.AhwBna, c40128qKj.AhwBna) && Intrinsics.EZpvd(this.AkhnZx, c40128qKj.AkhnZx) && Intrinsics.EZpvd(this.gEmmrt, c40128qKj.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, c40128qKj.AYXKKw) && Intrinsics.EZpvd(this.DbNXlk, c40128qKj.DbNXlk) && this.djBIcL == c40128qKj.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c40128qKj.values) && Intrinsics.EZpvd(this.fetchVPNInfo, c40128qKj.fetchVPNInfo) && Intrinsics.EZpvd(this.copydefault, c40128qKj.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c40128qKj.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c40128qKj.KWHzl);
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
        int iHashCode = this.valueOf.hashCode();
        java.lang.Double d = this.OLrzqt;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.AhwBna;
        int iHashCode3 = d2 == null ? 0 : d2.hashCode();
        BigDecimal bigDecimal = this.AkhnZx;
        int iHashCode4 = bigDecimal == null ? 0 : bigDecimal.hashCode();
        BigDecimal bigDecimal2 = this.gEmmrt;
        int iHashCode5 = bigDecimal2 == null ? 0 : bigDecimal2.hashCode();
        BigDecimal bigDecimal3 = this.AYXKKw;
        int iHashCode6 = bigDecimal3 == null ? 0 : bigDecimal3.hashCode();
        java.lang.Object obj = this.DbNXlk;
        int iHashCode7 = obj == null ? 0 : obj.hashCode();
        int iHashCode8 = java.lang.Boolean.hashCode(this.djBIcL);
        java.lang.String str = this.values;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        java.lang.Boolean bool = this.fetchVPNInfo;
        int iHashCode10 = bool == null ? 0 : bool.hashCode();
        java.lang.Boolean bool2 = this.copydefault;
        int iHashCode11 = bool2 == null ? 0 : bool2.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode12 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.KWHzl;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Object isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NavSearchDexItemVo(dexInstrument=" + this.valueOf + ", changeRatioValue=" + this.OLrzqt + ", priceValue=" + this.AhwBna + ", turnoverValue=" + this.AkhnZx + ", marketCapValue=" + this.gEmmrt + ", liquidity=" + this.AYXKKw + ", sortTag=" + this.DbNXlk + ", isWatching=" + this.djBIcL + ", searchKeyword=" + this.values + ", verified=" + this.fetchVPNInfo + ", boosted=" + this.copydefault + ", boostPercentage=" + this.EZpvd + ", boostRate=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public BigDecimal values() {
        return this.AkhnZx;
    }

    public C40128qKj(@NotNull DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        this.valueOf = dexInstrument;
        this.OLrzqt = d;
        this.AhwBna = d2;
        this.AkhnZx = bigDecimal;
        this.gEmmrt = bigDecimal2;
        this.AYXKKw = bigDecimal3;
        this.DbNXlk = obj;
        this.djBIcL = z;
        this.values = str;
        this.fetchVPNInfo = bool;
        this.copydefault = bool2;
        this.EZpvd = str2;
        this.KWHzl = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007f: CONSTRUCTOR 
  (r14v0 com.okinc.unify_trade.biz.DexInstrument)
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r15v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x000a: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r16v0 java.lang.Double))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0012: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r17v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x001a: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r18v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0022: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r19v0 java.math.BigDecimal))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x002a: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r20v0 java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r27v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0041: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r27v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r27v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
 A[MD:(com.okinc.unify_trade.biz.DexInstrument, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:14) call: o.qKj.<init>(com.okinc.unify_trade.biz.DexInstrument, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C40128qKj(DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dexInstrument, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : bigDecimal, (i & 16) != 0 ? null : bigDecimal2, (i & 32) != 0 ? null : bigDecimal3, (i & 64) != 0 ? null : obj, (i & 128) != 0 ? false : z, (i & 256) == 0 ? str : null, (i & 512) != 0 ? java.lang.Boolean.FALSE : bool, (i & 1024) != 0 ? java.lang.Boolean.FALSE : bool2, (i & 2048) != 0 ? "" : str2, (i & 4096) == 0 ? str3 : "");
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

    @Override // o.InterfaceC41655qus
    public InterfaceC41655qus EZpvd(boolean z) {
        return InterfaceC41655qus.ActionBar.AEQbTJ(this, z);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/String;)Lo/qui; */
    @Override // o.InterfaceC41645qui
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC41655qus copydefault(java.lang.String str) {
        return InterfaceC41655qus.ActionBar.EZpvd(this, str);
    }

    /* JADX DEBUG: Method merged with bridge method: provideKey2()Ljava/lang/Object; */
    @Override // com.okinc.market.quotation.data.util.TwoKeyMap.StateListAnimator
    /* JADX INFO: renamed from: fIwbmz, reason: merged with bridge method [inline-methods] */
    public java.lang.String provideKey2() {
        return InterfaceC41655qus.ActionBar.EZpvd(this);
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

    /* JADX INFO: renamed from: o.qKj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qKj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final InterfaceC41652qup OLrzqt() {
            return new StateListAnimator();
        }

        /* JADX INFO: renamed from: o.qKj$ActionBar$StateListAnimator */
        public static final class StateListAnimator implements InterfaceC41652qup {
            @Override // o.InterfaceC41652qup
            public InterfaceC41655qus OLrzqt(DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, boolean z, java.lang.Boolean bool, java.lang.String str, java.lang.String str2) {
                Intrinsics.checkNotNullParameter(dexInstrument, "");
                return new C40128qKj(dexInstrument, d, d2, bigDecimal, bigDecimal2, bigDecimal3, null, false, null, java.lang.Boolean.valueOf(z), bool, str, str2, 448, null);
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
