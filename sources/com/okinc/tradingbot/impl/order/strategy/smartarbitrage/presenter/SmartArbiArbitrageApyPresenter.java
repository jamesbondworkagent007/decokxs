package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.KlineFundingRateData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C54230xAs;
import o.InterfaceC54501xKt;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SmartArbiArbitrageApyPresenter extends AbsPresenter {
    public static final int AEQbTJ = TradeLiveData.$stable | C54230xAs.KWHzl;
    public final C54230xAs EZpvd;
    public final TradeLiveData<ArrayList<KlineFundingRateData>> KWHzl;

    public static final class Application implements InterfaceC54501xKt<ArrayList<KlineFundingRateData>, ArrayList<KlineFundingRateData>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public ArrayList<KlineFundingRateData> KWHzl(@NotNull ArrayList<KlineFundingRateData> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            return arrayList;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ArrayList<KlineFundingRateData>> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbiArbitrageApyPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new C54230xAs();
        this.KWHzl = new TradeLiveData<>();
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54230xAs c54230xAs = this.EZpvd;
        c54230xAs.EZpvd(str);
        c54230xAs.OLrzqt(this.KWHzl, new Application());
        xKK.Activity.execute$default(c54230xAs, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
