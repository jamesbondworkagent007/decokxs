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
import o.C54589xNz;
import o.C54799xVt;
import o.C55298xhM;
import o.InterfaceC54581xNr;
import o.TaskDescription;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SignalBotInstIdsPresenter extends AbsPresenter {
    public final ArrayList<String> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotInstIdsPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AEQbTJ = new ArrayList<>();
    }

    public final ArrayList<SignalCoinPairItemData> KWHzl() {
        String upperCase;
        BizInstrument suggestedInstrument$default;
        ArrayList<SignalCoinPairItemData> arrayList = new ArrayList<>();
        for (String str : this.AEQbTJ) {
            String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, "SWAP", false, false, 12, null);
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SWAP", str, null, null, 12, null)) == null || (upperCase = suggestedInstrument$default.getTradeSymbol()) == null) {
                String strCopydefault = TaskDescription.AEQbTJ(str).copydefault();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                upperCase = strCopydefault.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            arrayList.add(new SignalCoinPairItemData(titleByIdAndType$default, interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.valueOf(upperCase) : null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, false, false, false, C55298xhM.dp2px$default(10.0f, null, 1, null), false, 5116, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
