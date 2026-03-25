package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbitrageListSorter;
import com.okinc.uilab.view.OKSortTextView;
import com.okinc.unify_trade.biz.FundingRateArbCoin;
import com.okinc.unify_trade.biz.FundingRateArbResult;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AbstractC56429yFa;
import o.C52894wbI;
import o.C54589xNz;
import o.C54799xVt;
import o.C56195xyI;
import o.C56402yEa;
import o.InterfaceC54501xKt;
import o.InterfaceC54581xNr;
import o.xKK;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbitrageSelectCoinPresenter extends AbsPresenter {
    public List<FundingRateArbCoin> AEQbTJ;
    public List<FundingRateArbCoin> AYXKKw;
    public final TradeLiveData<List<C52894wbI>> EZpvd;
    public final C56195xyI KWHzl;
    public final SmartArbitrageListSorter OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull List<FundingRateArbCoin> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingRateArbCoin> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<C52894wbI>> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56195xyI copydefault() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public SmartArbitrageSelectCoinPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = new SmartArbitrageListSorter();
        this.KWHzl = new C56195xyI();
        this.EZpvd = new TradeLiveData<>();
        this.AEQbTJ = yDY.AhwBna();
        this.AYXKKw = yDY.AhwBna();
    }

    public static final class Activity extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public Activity(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            th.printStackTrace();
        }
    }

    public static final class Application extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public Application(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            th.printStackTrace();
        }
    }

    public final void AEQbTJ() {
        C56195xyI c56195xyI = this.KWHzl;
        c56195xyI.EZpvd("manual");
        c56195xyI.AEQbTJ("USDT");
        c56195xyI.OLrzqt(this.EZpvd, new TaskDescription());
        xKK.Activity.execute$default(c56195xyI, 0L, 1, null);
    }

    public static final class TaskDescription implements InterfaceC54501xKt<List<? extends FundingRateArbResult>, List<? extends C52894wbI>> {
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public List<C52894wbI> KWHzl(List<FundingRateArbResult> list) {
            List<FundingRateArbCoin> coins;
            TradeCoinInfo tradeCoinInfoOLrzqt;
            Intrinsics.checkNotNullParameter(list, "");
            SmartArbitrageSelectCoinPresenter smartArbitrageSelectCoinPresenter = SmartArbitrageSelectCoinPresenter.this;
            FundingRateArbResult fundingRateArbResult = (FundingRateArbResult) CollectionsKt___CollectionsKt.firstOrNull(list);
            List<FundingRateArbCoin> listAhwBna = null;
            if (fundingRateArbResult != null && (coins = fundingRateArbResult.getCoins()) != null) {
                ArrayList arrayList = new ArrayList();
                for (FundingRateArbCoin fundingRateArbCoin : coins) {
                    fundingRateArbCoin.setPrimary(fundingRateArbCoin.getCcy());
                    String ccy = fundingRateArbCoin.getCcy();
                    fundingRateArbCoin.setSecondary((ccy == null || (tradeCoinInfoOLrzqt = C54799xVt.AEQbTJ.OLrzqt(ccy)) == null) ? null : tradeCoinInfoOLrzqt.getName());
                    arrayList.add(fundingRateArbCoin);
                }
                listAhwBna = arrayList;
            }
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            smartArbitrageSelectCoinPresenter.EZpvd(listAhwBna);
            SmartArbitrageSelectCoinPresenter smartArbitrageSelectCoinPresenter2 = SmartArbitrageSelectCoinPresenter.this;
            List<FundingRateArbCoin> listKWHzl = smartArbitrageSelectCoinPresenter2.KWHzl();
            SmartArbitrageSelectCoinPresenter smartArbitrageSelectCoinPresenter3 = SmartArbitrageSelectCoinPresenter.this;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listKWHzl) {
                if (!smartArbitrageSelectCoinPresenter3.KWHzl((FundingRateArbCoin) obj)) {
                    arrayList2.add(obj);
                }
            }
            smartArbitrageSelectCoinPresenter2.AYXKKw = arrayList2;
            SmartArbitrageSelectCoinPresenter.this.OLrzqt.copydefault(SmartArbitrageSelectCoinPresenter.this.AYXKKw);
            return SmartArbitrageSelectCoinPresenter.this.OLrzqt.EZpvd("", OKSortTextView.SortType.UP, "3d", SmartArbitrageListSorter.SortingCriterion.NextApy);
        }
    }

    public final void copydefault(@NotNull String str, @NotNull OKSortTextView.SortType sortType, @NotNull String str2, @NotNull SmartArbitrageListSorter.SortingCriterion sortingCriterion) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(sortingCriterion, "");
        if (this.KWHzl.AhwBna().getValue() != null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.copydefault.plus(new Activity(CoroutineExceptionHandler.Key)), null, new SmartArbitrageSelectCoinPresenter$search$2(this, str, sortType, str2, sortingCriterion, null), 2, null);
    }

    public final FundingRateArbCoin KWHzl(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = this.AEQbTJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((FundingRateArbCoin) next).getInstId(), (Object) str)) {
                break;
            }
        }
        return (FundingRateArbCoin) next;
    }

    public final void AEQbTJ(@NotNull OKSortTextView.SortType sortType, @NotNull String str, @NotNull SmartArbitrageListSorter.SortingCriterion sortingCriterion) {
        Intrinsics.checkNotNullParameter(sortType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sortingCriterion, "");
        if (this.KWHzl.AhwBna().getValue() != null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.copydefault.plus(new Application(CoroutineExceptionHandler.Key)), null, new SmartArbitrageSelectCoinPresenter$sortBy$2(this, sortType, str, sortingCriterion, null), 2, null);
    }

    public final boolean KWHzl(FundingRateArbCoin fundingRateArbCoin) {
        return !OLrzqt(fundingRateArbCoin.getInstId());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OLrzqt(String str) {
        boolean z;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null) {
            z = false;
        } else {
            if (str == null) {
                str = "";
            }
            if (!interfaceC54581xNrCopydefault.OLrzqt(str, "SWAP")) {
                z = true;
            }
        }
        return !z;
    }

    public final boolean EZpvd(FundingRateArbCoin fundingRateArbCoin) {
        return !copydefault(fundingRateArbCoin.getInstId());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean copydefault(String str) {
        boolean z;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null) {
            z = false;
        } else {
            if (str == null) {
                str = "";
            }
            if (!interfaceC54581xNrCopydefault.AEQbTJ(str, "SWAP")) {
                z = true;
            }
        }
        return !z;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.KWHzl);
    }
}
