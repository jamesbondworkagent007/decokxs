package com.okinc.tradingbot.impl.order.strategy.contractdca.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.ContractGridAdjustMarginReq;
import com.okinc.unify_trade.biz.ContractGridAdjustMarginResp;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54507xKz;
import o.C56289xzx;
import o.C56290xzy;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ContractDcaAdjustMarginPresenter extends AbsPresenter {
    public C56289xzx AEQbTJ;
    public TradeLiveData<ContractGridAdjustMarginResp> EZpvd;
    public TradeLiveData<ContractGridAdjustMarginResp> KWHzl;
    public C56290xzy OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ContractGridAdjustMarginResp> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56289xzx OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ContractGridAdjustMarginResp> copydefault() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDcaAdjustMarginPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = new C56290xzy();
        this.EZpvd = new TradeLiveData<>();
        this.AEQbTJ = new C56289xzx();
        this.KWHzl = new TradeLiveData<>();
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C56290xzy c56290xzy = this.OLrzqt;
        c56290xzy.AEQbTJ(str);
        c56290xzy.OLrzqt(str3);
        c56290xzy.KWHzl(str2);
        c56290xzy.djBIcL();
        c56290xzy.OLrzqt(this.EZpvd, new C54507xKz());
        xKK.Activity.execute$default(c56290xzy, 0L, 1, null);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C56289xzx c56289xzx = this.AEQbTJ;
        c56289xzx.OLrzqt(new ContractGridAdjustMarginReq(str, str4, str2, str3, false, 16, (DefaultConstructorMarker) null));
        c56289xzx.djBIcL();
        c56289xzx.OLrzqt(this.KWHzl, new C54507xKz());
        xKK.Activity.execute$default(c56289xzx, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.OLrzqt, this.AEQbTJ);
    }
}
