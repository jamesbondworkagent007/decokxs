package com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C53271wiO;
import o.C56403yEb;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotExplainGatherPresenter extends AbsPresenter {
    public ArrayList<BotExplainGatherData> KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(ArrayList<BotExplainGatherData> arrayList) {
        this.KWHzl = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotExplainGatherPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = true;
        this.KWHzl = new ArrayList<>();
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }

    public final List<C53271wiO> copydefault() {
        ArrayList<BotExplainGatherData> arrayList = this.KWHzl;
        if (arrayList == null) {
            return yDY.AhwBna();
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (BotExplainGatherData botExplainGatherData : arrayList) {
            arrayList2.add(new C53271wiO(botExplainGatherData.EZpvd(), botExplainGatherData.KWHzl()));
        }
        return arrayList2;
    }
}
