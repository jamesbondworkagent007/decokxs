package o;

import com.okinc.dexkline.market.features.position.ui.widget.PnLDetailsUiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ncp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34479ncp {
    public final java.lang.Throwable AEQbTJ;
    public final PnLDetailsUiModel EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34479ncp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C34479ncp copy$default(C34479ncp c34479ncp, PnLDetailsUiModel pnLDetailsUiModel, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pnLDetailsUiModel = c34479ncp.EZpvd;
        }
        if ((i & 2) != 0) {
            th = c34479ncp.AEQbTJ;
        }
        return c34479ncp.OLrzqt(pnLDetailsUiModel, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDetailsUiModel KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34479ncp OLrzqt(@NotNull PnLDetailsUiModel pnLDetailsUiModel, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(pnLDetailsUiModel, "");
        return new C34479ncp(pnLDetailsUiModel, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34479ncp)) {
            return false;
        }
        C34479ncp c34479ncp = (C34479ncp) obj;
        return Intrinsics.EZpvd(this.EZpvd, c34479ncp.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c34479ncp.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        java.lang.Throwable th = this.AEQbTJ;
        return (iHashCode * 31) + (th == null ? 0 : th.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PnLUiState(pnlData=" + this.EZpvd + ", error=" + this.AEQbTJ + ")";
    }

    public C34479ncp(@NotNull PnLDetailsUiModel pnLDetailsUiModel, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(pnLDetailsUiModel, "");
        this.EZpvd = pnLDetailsUiModel;
        this.AEQbTJ = th;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C34479ncp(com.okinc.dexkline.market.features.position.ui.widget.PnLDetailsUiModel r19, java.lang.Throwable r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r18 = this;
            r0 = r21 & 1
            if (r0 == 0) goto L1d
            com.okinc.dexkline.market.features.position.ui.widget.PnLDetailsUiModel r0 = new com.okinc.dexkline.market.features.position.ui.widget.PnLDetailsUiModel
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 16383(0x3fff, float:2.2957E-41)
            r17 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L1f
        L1d:
            r0 = r19
        L1f:
            r1 = r21 & 2
            if (r1 == 0) goto L27
            r1 = 0
            r2 = r18
            goto L2b
        L27:
            r2 = r18
            r1 = r20
        L2b:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C34479ncp.<init>(com.okinc.dexkline.market.features.position.ui.widget.PnLDetailsUiModel, java.lang.Throwable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
