package com.okinc.tradingbot.impl.market_place.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C51790vtf;
import o.C51905vvo;
import o.C51911vvu;
import o.C55688xof;
import o.C55886xsR;
import o.InterfaceC55881xsM;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class BotLeadPendingPresenter extends AbsPresenter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotLeadPendingPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public final ArrayList<C51790vtf> OLrzqt() {
        ArrayList<C51790vtf> arrayList = new ArrayList<>();
        C55886xsR c55886xsR = C55886xsR.OLrzqt;
        InterfaceC55881xsM interfaceC55881xsMCopydefault = c55886xsR.copydefault();
        if (interfaceC55881xsMCopydefault != null && interfaceC55881xsMCopydefault.EZpvd()) {
            arrayList.add(new C51790vtf(C51911vvu.Companion.OLrzqt(), C33070mpX.AYXKKw(C55688xof.Application.launch), 0));
        }
        InterfaceC55881xsM interfaceC55881xsMCopydefault2 = c55886xsR.copydefault();
        if (interfaceC55881xsMCopydefault2 != null && interfaceC55881xsMCopydefault2.OLrzqt()) {
            arrayList.add(new C51790vtf(C51905vvo.Companion.copydefault(), C33070mpX.AYXKKw(C55688xof.Application.UkCIYP), 8));
        }
        return arrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
