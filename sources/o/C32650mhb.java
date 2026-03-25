package o;

import com.okinc.base.utils.OkUtils;
import com.okinc.common.util.MonitorUtils$onActivityInfo$1;
import com.okinc.common.util.MonitorUtils$onFragmentInfo$1;
import com.okinc.common.util.MonitorUtils$sync$1;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.ABTestManager;
import com.okinc.lib.monitor.bean.FragmentInfo;
import com.okinc.okapm.Apm;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InterfaceC32607mgl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.mhb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32650mhb implements InterfaceC32607mgl<C32585mgP>, pJR {
    public final InterfaceC56387yDm AEQbTJ;
    public final CoroutineScope AYXKKw;
    public final java.lang.String AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final java.lang.String EZpvd;
    public boolean KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final android.app.Application copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.mhb$Activity */
    public static final class Activity extends C32927mmn {
        public final java.lang.String EZpvd = "mobile_infra_apm_ttid_ttfd_android";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C32927mmn, o.InterfaceC32926mmm
        public java.lang.String EZpvd() {
            return this.EZpvd;
        }
    }

    /* JADX INFO: renamed from: o.mhb$StateListAnimator */
    public static final class StateListAnimator extends C32927mmn {
        public final java.lang.String KWHzl = "mobile_infra_apm_memory_android";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C32927mmn, o.InterfaceC32926mmm
        public java.lang.String EZpvd() {
            return this.KWHzl;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32607mgl
    public java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32664mhp
    public java.lang.String OLrzqt() {
        return this.AhwBna;
    }

    public C32650mhb(@NotNull android.app.Application application, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.copydefault = application;
        this.AhwBna = str;
        this.EZpvd = str2;
        this.OLrzqt = coroutineDispatcher;
        this.AYXKKw = coroutineScope;
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.mgZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32650mhb.djBIcL(this.copydefault);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.mhc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32650mhb.AhwBna(this.AEQbTJ);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.mgY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32650mhb.valueOf(this.AEQbTJ);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mhg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32650mhb.AYXKKw(this.copydefault);
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.mhf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32650mhb.djBIcL();
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.mhd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32650mhb.AYXKKw();
            }
        });
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
    public /* synthetic */ C32650mhb(android.app.Application application, java.lang.String str, java.lang.String str2, CoroutineDispatcher coroutineDispatcher, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        java.lang.String str3 = (i & 2) != 0 ? "Monitor.Lifecycle" : str;
        java.lang.String str4 = (i & 4) != 0 ? "mobile_infra_low_end_device_list" : str2;
        CoroutineDispatcher coroutineDispatcherOLrzqt = (i & 8) != 0 ? com.okinc.okapm.Apm.Companion.OLrzqt() : coroutineDispatcher;
        this(application, str3, str4, coroutineDispatcherOLrzqt, (i & 16) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcherOLrzqt)) : coroutineScope);
    }

    public static final C32666mhr djBIcL(C32650mhb c32650mhb) {
        return new C32666mhr(null, null, null, c32650mhb.OLrzqt, null, 23, null);
    }

    public final C32666mhr isConnected() {
        return (C32666mhr) this.isConnected.getValue();
    }

    public static final C32588mgS AhwBna(C32650mhb c32650mhb) {
        return new C32588mgS(c32650mhb.copydefault, null, null, c32650mhb.OLrzqt, null, 22, null);
    }

    public final C32588mgS AhwBna() {
        return (C32588mgS) this.djBIcL.getValue();
    }

    public final C32590mgU AkhnZx() {
        return (C32590mgU) this.valueOf.getValue();
    }

    public static final C32590mgU valueOf(C32650mhb c32650mhb) {
        return new C32590mgU(c32650mhb.copydefault, null, null, c32650mhb.OLrzqt, null, 22, null);
    }

    /* JADX INFO: renamed from: o.mhb$Application */
    public static final class Application extends C32927mmn {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C32927mmn, o.InterfaceC32926mmm
        public java.lang.String EZpvd() {
            return this.EZpvd;
        }

        public Application(C32650mhb c32650mhb) {
            this.EZpvd = c32650mhb.KWHzl();
        }
    }

    public final InterfaceC32926mmm gEmmrt() {
        return (InterfaceC32926mmm) this.AEQbTJ.getValue();
    }

    public static final Application AYXKKw(C32650mhb c32650mhb) {
        return new Application(c32650mhb);
    }

    public final InterfaceC32926mmm values() {
        return (InterfaceC32926mmm) this.AkhnZx.getValue();
    }

    public static final Activity djBIcL() {
        return new Activity();
    }

    public final InterfaceC32926mmm fetchVPNInfo() {
        return (InterfaceC32926mmm) this.gEmmrt.getValue();
    }

    public static final StateListAnimator AYXKKw() {
        return new StateListAnimator();
    }

    public final boolean fARcdN() {
        return C33551myb.copydefault();
    }

    public final boolean DbNXlk() {
        return !this.KWHzl && C6833aWo.AEQbTJ.uzCIH();
    }

    public void copydefault(boolean z) {
        C6833aWo.AEQbTJ.KWHzl(this.copydefault, new Function0() { // from class: o.mhh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32650mhb.valueOf();
            }
        });
        this.KWHzl = z;
        C54807xWa.KWHzl();
        isConnected().OLrzqt(z);
        ejfBZ();
        if (!DbNXlk() && fARcdN()) {
            AkhnZx().OLrzqt(z);
            AhwBna().KWHzl(z);
            C35202nqq c35202nqq = C35202nqq.OLrzqt;
            boolean zAEQbTJ = c35202nqq.AEQbTJ("rendertime_report");
            boolean zAEQbTJ2 = c35202nqq.AEQbTJ("monitor_win_manager");
            int iAEQbTJ = (zAEQbTJ || z) ? C38055pKo.AEQbTJ(0, 0) : 0;
            if (zAEQbTJ2 || z) {
                iAEQbTJ = C38055pKo.AEQbTJ(iAEQbTJ, 1);
            }
            pJI.Companion.AEQbTJ(this.OLrzqt).OLrzqt(iAEQbTJ, this);
            return;
        }
        pUU.valueOf("Monitor.Device", "ignore Matrix, Leak");
    }

    public static final java.util.Map valueOf() {
        C6769aVd c6769aVd = C6769aVd.OLrzqt;
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt("ANR", java.lang.String.valueOf(c6769aVd.djBIcL())), C56390yDp.OLrzqt("Crash", java.lang.String.valueOf(c6769aVd.AYXKKw())));
    }

    @Override // o.pJR
    public void EZpvd(com.okinc.lib.monitor.bean.ActivityInfo activityInfo) {
        BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, null, null, new MonitorUtils$onActivityInfo$1(activityInfo, this, null), 3, null);
    }

    @Override // o.pJR
    public void KWHzl(FragmentInfo fragmentInfo) {
        BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, null, null, new MonitorUtils$onFragmentInfo$1(fragmentInfo, null), 3, null);
    }

    public final boolean AuCTel() {
        return ABTestManager.isEnabled$default(ABTestManager.AEQbTJ, gEmmrt(), null, 2, null);
    }

    public void fIwbmz() {
        isConnected().DbNXlk();
        if (!DbNXlk()) {
            AkhnZx().gEmmrt();
            AhwBna().copydefault();
        }
        BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, null, null, new MonitorUtils$sync$1(this, null), 3, null);
    }

    public final void fJNWhG() {
        isConnected().AYXKKw();
    }

    public final void EZpvd(int i) {
        isConnected().EZpvd(i);
    }

    public C32585mgP EZpvd(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("models");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    java.lang.String strOptString = jSONArrayOptJSONArray.optString(i, null);
                    if (strOptString != null) {
                        linkedHashSet.add(strOptString);
                    }
                }
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(linkedHashSet);
            C54807xWa.KWHzl(listAxsJAYsNCnLh);
            return new C32585mgP(listAxsJAYsNCnLh);
        } catch (java.lang.Throwable th) {
            pUU.copydefault("Monitor.Device", th);
            return C32585mgP.Companion.EZpvd();
        }
    }

    public final void ejfBZ() {
        try {
            Apm.Activity activity = com.okinc.okapm.Apm.Companion;
            android.app.Application applicationAEQbTJ = OkUtils.AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(applicationAEQbTJ, "");
            activity.OLrzqt(applicationAEQbTJ, new Function1() { // from class: o.mha
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C32650mhb.copydefault(this.KWHzl, (Apm.StateListAnimator) obj);
                }
            });
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ(OLrzqt(), th);
        }
    }

    public static final Unit copydefault(C32650mhb c32650mhb, Apm.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        mNP mnp = mNP.AEQbTJ;
        stateListAnimator.KWHzl(mnp.copydefault());
        java.lang.String str = null;
        stateListAnimator.copydefault(c32650mhb.KWHzl || ABTestManager.isEnabled$default(ABTestManager.AEQbTJ, c32650mhb.values(), null, 2, null));
        stateListAnimator.EZpvd(c32650mhb.KWHzl || ABTestManager.isEnabled$default(ABTestManager.AEQbTJ, c32650mhb.fetchVPNInfo(), null, 2, null));
        java.lang.String strAEQbTJ = mnp.AEQbTJ();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ) && !C59449zhJ.gEmmrt(strAEQbTJ, AbstractJsonLexerKt.NULL, true)) {
            str = strAEQbTJ;
        }
        stateListAnimator.AEQbTJ(str != null ? str : "");
        stateListAnimator.copydefault(new Function1() { // from class: o.mhe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32650mhb.OLrzqt((rVR) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(rVR rvr) {
        Intrinsics.checkNotNullParameter(rvr, "");
        EventData eventData = new EventData();
        eventData.setAct(rvr.AEQbTJ());
        eventData.setPath(rvr.EZpvd());
        eventData.setSource(rvr.EZpvd());
        eventData.setAttrs(rvr.KWHzl());
        ReportManager.AEQbTJ.EZpvd(eventData);
        return Unit.INSTANCE;
    }
}
