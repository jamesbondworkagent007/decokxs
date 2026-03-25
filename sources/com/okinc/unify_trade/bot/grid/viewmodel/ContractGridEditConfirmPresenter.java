package com.okinc.unify_trade.bot.grid.viewmodel;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.SpotGridEditParamRep;
import com.okinc.unify_trade.biz.SpotGridEditParamReq;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54301xDi;
import o.C54507xKz;
import o.C55804xqp;
import o.C55894xsZ;
import o.C55917xsw;
import o.C55918xsx;
import o.C56033xvF;
import o.C56224xyl;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ContractGridEditConfirmPresenter extends AbsPresenter {
    public SpotGridEditParamReq AEQbTJ;
    public final TradeLiveData<C55804xqp<StrategyDetailsResponse>> EZpvd;
    public final TradeLiveData<SpotGridEditParamRep> KWHzl;
    public final C56224xyl OLrzqt;
    public final C54301xDi copydefault;
    public String djBIcL;
    public TacticsData gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotGridEditParamReq AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56224xyl EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C55804xqp<StrategyDetailsResponse>> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<SpotGridEditParamRep> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData valueOf() {
        return this.gEmmrt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractGridEditConfirmPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = new C56224xyl();
        this.KWHzl = new TradeLiveData<>();
        this.copydefault = new C54301xDi(false, 1, null);
        this.EZpvd = new TradeLiveData<>();
        this.djBIcL = "";
    }

    public final void AEQbTJ(Bundle bundle) {
        String instType;
        String instId;
        this.gEmmrt = bundle != null ? (TacticsData) bundle.getParcelable("bot_grid_req") : null;
        this.AEQbTJ = bundle != null ? (SpotGridEditParamReq) bundle.getParcelable("bot_grid_edit_param_req") : null;
        TacticsData tacticsData = this.gEmmrt;
        String str = "";
        if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsData2 = this.gEmmrt;
        if (tacticsData2 != null && (instId = tacticsData2.getInstId()) != null) {
            str = instId;
        }
        this.djBIcL = C56033xvF.AEQbTJ(instType, str);
    }

    public final void djBIcL() {
        SpotGridEditParamReq spotGridEditParamReq = this.AEQbTJ;
        String algoId = spotGridEditParamReq != null ? spotGridEditParamReq.getAlgoId() : null;
        SpotGridEditParamReq spotGridEditParamReq2 = this.AEQbTJ;
        String minPx = spotGridEditParamReq2 != null ? spotGridEditParamReq2.getMinPx() : null;
        String str = minPx == null ? "" : minPx;
        SpotGridEditParamReq spotGridEditParamReq3 = this.AEQbTJ;
        String maxPx = spotGridEditParamReq3 != null ? spotGridEditParamReq3.getMaxPx() : null;
        String str2 = maxPx == null ? "" : maxPx;
        SpotGridEditParamReq spotGridEditParamReq4 = this.AEQbTJ;
        String gridNum = spotGridEditParamReq4 != null ? spotGridEditParamReq4.getGridNum() : null;
        String str3 = gridNum == null ? "" : gridNum;
        SpotGridEditParamReq spotGridEditParamReq5 = this.AEQbTJ;
        String topupAmount = spotGridEditParamReq5 != null ? spotGridEditParamReq5.getTopupAmount() : null;
        SpotGridEditParamReq spotGridEditParamReq6 = new SpotGridEditParamReq(algoId, str, str2, str3, topupAmount == null ? "" : topupAmount, (String) null, (String) null, (String) null, (String) null, (String) null, 992, (DefaultConstructorMarker) null);
        C56224xyl c56224xyl = this.OLrzqt;
        c56224xyl.OLrzqt(spotGridEditParamReq6);
        c56224xyl.djBIcL();
        c56224xyl.OLrzqt(this.KWHzl, new C54507xKz());
        xKK.Activity.execute$default(c56224xyl, 0L, 1, null);
    }

    public static /* synthetic */ void queryBotDetails$default(ContractGridEditConfirmPresenter contractGridEditConfirmPresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        contractGridEditConfirmPresenter.AEQbTJ(str);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54301xDi c54301xDi = this.copydefault;
        c54301xDi.AEQbTJ(this.EZpvd);
        c54301xDi.AEQbTJ(str);
        xKK.Activity.execute$default(c54301xDi, 0L, 1, null);
    }

    public final C55917xsw KWHzl() {
        if (this.gEmmrt == null) {
            return new C55917xsw(null, null, 3, null);
        }
        C55918xsx c55918xsx = new C55918xsx(this.AEQbTJ, null, 2, null);
        TacticsData tacticsData = this.gEmmrt;
        Intrinsics.copydefault(tacticsData);
        return c55918xsx.KWHzl(tacticsData);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.OLrzqt, this.copydefault);
    }

    public final BenefitDetails EZpvd(@NotNull C55804xqp<StrategyDetailsResponse> c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        return new C55894xsZ(false).KWHzl(c55804xqp);
    }
}
