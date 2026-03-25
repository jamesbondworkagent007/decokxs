package com.okinc.unify_trade.bot.signalbot.viewmodel;

import android.app.Application;
import androidx.camera.video.AudioStats;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.biz.TacticsType;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FetchMultiInstsResult;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47222tlv;
import o.C54589xNz;
import o.C54799xVt;
import o.C56257xzR;
import o.C56402yEa;
import o.C56403yEb;
import o.InterfaceC54581xNr;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleCoinSelectPresenter extends AbsPresenter {
    public List<SelectCoinData> AEQbTJ;
    public final TradeLiveData<List<FetchMultiInstsResult>> EZpvd;
    public String KWHzl;
    public String OLrzqt;
    public final C56257xzR copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56257xzR KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<FetchMultiInstsResult>> copydefault() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleCoinSelectPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = new C56257xzR();
        this.EZpvd = new TradeLiveData<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<SelectCoinData> OLrzqt() {
        String str;
        BizInstrument suggestedInstrument$default;
        List<FetchMultiInstsResult> value = this.EZpvd.getValue();
        ArrayList arrayList = null;
        if (value != null) {
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(value, 10));
            int i = 0;
            for (Object obj : value) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                FetchMultiInstsResult fetchMultiInstsResult = (FetchMultiInstsResult) obj;
                C54799xVt c54799xVt = C54799xVt.AEQbTJ;
                String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(c54799xVt, fetchMultiInstsResult.getInstId(), "SWAP", false, false, 12, null);
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                String tradeSymbol = (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SWAP", fetchMultiInstsResult.getInstId(), null, null, 12, null)) == null) ? null : suggestedInstrument$default.getTradeSymbol();
                InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                String strValueOf = interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.valueOf(tradeSymbol == null ? "" : tradeSymbol) : null;
                String instId = fetchMultiInstsResult.getInstId();
                boolean z = i == 0;
                if (tradeSymbol == null) {
                    str = titleByIdAndType$default;
                } else {
                    TradeCoinInfo tradeCoinInfoOLrzqt = c54799xVt.OLrzqt(tradeSymbol);
                    String name = tradeCoinInfoOLrzqt != null ? tradeCoinInfoOLrzqt.getName() : null;
                    if (name != null) {
                        str = name;
                    }
                }
                arrayList2.add(new SelectCoinData(strValueOf, titleByIdAndType$default, null, z, false, false, instId, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, str, AudioStats.AUDIO_AMPLITUDE_NONE, 6068, null));
                i++;
            }
            arrayList = arrayList2;
        }
        this.AEQbTJ = arrayList;
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    public final void AEQbTJ() {
        C56257xzR c56257xzR = this.copydefault;
        C56257xzR.setParams$default(c56257xzR, this.OLrzqt, null, 2, null);
        c56257xzR.djBIcL();
        c56257xzR.AEQbTJ(this.EZpvd);
        xKK.Activity.execute$default(c56257xzR, 0L, 1, null);
    }

    public final List<SelectCoinData> copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        List<SelectCoinData> listSearchAndSortItems$default = this.AEQbTJ;
        if (listSearchAndSortItems$default != null) {
            if (!StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                listSearchAndSortItems$default = C47222tlv.searchAndSortItems$default(C47222tlv.KWHzl, str, listSearchAndSortItems$default, FuzzySearchEventSourceEnum.OKTRADECORE_SINGLE_COIN.getSource(), false, 8, null);
            }
            if (listSearchAndSortItems$default != null) {
                return listSearchAndSortItems$default;
            }
        }
        return yDY.AhwBna();
    }

    public final DetailsData EZpvd() {
        String instId;
        List<SelectCoinData> list = this.AEQbTJ;
        SelectCoinData selectCoinData = null;
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((SelectCoinData) next).isSelected()) {
                    obj = next;
                    break;
                }
            }
            selectCoinData = (SelectCoinData) obj;
        }
        String str = (selectCoinData == null || (instId = selectCoinData.getInstId()) == null) ? "" : instId;
        String str2 = this.OLrzqt;
        String str3 = str2 == null ? "" : str2;
        TacticsType tacticsType = TacticsType.TACTICS_SIGNAL_BOT;
        String str4 = this.KWHzl;
        return new DetailsData(null, str, "SWAP", str3, null, null, false, tacticsType, null, null, str4 == null ? "" : str4, null, null, null, false, 0, 0, null, null, null, null, false, null, 8371057, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.copydefault);
    }

    public final void KWHzl(@NotNull SelectCoinData selectCoinData) {
        Intrinsics.checkNotNullParameter(selectCoinData, "");
        List<SelectCoinData> list = this.AEQbTJ;
        if (list != null) {
            for (SelectCoinData selectCoinData2 : list) {
                selectCoinData2.setSelected(Intrinsics.EZpvd((Object) selectCoinData2.getInstId(), (Object) selectCoinData.getInstId()));
            }
        }
    }
}
