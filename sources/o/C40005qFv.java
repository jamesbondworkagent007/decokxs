package o;

import com.okinc.market.ext.UpDownColor;
import com.okinc.unify_trade.biz.OptionInstrument;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40005qFv implements InterfaceC40516qYt, InterfaceC41791qxV<C40005qFv> {
    public final OptionInstrument AEQbTJ;
    public boolean AYXKKw;
    public final UpDownColor AhwBna;
    public final java.lang.String EZpvd;
    public boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.Integer copydefault;
    public final java.lang.CharSequence djBIcL;
    public final java.lang.String gEmmrt;
    public final C41787qxR isConnected;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40005qFv copy$default(C40005qFv c40005qFv, OptionInstrument optionInstrument, C41787qxR c41787qxR, java.lang.CharSequence charSequence, java.lang.String str, java.lang.String str2, java.lang.String str3, UpDownColor upDownColor, boolean z, boolean z2, java.lang.Integer num, boolean z3, int i, java.lang.Object obj) {
        return c40005qFv.KWHzl((i & 1) != 0 ? c40005qFv.AEQbTJ : optionInstrument, (i & 2) != 0 ? c40005qFv.isConnected : c41787qxR, (i & 4) != 0 ? c40005qFv.djBIcL : charSequence, (i & 8) != 0 ? c40005qFv.EZpvd : str, (i & 16) != 0 ? c40005qFv.OLrzqt : str2, (i & 32) != 0 ? c40005qFv.gEmmrt : str3, (i & 64) != 0 ? c40005qFv.AhwBna : upDownColor, (i & 128) != 0 ? c40005qFv.KWHzl : z, (i & 256) != 0 ? c40005qFv.valueOf : z2, (i & 512) != 0 ? c40005qFv.copydefault : num, (i & 1024) != 0 ? c40005qFv.AYXKKw : z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl()Lcom/okinc/unify_trade/biz/BizInstrument; */
    @Override // o.InterfaceC41791qxV
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public OptionInstrument KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40005qFv KWHzl(@NotNull OptionInstrument optionInstrument, C41787qxR c41787qxR, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull UpDownColor upDownColor, boolean z, boolean z2, java.lang.Integer num, boolean z3) {
        Intrinsics.checkNotNullParameter(optionInstrument, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        return new C40005qFv(optionInstrument, c41787qxR, charSequence, str, str2, str3, upDownColor, z, z2, num, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpDownColor OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C41787qxR djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40005qFv)) {
            return false;
        }
        C40005qFv c40005qFv = (C40005qFv) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c40005qFv.AEQbTJ) && Intrinsics.EZpvd(this.isConnected, c40005qFv.isConnected) && Intrinsics.EZpvd(this.djBIcL, c40005qFv.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c40005qFv.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c40005qFv.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c40005qFv.gEmmrt) && this.AhwBna == c40005qFv.AhwBna && this.KWHzl == c40005qFv.KWHzl && this.valueOf == c40005qFv.valueOf && Intrinsics.EZpvd(this.copydefault, c40005qFv.copydefault) && this.AYXKKw == c40005qFv.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        C41787qxR c41787qxR = this.isConnected;
        int iHashCode2 = c41787qxR == null ? 0 : c41787qxR.hashCode();
        int iHashCode3 = this.djBIcL.hashCode();
        int iHashCode4 = this.EZpvd.hashCode();
        int iHashCode5 = this.OLrzqt.hashCode();
        int iHashCode6 = this.gEmmrt.hashCode();
        int iHashCode7 = this.AhwBna.hashCode();
        int iHashCode8 = java.lang.Boolean.hashCode(this.KWHzl);
        int iHashCode9 = java.lang.Boolean.hashCode(this.valueOf);
        java.lang.Integer num = this.copydefault;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (num != null ? num.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        OptionInstrument optionInstrument = this.AEQbTJ;
        C41787qxR c41787qxR = this.isConnected;
        java.lang.CharSequence charSequence = this.djBIcL;
        return "SearchResultOptionsVo(instrument=" + optionInstrument + ", tickerVo=" + c41787qxR + ", stripeValue=" + ((java.lang.Object) charSequence) + ", optionsType=" + this.EZpvd + ", markPriceDisplay=" + this.OLrzqt + ", ratioDisplay=" + this.gEmmrt + ", ratioColor=" + this.AhwBna + ", isWatching=" + this.KWHzl + ", showWatching=" + this.valueOf + ", filterSorterTag=" + this.copydefault + ", selected=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence valueOf() {
        return this.djBIcL;
    }

    public C40005qFv(@NotNull OptionInstrument optionInstrument, C41787qxR c41787qxR, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull UpDownColor upDownColor, boolean z, boolean z2, java.lang.Integer num, boolean z3) {
        Intrinsics.checkNotNullParameter(optionInstrument, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        this.AEQbTJ = optionInstrument;
        this.isConnected = c41787qxR;
        this.djBIcL = charSequence;
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.gEmmrt = str3;
        this.AhwBna = upDownColor;
        this.KWHzl = z;
        this.valueOf = z2;
        this.copydefault = num;
        this.AYXKKw = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (r15v0 com.okinc.unify_trade.biz.OptionInstrument)
  (r16v0 o.qxR)
  (r17v0 java.lang.CharSequence)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 com.okinc.market.ext.UpDownColor)
  (r22v0 boolean)
  (r23v0 boolean)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
 A[MD:(com.okinc.unify_trade.biz.OptionInstrument, o.qxR, java.lang.CharSequence, java.lang.String, java.lang.String, java.lang.String, com.okinc.market.ext.UpDownColor, boolean, boolean, java.lang.Integer, boolean):void (m)] (LINE:9) call: o.qFv.<init>(com.okinc.unify_trade.biz.OptionInstrument, o.qxR, java.lang.CharSequence, java.lang.String, java.lang.String, java.lang.String, com.okinc.market.ext.UpDownColor, boolean, boolean, java.lang.Integer, boolean):void type: THIS */
    public /* synthetic */ C40005qFv(OptionInstrument optionInstrument, C41787qxR c41787qxR, java.lang.CharSequence charSequence, java.lang.String str, java.lang.String str2, java.lang.String str3, UpDownColor upDownColor, boolean z, boolean z2, java.lang.Integer num, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(optionInstrument, c41787qxR, charSequence, str, str2, str3, upDownColor, z, z2, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? false : z3);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C40005qFv) && Intrinsics.EZpvd(KWHzl(), ((C40005qFv) interfaceC40516qYt).KWHzl());
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C40005qFv) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Z)Lo/qxV; */
    @Override // o.InterfaceC41791qxV
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C40005qFv EZpvd(boolean z) {
        return AkhnZx() == z ? this : copy$default(this, null, null, null, null, null, null, null, z, false, null, false, 1919, null);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/qxR;)Lo/qxV; */
    @Override // o.InterfaceC41791qxV
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C40005qFv OLrzqt(@NotNull C41787qxR c41787qxR) {
        Intrinsics.checkNotNullParameter(c41787qxR, "");
        if (Intrinsics.EZpvd(djBIcL(), c41787qxR)) {
            return this;
        }
        UpDownColor upDownColorAEQbTJ = c41787qxR.AEQbTJ();
        return copy$default(this, null, c41787qxR, null, null, c41787qxR.copydefault(), c41787qxR.EZpvd(), upDownColorAEQbTJ, false, false, null, false, 1933, null);
    }
}
