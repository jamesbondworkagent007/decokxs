package com.okinc.tradingbot.impl.order.strategy.recurring.presenter;

import android.app.Application;
import androidx.camera.video.AudioStats;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class RecurringCoinRatioPresenter extends AbsPresenter {
    public final ArrayList<SelectCoinData> AEQbTJ;
    public String EZpvd;
    public final TradeLiveData<MinInvestResp> KWHzl;
    public String OLrzqt;
    public final ArrayList<SelectCoinData> copydefault;
    public String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SelectCoinData> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SelectCoinData> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<MinInvestResp> valueOf() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringCoinRatioPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = "";
        this.KWHzl = new TradeLiveData<>();
        this.AEQbTJ = new ArrayList<>();
        this.copydefault = new ArrayList<>();
        this.gEmmrt = "average_ratio";
        this.OLrzqt = "";
    }

    public final void copydefault(@NotNull ArrayList<SelectCoinData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.AEQbTJ.clear();
        this.AEQbTJ.addAll(arrayList);
    }

    public final void AEQbTJ(@NotNull ArrayList<SelectCoinData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.copydefault.clear();
        ArrayList<SelectCoinData> arrayList2 = this.copydefault;
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (SelectCoinData selectCoinData : arrayList) {
            arrayList3.add(selectCoinData.copy((8191 & 1) != 0 ? selectCoinData.icon : null, (8191 & 2) != 0 ? selectCoinData.name : null, (8191 & 4) != 0 ? selectCoinData.ratio : null, (8191 & 8) != 0 ? selectCoinData.isSelected : false, (8191 & 16) != 0 ? selectCoinData.isShow : false, (8191 & 32) != 0 ? selectCoinData.isSearchVisible : false, (8191 & 64) != 0 ? selectCoinData.instId : null, (8191 & 128) != 0 ? selectCoinData.minPrice : null, (8191 & 256) != 0 ? selectCoinData.maxPrice : null, (8191 & 512) != 0 ? selectCoinData.primary : null, (8191 & 1024) != 0 ? selectCoinData.primarySimilarity : AudioStats.AUDIO_AMPLITUDE_NONE, (8191 & 2048) != 0 ? selectCoinData.secondary : null, (8191 & 4096) != 0 ? selectCoinData.secondarySimilarity : AudioStats.AUDIO_AMPLITUDE_NONE));
        }
        arrayList2.addAll(arrayList3);
    }

    public final boolean KWHzl() {
        if (this.AEQbTJ.size() != this.copydefault.size()) {
            return false;
        }
        int size = copydefault().size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.EZpvd((Object) this.AEQbTJ.get(i).getRatio(), (Object) this.copydefault.get(i).getRatio())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
