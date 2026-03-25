package com.okinc.unify_trade.bot.signalbot.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.ContractGridClosePositionData;
import com.okinc.unify_trade.biz.ContractGridClosePositionReq;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54298xDf;
import o.C54305xDm;
import o.C55969xtv;
import o.C56111xwe;
import o.pUU;
import o.xDL;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalBotPositionPresenter extends AbsPresenter {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final C54298xDf AEQbTJ;
    public final TradeLiveData<ArrayList<DetailsData>> AhwBna;
    public final xDL EZpvd;
    public final C56111xwe<List<ContractGridClosePositionData>> KWHzl;
    public final HashMap<String, C54305xDm> copydefault;
    public final TradeLiveData<ArrayList<DetailsData>> djBIcL;
    public StrategyDetailsResponse gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDL AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54298xDf EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ArrayList<DetailsData>> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(StrategyDetailsResponse strategyDetailsResponse) {
        this.gEmmrt = strategyDetailsResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<ContractGridClosePositionData>> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ArrayList<DetailsData>> copydefault() {
        return this.AhwBna;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotPositionPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AEQbTJ = new C54298xDf();
        this.djBIcL = new TradeLiveData<>();
        this.copydefault = new HashMap<>();
        this.AhwBna = new TradeLiveData<>();
        this.EZpvd = new xDL();
        this.KWHzl = new C56111xwe<>();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotPositionPresenter.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void AYXKKw() {
        String algoId;
        C54298xDf c54298xDf = this.AEQbTJ;
        TradeLiveData<ArrayList<DetailsData>> tradeLiveData = this.djBIcL;
        C55969xtv c55969xtv = new C55969xtv();
        c55969xtv.OLrzqt(this.gEmmrt);
        Unit unit = Unit.INSTANCE;
        c54298xDf.OLrzqt(tradeLiveData, c55969xtv);
        StrategyDetailsResponse strategyDetailsResponse = this.gEmmrt;
        if (strategyDetailsResponse == null || (algoId = strategyDetailsResponse.getAlgoId()) == null) {
            algoId = "";
        }
        c54298xDf.AEQbTJ(algoId);
        xKK.Activity.execute$default(c54298xDf, 0L, 1, null);
    }

    public final void copydefault(int i, @NotNull DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(detailsData, "");
        C54305xDm c54305xDm = this.copydefault.get(detailsData.getInstId());
        if (c54305xDm != null && !c54305xDm.isConnected()) {
            pUU.KWHzl("SignalBotPositionPresenter", "request position(" + i + ") " + detailsData.getInstId() + " cancel, use case exists!");
            return;
        }
        pUU.KWHzl("SignalBotPositionPresenter", "request position(" + i + ") " + detailsData.getInstId() + " now!");
        C54305xDm c54305xDm2 = new C54305xDm();
        this.copydefault.put(detailsData.getInstId(), c54305xDm2);
        TradeLiveData<ArrayList<DetailsData>> tradeLiveData = this.AhwBna;
        C55969xtv c55969xtv = new C55969xtv();
        c55969xtv.OLrzqt(this.gEmmrt);
        Unit unit = Unit.INSTANCE;
        c54305xDm2.OLrzqt(tradeLiveData, c55969xtv);
        c54305xDm2.AEQbTJ(detailsData.getAlgoId());
        c54305xDm2.EZpvd(detailsData.getInstType());
        c54305xDm2.OLrzqt(detailsData.getInstId());
        xKK.Activity.execute$default(c54305xDm2, 0L, 1, null);
    }

    public final void OLrzqt(int i, @NotNull DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(detailsData, "");
        C54305xDm c54305xDm = this.copydefault.get(detailsData.getInstId());
        if (c54305xDm != null) {
            pUU.KWHzl("SignalBotPositionPresenter", "dispose single position(" + i + ") " + detailsData.getInstId() + " cause it's gone!");
            c54305xDm.AYXKKw();
            this.copydefault.remove(detailsData.getInstId());
        }
    }

    public final void copydefault(@NotNull DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(detailsData, "");
        xDL xdl = this.EZpvd;
        xdl.AEQbTJ(this.KWHzl);
        xdl.OLrzqt(new ContractGridClosePositionReq(detailsData.getAlgoId(), detailsData.getInstId(), (String) null, (String) null, Boolean.TRUE, 12, (DefaultConstructorMarker) null));
        xKK.Activity.execute$default(xdl, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        ArrayList arrayListCopydefault = yDY.copydefault(this.AEQbTJ, this.EZpvd);
        Collection<C54305xDm> collectionValues = this.copydefault.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        arrayListCopydefault.addAll(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues));
        return arrayListCopydefault;
    }
}
