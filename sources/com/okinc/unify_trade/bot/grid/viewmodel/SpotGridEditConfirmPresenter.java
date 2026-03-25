package com.okinc.unify_trade.bot.grid.viewmodel;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.Distribution;
import com.okinc.unify_trade.biz.SpotGridEditParamRep;
import com.okinc.unify_trade.biz.SpotGridEditParamReq;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.grid.mapper.GridProfitAmtDisplay;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C54507xKz;
import o.C55917xsw;
import o.C55918xsx;
import o.C56033xvF;
import o.C56224xyl;
import o.C56236xyx;
import o.InterfaceC54501xKt;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SpotGridEditConfirmPresenter extends AbsPresenter {
    public final C56236xyx AEQbTJ;
    public SpotGridEditParamReq EZpvd;
    public final TradeLiveData<SpotGridEditParamRep> KWHzl;
    public final C56224xyl OLrzqt;
    public final TradeLiveData<List<Distribution>> copydefault;
    public GridProfitAmtDisplay djBIcL;
    public TacticsData gEmmrt;
    public String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotGridEditParamReq AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<SpotGridEditParamRep> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56224xyl copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotGridEditConfirmPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = new C56224xyl();
        this.KWHzl = new TradeLiveData<>();
        this.AEQbTJ = new C56236xyx();
        this.copydefault = new TradeLiveData<>();
        this.valueOf = "";
    }

    public final void OLrzqt(Bundle bundle) {
        String instType;
        String instId;
        this.gEmmrt = bundle != null ? (TacticsData) bundle.getParcelable("bot_grid_req") : null;
        this.EZpvd = bundle != null ? (SpotGridEditParamReq) bundle.getParcelable("bot_grid_edit_param_req") : null;
        this.djBIcL = bundle != null ? (GridProfitAmtDisplay) bundle.getParcelable("bot_grid_profit_amt_display") : null;
        TacticsData tacticsData = this.gEmmrt;
        String str = "";
        if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsData2 = this.gEmmrt;
        if (tacticsData2 != null && (instId = tacticsData2.getInstId()) != null) {
            str = instId;
        }
        this.valueOf = C56033xvF.AEQbTJ(instType, str);
    }

    public final void AhwBna() {
        C56224xyl c56224xyl = this.OLrzqt;
        SpotGridEditParamReq spotGridEditParamReq = this.EZpvd;
        if (spotGridEditParamReq == null) {
            return;
        }
        c56224xyl.OLrzqt(spotGridEditParamReq);
        c56224xyl.djBIcL();
        c56224xyl.OLrzqt(this.KWHzl, new C54507xKz());
        xKK.Activity.execute$default(c56224xyl, 0L, 1, null);
    }

    public final C55917xsw OLrzqt() {
        if (this.gEmmrt == null) {
            return new C55917xsw(null, null, 3, null);
        }
        C55918xsx c55918xsx = new C55918xsx(this.EZpvd, this.djBIcL);
        TacticsData tacticsData = this.gEmmrt;
        Intrinsics.copydefault(tacticsData);
        return c55918xsx.KWHzl(tacticsData);
    }

    public final LiveData<List<Distribution>> EZpvd() {
        SpotGridEditParamReq spotGridEditParamReq;
        TacticsData tacticsData = this.gEmmrt;
        if (tacticsData == null || (spotGridEditParamReq = this.EZpvd) == null || spotGridEditParamReq.getMinPx().length() == 0 || spotGridEditParamReq.getMaxPx().length() == 0 || spotGridEditParamReq.getGridNum().length() == 0 || tacticsData.getRunType().length() == 0) {
            return null;
        }
        C56236xyx c56236xyx = this.AEQbTJ;
        c56236xyx.copydefault(tacticsData.getInstId());
        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(spotGridEditParamReq.getGridNum());
        c56236xyx.AEQbTJ(intOrNull != null ? intOrNull.intValue() : 0);
        c56236xyx.EZpvd(spotGridEditParamReq.getMaxPx());
        c56236xyx.KWHzl(spotGridEditParamReq.getMinPx());
        c56236xyx.AYXKKw(tacticsData.getRunType());
        c56236xyx.AEQbTJ("grid");
        c56236xyx.OLrzqt(tacticsData.getCurBaseSz());
        c56236xyx.gEmmrt(tacticsData.getCurQuoteSz());
        c56236xyx.djBIcL(tacticsData.getTradeQuoteCcy());
        c56236xyx.djBIcL();
        c56236xyx.OLrzqt(this.copydefault, new TaskDescription());
        xKK.Activity.execute$default(c56236xyx, 0L, 1, null);
        return this.copydefault;
    }

    public static final class TaskDescription implements InterfaceC54501xKt<List<? extends Distribution>, List<? extends Distribution>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
        public List<Distribution> KWHzl2(List<Distribution> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return list;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* bridge */ /* synthetic */ List<? extends Distribution> KWHzl(List<? extends Distribution> list) {
            return KWHzl2((List<Distribution>) list);
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.OLrzqt, this.AEQbTJ);
    }
}
