package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41655qus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qWK implements InterfaceC41655qus {
    public final java.lang.String AEQbTJ;
    public final boolean AYXKKw;
    public final BigDecimal AhwBna;
    public boolean DbNXlk;
    public final DexInstrument EZpvd;
    public final java.lang.Double KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.Boolean copydefault;
    public final java.lang.String djBIcL;
    public final BigDecimal fetchVPNInfo;
    public final java.lang.Double gEmmrt;
    public final java.lang.Object isConnected;
    public final BigDecimal valueOf;
    public final java.lang.Boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ qWK copy$default(qWK qwk, DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj2) {
        return qwk.EZpvd((i & 1) != 0 ? qwk.EZpvd : dexInstrument, (i & 2) != 0 ? qwk.KWHzl : d, (i & 4) != 0 ? qwk.gEmmrt : d2, (i & 8) != 0 ? qwk.fetchVPNInfo : bigDecimal, (i & 16) != 0 ? qwk.AhwBna : bigDecimal2, (i & 32) != 0 ? qwk.valueOf : bigDecimal3, (i & 64) != 0 ? qwk.isConnected : obj, (i & 128) != 0 ? qwk.AYXKKw : z, (i & 256) != 0 ? qwk.djBIcL : str, (i & 512) != 0 ? qwk.DbNXlk : z2, (i & 1024) != 0 ? qwk.values : bool, (i & 2048) != 0 ? qwk.copydefault : bool2, (i & 4096) != 0 ? qwk.AEQbTJ : str2, (i & 8192) != 0 ? qwk.OLrzqt : str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public BigDecimal AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public BigDecimal AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWP
    public boolean DbNXlk() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qWK EZpvd(@NotNull DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        return new qWK(dexInstrument, d, d2, bigDecimal, bigDecimal2, bigDecimal3, obj, z, str, z2, bool, bool2, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Double KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public DexInstrument copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Double djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qWK)) {
            return false;
        }
        qWK qwk = (qWK) obj;
        return Intrinsics.EZpvd(this.EZpvd, qwk.EZpvd) && Intrinsics.EZpvd(this.KWHzl, qwk.KWHzl) && Intrinsics.EZpvd(this.gEmmrt, qwk.gEmmrt) && Intrinsics.EZpvd(this.fetchVPNInfo, qwk.fetchVPNInfo) && Intrinsics.EZpvd(this.AhwBna, qwk.AhwBna) && Intrinsics.EZpvd(this.valueOf, qwk.valueOf) && Intrinsics.EZpvd(this.isConnected, qwk.isConnected) && this.AYXKKw == qwk.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) qwk.djBIcL) && this.DbNXlk == qwk.DbNXlk && Intrinsics.EZpvd(this.values, qwk.values) && Intrinsics.EZpvd(this.copydefault, qwk.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) qwk.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) qwk.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Boolean fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41645qui
    public java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        java.lang.Double d = this.KWHzl;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.gEmmrt;
        int iHashCode3 = d2 == null ? 0 : d2.hashCode();
        BigDecimal bigDecimal = this.fetchVPNInfo;
        int iHashCode4 = bigDecimal == null ? 0 : bigDecimal.hashCode();
        BigDecimal bigDecimal2 = this.AhwBna;
        int iHashCode5 = bigDecimal2 == null ? 0 : bigDecimal2.hashCode();
        BigDecimal bigDecimal3 = this.valueOf;
        int iHashCode6 = bigDecimal3 == null ? 0 : bigDecimal3.hashCode();
        java.lang.Object obj = this.isConnected;
        int iHashCode7 = obj == null ? 0 : obj.hashCode();
        int iHashCode8 = java.lang.Boolean.hashCode(this.AYXKKw);
        java.lang.String str = this.djBIcL;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        int iHashCode10 = java.lang.Boolean.hashCode(this.DbNXlk);
        java.lang.Boolean bool = this.values;
        int iHashCode11 = bool == null ? 0 : bool.hashCode();
        java.lang.Boolean bool2 = this.copydefault;
        int iHashCode12 = bool2 == null ? 0 : bool2.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode13 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.OLrzqt;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public java.lang.Object isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FavDexItemVo(dexInstrument=" + this.EZpvd + ", changeRatioValue=" + this.KWHzl + ", priceValue=" + this.gEmmrt + ", turnoverValue=" + this.fetchVPNInfo + ", marketCapValue=" + this.AhwBna + ", liquidity=" + this.valueOf + ", sortTag=" + this.isConnected + ", isWatching=" + this.AYXKKw + ", searchKeyword=" + this.djBIcL + ", selected=" + this.DbNXlk + ", verified=" + this.values + ", boosted=" + this.copydefault + ", boostPercentage=" + this.AEQbTJ + ", boostRate=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41655qus
    public BigDecimal values() {
        return this.fetchVPNInfo;
    }

    public qWK(@NotNull DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        this.EZpvd = dexInstrument;
        this.KWHzl = d;
        this.gEmmrt = d2;
        this.fetchVPNInfo = bigDecimal;
        this.AhwBna = bigDecimal2;
        this.valueOf = bigDecimal3;
        this.isConnected = obj;
        this.AYXKKw = z;
        this.djBIcL = str;
        this.DbNXlk = z2;
        this.values = bool;
        this.copydefault = bool2;
        this.AEQbTJ = str2;
        this.OLrzqt = str3;
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
 A[MD:(com.okinc.unify_trade.biz.DexInstrument, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:146) call: o.qWK.<init>(com.okinc.unify_trade.biz.DexInstrument, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ qWK(DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.Object obj, boolean z, java.lang.String str, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str2, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dexInstrument, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : bigDecimal, (i & 16) != 0 ? null : bigDecimal2, (i & 32) != 0 ? null : bigDecimal3, (i & 64) != 0 ? null : obj, (i & 128) != 0 ? false : z, (i & 256) == 0 ? str : null, (i & 512) == 0 ? z2 : false, (i & 1024) != 0 ? java.lang.Boolean.FALSE : bool, (i & 2048) != 0 ? java.lang.Boolean.FALSE : bool2, (i & 4096) != 0 ? "" : str2, (i & 8192) == 0 ? str3 : "");
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

    public final WatchListData fJNWhG() {
        return new WatchListData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, "CEDEFI", copydefault().getChainId(), copydefault().getTokenContractAddress(), copydefault().getTokenSymbol(), (java.lang.String) null, 135, (DefaultConstructorMarker) null);
    }

    public final MarketUserFavorite fIwbmz() {
        return new MarketUserFavorite(0L, "", C55686xod.KWHzl(), "CEDEFI", "", "0", copydefault().getChainId(), copydefault().getTokenContractAddress(), copydefault().getTokenSymbol(), copydefault().getTokenName(), 1, null);
    }
}
