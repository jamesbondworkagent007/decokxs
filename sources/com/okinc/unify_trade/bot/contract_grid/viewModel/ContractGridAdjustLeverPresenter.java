package com.okinc.unify_trade.bot.contract_grid.viewModel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.LeverIntervalData;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C54589xNz;
import o.C55774xqL;
import o.C56246xzG;
import o.InterfaceC54581xNr;
import o.pUU;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ContractGridAdjustLeverPresenter extends AbsPresenter {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final TradeLiveData<C55774xqL> EZpvd;
    public final C56246xzG OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C55774xqL> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56246xzG copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractGridAdjustLeverPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new TradeLiveData<>(new C55774xqL(null, null, null, 7, null));
        this.OLrzqt = new C56246xzG();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.contract_grid.viewModel.ContractGridAdjustLeverPresenter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2) {
        String instFamily;
        String marginSymbol;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
        C56246xzG c56246xzG = this.OLrzqt;
        c56246xzG.OLrzqt(str2, "cross", str, (suggestedInstrument$default == null || (marginSymbol = suggestedInstrument$default.getMarginSymbol()) == null) ? "" : marginSymbol, (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) ? "" : instFamily);
        c56246xzG.EZpvd("contract_grid", str);
        c56246xzG.fIwbmz();
    }

    public final void copydefault(@NotNull Pair<String, ? extends Object> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        String first = pair.getFirst();
        if (Intrinsics.EZpvd((Object) first, (Object) this.OLrzqt.EZpvd())) {
            AEQbTJ(pair.getSecond());
        } else if (Intrinsics.EZpvd((Object) first, (Object) this.OLrzqt.AEQbTJ())) {
            OLrzqt(pair.getSecond());
        } else {
            pUU.EZpvd("ContractGridAdjustLeverPresenter", "do not need to handle any !!!");
        }
    }

    public final void AEQbTJ(Object obj) {
        String minLever;
        String maxLever;
        String leveragePercents;
        Intrinsics.copydefault(obj, "");
        StrategyConfigInfo strategyConfigInfo = (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull((ArrayList) obj);
        String maxLever2 = strategyConfigInfo != null ? strategyConfigInfo.getMaxLever() : null;
        C55774xqL value = this.EZpvd.getValue();
        if (C33129mqd.gEmmrt(maxLever2, value != null ? value.AEQbTJ() : null)) {
            TradeLiveData<C55774xqL> tradeLiveData = this.EZpvd;
            if (strategyConfigInfo == null || (minLever = strategyConfigInfo.getMinLever()) == null) {
                minLever = "0.01";
            }
            if (strategyConfigInfo == null || (maxLever = strategyConfigInfo.getMaxLever()) == null) {
                maxLever = "50";
            }
            if (strategyConfigInfo == null || (leveragePercents = strategyConfigInfo.getLeveragePercents()) == null) {
                leveragePercents = "1,2,3,5,10,20,30,50";
            }
            tradeLiveData.setValue(new C55774xqL(minLever, maxLever, leveragePercents));
        }
    }

    public final void OLrzqt(Object obj) {
        String minLevel;
        String maxLevel;
        String percents;
        Intrinsics.copydefault(obj, "");
        LeverIntervalData leverIntervalData = (LeverIntervalData) CollectionsKt___CollectionsKt.firstOrNull((ArrayList) obj);
        String maxLevel2 = leverIntervalData != null ? leverIntervalData.getMaxLevel() : null;
        C55774xqL value = this.EZpvd.getValue();
        if (C33129mqd.gEmmrt(maxLevel2, value != null ? value.AEQbTJ() : null)) {
            TradeLiveData<C55774xqL> tradeLiveData = this.EZpvd;
            if (leverIntervalData == null || (minLevel = leverIntervalData.getMinLevel()) == null) {
                minLevel = "0.01";
            }
            if (leverIntervalData == null || (maxLevel = leverIntervalData.getMaxLevel()) == null) {
                maxLevel = "50";
            }
            if (leverIntervalData == null || (percents = leverIntervalData.getPercents()) == null) {
                percents = "1,2,3,5,10,20,30,50";
            }
            tradeLiveData.setValue(new C55774xqL(minLevel, maxLevel, percents));
        }
    }

    public final boolean OLrzqt(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return (C33129mqd.gEmmrt(str, str2) || C33129mqd.AEQbTJ(str, str3)) ? false : true;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return this.OLrzqt.values();
    }
}
