package com.okinc.unify_trade.bot.signalbot.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C54216xAe;
import o.C55984xuJ;
import o.C56402yEa;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalTotalOrdersPresenter extends AbsPresenter {
    public final C54216xAe AEQbTJ;
    public String EZpvd;
    public final C55984xuJ KWHzl;
    public int OLrzqt;
    public final TradeLiveData<ArrayList<DetailsData>> copydefault;
    public final String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ArrayList<DetailsData>> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54216xAe OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt == 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalTotalOrdersPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = "";
        this.valueOf = "20";
        this.OLrzqt = 1;
        this.AEQbTJ = new C54216xAe();
        this.copydefault = new TradeLiveData<>();
        this.KWHzl = new C55984xuJ();
    }

    public final void AEQbTJ() {
        this.KWHzl.EZpvd("");
        this.OLrzqt = 1;
        requestOrders$default(this, null, 1, null);
    }

    public final void KWHzl() {
        this.OLrzqt++;
        copydefault(this.KWHzl.KWHzl());
    }

    public static /* synthetic */ void requestOrders$default(SignalTotalOrdersPresenter signalTotalOrdersPresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        signalTotalOrdersPresenter.copydefault(str);
    }

    public final void copydefault(String str) {
        C54216xAe c54216xAe = this.AEQbTJ;
        c54216xAe.AEQbTJ(this.EZpvd);
        c54216xAe.AhwBna("0");
        c54216xAe.djBIcL(this.valueOf);
        c54216xAe.copydefault(str);
        c54216xAe.OLrzqt(this.copydefault, this.KWHzl);
        xKK.Activity.execute$default(c54216xAe, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.AEQbTJ);
    }
}
