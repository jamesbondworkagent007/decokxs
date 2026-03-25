package com.okinc.trade_ui.order.strategy.contractdca.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.EditContractDcaReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54531xLw;
import o.C33069mpW;
import o.C33129mqd;
import o.C47988uAv;
import o.C54507xKz;
import o.C54589xNz;
import o.C54799xVt;
import o.C55688xof;
import o.C56149xxP;
import o.C56235xyw;
import o.C56390yDp;
import o.C56424yEw;
import o.InterfaceC54581xNr;
import o.xKK;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ContractDcaModifyTpSlPresenter extends AbsPresenter {
    public final TradeLiveData<StrategyResponse> AEQbTJ;
    public final TradeLiveData<StrategyConfigInfo> EZpvd;
    public final C56149xxP KWHzl;
    public final C56235xyw OLrzqt;
    public String copydefault;
    public TacticsData djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(TacticsData tacticsData) {
        this.djBIcL = tacticsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyResponse> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56149xxP copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyConfigInfo> djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData gEmmrt() {
        return this.djBIcL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDcaModifyTpSlPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new C56149xxP();
        this.AEQbTJ = new TradeLiveData<>();
        this.OLrzqt = new C56235xyw();
        this.EZpvd = new TradeLiveData<>();
    }

    public final BizInstrument AEQbTJ() {
        String instType;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return null;
        }
        TacticsData tacticsData = this.djBIcL;
        if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsData2 = this.djBIcL;
        return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, instType, tacticsData2 != null ? tacticsData2.getInstId() : null, null, null, 12, null);
    }

    public final String OLrzqt() {
        C54799xVt c54799xVt = C54799xVt.AEQbTJ;
        TacticsData tacticsData = this.djBIcL;
        String instId = tacticsData != null ? tacticsData.getInstId() : null;
        TacticsData tacticsData2 = this.djBIcL;
        return C54799xVt.getTitleByIdAndType$default(c54799xVt, instId, tacticsData2 != null ? tacticsData2.getInstType() : null, false, false, 12, null);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56149xxP c56149xxP = this.KWHzl;
        TacticsData tacticsData = this.djBIcL;
        c56149xxP.EZpvd(new EditContractDcaReq(tacticsData != null ? tacticsData.getAlgoId() : null, null, str, null, null, null, null, null, null, null, null, false, null, 8186, null));
        c56149xxP.djBIcL();
        c56149xxP.OLrzqt(this.AEQbTJ, new C54507xKz());
        xKK.Activity.execute$default(c56149xxP, 0L, 1, null);
    }

    public final Pair<Boolean, String> AEQbTJ(String str, @NotNull C47988uAv c47988uAv) {
        String s$default;
        Integer numValueOf;
        boolean zValueOf;
        String s$default2;
        String tpPriceRange;
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        TacticsData tacticsData = this.djBIcL;
        String strCopydefault = null;
        if (tacticsData == null || (tpPriceRange = tacticsData.getTpPriceRange()) == null) {
            s$default = null;
        } else {
            int iAhwBna = AhwBna();
            TacticsData tacticsData2 = this.djBIcL;
            s$default = C33129mqd.formatS$default(tpPriceRange, Integer.valueOf(iAhwBna), null, Intrinsics.EZpvd((Object) (tacticsData2 != null ? tacticsData2.getDirection() : null), (Object) "long") ? RoundingMode.UP : RoundingMode.DOWN, 2, null);
        }
        TacticsData tacticsData3 = this.djBIcL;
        String direction = tacticsData3 != null ? tacticsData3.getDirection() : null;
        if (Intrinsics.EZpvd((Object) direction, (Object) "long")) {
            String str2 = this.copydefault;
            if (str2 != null) {
                int iAhwBna2 = AhwBna();
                TacticsData tacticsData4 = this.djBIcL;
                s$default2 = C33129mqd.formatS$default(str2, Integer.valueOf(iAhwBna2), null, Intrinsics.EZpvd((Object) (tacticsData4 != null ? tacticsData4.getDirection() : null), (Object) "long") ? RoundingMode.UP : RoundingMode.DOWN, 2, null);
            } else {
                s$default2 = null;
            }
            zValueOf = C33129mqd.copydefault(str, s$default) && C33129mqd.valueOf(str, s$default2);
            numValueOf = C33129mqd.copydefault(s$default, str) ? Integer.valueOf(C55688xof.Application.UlJrfe) : null;
            if (C33129mqd.valueOf(s$default2, str)) {
                numValueOf = Integer.valueOf(C55688xof.Application.OJuSTm);
                s$default = s$default2;
            }
        } else if (Intrinsics.EZpvd((Object) direction, (Object) "short")) {
            zValueOf = C33129mqd.valueOf(str, s$default);
            numValueOf = Integer.valueOf(C55688xof.Application.OJuSTm);
        } else {
            numValueOf = null;
            zValueOf = true;
        }
        boolean z = zValueOf || str == null || str.length() == 0;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            Pair[] pairArr = new Pair[3];
            pairArr[0] = C56390yDp.OLrzqt("fieldName", c47988uAv.values());
            pairArr[1] = C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(s$default != null ? s$default : ""));
            pairArr[2] = C56390yDp.OLrzqt("unit", c47988uAv.fARcdN());
            strCopydefault = C33069mpW.copydefault(iIntValue, C56424yEw.gEmmrt(pairArr));
        }
        return C56390yDp.OLrzqt(Boolean.valueOf(z), strCopydefault);
    }

    public final int AhwBna() {
        String instType;
        String instFamily;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            TacticsData tacticsData = this.djBIcL;
            String str = "";
            if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                BizInstrument bizInstrumentAEQbTJ = AEQbTJ();
                if (bizInstrumentAEQbTJ != null && (instFamily = bizInstrumentAEQbTJ.getInstFamily()) != null) {
                    str = instFamily;
                }
                String strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(str);
                if (strFIwbmz != null) {
                    return C33129mqd.AhwBna(strFIwbmz);
                }
            }
        }
        return 8;
    }

    public final void EZpvd() {
        String instId;
        C56235xyw c56235xyw = this.OLrzqt;
        c56235xyw.KWHzl("contract_dca");
        TacticsData tacticsData = this.djBIcL;
        if (tacticsData == null || (instId = tacticsData.getInstId()) == null) {
            BizInstrument bizInstrumentAEQbTJ = AEQbTJ();
            instId = bizInstrumentAEQbTJ != null ? bizInstrumentAEQbTJ.getInstId() : "";
        }
        c56235xyw.AEQbTJ(instId);
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(this.EZpvd, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.KWHzl, this.OLrzqt);
    }
}
