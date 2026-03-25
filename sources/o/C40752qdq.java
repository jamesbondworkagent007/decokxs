package o;

import com.okinc.unify_trade.biz.BizInstrument;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41638qub;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qdq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40752qdq implements InterfaceC41638qub {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final BigDecimal AkhnZx;
    public final BigDecimal AuCTel;
    public final java.lang.Object DbNXlk;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final java.lang.Double copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.Double gEmmrt;
    public final java.lang.Double isConnected;
    public final BizInstrument valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40752qdq copy$default(C40752qdq c40752qdq, BizInstrument bizInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, java.lang.String str4, boolean z, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj2) {
        return c40752qdq.copydefault((i & 1) != 0 ? c40752qdq.valueOf : bizInstrument, (i & 2) != 0 ? c40752qdq.values : str, (i & 4) != 0 ? c40752qdq.djBIcL : str2, (i & 8) != 0 ? c40752qdq.EZpvd : str3, (i & 16) != 0 ? c40752qdq.copydefault : d, (i & 32) != 0 ? c40752qdq.gEmmrt : d2, (i & 64) != 0 ? c40752qdq.isConnected : d3, (i & 128) != 0 ? c40752qdq.AuCTel : bigDecimal, (i & 256) != 0 ? c40752qdq.AkhnZx : bigDecimal2, (i & 512) != 0 ? c40752qdq.DbNXlk : obj, (i & 1024) != 0 ? c40752qdq.AhwBna : str4, (i & 2048) != 0 ? c40752qdq.KWHzl : z, (i & 4096) != 0 ? c40752qdq.fetchVPNInfo : str5, (i & 8192) != 0 ? c40752qdq.AEQbTJ : str6, (i & 16384) != 0 ? c40752qdq.AYXKKw : str7);
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
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWP
    public boolean DbNXlk() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public java.lang.Double KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40752qdq copydefault(@NotNull BizInstrument bizInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, java.lang.String str4, boolean z, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C40752qdq(bizInstrument, str, str2, str3, d, d2, d3, bigDecimal, bigDecimal2, obj, str4, z, str5, str6, str7);
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
        if (!(obj instanceof C40752qdq)) {
            return false;
        }
        C40752qdq c40752qdq = (C40752qdq) obj;
        return Intrinsics.EZpvd(this.valueOf, c40752qdq.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c40752qdq.values) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c40752qdq.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c40752qdq.EZpvd) && Intrinsics.EZpvd(this.copydefault, c40752qdq.copydefault) && Intrinsics.EZpvd(this.gEmmrt, c40752qdq.gEmmrt) && Intrinsics.EZpvd(this.isConnected, c40752qdq.isConnected) && Intrinsics.EZpvd(this.AuCTel, c40752qdq.AuCTel) && Intrinsics.EZpvd(this.AkhnZx, c40752qdq.AkhnZx) && Intrinsics.EZpvd(this.DbNXlk, c40752qdq.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c40752qdq.AhwBna) && this.KWHzl == c40752qdq.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c40752qdq.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c40752qdq.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c40752qdq.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public BigDecimal fARcdN() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public java.lang.Double fIwbmz() {
        return this.isConnected;
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
        int iHashCode = this.valueOf.hashCode();
        int iHashCode2 = this.values.hashCode();
        int iHashCode3 = this.djBIcL.hashCode();
        java.lang.String str = this.EZpvd;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        java.lang.Double d = this.copydefault;
        int iHashCode5 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.gEmmrt;
        int iHashCode6 = d2 == null ? 0 : d2.hashCode();
        java.lang.Double d3 = this.isConnected;
        int iHashCode7 = d3 == null ? 0 : d3.hashCode();
        BigDecimal bigDecimal = this.AuCTel;
        int iHashCode8 = bigDecimal == null ? 0 : bigDecimal.hashCode();
        BigDecimal bigDecimal2 = this.AkhnZx;
        int iHashCode9 = bigDecimal2 == null ? 0 : bigDecimal2.hashCode();
        java.lang.Object obj = this.DbNXlk;
        int iHashCode10 = obj == null ? 0 : obj.hashCode();
        java.lang.String str2 = this.AhwBna;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        int iHashCode12 = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.String str3 = this.fetchVPNInfo;
        int iHashCode13 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.AEQbTJ;
        int iHashCode14 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.AYXKKw;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str5 == null ? 0 : str5.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public java.lang.String isConnected() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DiscoverFuturesItemVo(rawInstrument=" + this.valueOf + ", tradeSymbol=" + this.values + ", quoteSymbol=" + this.djBIcL + ", iconUrl=" + this.EZpvd + ", changeRatioValue=" + this.copydefault + ", priceValue=" + this.gEmmrt + ", subPriceValue=" + this.isConnected + ", volumeValue=" + this.AuCTel + ", turnoverValue=" + this.AkhnZx + ", sortTag=" + this.DbNXlk + ", period=" + this.AhwBna + ", isWatching=" + this.KWHzl + ", searchKeyword=" + this.fetchVPNInfo + ", ccyType=" + this.AEQbTJ + ", marketCap=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41638qub
    public BizInstrument values() {
        return this.valueOf;
    }

    public C40752qdq(@NotNull BizInstrument bizInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, java.lang.String str4, boolean z, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf = bizInstrument;
        this.values = str;
        this.djBIcL = str2;
        this.EZpvd = str3;
        this.copydefault = d;
        this.gEmmrt = d2;
        this.isConnected = d3;
        this.AuCTel = bigDecimal;
        this.AkhnZx = bigDecimal2;
        this.DbNXlk = obj;
        this.AhwBna = str4;
        this.KWHzl = z;
        this.fetchVPNInfo = str5;
        this.AEQbTJ = str6;
        this.AYXKKw = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0062: CONSTRUCTOR 
  (r20v0 com.okinc.unify_trade.biz.BizInstrument)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r24v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r25v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0013: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r26v0 java.lang.Double))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x001b: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r27v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0023: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r28v0 java.math.BigDecimal))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x002b: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r29v0 java.lang.Object))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (r33v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r35v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
 A[MD:(com.okinc.unify_trade.biz.BizInstrument, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: o.qdq.<init>(com.okinc.unify_trade.biz.BizInstrument, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C40752qdq(BizInstrument bizInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, java.lang.String str4, boolean z, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bizInstrument, str, str2, str3, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : d2, (i & 64) != 0 ? null : d3, (i & 128) != 0 ? null : bigDecimal, (i & 256) != 0 ? null : bigDecimal2, (i & 512) != 0 ? null : obj, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? null : str5, str6, (i & 16384) != 0 ? null : str7);
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

    /* JADX INFO: renamed from: o.qdq$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qdq.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final InterfaceC41640qud AEQbTJ() {
            return new Activity();
        }

        /* JADX INFO: renamed from: o.qdq$StateListAnimator$Activity */
        public static final class Activity implements InterfaceC41640qud {
            @Override // o.InterfaceC41640qud
            public InterfaceC41638qub KWHzl(BizInstrument bizInstrument) {
                Intrinsics.checkNotNullParameter(bizInstrument, "");
                return new C40752qdq(bizInstrument, bizInstrument.getTradeSymbol(), bizInstrument.getQuoteSymbol(), C55687xoe.AEQbTJ.OLrzqt(bizInstrument.getTradeSymbol()), null, null, null, null, null, null, null, false, null, bizInstrument.getCcyType(), null, 24560, null);
            }
        }
    }

    @Override // o.InterfaceC41638qub
    public InterfaceC41638qub KWHzl(java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, java.lang.String str) {
        return copy$default(this, null, null, null, null, d, d2, d3, bigDecimal, bigDecimal2, obj, str, false, null, null, null, 30735, null);
    }

    @Override // o.InterfaceC41638qub
    public InterfaceC41638qub EZpvd(boolean z) {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, z, null, null, null, 30719, null);
    }

    @Override // o.InterfaceC41638qub
    public InterfaceC41638qub KWHzl(java.lang.String str) {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, false, str, null, null, 28671, null);
    }

    public final InterfaceC41638qub AEQbTJ(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.AYXKKw) ? this : copy$default(this, null, null, null, null, null, null, null, null, null, null, null, false, null, null, str, 16383, null);
    }
}
