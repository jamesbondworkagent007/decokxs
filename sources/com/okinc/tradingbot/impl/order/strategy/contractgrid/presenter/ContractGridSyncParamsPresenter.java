package com.okinc.tradingbot.impl.order.strategy.contractgrid.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ContractGridSyncParamReq;
import com.okinc.unify_trade.biz.ContractGridSyncParamResp;
import com.okinc.unify_trade.biz.StgySourceInfo;
import com.okinc.unify_trade.biz.SyncParamsMinTopupInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54531xLw;
import o.C33129mqd;
import o.C52672wUb;
import o.C52676wUf;
import o.C54506xKy;
import o.C54507xKz;
import o.C54536xML;
import o.C54589xNz;
import o.InterfaceC54581xNr;
import o.xKK;
import o.xMV;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ContractGridSyncParamsPresenter extends AbsPresenter {
    public StgySourceInfo AEQbTJ;
    public final C52676wUf AYXKKw;
    public final TradeLiveData<SyncParamsMinTopupInfo> EZpvd;
    public final C52672wUb KWHzl;
    public final TradeLiveData<ContractGridSyncParamResp> OLrzqt;
    public TacticsData copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StgySourceInfo AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52676wUf AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52672wUb EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(TacticsData tacticsData, StgySourceInfo stgySourceInfo) {
        this.copydefault = tacticsData;
        this.AEQbTJ = stgySourceInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ContractGridSyncParamResp> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<SyncParamsMinTopupInfo> djBIcL() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractGridSyncParamsPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AYXKKw = new C52676wUf();
        this.EZpvd = new TradeLiveData<>();
        this.KWHzl = new C52672wUb();
        this.OLrzqt = new TradeLiveData<>();
    }

    private final String values() {
        String instType;
        TacticsData tacticsData = this.copydefault;
        return (tacticsData == null || (instType = tacticsData.getInstType()) == null) ? "" : instType;
    }

    private final String gEmmrt() {
        String instId;
        TacticsData tacticsData = this.copydefault;
        return (tacticsData == null || (instId = tacticsData.getInstId()) == null) ? "" : instId;
    }

    public final String AEQbTJ() {
        String orderType;
        TacticsData tacticsData = this.copydefault;
        return (tacticsData == null || (orderType = tacticsData.getOrderType()) == null) ? "" : orderType;
    }

    public final void valueOf() {
        String algoId;
        C52676wUf c52676wUf = this.AYXKKw;
        TacticsData tacticsData = this.copydefault;
        if (tacticsData == null || (algoId = tacticsData.getAlgoId()) == null) {
            algoId = "";
        }
        c52676wUf.EZpvd(algoId);
        c52676wUf.OLrzqt(this.EZpvd, new C54506xKy());
        xKK.Activity.execute$default(c52676wUf, 0L, 1, null);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
        String algoId;
        String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TacticsData tacticsData = this.copydefault;
        if (tacticsData != null && (algoId = tacticsData.getAlgoId()) != null) {
            str3 = algoId;
        }
        ContractGridSyncParamReq contractGridSyncParamReq = new ContractGridSyncParamReq(str3, str2, str);
        C52672wUb c52672wUb = this.KWHzl;
        c52672wUb.copydefault(contractGridSyncParamReq);
        c52672wUb.OLrzqt(this.OLrzqt, new C54507xKz());
        xKK.Activity.execute$default(c52672wUb, 0L, 1, null);
    }

    public final String OLrzqt() {
        String marginSymbol;
        BizInstrument bizInstrumentKWHzl = KWHzl();
        return (bizInstrumentKWHzl == null || (marginSymbol = bizInstrumentKWHzl.getMarginSymbol()) == null) ? "" : marginSymbol;
    }

    public final BizInstrument KWHzl() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, values(), gEmmrt(), null, null, 12, null);
        }
        return null;
    }

    public final String EZpvd(@NotNull String str) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        String safeString$default;
        String instFamily;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(values())) != null) {
            BizInstrument bizInstrumentKWHzl = KWHzl();
            if (bizInstrumentKWHzl != null && (instFamily = bizInstrumentKWHzl.getInstFamily()) != null) {
                str2 = instFamily;
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, str2, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str)) != null && (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault2.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
                return safeString$default;
            }
        }
        return "--";
    }

    public final boolean EZpvd(@NotNull String str, @NotNull String str2) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLCopydefault;
        String instFamily;
        String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        String safeString$default = null;
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(values())) != null) {
            BizInstrument bizInstrumentKWHzl = KWHzl();
            if (bizInstrumentKWHzl != null && (instFamily = bizInstrumentKWHzl.getInstFamily()) != null) {
                str3 = instFamily;
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, str3, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null && (c54536xMLOLrzqt = xmvCreateSizeConverterWithIndex$default.OLrzqt(str2)) != null && (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null);
            }
        }
        return C33129mqd.AEQbTJ(str, safeString$default);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AYXKKw, this.KWHzl);
    }
}
