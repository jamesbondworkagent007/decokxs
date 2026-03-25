package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pMT implements pMX {
    public final InterfaceC33253msv AEQbTJ;
    public final kOG AYXKKw;
    public final pKI AhwBna;
    public final pMK EZpvd;
    public final pMM KWHzl;
    public final InterfaceC38113pMs OLrzqt;
    public final InterfaceC38110pMp copydefault;
    public final pMA djBIcL;
    public final Function2<android.content.Context, java.lang.String, java.lang.Boolean> valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function2<? super android.content.Context, ? super java.lang.String, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    @yCM
    public pMT(@NotNull InterfaceC38113pMs interfaceC38113pMs, @NotNull pMA pma, @NotNull InterfaceC38110pMp interfaceC38110pMp, @NotNull pMM pmm, @NotNull InterfaceC33253msv interfaceC33253msv, @NotNull pMK pmk, @NotNull kOG kog, pKI pki, @NotNull Function2<? super android.content.Context, ? super java.lang.String, java.lang.Boolean> function2) {
        Intrinsics.checkNotNullParameter(interfaceC38113pMs, "");
        Intrinsics.checkNotNullParameter(pma, "");
        Intrinsics.checkNotNullParameter(interfaceC38110pMp, "");
        Intrinsics.checkNotNullParameter(pmm, "");
        Intrinsics.checkNotNullParameter(interfaceC33253msv, "");
        Intrinsics.checkNotNullParameter(pmk, "");
        Intrinsics.checkNotNullParameter(kog, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = interfaceC38113pMs;
        this.djBIcL = pma;
        this.copydefault = interfaceC38110pMp;
        this.KWHzl = pmm;
        this.AEQbTJ = interfaceC33253msv;
        this.EZpvd = pmk;
        this.AYXKKw = kog;
        this.AhwBna = pki;
        this.valueOf = function2;
    }

    @Override // o.pMX
    public java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        if (this.KWHzl.copydefault() != null) {
            InterfaceC38113pMs interfaceC38113pMs = this.OLrzqt;
            android.content.Context contextCopydefault = this.KWHzl.copydefault();
            Intrinsics.copydefault(contextCopydefault);
            return interfaceC38113pMs.EZpvd(contextCopydefault, z, continuation);
        }
        pUU.copydefault("LinkDependencyHelperImpl - performAuth failed");
        return C56443yFo.KWHzl(false);
    }

    @Override // o.pMX
    public boolean KWHzl() {
        return this.OLrzqt.KWHzl();
    }

    @Override // o.pMX
    public java.lang.Object copydefault(@NotNull DeeplinkMode deeplinkMode, @NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        if (this.KWHzl.copydefault() != null) {
            pMA pma = this.djBIcL;
            android.content.Context contextCopydefault = this.KWHzl.copydefault();
            Intrinsics.copydefault(contextCopydefault);
            return pma.EZpvd(contextCopydefault, deeplinkMode, str, continuation);
        }
        pUU.copydefault("LinkDependencyHelperImpl - switchModeIfRequired failed");
        return C56443yFo.KWHzl(false);
    }

    @Override // o.pMX
    public java.lang.Object EZpvd(@NotNull DeeplinkMode deeplinkMode, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.copydefault.KWHzl(deeplinkMode, continuation);
    }

    @Override // o.pMX
    public boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context contextCopydefault = this.KWHzl.copydefault();
        return contextCopydefault != null && this.valueOf.invoke(contextCopydefault, str).booleanValue();
    }

    @Override // o.pMX
    public Flow<Unit> OLrzqt() {
        return FlowKt.take(this.AEQbTJ.AEQbTJ(), 1);
    }

    @Override // o.pMX
    public void OLrzqt(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull java.lang.String str) {
        pKM pkm;
        pKI pki;
        pKI pki2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (map.containsKey(RemoteMessageConst.Notification.CHANNEL_ID)) {
            this.AYXKKw.AEQbTJ(java.lang.String.valueOf(map.get(RemoteMessageConst.Notification.CHANNEL_ID)));
        }
        if (map.containsKey("ref") && (pki2 = this.AhwBna) != null) {
            pki2.copydefault(str, java.lang.String.valueOf(map.get("ref")));
        }
        if (map.containsKey("utm_medium")) {
            java.lang.String strValueOf = java.lang.String.valueOf(map.get("utm_medium"));
            java.lang.Object obj = map.get("utm_source");
            java.lang.String string = obj != null ? obj.toString() : null;
            java.lang.Object obj2 = map.get("utm_campaign");
            java.lang.String string2 = obj2 != null ? obj2.toString() : null;
            java.lang.Object obj3 = map.get("utm_content");
            java.lang.String string3 = obj3 != null ? obj3.toString() : null;
            java.lang.Object obj4 = map.get("utm_term");
            pkm = new pKM(strValueOf, string, string2, string3, obj4 != null ? obj4.toString() : null);
        } else {
            pkm = null;
        }
        java.lang.String strValueOf2 = map.containsKey("ref") ? java.lang.String.valueOf(map.get("ref")) : null;
        if ((pkm == null && strValueOf2 == null) || (pki = this.AhwBna) == null) {
            return;
        }
        pki.EZpvd(str, pkm, strValueOf2);
    }

    @Override // o.pMX
    public boolean AEQbTJ() {
        return this.EZpvd.KWHzl();
    }

    @Override // o.pMX
    public StateFlow<java.lang.Boolean> EZpvd() {
        return this.EZpvd.AEQbTJ();
    }
}
