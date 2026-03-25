package o;

import com.okinc.biz.StrategyType;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.core.util.SPUtils;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.manager.MarginModeManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xOU {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public Application AEQbTJ;
    public java.util.HashMap<java.lang.String, Application> KWHzl = new java.util.HashMap<>();

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xOU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final boolean AhwBna(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        BizInstrument suggestedInstrument$default;
        xOW newProxyInstance;
        xOV xovEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null)) == null) {
            return false;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        return (interfaceC54581xNrOLrzqt2 == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance.EZpvd()) == null || !xovEZpvd.EZpvd()) ? Intrinsics.EZpvd((java.lang.Object) suggestedInstrument$default.getInstType(), (java.lang.Object) "MARGIN") : copydefault(suggestedInstrument$default.getInstId(), suggestedInstrument$default.getInstType()) & yDY.gEmmrt("SPOT", "MARGIN").contains(suggestedInstrument$default.getInstType());
    }

    public final java.lang.String gEmmrt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        C54589xNz c54589xNz;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        xOV xovEZpvd;
        C54489xKh c54489xKhZsXlph;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!C55697xoo.OLrzqt.isConnected() || (interfaceC54581xNrOLrzqt = (c54589xNz = C54589xNz.EZpvd).OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance.EZpvd()) == null || !xovEZpvd.OLrzqt() || !copydefault(str, str2) || !yDY.gEmmrt("SPOT", "MARGIN").contains(str2)) {
            return str2;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        java.lang.String string = SPUtils.getString("key_trade_ins_type-" + ((interfaceC54581xNrOLrzqt2 == null || (c54489xKhZsXlph = interfaceC54581xNrOLrzqt2.zsXlph()) == null) ? null : c54489xKhZsXlph.EZpvd()), "", "file_trade_ins_type");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
            return str2;
        }
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }

    public final boolean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (!((interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(str2) : null) instanceof xLL)) {
            return true;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.OLrzqt(str2) : null;
        Intrinsics.copydefault(abstractC54531xLwOLrzqt, "");
        return ((xLL) abstractC54531xLwOLrzqt).KWHzl(str);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54589xNz.EZpvd.KWHzl(str);
    }

    public final java.lang.String KWHzl() {
        return C54589xNz.EZpvd.fetchVPNInfo();
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("key_syratagy_rade_mode-" + C54589xNz.EZpvd.EZpvd(), str, "file_trade_strategy_ins_type");
    }

    public final java.lang.String OLrzqt() {
        java.lang.String string = SPUtils.getString("key_syratagy_rade_mode-" + C54589xNz.EZpvd.EZpvd(), "grid", "file_trade_strategy_ins_type");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [107=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StateListAnimator OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        C54589xNz c54589xNz;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        xOW newProxyInstance2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3;
        MarginModeManager marginModeManagerIsConnected;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        StateListAnimator stateListAnimator = new StateListAnimator(true, str, null, 4, null);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "trade_tactics")) {
            switch (str2.hashCode()) {
                case -2027980370:
                    if (str2.equals("MARGIN")) {
                        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "grid") && ((interfaceC54581xNrOLrzqt2 = (c54589xNz = C54589xNz.EZpvd).OLrzqt()) == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || !newProxyInstance2.AuCTel() || (interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt()) == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt3.isConnected()) == null || !MarginModeManager.isCross$default(marginModeManagerIsConnected, null, 1, null))) {
                            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatCallbackStubApi24));
                            stateListAnimator.KWHzl(false);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "contract_grid")) {
                            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.getContentDescription));
                            stateListAnimator.KWHzl(false);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "recurring") && ((interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.AuCTel())) {
                            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.ActionBarNavigationMode));
                            stateListAnimator.KWHzl(false);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "smart_portfolio")) {
                            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.flagMapping));
                            stateListAnimator.KWHzl(false);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "moon_grid")) {
                            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.getFillInIntent));
                            stateListAnimator.KWHzl(false);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "spot_dca")) {
                            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.removeOnNewIntentListener));
                            stateListAnimator.KWHzl(false);
                        }
                    }
                    break;
                case -1956807563:
                    if (str2.equals("OPTION")) {
                        if (!Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "arbitrage")) {
                            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.onNavigationItemSelected));
                            stateListAnimator.KWHzl(false);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "smart_portfolio")) {
                            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.flagMapping));
                            stateListAnimator.KWHzl(false);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "moon_grid")) {
                            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.getFillInIntent));
                            stateListAnimator.KWHzl(false);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "spot_dca")) {
                            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.removeOnNewIntentListener));
                            stateListAnimator.KWHzl(false);
                        }
                    }
                    break;
                case 2552066:
                    if (str2.equals("SPOT") && Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "contract_grid")) {
                        stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.getContentDescription));
                        stateListAnimator.KWHzl(false);
                    }
                    break;
                case 2558355:
                    if (str2.equals("SWAP")) {
                        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "grid")) {
                            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatCallbackStubApi24));
                            stateListAnimator.KWHzl(false);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "recurring")) {
                            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.ActionBarNavigationMode));
                            stateListAnimator.KWHzl(false);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "smart_portfolio")) {
                            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.flagMapping));
                            stateListAnimator.KWHzl(false);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "moon_grid")) {
                            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.getFillInIntent));
                            stateListAnimator.KWHzl(false);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "spot_dca")) {
                            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.removeOnNewIntentListener));
                            stateListAnimator.KWHzl(false);
                        }
                    }
                    break;
                case 214415088:
                    if (str2.equals("FUTURES")) {
                    }
                    break;
            }
        }
        return stateListAnimator;
    }

    public static /* synthetic */ java.lang.String getSupportStrategyMode$default(xOU xou, BizInstrument bizInstrument, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return xou.EZpvd(bizInstrument, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return "contract_grid";
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:?, code lost:
    
        return "contract_grid";
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
    
        return "contract_grid";
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:
    
        return "contract_grid";
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return "contract_grid";
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:?, code lost:
    
        return "contract_grid";
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        return "recurring";
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
    
        return "recurring";
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r0.equals("FUTURES") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:?, code lost:
    
        return "recurring";
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:?, code lost:
    
        return "recurring";
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r0.equals("SWAP") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r8.isPositiveContract() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        switch(r9.hashCode()) {
            case -1148661171: goto L34;
            case -512749997: goto L31;
            case 3573234: goto L28;
            case 1165749981: goto L25;
            case 1629187779: goto L22;
            default: goto L89;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r9.equals("iceberg") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (r9.equals("recurring") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r9.equals("twap") != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (r9.equals("contract_grid") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r9.equals("smart_iceberg") != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        switch(r9.hashCode()) {
            case -1148661171: goto L49;
            case 3573234: goto L46;
            case 1165749981: goto L43;
            case 1629187779: goto L40;
            default: goto L95;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        if (r9.equals("iceberg") == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r9.equals("recurring") != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r9.equals("twap") != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
    
        if (r9.equals("smart_iceberg") != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ff, code lost:
    
        return "recurring";
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(BizInstrument bizInstrument, @NotNull java.lang.String str) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String instType = bizInstrument != null ? bizInstrument.getInstType() : null;
        if (instType != null) {
            switch (instType.hashCode()) {
                case -1956807563:
                    if (instType.equals("OPTION")) {
                        return "trade_manual";
                    }
                    break;
                case 2552066:
                    if (instType.equals("SPOT")) {
                        return (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_grid") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "lvf_buy") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "lvf_sell") || !(!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "dcd_bot") || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null || interfaceC54581xNrCopydefault.values(bizInstrument.getInstFamily()))) ? "grid" : str;
                    }
                    break;
                case 2558355:
                    break;
                case 214415088:
                    break;
            }
        }
        switch (str.hashCode()) {
            case -1148661171:
                return !str.equals("smart_iceberg") ? "recurring" : str;
            case 3573234:
                return !str.equals("twap") ? "recurring" : str;
            case 1165749981:
                return !str.equals("recurring") ? "recurring" : str;
            case 1629187779:
                return str.equals("iceberg") ? str : "recurring";
            default:
                return "recurring";
        }
    }

    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public boolean OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(false, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = stateListAnimator.copydefault;
            }
            if ((i & 4) != 0) {
                str2 = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.copydefault(z, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(z, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.OLrzqt == stateListAnimator.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Boolean.hashCode(this.OLrzqt) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ModeMessage(support=" + this.OLrzqt + ", mode=" + this.copydefault + ", message=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = z;
            this.copydefault = str;
            this.AEQbTJ = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String):void (m)] (LINE:250) call: o.xOU.StateListAnimator.<init>(boolean, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(boolean z, java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = application.AEQbTJ;
            }
            return application.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Application(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TradePageData(type=" + this.OLrzqt + ", subType=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.AEQbTJ = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0004: SGET  A[WRAPPED] com.okinc.p2p.api.OtcExtraKeys.ORDER java.lang.String) : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0010: INVOKE 
  (wrap:int:0x000c: INVOKE 
  (wrap:com.okinc.biz.StrategyType:0x000a: SGET  A[WRAPPED] (LINE:253) com.okinc.biz.StrategyType.LIMIT com.okinc.biz.StrategyType)
 VIRTUAL call: java.lang.Enum.ordinal():int A[MD:():int (c), WRAPPED] (LINE:253))
 STATIC call: java.lang.String.valueOf(int):java.lang.String A[MD:(int):java.lang.String (c), WRAPPED] (LINE:253)) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:253) call: o.xOU.Application.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? OtcExtraKeys.ORDER : str, (i & 2) != 0 ? java.lang.String.valueOf(StrategyType.LIMIT.ordinal()) : str2);
        }
    }

    public static /* synthetic */ void setCurrentPageData$default(xOU xou, Application application, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        xou.EZpvd(application, z);
    }

    public final void EZpvd(@NotNull Application application, boolean z) {
        Intrinsics.checkNotNullParameter(application, "");
        java.util.HashMap<java.lang.String, Application> map = this.KWHzl;
        Application application2 = map.get(application.copydefault());
        if (application2 == null) {
            map.put(application.copydefault(), application);
        } else {
            if (!z) {
                application2.KWHzl(application.EZpvd());
            }
            application = application2;
        }
        this.AEQbTJ = application;
    }

    public static /* synthetic */ void setCurrentTriggerPriceType$default(xOU xou, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = ExtJson.BRC20TYPE_TRADE;
        }
        xou.copydefault(str, str2, str3);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        SPUtils.put(OLrzqt(str2, "key_single_trigger_price_type", str3), str, "file_price_type");
    }

    public static /* synthetic */ java.lang.String getCurrentTriggerPriceType$default(xOU xou, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = ExtJson.BRC20TYPE_TRADE;
        }
        return xou.EZpvd(str, str2);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String string = SPUtils.getString(OLrzqt(str, "key_single_trigger_price_type", str2), "last", "file_price_type");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ void setCurrentSlTriggerPriceType$default(xOU xou, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = ExtJson.BRC20TYPE_TRADE;
        }
        xou.EZpvd(str, str2, str3);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        SPUtils.put(OLrzqt(str2, "key_sltrigger_price_type", str3), str, "file_price_type");
    }

    public static /* synthetic */ java.lang.String getCurrentSlTriggerPriceType$default(xOU xou, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = ExtJson.BRC20TYPE_TRADE;
        }
        return xou.AEQbTJ(str, str2);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String string = SPUtils.getString(OLrzqt(str, "key_sltrigger_price_type", str2), "last", "file_price_type");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ void setCurrentSinglePriceType$default(xOU xou, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = ExtJson.BRC20TYPE_TRADE;
        }
        xou.AEQbTJ(str, str2, str3);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        SPUtils.put(OLrzqt(str2, "key_single_price_type", str3), str, "file_price_type");
    }

    public static /* synthetic */ java.lang.String getCurrentSinglePriceType$default(xOU xou, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = ExtJson.BRC20TYPE_TRADE;
        }
        return xou.KWHzl(str, str2);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String string = SPUtils.getString(OLrzqt(str, "key_single_price_type", str2), "last", "file_price_type");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ java.lang.String getTriggerPriceTypeKey$default(xOU xou, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = ExtJson.BRC20TYPE_TRADE;
        }
        return xou.OLrzqt(str, str2, str3);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        C54489xKh c54489xKhZsXlph;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String str4 = str + "-" + str3 + "-" + ((interfaceC54581xNrOLrzqt == null || (c54489xKhZsXlph = interfaceC54581xNrOLrzqt.zsXlph()) == null) ? null : c54489xKhZsXlph.EZpvd()) + "}";
        if (C55697xoo.OLrzqt.AkhnZx()) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1642127641) {
                if (iHashCode != -1471037104) {
                    if (iHashCode == -848333618 && str2.equals("key_single_trigger_price_type")) {
                        return "key_single_trigger_price_type-test-" + str4;
                    }
                } else if (str2.equals("key_sltrigger_price_type")) {
                    return "key_sltrigger_price_type-test-" + str4;
                }
            } else if (str2.equals("key_single_price_type")) {
                return "key_single_price_type-test-" + str4;
            }
            return "key_single_trigger_price_type-test-" + str4;
        }
        int iHashCode2 = str2.hashCode();
        if (iHashCode2 != -1642127641) {
            if (iHashCode2 != -1471037104) {
                if (iHashCode2 == -848333618 && str2.equals("key_single_trigger_price_type")) {
                    return "key_single_trigger_price_type-" + str4;
                }
            } else if (str2.equals("key_sltrigger_price_type")) {
                return "key_sltrigger_price_type-" + str4;
            }
        } else if (str2.equals("key_single_price_type")) {
            return "key_single_price_type-" + str4;
        }
        return "key_single_trigger_price_type-" + str4;
    }

    public static /* synthetic */ void setTriggerPriceType$default(xOU xou, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = ExtJson.BRC20TYPE_TRADE;
        }
        xou.valueOf(str, str2);
    }

    public final void valueOf(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        C54489xKh c54489xKhZsXlph;
        C54489xKh c54489xKhZsXlph2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strEZpvd = null;
        if (C55697xoo.OLrzqt.AkhnZx()) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (c54489xKhZsXlph2 = interfaceC54581xNrOLrzqt.zsXlph()) != null) {
                strEZpvd = c54489xKhZsXlph2.EZpvd();
            }
            SPUtils.put("key_trigger_price_type-test-" + str2 + "-" + strEZpvd, str, "file_price_type");
            return;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (c54489xKhZsXlph = interfaceC54581xNrOLrzqt2.zsXlph()) != null) {
            strEZpvd = c54489xKhZsXlph.EZpvd();
        }
        SPUtils.put("key_trigger_price_type-" + str2 + "-" + strEZpvd, str, "file_price_type");
    }

    public static /* synthetic */ java.lang.String getTriggerPriceType$default(xOU xou, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = ExtJson.BRC20TYPE_TRADE;
        }
        return xou.OLrzqt(str);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        C54489xKh c54489xKhZsXlph;
        C54489xKh c54489xKhZsXlph2;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = null;
        if (C55697xoo.OLrzqt.AkhnZx()) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (c54489xKhZsXlph2 = interfaceC54581xNrOLrzqt.zsXlph()) != null) {
                strEZpvd = c54489xKhZsXlph2.EZpvd();
            }
            java.lang.String string = SPUtils.getString("key_trigger_price_type-test-" + str + "-" + strEZpvd, "last", "file_price_type");
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (c54489xKhZsXlph = interfaceC54581xNrOLrzqt2.zsXlph()) != null) {
            strEZpvd = c54489xKhZsXlph.EZpvd();
        }
        java.lang.String string2 = SPUtils.getString("key_trigger_price_type-" + str + "-" + strEZpvd, "last", "file_price_type");
        Intrinsics.copydefault((java.lang.Object) string2);
        return string2;
    }
}
