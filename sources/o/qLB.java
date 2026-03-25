package o;

import com.okinc.unify_trade.biz.BizInstrument;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41638qub;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qLB implements InterfaceC41638qub, InterfaceC40237qOk {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final java.lang.Double AEQbTJ;
    public final boolean AYXKKw;
    public final java.lang.String AhwBna;
    public final BizInstrument AkhnZx;
    public final BigDecimal AuCTel;
    public final java.lang.Object DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public final java.lang.String djBIcL;
    public final BigDecimal ejfBZ;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.Double gEmmrt;
    public final java.lang.Double isConnected;
    public final boolean valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ qLB copy$default(qLB qlb, BizInstrument bizInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, boolean z, java.lang.String str4, java.lang.String str5, boolean z2, boolean z3, java.lang.String str6, int i, java.lang.Object obj2) {
        return qlb.EZpvd((i & 1) != 0 ? qlb.AkhnZx : bizInstrument, (i & 2) != 0 ? qlb.values : str, (i & 4) != 0 ? qlb.djBIcL : str2, (i & 8) != 0 ? qlb.OLrzqt : str3, (i & 16) != 0 ? qlb.AEQbTJ : d, (i & 32) != 0 ? qlb.gEmmrt : d2, (i & 64) != 0 ? qlb.isConnected : d3, (i & 128) != 0 ? qlb.ejfBZ : bigDecimal, (i & 256) != 0 ? qlb.AuCTel : bigDecimal2, (i & 512) != 0 ? qlb.DbNXlk : obj, (i & 1024) != 0 ? qlb.valueOf : z, (i & 2048) != 0 ? qlb.fetchVPNInfo : str4, (i & 4096) != 0 ? qlb.EZpvd : str5, (i & 8192) != 0 ? qlb.AYXKKw : z2, (i & 16384) != 0 ? qlb.copydefault : z3, (i & 32768) != 0 ? qlb.AhwBna : str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public java.lang.Double AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public BigDecimal AuCTel() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWP
    public boolean DbNXlk() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qLB EZpvd(@NotNull BizInstrument bizInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, boolean z, java.lang.String str4, java.lang.String str5, boolean z2, boolean z3, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new qLB(bizInstrument, str, str2, str3, d, d2, d3, bigDecimal, bigDecimal2, obj, z, str4, str5, z2, z3, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public java.lang.Double KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public java.lang.String ejfBZ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qLB)) {
            return false;
        }
        qLB qlb = (qLB) obj;
        return Intrinsics.EZpvd(this.AkhnZx, qlb.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) qlb.values) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) qlb.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) qlb.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, qlb.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, qlb.gEmmrt) && Intrinsics.EZpvd(this.isConnected, qlb.isConnected) && Intrinsics.EZpvd(this.ejfBZ, qlb.ejfBZ) && Intrinsics.EZpvd(this.AuCTel, qlb.AuCTel) && Intrinsics.EZpvd(this.DbNXlk, qlb.DbNXlk) && this.valueOf == qlb.valueOf && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) qlb.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) qlb.EZpvd) && this.AYXKKw == qlb.AYXKKw && this.copydefault == qlb.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) qlb.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public BigDecimal fARcdN() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public java.lang.Double fIwbmz() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fJNWhG() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public java.lang.Object fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41645qui
    public java.lang.String gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AkhnZx.hashCode();
        int iHashCode2 = this.values.hashCode();
        int iHashCode3 = this.djBIcL.hashCode();
        java.lang.String str = this.OLrzqt;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        java.lang.Double d = this.AEQbTJ;
        int iHashCode5 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.gEmmrt;
        int iHashCode6 = d2 == null ? 0 : d2.hashCode();
        java.lang.Double d3 = this.isConnected;
        int iHashCode7 = d3 == null ? 0 : d3.hashCode();
        BigDecimal bigDecimal = this.ejfBZ;
        int iHashCode8 = bigDecimal == null ? 0 : bigDecimal.hashCode();
        BigDecimal bigDecimal2 = this.AuCTel;
        int iHashCode9 = bigDecimal2 == null ? 0 : bigDecimal2.hashCode();
        java.lang.Object obj = this.DbNXlk;
        int iHashCode10 = obj == null ? 0 : obj.hashCode();
        int iHashCode11 = java.lang.Boolean.hashCode(this.valueOf);
        java.lang.String str2 = this.fetchVPNInfo;
        int iHashCode12 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.EZpvd;
        int iHashCode13 = str3 == null ? 0 : str3.hashCode();
        int iHashCode14 = java.lang.Boolean.hashCode(this.AYXKKw);
        int iHashCode15 = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.String str4 = this.AhwBna;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str4 == null ? 0 : str4.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public java.lang.String isConnected() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NavSearchFuturesItemVo(rawInstrument=" + this.AkhnZx + ", tradeSymbol=" + this.values + ", quoteSymbol=" + this.djBIcL + ", iconUrl=" + this.OLrzqt + ", changeRatioValue=" + this.AEQbTJ + ", priceValue=" + this.gEmmrt + ", subPriceValue=" + this.isConnected + ", volumeValue=" + this.ejfBZ + ", turnoverValue=" + this.AuCTel + ", sortTag=" + this.DbNXlk + ", isWatching=" + this.valueOf + ", searchKeyword=" + this.fetchVPNInfo + ", ccyType=" + this.EZpvd + ", isSelected=" + this.AYXKKw + ", isEnable=" + this.copydefault + ", period=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public BizInstrument values() {
        return this.AkhnZx;
    }

    public qLB(@NotNull BizInstrument bizInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, boolean z, java.lang.String str4, java.lang.String str5, boolean z2, boolean z3, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AkhnZx = bizInstrument;
        this.values = str;
        this.djBIcL = str2;
        this.OLrzqt = str3;
        this.AEQbTJ = d;
        this.gEmmrt = d2;
        this.isConnected = d3;
        this.ejfBZ = bigDecimal;
        this.AuCTel = bigDecimal2;
        this.DbNXlk = obj;
        this.valueOf = z;
        this.fetchVPNInfo = str4;
        this.EZpvd = str5;
        this.AYXKKw = z2;
        this.copydefault = z3;
        this.AhwBna = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006e: CONSTRUCTOR 
  (r21v0 com.okinc.unify_trade.biz.BizInstrument)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r25v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x000b: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r26v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0013: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r27v0 java.lang.Double))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x001b: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r28v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0023: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r29v0 java.math.BigDecimal))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x002b: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r30v0 java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (r33v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004d: ARITH (r37v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? true : (r35v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r37v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
 A[MD:(com.okinc.unify_trade.biz.BizInstrument, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void (m)] (LINE:10) call: o.qLB.<init>(com.okinc.unify_trade.biz.BizInstrument, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ qLB(BizInstrument bizInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, boolean z, java.lang.String str4, java.lang.String str5, boolean z2, boolean z3, java.lang.String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bizInstrument, str, str2, str3, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : d2, (i & 64) != 0 ? null : d3, (i & 128) != 0 ? null : bigDecimal, (i & 256) != 0 ? null : bigDecimal2, (i & 512) != 0 ? null : obj, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? null : str4, str5, (i & 8192) != 0 ? false : z2, (i & 16384) != 0 ? true : z3, (i & 32768) != 0 ? null : str6);
    }

    /* JADX DEBUG: Method merged with bridge method: valueOf()Lo/xqi; */
    @Override // o.InterfaceC41645qui
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public BizInstrument valueOf() {
        return InterfaceC41638qub.ActionBar.AEQbTJ(this);
    }

    @Override // o.InterfaceC41638qub
    public InterfaceC41638qub AEQbTJ(boolean z) {
        return InterfaceC41638qub.ActionBar.KWHzl(this, z);
    }

    @Override // o.InterfaceC41645qui
    public InterfaceC55797xqi AkhnZx() {
        return InterfaceC41638qub.ActionBar.EZpvd(this);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/String;)Lo/qui; */
    @Override // o.InterfaceC41645qui
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC41638qub copydefault(java.lang.String str) {
        return InterfaceC41638qub.ActionBar.EZpvd(this, str);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC41638qub.ActionBar.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC41638qub.ActionBar.KWHzl(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC41638qub
    public java.lang.String djBIcL() {
        return ejfBZ();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qLB.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final InterfaceC41640qud KWHzl() {
            return new Application();
        }

        public static final class Application implements InterfaceC41640qud {
            @Override // o.InterfaceC41640qud
            public InterfaceC41638qub KWHzl(BizInstrument bizInstrument) {
                Intrinsics.checkNotNullParameter(bizInstrument, "");
                return new qLB(bizInstrument, bizInstrument.getTradeSymbol(), bizInstrument.getQuoteSymbol(), C55687xoe.AEQbTJ.OLrzqt(bizInstrument.getTradeSymbol()), null, null, null, null, null, null, false, null, bizInstrument.getCcyType(), false, false, null, 61424, null);
            }
        }
    }

    @Override // o.InterfaceC41638qub
    public InterfaceC41638qub KWHzl(java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, java.lang.String str) {
        return copy$default(this, null, null, null, null, d, d2, d3, bigDecimal, bigDecimal2, obj, false, null, null, false, false, str, 31759, null);
    }

    @Override // o.InterfaceC41638qub
    public InterfaceC41638qub EZpvd(boolean z) {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, z, null, null, false, false, null, 64511, null);
    }

    @Override // o.InterfaceC41638qub
    public InterfaceC41638qub KWHzl(java.lang.String str) {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, false, str, null, false, false, null, 63487, null);
    }

    public final qLB OLrzqt(boolean z, boolean z2) {
        if (this.AYXKKw == z && this.copydefault == z2) {
            return this;
        }
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, false, null, null, z, z2, null, 40959, null);
    }
}
