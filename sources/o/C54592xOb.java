package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.InstConfigInfo;
import com.okinc.unify_trade.biz.InstListData;
import com.okinc.unify_trade.biz.MarginModeInitConfigData;
import com.okinc.unify_trade.manager.MarginModeManager;
import com.okinc.unify_trade.trade.core.init.InitStatus;
import com.okinc.unify_trade.trade.core.init.MarginConfigProvider$asyncWriteSPTask$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.InterfaceC54581xNr;
import o.xKK;

/* JADX INFO: renamed from: o.xOb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54592xOb extends xNW {
    public InstConfigInfo AEQbTJ;
    public java.util.ArrayList<java.lang.String> OLrzqt;
    public Job copydefault;
    public final C56167xxh AYXKKw = new C56167xxh();
    public final C56165xxf EZpvd = new C56165xxf();
    public final xDH AhwBna = new xDH();
    public MarginModeManager KWHzl = new MarginModeManager();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarginModeManager AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.xNW
    public boolean AhwBna() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xNW
    public java.lang.String EZpvd() {
        return "MarginConfigProvider";
    }

    @Override // o.xNW
    public boolean bE_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    @Override // o.xNW
    public void gEmmrt() {
        final xKL<java.util.ArrayList<InstConfigInfo>> xklUzCIH = uzCIH();
        xklUzCIH.AYXKKw();
        xklUzCIH.KWHzl(new Function1() { // from class: o.xOd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54592xOb.OLrzqt(this.KWHzl, xklUzCIH, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xklUzCIH, 0L, 1, null);
    }

    public static final Unit OLrzqt(C54592xOb c54592xOb, xKL xkl, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.String strFJNWhG = c54592xOb.fJNWhG();
        java.lang.String strEZpvd = c54592xOb.EZpvd();
        boolean z = responseData.getCode() == 0 && responseData.getData() != null;
        java.lang.String msg = (responseData.getCode() != 0 || responseData.getData() == null) ? responseData.getMsg() : "";
        pUU.KWHzl(strFJNWhG, "task " + strEZpvd + " loadHttp syncMarginMode:" + z + ";" + msg + (java.lang.System.currentTimeMillis() - c54592xOb.AuCTel()));
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) responseData.getData();
            c54592xOb.AEQbTJ = arrayList != null ? (InstConfigInfo) arrayList.get(0) : null;
            java.util.ArrayList arrayList2 = (java.util.ArrayList) responseData.getData();
            c54592xOb.EZpvd(arrayList2 != null ? (InstConfigInfo) arrayList2.get(0) : null);
            java.util.ArrayList arrayList3 = (java.util.ArrayList) responseData.getData();
            c54592xOb.KWHzl(arrayList3 != null ? (InstConfigInfo) arrayList3.get(0) : null);
            xNW.notifyResult$default(c54592xOb, true, null, 2, null);
        } else {
            pUU.KWHzl(c54592xOb.fJNWhG(), c54592xOb.EZpvd() + " failed, isDowngrade = " + c54592xOb.bE_() + ", 降级处理");
            c54592xOb.AEQbTJ(false, c54592xOb.AEQbTJ(xkl.AhwBna().getValue()));
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(InstConfigInfo instConfigInfo) {
        xOW newProxyInstance;
        if (instConfigInfo != null) {
            AEQbTJ().copydefault().clear();
            if (instConfigInfo.getSpotCopyInstSwitchConfig().getCloseSwitchList().isEmpty() && instConfigInfo.getInstMarginModeConfigs().isEmpty()) {
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                if (c54589xNz.OLrzqt() == null) {
                    return;
                }
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                copydefault(java.lang.String.valueOf((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM()), MarginModeManager.getAllLocalMarginMode$default(AEQbTJ(), C43246rlf.OLrzqt.valueOf(), null, 2, null));
                return;
            }
            if (C54589xNz.EZpvd.OLrzqt() == null) {
                return;
            }
            MarginModeManager.saveInstMarginModeConfigsListToMemoryCache$default(AEQbTJ(), instConfigInfo.getInstMarginModeConfigs(), null, 2, null);
            OLrzqt(instConfigInfo);
        }
    }

    public final void KWHzl(InstConfigInfo instConfigInfo) {
        if (instConfigInfo != null) {
            java.util.ArrayList<java.lang.String> closeSwitchList = instConfigInfo.getSpotCopyInstSwitchConfig().getCloseSwitchList();
            this.OLrzqt = closeSwitchList;
            xVL.EZpvd.OLrzqt(closeSwitchList);
        }
    }

    public final void copydefault(java.lang.String str, java.util.ArrayList<InstListData> arrayList) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if ((interfaceC54581xNrCopydefault == null || !InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrCopydefault, null, 1, null)) && arrayList != null) {
            if (arrayList.isEmpty()) {
                pUU.KWHzl(fJNWhG(), "UpdateMarginModeInitConfigUseCase, local not existed!");
                return;
            }
            MarginModeInitConfigData marginModeInitConfigData = new MarginModeInitConfigData(str, arrayList);
            xDH xdh = this.AhwBna;
            xdh.AEQbTJ(marginModeInitConfigData);
            xdh.KWHzl(new Function1() { // from class: o.xOe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54592xOb.EZpvd(this.OLrzqt, (ResponseData) obj);
                }
            });
            xKK.Activity.execute$default(xdh, 0L, 1, null);
        }
    }

    public final void OLrzqt(InstConfigInfo instConfigInfo) {
        Job job = this.copydefault;
        if (job == null || !job.isActive()) {
            Job job2 = this.copydefault;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
            }
            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(C54585xNv.KWHzl.gEmmrt())), null, null, new MarginConfigProvider$asyncWriteSPTask$1(this, instConfigInfo, null), 3, null);
            jobLaunch$default.invokeOnCompletion(new Function1() { // from class: o.xOf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54592xOb.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            });
            this.copydefault = jobLaunch$default;
        }
    }

    public static final Unit OLrzqt(C54592xOb c54592xOb, java.lang.Throwable th) {
        if (th != null) {
            pUU.copydefault(c54592xOb.fJNWhG(), "asyncWriteSPTask-exception = " + th.getMessage());
        }
        return Unit.INSTANCE;
    }

    @Override // o.xNW
    public void valueOf() {
        super.valueOf();
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    @Override // o.xNW
    public java.util.List<xKK> djBIcL() {
        return yDY.copydefault(this.AYXKKw, this.EZpvd, this.AhwBna);
    }

    public final void OLrzqt() {
        if (ejfBZ().get() == InitStatus.SUCCESS) {
            MarginModeManager marginModeManagerAEQbTJ = AEQbTJ();
            InstConfigInfo instConfigInfo = this.AEQbTJ;
            MarginModeManager.saveInstMarginModeConfigsListToMemoryCache$default(marginModeManagerAEQbTJ, instConfigInfo != null ? instConfigInfo.getInstMarginModeConfigs() : null, null, 2, null);
            OLrzqt(this.AEQbTJ);
        }
    }

    private final xKL<java.util.ArrayList<InstConfigInfo>> uzCIH() {
        return hDKMBd() ? this.EZpvd : this.AYXKKw;
    }

    public static final Unit EZpvd(C54592xOb c54592xOb, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0) {
            pUU.copydefault(c54592xOb.fJNWhG(), "UpdateMarginModeInitConfigUseCase:" + (responseData.getCode() == 0) + ";" + (responseData.getCode() != 0 ? responseData.getDetailMsg() : ""));
        }
        return Unit.INSTANCE;
    }
}
