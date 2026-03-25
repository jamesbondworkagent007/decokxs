package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.market.ext.UpDownColor;
import com.okinc.market.quotation.ui.model.OptionsDirection;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41642quf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qNg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40206qNg implements InterfaceC41642quf, InterfaceC40237qOk {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final UpDownColor AEQbTJ;
    public final java.lang.Object AYXKKw;
    public final java.lang.String AhwBna;
    public final OptionsDirection EZpvd;
    public final java.lang.CharSequence OLrzqt;
    public final java.lang.Double copydefault;
    public final OptionInstrument djBIcL;
    public final boolean gEmmrt;
    public final java.lang.Double valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40206qNg copy$default(C40206qNg c40206qNg, OptionInstrument optionInstrument, java.lang.Double d, OptionsDirection optionsDirection, java.lang.Double d2, java.lang.CharSequence charSequence, UpDownColor upDownColor, java.lang.Object obj, boolean z, java.lang.String str, int i, java.lang.Object obj2) {
        return c40206qNg.OLrzqt((i & 1) != 0 ? c40206qNg.djBIcL : optionInstrument, (i & 2) != 0 ? c40206qNg.valueOf : d, (i & 4) != 0 ? c40206qNg.EZpvd : optionsDirection, (i & 8) != 0 ? c40206qNg.copydefault : d2, (i & 16) != 0 ? c40206qNg.OLrzqt : charSequence, (i & 32) != 0 ? c40206qNg.AEQbTJ : upDownColor, (i & 64) != 0 ? c40206qNg.AYXKKw : obj, (i & 128) != 0 ? c40206qNg.gEmmrt : z, (i & 256) != 0 ? c40206qNg.AhwBna : str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41642quf
    public java.lang.Object AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qWP
    public boolean DbNXlk() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41642quf
    public OptionsDirection EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41642quf
    public java.lang.Double KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41642quf
    public OptionInstrument OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40206qNg OLrzqt(@NotNull OptionInstrument optionInstrument, java.lang.Double d, @NotNull OptionsDirection optionsDirection, java.lang.Double d2, java.lang.CharSequence charSequence, @NotNull UpDownColor upDownColor, java.lang.Object obj, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(optionInstrument, "");
        Intrinsics.checkNotNullParameter(optionsDirection, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        return new C40206qNg(optionInstrument, d, optionsDirection, d2, charSequence, upDownColor, obj, z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41642quf
    public java.lang.Double copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40206qNg)) {
            return false;
        }
        C40206qNg c40206qNg = (C40206qNg) obj;
        return Intrinsics.EZpvd(this.djBIcL, c40206qNg.djBIcL) && Intrinsics.EZpvd(this.valueOf, c40206qNg.valueOf) && this.EZpvd == c40206qNg.EZpvd && Intrinsics.EZpvd(this.copydefault, c40206qNg.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c40206qNg.OLrzqt) && this.AEQbTJ == c40206qNg.AEQbTJ && Intrinsics.EZpvd(this.AYXKKw, c40206qNg.AYXKKw) && this.gEmmrt == c40206qNg.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c40206qNg.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC41645qui
    public java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.djBIcL.hashCode();
        java.lang.Double d = this.valueOf;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        java.lang.Double d2 = this.copydefault;
        int iHashCode4 = d2 == null ? 0 : d2.hashCode();
        java.lang.CharSequence charSequence = this.OLrzqt;
        int iHashCode5 = charSequence == null ? 0 : charSequence.hashCode();
        int iHashCode6 = this.AEQbTJ.hashCode();
        java.lang.Object obj = this.AYXKKw;
        int iHashCode7 = obj == null ? 0 : obj.hashCode();
        int iHashCode8 = java.lang.Boolean.hashCode(this.gEmmrt);
        java.lang.String str = this.AhwBna;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        OptionInstrument optionInstrument = this.djBIcL;
        java.lang.Double d = this.valueOf;
        OptionsDirection optionsDirection = this.EZpvd;
        java.lang.Double d2 = this.copydefault;
        java.lang.CharSequence charSequence = this.OLrzqt;
        return "NavSearchOptionsQuoteItemVo(rawInstrument=" + optionInstrument + ", markPriceValue=" + d + ", direction=" + optionsDirection + ", changeRatioValue=" + d2 + ", changeRatioDisplayText=" + ((java.lang.Object) charSequence) + ", changeRatioUpDownColor=" + this.AEQbTJ + ", sortTag=" + this.AYXKKw + ", isWatching=" + this.gEmmrt + ", searchKeyword=" + this.AhwBna + ")";
    }

    public C40206qNg(@NotNull OptionInstrument optionInstrument, java.lang.Double d, @NotNull OptionsDirection optionsDirection, java.lang.Double d2, java.lang.CharSequence charSequence, @NotNull UpDownColor upDownColor, java.lang.Object obj, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(optionInstrument, "");
        Intrinsics.checkNotNullParameter(optionsDirection, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        this.djBIcL = optionInstrument;
        this.valueOf = d;
        this.EZpvd = optionsDirection;
        this.copydefault = d2;
        this.OLrzqt = charSequence;
        this.AEQbTJ = upDownColor;
        this.AYXKKw = obj;
        this.gEmmrt = z;
        this.AhwBna = str;
    }

    /* JADX DEBUG: Method merged with bridge method: valueOf()Lo/xqi; */
    @Override // o.InterfaceC41645qui
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public BizInstrument valueOf() {
        return InterfaceC41642quf.TaskDescription.AEQbTJ(this);
    }

    @Override // o.InterfaceC41645qui
    public InterfaceC55797xqi AkhnZx() {
        return InterfaceC41642quf.TaskDescription.OLrzqt(this);
    }

    @Override // o.InterfaceC41642quf
    public InterfaceC41642quf KWHzl(boolean z) {
        return InterfaceC41642quf.TaskDescription.KWHzl(this, z);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/String;)Lo/qui; */
    @Override // o.InterfaceC41645qui
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC41642quf copydefault(java.lang.String str) {
        return InterfaceC41642quf.TaskDescription.AEQbTJ(this, str);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC41642quf.TaskDescription.KWHzl(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC41642quf.TaskDescription.AEQbTJ(this, interfaceC40516qYt);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0041: CONSTRUCTOR 
  (r14v0 com.okinc.unify_trade.biz.OptionInstrument)
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r15v0 java.lang.Double))
  (r16v0 com.okinc.market.quotation.ui.model.OptionsDirection)
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r17v0 java.lang.Double))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r18v0 java.lang.CharSequence))
  (wrap:com.okinc.market.ext.UpDownColor:?: TERNARY null = ((wrap:int:0x001a: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: SGET  A[WRAPPED] (LINE:26) com.okinc.market.ext.UpDownColor.NEUTRAL com.okinc.market.ext.UpDownColor) : (r19v0 com.okinc.market.ext.UpDownColor))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0024: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r20v0 java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
 A[MD:(com.okinc.unify_trade.biz.OptionInstrument, java.lang.Double, com.okinc.market.quotation.ui.model.OptionsDirection, java.lang.Double, java.lang.CharSequence, com.okinc.market.ext.UpDownColor, java.lang.Object, boolean, java.lang.String):void (m)] (LINE:10) call: o.qNg.<init>(com.okinc.unify_trade.biz.OptionInstrument, java.lang.Double, com.okinc.market.quotation.ui.model.OptionsDirection, java.lang.Double, java.lang.CharSequence, com.okinc.market.ext.UpDownColor, java.lang.Object, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ C40206qNg(OptionInstrument optionInstrument, java.lang.Double d, OptionsDirection optionsDirection, java.lang.Double d2, java.lang.CharSequence charSequence, UpDownColor upDownColor, java.lang.Object obj, boolean z, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(optionInstrument, (i & 2) != 0 ? null : d, optionsDirection, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : charSequence, (i & 32) != 0 ? UpDownColor.NEUTRAL : upDownColor, (i & 64) != 0 ? null : obj, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: o.qNg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qNg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final InterfaceC41647quk OLrzqt() {
            return new C0922ActionBar();
        }

        /* JADX INFO: renamed from: o.qNg$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0922ActionBar implements InterfaceC41647quk {
            /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lcom/okinc/unify_trade/biz/OptionInstrument;)Lo/quf; */
            @Override // o.InterfaceC41647quk
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public C40206qNg OLrzqt(OptionInstrument optionInstrument) {
                Intrinsics.checkNotNullParameter(optionInstrument, "");
                java.lang.String optionOptType = optionInstrument.getOptionOptType();
                OptionsDirection optionsDirection = OptionsDirection.CALL;
                if (!Intrinsics.EZpvd((java.lang.Object) optionOptType, (java.lang.Object) optionsDirection.getValue())) {
                    optionsDirection = OptionsDirection.PUT;
                    if (!Intrinsics.EZpvd((java.lang.Object) optionOptType, (java.lang.Object) optionsDirection.getValue())) {
                        optionsDirection = OptionsDirection.ALL;
                    }
                }
                return new C40206qNg(optionInstrument, null, optionsDirection, null, null, null, null, false, null, TypedValues.PositionType.TYPE_PERCENT_X, null);
            }
        }
    }

    @Override // o.InterfaceC41642quf
    public InterfaceC41642quf AEQbTJ(java.lang.Double d, java.lang.Double d2, java.lang.Object obj) {
        return copy$default(this, null, d2, null, d, null, null, obj, false, null, 437, null);
    }

    @Override // o.InterfaceC41642quf
    public InterfaceC41642quf AEQbTJ(boolean z) {
        return copy$default(this, null, null, null, null, null, null, null, z, null, 383, null);
    }

    @Override // o.InterfaceC41642quf
    public InterfaceC41642quf EZpvd(java.lang.String str) {
        return copy$default(this, null, null, null, null, null, null, null, false, str, 255, null);
    }
}
