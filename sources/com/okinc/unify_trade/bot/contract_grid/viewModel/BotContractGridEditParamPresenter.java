package com.okinc.unify_trade.bot.contract_grid.viewModel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.MinTopUpResp;
import com.okinc.unify_trade.biz.SpotGridEditParamReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54531xLw;
import o.C33129mqd;
import o.C54308xDp;
import o.C54506xKy;
import o.C54589xNz;
import o.C55804xqp;
import o.C56033xvF;
import o.C56187xyA;
import o.InterfaceC54501xKt;
import o.InterfaceC54581xNr;
import o.xKK;
import o.xMR;
import o.xMS;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BotContractGridEditParamPresenter extends AbsPresenter {
    public final TradeLiveData<MinTopUpResp> AEQbTJ;
    public final TradeLiveData<String> EZpvd;
    public final C54308xDp KWHzl;
    public final C56187xyA OLrzqt;
    public TacticsData copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<MinTopUpResp> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56187xyA KWHzl() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotContractGridEditParamPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = new C56187xyA();
        this.AEQbTJ = new TradeLiveData<>();
        this.EZpvd = new TradeLiveData<>();
        this.KWHzl = new C54308xDp();
    }

    public final void EZpvd(TacticsData tacticsData) {
        this.copydefault = tacticsData;
        djBIcL();
    }

    public final String AEQbTJ() {
        String instType;
        String instFamily;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null) {
            return "";
        }
        TacticsData tacticsData = this.copydefault;
        if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsData2 = this.copydefault;
        BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, instType, tacticsData2 != null ? tacticsData2.getInstId() : null, null, null, 12, null);
        return (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) ? "" : instFamily;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int copydefault() {
        String quoteDig;
        String instType;
        IdxConfig idxConfigAkhnZx;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null) {
            quoteDig = null;
        } else {
            TacticsData tacticsData = this.copydefault;
            if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null && (idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(AEQbTJ())) != null) {
                quoteDig = idxConfigAkhnZx.getQuoteDig();
            }
        }
        String strGEmmrt = C33129mqd.gEmmrt(8);
        if (quoteDig == null || quoteDig.length() == 0) {
            quoteDig = strGEmmrt;
        }
        return C33129mqd.AhwBna(quoteDig);
    }

    public final String valueOf() {
        String instType;
        String instId;
        TacticsData tacticsData = this.copydefault;
        String str = "";
        if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsData2 = this.copydefault;
        if (tacticsData2 != null && (instId = tacticsData2.getInstId()) != null) {
            str = instId;
        }
        return C56033xvF.AEQbTJ(instType, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OLrzqt() {
        String strFIwbmz;
        String instType;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null) {
            strFIwbmz = null;
        } else {
            TacticsData tacticsData = this.copydefault;
            if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(AEQbTJ());
            }
        }
        return C33129mqd.AhwBna(strFIwbmz);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C56187xyA c56187xyA = this.OLrzqt;
        TacticsData tacticsData = this.copydefault;
        c56187xyA.OLrzqt(new SpotGridEditParamReq(tacticsData != null ? tacticsData.getAlgoId() : null, str, str2, str3, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1008, (DefaultConstructorMarker) null));
        c56187xyA.djBIcL();
        c56187xyA.OLrzqt(this.AEQbTJ, new C54506xKy());
        xKK.Activity.execute$default(c56187xyA, 0L, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void djBIcL() {
        xMS xmsGEmmrt;
        String instId;
        String instType;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        String str = "";
        if (interfaceC54581xNrOLrzqt == null) {
            xmsGEmmrt = null;
        } else {
            TacticsData tacticsData = this.copydefault;
            if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(AEQbTJ());
            }
        }
        C54308xDp c54308xDp = this.KWHzl;
        TacticsData tacticsData2 = this.copydefault;
        if (tacticsData2 != null && (instId = tacticsData2.getInstId()) != null) {
            str = instId;
        }
        c54308xDp.KWHzl(str);
        c54308xDp.OLrzqt(this.EZpvd, new TaskDescription(xmsGEmmrt));
        xKK.Activity.execute$default(c54308xDp, 0L, 1, null);
    }

    public static final class TaskDescription implements InterfaceC54501xKt<C55804xqp<List<? extends TickersData>>, String> {
        public final /* synthetic */ xMS KWHzl;

        public TaskDescription(xMS xms) {
            this.KWHzl = xms;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public String KWHzl(C55804xqp<List<TickersData>> c55804xqp) {
            String strAhwBna;
            String str = "";
            Intrinsics.checkNotNullParameter(c55804xqp, "");
            TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(c55804xqp.copydefault());
            if (tickersData != null) {
                xMS xms = this.KWHzl;
                xMR xmr = xMR.copydefault;
                if (xms != null && (strAhwBna = xms.AhwBna(tickersData.getLast())) != null) {
                    str = strAhwBna;
                }
                String strAEQbTJ = xmr.AEQbTJ(str, C33129mqd.AhwBna(xms != null ? xms.AEQbTJ() : null));
                if (strAEQbTJ != null) {
                    return strAEQbTJ;
                }
            }
            return "--";
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.OLrzqt, this.KWHzl);
    }
}
