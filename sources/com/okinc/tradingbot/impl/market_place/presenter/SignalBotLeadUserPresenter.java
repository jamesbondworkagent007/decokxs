package com.okinc.tradingbot.impl.market_place.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.SignalBotSubsInfoBean;
import com.okinc.unify_trade.biz.SignalBotSubsInfoListBean;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56002xub;
import o.C56109xwc;
import o.C56211xyY;
import o.C56402yEa;
import o.InterfaceC54501xKt;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SignalBotLeadUserPresenter extends AbsPresenter {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final TradeLiveData<List<SignalBotSubsInfoBean>> AEQbTJ;
    public final C56211xyY KWHzl;
    public String OLrzqt;
    public final TradeLiveData<Boolean> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56211xyY AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<SignalBotSubsInfoBean>> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotLeadUserPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new C56211xyY();
        this.AEQbTJ = new TradeLiveData<>();
        this.copydefault = new TradeLiveData<>();
        this.OLrzqt = "0";
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.presenter.SignalBotLeadUserPresenter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void OLrzqt(String str) {
        C56211xyY c56211xyY = this.KWHzl;
        c56211xyY.copydefault(str, C33129mqd.addS$default(this.OLrzqt, 1, null, null, null, 14, null), "10", KWHzl());
        c56211xyY.OLrzqt(new C56109xwc(), new TaskDescription());
        xKK.Activity.execute$default(c56211xyY, 0L, 1, null);
    }

    public static final class TaskDescription implements InterfaceC54501xKt<List<? extends SignalBotSubsInfoListBean>, SignalBotSubsInfoListBean> {
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public SignalBotSubsInfoListBean KWHzl(List<SignalBotSubsInfoListBean> list) {
            String page;
            List<SignalBotSubsInfoBean> value;
            List<SignalBotSubsInfoBean> listAhwBna;
            Intrinsics.checkNotNullParameter(list, "");
            SignalBotSubsInfoListBean signalBotSubsInfoListBean = (SignalBotSubsInfoListBean) CollectionsKt___CollectionsKt.firstOrNull(list);
            SignalBotLeadUserPresenter signalBotLeadUserPresenter = SignalBotLeadUserPresenter.this;
            if (signalBotSubsInfoListBean == null || (page = signalBotSubsInfoListBean.getPage()) == null) {
                page = SignalBotLeadUserPresenter.this.OLrzqt;
            }
            signalBotLeadUserPresenter.OLrzqt = page;
            if (Intrinsics.EZpvd((Object) SignalBotLeadUserPresenter.this.OLrzqt, (Object) "1") || (value = SignalBotLeadUserPresenter.this.copydefault().getValue()) == null) {
                value = yDY.AhwBna();
            }
            TradeLiveData<List<SignalBotSubsInfoBean>> tradeLiveDataCopydefault = SignalBotLeadUserPresenter.this.copydefault();
            ArrayList arrayList = new ArrayList(value);
            if (signalBotSubsInfoListBean == null || (listAhwBna = signalBotSubsInfoListBean.getSignals()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            arrayList.addAll(listAhwBna);
            tradeLiveDataCopydefault.setValue(arrayList);
            TradeLiveData<Boolean> tradeLiveDataOLrzqt = SignalBotLeadUserPresenter.this.OLrzqt();
            String totalCount = signalBotSubsInfoListBean != null ? signalBotSubsInfoListBean.getTotalCount() : null;
            List<SignalBotSubsInfoBean> value2 = SignalBotLeadUserPresenter.this.copydefault().getValue();
            tradeLiveDataOLrzqt.setValue(Boolean.valueOf(C33129mqd.AEQbTJ(totalCount, value2 != null ? Integer.valueOf(value2.size()) : null)));
            return signalBotSubsInfoListBean;
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.KWHzl);
    }

    public static /* synthetic */ void loadData$default(SignalBotLeadUserPresenter signalBotLeadUserPresenter, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        signalBotLeadUserPresenter.KWHzl(str, z);
    }

    public final void KWHzl(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.OLrzqt = "0";
        }
        OLrzqt(str);
    }

    public final String KWHzl() {
        return C56002xub.KWHzl.AEQbTJ() ? "subscription,profit_sharing,free" : "profit_sharing,free";
    }
}
