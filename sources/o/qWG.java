package o;

import com.okinc.unify_trade.biz.DexInstrument;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qWH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qWG implements qWH {
    public final BigDecimal AYXKKw;
    public final java.lang.Double EZpvd;
    public final java.lang.String KWHzl;
    public final qWK OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.Double gEmmrt;
    public final java.lang.Object valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ qWG copy$default(qWG qwg, qWK qwk, java.lang.String str, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, java.lang.String str2, java.lang.String str3, java.lang.Object obj, int i, java.lang.Object obj2) {
        return qwg.OLrzqt((i & 1) != 0 ? qwg.OLrzqt : qwk, (i & 2) != 0 ? qwg.djBIcL : str, (i & 4) != 0 ? qwg.EZpvd : d, (i & 8) != 0 ? qwg.gEmmrt : d2, (i & 16) != 0 ? qwg.AYXKKw : bigDecimal, (i & 32) != 0 ? qwg.copydefault : str2, (i & 64) != 0 ? qwg.KWHzl : str3, (i & 128) != 0 ? qwg.valueOf : obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWH
    public java.lang.Double AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWH
    public java.lang.Double AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWH
    public java.lang.String AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWH
    public java.lang.String EZpvd() {
        return "LIVE";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWH
    public java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qWG OLrzqt(@NotNull qWK qwk, java.lang.String str, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(qwk, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new qWG(qwk, str, d, d2, bigDecimal, str2, str3, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qWK copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qWG)) {
            return false;
        }
        qWG qwg = (qWG) obj;
        return Intrinsics.EZpvd(this.OLrzqt, qwg.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) qwg.djBIcL) && Intrinsics.EZpvd(this.EZpvd, qwg.EZpvd) && Intrinsics.EZpvd(this.gEmmrt, qwg.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, qwg.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) qwg.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) qwg.KWHzl) && Intrinsics.EZpvd(this.valueOf, qwg.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWH
    public BigDecimal fetchVPNInfo() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41645qui
    public java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.String str = this.djBIcL;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.Double d = this.EZpvd;
        int iHashCode3 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.gEmmrt;
        int iHashCode4 = d2 == null ? 0 : d2.hashCode();
        BigDecimal bigDecimal = this.AYXKKw;
        int iHashCode5 = bigDecimal == null ? 0 : bigDecimal.hashCode();
        int iHashCode6 = this.copydefault.hashCode();
        int iHashCode7 = this.KWHzl.hashCode();
        java.lang.Object obj = this.valueOf;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DexFavItemVo(favoriteDexItemVo=" + this.OLrzqt + ", searchKeyword=" + this.djBIcL + ", changeRatioValue=" + this.EZpvd + ", priceValue=" + this.gEmmrt + ", turnoverValue=" + this.AYXKKw + ", favCoinName=" + this.copydefault + ", instType=" + this.KWHzl + ", sortTag=" + this.valueOf + ")";
    }

    public qWG(@NotNull qWK qwk, java.lang.String str, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(qwk, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = qwk;
        this.djBIcL = str;
        this.EZpvd = d;
        this.gEmmrt = d2;
        this.AYXKKw = bigDecimal;
        this.copydefault = str2;
        this.KWHzl = str3;
        this.valueOf = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r11v0 o.qWK)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (r13v0 java.lang.Double)
  (r14v0 java.lang.Double)
  (r15v0 java.math.BigDecimal)
  (r16v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("CEDEFI") : (r17v0 java.lang.String))
  (r18v0 java.lang.Object)
 A[MD:(o.qWK, java.lang.String, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.Object):void (m)] (LINE:18) call: o.qWG.<init>(o.qWK, java.lang.String, java.lang.Double, java.lang.Double, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.Object):void type: THIS */
    public /* synthetic */ qWG(qWK qwk, java.lang.String str, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, java.lang.String str2, java.lang.String str3, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qwk, (i & 2) != 0 ? null : str, d, d2, bigDecimal, str2, (i & 64) != 0 ? "CEDEFI" : str3, obj);
    }

    @Override // o.InterfaceC41645qui
    public InterfaceC55797xqi AkhnZx() {
        return qWH.StateListAnimator.EZpvd(this);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qWG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final InterfaceC41652qup copydefault() {
            return new ActionBar();
        }

        public static final class ActionBar implements InterfaceC41652qup {
            @Override // o.InterfaceC41652qup
            public InterfaceC41655qus OLrzqt(DexInstrument dexInstrument, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, boolean z, java.lang.Boolean bool, java.lang.String str, java.lang.String str2) {
                Intrinsics.checkNotNullParameter(dexInstrument, "");
                return new qWK(dexInstrument, d, d2, bigDecimal, bigDecimal2, bigDecimal3, null, false, null, false, java.lang.Boolean.valueOf(z), bool, str, str2, 960, null);
            }
        }

        public final qWG OLrzqt(@NotNull qWK qwk) {
            Intrinsics.checkNotNullParameter(qwk, "");
            return new qWG(qwk, null, qwk.KWHzl(), qwk.djBIcL(), qwk.values(), qwk.copydefault().getTokenSymbol(), null, qwk.isConnected(), 66, null);
        }
    }

    public final qWG copydefault(@NotNull qWK qwk, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(qwk, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return copy$default(this, qwk, null, d, d2, bigDecimal, str, str2, obj, 2, null);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        if (interfaceC40516qYt instanceof qWG) {
            qWG qwg = (qWG) interfaceC40516qYt;
            if (Intrinsics.EZpvd((java.lang.Object) KWHzl().getTokenContractAddress(), (java.lang.Object) qwg.KWHzl().getTokenContractAddress()) && Intrinsics.EZpvd((java.lang.Object) KWHzl().getChainId(), (java.lang.Object) qwg.KWHzl().getChainId()) && Intrinsics.EZpvd(djBIcL(), qwg.djBIcL())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof qWG) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    public final DexInstrument KWHzl() {
        return this.OLrzqt.copydefault();
    }

    @Override // o.InterfaceC41645qui
    public InterfaceC55797xqi valueOf() {
        return KWHzl();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/String;)Lo/qui; */
    @Override // o.InterfaceC41645qui
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public qWH copydefault(java.lang.String str) {
        return !Intrinsics.EZpvd((java.lang.Object) gEmmrt(), (java.lang.Object) str) ? copy$default(this, null, str, null, null, null, null, null, null, 253, null) : this;
    }

    public final qWH AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return (Intrinsics.EZpvd((java.lang.Object) gEmmrt(), (java.lang.Object) str) && Intrinsics.EZpvd(djBIcL(), (java.lang.Object) str2)) ? this : copy$default(this, null, str, null, null, null, null, null, str2, 125, null);
    }
}
