package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41641que;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qRT implements InterfaceC41641que, InterfaceC40237qOk {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final boolean AEQbTJ;
    public final java.lang.String AYXKKw;
    public final boolean AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.Object DbNXlk;
    public final java.lang.Double KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public final java.lang.String djBIcL;
    public final BigDecimal ejfBZ;
    public final java.lang.Double fARcdN;
    public final BigDecimal fIwbmz;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.Double gEmmrt;
    public final SpotInstrument isConnected;
    public final java.lang.String valueOf;
    public final boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ qRT copy$default(qRT qrt, SpotInstrument spotInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, boolean z2, java.lang.String str5, boolean z3, boolean z4, java.lang.String str6, int i, java.lang.Object obj2) {
        return qrt.KWHzl((i & 1) != 0 ? qrt.isConnected : spotInstrument, (i & 2) != 0 ? qrt.OLrzqt : str, (i & 4) != 0 ? qrt.AYXKKw : str2, (i & 8) != 0 ? qrt.fetchVPNInfo : str3, (i & 16) != 0 ? qrt.values : z, (i & 32) != 0 ? qrt.valueOf : str4, (i & 64) != 0 ? qrt.KWHzl : d, (i & 128) != 0 ? qrt.gEmmrt : d2, (i & 256) != 0 ? qrt.fARcdN : d3, (i & 512) != 0 ? qrt.ejfBZ : bigDecimal, (i & 1024) != 0 ? qrt.fIwbmz : bigDecimal2, (i & 2048) != 0 ? qrt.DbNXlk : obj, (i & 4096) != 0 ? qrt.AhwBna : z2, (i & 8192) != 0 ? qrt.AkhnZx : str5, (i & 16384) != 0 ? qrt.AEQbTJ : z3, (i & 32768) != 0 ? qrt.copydefault : z4, (i & 65536) != 0 ? qrt.djBIcL : str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public java.lang.String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public java.lang.Double AuCTel() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWP
    public boolean DbNXlk() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public java.lang.Double KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qRT KWHzl(@NotNull SpotInstrument spotInstrument, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, boolean z2, java.lang.String str5, boolean z3, boolean z4, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(spotInstrument, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new qRT(spotInstrument, str, str2, str3, z, str4, d, d2, d3, bigDecimal, bigDecimal2, obj, z2, str5, z3, z4, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public java.lang.Double djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public java.lang.Object ejfBZ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qRT)) {
            return false;
        }
        qRT qrt = (qRT) obj;
        return Intrinsics.EZpvd(this.isConnected, qrt.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) qrt.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) qrt.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) qrt.fetchVPNInfo) && this.values == qrt.values && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) qrt.valueOf) && Intrinsics.EZpvd(this.KWHzl, qrt.KWHzl) && Intrinsics.EZpvd(this.gEmmrt, qrt.gEmmrt) && Intrinsics.EZpvd(this.fARcdN, qrt.fARcdN) && Intrinsics.EZpvd(this.ejfBZ, qrt.ejfBZ) && Intrinsics.EZpvd(this.fIwbmz, qrt.fIwbmz) && Intrinsics.EZpvd(this.DbNXlk, qrt.DbNXlk) && this.AhwBna == qrt.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) qrt.AkhnZx) && this.AEQbTJ == qrt.AEQbTJ && this.copydefault == qrt.copydefault && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) qrt.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fARcdN() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public BigDecimal fIwbmz() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public BigDecimal fJNWhG() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41645qui
    public java.lang.String gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.isConnected.hashCode();
        java.lang.String str = this.OLrzqt;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.AYXKKw.hashCode();
        int iHashCode4 = this.fetchVPNInfo.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.values);
        int iHashCode6 = this.valueOf.hashCode();
        java.lang.Double d = this.KWHzl;
        int iHashCode7 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.gEmmrt;
        int iHashCode8 = d2 == null ? 0 : d2.hashCode();
        java.lang.Double d3 = this.fARcdN;
        int iHashCode9 = d3 == null ? 0 : d3.hashCode();
        BigDecimal bigDecimal = this.ejfBZ;
        int iHashCode10 = bigDecimal == null ? 0 : bigDecimal.hashCode();
        BigDecimal bigDecimal2 = this.fIwbmz;
        int iHashCode11 = bigDecimal2 == null ? 0 : bigDecimal2.hashCode();
        java.lang.Object obj = this.DbNXlk;
        int iHashCode12 = obj == null ? 0 : obj.hashCode();
        int iHashCode13 = java.lang.Boolean.hashCode(this.AhwBna);
        java.lang.String str2 = this.AkhnZx;
        int iHashCode14 = str2 == null ? 0 : str2.hashCode();
        int iHashCode15 = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode16 = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.String str3 = this.djBIcL;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str3 == null ? 0 : str3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NavSearchSpotItemVo(rawInstrument=" + this.isConnected + ", iconUrl=" + this.OLrzqt + ", name=" + this.AYXKKw + ", quote=" + this.fetchVPNInfo + ", showLeverage=" + this.values + ", leverage=" + this.valueOf + ", changeRatioValue=" + this.KWHzl + ", priceValue=" + this.gEmmrt + ", subPriceValue=" + this.fARcdN + ", volumeValue=" + this.ejfBZ + ", turnoverValue=" + this.fIwbmz + ", sortTag=" + this.DbNXlk + ", isWatching=" + this.AhwBna + ", searchKeyword=" + this.AkhnZx + ", isSelected=" + this.AEQbTJ + ", isEnable=" + this.copydefault + ", period=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public SpotInstrument values() {
        return this.isConnected;
    }

    public qRT(@NotNull SpotInstrument spotInstrument, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, boolean z2, java.lang.String str5, boolean z3, boolean z4, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(spotInstrument, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.isConnected = spotInstrument;
        this.OLrzqt = str;
        this.AYXKKw = str2;
        this.fetchVPNInfo = str3;
        this.values = z;
        this.valueOf = str4;
        this.KWHzl = d;
        this.gEmmrt = d2;
        this.fARcdN = d3;
        this.ejfBZ = bigDecimal;
        this.fIwbmz = bigDecimal2;
        this.DbNXlk = obj;
        this.AhwBna = z2;
        this.AkhnZx = str5;
        this.AEQbTJ = z3;
        this.copydefault = z4;
        this.djBIcL = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0073: CONSTRUCTOR 
  (r22v0 com.okinc.unify_trade.biz.SpotInstrument)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 boolean)
  (r27v0 java.lang.String)
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0002: ARITH (r39v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r28v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x000b: ARITH (r39v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r29v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0013: ARITH (r39v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r30v0 java.lang.Double))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x001b: ARITH (r39v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r31v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0023: ARITH (r39v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r32v0 java.math.BigDecimal))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x002b: ARITH (r39v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r33v0 java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r39v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r39v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (r39v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r36v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (32768 int) & (r39v0 int) A[WRAPPED]) != (0 int)) ? true : (r37v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r39v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
 A[MD:(com.okinc.unify_trade.biz.SpotInstrument, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, boolean, boolean, java.lang.String):void (m)] (LINE:11) call: o.qRT.<init>(com.okinc.unify_trade.biz.SpotInstrument, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ qRT(SpotInstrument spotInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, boolean z2, java.lang.String str5, boolean z3, boolean z4, java.lang.String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(spotInstrument, str, str2, str3, z, str4, (i & 64) != 0 ? null : d, (i & 128) != 0 ? null : d2, (i & 256) != 0 ? null : d3, (i & 512) != 0 ? null : bigDecimal, (i & 1024) != 0 ? null : bigDecimal2, (i & 2048) != 0 ? null : obj, (i & 4096) != 0 ? false : z2, (i & 8192) != 0 ? null : str5, (i & 16384) != 0 ? false : z3, (32768 & i) != 0 ? true : z4, (i & 65536) != 0 ? null : str6);
    }

    @Override // o.InterfaceC41645qui
    public InterfaceC55797xqi AkhnZx() {
        return InterfaceC41641que.Application.copydefault(this);
    }

    /* JADX DEBUG: Method merged with bridge method: valueOf()Lo/xqi; */
    @Override // o.InterfaceC41645qui
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public BizInstrument valueOf() {
        return InterfaceC41641que.Application.AEQbTJ(this);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/String;)Lo/qui; */
    @Override // o.InterfaceC41645qui
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC41641que copydefault(java.lang.String str) {
        return InterfaceC41641que.Application.EZpvd(this, str);
    }

    @Override // o.InterfaceC41641que
    public InterfaceC41641que copydefault(boolean z) {
        return InterfaceC41641que.Application.KWHzl(this, z);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC41641que.Application.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC41641que.Application.copydefault(this, interfaceC40516qYt);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qRT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final InterfaceC41651quo OLrzqt() {
            return new TaskDescription();
        }

        public static final class TaskDescription implements InterfaceC41651quo {
            /* JADX DEBUG: Method merged with bridge method: copydefault(Lcom/okinc/unify_trade/biz/SpotInstrument;)Lo/que; */
            @Override // o.InterfaceC41651quo
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public qRT copydefault(SpotInstrument spotInstrument) {
                Intrinsics.checkNotNullParameter(spotInstrument, "");
                java.lang.String level = spotInstrument.getLevel();
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) level)) {
                    level = null;
                }
                if (level == null) {
                    level = spotInstrument.getCoinLever();
                }
                return new qRT(spotInstrument, C55687xoe.AEQbTJ.OLrzqt(spotInstrument.getTradeSymbol()), spotInstrument.getTradeSymbol(), spotInstrument.getDisplayQuoteSymbol(), C33129mqd.OLrzqt((java.lang.CharSequence) level), level + "x", null, null, null, null, null, null, false, null, false, false, null, 131008, null);
            }
        }
    }

    @Override // o.InterfaceC41641que
    public InterfaceC41641que OLrzqt(java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, java.lang.String str) {
        return copy$default(this, null, null, null, null, false, null, d, d2, d3, bigDecimal, bigDecimal2, obj, false, null, false, false, str, 61503, null);
    }

    @Override // o.InterfaceC41641que
    public InterfaceC41641que EZpvd(boolean z) {
        return copy$default(this, null, null, null, null, false, null, null, null, null, null, null, null, z, null, false, false, null, 126975, null);
    }

    @Override // o.InterfaceC41641que
    public InterfaceC41641que AEQbTJ(java.lang.String str) {
        return copy$default(this, null, null, null, null, false, null, null, null, null, null, null, null, false, str, false, false, null, 122879, null);
    }

    public static /* synthetic */ qRT onCopy$OKMarket_market_impl$default(qRT qrt, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = qrt.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z2 = qrt.copydefault;
        }
        return qrt.copydefault(z, z2);
    }

    public final qRT copydefault(boolean z, boolean z2) {
        if (this.AEQbTJ == z && this.copydefault == z2) {
            return this;
        }
        return copy$default(this, null, null, null, null, false, null, null, null, null, null, null, null, false, null, z, z2, null, 81919, null);
    }
}
