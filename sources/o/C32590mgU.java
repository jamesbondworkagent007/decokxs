package o;

import com.okinc.common.util.MatrixUtils$reportFPS$1;
import com.okinc.common.util.MatrixUtils$reportStartUp$1;
import com.okinc.common.util.MatrixUtils$reportTrace$1;
import com.okinc.common.util.MatrixUtils$sync$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.InterfaceC32607mgl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.mgU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32590mgU implements InterfaceC32607mgl<C32589mgT>, InterfaceC6711aUW {
    public final InterfaceC56387yDm AEQbTJ;
    public final android.app.Application EZpvd;
    public final java.lang.String KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final CoroutineScope djBIcL;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32607mgl
    public java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32664mhp
    public java.lang.String OLrzqt() {
        return this.gEmmrt;
    }

    public C32590mgU(@NotNull android.app.Application application, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.EZpvd = application;
        this.gEmmrt = str;
        this.KWHzl = str2;
        this.OLrzqt = coroutineDispatcher;
        this.djBIcL = coroutineScope;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mgV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32590mgU.copydefault(this.EZpvd);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mgX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32590mgU.copydefault();
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
    public /* synthetic */ C32590mgU(android.app.Application application, java.lang.String str, java.lang.String str2, CoroutineDispatcher coroutineDispatcher, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        java.lang.String str3 = (i & 2) != 0 ? "Matrix" : str;
        java.lang.String str4 = (i & 4) != 0 ? "mobile_infra_matrix" : str2;
        CoroutineDispatcher coroutineDispatcherOLrzqt = (i & 8) != 0 ? com.okinc.okapm.Apm.Companion.OLrzqt() : coroutineDispatcher;
        this(application, str3, str4, coroutineDispatcherOLrzqt, (i & 16) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcherOLrzqt)) : coroutineScope);
    }

    /* JADX INFO: renamed from: o.mgU$StateListAnimator */
    public static final class StateListAnimator extends C32927mmn {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C32927mmn, o.InterfaceC32926mmm
        public java.lang.String EZpvd() {
            return this.KWHzl;
        }

        public StateListAnimator(C32590mgU c32590mgU) {
            this.KWHzl = c32590mgU.KWHzl();
        }
    }

    public final StateListAnimator EZpvd() {
        return (StateListAnimator) this.AEQbTJ.getValue();
    }

    public static final StateListAnimator copydefault(C32590mgU c32590mgU) {
        return new StateListAnimator(c32590mgU);
    }

    public static final C32589mgT copydefault() {
        return new C32589mgT(false);
    }

    public final boolean djBIcL() {
        return C33551myb.copydefault();
    }

    public void OLrzqt(boolean z) {
        if (djBIcL()) {
            C35202nqq c35202nqq = C35202nqq.OLrzqt;
            boolean zAEQbTJ = c35202nqq.AEQbTJ("matrix_enable");
            boolean zAEQbTJ2 = c35202nqq.AEQbTJ("matrix_enable_touch_event_trace");
            boolean zAEQbTJ3 = c35202nqq.AEQbTJ("matrix_enable_fps");
            boolean zAEQbTJ4 = c35202nqq.AEQbTJ("matrix_enable_main_thread_priority_trace");
            boolean zAEQbTJ5 = c35202nqq.AEQbTJ("matrix_enable_idle_handler_trace");
            boolean zAEQbTJ6 = c35202nqq.AEQbTJ("matrix_enable_anr_trace");
            boolean zAEQbTJ7 = c35202nqq.AEQbTJ("matrix_enable_signal_anr_trace");
            boolean zAEQbTJ8 = c35202nqq.AEQbTJ("matrix_enable_evil_method_trace");
            boolean zAEQbTJ9 = c35202nqq.AEQbTJ("matrix_enable_hook_pthread");
            boolean zAEQbTJ10 = c35202nqq.AEQbTJ("matrix_enable_wv_prealloc_hook");
            int i = zAEQbTJ2 ? 3 : 1;
            if (zAEQbTJ3) {
                i |= 4;
            }
            if (zAEQbTJ4) {
                i |= 8;
            }
            if (zAEQbTJ5) {
                i |= 16;
            }
            if (zAEQbTJ6) {
                i |= 32;
            }
            if (zAEQbTJ7) {
                i |= 64;
            }
            if (zAEQbTJ8) {
                i |= 128;
            }
            if (z) {
                i |= 256;
            }
            if (zAEQbTJ9) {
                i |= 512;
            }
            if (zAEQbTJ10) {
                i |= 1024;
            }
            pUU.KWHzl(OLrzqt(), "init matrix flags: " + i + " in [" + java.lang.Thread.currentThread().getName() + "]\nenableMatrix:" + zAEQbTJ + "  \nenableTouchEventTrace:" + zAEQbTJ2 + " \nenableFPS:" + zAEQbTJ3 + " \nenableIdleHandlerTrace:" + zAEQbTJ5 + " \nenableAnrTrace:" + zAEQbTJ6 + " \nenableSignalAnrTrace:" + zAEQbTJ7 + " \nenableEvilMethodTrace:" + zAEQbTJ8 + " \nisDebug:" + z + " \nenableHookPthread:" + zAEQbTJ9 + " \nenableWVPreAllocHook:" + zAEQbTJ10 + " \nenableMainThreadPriorityTrace:" + zAEQbTJ4);
            C6700aUL.EZpvd.OLrzqt(this.EZpvd, i, this);
        }
    }

    public void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(this.djBIcL, null, null, new MatrixUtils$sync$1(this, null), 3, null);
    }

    @Override // o.InterfaceC6711aUW
    public void AEQbTJ(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        BuildersKt__Builders_commonKt.launch$default(this.djBIcL, null, null, new MatrixUtils$reportTrace$1(jSONObject, null), 3, null);
    }

    @Override // o.InterfaceC6711aUW
    public void OLrzqt(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        BuildersKt__Builders_commonKt.launch$default(this.djBIcL, null, null, new MatrixUtils$reportStartUp$1(jSONObject, null), 3, null);
    }

    @Override // o.InterfaceC6711aUW
    public void EZpvd(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        BuildersKt__Builders_commonKt.launch$default(this.djBIcL, null, null, new MatrixUtils$reportFPS$1(jSONObject, null), 3, null);
    }
}
