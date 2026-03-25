package com.okinc.unify_trade.bot.signalbot.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C54589xNz;
import o.C54799xVt;
import o.C55298xhM;
import o.C55688xof;
import o.C55844xrc;
import o.InterfaceC54581xNr;
import o.TaskDescription;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SignalBotCreateInstIdsPresenter extends AbsPresenter {
    public final ArrayList<SignalCoinPairItemData> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SignalCoinPairItemData> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotCreateInstIdsPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new ArrayList<>();
    }

    public final List<Object> OLrzqt(String str) {
        String upperCase;
        BizInstrument suggestedInstrument$default;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (SignalCoinPairItemData signalCoinPairItemData : this.EZpvd) {
            String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, signalCoinPairItemData.getInstId(), "SWAP", false, false, 12, null);
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SWAP", signalCoinPairItemData.getInstId(), null, null, 12, null)) == null || (upperCase = suggestedInstrument$default.getTradeSymbol()) == null) {
                String strCopydefault = TaskDescription.AEQbTJ(signalCoinPairItemData.getInstId()).copydefault();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                upperCase = strCopydefault.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            SignalCoinPairItemData signalCoinPairItemData2 = new SignalCoinPairItemData(titleByIdAndType$default, interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.valueOf(upperCase) : null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, false, false, false, C55298xhM.dp2px$default(10.0f, null, 1, null), false, 5116, (DefaultConstructorMarker) null);
            if (C33129mqd.valueOf(str, signalCoinPairItemData.getMaxLever())) {
                arrayList.add(signalCoinPairItemData2);
            } else {
                arrayList2.add(signalCoinPairItemData2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        if (!arrayList2.isEmpty()) {
            arrayList3.add(new C55844xrc(C33070mpX.AYXKKw(C55688xof.Application.sSi), 0, 2, null));
        }
        arrayList3.addAll(arrayList2);
        return arrayList3;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
