package com.okinc.tradingbot.impl.market_place.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.SignalBotSignalListBean;
import com.okinc.unify_trade.biz.SignalProviderSignalBean;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56109xwc;
import o.C56212xyZ;
import o.C56402yEa;
import o.InterfaceC54501xKt;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotLeadSignalBotPresenter extends AbsPresenter {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final C56212xyZ AEQbTJ;
    public final TradeLiveData<List<SignalProviderSignalBean>> KWHzl;
    public String OLrzqt;
    public final TradeLiveData<Boolean> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<SignalProviderSignalBean>> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56212xyZ KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault() {
        this.OLrzqt = "0";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotLeadSignalBotPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AEQbTJ = new C56212xyZ();
        this.KWHzl = new TradeLiveData<>();
        this.copydefault = new TradeLiveData<>();
        this.OLrzqt = "0";
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.presenter.BotLeadSignalBotPresenter.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56212xyZ c56212xyZ = this.AEQbTJ;
        c56212xyZ.EZpvd(str, C33129mqd.addS$default(this.OLrzqt, 1, null, null, null, 14, null), "10");
        c56212xyZ.OLrzqt(new C56109xwc(), new ActionBar());
        xKK.Activity.execute$default(c56212xyZ, 0L, 1, null);
    }

    public static final class ActionBar implements InterfaceC54501xKt<List<? extends SignalBotSignalListBean>, SignalBotSignalListBean> {
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* bridge */ /* synthetic */ SignalBotSignalListBean KWHzl(List<? extends SignalBotSignalListBean> list) {
            return KWHzl2((List<SignalBotSignalListBean>) list);
        }

        /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
        public SignalBotSignalListBean KWHzl2(List<SignalBotSignalListBean> list) {
            String page;
            List<SignalProviderSignalBean> value;
            List<SignalProviderSignalBean> listAhwBna;
            Intrinsics.checkNotNullParameter(list, "");
            SignalBotSignalListBean signalBotSignalListBean = (SignalBotSignalListBean) CollectionsKt___CollectionsKt.firstOrNull(list);
            BotLeadSignalBotPresenter botLeadSignalBotPresenter = BotLeadSignalBotPresenter.this;
            if (signalBotSignalListBean == null || (page = signalBotSignalListBean.getPage()) == null) {
                page = BotLeadSignalBotPresenter.this.OLrzqt;
            }
            botLeadSignalBotPresenter.OLrzqt = page;
            if (Intrinsics.EZpvd((Object) BotLeadSignalBotPresenter.this.OLrzqt, (Object) "1") || (value = BotLeadSignalBotPresenter.this.AEQbTJ().getValue()) == null) {
                value = yDY.AhwBna();
            }
            TradeLiveData<List<SignalProviderSignalBean>> tradeLiveDataAEQbTJ = BotLeadSignalBotPresenter.this.AEQbTJ();
            ArrayList arrayList = new ArrayList(value);
            if (signalBotSignalListBean == null || (listAhwBna = signalBotSignalListBean.getSignals()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            arrayList.addAll(listAhwBna);
            tradeLiveDataAEQbTJ.setValue(arrayList);
            TradeLiveData<Boolean> tradeLiveDataOLrzqt = BotLeadSignalBotPresenter.this.OLrzqt();
            String totalCount = signalBotSignalListBean != null ? signalBotSignalListBean.getTotalCount() : null;
            List<SignalProviderSignalBean> value2 = BotLeadSignalBotPresenter.this.AEQbTJ().getValue();
            tradeLiveDataOLrzqt.setValue(Boolean.valueOf(C33129mqd.AEQbTJ(totalCount, value2 != null ? Integer.valueOf(value2.size()) : null)));
            return signalBotSignalListBean;
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.AEQbTJ);
    }
}
