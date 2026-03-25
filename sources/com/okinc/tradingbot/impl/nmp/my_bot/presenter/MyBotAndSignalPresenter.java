package com.okinc.tradingbot.impl.nmp.my_bot.presenter;

import android.app.Application;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.biz.OrderPositionData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C33069mpW;
import o.C33070mpX;
import o.C52107vze;
import o.C55688xof;
import o.C56390yDp;
import o.C56423yEv;
import o.xKK;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class MyBotAndSignalPresenter extends AbsPresenter {
    public OrderPositionData EZpvd;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[NmpTabType.values().length];
            try {
                iArr[NmpTabType.RUNNING_BOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NmpTabType.HISTORY_BOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NmpTabType.MY_SIGNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull OrderPositionData orderPositionData) {
        Intrinsics.checkNotNullParameter(orderPositionData, "");
        this.EZpvd = orderPositionData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyBotAndSignalPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new OrderPositionData(null, null, null, null, null, null, null, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public final List<C52107vze> AEQbTJ() {
        NmpTabType[] nmpTabTypeArrValues = NmpTabType.values();
        ArrayList arrayList = new ArrayList(nmpTabTypeArrValues.length);
        for (NmpTabType nmpTabType : nmpTabTypeArrValues) {
            arrayList.add(new C52107vze(nmpTabType));
        }
        return arrayList;
    }

    public final String EZpvd(@NotNull NmpTabType nmpTabType) {
        Intrinsics.checkNotNullParameter(nmpTabType, "");
        int i = StateListAnimator.KWHzl[nmpTabType.ordinal()];
        if (i == 1) {
            int totalAmt = this.EZpvd.getBotAmtData().getTotalAmt();
            if (totalAmt > 0) {
                return C33069mpW.copydefault(C55688xof.Application.OhcwxsRkSIEV, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", xMR.copydefault.copydefault(String.valueOf(totalAmt)))));
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

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
