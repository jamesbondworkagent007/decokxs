package com.okinc.tradingbot.impl.market_place.bot_copy.presenter;

import android.app.Application;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.tradingbot.impl.strategy.bean.StrategyItemData;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC51282vkA;
import o.C51284vkC;
import o.C51288vkG;
import o.C51332vky;
import o.C51333vkz;
import o.C54301xDi;
import o.C55804xqp;
import o.C56258xzS;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class BotCopySuccessPresenter extends AbsPresenter {
    public AbstractC51282vkA copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull AbstractC51282vkA abstractC51282vkA) {
        Intrinsics.checkNotNullParameter(abstractC51282vkA, "");
        this.copydefault = abstractC51282vkA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotCopySuccessPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public final AbstractC51282vkA AhwBna() {
        AbstractC51282vkA abstractC51282vkA = this.copydefault;
        if (abstractC51282vkA != null) {
            return abstractC51282vkA;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [28=4] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(@NotNull String str, @NotNull String str2) {
        AbstractC51282vkA c51288vkG;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iHashCode = str2.hashCode();
        if (iHashCode != 1165749981) {
            if (iHashCode != 1485620813) {
                c51288vkG = (iHashCode == 1780188297 && str2.equals("arbitrage")) ? new C51332vky() : new C51333vkz();
            } else if (str2.equals("dcd_bot")) {
                c51288vkG = new C51284vkC();
            }
        } else if (str2.equals("recurring")) {
            c51288vkG = new C51288vkG();
        }
        KWHzl(c51288vkG);
        AhwBna().AEQbTJ(str);
    }

    public final boolean isConnected() {
        return AhwBna().valueOf();
    }

    public final ArrayList<String> OLrzqt() {
        return AhwBna().copydefault();
    }

    public final String AEQbTJ() {
        return AhwBna().OLrzqt();
    }

    public final String fetchVPNInfo() {
        return AhwBna().gEmmrt();
    }

    public final int djBIcL() {
        return AhwBna().AhwBna();
    }

    public final int valueOf() {
        return AhwBna().AYXKKw();
    }

    public final boolean DbNXlk() {
        return AhwBna().DbNXlk();
    }

    public final int KWHzl() {
        return AhwBna().EZpvd();
    }

    public final void AkhnZx() {
        AhwBna().AkhnZx();
    }

    public final C56258xzS gEmmrt() {
        AbstractC51282vkA abstractC51282vkAAhwBna = AhwBna();
        if (abstractC51282vkAAhwBna instanceof C51284vkC) {
            AbstractC51282vkA abstractC51282vkAAhwBna2 = AhwBna();
            Intrinsics.copydefault(abstractC51282vkAAhwBna2, "");
            return ((C51284vkC) abstractC51282vkAAhwBna2).isConnected();
        }
        if (!(abstractC51282vkAAhwBna instanceof C51288vkG)) {
            return null;
        }
        AbstractC51282vkA abstractC51282vkAAhwBna3 = AhwBna();
        Intrinsics.copydefault(abstractC51282vkAAhwBna3, "");
        return ((C51288vkG) abstractC51282vkAAhwBna3).isConnected();
    }

    public final MutableLiveData<StrategyItemData> AYXKKw() {
        if ((AhwBna() instanceof C51288vkG) || (AhwBna() instanceof C51284vkC)) {
            return AhwBna().AEQbTJ();
        }
        return null;
    }

    public final MutableLiveData<C55804xqp<StrategyDetailsResponse>> copydefault() {
        if (!(AhwBna() instanceof C51284vkC)) {
            return null;
        }
        AbstractC51282vkA abstractC51282vkAAhwBna = AhwBna();
        Intrinsics.copydefault(abstractC51282vkAAhwBna, "");
        return ((C51284vkC) abstractC51282vkAAhwBna).fetchVPNInfo();
    }

    public final C54301xDi EZpvd() {
        if (!(AhwBna() instanceof C51284vkC)) {
            return null;
        }
        AbstractC51282vkA abstractC51282vkAAhwBna = AhwBna();
        Intrinsics.copydefault(abstractC51282vkAAhwBna, "");
        return ((C51284vkC) abstractC51282vkAAhwBna).ejfBZ();
    }

    public final MutableLiveData<Pair<String, Boolean>> values() {
        if (!(AhwBna() instanceof C51284vkC)) {
            return null;
        }
        AbstractC51282vkA abstractC51282vkAAhwBna = AhwBna();
        Intrinsics.copydefault(abstractC51282vkAAhwBna, "");
        return ((C51284vkC) abstractC51282vkAAhwBna).fJNWhG();
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(AhwBna().djBIcL());
        return arrayList;
    }
}
