package o;

import com.okinc.market.ext.UpDownColor;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41583qtZ;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qJv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40113qJv implements InterfaceC41583qtZ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final UpDownColor AEQbTJ;
    public final BigDecimal AhwBna;
    public final java.lang.Double EZpvd;
    public final boolean OLrzqt;
    public final java.lang.CharSequence copydefault;
    public final TradeCoinInfo djBIcL;
    public final java.lang.Object gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40113qJv copy$default(C40113qJv c40113qJv, TradeCoinInfo tradeCoinInfo, BigDecimal bigDecimal, java.lang.Double d, java.lang.CharSequence charSequence, UpDownColor upDownColor, java.lang.Object obj, boolean z, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            tradeCoinInfo = c40113qJv.djBIcL;
        }
        if ((i & 2) != 0) {
            bigDecimal = c40113qJv.AhwBna;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        if ((i & 4) != 0) {
            d = c40113qJv.EZpvd;
        }
        java.lang.Double d2 = d;
        if ((i & 8) != 0) {
            charSequence = c40113qJv.copydefault;
        }
        java.lang.CharSequence charSequence2 = charSequence;
        if ((i & 16) != 0) {
            upDownColor = c40113qJv.AEQbTJ;
        }
        UpDownColor upDownColor2 = upDownColor;
        if ((i & 32) != 0) {
            obj = c40113qJv.gEmmrt;
        }
        java.lang.Object obj3 = obj;
        if ((i & 64) != 0) {
            z = c40113qJv.OLrzqt;
        }
        return c40113qJv.KWHzl(tradeCoinInfo, bigDecimal2, d2, charSequence2, upDownColor2, obj3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWP
    public boolean DbNXlk() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41583qtZ
    public BigDecimal KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40113qJv KWHzl(@NotNull TradeCoinInfo tradeCoinInfo, BigDecimal bigDecimal, java.lang.Double d, java.lang.CharSequence charSequence, @NotNull UpDownColor upDownColor, java.lang.Object obj, boolean z) {
        Intrinsics.checkNotNullParameter(tradeCoinInfo, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        return new C40113qJv(tradeCoinInfo, bigDecimal, d, charSequence, upDownColor, obj, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41583qtZ
    public java.lang.Double copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41583qtZ
    public TradeCoinInfo djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40113qJv)) {
            return false;
        }
        C40113qJv c40113qJv = (C40113qJv) obj;
        return Intrinsics.EZpvd(this.djBIcL, c40113qJv.djBIcL) && Intrinsics.EZpvd(this.AhwBna, c40113qJv.AhwBna) && Intrinsics.EZpvd(this.EZpvd, c40113qJv.EZpvd) && Intrinsics.EZpvd(this.copydefault, c40113qJv.copydefault) && this.AEQbTJ == c40113qJv.AEQbTJ && Intrinsics.EZpvd(this.gEmmrt, c40113qJv.gEmmrt) && this.OLrzqt == c40113qJv.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41583qtZ
    public java.lang.Object gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.djBIcL.hashCode();
        BigDecimal bigDecimal = this.AhwBna;
        int iHashCode2 = bigDecimal == null ? 0 : bigDecimal.hashCode();
        java.lang.Double d = this.EZpvd;
        int iHashCode3 = d == null ? 0 : d.hashCode();
        java.lang.CharSequence charSequence = this.copydefault;
        int iHashCode4 = charSequence == null ? 0 : charSequence.hashCode();
        int iHashCode5 = this.AEQbTJ.hashCode();
        java.lang.Object obj = this.gEmmrt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        TradeCoinInfo tradeCoinInfo = this.djBIcL;
        BigDecimal bigDecimal = this.AhwBna;
        java.lang.Double d = this.EZpvd;
        java.lang.CharSequence charSequence = this.copydefault;
        return "NavSearchCoinItemVo(rawCoinInfo=" + tradeCoinInfo + ", priceValue=" + bigDecimal + ", changeRatioValue=" + d + ", changeRatioDisplayText=" + ((java.lang.Object) charSequence) + ", changeRatioUpDownColor=" + this.AEQbTJ + ", sortTag=" + this.gEmmrt + ", isWatching=" + this.OLrzqt + ")";
    }

    public C40113qJv(@NotNull TradeCoinInfo tradeCoinInfo, BigDecimal bigDecimal, java.lang.Double d, java.lang.CharSequence charSequence, @NotNull UpDownColor upDownColor, java.lang.Object obj, boolean z) {
        Intrinsics.checkNotNullParameter(tradeCoinInfo, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        this.djBIcL = tradeCoinInfo;
        this.AhwBna = bigDecimal;
        this.EZpvd = d;
        this.copydefault = charSequence;
        this.AEQbTJ = upDownColor;
        this.gEmmrt = obj;
        this.OLrzqt = z;
    }

    @Override // o.InterfaceC41583qtZ
    public InterfaceC41583qtZ EZpvd(boolean z) {
        return InterfaceC41583qtZ.Activity.AEQbTJ(this, z);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC41583qtZ.Activity.copydefault(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC41583qtZ.Activity.AEQbTJ(this, interfaceC40516qYt);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
  (r7v0 com.okinc.unify_trade.biz.TradeCoinInfo)
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r8v0 java.math.BigDecimal))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r9v0 java.lang.Double))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r10v0 java.lang.CharSequence))
  (wrap:com.okinc.market.ext.UpDownColor:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001a: SGET  A[WRAPPED] (LINE:24) com.okinc.market.ext.UpDownColor.NEUTRAL com.okinc.market.ext.UpDownColor) : (r11v0 com.okinc.market.ext.UpDownColor))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.Object) : (null java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(com.okinc.unify_trade.biz.TradeCoinInfo, java.math.BigDecimal, java.lang.Double, java.lang.CharSequence, com.okinc.market.ext.UpDownColor, java.lang.Object, boolean):void (m)] (LINE:9) call: o.qJv.<init>(com.okinc.unify_trade.biz.TradeCoinInfo, java.math.BigDecimal, java.lang.Double, java.lang.CharSequence, com.okinc.market.ext.UpDownColor, java.lang.Object, boolean):void type: THIS */
    public /* synthetic */ C40113qJv(TradeCoinInfo tradeCoinInfo, BigDecimal bigDecimal, java.lang.Double d, java.lang.CharSequence charSequence, UpDownColor upDownColor, java.lang.Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tradeCoinInfo, (i & 2) != 0 ? null : bigDecimal, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : charSequence, (i & 16) != 0 ? UpDownColor.NEUTRAL : upDownColor, (i & 32) == 0 ? obj : null, (i & 64) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: o.qJv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qJv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final InterfaceC41637qua AEQbTJ() {
            return new ActionBar();
        }

        /* JADX INFO: renamed from: o.qJv$StateListAnimator$ActionBar */
        public static final class ActionBar implements InterfaceC41637qua {
            @Override // o.InterfaceC41637qua
            public InterfaceC41583qtZ copydefault(TradeCoinInfo tradeCoinInfo) {
                Intrinsics.checkNotNullParameter(tradeCoinInfo, "");
                return new C40113qJv(tradeCoinInfo, null, null, null, null, null, false, WebSocketProtocol.PAYLOAD_SHORT, null);
            }
        }
    }

    public final java.lang.String OLrzqt() {
        return djBIcL().getUrl();
    }

    @Override // o.InterfaceC41583qtZ
    public java.lang.String EZpvd() {
        return djBIcL().getSymbol();
    }

    public final java.lang.String AEQbTJ() {
        return djBIcL().getName();
    }

    @Override // o.InterfaceC41583qtZ
    public InterfaceC41583qtZ OLrzqt(java.lang.Double d, BigDecimal bigDecimal, java.lang.Object obj) {
        return copy$default(this, null, bigDecimal, d, null, null, obj, false, 89, null);
    }

    @Override // o.InterfaceC41583qtZ
    public InterfaceC41583qtZ AEQbTJ(boolean z) {
        return copy$default(this, null, null, null, null, null, null, z, 63, null);
    }
}
