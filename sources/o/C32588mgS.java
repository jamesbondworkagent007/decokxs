package o;

import com.okinc.common.util.LeakUtils$init$1;
import com.okinc.common.util.LeakUtils$sync$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.InterfaceC32607mgl;
import o.pJX;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.mgS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32588mgS implements InterfaceC32607mgl<pJX.StateListAnimator> {
    public final java.lang.String AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final java.lang.String KWHzl;
    public final android.app.Application OLrzqt;
    public final CoroutineScope copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32607mgl
    public java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32664mhp
    public java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    public C32588mgS(@NotNull android.app.Application application, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.OLrzqt = application;
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.EZpvd = coroutineDispatcher;
        this.copydefault = coroutineScope;
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
    public /* synthetic */ C32588mgS(android.app.Application application, java.lang.String str, java.lang.String str2, CoroutineDispatcher coroutineDispatcher, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        java.lang.String str3 = (i & 2) != 0 ? "Monitor.Leak" : str;
        java.lang.String str4 = (i & 4) != 0 ? "mobile_infra_leak_finder_enabled" : str2;
        CoroutineDispatcher coroutineDispatcherOLrzqt = (i & 8) != 0 ? com.okinc.okapm.Apm.Companion.OLrzqt() : coroutineDispatcher;
        this(application, str3, str4, coroutineDispatcherOLrzqt, (i & 16) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcherOLrzqt)) : coroutineScope);
    }

    public pJX.StateListAnimator AEQbTJ(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        try {
            return new pJX.StateListAnimator(true, 0, C32584mgO.djBIcL(jSONObject), C32584mgO.AEQbTJ(jSONObject), C32584mgO.copydefault(jSONObject), C32584mgO.OLrzqt(jSONObject), C32584mgO.KWHzl(jSONObject), C32584mgO.EZpvd(jSONObject), 2, null);
        } catch (java.lang.Exception e) {
            pUU.copydefault(OLrzqt(), e);
            return pJX.Companion.AEQbTJ();
        }
    }

    public void KWHzl(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new LeakUtils$init$1(this, null), 3, null);
    }

    public void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new LeakUtils$sync$1(this, null), 3, null);
    }
}
