package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pMU implements pMV {
    public final pMM KWHzl;

    public pMU(@NotNull pMM pmm) {
        Intrinsics.checkNotNullParameter(pmm, "");
        this.KWHzl = pmm;
    }

    @Override // o.pMV
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
        android.content.Context contextCopydefault = this.KWHzl.copydefault();
        if (contextCopydefault != null) {
            contextCopydefault.startActivity(intent);
        }
    }

    @Override // o.pMV
    public void EZpvd(@NotNull InterfaceC43234rlT interfaceC43234rlT, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(interfaceC43234rlT, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (this.KWHzl.copydefault() != null) {
            android.content.Context contextCopydefault = this.KWHzl.copydefault();
            Intrinsics.copydefault(contextCopydefault);
            interfaceC43234rlT.OLrzqt(contextCopydefault, interfaceC43233rlS, map);
        } else {
            pUU.copydefault("executeDeeplink failed - missing context - " + interfaceC43233rlS.OLrzqt());
        }
    }

    @Override // o.pMV
    public void AEQbTJ(@NotNull InterfaceC43236rlV interfaceC43236rlV, @NotNull InterfaceC43232rlR interfaceC43232rlR, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(interfaceC43236rlV, "");
        Intrinsics.checkNotNullParameter(interfaceC43232rlR, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (this.KWHzl.copydefault() != null) {
            android.content.Context contextCopydefault = this.KWHzl.copydefault();
            Intrinsics.copydefault(contextCopydefault);
            interfaceC43236rlV.KWHzl(contextCopydefault, interfaceC43232rlR, map);
        } else {
            pUU.copydefault("executeDeeplink failed - missing context - " + interfaceC43232rlR.AEQbTJ());
        }
    }

    @Override // o.pMV
    public java.lang.String copydefault() {
        android.net.Uri referrer;
        java.lang.String string;
        android.content.Context contextOLrzqt = this.KWHzl.OLrzqt();
        android.app.Activity activity = contextOLrzqt instanceof android.app.Activity ? (android.app.Activity) contextOLrzqt : null;
        return (activity == null || (referrer = activity.getReferrer()) == null || (string = referrer.toString()) == null) ? "" : string;
    }

    @Override // o.pMV
    public void OLrzqt() {
        this.KWHzl.KWHzl();
    }
}
