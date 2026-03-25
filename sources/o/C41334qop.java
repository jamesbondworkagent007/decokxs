package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41641que;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qop, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41334qop implements InterfaceC41641que {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final boolean AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final boolean AkhnZx;
    public final BigDecimal AuCTel;
    public final java.lang.String DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.Double KWHzl;
    public final java.lang.String copydefault;
    public final java.lang.Double djBIcL;
    public final BigDecimal fARcdN;
    public final java.lang.Double fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.lang.Object isConnected;
    public final java.lang.String valueOf;
    public final SpotInstrument values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41334qop copy$default(C41334qop c41334qop, SpotInstrument spotInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, boolean z2, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj2) {
        return c41334qop.AEQbTJ((i & 1) != 0 ? c41334qop.values : spotInstrument, (i & 2) != 0 ? c41334qop.EZpvd : str, (i & 4) != 0 ? c41334qop.AYXKKw : str2, (i & 8) != 0 ? c41334qop.valueOf : str3, (i & 16) != 0 ? c41334qop.AkhnZx : z, (i & 32) != 0 ? c41334qop.copydefault : str4, (i & 64) != 0 ? c41334qop.KWHzl : d, (i & 128) != 0 ? c41334qop.djBIcL : d2, (i & 256) != 0 ? c41334qop.fetchVPNInfo : d3, (i & 512) != 0 ? c41334qop.fARcdN : bigDecimal, (i & 1024) != 0 ? c41334qop.AuCTel : bigDecimal2, (i & 2048) != 0 ? c41334qop.isConnected : obj, (i & 4096) != 0 ? c41334qop.AEQbTJ : z2, (i & 8192) != 0 ? c41334qop.DbNXlk : str5, (i & 16384) != 0 ? c41334qop.gEmmrt : str6, (i & 32768) != 0 ? c41334qop.AhwBna : str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41334qop AEQbTJ(@NotNull SpotInstrument spotInstrument, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, boolean z2, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        Intrinsics.checkNotNullParameter(spotInstrument, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C41334qop(spotInstrument, str, str2, str3, z, str4, d, d2, d3, bigDecimal, bigDecimal2, obj, z2, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public java.lang.String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public java.lang.Double AuCTel() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWP
    public boolean DbNXlk() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public java.lang.Double KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public java.lang.Double djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public java.lang.Object ejfBZ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41334qop)) {
            return false;
        }
        C41334qop c41334qop = (C41334qop) obj;
        return Intrinsics.EZpvd(this.values, c41334qop.values) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c41334qop.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c41334qop.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c41334qop.valueOf) && this.AkhnZx == c41334qop.AkhnZx && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c41334qop.copydefault) && Intrinsics.EZpvd(this.KWHzl, c41334qop.KWHzl) && Intrinsics.EZpvd(this.djBIcL, c41334qop.djBIcL) && Intrinsics.EZpvd(this.fetchVPNInfo, c41334qop.fetchVPNInfo) && Intrinsics.EZpvd(this.fARcdN, c41334qop.fARcdN) && Intrinsics.EZpvd(this.AuCTel, c41334qop.AuCTel) && Intrinsics.EZpvd(this.isConnected, c41334qop.isConnected) && this.AEQbTJ == c41334qop.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c41334qop.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c41334qop.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c41334qop.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public BigDecimal fIwbmz() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public BigDecimal fJNWhG() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41645qui
    public java.lang.String gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.values.hashCode();
        java.lang.String str = this.EZpvd;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.AYXKKw.hashCode();
        int iHashCode4 = this.valueOf.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.AkhnZx);
        int iHashCode6 = this.copydefault.hashCode();
        java.lang.Double d = this.KWHzl;
        int iHashCode7 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.djBIcL;
        int iHashCode8 = d2 == null ? 0 : d2.hashCode();
        java.lang.Double d3 = this.fetchVPNInfo;
        int iHashCode9 = d3 == null ? 0 : d3.hashCode();
        BigDecimal bigDecimal = this.fARcdN;
        int iHashCode10 = bigDecimal == null ? 0 : bigDecimal.hashCode();
        BigDecimal bigDecimal2 = this.AuCTel;
        int iHashCode11 = bigDecimal2 == null ? 0 : bigDecimal2.hashCode();
        java.lang.Object obj = this.isConnected;
        int iHashCode12 = obj == null ? 0 : obj.hashCode();
        int iHashCode13 = java.lang.Boolean.hashCode(this.AEQbTJ);
        java.lang.String str2 = this.DbNXlk;
        int iHashCode14 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.gEmmrt;
        int iHashCode15 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.AhwBna;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str4 == null ? 0 : str4.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DiscoverSpotItemVo(rawInstrument=" + this.values + ", iconUrl=" + this.EZpvd + ", name=" + this.AYXKKw + ", quote=" + this.valueOf + ", showLeverage=" + this.AkhnZx + ", leverage=" + this.copydefault + ", changeRatioValue=" + this.KWHzl + ", priceValue=" + this.djBIcL + ", subPriceValue=" + this.fetchVPNInfo + ", volumeValue=" + this.fARcdN + ", turnoverValue=" + this.AuCTel + ", sortTag=" + this.isConnected + ", isWatching=" + this.AEQbTJ + ", searchKeyword=" + this.DbNXlk + ", marketCap=" + this.gEmmrt + ", period=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41641que
    public SpotInstrument values() {
        return this.values;
    }

    public C41334qop(@NotNull SpotInstrument spotInstrument, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, boolean z2, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        Intrinsics.checkNotNullParameter(spotInstrument, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.values = spotInstrument;
        this.EZpvd = str;
        this.AYXKKw = str2;
        this.valueOf = str3;
        this.AkhnZx = z;
        this.copydefault = str4;
        this.KWHzl = d;
        this.djBIcL = d2;
        this.fetchVPNInfo = d3;
        this.fARcdN = bigDecimal;
        this.AuCTel = bigDecimal2;
        this.isConnected = obj;
        this.AEQbTJ = z2;
        this.DbNXlk = str5;
        this.gEmmrt = str6;
        this.AhwBna = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0068: CONSTRUCTOR 
  (r21v0 com.okinc.unify_trade.biz.SpotInstrument)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 boolean)
  (r26v0 java.lang.String)
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r27v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x000b: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r28v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0013: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r29v0 java.lang.Double))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x001b: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r30v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0023: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r31v0 java.math.BigDecimal))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x002b: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r32v0 java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r37v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r37v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r37v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
 A[MD:(com.okinc.unify_trade.biz.SpotInstrument, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: o.qop.<init>(com.okinc.unify_trade.biz.SpotInstrument, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.math.BigDecimal, java.lang.Object, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C41334qop(SpotInstrument spotInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, boolean z2, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(spotInstrument, str, str2, str3, z, str4, (i & 64) != 0 ? null : d, (i & 128) != 0 ? null : d2, (i & 256) != 0 ? null : d3, (i & 512) != 0 ? null : bigDecimal, (i & 1024) != 0 ? null : bigDecimal2, (i & 2048) != 0 ? null : obj, (i & 4096) != 0 ? false : z2, (i & 8192) != 0 ? null : str5, (i & 16384) != 0 ? null : str6, (i & 32768) != 0 ? null : str7);
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

    /* JADX INFO: renamed from: o.qop$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qop.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final InterfaceC41651quo AEQbTJ() {
            return new ActionBar();
        }

        /* JADX INFO: renamed from: o.qop$Activity$ActionBar */
        public static final class ActionBar implements InterfaceC41651quo {
            @Override // o.InterfaceC41651quo
            public InterfaceC41641que copydefault(SpotInstrument spotInstrument) {
                Intrinsics.checkNotNullParameter(spotInstrument, "");
                java.lang.String level = spotInstrument.getLevel();
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) level)) {
                    level = null;
                }
                if (level == null) {
                    level = spotInstrument.getCoinLever();
                }
                return new C41334qop(spotInstrument, C55687xoe.AEQbTJ.OLrzqt(spotInstrument.getTradeSymbol()), spotInstrument.getTradeSymbol(), spotInstrument.getDisplayQuoteSymbol(), C33129mqd.OLrzqt((java.lang.CharSequence) level), level + "x", null, null, null, null, null, null, false, null, null, null, 65472, null);
            }
        }
    }

    @Override // o.InterfaceC41641que
    public InterfaceC41641que OLrzqt(java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, java.lang.String str) {
        return copy$default(this, null, null, null, null, false, null, d, d2, d3, bigDecimal, bigDecimal2, obj, false, null, null, str, 28735, null);
    }

    @Override // o.InterfaceC41641que
    public InterfaceC41641que EZpvd(boolean z) {
        return copy$default(this, null, null, null, null, false, null, null, null, null, null, null, null, z, null, null, null, 61439, null);
    }

    @Override // o.InterfaceC41641que
    public InterfaceC41641que AEQbTJ(java.lang.String str) {
        return copy$default(this, null, null, null, null, false, null, null, null, null, null, null, null, false, str, null, null, 57343, null);
    }

    public final InterfaceC41641que KWHzl(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.gEmmrt) ? this : copy$default(this, null, null, null, null, false, null, null, null, null, null, null, null, false, null, str, null, 49151, null);
    }
}
