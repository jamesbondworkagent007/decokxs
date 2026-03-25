package com.okinc.unify_trade.bot.presenter;

import android.app.Application;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.EditContractDcaReq;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54507xKz;
import o.C55960xtm;
import o.C56180xxu;
import o.xCZ;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class GridTransDetailsPresenter extends AbsPresenter {
    public final TradeLiveData<List<TransDetailsData>> AEQbTJ;
    public ArrayList<TransDetailsData> EZpvd;
    public final C56180xxu KWHzl;
    public String OLrzqt;
    public final TradeLiveData<StrategyResponse> copydefault;
    public final xCZ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyResponse> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<TransDetailsData>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(ArrayList<TransDetailsData> arrayList) {
        this.EZpvd = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TransDetailsData> copydefault() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridTransDetailsPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = "";
        this.KWHzl = new C56180xxu();
        this.copydefault = new TradeLiveData<>();
        this.valueOf = new xCZ();
        this.AEQbTJ = new TradeLiveData<>();
    }

    public final void EZpvd(String str, String str2) {
        C56180xxu c56180xxu = this.KWHzl;
        c56180xxu.AEQbTJ(new EditContractDcaReq(str, null, null, null, null, null, null, str2, null, null, null, false, null, 8062, null));
        c56180xxu.OLrzqt(this.copydefault, new C54507xKz());
        xKK.Activity.execute$default(c56180xxu, 0L, 1, null);
    }

    public final void AEQbTJ(String str, String str2) {
        xCZ xcz = this.valueOf;
        xcz.OLrzqt(new StrategyOrderBillDetailsReq(str == null ? "" : str, "2", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str2, TypedValues.PositionType.TYPE_CURVE_FIT, (DefaultConstructorMarker) null));
        TradeLiveData<List<TransDetailsData>> tradeLiveData = this.AEQbTJ;
        C55960xtm c55960xtm = new C55960xtm();
        c55960xtm.EZpvd(str == null ? "" : str);
        c55960xtm.AEQbTJ("contract_dca");
        Unit unit = Unit.INSTANCE;
        xcz.OLrzqt(tradeLiveData, c55960xtm);
        xKK.Activity.execute$default(xcz, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.KWHzl, this.valueOf);
    }
}
