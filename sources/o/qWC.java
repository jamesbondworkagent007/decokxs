package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.unify_trade.biz.BizInstrument;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qWH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qWC implements qWH {
    public final java.lang.Double AEQbTJ;
    public final java.lang.Object AYXKKw;
    public final java.lang.String AhwBna;
    public final CoinQuote EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final BizInstrument copydefault;
    public final java.lang.Double djBIcL;
    public final BigDecimal fetchVPNInfo;
    public final boolean gEmmrt;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ qWC copy$default(qWC qwc, CoinQuote coinQuote, BizInstrument bizInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z, boolean z2, int i, java.lang.Object obj2) {
        return qwc.copydefault((i & 1) != 0 ? qwc.EZpvd : coinQuote, (i & 2) != 0 ? qwc.copydefault : bizInstrument, (i & 4) != 0 ? qwc.AEQbTJ : d, (i & 8) != 0 ? qwc.djBIcL : d2, (i & 16) != 0 ? qwc.fetchVPNInfo : bigDecimal, (i & 32) != 0 ? qwc.OLrzqt : str, (i & 64) != 0 ? qwc.KWHzl : str2, (i & 128) != 0 ? qwc.AYXKKw : obj, (i & 256) != 0 ? qwc.AhwBna : str3, (i & 512) != 0 ? qwc.valueOf : z, (i & 1024) != 0 ? qwc.gEmmrt : z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWH
    public java.lang.Double AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWH
    public java.lang.Double AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWH
    public java.lang.String AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinQuote KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWH
    public java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizInstrument copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qWC copydefault(@NotNull CoinQuote coinQuote, @NotNull BizInstrument bizInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new qWC(coinQuote, bizInstrument, d, d2, bigDecimal, str, str2, obj, str3, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qWC)) {
            return false;
        }
        qWC qwc = (qWC) obj;
        return Intrinsics.EZpvd(this.EZpvd, qwc.EZpvd) && Intrinsics.EZpvd(this.copydefault, qwc.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, qwc.AEQbTJ) && Intrinsics.EZpvd(this.djBIcL, qwc.djBIcL) && Intrinsics.EZpvd(this.fetchVPNInfo, qwc.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) qwc.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) qwc.KWHzl) && Intrinsics.EZpvd(this.AYXKKw, qwc.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) qwc.AhwBna) && this.valueOf == qwc.valueOf && this.gEmmrt == qwc.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWH
    public BigDecimal fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41645qui
    public java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        java.lang.Double d = this.AEQbTJ;
        int iHashCode3 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.djBIcL;
        int iHashCode4 = d2 == null ? 0 : d2.hashCode();
        BigDecimal bigDecimal = this.fetchVPNInfo;
        int iHashCode5 = bigDecimal == null ? 0 : bigDecimal.hashCode();
        int iHashCode6 = this.OLrzqt.hashCode();
        int iHashCode7 = this.KWHzl.hashCode();
        java.lang.Object obj = this.AYXKKw;
        int iHashCode8 = obj == null ? 0 : obj.hashCode();
        java.lang.String str = this.AhwBna;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BizFavItemVo(coinQuote=" + this.EZpvd + ", bizInstrument=" + this.copydefault + ", changeRatioValue=" + this.AEQbTJ + ", priceValue=" + this.djBIcL + ", turnoverValue=" + this.fetchVPNInfo + ", favCoinName=" + this.OLrzqt + ", instType=" + this.KWHzl + ", sortTag=" + this.AYXKKw + ", searchKeyword=" + this.AhwBna + ", isSelected=" + this.valueOf + ", isEnable=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41645qui
    public InterfaceC55797xqi valueOf() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.valueOf;
    }

    public qWC(@NotNull CoinQuote coinQuote, @NotNull BizInstrument bizInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = coinQuote;
        this.copydefault = bizInstrument;
        this.AEQbTJ = d;
        this.djBIcL = d2;
        this.fetchVPNInfo = bigDecimal;
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.AYXKKw = obj;
        this.AhwBna = str3;
        this.valueOf = z;
        this.gEmmrt = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (r16v0 com.okinc.business.market.bean.CoinQuote)
  (r17v0 com.okinc.unify_trade.biz.BizInstrument)
  (r18v0 java.lang.Double)
  (r19v0 java.lang.Double)
  (r20v0 java.math.BigDecimal)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r23v0 java.lang.Object))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? true : (r26v0 boolean))
 A[MD:(com.okinc.business.market.bean.CoinQuote, com.okinc.unify_trade.biz.BizInstrument, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, boolean, boolean):void (m)] (LINE:16) call: o.qWC.<init>(com.okinc.business.market.bean.CoinQuote, com.okinc.unify_trade.biz.BizInstrument, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ qWC(CoinQuote coinQuote, BizInstrument bizInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coinQuote, bizInstrument, d, d2, bigDecimal, str, str2, (i & 128) != 0 ? null : obj, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? true : z2);
    }

    @Override // o.InterfaceC41645qui
    public InterfaceC55797xqi AkhnZx() {
        return qWH.StateListAnimator.EZpvd(this);
    }

    @Override // o.qWH
    public java.lang.String EZpvd() {
        return this.copydefault.getBizStatus();
    }

    public final qWC AEQbTJ(@NotNull CoinQuote coinQuote, @NotNull BizInstrument bizInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return copy$default(this, coinQuote, bizInstrument, d, d2, bigDecimal, str, str2, obj, null, false, false, 1792, null);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        if (interfaceC40516qYt instanceof qWC) {
            qWC qwc = (qWC) interfaceC40516qYt;
            if (Intrinsics.EZpvd((java.lang.Object) AhwBna(), (java.lang.Object) qwc.AhwBna()) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd.getInstId(), (java.lang.Object) qwc.EZpvd.getInstId()) && Intrinsics.EZpvd(djBIcL(), qwc.djBIcL())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof qWC) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/String;)Lo/qui; */
    @Override // o.InterfaceC41645qui
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public qWH copydefault(java.lang.String str) {
        return !Intrinsics.EZpvd((java.lang.Object) gEmmrt(), (java.lang.Object) str) ? copy$default(this, null, null, null, null, null, null, null, null, str, false, false, 1791, null) : this;
    }

    public final qWH AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return (Intrinsics.EZpvd((java.lang.Object) gEmmrt(), (java.lang.Object) str) && Intrinsics.EZpvd(djBIcL(), (java.lang.Object) str2)) ? this : copy$default(this, null, null, null, null, null, null, null, str2, str, false, false, 1663, null);
    }

    public static /* synthetic */ qWC onCopy$default(qWC qwc, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = qwc.valueOf;
        }
        if ((i & 2) != 0) {
            z2 = qwc.gEmmrt;
        }
        return qwc.AEQbTJ(z, z2);
    }

    public final qWC AEQbTJ(boolean z, boolean z2) {
        if (this.valueOf == z && this.gEmmrt == z2) {
            return this;
        }
        return copy$default(this, null, null, null, null, null, null, null, null, null, z, z2, FrameMetricsAggregator.EVERY_DURATION, null);
    }
}
