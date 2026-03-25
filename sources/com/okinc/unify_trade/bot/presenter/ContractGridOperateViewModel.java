package com.okinc.unify_trade.bot.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.ContractGridAdjustMarginReq;
import com.okinc.unify_trade.biz.ContractGridAdjustMarginResp;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C54507xKz;
import o.C56111xwe;
import o.C56289xzx;
import o.C56290xzy;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ContractGridOperateViewModel extends AbsPresenter {
    public C56111xwe<ContractGridAdjustMarginResp> AEQbTJ;
    public C56111xwe<ContractGridAdjustMarginResp> EZpvd;
    public C56289xzx KWHzl;
    public C56290xzy OLrzqt;
    public final TradeLiveData<StrategyPositionResponse> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56289xzx AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56290xzy EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<ContractGridAdjustMarginResp> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<ContractGridAdjustMarginResp> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractGridOperateViewModel(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new C56289xzx();
        this.EZpvd = new C56111xwe<>();
        this.OLrzqt = new C56290xzy();
        this.AEQbTJ = new C56111xwe<>();
        this.copydefault = new TradeLiveData<>();
    }

    public final void AEQbTJ(@NotNull ContractGridAdjustMarginReq contractGridAdjustMarginReq) {
        Intrinsics.checkNotNullParameter(contractGridAdjustMarginReq, "");
        C56289xzx c56289xzx = this.KWHzl;
        c56289xzx.OLrzqt(contractGridAdjustMarginReq);
        c56289xzx.djBIcL();
        c56289xzx.OLrzqt(this.EZpvd, new C54507xKz());
        xKK.Activity.execute$default(c56289xzx, 0L, 1, null);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C56290xzy c56290xzy = this.OLrzqt;
        c56290xzy.AEQbTJ(str);
        c56290xzy.OLrzqt(str2);
        c56290xzy.KWHzl(str3);
        c56290xzy.djBIcL();
        c56290xzy.OLrzqt(this.AEQbTJ, new C54507xKz());
        c56290xzy.OLrzqt(300L);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.KWHzl, this.OLrzqt);
    }
}
