package com.okinc.tradingbot.impl.order.strategy.contractgrid.presenter;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.SlippageControlEditParamRep;
import com.okinc.unify_trade.biz.SpotGridEditParamRep;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C54224xAm;
import o.C54308xDp;
import o.C54507xKz;
import o.C55773xqK;
import o.C56040xvM;
import o.C56111xwe;
import o.C56197xyK;
import o.C56235xyw;
import o.xKK;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ContractGridSlippageControlPresenter extends BaseBotOrderPresenter {
    public final C54308xDp AEQbTJ;
    public final TradeLiveData<xMJ.Application> AYXKKw;
    public final C54224xAm AhwBna;
    public final C56235xyw EZpvd;
    public StrategyConfigInfo KWHzl;
    public final TradeLiveData<StrategyConfigInfo> OLrzqt;
    public ContractGridReq copydefault;
    public final C56111xwe<SpotGridEditParamRep> djBIcL;
    public final C56197xyK gEmmrt;
    public final C56111xwe<StrategyResponse> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(StrategyConfigInfo strategyConfigInfo) {
        this.KWHzl = strategyConfigInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.Application> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyConfigInfo> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull ContractGridReq contractGridReq) {
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        this.copydefault = contractGridReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyConfigInfo copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<StrategyResponse> djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56197xyK gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<SpotGridEditParamRep> valueOf() {
        return this.djBIcL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractGridSlippageControlPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AYXKKw = new TradeLiveData<>();
        this.AEQbTJ = new C54308xDp();
        this.EZpvd = new C56235xyw();
        this.OLrzqt = new TradeLiveData<>();
        this.gEmmrt = new C56197xyK();
        this.djBIcL = new C56111xwe<>();
        this.AhwBna = new C54224xAm();
        this.valueOf = new C56111xwe<>();
    }

    public final ContractGridReq EZpvd() {
        ContractGridReq contractGridReq = this.copydefault;
        if (contractGridReq != null) {
            return contractGridReq;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void copydefault(Bundle bundle) {
        ContractGridReq contractGridReq;
        this.KWHzl = bundle != null ? (StrategyConfigInfo) bundle.getParcelable("bot_config") : null;
        if (bundle == null || (contractGridReq = (ContractGridReq) bundle.getParcelable("bot_grid_req")) == null) {
            contractGridReq = new ContractGridReq((String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, -1, 15, (DefaultConstructorMarker) null);
        }
        KWHzl(contractGridReq);
    }

    public final void AhwBna() {
        C54308xDp c54308xDp = this.AEQbTJ;
        c54308xDp.OLrzqt(this.AYXKKw, new C55773xqK());
        c54308xDp.KWHzl(fvQaOB().gEmmrt());
        xKK.Activity.execute$default(c54308xDp, 0L, 1, null);
    }

    public final String OLrzqt() {
        String strAYXKKw;
        String instType = EZpvd().getInstType();
        if (!C33129mqd.OLrzqt((CharSequence) instType)) {
            instType = null;
        }
        if (instType == null) {
            instType = fvQaOB().djBIcL();
        }
        String instId = EZpvd().getInstId();
        String strGEmmrt = C33129mqd.OLrzqt((CharSequence) instId) ? instId : null;
        if (strGEmmrt == null) {
            strGEmmrt = fvQaOB().gEmmrt();
        }
        xMJ.Application value = AYXKKw().getValue();
        if (value == null || (strAYXKKw = value.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        return C56040xvM.copydefault(instType, strGEmmrt, strAYXKKw);
    }

    public final void AEQbTJ() {
        C56235xyw c56235xyw = this.EZpvd;
        c56235xyw.KWHzl("contract_grid");
        c56235xyw.AEQbTJ(fvQaOB().gEmmrt());
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(this.OLrzqt, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public final void AEQbTJ(String str, String str2, String str3) {
        SlippageControlEditParamRep slippageControlEditParamRep = new SlippageControlEditParamRep((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        slippageControlEditParamRep.setAlgoId(str);
        slippageControlEditParamRep.setType(str2);
        slippageControlEditParamRep.setSlippage(str3);
        C56197xyK c56197xyK = this.gEmmrt;
        c56197xyK.copydefault(slippageControlEditParamRep);
        c56197xyK.OLrzqt(this.djBIcL, new C54507xKz());
        xKK.Activity.execute$default(c56197xyK, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.AhwBna);
        arrayList.add(this.gEmmrt);
        arrayList.add(this.EZpvd);
        return arrayList;
    }
}
