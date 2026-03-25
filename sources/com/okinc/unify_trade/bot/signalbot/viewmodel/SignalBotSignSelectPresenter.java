package com.okinc.unify_trade.bot.signalbot.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.InstTierItem;
import com.okinc.unify_trade.biz.SignalDetails;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.SignalListResult;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33070mpX;
import o.C33129mqd;
import o.C55298xhM;
import o.C55688xof;
import o.C55845xrd;
import o.C56193xyG;
import o.C56278xzm;
import o.InterfaceC54501xKt;
import o.pUU;
import o.xAU;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalBotSignSelectPresenter extends AbsPresenter {
    public final C56278xzm AEQbTJ;
    public final List<Object> AYXKKw;
    public final TradeLiveData<List<SignalListItem>> EZpvd;
    public final xAU KWHzl;
    public final C56193xyG OLrzqt;
    public final TradeLiveData<List<String>> copydefault;
    public boolean djBIcL;
    public String gEmmrt;
    public String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<SignalListItem>> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<String>> KWHzl() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotSignSelectPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new xAU();
        this.EZpvd = new TradeLiveData<>();
        this.AEQbTJ = new C56278xzm();
        this.OLrzqt = new C56193xyG();
        this.copydefault = new TradeLiveData<>();
        this.AYXKKw = new ArrayList();
        this.gEmmrt = "1";
        this.valueOf = "10";
    }

    public static /* synthetic */ void fetchSignList$default(SignalBotSignSelectPresenter signalBotSignSelectPresenter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = signalBotSignSelectPresenter.djBIcL;
        }
        signalBotSignSelectPresenter.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        this.gEmmrt = "1";
        this.djBIcL = z;
        this.AYXKKw.clear();
        copydefault();
    }

    public final void OLrzqt() {
        this.gEmmrt = C33129mqd.addS$default(this.gEmmrt, 1, null, null, null, 14, null);
        copydefault();
    }

    public final void copydefault() {
        xAU xau = this.KWHzl;
        xau.copydefault(this.djBIcL ? "created" : "", this.gEmmrt, this.valueOf);
        xau.djBIcL();
        xau.OLrzqt(this.EZpvd, new TaskDescription());
        xKK.Activity.execute$default(xau, 0L, 1, null);
    }

    public static final class TaskDescription implements InterfaceC54501xKt<List<? extends SignalListResult>, List<? extends SignalListItem>> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public List<SignalListItem> KWHzl(List<SignalListResult> list) {
            List<SignalListItem> listAhwBna;
            Intrinsics.checkNotNullParameter(list, "");
            SignalListResult signalListResult = (SignalListResult) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (signalListResult == null || (listAhwBna = signalListResult.getSignals()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            pUU.valueOf("BotCheckLog", "/trade/signal-size:" + listAhwBna.size());
            return listAhwBna;
        }
    }

    public final List<Object> AEQbTJ() {
        if (this.AYXKKw.isEmpty()) {
            this.AYXKKw.add(new C55845xrd(this.djBIcL));
        }
        List<Object> list = this.AYXKKw;
        List<SignalListItem> value = this.EZpvd.getValue();
        if (value == null) {
            value = yDY.AhwBna();
        }
        list.addAll(value);
        if (C33129mqd.valueOf(Integer.valueOf(this.AYXKKw.size()), 1)) {
            this.AYXKKw.add(new CommonEmptyData(null, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), null, 6, C55298xhM.dp2px$default(40.0f, null, 1, null), false, false, 0, 0, 485, null));
        }
        pUU.valueOf("BotCheckLog", "buildSignList-size:" + this.AYXKKw.size());
        return this.AYXKKw;
    }

    public final void EZpvd(@NotNull SignalListItem signalListItem) {
        Intrinsics.checkNotNullParameter(signalListItem, "");
        if (Intrinsics.EZpvd((Object) signalListItem.getTickType(), (Object) "1")) {
            C56193xyG c56193xyG = this.OLrzqt;
            c56193xyG.copydefault("SWAP");
            c56193xyG.OLrzqt(this.copydefault, new StateListAnimator());
            xKK.Activity.execute$default(c56193xyG, 0L, 1, null);
            return;
        }
        C56278xzm c56278xzm = this.AEQbTJ;
        String signalChanId = signalListItem.getSignalChanId();
        c56278xzm.OLrzqt(signalChanId != null ? signalChanId : "");
        c56278xzm.djBIcL();
        c56278xzm.OLrzqt(this.copydefault, new Activity());
        xKK.Activity.execute$default(c56278xzm, 0L, 1, null);
    }

    public static final class Activity implements InterfaceC54501xKt<List<? extends SignalDetails>, List<? extends String>> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public List<String> KWHzl(List<SignalDetails> list) {
            String instIds;
            List<String> listSplit$default;
            Intrinsics.checkNotNullParameter(list, "");
            SignalDetails signalDetails = (SignalDetails) CollectionsKt___CollectionsKt.firstOrNull(list);
            return (signalDetails == null || (instIds = signalDetails.getInstIds()) == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) instIds, new String[]{","}, false, 0, 6, (Object) null)) == null) ? yDY.AhwBna() : listSplit$default;
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.KWHzl, this.AEQbTJ, this.OLrzqt);
    }

    public static final class StateListAnimator implements InterfaceC54501xKt<List<? extends InstTierItem>, List<? extends String>> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public List<String> KWHzl(List<InstTierItem> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String instId = ((InstTierItem) it.next()).getInstId();
                if (instId != null) {
                    arrayList.add(instId);
                }
            }
            return arrayList;
        }
    }
}
