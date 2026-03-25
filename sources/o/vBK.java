package o;

import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.biz.TradeType;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.ArbitrageInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.TradeBalanceData;
import com.okinc.unify_trade.manager.MarginModeManager;
import com.okinc.unify_trade.universal.data.PositionLiveDataResp;
import com.okinc.unify_trade.universal.data.TradeCloseAvailable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.xDM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vBK {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String DbNXlk;
    public TradeLiveData<TradeBalanceData> EZpvd = new TradeLiveData<>();
    public ArbitrageInfo KWHzl;
    public xDM OLrzqt;
    public Observer<PositionLiveDataResp> copydefault;
    public java.lang.Boolean djBIcL;
    public java.lang.String fetchVPNInfo;
    public AbstractC55740xpe gEmmrt;
    public TickersData isConnected;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<TradeBalanceData> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(TickersData tickersData) {
        this.isConnected = tickersData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(xDM xdm) {
        this.OLrzqt = xdm;
    }

    public static /* synthetic */ void updateLoader$default(vBK vbk, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        vbk.KWHzl(z, str, str2, str3);
    }

    public final void KWHzl(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String instType;
        java.lang.String instId;
        C56036xvI c56036xvI = C56036xvI.KWHzl;
        this.KWHzl = z ? c56036xvI.copydefault() : c56036xvI.AEQbTJ();
        C56036xvI c56036xvI2 = C56036xvI.KWHzl;
        ArbitrageInfo arbitrageInfoCopydefault = z ? c56036xvI2.copydefault() : c56036xvI2.AEQbTJ();
        java.lang.String strEZpvd = EZpvd(arbitrageInfoCopydefault);
        ArbitrageInfo arbitrageInfo = this.KWHzl;
        this.AhwBna = arbitrageInfo != null ? arbitrageInfo.getPosSide() : null;
        this.AEQbTJ = str;
        this.DbNXlk = OLrzqt(arbitrageInfoCopydefault);
        BizInstrument bizInstrumentAEQbTJ = AEQbTJ(arbitrageInfoCopydefault);
        java.lang.String str4 = (bizInstrumentAEQbTJ == null || (instId = bizInstrumentAEQbTJ.getInstId()) == null) ? "" : instId;
        BizInstrument bizInstrumentAEQbTJ2 = AEQbTJ(arbitrageInfoCopydefault);
        StateListAnimator stateListAnimator = new StateListAnimator(str2, strEZpvd, str3, this, str4, (bizInstrumentAEQbTJ2 == null || (instType = bizInstrumentAEQbTJ2.getInstType()) == null) ? "" : instType, KWHzl(arbitrageInfoCopydefault), (Intrinsics.EZpvd((java.lang.Object) arbitrageInfoCopydefault.getInstType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) arbitrageInfoCopydefault.getInstType(), (java.lang.Object) "MARGIN")) ? java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) arbitrageInfoCopydefault.getSide(), (java.lang.Object) "buy")) : null, this.DbNXlk, this.djBIcL, this.AEQbTJ);
        this.gEmmrt = stateListAnimator;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(yDY.copydefault(stateListAnimator));
        }
    }

    public static final class StateListAnimator extends AbstractC55740xpe {
        public final /* synthetic */ vBK EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(java.lang.String str, java.lang.String str2, java.lang.String str3, vBK vbk, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool, java.lang.String str7, java.lang.Boolean bool2, java.lang.String str8) {
            super(null, null, str5, str4, str8, str, str6, bool2, bool, str2, null, str3, null, str7, null, null, null, null, null, null, 1033219, null);
            this.EZpvd = vbk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [89=5] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // o.AbstractC55740xpe
        public void AEQbTJ(MaxAvailableResp maxAvailableResp, java.lang.String str, xDM xdm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(xdm, "");
            this.EZpvd.OLrzqt(xdm);
            if (maxAvailableResp != null) {
                vBK vbk = this.EZpvd;
                ArbitrageInfo arbitrageInfo = vbk.KWHzl;
                java.lang.String instType = arbitrageInfo != null ? arbitrageInfo.getInstType() : null;
                if (instType != null) {
                    switch (instType.hashCode()) {
                        case -2027980370:
                            if (instType.equals("MARGIN")) {
                                vbk.copydefault(maxAvailableResp);
                                break;
                            }
                            break;
                        case -1956807563:
                            if (instType.equals("OPTION")) {
                                vbk.AEQbTJ(maxAvailableResp);
                                break;
                            }
                            break;
                        case 2552066:
                            if (instType.equals("SPOT")) {
                                vbk.OLrzqt(maxAvailableResp);
                                break;
                            }
                            break;
                        case 2558355:
                            if (instType.equals("SWAP")) {
                                vbk.KWHzl(maxAvailableResp);
                                break;
                            }
                            break;
                        case 214415088:
                            if (instType.equals("FUTURES")) {
                                vbk.KWHzl(maxAvailableResp);
                                break;
                            }
                            break;
                    }
                }
            }
        }
    }

    public final void copydefault(boolean z) {
        this.KWHzl = z ? C56036xvI.KWHzl.copydefault() : C56036xvI.KWHzl.AEQbTJ();
        Observer<PositionLiveDataResp> observer = this.copydefault;
        if (observer != null) {
            C54782xVc.AEQbTJ.djBIcL().removeObserver(observer);
        }
        this.copydefault = new Observer() { // from class: o.vBM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                vBK.OLrzqt(this.EZpvd, (PositionLiveDataResp) obj);
            }
        };
        TradeLiveData<PositionLiveDataResp> tradeLiveDataDjBIcL = C54782xVc.AEQbTJ.djBIcL();
        Observer<PositionLiveDataResp> observer2 = this.copydefault;
        Intrinsics.copydefault(observer2);
        tradeLiveDataDjBIcL.observeForever(observer2);
    }

    public static final void OLrzqt(vBK vbk, PositionLiveDataResp positionLiveDataResp) {
        Intrinsics.checkNotNullParameter(positionLiveDataResp, "");
        if (positionLiveDataResp.getPositions() == null) {
            return;
        }
        vbk.valueOf();
    }

    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        xDM xdm = this.OLrzqt;
        if (xdm != null) {
            xDM.ActionBar.refreshOrderSize$default(xdm, str, str2, null, null, 12, null);
        }
    }

    public void EZpvd(java.lang.String str) {
        this.AEQbTJ = str;
        xDM xdm = this.OLrzqt;
        if (xdm != null) {
            xdm.EZpvd(str);
        }
    }

    public void OLrzqt(boolean z, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = z ? "market" : null;
        xDM xdm = this.OLrzqt;
        if (xdm != null) {
            xdm.copydefault(str3, str, str2);
        }
    }

    public void OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AhwBna = str2;
        this.AYXKKw = str;
        this.valueOf = z ? "buy" : "sell";
        xDM xdm = this.OLrzqt;
        if (xdm != null) {
            xdm.AEQbTJ(str, z);
        }
    }

    public void EZpvd(java.lang.Boolean bool) {
        this.djBIcL = bool;
        xDM xdm = this.OLrzqt;
        if (xdm != null) {
            xdm.EZpvd(bool);
        }
    }

    public void valueOf(java.lang.String str) {
        this.DbNXlk = str;
        xDM xdm = this.OLrzqt;
        if (xdm != null) {
            xdm.OLrzqt(str);
        }
    }

    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
        xDM xdm = this.OLrzqt;
        if (xdm != null) {
            xdm.KWHzl(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy")));
        }
    }

    public final BizInstrument AEQbTJ(ArbitrageInfo arbitrageInfo) {
        java.lang.String instType;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null) {
            return null;
        }
        if (arbitrageInfo == null || (instType = arbitrageInfo.getInstType()) == null) {
            instType = "";
        }
        return interfaceC54581xNrCopydefault.copydefault(instType, arbitrageInfo != null ? arbitrageInfo.getInstId() : null, arbitrageInfo != null ? arbitrageInfo.getUly() : null, arbitrageInfo != null ? arbitrageInfo.getAlias() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(ArbitrageInfo arbitrageInfo) {
        boolean z;
        java.lang.String mgnMode;
        xOW newProxyInstance;
        xOV xovEZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance.EZpvd()) == null) {
            z = false;
        } else {
            z = true;
            if (!xovEZpvd.OLrzqt()) {
            }
        }
        return (!Intrinsics.EZpvd((java.lang.Object) (arbitrageInfo != null ? arbitrageInfo.getInstType() : null), (java.lang.Object) "SPOT") || z) ? (arbitrageInfo == null || (mgnMode = arbitrageInfo.getMgnMode()) == null) ? "" : mgnMode : "cash";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        boolean z;
        xOW newProxyInstance;
        xOV xovEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance.EZpvd()) == null) {
            z = false;
        } else {
            z = true;
            if (!xovEZpvd.OLrzqt()) {
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") && !z) {
            str2 = "cash";
        }
        this.fetchVPNInfo = str2;
        xDM xdm = this.OLrzqt;
        if (xdm != null) {
            xdm.KWHzl(str2 != null ? str2 : "");
        }
    }

    public final java.lang.String OLrzqt(@NotNull ArbitrageInfo arbitrageInfo) {
        Intrinsics.checkNotNullParameter(arbitrageInfo, "");
        if (Intrinsics.EZpvd((java.lang.Object) arbitrageInfo.getInstType(), (java.lang.Object) "SPOT") && Intrinsics.EZpvd((java.lang.Object) arbitrageInfo.getSide(), (java.lang.Object) "buy")) {
            return "quote_ccy";
        }
        if (Intrinsics.EZpvd((java.lang.Object) arbitrageInfo.getInstType(), (java.lang.Object) "SPOT") && Intrinsics.EZpvd((java.lang.Object) arbitrageInfo.getSide(), (java.lang.Object) "sell")) {
            return "base_ccy";
        }
        return null;
    }

    public final java.lang.String EZpvd(@NotNull ArbitrageInfo arbitrageInfo) {
        xOW newProxyInstance;
        xOW newProxyInstance2;
        Intrinsics.checkNotNullParameter(arbitrageInfo, "");
        if (Intrinsics.EZpvd((java.lang.Object) arbitrageInfo.getInstType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) arbitrageInfo.getInstType(), (java.lang.Object) "FUTURES")) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrCopydefault == null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? null : newProxyInstance.AuCTelauCTel()), (java.lang.Object) "net_mode")) {
                return "net_mode";
            }
        }
        if (!Intrinsics.EZpvd((java.lang.Object) arbitrageInfo.getInstType(), (java.lang.Object) "SWAP") && !Intrinsics.EZpvd((java.lang.Object) arbitrageInfo.getInstType(), (java.lang.Object) "FUTURES")) {
            return null;
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault2 = C54589xNz.EZpvd.copydefault();
        if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrCopydefault2 == null || (newProxyInstance2 = interfaceC54581xNrCopydefault2.getNewProxyInstance()) == null) ? null : newProxyInstance2.AuCTelauCTel()), (java.lang.Object) "long_short_mode")) {
            return "long_short_mode";
        }
        return null;
    }

    public final void valueOf() {
        TradeCloseAvailable tradeCloseAvailableEZpvd = EZpvd();
        TradeBalanceData tradeBalanceData = new TradeBalanceData(true, null, null, null, null, null, null, null, null, null, null, tradeCloseAvailableEZpvd.getAvaLongOrigin(), tradeCloseAvailableEZpvd.getPosLongOrigin(), tradeCloseAvailableEZpvd.getAvaShortOrigin(), tradeCloseAvailableEZpvd.getPosShortOrigin(), null, 34814, null);
        tradeBalanceData.setShowAvaCloseLong(new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsCaptureVideo), tradeCloseAvailableEZpvd.getPosLong()));
        tradeBalanceData.setShowAvaCloseShort(new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractSynchronousResult), tradeCloseAvailableEZpvd.getPosShort()));
        this.EZpvd.postValue(tradeBalanceData);
    }

    public final java.lang.String OLrzqt(int i) {
        java.lang.String string = C55734xpY.Companion.copydefault().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final TradeCloseAvailable EZpvd() {
        java.lang.String last;
        java.lang.String strGEmmrt;
        java.lang.String strGEmmrt2;
        java.lang.String strGEmmrt3;
        java.lang.String strGEmmrt4;
        java.lang.String strGEmmrt5;
        java.util.List<TradePositionManager.PositionItem> positions;
        TradeLiveData<PositionLiveDataResp> tradeLiveDataDjBIcL = C54782xVc.AEQbTJ.djBIcL();
        BizInstrument bizInstrumentAEQbTJ = AEQbTJ(this.KWHzl);
        java.lang.String instId = bizInstrumentAEQbTJ != null ? bizInstrumentAEQbTJ.getInstId() : null;
        TradeCloseAvailable tradeCloseAvailable = new TradeCloseAvailable(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        PositionLiveDataResp value = tradeLiveDataDjBIcL.getValue();
        if (value != null && (positions = value.getPositions()) != null) {
            for (TradePositionManager.PositionItem positionItem : positions) {
                if (Intrinsics.EZpvd((java.lang.Object) instId, (java.lang.Object) positionItem.getInstId()) && Intrinsics.EZpvd((java.lang.Object) positionItem.getPosSide(), (java.lang.Object) "long")) {
                    java.lang.String marginModel = positionItem.getMarginModel();
                    ArbitrageInfo arbitrageInfo = this.KWHzl;
                    if (Intrinsics.EZpvd((java.lang.Object) marginModel, (java.lang.Object) (arbitrageInfo != null ? arbitrageInfo.getMgnMode() : null))) {
                        tradeCloseAvailable.setLongLast(positionItem.getLast());
                        tradeCloseAvailable.setAvaLong(C33129mqd.addS$default(tradeCloseAvailable.getAvaLong(), positionItem.getAvailPos(), null, null, null, 14, null));
                        tradeCloseAvailable.setPosLong(C33129mqd.addS$default(tradeCloseAvailable.getPosLong(), positionItem.getPos(), null, null, null, 14, null));
                    }
                }
                if (Intrinsics.EZpvd((java.lang.Object) instId, (java.lang.Object) positionItem.getInstId()) && Intrinsics.EZpvd((java.lang.Object) positionItem.getPosSide(), (java.lang.Object) "short")) {
                    java.lang.String marginModel2 = positionItem.getMarginModel();
                    ArbitrageInfo arbitrageInfo2 = this.KWHzl;
                    if (Intrinsics.EZpvd((java.lang.Object) marginModel2, (java.lang.Object) (arbitrageInfo2 != null ? arbitrageInfo2.getMgnMode() : null))) {
                        tradeCloseAvailable.setShortLast(positionItem.getLast());
                        tradeCloseAvailable.setAvaShort(C33129mqd.addS$default(tradeCloseAvailable.getAvaShort(), positionItem.getAvailPos(), null, null, null, 14, null));
                        tradeCloseAvailable.setPosShort(C33129mqd.addS$default(tradeCloseAvailable.getPosShort(), positionItem.getPos(), null, null, null, 14, null));
                    }
                }
            }
        }
        TickersData tickersData = this.isConnected;
        if (tickersData == null || (last = tickersData.getLast()) == null) {
            last = "";
        }
        C54571xNh c54571xNhCreateAmtConvertor$default = createAmtConvertor$default(this, last, null, 2, null);
        return new TradeCloseAvailable((c54571xNhCreateAmtConvertor$default == null || (strGEmmrt4 = c54571xNhCreateAmtConvertor$default.gEmmrt(tradeCloseAvailable.getAvaLong())) == null || (strGEmmrt5 = C33129mqd.gEmmrt(strGEmmrt4)) == null) ? "" : strGEmmrt5, tradeCloseAvailable.getAvaLong(), (c54571xNhCreateAmtConvertor$default == null || (strGEmmrt2 = c54571xNhCreateAmtConvertor$default.gEmmrt(tradeCloseAvailable.getAvaShort())) == null) ? "" : strGEmmrt2, tradeCloseAvailable.getAvaShort(), (c54571xNhCreateAmtConvertor$default == null || (strGEmmrt3 = c54571xNhCreateAmtConvertor$default.gEmmrt(tradeCloseAvailable.getPosLong())) == null) ? "" : strGEmmrt3, tradeCloseAvailable.getPosLong(), (c54571xNhCreateAmtConvertor$default == null || (strGEmmrt = c54571xNhCreateAmtConvertor$default.gEmmrt(tradeCloseAvailable.getPosShort())) == null) ? "" : strGEmmrt, tradeCloseAvailable.getPosShort(), null, null, null, null, 3840, null);
    }

    public static /* synthetic */ C54571xNh createAmtConvertor$default(vBK vbk, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return vbk.KWHzl(str, str2);
    }

    public final C54571xNh KWHzl(java.lang.String str, java.lang.String str2) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        java.lang.String instType;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String str3 = "";
        if (interfaceC54581xNrOLrzqt != null) {
            ArbitrageInfo arbitrageInfo = this.KWHzl;
            if (arbitrageInfo == null || (instType = arbitrageInfo.getInstType()) == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        BizInstrument bizInstrumentAEQbTJ = AEQbTJ(this.KWHzl);
        java.lang.String instId = bizInstrumentAEQbTJ != null ? bizInstrumentAEQbTJ.getInstId() : null;
        if (abstractC54531xLwOLrzqt == null) {
            return null;
        }
        if (instId == null) {
            instId = "";
        }
        BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(instId);
        if (bizInstrumentValueOf != null && (instFamily = bizInstrumentValueOf.getInstFamily()) != null) {
            str3 = instFamily;
        }
        C54571xNh c54571xNhAhwBna = abstractC54531xLwOLrzqt.AhwBna(str3, str2);
        if (c54571xNhAhwBna == null) {
            return null;
        }
        if (str != null && str.length() != 0) {
            c54571xNhAhwBna.AhwBna(str);
        }
        return c54571xNhAhwBna;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull MaxAvailableResp maxAvailableResp) {
        java.lang.String str;
        java.lang.String instType;
        java.lang.String instId;
        java.lang.String instType2;
        java.lang.String instId2;
        xOW newProxyInstance;
        xOV xovEZpvd;
        MarginModeManager marginModeManagerIsConnected;
        java.lang.String instType3;
        java.lang.String instId3;
        Intrinsics.checkNotNullParameter(maxAvailableResp, "");
        BizInstrument bizInstrumentAEQbTJ = AEQbTJ(this.KWHzl);
        C54796xVq c54796xVq = C54796xVq.AEQbTJ;
        java.lang.String available = maxAvailableResp.getAvailable();
        java.lang.String str2 = (bizInstrumentAEQbTJ == null || (instId3 = bizInstrumentAEQbTJ.getInstId()) == null) ? "" : instId3;
        java.lang.String str3 = (bizInstrumentAEQbTJ == null || (instType3 = bizInstrumentAEQbTJ.getInstType()) == null) ? "" : instType3;
        TradeType tradeType = Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "buy") ? TradeType.BUY_OPEN : TradeType.SELL_CLOSE;
        java.lang.Boolean bool = this.djBIcL;
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = c54796xVq.OLrzqt(available, str2, str3, tradeType, bool != null ? bool.booleanValue() : false, KWHzl(this.KWHzl), this.AEQbTJ);
        java.lang.String strOLrzqt = OLrzqt(C55688xof.Application.ActionBarTabListener);
        java.lang.String strOLrzqt2 = OLrzqt(C55688xof.Application.ibnZAm);
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance.EZpvd()) == null || !xovEZpvd.OLrzqt()) {
            str = strOLrzqt;
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            java.lang.String currentMarginMode$default = null;
            if (interfaceC54581xNrOLrzqt2 != null && (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt2.isConnected()) != null) {
                currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, bizInstrumentAEQbTJ, 1, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) currentMarginMode$default, (java.lang.Object) "isolated") && !Intrinsics.EZpvd(this.djBIcL, java.lang.Boolean.TRUE)) {
                str = strOLrzqt2;
            }
        }
        java.lang.String str4 = str;
        TradeBalanceData tradeBalanceData = new TradeBalanceData(false, null, null, null, null, null, null, null, null, null, maxAvailableResp, null, null, null, null, null, 64510, null);
        java.lang.String first = pairOLrzqt.getFirst();
        if (first == null) {
            first = "";
        }
        tradeBalanceData.setShowAvailable(new kotlin.Pair<>(str4, first));
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "buy")) {
            kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = c54796xVq.KWHzl(TradeType.BUY_OPEN, maxAvailableResp.getMaxSize(), (bizInstrumentAEQbTJ == null || (instId2 = bizInstrumentAEQbTJ.getInstId()) == null) ? "" : instId2, (bizInstrumentAEQbTJ == null || (instType2 = bizInstrumentAEQbTJ.getInstType()) == null) ? "" : instType2, this.djBIcL, KWHzl(this.KWHzl));
            java.lang.String strOLrzqt3 = OLrzqt(C55688xof.Application.dispatchResult);
            java.lang.String first2 = pairKWHzl.getFirst();
            tradeBalanceData.setShowCanBuy(new kotlin.Pair<>(strOLrzqt3, first2 != null ? first2 : ""));
        } else {
            kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl2 = c54796xVq.KWHzl(TradeType.SELL_CLOSE, maxAvailableResp.getMaxSize(), (bizInstrumentAEQbTJ == null || (instId = bizInstrumentAEQbTJ.getInstId()) == null) ? "" : instId, (bizInstrumentAEQbTJ == null || (instType = bizInstrumentAEQbTJ.getInstType()) == null) ? "" : instType, this.djBIcL, KWHzl(this.KWHzl));
            java.lang.String strOLrzqt4 = OLrzqt(C55688xof.Application.ActivityResultRegistryCallbackAndContract);
            java.lang.String first3 = pairKWHzl2.getFirst();
            tradeBalanceData.setShowCanSell(new kotlin.Pair<>(strOLrzqt4, first3 != null ? first3 : ""));
        }
        this.EZpvd.postValue(tradeBalanceData);
    }

    public final void copydefault(MaxAvailableResp maxAvailableResp) {
        java.lang.String instType;
        java.lang.String instId;
        java.lang.String instType2;
        java.lang.String instId2;
        java.lang.String instType3;
        java.lang.String instId3;
        BizInstrument bizInstrumentAEQbTJ = AEQbTJ(this.KWHzl);
        C54796xVq c54796xVq = C54796xVq.AEQbTJ;
        java.lang.String available = maxAvailableResp.getAvailable();
        java.lang.String str = (bizInstrumentAEQbTJ == null || (instId3 = bizInstrumentAEQbTJ.getInstId()) == null) ? "" : instId3;
        java.lang.String str2 = (bizInstrumentAEQbTJ == null || (instType3 = bizInstrumentAEQbTJ.getInstType()) == null) ? "" : instType3;
        TradeType tradeType = Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "buy") ? TradeType.BUY_OPEN : TradeType.SELL_CLOSE;
        java.lang.Boolean bool = this.djBIcL;
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = c54796xVq.OLrzqt(available, str, str2, tradeType, bool != null ? bool.booleanValue() : false, KWHzl(this.KWHzl), this.AEQbTJ);
        java.lang.String strOLrzqt = OLrzqt(C55688xof.Application.ActionBarTabListener);
        java.lang.String strOLrzqt2 = OLrzqt(C55688xof.Application.ibnZAm);
        TradeBalanceData tradeBalanceData = new TradeBalanceData(false, null, null, null, null, null, null, null, null, null, maxAvailableResp, null, null, null, null, null, 64510, null);
        if (!Intrinsics.EZpvd(this.djBIcL, java.lang.Boolean.TRUE)) {
            strOLrzqt = strOLrzqt2;
        }
        java.lang.String first = pairOLrzqt.getFirst();
        if (first == null) {
            first = "";
        }
        tradeBalanceData.setShowAvailable(new kotlin.Pair<>(strOLrzqt, first));
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "buy")) {
            kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = c54796xVq.KWHzl(TradeType.BUY_OPEN, maxAvailableResp.getMaxSize(), (bizInstrumentAEQbTJ == null || (instId2 = bizInstrumentAEQbTJ.getInstId()) == null) ? "" : instId2, (bizInstrumentAEQbTJ == null || (instType2 = bizInstrumentAEQbTJ.getInstType()) == null) ? "" : instType2, this.djBIcL, KWHzl(this.KWHzl));
            java.lang.String strOLrzqt3 = OLrzqt(C55688xof.Application.dispatchResult);
            java.lang.String first2 = pairKWHzl.getFirst();
            tradeBalanceData.setShowCanBuy(new kotlin.Pair<>(strOLrzqt3, first2 != null ? first2 : ""));
        } else {
            kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl2 = c54796xVq.KWHzl(TradeType.SELL_CLOSE, maxAvailableResp.getMaxSize(), (bizInstrumentAEQbTJ == null || (instId = bizInstrumentAEQbTJ.getInstId()) == null) ? "" : instId, (bizInstrumentAEQbTJ == null || (instType = bizInstrumentAEQbTJ.getInstType()) == null) ? "" : instType, this.djBIcL, KWHzl(this.KWHzl));
            java.lang.String strOLrzqt4 = OLrzqt(C55688xof.Application.ActivityResultRegistryCallbackAndContract);
            java.lang.String first3 = pairKWHzl2.getFirst();
            tradeBalanceData.setShowCanSell(new kotlin.Pair<>(strOLrzqt4, first3 != null ? first3 : ""));
        }
        this.EZpvd.postValue(tradeBalanceData);
    }

    public final void KWHzl(@NotNull MaxAvailableResp maxAvailableResp) {
        java.lang.String instType;
        TradeBalanceData tradeBalanceData;
        java.lang.String instId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(maxAvailableResp, "");
        BizInstrument bizInstrumentAEQbTJ = AEQbTJ(this.KWHzl);
        java.lang.String strOLrzqt = OLrzqt(C55688xof.Application.ActionBarTabListener);
        java.lang.String strAYXKKw = AEQbTJ() ? C33070mpX.AYXKKw(C55688xof.Application.prepareFromMediaId) : OLrzqt(C55688xof.Application.dispatchResult);
        java.lang.String strAYXKKw2 = AEQbTJ() ? C33070mpX.AYXKKw(C55688xof.Application.rate) : OLrzqt(C55688xof.Application.ActivityResultRegistryCallbackAndContract);
        java.lang.String strOLrzqt2 = OLrzqt(C55688xof.Application.setPosition);
        java.lang.String strOLrzqt3 = OLrzqt(C55688xof.Application.isDrawerIndicatorEnabled);
        TradeBalanceData tradeBalanceData2 = new TradeBalanceData(false, null, null, null, null, null, null, null, null, null, maxAvailableResp, null, null, null, null, null, 64510, null);
        C54796xVq c54796xVq = C54796xVq.AEQbTJ;
        java.lang.String available = maxAvailableResp.getAvailable();
        if (bizInstrumentAEQbTJ == null || (instType = bizInstrumentAEQbTJ.getInstType()) == null) {
            instType = "";
        }
        if (bizInstrumentAEQbTJ != null && (instId = bizInstrumentAEQbTJ.getInstId()) != null) {
            str = instId;
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ = c54796xVq.AEQbTJ(available, instType, str);
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = OLrzqt(maxAvailableResp.getBuySize());
        kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault = copydefault(maxAvailableResp.getSellSize());
        if (OLrzqt()) {
            if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) "long")) {
                tradeBalanceData = tradeBalanceData2;
                tradeBalanceData.setShowAvailable(new kotlin.Pair<>(strOLrzqt, pairAEQbTJ.getFirst()));
                tradeBalanceData.setShowCanOpenLong(new kotlin.Pair<>(strOLrzqt2, pairOLrzqt.getFirst()));
            } else {
                tradeBalanceData = tradeBalanceData2;
                if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "sell") && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) "short")) {
                    tradeBalanceData.setShowAvailable(new kotlin.Pair<>(strOLrzqt, pairAEQbTJ.getFirst()));
                    tradeBalanceData.setShowCanOpenShort(new kotlin.Pair<>(strOLrzqt3, pairCopydefault.getFirst()));
                } else {
                    tradeBalanceData.setShowAvailable(new kotlin.Pair<>(strOLrzqt, "--"));
                }
            }
        } else {
            tradeBalanceData = tradeBalanceData2;
            tradeBalanceData.setShowAvailable(new kotlin.Pair<>(strOLrzqt, pairAEQbTJ.getFirst()));
            if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "buy")) {
                tradeBalanceData.setShowCanBuy(new kotlin.Pair<>(strAYXKKw, pairOLrzqt.getFirst()));
            } else {
                tradeBalanceData.setShowCanSell(new kotlin.Pair<>(strAYXKKw2, pairCopydefault.getFirst()));
            }
        }
        this.EZpvd.postValue(tradeBalanceData);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(java.lang.String str) {
        java.lang.String instId;
        java.lang.String instType;
        if (AEQbTJ()) {
            return AEQbTJ(str);
        }
        BizInstrument bizInstrumentAEQbTJ = AEQbTJ(this.KWHzl);
        C54796xVq c54796xVq = C54796xVq.AEQbTJ;
        java.lang.String str2 = "";
        if (bizInstrumentAEQbTJ == null || (instId = bizInstrumentAEQbTJ.getInstId()) == null) {
            instId = "";
        }
        if (bizInstrumentAEQbTJ != null && (instType = bizInstrumentAEQbTJ.getInstType()) != null) {
            str2 = instType;
        }
        TickersData tickersData = this.isConnected;
        return c54796xVq.copydefault(str, instId, str2, tickersData != null ? tickersData.getLast() : null);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(@NotNull java.lang.String str) {
        java.lang.String instType;
        java.lang.String instId;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentAEQbTJ = AEQbTJ(this.KWHzl);
        C54796xVq c54796xVq = C54796xVq.AEQbTJ;
        if (bizInstrumentAEQbTJ == null || (instType = bizInstrumentAEQbTJ.getInstType()) == null) {
            instType = "";
        }
        if (bizInstrumentAEQbTJ != null && (instId = bizInstrumentAEQbTJ.getInstId()) != null) {
            str2 = instId;
        }
        return c54796xVq.AEQbTJ(str, instType, str2);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(@NotNull java.lang.String str) {
        java.lang.String instId;
        java.lang.String instType;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (AEQbTJ()) {
            return AEQbTJ(str);
        }
        BizInstrument bizInstrumentAEQbTJ = AEQbTJ(this.KWHzl);
        C54796xVq c54796xVq = C54796xVq.AEQbTJ;
        if (bizInstrumentAEQbTJ == null || (instId = bizInstrumentAEQbTJ.getInstId()) == null) {
            instId = "";
        }
        if (bizInstrumentAEQbTJ != null && (instType = bizInstrumentAEQbTJ.getInstType()) != null) {
            str2 = instType;
        }
        TickersData tickersData = this.isConnected;
        return c54796xVq.copydefault(str, instId, str2, tickersData != null ? tickersData.getLast() : null);
    }

    public final void AEQbTJ(@NotNull MaxAvailableResp maxAvailableResp) {
        java.lang.String instId;
        java.lang.String instType;
        kotlin.Pair<java.lang.String, java.lang.String> pairConvertDerivativeAvaTrade$default;
        java.lang.String instType2;
        java.lang.String instId2;
        kotlin.Pair<java.lang.String, java.lang.String> pairConvertDerivativeAvaTrade$default2;
        java.lang.String instType3;
        java.lang.String instId3;
        Intrinsics.checkNotNullParameter(maxAvailableResp, "");
        java.lang.String strOLrzqt = OLrzqt(C55688xof.Application.ActionBarTabListener);
        TradeBalanceData tradeBalanceData = new TradeBalanceData(false, null, null, null, null, null, null, null, null, null, maxAvailableResp, null, null, null, null, null, 64510, null);
        java.lang.String strAYXKKw = AEQbTJ() ? C33070mpX.AYXKKw(C55688xof.Application.prepareFromMediaId) : OLrzqt(C55688xof.Application.dispatchResult);
        java.lang.String strAYXKKw2 = AEQbTJ() ? C33070mpX.AYXKKw(C55688xof.Application.rate) : OLrzqt(C55688xof.Application.ActivityResultRegistryCallbackAndContract);
        BizInstrument bizInstrumentAEQbTJ = AEQbTJ(this.KWHzl);
        C54796xVq c54796xVq = C54796xVq.AEQbTJ;
        java.lang.String available = maxAvailableResp.getAvailable();
        if (bizInstrumentAEQbTJ == null || (instId = bizInstrumentAEQbTJ.getInstId()) == null) {
            instId = "";
        }
        if (bizInstrumentAEQbTJ == null || (instType = bizInstrumentAEQbTJ.getInstType()) == null) {
            instType = "";
        }
        tradeBalanceData.setShowAvailable(new kotlin.Pair<>(strOLrzqt, c54796xVq.AEQbTJ(available, instType, instId).getFirst()));
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "buy")) {
            java.lang.String buySize = maxAvailableResp.getBuySize();
            if (AEQbTJ()) {
                pairConvertDerivativeAvaTrade$default2 = AEQbTJ(buySize);
            } else {
                pairConvertDerivativeAvaTrade$default2 = C54796xVq.convertDerivativeAvaTrade$default(c54796xVq, buySize, (bizInstrumentAEQbTJ == null || (instId3 = bizInstrumentAEQbTJ.getInstId()) == null) ? "" : instId3, (bizInstrumentAEQbTJ == null || (instType3 = bizInstrumentAEQbTJ.getInstType()) == null) ? "" : instType3, null, 8, null);
            }
            tradeBalanceData.setShowCanBuy(new kotlin.Pair<>(strAYXKKw, pairConvertDerivativeAvaTrade$default2.getFirst()));
        } else {
            java.lang.String sellSize = maxAvailableResp.getSellSize();
            if (AEQbTJ()) {
                pairConvertDerivativeAvaTrade$default = AEQbTJ(sellSize);
            } else {
                pairConvertDerivativeAvaTrade$default = C54796xVq.convertDerivativeAvaTrade$default(c54796xVq, sellSize, (bizInstrumentAEQbTJ == null || (instId2 = bizInstrumentAEQbTJ.getInstId()) == null) ? "" : instId2, (bizInstrumentAEQbTJ == null || (instType2 = bizInstrumentAEQbTJ.getInstType()) == null) ? "" : instType2, null, 8, null);
            }
            tradeBalanceData.setShowCanSell(new kotlin.Pair<>(strAYXKKw2, pairConvertDerivativeAvaTrade$default.getFirst()));
        }
        this.EZpvd.postValue(tradeBalanceData);
    }

    public final boolean OLrzqt() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        return Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrCopydefault == null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? null : newProxyInstance.AuCTelauCTel()), (java.lang.Object) "long_short_mode");
    }

    public final boolean OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES")) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrCopydefault == null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? null : newProxyInstance.AuCTelauCTel()), (java.lang.Object) "long_short_mode") && ((Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "short")) || (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "long")))) {
                return true;
            }
        }
        return false;
    }

    public final boolean AEQbTJ() {
        BizInstrument bizInstrumentAEQbTJ = AEQbTJ(this.KWHzl);
        boolean zKWHzl = CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.gEmmrt("FUTURES", "OPTION", "SWAP")), bizInstrumentAEQbTJ != null ? bizInstrumentAEQbTJ.getInstType() : null);
        ArbitrageInfo arbitrageInfo = this.KWHzl;
        return zKWHzl & Intrinsics.EZpvd((java.lang.Object) (arbitrageInfo != null ? arbitrageInfo.getMgnMode() : null), (java.lang.Object) "cross") & C54794xVo.copydefault.KWHzl();
    }

    public final void copydefault() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Observer<PositionLiveDataResp> observer = this.copydefault;
        if (observer != null) {
            C54782xVc.AEQbTJ.djBIcL().removeObserver(observer);
        }
        AbstractC55740xpe abstractC55740xpe = this.gEmmrt;
        if (abstractC55740xpe != null && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ(yDY.copydefault(abstractC55740xpe));
        }
        this.copydefault = null;
        this.gEmmrt = null;
    }
}
