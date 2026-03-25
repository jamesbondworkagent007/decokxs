package com.okinc.tradingbot.impl.nmp.my_bot.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.unify_trade.biz.BotOrderFilter;
import com.okinc.unify_trade.biz.BotSectorUnderlyingListBean;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C55276xgr;
import o.C55688xof;
import o.C56285xzt;
import o.C56402yEa;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class BotNmpOrderListPresenter extends AbsPresenter {
    public static final int EZpvd = TradeLiveData.$stable | C56285xzt.copydefault;
    public final TradeLiveData<List<BotSectorUnderlyingListBean>> AEQbTJ;
    public final C56285xzt KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<BotSectorUnderlyingListBean>> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56285xzt KWHzl() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotNmpOrderListPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new C56285xzt();
        this.AEQbTJ = new TradeLiveData<>();
    }

    public final void EZpvd() {
        if (this.AEQbTJ.getValue() != null) {
            TradeLiveData<List<BotSectorUnderlyingListBean>> tradeLiveData = this.AEQbTJ;
            tradeLiveData.setValue(tradeLiveData.getValue());
        } else {
            C56285xzt c56285xzt = this.KWHzl;
            c56285xzt.AEQbTJ(this.AEQbTJ);
            xKK.Activity.execute$default(c56285xzt, 0L, 1, null);
        }
    }

    public final List<C55276xgr> EZpvd(@NotNull BotOrderFilter botOrderFilter) {
        Intrinsics.checkNotNullParameter(botOrderFilter, "");
        ArrayList arrayList = new ArrayList();
        BotSectorUnderlyingListBean botSectorUnderlyingListBeanCopydefault = copydefault();
        String sectorName = botSectorUnderlyingListBeanCopydefault.getSectorName();
        String str = sectorName == null ? "" : sectorName;
        BotSectorUnderlyingListBean underlyingListBean = botOrderFilter.getUnderlyingListBean();
        arrayList.add(new C55276xgr(str, botSectorUnderlyingListBeanCopydefault, null, Intrinsics.EZpvd((Object) (underlyingListBean != null ? underlyingListBean.getSectorId() : null), (Object) "all_bot"), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        List<BotSectorUnderlyingListBean> value = this.AEQbTJ.getValue();
        if (value != null) {
            for (BotSectorUnderlyingListBean botSectorUnderlyingListBean : value) {
                String sectorName2 = botSectorUnderlyingListBean.getSectorName();
                String str2 = sectorName2 == null ? "" : sectorName2;
                BotSectorUnderlyingListBean underlyingListBean2 = botOrderFilter.getUnderlyingListBean();
                arrayList.add(new C55276xgr(str2, botSectorUnderlyingListBean, null, Intrinsics.EZpvd((Object) (underlyingListBean2 != null ? underlyingListBean2.getSectorId() : null), (Object) botSectorUnderlyingListBean.getSectorId()), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
            }
        }
        return arrayList;
    }

    public final BotSectorUnderlyingListBean copydefault() {
        return new BotSectorUnderlyingListBean("all_bot", C33070mpX.AYXKKw(C55688xof.Application.setCurrentControllerInfo), null, 4, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.KWHzl);
    }
}
