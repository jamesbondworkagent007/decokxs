package o;

import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pMc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C38097pMc {
    public boolean AuCTel;
    public final InterfaceC38084pLq DbNXlk;
    public pLI ejfBZ;
    public final pMV fARcdN;
    public final pMX fJNWhG;
    public final InterfaceC38081pLn values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull pLI pli, boolean z) {
        Intrinsics.checkNotNullParameter(pli, "");
        this.ejfBZ = pli;
        this.AuCTel = z;
    }

    public C38097pMc(@NotNull pMX pmx, @NotNull pMV pmv, @NotNull InterfaceC38081pLn interfaceC38081pLn, @NotNull InterfaceC38084pLq interfaceC38084pLq) {
        Intrinsics.checkNotNullParameter(pmx, "");
        Intrinsics.checkNotNullParameter(pmv, "");
        Intrinsics.checkNotNullParameter(interfaceC38081pLn, "");
        Intrinsics.checkNotNullParameter(interfaceC38084pLq, "");
        this.fJNWhG = pmx;
        this.fARcdN = pmv;
        this.values = interfaceC38081pLn;
        this.DbNXlk = interfaceC38084pLq;
        this.AuCTel = true;
    }

    public static /* synthetic */ void finishProcessing$default(C38097pMc c38097pMc, LinkState linkState, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishProcessing");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        c38097pMc.KWHzl(linkState, z);
    }

    public final void KWHzl(@NotNull LinkState linkState, boolean z) {
        Intrinsics.checkNotNullParameter(linkState, "");
        this.values.OLrzqt(linkState);
        if (!pLF.KWHzl(linkState)) {
            pLI pli = this.ejfBZ;
            if (pli != null) {
                pli.AEQbTJ(linkState);
            }
            this.DbNXlk.EZpvd();
            this.values.OLrzqt();
            this.ejfBZ = null;
        } else if (z) {
            pLI pli2 = this.ejfBZ;
            if (pli2 != null) {
                pli2.AEQbTJ();
            }
            this.DbNXlk.EZpvd();
            this.values.OLrzqt();
            this.ejfBZ = null;
        }
        this.fARcdN.OLrzqt();
    }

    public final void djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.AuCTel) {
            try {
                this.fARcdN.copydefault(str);
                finishProcessing$default(this, LinkState.LINK_OPENED_EXTERNALLY, false, 2, null);
                return;
            } catch (java.lang.Exception unused) {
                finishProcessing$default(this, LinkState.NO_SUPPORTED_HANDLER, false, 2, null);
                return;
            }
        }
        finishProcessing$default(this, LinkState.NO_SUPPORTED_HANDLER, false, 2, null);
    }

    public final void OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.Object> map, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.fJNWhG.OLrzqt(map, str);
        map.put("referrer", this.fARcdN.copydefault());
    }
}
