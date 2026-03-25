package o;

import com.okinc.business.market.data.model.smart_money.SignalGemItemData;
import com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsCardsUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiplierTagType;
import com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiplierTagUiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29472kuL {
    @yCM
    public C29472kuL() {
    }

    public final SignalGemsCardsUiModel copydefault(@NotNull SignalGemItemData signalGemItemData) {
        Intrinsics.checkNotNullParameter(signalGemItemData, "");
        return new SignalGemsCardsUiModel(signalGemItemData.AhwBna().valueOf(), signalGemItemData.AhwBna().copydefault(), signalGemItemData.AhwBna().EZpvd(), signalGemItemData.AhwBna().gEmmrt(), signalGemItemData.AhwBna().AhwBna(), new SignalMultiplierTagUiModel(SignalMultiplierTagType.Companion.EZpvd(signalGemItemData.AEQbTJ()), signalGemItemData.djBIcL()), signalGemItemData.OLrzqt(), signalGemItemData.KWHzl(), C33129mqd.valueOf(signalGemItemData.copydefault()), C33129mqd.valueOf(signalGemItemData.OLrzqt()) > C33129mqd.valueOf(signalGemItemData.KWHzl()), signalGemItemData.AhwBna().AEQbTJ(), signalGemItemData.AhwBna().KWHzl(), signalGemItemData.AhwBna().AYXKKw());
    }
}
