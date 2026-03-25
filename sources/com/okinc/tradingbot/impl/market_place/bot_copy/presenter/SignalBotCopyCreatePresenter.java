package com.okinc.tradingbot.impl.market_place.bot_copy.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.tradingbot.impl.order.strategy.signalbot.ui.itembinder.SignalBotConfirmData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SignalDetails;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C54315xDw;
import o.C54589xNz;
import o.C54799xVt;
import o.C55688xof;
import o.C56402yEa;
import o.C56403yEb;
import o.InterfaceC54581xNr;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalBotCopyCreatePresenter extends AbsPresenter {
    public static final int AEQbTJ = TradeLiveData.$stable | C54315xDw.EZpvd;
    public final C54315xDw EZpvd;
    public final TradeLiveData<Boolean> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotCopyCreatePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new C54315xDw();
        this.OLrzqt = new TradeLiveData<>();
    }

    public final void OLrzqt() {
        C54315xDw c54315xDw = this.EZpvd;
        c54315xDw.copydefault(C56402yEa.EZpvd("SWAP"));
        c54315xDw.AEQbTJ(this.OLrzqt);
        xKK.Activity.execute$default(c54315xDw, 0L, 1, null);
    }

    public final List<Object> EZpvd(@NotNull SignalDetails signalDetails, @NotNull List<String> list) {
        String tradeSymbol;
        BizInstrument suggestedInstrument$default;
        Intrinsics.checkNotNullParameter(signalDetails, "");
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.requestPostMessageChannelWithExtras), signalDetails.getSignalChanName(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        if (!C33129mqd.AEQbTJ(Integer.valueOf(list.size()), 1)) {
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.HJWChPfrwjPh), C33129mqd.OLrzqt((Object) Integer.valueOf(list.size()), (Object) 1) ? C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, list.get(0), "SWAP", false, false, 12, null) : "", null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        } else {
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (String str : list) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SWAP", str, null, null, 12, null)) == null || (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) == null) {
                    tradeSymbol = "";
                }
                arrayList2.add(tradeSymbol);
            }
            arrayList.add(new SignalBotConfirmData(C33070mpX.AYXKKw(C55688xof.Application.HJWChPfrwjPh), arrayList2));
        }
        return arrayList;
    }

    public final boolean copydefault(@NotNull SignalDetails signalDetails) {
        Intrinsics.checkNotNullParameter(signalDetails, "");
        return signalDetails.isSubscribed() || Intrinsics.EZpvd((Object) signalDetails.getType(), (Object) "created");
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.copydefault(this.EZpvd);
    }
}
