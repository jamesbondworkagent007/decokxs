package com.okinc.tradingbot.impl.market_place.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.biz.MpCategory;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C51786vtb;
import o.C55886xsR;
import o.C56403yEb;
import o.InterfaceC55881xsM;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class MpBotSelectedPresenter extends AbsPresenter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MpBotSelectedPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public final List<C51786vtb> OLrzqt() {
        List<MpCategory> listAEQbTJ;
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault == null || (listAEQbTJ = interfaceC55881xsMCopydefault.AEQbTJ()) == null) {
            return yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAEQbTJ) {
            MpCategory mpCategory = (MpCategory) obj;
            if ((!mpCategory.getDefaultContent().isEmpty()) || (!mpCategory.getExtra().isEmpty())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C51786vtb((MpCategory) it.next()));
        }
        return arrayList2;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
