package o;

import com.okinc.base.thread.TPM;
import com.okinc.common.util.TPMUtils$addLifecycleLog$1;
import com.okinc.common.util.TPMUtils$init$1;
import com.okinc.common.util.TPMUtils$sync$1;
import com.okinc.okapm.common.AppStartMode;
import com.okinc.okapm.common.Lifecycle;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C38023pJj;
import o.InterfaceC32607mgl;
import o.InterfaceC38042pKb;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.mhr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32666mhr implements InterfaceC32607mgl<TPM.TaskDescription> {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final java.lang.String AhwBna;
    public final C38023pJj AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public boolean EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final TaskDescription OLrzqt;
    public final java.lang.String copydefault;
    public final ActionBar djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final CoroutineScope gEmmrt;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C32666mhr() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final AbstractC58253yxm AYXKKw(AbstractC58253yxm abstractC58253yxm, AbstractC58253yxm abstractC58253yxm2) {
        Intrinsics.checkNotNullParameter(abstractC58253yxm2, "");
        return abstractC58253yxm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final AbstractC58253yxm KWHzl(AbstractC58253yxm abstractC58253yxm, AbstractC58253yxm abstractC58253yxm2) {
        Intrinsics.checkNotNullParameter(abstractC58253yxm2, "");
        return abstractC58253yxm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32607mgl
    public java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32664mhp
    public java.lang.String OLrzqt() {
        return this.AhwBna;
    }

    public C32666mhr(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull C38023pJj c38023pJj, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c38023pJj, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.AhwBna = str;
        this.copydefault = str2;
        this.AkhnZx = c38023pJj;
        this.KWHzl = coroutineDispatcher;
        this.gEmmrt = coroutineScope;
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.mhq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32666mhr.valueOf(this.OLrzqt);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mht
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C32666mhr.AEQbTJ());
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.mhv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C32666mhr.isConnected(this.EZpvd));
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.mhs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32666mhr.gEmmrt(this.AEQbTJ);
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.mhw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32666mhr.AkhnZx(this.OLrzqt);
            }
        });
        this.djBIcL = new ActionBar();
        this.OLrzqt = new TaskDescription();
    }

    @Override // o.InterfaceC32607mgl
    public JSONObject EZpvd(boolean z) {
        return InterfaceC32607mgl.StateListAnimator.copydefault(this, z);
    }

    @Override // o.InterfaceC32607mgl
    public void copydefault(@NotNull java.lang.String str) {
        InterfaceC32607mgl.StateListAnimator.EZpvd(this, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C32666mhr(java.lang.String str, java.lang.String str2, C38023pJj c38023pJj, CoroutineDispatcher coroutineDispatcher, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "Monitor.TPM" : str;
        java.lang.String str3 = (i & 2) != 0 ? "mobile_infra_tpm" : str2;
        C38023pJj c38023pJjKWHzl = (i & 4) != 0 ? C38023pJj.KWHzl() : c38023pJj;
        CoroutineDispatcher coroutineDispatcherOLrzqt = (i & 8) != 0 ? com.okinc.okapm.Apm.Companion.OLrzqt() : coroutineDispatcher;
        this(str, str3, c38023pJjKWHzl, coroutineDispatcherOLrzqt, (i & 16) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcherOLrzqt)) : coroutineScope);
    }

    public static final InterfaceC38042pKb valueOf(C32666mhr c32666mhr) {
        return InterfaceC38042pKb.Companion.EZpvd(c32666mhr.KWHzl);
    }

    public final InterfaceC38042pKb valueOf() {
        return (InterfaceC38042pKb) this.valueOf.getValue();
    }

    private final boolean isConnected() {
        return !this.EZpvd && C6833aWo.AEQbTJ.uzCIH();
    }

    public final int EZpvd() {
        return ((java.lang.Number) this.AEQbTJ.getValue()).intValue();
    }

    public static final int AEQbTJ() {
        return java.lang.Runtime.getRuntime().availableProcessors();
    }

    public final int djBIcL() {
        return ((java.lang.Number) this.DbNXlk.getValue()).intValue();
    }

    public static final int isConnected(C32666mhr c32666mhr) {
        boolean zIsConnected = c32666mhr.isConnected();
        int iEZpvd = c32666mhr.EZpvd();
        return zIsConnected ? java.lang.Math.max(2, iEZpvd / 2) : iEZpvd * 2;
    }

    /* JADX INFO: renamed from: o.mhr$Activity */
    public static final class Activity implements C38023pJj.Application {
        public Activity() {
        }
    }

    public final Activity gEmmrt() {
        return (Activity) this.AYXKKw.getValue();
    }

    public static final Activity gEmmrt(C32666mhr c32666mhr) {
        return c32666mhr.new Activity();
    }

    /* JADX INFO: renamed from: o.mhr$StateListAnimator */
    public static final class StateListAnimator implements C38023pJj.Application {
        public StateListAnimator() {
        }
    }

    public final StateListAnimator AhwBna() {
        return (StateListAnimator) this.fetchVPNInfo.getValue();
    }

    public static final StateListAnimator AkhnZx(C32666mhr c32666mhr) {
        return c32666mhr.new StateListAnimator();
    }

    public void OLrzqt(boolean z) {
        this.EZpvd = z;
        TPM.AEQbTJ.EZpvd(z);
        this.AkhnZx.AEQbTJ(true);
        this.AkhnZx.KWHzl(true);
        this.AkhnZx.copydefault(gEmmrt());
        BuildersKt__Builders_commonKt.launch$default(this.gEmmrt, null, null, new TPMUtils$init$1(this, null), 3, null);
        C54819xWm.KWHzl().AEQbTJ(this.OLrzqt);
    }

    public void DbNXlk() {
        BuildersKt__Builders_commonKt.launch$default(this.gEmmrt, null, null, new TPMUtils$sync$1(this, null), 3, null);
    }

    public TPM.TaskDescription OLrzqt(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        return C6788aVw.AEQbTJ.OLrzqt(jSONObject);
    }

    public final void EZpvd(Lifecycle lifecycle) {
        BuildersKt__Builders_commonKt.launch$default(this.gEmmrt, null, null, new TPMUtils$addLifecycleLog$1(lifecycle, null), 3, null);
    }

    /* JADX INFO: renamed from: o.mhr$ActionBar */
    public static final class ActionBar implements InterfaceC38042pKb.StateListAnimator {
        @Override // o.InterfaceC38042pKb.StateListAnimator
        public void AEQbTJ(int i) {
            com.okinc.okapm.Apm apmAEQbTJ = com.okinc.okapm.Apm.Companion.AEQbTJ();
            if (apmAEQbTJ != null) {
                apmAEQbTJ.AEQbTJ(AppStartMode.OnLifecycle);
            }
            InterfaceC6828aWj.Companion.OLrzqt().AEQbTJ("Monitor.Thread", i);
        }
    }

    public final void AYXKKw() {
        com.okinc.okapm.Apm apmAEQbTJ = com.okinc.okapm.Apm.Companion.AEQbTJ();
        if (apmAEQbTJ != null) {
            apmAEQbTJ.AEQbTJ(AppStartMode.OnLifecycle);
        }
    }

    public final void EZpvd(int i) {
        com.okinc.okapm.Apm apmAEQbTJ;
        if ((i == 5 || i == 40 || i == 60 || i == 80) && (apmAEQbTJ = com.okinc.okapm.Apm.Companion.AEQbTJ()) != null) {
            apmAEQbTJ.AEQbTJ(AppStartMode.OnLifecycle);
        }
    }

    /* JADX INFO: renamed from: o.mhr$TaskDescription */
    public static final class TaskDescription implements InterfaceC54816xWj {
        public TaskDescription() {
        }

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
            C32666mhr.this.valueOf().OLrzqt();
            C32666mhr.this.EZpvd(Lifecycle.Background);
        }

        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            C32666mhr.this.valueOf().copydefault();
            C32666mhr.this.EZpvd(Lifecycle.Foreground);
        }
    }

    public final void OLrzqt(TPM.Activity activity) {
        if (!isConnected() || activity == null) {
            return;
        }
        int iMin = java.lang.Math.min(djBIcL(), activity.AEQbTJ());
        int iMin2 = java.lang.Math.min(activity.KWHzl(), iMin * 2);
        long jMin = java.lang.Math.min(activity.OLrzqt(), 10);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        final AbstractC58253yxm abstractC58253yxmKWHzl = yBP.KWHzl(new ThreadPoolExecutor(iMin, iMin2, jMin, timeUnit, new LinkedBlockingQueue(iMin2), new ThreadFactoryC6748aVI("Monitor.Device", null, false, null, 14, null), new ThreadPoolExecutor.CallerRunsPolicy()));
        Intrinsics.checkNotNullExpressionValue(abstractC58253yxmKWHzl, "");
        final AbstractC58253yxm abstractC58253yxmKWHzl2 = yBP.KWHzl(new ThreadPoolExecutor(iMin, iMin2, jMin, timeUnit, new LinkedBlockingQueue(iMin2), new ThreadFactoryC6748aVI("Monitor.Device", null, false, null, 14, null), new ThreadPoolExecutor.AbortPolicy()));
        Intrinsics.checkNotNullExpressionValue(abstractC58253yxmKWHzl2, "");
        TPM.AEQbTJ(new java.lang.Runnable() { // from class: o.mhB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C32666mhr.OLrzqt(abstractC58253yxmKWHzl, abstractC58253yxmKWHzl2);
            }
        });
    }

    public static final AbstractC58253yxm AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC58253yxm) function1.invoke(obj);
    }

    public static final void OLrzqt(final AbstractC58253yxm abstractC58253yxm, final AbstractC58253yxm abstractC58253yxm2) {
        final Function1 function1 = new Function1() { // from class: o.mhu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32666mhr.KWHzl(abstractC58253yxm, (AbstractC58253yxm) obj);
            }
        };
        yBG.EZpvd((InterfaceC58229yxO<? super AbstractC58253yxm, ? extends AbstractC58253yxm>) new InterfaceC58229yxO() { // from class: o.mhz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C32666mhr.AEQbTJ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.mhx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32666mhr.AYXKKw(abstractC58253yxm2, (AbstractC58253yxm) obj);
            }
        };
        yBG.KWHzl((InterfaceC58229yxO<? super AbstractC58253yxm, ? extends AbstractC58253yxm>) new InterfaceC58229yxO() { // from class: o.mhy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C32666mhr.copydefault(function12, obj);
            }
        });
    }

    public static final AbstractC58253yxm copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC58253yxm) function1.invoke(obj);
    }
}
