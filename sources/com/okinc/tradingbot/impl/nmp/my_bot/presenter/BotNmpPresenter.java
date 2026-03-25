package com.okinc.tradingbot.impl.nmp.my_bot.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C52113vzk;
import o.C56403yEb;
import o.InterfaceC56445yFq;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class BotNmpPresenter extends AbsPresenter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotNmpPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public final List<C52113vzk> AEQbTJ() {
        InterfaceC56445yFq<SortType> entries = SortType.getEntries();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(entries, 10));
        Iterator<SortType> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(new C52113vzk(it.next()));
        }
        return arrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
