package com.okinc.tradingbot.impl.market_place.my_bot.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.tradingbot.impl.market_place.my_bot.TabType;
import com.okinc.unify_trade.biz.OrderPositionData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C51756vsy;
import o.C55688xof;
import o.C56071xvr;
import o.C56390yDp;
import o.C56402yEa;
import o.C56423yEv;
import o.xCJ;
import o.xKK;
import o.xMR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class MyBotPresenter extends AbsPresenter {
    public boolean AEQbTJ;
    public String AYXKKw;
    public String EZpvd;
    public final xCJ KWHzl;
    public final TradeLiveData<OrderPositionData> OLrzqt;
    public String copydefault;

    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TabType.values().length];
            try {
                iArr[TabType.RUNNING_BOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TabType.HISTORY_BOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TabType.MY_SIGNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xCJ EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<OrderPositionData> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyBotPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new xCJ(false, 1, null);
        this.OLrzqt = new TradeLiveData<>();
        this.AYXKKw = "";
        this.copydefault = "";
        this.EZpvd = "";
    }

    public final void AYXKKw() {
        xCJ xcj = this.KWHzl;
        xcj.AEQbTJ(this.OLrzqt);
        xKK.Activity.execute$default(xcj, 0L, 1, null);
    }

    public final String OLrzqt(@NotNull TabType tabType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(tabType, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i = TaskDescription.copydefault[tabType.ordinal()];
        if (i == 1) {
            if (C33129mqd.AEQbTJ(str, "0")) {
                return C33069mpW.copydefault(C55688xof.Application.OhcwxsRkSIEV, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", xMR.copydefault.copydefault(str))));
            }
            return C33070mpX.AYXKKw(C55688xof.Application.collapseActionView);
        }
        if (i == 2) {
            return C33070mpX.AYXKKw(C55688xof.Application.RidNCX);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C33070mpX.AYXKKw(C55688xof.Application.UkCIYP);
    }

    public final String OLrzqt(@NotNull TabType tabType) {
        String str;
        Intrinsics.checkNotNullParameter(tabType, "");
        int i = TaskDescription.copydefault[tabType.ordinal()];
        if (i == 1) {
            str = "Ongoing";
        } else if (i == 2) {
            str = "History";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "Signals";
        }
        return "MyBot" + str + "Tab";
    }

    public final List<C51756vsy> KWHzl() {
        TabType[] tabTypeArrValues = TabType.values();
        ArrayList arrayList = new ArrayList(tabTypeArrValues.length);
        for (TabType tabType : tabTypeArrValues) {
            arrayList.add(new C51756vsy(tabType, Boolean.valueOf(this.AEQbTJ)));
        }
        if (!C56071xvr.gEmmrt.ejfBZ()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C51756vsy) obj).EZpvd().getSupportCR()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.KWHzl);
    }
}
