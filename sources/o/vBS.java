package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vBS implements InterfaceC50102vBz {
    public final vBB AEQbTJ;
    public final C53441wlZ AYXKKw;
    public java.lang.String AhwBna;
    public final android.util.ArrayMap<java.lang.String, java.lang.String> AkhnZx;
    public final java.util.List<vBP> DbNXlk;
    public final java.lang.String EZpvd;
    public BizInstrument KWHzl;
    public java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final androidx.fragment.app.FragmentManager djBIcL;
    public final vBA ejfBZ;
    public vBP fIwbmz;
    public TickersData fetchVPNInfo;
    public final android.content.Context gEmmrt;
    public java.lang.String isConnected;
    public boolean valueOf;
    public final android.util.ArrayMap<java.lang.String, java.lang.String> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(vBP vbp) {
        this.fIwbmz = vbp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C53441wlZ AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TickersData AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC50102vBz
    public void EZpvd(@NotNull TickersData tickersData) {
        Intrinsics.checkNotNullParameter(tickersData, "");
        this.fetchVPNInfo = tickersData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizInstrument KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final vBA ejfBZ() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.util.ArrayMap<java.lang.String, java.lang.String> gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final vBP isConnected() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<vBP> values() {
        return this.DbNXlk;
    }

    public vBS(@NotNull androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context, C53441wlZ c53441wlZ, vBA vba, @NotNull vBB vbb, BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(vbb, "");
        this.djBIcL = fragmentManager;
        this.gEmmrt = context;
        this.AYXKKw = c53441wlZ;
        this.ejfBZ = vba;
        this.AEQbTJ = vbb;
        this.KWHzl = bizInstrument;
        this.EZpvd = "crossType_select";
        this.copydefault = "bot_arbitrage_page";
        android.util.ArrayMap<java.lang.String, java.lang.String> arrayMap = new android.util.ArrayMap<>();
        this.values = arrayMap;
        this.isConnected = "cross";
        this.AkhnZx = new android.util.ArrayMap<>();
        this.OLrzqt = "";
        this.DbNXlk = new java.util.ArrayList();
        this.AhwBna = "";
        AuCTel();
        if (DbNXlk().booleanValue()) {
            arrayMap.put("cross", C33070mpX.AYXKKw(C55688xof.Application.gBtXYZ));
        } else {
            arrayMap.put("isolated", C33070mpX.AYXKKw(C55688xof.Application.pauseLocationServices));
            arrayMap.put("cross", C33070mpX.AYXKKw(C55688xof.Application.gBtXYZ));
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r8v0 androidx.fragment.app.FragmentManager)
  (r9v0 android.content.Context)
  (r10v0 o.wlZ)
  (r11v0 o.vBA)
  (r12v0 o.vBB)
  (wrap:com.okinc.unify_trade.biz.BizInstrument:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.BizInstrument) : (r13v0 com.okinc.unify_trade.biz.BizInstrument))
 A[MD:(androidx.fragment.app.FragmentManager, android.content.Context, o.wlZ, o.vBA, o.vBB, com.okinc.unify_trade.biz.BizInstrument):void (m)] (LINE:31) call: o.vBS.<init>(androidx.fragment.app.FragmentManager, android.content.Context, o.wlZ, o.vBA, o.vBB, com.okinc.unify_trade.biz.BizInstrument):void type: THIS */
    public /* synthetic */ vBS(androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context, C53441wlZ c53441wlZ, vBA vba, vBB vbb, BizInstrument bizInstrument, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, context, c53441wlZ, vba, vbb, (i & 32) != 0 ? null : bizInstrument);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Boolean DbNXlk() {
        boolean z;
        boolean zEZpvd = C54794xVo.copydefault.EZpvd();
        BizInstrument bizInstrument = this.KWHzl;
        if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "MARGIN")) {
            z = C55697xoo.OLrzqt.isConnected() && zEZpvd;
        } else {
            BizInstrument bizInstrument2 = this.KWHzl;
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstType() : null), (java.lang.Object) "SPOT")) {
            }
        }
        return java.lang.Boolean.valueOf(z);
    }

    @Override // o.InterfaceC50102vBz
    public void KWHzl(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        java.lang.String instType = bizInstrument.getInstType();
        this.valueOf = !Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) (this.KWHzl != null ? r1.getInstType() : null));
        this.KWHzl = bizInstrument;
        AuCTel();
    }

    @Override // o.InterfaceC50102vBz
    public void copydefault(java.lang.String str) {
        this.AhwBna = str;
        C53441wlZ c53441wlZ = this.AYXKKw;
        if (c53441wlZ != null) {
            c53441wlZ.setLeverage(str);
        }
        vBA vba = this.ejfBZ;
        if (vba != null) {
            vba.setLeverage(str);
        }
    }

    @Override // o.InterfaceC50102vBz
    public void AEQbTJ(java.lang.String str, java.lang.String str2) {
        java.lang.Object next;
        java.util.Iterator<T> it = this.DbNXlk.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            vBP vbp = (vBP) next;
            if (Intrinsics.EZpvd((java.lang.Object) vbp.KWHzl(), (java.lang.Object) str) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) vbp.OLrzqt())) {
                break;
            }
        }
        vBP vbp2 = (vBP) next;
        this.fIwbmz = vbp2;
        vBA vba = this.ejfBZ;
        if (vba != null) {
            vba.setTradeOrderType(vbp2);
        }
        fIwbmz();
    }

    @Override // o.InterfaceC50102vBz
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected = str;
        C53441wlZ c53441wlZ = this.AYXKKw;
        if (c53441wlZ != null) {
            c53441wlZ.setCrossType(this.values.get(str), true);
        }
        vBA vba = this.ejfBZ;
        if (vba != null) {
            vba.setCrossType(this.values.get(str), true);
        }
        fIwbmz();
    }

    @Override // o.InterfaceC50102vBz
    public java.lang.String AEQbTJ() {
        java.lang.String quoteSymbol;
        java.lang.String tradeSymbol;
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.EZpvd()) instanceof C54622xPe) {
            BizInstrument bizInstrument = this.KWHzl;
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "MARGIN")) {
                if (Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) "margin_base")) {
                    BizInstrument bizInstrument2 = this.KWHzl;
                    if (bizInstrument2 != null && (tradeSymbol = bizInstrument2.getTradeSymbol()) != null) {
                        return tradeSymbol;
                    }
                } else {
                    BizInstrument bizInstrument3 = this.KWHzl;
                    if (bizInstrument3 != null && (quoteSymbol = bizInstrument3.getQuoteSymbol()) != null) {
                        return quoteSymbol;
                    }
                }
            }
        }
        return "";
    }

    @Override // o.InterfaceC50102vBz
    public java.lang.String EZpvd() {
        BizInstrument bizInstrument;
        java.lang.String quoteSymbol;
        BizInstrument bizInstrument2;
        BizInstrument bizInstrument3 = this.KWHzl;
        if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument3 != null ? bizInstrument3.getInstType() : null), (java.lang.Object) "MARGIN") || !Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) "isolated")) {
            BizInstrument bizInstrument4 = this.KWHzl;
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument4 != null ? bizInstrument4.getInstType() : null), (java.lang.Object) "MARGIN") && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) "cross")) {
                return (!Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) "margin_base") ? !((bizInstrument = this.KWHzl) == null || (quoteSymbol = bizInstrument.getQuoteSymbol()) == null) : !((bizInstrument2 = this.KWHzl) == null || (quoteSymbol = bizInstrument2.getTradeSymbol()) == null)) ? "" : quoteSymbol;
            }
            return null;
        }
        vBP vbp = this.fIwbmz;
        if (Intrinsics.EZpvd((java.lang.Object) (vbp != null ? vbp.KWHzl() : null), (java.lang.Object) "buy")) {
            BizInstrument bizInstrument5 = this.KWHzl;
            if (bizInstrument5 != null) {
                return bizInstrument5.getTradeSymbol();
            }
            return null;
        }
        BizInstrument bizInstrument6 = this.KWHzl;
        if (bizInstrument6 != null) {
            return bizInstrument6.getQuoteSymbol();
        }
        return null;
    }

    public final void AuCTel() {
        java.lang.String instType;
        java.lang.String strDjBIcL;
        xOU xouWlaJM;
        BizInstrument bizInstrument = this.KWHzl;
        java.lang.String str = "";
        if (bizInstrument != null) {
            C53441wlZ c53441wlZ = this.AYXKKw;
            if (c53441wlZ != null) {
                c53441wlZ.setCoinName(C54799xVt.AEQbTJ.OLrzqt(bizInstrument));
            }
            vBA vba = this.ejfBZ;
            if (vba != null) {
                vba.setCoinName(C54799xVt.AEQbTJ.OLrzqt(bizInstrument));
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null || !xouWlaJM.AhwBna(bizInstrument.getInstId(), bizInstrument.getInstType())) {
                C53441wlZ c53441wlZ2 = this.AYXKKw;
                if (c53441wlZ2 != null) {
                    c53441wlZ2.setMarginNum(null);
                }
                vBA vba2 = this.ejfBZ;
                if (vba2 != null) {
                    vba2.setMarginNum(null);
                }
            } else {
                BizInstrument bizInstrument2 = this.KWHzl;
                Intrinsics.copydefault(bizInstrument2, "");
                SpotInstrument spotInstrument = (SpotInstrument) bizInstrument2;
                C53441wlZ c53441wlZ3 = this.AYXKKw;
                if (c53441wlZ3 != null) {
                    c53441wlZ3.setMarginNum(spotInstrument.getLevel() + "X");
                }
                vBA vba3 = this.ejfBZ;
                if (vba3 != null) {
                    vba3.setMarginNum(spotInstrument.getLevel() + "X");
                }
            }
        }
        fIwbmz();
        fARcdN();
        vBA vba4 = this.ejfBZ;
        if (vba4 != null) {
            BizInstrument bizInstrument3 = this.KWHzl;
            vba4.setInsType(bizInstrument3 != null ? bizInstrument3.getInstType() : null);
        }
        vBA vba5 = this.ejfBZ;
        if (vba5 != null) {
            BizInstrument bizInstrument4 = this.KWHzl;
            vba5.setInstId(bizInstrument4 != null ? bizInstrument4.getInstId() : null);
        }
        vBA vba6 = this.ejfBZ;
        if (vba6 != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null) {
                BizInstrument bizInstrument5 = this.KWHzl;
                if (bizInstrument5 == null || (instType = bizInstrument5.getInstType()) == null) {
                    instType = "";
                }
                AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(instType);
                if (abstractC54531xLwOLrzqt != null && (strDjBIcL = abstractC54531xLwOLrzqt.djBIcL(this.KWHzl)) != null) {
                    str = strDjBIcL;
                }
            }
            vba6.setUnit(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) (r0 != null ? r0.getInstType() : null), (java.lang.Object) "FUTURES") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fARcdN() {
        C56084xwD fieldNames;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strAYXKKw = (interfaceC54581xNrOLrzqt == null || (fieldNames = interfaceC54581xNrOLrzqt.getFieldNames()) == null) ? null : fieldNames.AYXKKw();
        this.DbNXlk.clear();
        if (Intrinsics.EZpvd((java.lang.Object) "long_short_mode", (java.lang.Object) strAYXKKw)) {
            BizInstrument bizInstrument = this.KWHzl;
            if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "SWAP")) {
                BizInstrument bizInstrument2 = this.KWHzl;
            }
            this.DbNXlk.add(new vBP("buy", "long", C33070mpX.AYXKKw(C55688xof.Application.lambdanew0)));
            this.DbNXlk.add(new vBP("sell", "short", C33070mpX.AYXKKw(C55688xof.Application.addOnMultiWindowModeChangedListener)));
            this.DbNXlk.add(new vBP("buy", "short", C33070mpX.AYXKKw(C55688xof.Application.getCREATORannotations)));
            this.DbNXlk.add(new vBP("sell", "long", C33070mpX.AYXKKw(C55688xof.Application.LocalFullyDrawnReporterOwnerLocalFullyDrawnReporterOwner1)));
            return;
        }
        BizInstrument bizInstrument3 = this.KWHzl;
        if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument3 != null ? bizInstrument3.getInstType() : null), (java.lang.Object) "SWAP")) {
            BizInstrument bizInstrument4 = this.KWHzl;
            if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument4 != null ? bizInstrument4.getInstType() : null), (java.lang.Object) "FUTURES")) {
                this.DbNXlk.add(new vBP("buy", "net", C33070mpX.AYXKKw(C55688xof.Application.setPipParamsSourceRectHint)));
                this.DbNXlk.add(new vBP("sell", "net", C33070mpX.AYXKKw(C55688xof.Application.addMenuProvider)));
                return;
            }
        }
        this.DbNXlk.add(new vBP("buy", "net", C33070mpX.AYXKKw(C55688xof.Application.setPipParamsSourceRectHint)));
        this.DbNXlk.add(new vBP("sell", "net", C33070mpX.AYXKKw(C55688xof.Application.addMenuProvider)));
    }

    public final void fIwbmz() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        xOV xovEZpvd;
        java.lang.String str;
        this.AkhnZx.clear();
        BizInstrument bizInstrument = this.KWHzl;
        java.lang.String tradeSymbol = bizInstrument != null ? bizInstrument.getTradeSymbol() : null;
        java.lang.String str2 = tradeSymbol + " " + C33070mpX.AYXKKw(C55688xof.Application.DvMhtu);
        BizInstrument bizInstrument2 = this.KWHzl;
        java.lang.String quoteSymbol = bizInstrument2 != null ? bizInstrument2.getQuoteSymbol() : null;
        java.lang.String str3 = quoteSymbol + " " + C33070mpX.AYXKKw(C55688xof.Application.DvMhtu);
        if (Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) "isolated")) {
            vBP vbp = this.fIwbmz;
            if (Intrinsics.EZpvd((java.lang.Object) (vbp != null ? vbp.KWHzl() : null), (java.lang.Object) "buy")) {
                this.AkhnZx.put("margin_base", str2);
                this.OLrzqt = "margin_base";
            } else {
                this.AkhnZx.put("margin_quote", str3);
                this.OLrzqt = "margin_quote";
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) "cross") && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && (xovEZpvd = newProxyInstance.EZpvd()) != null && !xovEZpvd.OLrzqt()) {
            this.AkhnZx.put("margin_quote", str3);
            this.AkhnZx.put("margin_base", str2);
        }
        java.lang.String str4 = this.OLrzqt;
        if (str4 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str4) || (str = this.OLrzqt) == null || str.length() == 0) {
            this.OLrzqt = "margin_base";
        }
        BizInstrument bizInstrument3 = this.KWHzl;
        if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument3 != null ? bizInstrument3.getInstType() : null), (java.lang.Object) "MARGIN")) {
            C53441wlZ c53441wlZ = this.AYXKKw;
            if (c53441wlZ != null) {
                c53441wlZ.setMarginMode(this.AkhnZx.get(this.OLrzqt), this.AkhnZx.size() > 1);
            }
            vBA vba = this.ejfBZ;
            if (vba != null) {
                vba.setMarginMode(this.AkhnZx.get(this.OLrzqt), this.AkhnZx.size() > 1);
                return;
            }
            return;
        }
        C53441wlZ c53441wlZ2 = this.AYXKKw;
        if (c53441wlZ2 != null) {
            c53441wlZ2.setMarginMode(null, false);
        }
        vBA vba2 = this.ejfBZ;
        if (vba2 != null) {
            vba2.setMarginMode(null, false);
        }
    }

    @Override // o.InterfaceC50102vBz
    public void copydefault() {
        java.lang.String instType;
        java.lang.String strDjBIcL;
        vBA vba = this.ejfBZ;
        if (vba != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            java.lang.String str = "";
            if (interfaceC54581xNrOLrzqt != null) {
                BizInstrument bizInstrument = this.KWHzl;
                if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                    instType = "";
                }
                AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
                if (abstractC54531xLwOLrzqt != null && (strDjBIcL = abstractC54531xLwOLrzqt.djBIcL(this.KWHzl)) != null) {
                    str = strDjBIcL;
                }
            }
            vba.setUnit(str);
        }
    }
}
