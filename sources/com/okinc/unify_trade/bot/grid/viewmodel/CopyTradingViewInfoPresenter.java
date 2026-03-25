package com.okinc.unify_trade.bot.grid.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.unify_trade.bot.grid.viewmodel.CopyTradingViewInfoPresenter;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56234xyv;
import o.C56390yDp;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class CopyTradingViewInfoPresenter extends AbsPresenter {
    public final C56234xyv KWHzl;
    public final TradeLiveData<Pair<String, BotWebHook>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Pair<String, BotWebHook>> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingViewInfoPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new C56234xyv();
        this.OLrzqt = new TradeLiveData<>();
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56234xyv c56234xyv = this.KWHzl;
        c56234xyv.EZpvd(str);
        c56234xyv.KWHzl(new Function1() { // from class: o.xsz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CopyTradingViewInfoPresenter.EZpvd(this.OLrzqt, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56234xyv, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.copydefault(this.KWHzl);
    }

    public static final Unit EZpvd(CopyTradingViewInfoPresenter copyTradingViewInfoPresenter, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((Collection) responseData.getData())) {
            TradeLiveData<Pair<String, BotWebHook>> tradeLiveData = copyTradingViewInfoPresenter.OLrzqt;
            List list = (List) responseData.getData();
            tradeLiveData.postValue(C56390yDp.OLrzqt(null, list != null ? (BotWebHook) CollectionsKt___CollectionsKt.AuCTelauCTel(list) : null));
        } else {
            copyTradingViewInfoPresenter.OLrzqt.postValue(C56390yDp.OLrzqt(responseData.getMsg(), null));
        }
        return Unit.INSTANCE;
    }
}
