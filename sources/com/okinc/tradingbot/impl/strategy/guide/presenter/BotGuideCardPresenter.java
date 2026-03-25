package com.okinc.tradingbot.impl.strategy.guide.presenter;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.C55887xsS;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class BotGuideCardPresenter extends AbsPresenter {
    public String AEQbTJ;
    public IBotGuidePresenter EZpvd;
    public String KWHzl;
    public C55887xsS OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull IBotGuidePresenter iBotGuidePresenter) {
        Intrinsics.checkNotNullParameter(iBotGuidePresenter, "");
        this.EZpvd = iBotGuidePresenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        this.OLrzqt = c55887xsS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGuideCardPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public final IBotGuidePresenter KWHzl() {
        IBotGuidePresenter iBotGuidePresenter = this.EZpvd;
        if (iBotGuidePresenter != null) {
            return iBotGuidePresenter;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C55887xsS EZpvd() {
        C55887xsS c55887xsS = this.OLrzqt;
        if (c55887xsS != null) {
            return c55887xsS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final String copydefault() {
        String str = this.AEQbTJ;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final String AEQbTJ() {
        String str = this.KWHzl;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [36=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull ViewModelStoreOwner viewModelStoreOwner, Bundle bundle) {
        String string;
        String string2;
        IBotGuidePresenter iBotGuidePresenter;
        String string3;
        String str = "";
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "");
        if (bundle == null || (string = bundle.getString("bot_ord_type")) == null) {
            string = "grid";
        }
        String string4 = bundle != null ? bundle.getString("source") : null;
        if (bundle != null && (string3 = bundle.getString("bot_inst_id")) != null) {
            str = string3;
        }
        copydefault(str);
        if (bundle == null || (string2 = bundle.getString("bot_inst_type")) == null) {
            string2 = "SPOT";
        }
        OLrzqt(string2);
        if (this.EZpvd == null) {
            switch (string.hashCode()) {
                case -1402017003:
                    iBotGuidePresenter = !string.equals("contract_dca") ? (IBotGuidePresenter) new ViewModelProvider(viewModelStoreOwner).get(BotGuideSpotGridPresenter.class) : (IBotGuidePresenter) new ViewModelProvider(viewModelStoreOwner).get(BotGuideContractDcaPresenter.class);
                    break;
                case -1216369070:
                    if (string.equals("smart_portfolio")) {
                        iBotGuidePresenter = (IBotGuidePresenter) new ViewModelProvider(viewModelStoreOwner).get(BotGuideSmartPortfolioDetailPresenter.class);
                        break;
                    }
                    break;
                case -512749997:
                    if (string.equals("contract_grid")) {
                        iBotGuidePresenter = (IBotGuidePresenter) new ViewModelProvider(viewModelStoreOwner).get(BotGuideContractGridPresenter.class);
                        break;
                    }
                    break;
                case 3181382:
                    if (string.equals("grid")) {
                        iBotGuidePresenter = (IBotGuidePresenter) new ViewModelProvider(viewModelStoreOwner).get(BotGuideSpotGridPresenter.class);
                        break;
                    }
                    break;
            }
            AEQbTJ(iBotGuidePresenter);
        }
        OLrzqt(new C55887xsS(AEQbTJ(), copydefault()));
        KWHzl().OLrzqt(string, EZpvd(), string4, bundle);
    }

    public final Pair<String, String> OLrzqt() {
        return KWHzl().uzCIH();
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return new ArrayList();
    }
}
