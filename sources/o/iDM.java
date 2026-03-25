package o;

import com.okinc.business.invest_biz.data.bean.request.DashboardTokenDetailReq;
import com.okinc.business.invest_biz.data.bean.response.DashboardTokenListResponse;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.DashboardRepositoryImpl$getBatchProtocolDetails$1;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.DashboardRepositoryImpl$getBatchProtocolDetails$2;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.DashboardRepositoryImpl$getDashboardTokenList$1;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.DashboardRepositoryImpl$getDashboardTokenList$2;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.DashboardRepositoryImpl$getDeFiDashboard$1;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.DashboardRepositoryImpl$getDeFiDashboard$2;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.DashboardRepositoryImpl$getMainWallet$1;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.DashboardRepositoryImpl$getMainWallet$2;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.DashboardRepositoryImpl$getProtocolDetails$1;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.DashboardRepositoryImpl$getProtocolDetails$2;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.DashboardRepositoryImpl$getTokenListDetail$1;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.DashboardRepositoryImpl$getTokenListDetail$2;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.DashboardRepositoryImpl$triggerProtocolsRefresh$1;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.DashboardRepositoryImpl$triggerProtocolsRefresh$2;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.ProtocolDetailsParams;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.ProtocolParams;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDM implements iDL {
    public final CoroutineDispatcher AEQbTJ;
    public final iDT AYXKKw;
    public final C23657iEm AhwBna;
    public final CoroutineScope EZpvd;
    public final CompletableJob KWHzl;
    public final InterfaceC23589iBz OLrzqt;
    public final iDW copydefault;
    public final iDJ djBIcL;
    public final C23580iBq valueOf;

    public iDM(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull C23580iBq c23580iBq, @NotNull iDW idw, @NotNull C23657iEm c23657iEm, @NotNull iDT idt, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull iDJ idj) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(c23580iBq, "");
        Intrinsics.checkNotNullParameter(idw, "");
        Intrinsics.checkNotNullParameter(c23657iEm, "");
        Intrinsics.checkNotNullParameter(idt, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(idj, "");
        this.OLrzqt = interfaceC23589iBz;
        this.valueOf = c23580iBq;
        this.copydefault = idw;
        this.AhwBna = c23657iEm;
        this.AYXKKw = idt;
        this.AEQbTJ = coroutineDispatcher;
        this.djBIcL = idj;
        CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null);
        this.KWHzl = completableJobSupervisorJob$default;
        this.EZpvd = CoroutineScopeKt.CoroutineScope(completableJobSupervisorJob$default.plus(coroutineDispatcher));
    }

    public final java.lang.String AEQbTJ() {
        return this.valueOf.copydefault();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yCM
    public iDM(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull iDW idw, @NotNull C23657iEm c23657iEm, @NotNull iDT idt, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull iDJ idj) {
        this(interfaceC23589iBz, C23580iBq.AEQbTJ, idw, c23657iEm, idt, coroutineDispatcher, idj);
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(idw, "");
        Intrinsics.checkNotNullParameter(c23657iEm, "");
        Intrinsics.checkNotNullParameter(idt, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(idj, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        DashboardRepositoryImpl$triggerProtocolsRefresh$1 dashboardRepositoryImpl$triggerProtocolsRefresh$1;
        if (continuation instanceof DashboardRepositoryImpl$triggerProtocolsRefresh$1) {
            dashboardRepositoryImpl$triggerProtocolsRefresh$1 = (DashboardRepositoryImpl$triggerProtocolsRefresh$1) continuation;
            int i = dashboardRepositoryImpl$triggerProtocolsRefresh$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dashboardRepositoryImpl$triggerProtocolsRefresh$1.label = i - Integer.MIN_VALUE;
            } else {
                dashboardRepositoryImpl$triggerProtocolsRefresh$1 = new DashboardRepositoryImpl$triggerProtocolsRefresh$1(this, continuation);
            }
        }
        java.lang.Object obj = dashboardRepositoryImpl$triggerProtocolsRefresh$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dashboardRepositoryImpl$triggerProtocolsRefresh$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
        DashboardRepositoryImpl$triggerProtocolsRefresh$2 dashboardRepositoryImpl$triggerProtocolsRefresh$2 = new DashboardRepositoryImpl$triggerProtocolsRefresh$2(this, null);
        dashboardRepositoryImpl$triggerProtocolsRefresh$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, dashboardRepositoryImpl$triggerProtocolsRefresh$2, dashboardRepositoryImpl$triggerProtocolsRefresh$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(long j, @NotNull Continuation<? super Result<C23666iEv>> continuation) {
        DashboardRepositoryImpl$getDeFiDashboard$1 dashboardRepositoryImpl$getDeFiDashboard$1;
        iDM idm;
        long j2;
        if (continuation instanceof DashboardRepositoryImpl$getDeFiDashboard$1) {
            dashboardRepositoryImpl$getDeFiDashboard$1 = (DashboardRepositoryImpl$getDeFiDashboard$1) continuation;
            int i = dashboardRepositoryImpl$getDeFiDashboard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dashboardRepositoryImpl$getDeFiDashboard$1.label = i - Integer.MIN_VALUE;
            } else {
                dashboardRepositoryImpl$getDeFiDashboard$1 = new DashboardRepositoryImpl$getDeFiDashboard$1(this, continuation);
            }
        }
        java.lang.Object obj = dashboardRepositoryImpl$getDeFiDashboard$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dashboardRepositoryImpl$getDeFiDashboard$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            JobKt__JobKt.cancelChildren$default((Job) this.KWHzl, (CancellationException) null, 1, (java.lang.Object) null);
            iDJ idj = this.djBIcL;
            dashboardRepositoryImpl$getDeFiDashboard$1.L$0 = this;
            dashboardRepositoryImpl$getDeFiDashboard$1.J$0 = j;
            dashboardRepositoryImpl$getDeFiDashboard$1.label = 1;
            if (idj.KWHzl(dashboardRepositoryImpl$getDeFiDashboard$1) == objCopydefault) {
                return objCopydefault;
            }
            idm = this;
            j2 = j;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            long j3 = dashboardRepositoryImpl$getDeFiDashboard$1.J$0;
            iDM idm2 = (iDM) dashboardRepositoryImpl$getDeFiDashboard$1.L$0;
            C56391yDq.AEQbTJ(obj);
            j2 = j3;
            idm = idm2;
        }
        java.lang.String strAEQbTJ = C24193iYi.OLrzqt.AEQbTJ() ? "" : idm.AEQbTJ();
        CoroutineDispatcher coroutineDispatcher = idm.AEQbTJ;
        DashboardRepositoryImpl$getDeFiDashboard$2 dashboardRepositoryImpl$getDeFiDashboard$2 = new DashboardRepositoryImpl$getDeFiDashboard$2(idm, strAEQbTJ, j2, null);
        dashboardRepositoryImpl$getDeFiDashboard$1.L$0 = null;
        dashboardRepositoryImpl$getDeFiDashboard$1.label = 2;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, dashboardRepositoryImpl$getDeFiDashboard$2, dashboardRepositoryImpl$getDeFiDashboard$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<DashboardTokenListResponse>>> continuation) {
        DashboardRepositoryImpl$getDashboardTokenList$1 dashboardRepositoryImpl$getDashboardTokenList$1;
        if (continuation instanceof DashboardRepositoryImpl$getDashboardTokenList$1) {
            dashboardRepositoryImpl$getDashboardTokenList$1 = (DashboardRepositoryImpl$getDashboardTokenList$1) continuation;
            int i = dashboardRepositoryImpl$getDashboardTokenList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dashboardRepositoryImpl$getDashboardTokenList$1.label = i - Integer.MIN_VALUE;
            } else {
                dashboardRepositoryImpl$getDashboardTokenList$1 = new DashboardRepositoryImpl$getDashboardTokenList$1(this, continuation);
            }
        }
        java.lang.Object obj = dashboardRepositoryImpl$getDashboardTokenList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dashboardRepositoryImpl$getDashboardTokenList$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
        DashboardRepositoryImpl$getDashboardTokenList$2 dashboardRepositoryImpl$getDashboardTokenList$2 = new DashboardRepositoryImpl$getDashboardTokenList$2(this, str, null);
        dashboardRepositoryImpl$getDashboardTokenList$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, dashboardRepositoryImpl$getDashboardTokenList$2, dashboardRepositoryImpl$getDashboardTokenList$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull ProtocolDetailsParams protocolDetailsParams, @NotNull Continuation<? super Result<iDV>> continuation) {
        DashboardRepositoryImpl$getProtocolDetails$1 dashboardRepositoryImpl$getProtocolDetails$1;
        java.lang.String strAEQbTJ;
        if (continuation instanceof DashboardRepositoryImpl$getProtocolDetails$1) {
            dashboardRepositoryImpl$getProtocolDetails$1 = (DashboardRepositoryImpl$getProtocolDetails$1) continuation;
            int i = dashboardRepositoryImpl$getProtocolDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dashboardRepositoryImpl$getProtocolDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                dashboardRepositoryImpl$getProtocolDetails$1 = new DashboardRepositoryImpl$getProtocolDetails$1(this, continuation);
            }
        }
        java.lang.Object obj = dashboardRepositoryImpl$getProtocolDetails$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dashboardRepositoryImpl$getProtocolDetails$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C24193iYi c24193iYi = C24193iYi.OLrzqt;
        java.lang.String strAEQbTJ2 = c24193iYi.AEQbTJ() ? "" : AEQbTJ();
        java.lang.String strEZpvd = c24193iYi.EZpvd();
        ProtocolParams protocolParams = (ProtocolParams) CollectionsKt___CollectionsKt.firstOrNull(protocolDetailsParams.OLrzqt());
        java.lang.String str = (protocolParams == null || (strAEQbTJ = C23663iEs.AEQbTJ(protocolParams)) == null) ? "" : strAEQbTJ;
        CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
        DashboardRepositoryImpl$getProtocolDetails$2 dashboardRepositoryImpl$getProtocolDetails$2 = new DashboardRepositoryImpl$getProtocolDetails$2(this, str, strAEQbTJ2, protocolDetailsParams, strEZpvd, null);
        dashboardRepositoryImpl$getProtocolDetails$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, dashboardRepositoryImpl$getProtocolDetails$2, dashboardRepositoryImpl$getProtocolDetails$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    @Override // o.iDL
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super iDV> continuation) {
        return this.djBIcL.copydefault(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<? extends InterfaceC9738bbJ>> continuation) {
        DashboardRepositoryImpl$getMainWallet$1 dashboardRepositoryImpl$getMainWallet$1;
        if (continuation instanceof DashboardRepositoryImpl$getMainWallet$1) {
            dashboardRepositoryImpl$getMainWallet$1 = (DashboardRepositoryImpl$getMainWallet$1) continuation;
            int i = dashboardRepositoryImpl$getMainWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dashboardRepositoryImpl$getMainWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                dashboardRepositoryImpl$getMainWallet$1 = new DashboardRepositoryImpl$getMainWallet$1(this, continuation);
            }
        }
        java.lang.Object obj = dashboardRepositoryImpl$getMainWallet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dashboardRepositoryImpl$getMainWallet$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
        DashboardRepositoryImpl$getMainWallet$2 dashboardRepositoryImpl$getMainWallet$2 = new DashboardRepositoryImpl$getMainWallet$2(this, null);
        dashboardRepositoryImpl$getMainWallet$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, dashboardRepositoryImpl$getMainWallet$2, dashboardRepositoryImpl$getMainWallet$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<DashboardTokenDetailReq> list, @NotNull Continuation<? super Result<iEC>> continuation) {
        DashboardRepositoryImpl$getTokenListDetail$1 dashboardRepositoryImpl$getTokenListDetail$1;
        if (continuation instanceof DashboardRepositoryImpl$getTokenListDetail$1) {
            dashboardRepositoryImpl$getTokenListDetail$1 = (DashboardRepositoryImpl$getTokenListDetail$1) continuation;
            int i = dashboardRepositoryImpl$getTokenListDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dashboardRepositoryImpl$getTokenListDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                dashboardRepositoryImpl$getTokenListDetail$1 = new DashboardRepositoryImpl$getTokenListDetail$1(this, continuation);
            }
        }
        java.lang.Object obj = dashboardRepositoryImpl$getTokenListDetail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dashboardRepositoryImpl$getTokenListDetail$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
        DashboardRepositoryImpl$getTokenListDetail$2 dashboardRepositoryImpl$getTokenListDetail$2 = new DashboardRepositoryImpl$getTokenListDetail$2(this, str, list, null);
        dashboardRepositoryImpl$getTokenListDetail$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, dashboardRepositoryImpl$getTokenListDetail$2, dashboardRepositoryImpl$getTokenListDetail$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iDL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull ProtocolDetailsParams protocolDetailsParams, @NotNull Continuation<? super Result<? extends java.util.Map<java.lang.String, iDV>>> continuation) {
        DashboardRepositoryImpl$getBatchProtocolDetails$1 dashboardRepositoryImpl$getBatchProtocolDetails$1;
        if (continuation instanceof DashboardRepositoryImpl$getBatchProtocolDetails$1) {
            dashboardRepositoryImpl$getBatchProtocolDetails$1 = (DashboardRepositoryImpl$getBatchProtocolDetails$1) continuation;
            int i = dashboardRepositoryImpl$getBatchProtocolDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dashboardRepositoryImpl$getBatchProtocolDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                dashboardRepositoryImpl$getBatchProtocolDetails$1 = new DashboardRepositoryImpl$getBatchProtocolDetails$1(this, continuation);
            }
        }
        java.lang.Object obj = dashboardRepositoryImpl$getBatchProtocolDetails$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dashboardRepositoryImpl$getBatchProtocolDetails$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        java.lang.String strAEQbTJ = C24193iYi.OLrzqt.AEQbTJ() ? "" : AEQbTJ();
        CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
        DashboardRepositoryImpl$getBatchProtocolDetails$2 dashboardRepositoryImpl$getBatchProtocolDetails$2 = new DashboardRepositoryImpl$getBatchProtocolDetails$2(this, strAEQbTJ, protocolDetailsParams, null);
        dashboardRepositoryImpl$getBatchProtocolDetails$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, dashboardRepositoryImpl$getBatchProtocolDetails$2, dashboardRepositoryImpl$getBatchProtocolDetails$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
